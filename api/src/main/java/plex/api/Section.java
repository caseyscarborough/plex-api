package plex.api;

import lombok.experimental.Delegate;

import java.util.Arrays;
import java.util.List;

public final class Section extends BasePlexObject {

    @Delegate
    private final SectionDelegate delegate;

    public Section(PlexClient client, SectionDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public List<Movie> onDeck() {
        final String path = String.format(ObjectType.ON_DECK.getPath(), this.key());
        if (this.type().equals("movie")) {
            return Arrays.asList(getClient().get(path, MoviesResponse.class, Movie[].class));
        } else {
            throw new IllegalStateException("On deck has not been implemented for " + this.type() + " type");
        }
    }
}
