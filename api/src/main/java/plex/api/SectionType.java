package plex.api;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum SectionType {
    MOVIE("movie"),
    SHOW("show"),
    PHOTO("photo");

    private final String key;

    SectionType(String key) {
        this.key = key;
    }

    public static SectionType findByKey(final String key) {
        return Arrays.stream(values())
            .filter(v -> v.key.equals(key))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("No section type with key '" + key + "'"));
    }
}
