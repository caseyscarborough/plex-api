package plex.api;

import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Library extends BasePlexObject {

    @Delegate
    private final LibraryDelegate delegate;
    private final Map<String, Section> sectionsById = new HashMap<>();

    Library(final LibraryDelegate delegate, final PlexClient client) {
        super(client);
        this.delegate = delegate;
    }

    @Override
    public ObjectType getType() {
        return ObjectType.LIBRARY;
    }

    public List<Section> sections() {
        final SectionDelegate[] delegates = getClient().get(ObjectType.SECTION, SectionResponse.class, SectionDelegate[].class);
        final List<Section> sections = new ArrayList<>();
        for (SectionDelegate delegate : delegates) {
            Section section = new Section(this.getClient(), delegate);
            this.sectionsById.put(section.uuid(), section);
            sections.add(section);
        }
        return sections;
    }

    public Section sectionById(final String id) {
        if (sectionsById.isEmpty() || !this.sectionsById.containsKey(id)) {
            this.sections();
        }
        return this.sectionsById.get(id);
    }
}
