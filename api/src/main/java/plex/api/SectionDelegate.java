package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@Accessors(fluent = true)
class SectionDelegate {
    private final boolean allowsSync;
    private final String art;
    private final String composite;
    private final boolean filters;
    private final boolean refreshing;
    private final String thumb;
    private final Integer key;
    private final String type;
    private final String title;
    private final String agent;
    private final String scanner;
    private final String language;
    private final String uuid;
    private final LocalDateTime updatedAt;
    private final LocalDateTime createdAt;
    private final LocalDateTime scannedAt;
    private final boolean content;
    private final boolean directory;
    private final boolean hidden;
    private final List<String> locations;

    @Override
    public String toString() {
        return this.title();
    }
}
