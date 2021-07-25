package plex.api;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SuperBuilder
@Accessors(fluent = true)
@Getter
@ToString
class VideoDelegate {

    private final Integer ratingKey;
    private final String key;
    private final String guid;
    private final String type;
    private final String title;
    private final String contentRating;
    private final String summary;
    private final Float rating;
    private final Integer viewCount;
    private final LocalDateTime lastViewedAt;
    private final Integer year;
    private final String thumb;
    private final String art;
    private final Integer duration;
    private final LocalDate originallyAvailableAt;
    private final LocalDateTime addedAt;
    private final LocalDateTime updatedAt;
    private final String primaryExtraKey;
    private final String titleSort;
    private final Integer skipCount;
    private final Float userRating;
}
