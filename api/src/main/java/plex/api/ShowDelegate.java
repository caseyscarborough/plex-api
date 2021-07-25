package plex.api;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@Accessors(fluent = true)
@ToString(callSuper = true)
class ShowDelegate extends VideoDelegate {
    private final String banner;
    private final String theme;
    private final Integer index;
    private final Integer leafCount;
    private final Integer viewedLeafCount;
    private final Integer childCount;
    private final String showOrdering;
    private final Integer flattenSeasons;
}
