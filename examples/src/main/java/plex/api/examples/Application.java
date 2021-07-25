package plex.api.examples;

import plex.api.Library;
import plex.api.Movie;
import plex.api.PlexServer;
import plex.api.Section;
import plex.api.Setting;
import plex.api.Settings;
import plex.api.Video;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        final String token = System.getenv("PLEX_TOKEN");
        final String host = System.getenv("PLEX_SERVER");
        // Defaults to http://localhost:32400
        PlexServer server = new PlexServer(host, token);
        System.out.println("Server Host: " + server.host());
        System.out.println("Plex Username: " + server.myPlexUsername());

        final Library library = server.library();
        System.out.println(library);

        for (Section section : library.sections()) {
            System.out.println(section);
        }

        final Settings settings = server.settings();
        for (Setting setting : settings.all()) {
            System.out.println(setting);
        }

        final List<Video> movies = server.library().section("Movies").all();
        for (Video movie : movies) {
            System.out.println(movie);
        }

        final List<Video> shows = server.library().section("TV Shows").all();
        for (Video show : shows) {
            System.out.println(show);
        }

    }
}
