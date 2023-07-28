package plex.api;

enum Endpoint {

    SERVER("/"),
    LIBRARY("/library"),
    SETTINGS("/:/prefs"),
    SECTIONS("/library/sections"),
    SECTIONS_ALL("/library/sections/%s/all"),
    SECTIONS_GET("/library/sections/%s/all?title=%s"),
    SECTIONS_ON_DECK("/library/sections/%s/onDeck"),
    SEASONS_ALL_EPISODES("/library/metadata/%s/allLeaves"),
    METADATA("/library/metadata/%s?includeConcerts=1&includeExtras=1&includeOnDeck=1&includePopularLeaves=1&includePreferences=1&includeReviews=1&includeChapters=1&includeStations=1&includeExternalMedia=1");

    private final String path;

    Endpoint(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
