package plex.api;

import lombok.experimental.Delegate;
import plex.api.exception.NotFoundException;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public final class Section extends BasePlexObject {

    @Delegate
    private final SectionDelegate delegate;

    Section(final PlexClient client, final SectionDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public List<Video> all() {
        return getVideos(String.format(Endpoint.SECTIONS_ALL.getPath(), this.key()))
            .orElseThrow(() -> new IllegalStateException("Retrieving all media has not been implemented for " + this.type() + " type"));
    }

    public Movie movie(final String title) {
        if (!this.type().equals("movie")) {
            throw new IllegalArgumentException(this.title() + " section does not contain movies");
        }

        return (Movie) get(title);
    }

    public Show show(String title) {
        if (!this.type().equals("show")) {
            throw new IllegalArgumentException(this.title() + " section does not contain shows");
        }

        return (Show) get(title);
    }

    public Video get(final String title) {
        return getVideos(String.format(Endpoint.SECTIONS_GET.getPath(), this.key(), title))
            .orElseThrow(() -> new IllegalStateException("Retrieving media item by title has not been implemented for " + this.type() + " type"))
            .stream()
            .filter(v -> v.title().toLowerCase(Locale.ROOT).equals(title.toLowerCase(Locale.ROOT)))
            .findFirst()
            .orElseThrow(() -> new NotFoundException("Invalid " + this.type() + " title: " + title));
    }

    private Optional<List<Video>> getVideos(final String path) {
        if (this.type().equals("movie")) {
            final List<MovieDelegate> delegates = Arrays.asList(this.getClient().get(path, MoviesResponse.class, MovieDelegate[].class));
            return Optional.of(delegates.stream().map(d -> new Movie(this.getClient(), d)).collect(Collectors.toList()));
        }

        if (this.type().equals("show")) {
            final List<ShowDelegate> delegates = Arrays.asList(this.getClient().get(path, ShowsResponse.class, ShowDelegate[].class));
            return Optional.of(delegates.stream().map(d -> new Show(this.getClient(), d)).collect(Collectors.toList()));
        }

        return Optional.empty();
    }
}
