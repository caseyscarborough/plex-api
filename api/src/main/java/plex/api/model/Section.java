package plex.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import plex.api.ObjectType;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
public final class Section implements PlexObject {

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
    public ObjectType getType() {
        return ObjectType.SECTION;
    }
}
