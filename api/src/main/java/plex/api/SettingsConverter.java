package plex.api;

import java.util.stream.Collectors;

class SettingsConverter extends BaseConverter<SettingsResponse, SettingsDelegate> {
    @Override
    public SettingsDelegate convert(SettingsResponse input) {
        return SettingsDelegate.builder()
            .all(input.getSetting().stream().map(this::getSetting).collect(Collectors.toList()))
            .build();
    }

    private Setting getSetting(SettingsResponse.Setting setting) {
        return Setting
            .builder()
            .id(setting.getId())
            .value(setting.getValueAttribute())
            .advanced(toBoolean(setting.getAdvanced()))
            .enumValues(setting.getEnumValues())
            .defaultValue(setting.getDefaultValue())
            .hidden(toBoolean(setting.getHidden()))
            .group(setting.getGroup())
            .type(setting.getType())
            .label(setting.getLabel())
            .summary(setting.getSummary())
            .build();
    }

    @Override
    public Class<SettingsResponse> from() {
        return SettingsResponse.class;
    }

    @Override
    public Class<SettingsDelegate> to() {
        return SettingsDelegate.class;
    }
}
