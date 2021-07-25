package plex.api;

final class ShowsConverter extends BaseConverter<ShowsResponse, ShowDelegate[]> {
    @Override
    public ShowDelegate[] convert(ShowsResponse input) {
        return input.getDirectory()
            .stream()
            .map(this::getShow)
            .toArray(ShowDelegate[]::new);
    }

    private ShowDelegate getShow(ShowsResponse.Directory video) {
        return ShowDelegate.builder()
            .genres(toList(video.getGenre(), ShowsResponse.Directory.Genre::getTag))
            .roles(toList(video.getRole(), ShowsResponse.Directory.Role::getTag))
            .collections(toList(video.getCollection(), ShowsResponse.Directory.Collection::getTag))
            .ratingKey(video.getRatingKey())
            .key(video.getKey())
            .guid(video.getGuid())
            .studio(video.getStudio())
            .type(video.getType())
            .title(video.getTitle())
            .contentRating(video.getContentRating())
            .summary(video.getSummary())
            .rating(video.getRating())
            .viewCount(video.getViewCount())
            .lastViewedAt(toLocalDateTime(video.getLastViewedAt()))
            .year(video.getYear())
            .thumb(video.getThumb())
            .art(video.getArt())
            .duration(video.getDuration())
            .originallyAvailableAt(toLocalDate(video.getOriginallyAvailableAt()))
            .addedAt(toLocalDateTime(video.getAddedAt()))
            .updatedAt(toLocalDateTime(video.getUpdatedAt()))
            .primaryExtraKey(video.getPrimaryExtraKey())
            .skipCount(video.getSkipCount())
            .titleSort(video.getTitleSort())
            .userRating(video.getUserRating())
            .banner(video.getBanner())
            .theme(video.getTheme())
            .index(video.getIndex())
            .leafCount(video.getLeafCount())
            .viewedLeafCount(video.getViewedLeafCount())
            .childCount(video.getChildCount())
            .showOrdering(video.getShowOrdering())
            .flattenSeasons(video.getFlattenSeasons())
            .build();
    }

    @Override
    public Class<ShowsResponse> from() {
        return ShowsResponse.class;
    }

    @Override
    public Class<ShowDelegate[]> to() {
        return ShowDelegate[].class;
    }
}
