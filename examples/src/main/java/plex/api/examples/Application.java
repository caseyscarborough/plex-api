package plex.api.examples;

import plex.api.Movie;
import plex.api.PlexServer;
import plex.api.Show;

public class Application {

    public static void main(String[] args) {
        final String token = System.getenv("PLEX_TOKEN");
        final String host = System.getenv("PLEX_SERVER");

        // Create a new server. Host defaults to http://localhost:32400.
        PlexServer server = new PlexServer(host, token);
        System.out.println("Server Host: " + server.host());
        System.out.println("Plex Username: " + server.myPlexUsername());

        // Get the server library
        server.library();

        // List all sections
        server.library().sections().forEach(System.out::println);

        // List all settings
        server.settings().all().forEach(System.out::println);

        // List all items for a section
        server.library().section("TV Shows").all().forEach(System.out::println);

        // Get a movie by title
        Movie lotr = server.library()
            .section("Movies")
            .movie("The Lord of the Rings: The Fellowship of the Ring");
        System.out.println(lotr);

        // Get a show by title
        Show show = server.library()
            .section("TV Shows")
            .show("Rick and Morty");
        System.out.println(show);

        // Get all episodes for a show (method #1)
        server.library()
            .section("TV Shows")
            .show("Rick and Morty")
            .seasons()
            .stream()
            .flatMap(s -> s.episodes().stream())
            .forEach(System.out::println);

        // Get all episodes for a show (method #2, more efficient than going through seasons)
        server.library()
            .section("TV Shows")
            .show("Rick and Morty")
            .allEpisodes()
            .forEach(System.out::println);

        // Find a movie using a filter
        server.library()
            .section("Movies")
            .find((v) -> v.title().contains("Lord of the Rings"))
            .forEach(System.out::println);
    }
}
