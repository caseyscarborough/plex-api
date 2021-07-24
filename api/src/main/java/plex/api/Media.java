package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
public class Media {

    private final List<MediaPart> parts;
    private final Integer id;
    private final Integer duration;
    private final Integer bitrate;
    private final Integer width;
    private final Integer height;
    private final Float aspectRatio;
    private final Integer audioChannels;
    private final String audioCodec;
    private final String videoCodec;
    private final String videoResolution;
    private final String container;
    private final String videoFrameRate;
    private final boolean optimizedForStreaming;
    private final String audioProfile;
    private final boolean has64BitOffsets;
    private final String videoProfile;
}
