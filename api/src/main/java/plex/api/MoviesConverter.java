package plex.api;

import plex.api.MoviesResponse.Video.Collection;
import plex.api.MoviesResponse.Video.Country;
import plex.api.MoviesResponse.Video.Director;
import plex.api.MoviesResponse.Video.Genre;
import plex.api.MoviesResponse.Video.Role;
import plex.api.MoviesResponse.Video.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class MoviesConverter extends BaseConverter<MoviesResponse, Movie[]> {
    @Override
    public Movie[] convert(MoviesResponse input) {
        List<Movie> output = new ArrayList<>();
        for (MoviesResponse.Video video : input.getVideo()) {
            List<Media> medias = new ArrayList<>();
            for (MoviesResponse.Video.Media m : video.getMedia()) {
                List<MediaPart> parts = new ArrayList<>();
                for (MoviesResponse.Video.Media.Part part : m.getPart()) {
                    parts.add(getPart(part));
                }
                medias.add(getMedia(m, parts));
            }
            output.add(getMovie(video, medias));
        }
        return output.toArray(new Movie[0]);
    }

    private Movie getMovie(MoviesResponse.Video video, List<Media> medias) {
        return Movie.builder()
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
            .medias(medias)
            .build();
    }

    private Media getMedia(MoviesResponse.Video.Media media, List<MediaPart> parts) {
        return Media.builder()
            .aspectRatio(media.getAspectRatio())
            .audioChannels(media.getAudioChannels())
            .audioCodec(media.getAudioCodec())
            .audioProfile(media.getAudioProfile())
            .bitrate(media.getBitrate())
            .container(media.getContainer())
            .duration(media.getDuration())
            .has64BitOffsets(toBoolean(media.getHas64BitOffsets()))
            .height(media.getHeight())
            .id(media.getId())
            .optimizedForStreaming(toBoolean(media.getOptimizedForStreaming()))
            .parts(parts)
            .videoCodec(media.getVideoCodec())
            .videoFrameRate(media.getVideoFrameRate())
            .videoProfile(media.getVideoProfile())
            .videoResolution(media.getVideoResolution())
            .width(media.getWidth())
            .build();
    }

    private MediaPart getPart(MoviesResponse.Video.Media.Part part) {
        return MediaPart.builder()
            .audioProfile(part.getAudioProfile())
            .container(part.getContainer())
            .duration(part.getDuration())
            .file(part.getFile())
            .has64BitOffsets(toBoolean(part.getHas64BitOffsets()))
            .hasThumbnail(toBoolean(part.getHasThumbnail()))
            .optimizedForStreaming(toBoolean(part.getOptimizedForStreaming()))
            .id(part.getId())
            .indexes(part.getIndexes())
            .key(part.getKey())
            .size(part.getSize())
            .videoProfile(part.getVideoProfile())
            .build();
    }

    private <T> List<String> toList(List<T> items, Function<T, String> function) {
        return items != null ? items.stream().map(function).collect(Collectors.toList()) : new ArrayList<>();
    }

    @Override
    public Class<MoviesResponse> from() {
        return MoviesResponse.class;
    }

    @Override
    public Class<Movie[]> to() {
        return Movie[].class;
    }
}
