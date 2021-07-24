package plex.api.response.converter;

import java.util.Arrays;
import java.util.List;

public final class ConverterFactory {

    private static final List<Converter<?, ?>> factories = Arrays.asList(
        new ServerConverter(),
        new LibraryConverter(),
        new FallbackLibraryConverter(),
        new SectionConverter()
    );

    // Can't really avoid unchecked casts in this method. These casts won't cause any issues
    // though as we're checking manually and only returning appropriate instances.
    @SuppressWarnings("unchecked")
    public <F, T> Converter<F, T> getInstance(Class<F> from, Class<T> to) {
        for (Converter<?, ?> factory : factories) {
            if (factory.from() == from && factory.to() == to) {
                return (Converter<F, T>) factory;
            }
        }
        throw new IllegalStateException("No converter found for " + from.getSimpleName() + " => " + to.getSimpleName());
    }
}
