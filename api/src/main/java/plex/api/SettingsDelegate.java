package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
class SettingsDelegate {

    private final List<Setting> all = new ArrayList<>();
}
