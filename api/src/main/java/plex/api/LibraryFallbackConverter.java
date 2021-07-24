package plex.api;

final class LibraryFallbackConverter extends BaseConverter<SectionResponse, LibraryDelegate> {

    @Override
    public LibraryDelegate convert(SectionResponse input) {
        return LibraryDelegate.builder()
            .allowsSync(toBoolean(input.getAllowSync()))
            .identifier(input.getIdentifier())
            .mediaTagPrefix(input.getMediaTagPrefix())
            .mediaTagVersion(input.getMediaTagVersion())
            .title1(input.getTitle1())
            .build();
    }

    @Override
    public Class<SectionResponse> from() {
        return SectionResponse.class;
    }

    @Override
    public Class<LibraryDelegate> to() {
        return LibraryDelegate.class;
    }
}
