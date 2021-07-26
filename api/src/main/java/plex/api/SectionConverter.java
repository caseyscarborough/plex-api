package plex.api;

import plex.api.SectionResponse.Directory.Location;

final class SectionConverter extends BaseConverter<SectionResponse, SectionDelegate[]> {
    @Override
    public SectionDelegate[] convert(SectionResponse input) {
        return input.getDirectory()
            .stream()
            .map(this::getSection)
            .toArray(SectionDelegate[]::new);
    }

    private SectionDelegate getSection(SectionResponse.Directory section) {
        return SectionDelegate.builder()
            .allowsSync(toBoolean(section.getAllowSync()))
            .agent(section.getAgent())
            .art(section.getArt())
            .composite(section.getComposite())
            .createdAt(toLocalDateTime(section.getCreatedAt()))
            .scannedAt(toLocalDateTime(section.getScannedAt()))
            .updatedAt(toLocalDateTime(section.getUpdatedAt()))
            .content(toBoolean(section.getContent()))
            .directory(toBoolean(section.getDirectory()))
            .filters(toBoolean(section.getFilters()))
            .hidden(toBoolean(section.getHidden()))
            .key(section.getKey())
            .language(section.getLanguage())
            .refreshing(toBoolean(section.getRefreshing()))
            .locations(toList(section.getLocation(), Location::getPath))
            .scanner(section.getScanner())
            .thumb(section.getThumb())
            .title(section.getTitle())
            .type(section.getType())
            .uuid(section.getUuid())
            .build();
    }

    @Override
    public Class<SectionResponse> from() {
        return SectionResponse.class;
    }

    @Override
    public Class<SectionDelegate[]> to() {
        return SectionDelegate[].class;
    }
}
