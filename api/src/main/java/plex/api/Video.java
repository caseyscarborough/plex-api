package plex.api;

import lombok.experimental.Delegate;
import plex.api.exception.InvalidTypeException;

public class Video extends BasePlexObject {

    @Delegate
    private final VideoDelegate delegate;

    Video(PlexClient client, VideoDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public boolean isShow() {
        return this.type().equals("show");
    }

    public boolean isMovie() {
        return this.type().equals("movie");
    }

    public Show show() {
        if (!this.type().equals("show")) {
            throw new InvalidTypeException("Not a show: " + this.title());
        }
        return (Show) this;
    }

    public Movie movie() {
        if (!this.type().equals("movie")) {
            throw new InvalidTypeException("Not a movie: " + this.title());
        }
        return (Movie) this;
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}
