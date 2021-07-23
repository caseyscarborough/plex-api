package plex.api.response.converter;

import plex.api.model.LibrarySection;
import plex.api.response.LibrarySectionResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class LibrarySectionConverter extends BaseConverter<LibrarySectionResponse, LibrarySection[]> {
    @Override
    public LibrarySection[] convert(LibrarySectionResponse input) {
        List<LibrarySection> sections = new ArrayList<>();
        for (LibrarySectionResponse.Directory directory : input.getDirectory()) {
            LibrarySection section = LibrarySection.builder()
                .allowsSync(toBoolean(directory.getAllowSync()))
                .agent(directory.getAgent())
                .art(directory.getArt())
                .composite(directory.getComposite())
                .createdAt(toLocalDateTime(directory.getCreatedAt()))
                .scannedAt(toLocalDateTime(directory.getScannedAt()))
                .updatedAt(toLocalDateTime(directory.getUpdatedAt()))
                .content(toBoolean(directory.getContent()))
                .directory(toBoolean(directory.getDirectory()))
                .filters(toBoolean(directory.getFilters()))
                .hidden(toBoolean(directory.getHidden()))
                .key(directory.getKey())
                .language(directory.getLanguage())
                .refreshing(toBoolean(directory.getRefreshing()))
                .locations(toList(directory.getLocation().stream().map(LibrarySectionResponse.Directory.Location::getPath).collect(Collectors.joining(","))))
                .scanner(directory.getScanner())
                .thumb(directory.getThumb())
                .title(directory.getTitle())
                .type(directory.getType())
                .uuid(directory.getUuid())
                .build();
            sections.add(section);
        }
        LibrarySection[] output = new LibrarySection[sections.size()];
        return sections.toArray(output);
    }
}
