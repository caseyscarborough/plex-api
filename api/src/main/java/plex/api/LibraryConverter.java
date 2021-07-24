package plex.api;

final class LibraryConverter extends BaseConverter<LibraryResponse, LibraryDelegate> {

    @Override
    public LibraryDelegate convert(LibraryResponse input) {
        return LibraryDelegate.builder()
            .allowsSync(toBoolean(input.getAllowSync()))
            .art(input.getArt())
            .content(input.getContent())
            .identifier(input.getIdentifier())
            .mediaTagPrefix(input.getMediaTagPrefix())
            .mediaTagVersion(input.getMediaTagVersion())
            .title1(input.getTitle1())
            .title2(input.getTitle2())
            .build();
    }

    @Override
    public Class<LibraryResponse> from() {
        return LibraryResponse.class;
    }

    @Override
    public Class<LibraryDelegate> to() {
        return LibraryDelegate.class;
    }
}
