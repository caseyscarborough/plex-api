package plex.api.examples;

import plex.api.PlexClient;
import plex.api.model.Library;
import plex.api.model.Section;
import plex.api.model.Server;

public class Application {

    public static void main(String[] args) {
        final String token = System.getenv("PLEX_TOKEN");
        // Defaults to http://localhost:32400
        PlexClient client = new PlexClient(token);
        final Server server = client.server();
        System.out.println(server);

        final Library library = client.library();
        System.out.println(library);

        for (Section section : client.sections()) {
            System.out.println(section);
        }
    }
}
