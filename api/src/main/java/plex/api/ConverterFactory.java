package plex.api;

import java.util.Arrays;
import java.util.List;

final class ConverterFactory {

    private final List<Converter<?, ?>> converters;

    public ConverterFactory() {
        this(
            new ServerConverter(),
            new LibraryConverter(),
            new LibraryFallbackConverter(),
            new SectionConverter(),
            new SettingsConverter(),
            new MoviesConverter(),
            new ShowsConverter(),
            new SeasonsConverter()
        );
    }

    ConverterFactory(Converter<?, ?>... converters) {
        this.converters = Arrays.asList(converters);
    }

    // Can't really avoid unchecked casts in this method. These casts won't cause any issues
    // though as we're checking manually and only returning appropriate instances.
    @SuppressWarnings("unchecked")
    public <F, T> Converter<F, T> getInstance(Class<F> from, Class<T> to) {
        return (Converter<F, T>) converters.stream()
            .filter(c -> c.from() == from && c.to() == to)
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("No converter found for " + from.getSimpleName() + " => " + to.getSimpleName()));
    }
}
