package plex.api.response.converter;

import plex.api.model.Library;
import plex.api.model.LibrarySection;
import plex.api.model.Server;
import plex.api.response.LibraryResponse;
import plex.api.response.LibrarySectionResponse;
import plex.api.response.ServerResponse;

public final class ConverterFactory {

    // Can't really avoid unchecked casts in this method. These casts won't cause any issues
    // though as we're checking manually and only returning appropriate instances.
    @SuppressWarnings("unchecked")
    public <F, T> Converter<F, T> getInstance(Class<F> from, Class<T> to) {
        if (from == ServerResponse.class && to == Server.class) {
            return (Converter<F, T>) new ServerConverter();
        } else if (from == LibraryResponse.class && to == Library.class) {
            return (Converter<F, T>) new LibraryConverter();
        } else if (from == LibrarySectionResponse.class && to == LibrarySection[].class) {
            return (Converter<F, T>) new LibrarySectionConverter();
        }
        throw new IllegalStateException("No converter found for " + from.getSimpleName() + " => " + to.getSimpleName());
    }
}
