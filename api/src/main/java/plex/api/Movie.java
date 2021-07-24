package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
public class Movie {

    private final List<Media> medias;
    private final List<String> genres;
    private final List<String> directors;
    private final List<String> writers;
    private final List<String> countries;
    private final List<String> collections;
    private final List<String> roles;
    private final Integer ratingKey;
    private final String key;
    private final String guid;
    private final String studio;
    private final String type;
    private final String title;
    private final String contentRating;
    private final String summary;
    private final Float rating;
    private final Integer viewCount;
    private final LocalDateTime lastViewedAt;
    private final Integer year;
    private final String tagline;
    private final String thumb;
    private final String art;
    private final Integer duration;
    private final LocalDate originallyAvailableAt;
    private final LocalDateTime addedAt;
    private final LocalDateTime updatedAt;
    private final String chapterSource;
    private final String primaryExtraKey;
    private final Integer skipCount;
    private final String titleSort;
    private final String originalTitle;
    private final String ratingImage;
    private final Float userRating;
    private final Float audienceRating;
    private final String audienceRatingImage;
    private final Integer viewOffset;
}
