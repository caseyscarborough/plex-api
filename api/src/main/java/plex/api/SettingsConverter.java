package plex.api;

class SettingsConverter extends BaseConverter<SettingsResponse, SettingsDelegate> {
    @Override
    public SettingsDelegate convert(SettingsResponse input) {
        SettingsDelegate settings = SettingsDelegate.builder().build();
        for (SettingsResponse.Setting s : input.getSetting()) {
            Setting setting = Setting
                .builder()
                .id(s.getId())
                .value(s.getValueAttribute())
                .advanced(toBoolean(s.getAdvanced()))
                .enumValues(s.getEnumValues())
                .defaultValue(s.getDefaultValue())
                .hidden(toBoolean(s.getHidden()))
                .group(s.getGroup())
                .type(s.getType())
                .label(s.getLabel())
                .summary(s.getSummary())
                .build();
            settings.all().add(setting);
        }
        return settings;
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
