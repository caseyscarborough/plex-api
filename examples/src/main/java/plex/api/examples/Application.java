package plex.api.examples;

import plex.api.Library;
import plex.api.Movie;
import plex.api.PlexServer;
import plex.api.Section;
import plex.api.Show;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) throws IOException {
        final String token = System.getenv("PLEX_TOKEN");
        final String host = System.getenv("PLEX_SERVER");

        // Create a new server. Host defaults to http://localhost:32400.
        final PlexServer server = new PlexServer(host, token);
        System.out.println("Server Host: " + server.host());
        System.out.println("Plex Username: " + server.myPlexUsername());

        // Get the server library
        final Library library = server.library();

        // List all sections
        library.sections().forEach(System.out::println);

        // List all settings
        server.settings().all().forEach(System.out::println);

        // Get a section/movie/show by ID
        library.sectionById("4");
        library.movieById("112486");
        library.showById("59816");

        // Get a section by name
        final Section tv = library.section("TV Shows");
        final Section movies = library.section("Movies");

        // Scan a section for new media
        movies.scan();

        // List all items for a section
        tv.all().forEach(System.out::println);

        // Get a movie by title
        final Movie movie = movies.movie("The Lord of the Rings: The Fellowship of the Ring");
        System.out.println(movie);

        // Get a show by title
        final Show show = tv.show("The Mandalorian");
        System.out.println(show);

        // Get all episodes for a show (method #1)
        show
            .seasons()
            .stream()
            .flatMap(s -> s.episodes().stream())
            .forEach(System.out::println);

        // Get all episodes for a show (method #2, more efficient than going through seasons)
        show
            .allEpisodes()
            .forEach(System.out::println);

        // Find a movie using a filter
        movies
            .find((v) -> v.title().contains("Lord of the Rings"))
            .forEach(System.out::println);

        // Edit a movie
        movie.edit(
            // Pass the key-value pairs in one after another
            "summary.value", "Young hobbit Frodo Baggins, after inheriting a mysterious ring from his uncle Bilbo, must leave his home in order to keep it from falling into the hands of its evil creator. Along the way, a fellowship is formed to protect the ringbearer and make sure that the ring arrives at its final destination: Mt. Doom, the only place where it can be destroyed.",
            "summary.locked", "0",
            "title.value", "The Lord of the Rings: The Fellowship of the Ring",
            "title.locked", "0"
        );

        // Upload poster from a URL
        movie.uploadPosterFromUrl("https://www.themoviedb.org/t/p/w1280/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg");

        // Upload poster from a file
        movie.uploadPosterFromFile("lotr.jpg");

        // Retrieve/download a poster
        byte[] poster = movie.poster();
        Files.write(Paths.get("lotr.jpg"), poster);
    }
}
