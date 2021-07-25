package plex.api;

enum Endpoint {

    SERVER("/"),
    LIBRARY("/library"),
    SECTION("/library/sections"),
    SETTINGS("/:/prefs"),
    SECTIONS_ALL("/library/sections/%s/all"),
    SECTIONS_GET("/library/sections/%s/all?title=%s"),
    SECTIONS_ON_DECK("/library/sections/%s/onDeck");

    private final String path;

    Endpoint(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
