package plex.api;

import plex.api.MoviesResponse.Video.Collection;
import plex.api.MoviesResponse.Video.Country;
import plex.api.MoviesResponse.Video.Director;
import plex.api.MoviesResponse.Video.Genre;
import plex.api.MoviesResponse.Video.Role;
import plex.api.MoviesResponse.Video.Writer;

import java.util.stream.Collectors;

class MoviesConverter extends VideoConverter<MoviesResponse, MovieDelegate[]> {
    @Override
    public MovieDelegate[] convert(MoviesResponse input) {
        return input.getVideo()
            .stream()
            .map(v -> this.getMovie(input, v))
            .toArray(MovieDelegate[]::new);
    }

    private MovieDelegate getMovie(MoviesResponse response, MoviesResponse.Video video) {
        return MovieDelegate.builder()
            .librarySectionId(response.getLibrarySectionID())
            .librarySectionTitle(response.getLibrarySectionTitle())
            .librarySectionUUID(response.getLibrarySectionUUID())
            .genres(toList(video.getGenre(), Genre::getTag))
            .directors(toList(video.getDirector(), Director::getTag))
            .writers(toList(video.getWriter(), Writer::getTag))
            .countries(toList(video.getCountry(), Country::getTag))
            .roles(toList(video.getRole(), Role::getTag))
            .collections(toList(video.getCollection(), Collection::getTag))
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
            .tagline(video.getTagline())
            .thumb(video.getThumb())
            .art(video.getArt())
            .duration(video.getDuration())
            .originallyAvailableAt(toLocalDate(video.getOriginallyAvailableAt()))
            .addedAt(toLocalDateTime(video.getAddedAt()))
            .updatedAt(toLocalDateTime(video.getUpdatedAt()))
            .chapterSource(video.getChapterSource())
            .primaryExtraKey(video.getPrimaryExtraKey())
            .skipCount(video.getSkipCount())
            .titleSort(video.getTitleSort())
            .originalTitle(video.getOriginalTitle())
            .ratingImage(video.getRatingImage())
            .userRating(video.getUserRating())
            .audienceRating(video.getAudienceRating())
            .audienceRatingImage(video.getAudienceRatingImage())
            .viewOffset(video.getViewOffset())
            .medias(video.getMedia().stream().map(this::getMedia).collect(Collectors.toList()))
            .build();
    }

    @Override
    public Class<MoviesResponse> from() {
        return MoviesResponse.class;
    }

    @Override
    public Class<MovieDelegate[]> to() {
        return MovieDelegate[].class;
    }
}
