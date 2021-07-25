package plex.api;

import lombok.ToString;
import lombok.experimental.Delegate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ToString
public class Show extends Video {

    @Delegate
    private final ShowDelegate delegate;

    Show(PlexClient client, ShowDelegate delegate) {
        super(client, delegate);
        this.delegate = delegate;
    }

    public List<Season> seasons() {
        return Arrays.stream(this.getClient().get(this.key(), SeasonsResponse.class, SeasonDelegate[].class))
            .map(s -> new Season(this.getClient(), s))
            .collect(Collectors.toList());
    }
}
