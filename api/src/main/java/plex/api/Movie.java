package plex.api;

import lombok.experimental.Delegate;

public class Movie extends Video {

    @Delegate
    private final MovieDelegate delegate;

    Movie(PlexClient client, MovieDelegate delegate) {
        super(client, delegate);
        this.delegate = delegate;
    }
}
