package plex.api;

import lombok.ToString;
import lombok.experimental.Delegate;

@ToString(includeFieldNames = false)
public class Movie extends Video {

    @Delegate
    private final MovieDelegate delegate;

    Movie(PlexClient client, MovieDelegate delegate) {
        super(client, delegate);
        this.delegate = delegate;
    }
}
