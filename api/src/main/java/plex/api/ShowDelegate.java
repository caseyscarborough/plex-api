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
class ShowDelegate extends VideoDelegate {
    private final List<String> collections;
    private final List<String> roles;
    private final List<String> genres;
    private final String studio;
    private final String banner;
    private final String theme;
    private final Integer index;
    private final Integer leafCount;
    private final Integer viewedLeafCount;
    private final Integer childCount;
    private final String showOrdering;
    private final Integer flattenSeasons;
}
