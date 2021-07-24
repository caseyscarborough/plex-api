package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
final class LibraryDelegate {
    private final boolean allowsSync;
    private final String art;
    private final String content;
    private final String identifier;
    private final String mediaTagPrefix;
    private final String mediaTagVersion;
    private final String title1;
    private final String title2;
}
