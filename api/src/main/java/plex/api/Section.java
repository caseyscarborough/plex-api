package plex.api;

import lombok.experimental.Delegate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class Section extends BasePlexObject {

    @Delegate
    private final SectionDelegate delegate;

    public Section(PlexClient client, SectionDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public List<Video> all() {
        final String path = String.format(ObjectType.SECTIONS_ALL.getPath(), this.key());
        if (this.type().equals("movie")) {
            final List<MovieDelegate> delegates = Arrays.asList(this.getClient().get(path, MoviesResponse.class, MovieDelegate[].class));
            return delegates.stream().map(d -> new Movie(this.getClient(), d)).collect(Collectors.toList());
        } else if (this.type().equals("show")) {
            final List<ShowDelegate> delegates = Arrays.asList(this.getClient().get(path, ShowsResponse.class, ShowDelegate[].class));
            return delegates.stream().map(d -> new Show(this.getClient(), d)).collect(Collectors.toList());
        } else {
            throw new IllegalStateException("On deck has not been implemented for " + this.type() + " type");
        }
    }
}
