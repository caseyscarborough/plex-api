package plex.api;

import lombok.experimental.Delegate;
import plex.api.exception.InvalidTypeException;
import plex.api.exception.NotFoundException;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public abstract class Section extends BasePlexObject {

    @Delegate
    private final SectionDelegate delegate;

    Section(final PlexClient client, final SectionDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public List<Video> all() {
        return getVideos(String.format(Endpoint.SECTIONS_ALL.getPath(), this.key()));
    }

    public List<Video> find(Filter<Video> filter) {
        return all().stream().filter(filter::filter).collect(Collectors.toList());
    }

    public Movie movie(final String title) {
        if (!this.type().equals("movie")) {
            throw new InvalidTypeException(this.title() + " section does not contain movies");
        }

        return (Movie) get(title);
    }

    public Show show(String title) {
        if (!this.type().equals("show")) {
            throw new InvalidTypeException(this.title() + " section does not contain shows");
        }

        return (Show) get(title);
    }

    public Video get(final String title) {
        return getVideos(String.format(Endpoint.SECTIONS_GET.getPath(), this.key(), title))
            .stream()
            .filter(v -> v.title().toLowerCase(Locale.ROOT).equals(title.toLowerCase(Locale.ROOT)))
            .findFirst()
            .orElseThrow(() -> new NotFoundException("Invalid " + this.type() + " title: " + title));
    }

    public void scan() {
        scan(null);
    }

    public void scan(final String path) {
        String url = String.format("/library/sections/%s/refresh", this.key());
        if (path != null) {
            url += String.format("?path=%s", URLEncoder.encode(path, StandardCharsets.UTF_8));
        }
        this.getClient().get(url);
    }

    abstract List<Video> getVideos(final String path);

    @Override
    public String toString() {
        return delegate.toString();
    }
}
