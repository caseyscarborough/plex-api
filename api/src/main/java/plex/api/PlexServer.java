package plex.api;

import lombok.experimental.Delegate;
import org.apache.commons.lang3.StringUtils;
import plex.api.exception.BadRequestException;

public final class PlexServer extends BasePlexObject {

    private static final String DEFAULT_SERVER = "http://localhost:32400";

    @Delegate
    private final PlexServerDelegate delegate;
    private Library library;
    private Settings settings;

    public PlexServer(String token) {
        this(DEFAULT_SERVER, token);
    }

    public PlexServer(String host, String token) {
        this(
            new PlexClient(
                StringUtils.stripEnd(host, "/"),
                token
            )
        );
    }

    PlexServer(final PlexClient client) {
        super(client);
        // Cached Library
        this.library = null;
        // Cached settings
        this.settings = null;
        // Cached server
        this.delegate = server();
    }

    public String host() {
        return getClient().getHost();
    }

    public Library library() {
        if (this.library != null) {
            return this.library;
        }

        LibraryDelegate delegate;
        try {
            delegate = getClient().get(Endpoint.LIBRARY.getPath(), LibraryResponse.class, LibraryDelegate.class);
        } catch (BadRequestException e) {
            // Fallback to /library/sections on bad request, only owners can call /library.
            delegate = getClient().get(Endpoint.SECTION.getPath(), SectionResponse.class, LibraryDelegate.class);
        }
        this.library = new Library(getClient(), delegate);
        return this.library;
    }

    public Settings settings() {
        if (this.settings != null) {
            return this.settings;
        }

        SettingsDelegate delegate = getClient().get(Endpoint.SETTINGS.getPath(), SettingsResponse.class, SettingsDelegate.class);
        this.settings = new Settings(getClient(), delegate);
        return this.settings;
    }

    private PlexServerDelegate server() {
        return getClient().get(Endpoint.SERVER.getPath(), ServerResponse.class, PlexServerDelegate.class);
    }
}
