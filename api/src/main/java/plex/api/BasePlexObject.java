package plex.api;

import lombok.experimental.Delegate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;

abstract class BasePlexObject implements PlexObject {

    private final PlexClient client;

    BasePlexObject(PlexClient client) {
        this.client = client;
    }

    PlexClient getClient() {
        if (this.client == null) {
            throw new NullPointerException("Client is not present in plex object. This should not happen.");
        }
        return this.client;
    }
}
