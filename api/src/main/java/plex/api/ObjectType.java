package plex.api;

public enum ObjectType {

    SERVER("/"),
    LIBRARY("/library"),
    SECTION("/library/sections"),
    SETTINGS("/:/prefs");

    private final String path;

    ObjectType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
