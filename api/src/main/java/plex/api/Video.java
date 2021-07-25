package plex.api;

import lombok.experimental.Delegate;

public class Video extends BasePlexObject {

    @Delegate
    private final VideoDelegate delegate;

    Video(PlexClient client, VideoDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }
}
