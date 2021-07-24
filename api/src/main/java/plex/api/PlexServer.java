package plex.api;

import lombok.experimental.Delegate;
import org.apache.commons.lang3.StringUtils;
import plex.api.exception.BadRequestException;

public final class PlexServer extends BasePlexObject {

    private static final String DEFAULT_SERVER = "http://localhost:32400";

    @Delegate
    private PlexServerDelegate delegate;
    private Library library;

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
        // Cached server
        this.delegate = server();
    }

    public Library library() {
        if (this.library != null) {
            return this.library;
        }

        LibraryDelegate delegate;
        try {
            delegate = getClient().get(ObjectType.LIBRARY, LibraryResponse.class, LibraryDelegate.class);
        } catch (BadRequestException e) {
            // Fallback to /library/sections on bad request, only owners can call /library.
            delegate = getClient().get(ObjectType.SECTION, SectionResponse.class, LibraryDelegate.class);
        }
        this.library = new Library(getClient(), delegate);
        return this.library;
    }

    private PlexServerDelegate server() {
        return getClient().get(ObjectType.SERVER, ServerResponse.class, PlexServerDelegate.class);
    }
}
