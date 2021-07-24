package plex.api;

import lombok.experimental.Delegate;
import plex.api.exception.NotFoundException;

public class Settings extends BasePlexObject {

    @Delegate
    private final SettingsDelegate delegate;

    public Settings(PlexClient client, SettingsDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public Setting get(final String id) {
        return all()
            .stream()
            .filter(s -> s.id().equals(id))
            .findFirst()
            .orElseThrow(() -> new NotFoundException("Invalid setting id: " + id));
    }
}
