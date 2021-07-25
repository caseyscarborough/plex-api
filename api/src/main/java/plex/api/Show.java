package plex.api;

import lombok.experimental.Delegate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Show extends Video {

    @Delegate
    private final ShowDelegate delegate;

    Show(PlexClient client, ShowDelegate delegate) {
        super(client, delegate);
        this.delegate = delegate;
    }

    public List<Season> seasons() {
        return Arrays.stream(this.getClient().get(this.key(), SeasonsResponse.class, SeasonDelegate[].class))
            .map(delegate -> new Season(this.getClient(), delegate))
            .collect(Collectors.toList());
    }

    public List<Episode> allEpisodes() {
        final String path = String.format(Endpoint.SEASONS_ALL_EPISODES.getPath(), this.ratingKey());
        return Arrays.stream(this.getClient().get(path, EpisodesResponse.class, EpisodeDelegate[].class))
            .map(delegate -> new Episode(this.getClient(), delegate))
            .collect(Collectors.toList());
    }
}
