package plex.api;

import lombok.experimental.Delegate;
import plex.api.exception.NotFoundException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public final class Library extends BasePlexObject {

    @Delegate
    private final LibraryDelegate delegate;
    private final Map<String, Section> sectionsById = new HashMap<>();

    Library(PlexClient client, LibraryDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public List<Section> sections() {
        final SectionDelegate[] delegates = this.getClient()
            .get(Endpoint.SECTIONS.getPath(), SectionResponse.class, SectionDelegate[].class);
        final List<Section> sections = Arrays.stream(delegates)
            .map(d -> new Section(this.getClient(), d))
            .collect(Collectors.toList());
        sections.forEach(s -> this.sectionsById.put(s.uuid(), s));
        return sections;
    }

    public Section section(final String title) {
        return this.sections().stream()
            .filter(s -> s.title().toLowerCase(Locale.ROOT).equals(title.toLowerCase(Locale.ROOT)))
            .findFirst()
            .orElseThrow(() -> new NotFoundException("Invalid library section: " + title));
    }

    public Section sectionById(final String id) {
        if (sectionsById.isEmpty() || !this.sectionsById.containsKey(id)) {
            this.sections();
        }
        return this.sectionsById.get(id);
    }
}
