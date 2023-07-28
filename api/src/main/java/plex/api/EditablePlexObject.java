package plex.api;

import plex.api.exception.PlexException;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        for (int i = 0; i < strings.length; i += 2) {
            params.put(strings[i], strings[i + 1]);
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

        final String url = String.format("/library/sections/%d/all?%s", librarySectionId(), urlencode(params)).replace("+", "%20");
        this.getClient().put(url);
    }

    public byte[] poster(Map<String, String> params) {
        params.putIfAbsent("width", "720");
        params.putIfAbsent("height", "1080");
        params.put("url", thumb());
        return this.getClient().get("/photo/:/transcode?" + urlencode(params), byte[].class, byte[].class);
    }

    public byte[] poster() {
        Map<String, String> params = new HashMap<>();
        params.put("minSize", "1");
        params.put("upscale", "1");
        return poster(params);
    }

    public void uploadPosterFromUrl(final String url) {
        final String key = String.format("/library/metadata/%s/posters?url=%s", this.ratingKey(), URLEncoder.encode(url, StandardCharsets.UTF_8));
        this.getClient().post(key);
    }

    public void uploadPosterFromFile(final String filePath) {
        final String key = String.format("/library/metadata/%s/posters?", this.ratingKey());
        try {
            final byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            this.getClient().post(key, bytes);
        } catch (IOException e) {
            throw new PlexException("Could not read file from " + filePath);
        }
    }

    private String urlencode(Map<String, String> params) {
        return params.entrySet()
            .stream()
            .map(e -> URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8) + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
            .collect(Collectors.joining("&"));
    }

    abstract Integer ratingKey();

    abstract String type();

    abstract Integer librarySectionId();

    abstract String thumb();
}
