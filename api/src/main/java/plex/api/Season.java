package plex.api;

import lombok.ToString;
import lombok.experimental.Delegate;
import plex.api.exception.NotFoundException;

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
            .map(d -> new Episode(this.getClient(), d))
            .collect(Collectors.toList());
    }

    public Episode episode(int index) {
        return this.episodes()
            .stream()
            .filter(e -> e.index().equals(index))
            .findFirst()
            .orElseThrow(() -> new NotFoundException("Could not find Episode " + index + " in " + this.title() + " Season " + this.index()));
    }
}
