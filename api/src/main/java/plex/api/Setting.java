package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

@Getter
@Builder
@Accessors(fluent = true)
public class Setting {
    private final String id;
    private final String label;
    private final String summary;
    private final String type;
    private final String defaultValue;
    private final String value;
    private final boolean hidden;
    private final boolean advanced;
    private final String group;
    private final String enumValues;

    @Override
    public String toString() {
        return this.id() + "=" + this.value() + (StringUtils.isNotBlank(this.label) ? " (" + this.label() + ")" : "");
    }
}
