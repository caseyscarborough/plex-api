package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Builder
@Accessors(fluent = true)
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
    private final Integer librarySectionId;
    private final String librarySectionTitle;
    private final String librarySectionUUID;

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

    @Override
    public String toString() {
        return this.parentTitle() + " (" + this.parentYear() + ") - " + this.title();
    }
}
