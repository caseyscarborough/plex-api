package plex.api;

import lombok.ToString;
import lombok.experimental.Delegate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ToString
public class Season extends EditablePlexObject {

    @Delegate
    private final SeasonDelegate delegate;

    Season(PlexClient client, SeasonDelegate delegate) {
        super(client);
        this.delegate = delegate;
    }

    public List<Episode> episodes() {
        return Arrays.stream(this.getClient().get(this.key(), EpisodesResponse.class, EpisodeDelegate[].class))
            .map(delegate -> new Episode(this.getClient(), delegate))
            .collect(Collectors.toList());
    }
}
