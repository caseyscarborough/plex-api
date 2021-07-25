package plex.api;

import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Getter
@SuperBuilder
@Accessors(fluent = true)
class EpisodeDelegate extends VideoDelegate {

    private final List<Media> medias;
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

    public String seasonAndEpisode() {
        return "S" + StringUtils.leftPad(String.valueOf(parentIndex), 2, "0") + "E" + StringUtils.leftPad(String.valueOf(index), index >= 100 ? 3 : 2, "0");
    }

    @Override
    public String toString() {
        return this.grandparentTitle() + " - " + this.seasonAndEpisode() + " - " + this.title();
    }
}
