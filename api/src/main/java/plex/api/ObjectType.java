package plex.api;

public enum ObjectType {

    SERVER("/"),
    LIBRARY("/library"),
    SECTION("/library/sections"),
    SETTINGS("/:/prefs"),
    SECTIONS_ALL("/library/sections/%s/all"),
    SECTIONS_ON_DECK("/library/sections/%s/onDeck");

    private final String path;

    ObjectType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
