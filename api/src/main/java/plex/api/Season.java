package plex.api;

import lombok.ToString;
import lombok.experimental.Delegate;

@ToString
public class Season extends BasePlexObject {

    @Delegate
    private final SeasonDelegate delegate;

    Season(PlexClient client, SeasonDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }
}
