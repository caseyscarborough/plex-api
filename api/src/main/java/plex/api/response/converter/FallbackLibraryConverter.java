package plex.api.response.converter;

import plex.api.model.Library;
import plex.api.response.SectionResponse;

final class FallbackLibraryConverter extends BaseConverter<SectionResponse, Library> {
    @Override
    public Library convert(SectionResponse input) {
        return Library.builder()
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
    public Class<Library> to() {
        return Library.class;
    }
}
