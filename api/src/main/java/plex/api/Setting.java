package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
public class Setting {
    private final String value;
    private final String id;
    private final String label;
    private final String summary;
    private final String type;
    private final String defaultValue;
    private final String valueAttribute;
    private final boolean hidden;
    private final boolean advanced;
    private final String group;
    private final String enumValues;
}
