package plex.api;

import lombok.ToString;
import lombok.experimental.Delegate;

@ToString
public class Show extends Video {

    @Delegate
    private final ShowDelegate delegate;

    Show(PlexClient client, ShowDelegate delegate) {
        super(client, delegate);
        this.delegate = delegate;
    }
}
