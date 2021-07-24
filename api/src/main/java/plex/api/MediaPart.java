package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
public class MediaPart {

    private final Integer id;
    private final String key;
    private final Integer duration;
    private final String file;
    private final Long size;
    private final String audioProfile;
    private final String container;
    private final boolean has64BitOffsets;
    private final String indexes;
    private final boolean optimizedForStreaming;
    private final String videoProfile;
    private final boolean hasThumbnail;
}
