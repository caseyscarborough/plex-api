package plex.api;

final class EpisodesConverter extends BaseConverter<EpisodesResponse, EpisodeDelegate[]> {
    @Override
    public EpisodeDelegate[] convert(EpisodesResponse input) {
        return input.getVideo()
            .stream()
            .map(this::getEpisode)
            .toArray(EpisodeDelegate[]::new);
    }

    private EpisodeDelegate getEpisode(EpisodesResponse.Video video) {
        return EpisodeDelegate.builder()
            .ratingKey(video.getRatingKey())
            .key(video.getKey())
            .guid(video.getGuid())
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
            .titleSort(video.getTitleSort())
            .index(video.getIndex())
            .grandparentArt(video.getGrandparentArt())
            .grandparentGuid(video.getGrandparentGuid())
            .grandparentKey(video.getGrandparentKey())
            .grandparentThumb(video.getGrandparentThumb())
            .grandparentTitle(video.getGrandparentTitle())
            .grandparentRatingKey(video.getGrandparentRatingKey())
            .parentGuid(video.getParentGuid())
            .parentIndex(video.getParentIndex())
            .parentKey(video.getParentKey())
            .parentTitle(video.getParentTitle())
            .parentRatingKey(video.getParentRatingKey())
            .build();
    }

    @Override
    public Class<EpisodesResponse> from() {
        return EpisodesResponse.class;
    }

    @Override
    public Class<EpisodeDelegate[]> to() {
        return EpisodeDelegate[].class;
    }
}
