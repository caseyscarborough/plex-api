package plex.api;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

abstract class EditablePlexObject extends BasePlexObject {
    EditablePlexObject(PlexClient client) {
        super(client);
    }

    public void edit(String... strings) {
        if (strings.length % 2 != 0) {
            throw new IllegalArgumentException("The number of string parameters must be a factor of 2");
        }
        Map<String, String> params = new HashMap<>();
        for (int i = 0; i < strings.length;) {
            params.put(strings[i++], strings[i++]);
        }
        edit(params);
    }

    public void edit(Map<String, String> params) {
        if (!params.containsKey("id")) {
            params.put("id", String.valueOf(ratingKey()));
        }

        if (!params.containsKey("type")) {
            params.put("type", String.valueOf(SearchType.findByKey(type()).getCode()));
        }

        final String url = String.format("/library/sections/%d/all?%s", librarySectionId(), urlencode(params));
        this.getClient().put(url);
    }

    private String urlencode(Map<String, String> params) {
        return params.entrySet()
            .stream()
            .map((e) -> e.getKey() + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
            .collect(Collectors.joining("&"));
    }

    abstract Integer ratingKey();

    abstract String type();

    abstract Integer librarySectionId();
}
