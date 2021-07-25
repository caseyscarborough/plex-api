package plex.api;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
@Accessors(fluent = true)
@ToString(callSuper = true)
class MovieDelegate extends VideoDelegate {
    private final String originalTitle;
    private final String tagline;
    private final Integer viewOffset;
    private final String ratingImage;
    private final Float audienceRating;
    private final String audienceRatingImage;
    private final List<Media> medias;
    private final List<String> directors;
    private final List<String> writers;
    private final List<String> countries;
    private final String chapterSource;
}
