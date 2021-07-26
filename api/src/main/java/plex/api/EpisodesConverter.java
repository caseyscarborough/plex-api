package plex.api;

import java.util.stream.Collectors;

final class EpisodesConverter extends VideoConverter<EpisodesResponse, EpisodeDelegate[]> {
    @Override
    public EpisodeDelegate[] convert(EpisodesResponse input) {
        return input.getVideo()
            .stream()
            .map(v -> this.getEpisode(input, v))
            .toArray(EpisodeDelegate[]::new);
    }

    private EpisodeDelegate getEpisode(EpisodesResponse response, EpisodesResponse.Video video) {
        return EpisodeDelegate.builder()
            .librarySectionId(response.getLibrarySectionID())
            .librarySectionTitle(response.getLibrarySectionTitle())
            .librarySectionUUID(response.getLibrarySectionUUID())
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
            .medias(video.getMedia().stream().map(this::getMedia).collect(Collectors.toList()))
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
