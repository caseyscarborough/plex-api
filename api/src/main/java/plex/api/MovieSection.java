package plex.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MovieSection extends Section {
    MovieSection(PlexClient client, SectionDelegate delegate) {
        super(client, delegate);
    }

    @Override
    List<Video> getVideos(String path) {
        final List<MovieDelegate> delegates = Arrays.asList(this.getClient().get(path, MoviesResponse.class, MovieDelegate[].class));
        return delegates.stream().map(d -> new Movie(this.getClient(), d)).collect(Collectors.toList());
    }
}
