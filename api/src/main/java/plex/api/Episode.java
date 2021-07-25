package plex.api;

import lombok.experimental.Delegate;

public class Episode extends Video {
    @Delegate
    private final EpisodeDelegate delegate;

    Episode(PlexClient client, EpisodeDelegate delegate) {
        super(client, delegate);
        this.delegate = delegate;
    }
}
