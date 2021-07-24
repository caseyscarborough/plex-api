package plex.api;

import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.experimental.Delegate;
import plex.api.exception.BadRequestException;

public final class PlexServer {

    private static final String DEFAULT_SERVER = "http://localhost:32400";

    @Getter
    @Accessors(fluent = true)
    private final String host;
    private final PlexClient client;

    @Delegate
    private PlexServerDelegate delegate;
    private Library library;

    public PlexServer(String token) {
        this(DEFAULT_SERVER, token);
    }

    public PlexServer(String host, String token) {
        this.host = host.endsWith("/") ? host.substring(0, host.length() - 1) : host;
        // Cached Library
        this.library = null;
        // Cached server
        this.delegate = null;
        this.client = new PlexClient(host, token);
        this.delegate = server();
    }

    public Library library() {
        if (this.library != null) {
            return this.library;
        }

        LibraryDelegate delegate;
        try {
            delegate = client.get(ObjectType.LIBRARY, LibraryResponse.class, LibraryDelegate.class);
        } catch (BadRequestException e) {
            // Fallback to /library/sections on bad request, only owners can call /library.
            delegate = client.get(ObjectType.SECTION, SectionResponse.class, LibraryDelegate.class);
        }
        return new Library(delegate, this.client);
    }

    private PlexServerDelegate server() {
        return client.get(ObjectType.SERVER, ServerResponse.class, PlexServerDelegate.class);
    }
}
