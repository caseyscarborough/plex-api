package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
class SeasonDelegate {

    private final Integer ratingKey;
    private final String key;
    private final String guid;
    private final String type;
    private final String title;
    private final String summary;
    private final String thumb;
    private final String art;
    private final Integer index;
    private final Integer viewCount;
    private final Integer leafCount;
    private final Integer viewedLeafCount;
    private final LocalDateTime lastViewedAt;
    private final LocalDateTime addedAt;
    private final LocalDateTime updatedAt;

    // Parent (Show) Fields
    private final Integer parentRatingKey;
    private final String parentGuid;
    private final String parentStudio;
    private final String parentKey;
    private final String parentTitle;
    private final Integer parentYear;
    private final Integer parentIndex;
    private final String parentThumb;
    private final String parentTheme;
}
