package plex.api.response.converter;

import plex.api.model.Section;
import plex.api.response.SectionResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class SectionConverter extends BaseConverter<SectionResponse, Section[]> {
    @Override
    public Section[] convert(SectionResponse input) {
        List<Section> sections = new ArrayList<>();
        for (SectionResponse.Directory directory : input.getDirectory()) {
            Section section = Section.builder()
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
                .locations(toList(directory.getLocation().stream().map(SectionResponse.Directory.Location::getPath).collect(Collectors.joining(","))))
                .scanner(directory.getScanner())
                .thumb(directory.getThumb())
                .title(directory.getTitle())
                .type(directory.getType())
                .uuid(directory.getUuid())
                .build();
            sections.add(section);
        }
        // Using 0 for the array size can actually be faster than
        // using the correct size of the array apparently.
        // See https://stackoverflow.com/a/9572820/2446208
        return sections.toArray(new Section[0]);
    }

    @Override
    public Class<SectionResponse> from() {
        return SectionResponse.class;
    }

    @Override
    public Class<Section[]> to() {
        return Section[].class;
    }
}
