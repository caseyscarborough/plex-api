package plex.api;

import lombok.experimental.Delegate;
import plex.api.exception.NotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class Library extends BasePlexObject {

    @Delegate
    private final LibraryDelegate delegate;
    private final Map<String, Section> sectionsById = new HashMap<>();

    public Library(PlexClient client, LibraryDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public List<Section> sections() {
        final SectionDelegate[] delegates = getClient().get(ObjectType.SECTION.getPath(), SectionResponse.class, SectionDelegate[].class);
        final List<Section> sections = new ArrayList<>();
        for (SectionDelegate delegate : delegates) {
            Section section = new Section(this.getClient(), delegate);
            this.sectionsById.put(section.uuid(), section);
            sections.add(section);
        }
        return sections;
    }

    public Section section(final String title) {
        for (Section section : this.sections()) {
            if (section.title().toLowerCase(Locale.ROOT).equals(title.toLowerCase(Locale.ROOT))) {
                return section;
            }
        }
        throw new NotFoundException("Invalid library section: " + title);
    }

    public Section sectionById(final String id) {
        if (sectionsById.isEmpty() || !this.sectionsById.containsKey(id)) {
            this.sections();
        }
        return this.sectionsById.get(id);
    }
}
