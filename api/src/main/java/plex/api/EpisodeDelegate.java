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
class EpisodeDelegate extends VideoDelegate {

    private final List<Media> media;
    private final Integer index;
    private final String titleSort;

    // Parent (Season) Fields
    private final Integer parentRatingKey;
    private final String parentKey;
    private final String parentGuid;
    private final String parentTitle;
    private final Integer parentIndex;

    // Grandparent (Show) fields
    private final Integer grandparentRatingKey;
    private final String grandparentGuid;
    private final String grandparentKey;
    private final String grandparentTitle;
    private final String grandparentThumb;
    private final String grandparentArt;
}
