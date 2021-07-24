package plex.api.exception;

public class PlexException extends RuntimeException {

    public PlexException(String message) {
        super(message);
    }

    public PlexException(String message, Throwable cause) {
        super(message, cause);
    }
}
