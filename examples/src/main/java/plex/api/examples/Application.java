package plex.api.examples;

import plex.api.Library;
import plex.api.PlexServer;
import plex.api.Section;

public class Application {

    public static void main(String[] args) {
        final String token = System.getenv("PLEX_TOKEN");
        // Defaults to http://localhost:32400
        PlexServer server = new PlexServer(token);
        System.out.println("Server Host: " + server.host());
        System.out.println("Plex Username: " + server.myPlexUsername());

        final Library library = server.library();
        System.out.println(library);

        for (Section section : library.sections()) {
            System.out.println(section);
        }
    }
}
