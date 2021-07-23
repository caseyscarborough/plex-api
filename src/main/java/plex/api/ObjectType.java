package plex.api;

enum ObjectType {

    SERVER("/"),
    LIBRARY("/library"),
    LIBRARY_SECTION("/library/sections");

    private final String path;

    ObjectType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
