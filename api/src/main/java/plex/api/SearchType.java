package plex.api;

import lombok.Getter;

import java.util.Arrays;

@Getter
enum SearchType {

    MOVIE("movie", 1),
    SHOW("show", 2),
    SEASON("season", 3),
    EPISODE("episode", 4),
    TRAILER("trailer", 5),
    COMIC("comic", 6),
    PERSON("person", 7),
    ARTIST("artist", 8),
    ALBUM("album", 9),
    TRACK("track", 10),
    PICTURE("picture", 11),
    CLIP("clip", 12),
    PHOTO("photo", 13),
    PHOTO_ALBUM("photoalbum", 14),
    PLAYLIST("playlist", 15),
    PLAYLIST_FOLDER("playlistFolder", 16),
    COLLECTION("collection", 18),
    OPTIMIZED_VERSION("optimizedVersion", 42),
    USER_PLAYLIST_ITEM("userPlaylistItem", 1001);

    private final String key;
    private final int code;

    SearchType(String key, int code) {
        this.key = key;
        this.code = code;
    }

    public static SearchType findByKey(final String key) {
        return Arrays.stream(values())
            .filter(v -> v.key.equals(key))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Could not find search type with key '" + key + "'"));
    }
}
