package plex.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import plex.api.ObjectType;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
public final class Library implements PlexObject {
    private final boolean allowsSync;
    private final String art;
    private final String content;
    private final String identifier;
    private final String mediaTagPrefix;
    private final String mediaTagVersion;
    private final String title1;
    private final String title2;

    @Override
    public ObjectType getType() {
        return ObjectType.LIBRARY;
    }
}
