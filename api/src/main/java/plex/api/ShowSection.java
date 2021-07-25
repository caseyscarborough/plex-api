package plex.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ShowSection extends Section {
    ShowSection(PlexClient client, SectionDelegate delegate) {
        super(client, delegate);
    }

    @Override
    List<Video> getVideos(String path) {
        final List<ShowDelegate> delegates = Arrays.asList(this.getClient().get(path, ShowsResponse.class, ShowDelegate[].class));
        return delegates.stream().map(d -> new Show(this.getClient(), d)).collect(Collectors.toList());
    }
}
