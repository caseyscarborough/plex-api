package plex.api;

import plex.api.exception.InvalidTypeException;

class SectionFactory {

    private final PlexClient client;

    SectionFactory(PlexClient client) {
        this.client = client;
    }

    public Section getInstance(SectionDelegate delegate) {
        if (delegate.type().equals("movie")) {
            return new MovieSection(this.client, delegate);
        } else if (delegate.type().equals("show")) {
            return new ShowSection(this.client, delegate);
        }

        throw new InvalidTypeException(delegate.type() + " section is not yet supported");
    }
}
