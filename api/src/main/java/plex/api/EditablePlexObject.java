package plex.api;

import plex.api.exception.PlexException;
import plex.api.utils.URLEncode;

import java.io.IOException;
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

    public void uploadArtFromUrl(final String url) {
        uploadImageFromUrl("arts", url);
    }

    public void uploadArtFromFile(final String filePath) {
        uploadImageFromFile("arts", filePath);
    }

    public void uploadPosterFromUrl(final String url) {
        uploadImageFromUrl("posters", url);
    }

    public void uploadPosterFromFile(final String filePath) {
        uploadImageFromFile("posters", filePath);
    }

    abstract Integer ratingKey();

    abstract String type();

    abstract Integer librarySectionId();

    abstract String thumb();

    abstract String art();

    private String urlencode(Map<String, String> params) {
        return params.entrySet()
            .stream()
            .map(e -> URLEncode.encode(e.getKey()) + "=" + URLEncode.encode(e.getValue()))
            .collect(Collectors.joining("&"));
    }

    private void uploadImageFromUrl(final String type, final String url) {
        final String key = String.format("/library/metadata/%s/%s?url=%s", this.ratingKey(), type, URLEncode.encode(url));
        this.getClient().post(key);
    }

    private void uploadImageFromFile(final String type, final String filePath) {
        final String key = String.format("/library/metadata/%s/%s?", this.ratingKey(), type);
        try {
            final byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            this.getClient().post(key, bytes);
        } catch (IOException e) {
            throw new PlexException("Could not read file from " + filePath);
        }
    }
}
