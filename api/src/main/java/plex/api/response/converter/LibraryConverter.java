package plex.api.response.converter;

import plex.api.model.Library;
import plex.api.response.LibraryResponse;

final class LibraryConverter extends BaseConverter<LibraryResponse, Library> {
    @Override
    public Library convert(LibraryResponse input) {
        return Library.builder()
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
}
