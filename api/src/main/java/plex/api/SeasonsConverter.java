package plex.api;

class SeasonsConverter extends BaseConverter<SeasonsResponse, SeasonDelegate[]> {
    @Override
    public SeasonDelegate[] convert(SeasonsResponse input) {
        return input.getDirectory()
            .stream()
            .map(this::getSeason)
            .toArray(SeasonDelegate[]::new);
    }

    private SeasonDelegate getSeason(SeasonsResponse.Directory season) {
        return SeasonDelegate.builder()
            .addedAt(toLocalDateTime(season.getAddedAt()))
            .art(season.getArt())
            .key(season.getKey())
            .guid(season.getGuid())
            .lastViewedAt(toLocalDateTime(season.getLastViewedAt()))
            .index(season.getIndex())
            .leafCount(season.getLeafCount())
            .viewCount(season.getViewCount())
            .viewedLeafCount(season.getViewedLeafCount())
            .ratingKey(season.getRatingKey())
            .summary(season.getSummary())
            .thumb(season.getThumb())
            .title(season.getTitle())
            .type(season.getType())
            .updatedAt(toLocalDateTime(season.getUpdatedAt()))
            .parentGuid(season.getParentGuid())
            .parentIndex(season.getParentIndex())
            .parentKey(season.getParentKey())
            .parentRatingKey(season.getParentRatingKey())
            .parentStudio(season.getParentStudio())
            .parentTheme(season.getParentTheme())
            .parentThumb(season.getParentThumb())
            .parentYear(season.getParentYear())
            .parentTitle(season.getParentTitle())
            .build();
    }

    @Override
    public Class<SeasonsResponse> from() {
        return SeasonsResponse.class;
    }

    @Override
    public Class<SeasonDelegate[]> to() {
        return SeasonDelegate[].class;
    }
}
