package plex.api;

import lombok.experimental.Delegate;

public final class Section extends BasePlexObject {

    @Delegate
    private final SectionDelegate delegate;

    public Section(PlexClient client, SectionDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    @Override
    public ObjectType getType() {
        return ObjectType.SECTION;
    }
}
