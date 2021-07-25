package plex.api;

import java.util.stream.Collectors;

abstract class VideoConverter<F, T> extends BaseConverter<F, T> {

    protected Media getMedia(MediaResponse media) {
        return Media.builder()
            .aspectRatio(media.getAspectRatio())
            .audioChannels(media.getAudioChannels())
            .audioCodec(media.getAudioCodec())
            .audioProfile(media.getAudioProfile())
            .bitrate(media.getBitrate())
            .container(media.getContainer())
            .duration(media.getDuration())
            .has64BitOffsets(toBoolean(media.getHas64BitOffsets()))
            .height(media.getHeight())
            .id(media.getId())
            .optimizedForStreaming(toBoolean(media.getOptimizedForStreaming()))
            .parts(media.getPart().stream().map(this::getPart).collect(Collectors.toList()))
            .videoCodec(media.getVideoCodec())
            .videoFrameRate(media.getVideoFrameRate())
            .videoProfile(media.getVideoProfile())
            .videoResolution(media.getVideoResolution())
            .width(media.getWidth())
            .build();
    }

    protected MediaPart getPart(MediaPartResponse part) {
        return MediaPart.builder()
            .audioProfile(part.getAudioProfile())
            .container(part.getContainer())
            .duration(part.getDuration())
            .file(part.getFile())
            .has64BitOffsets(toBoolean(part.getHas64BitOffsets()))
            .hasThumbnail(toBoolean(part.getHasThumbnail()))
            .optimizedForStreaming(toBoolean(part.getOptimizedForStreaming()))
            .id(part.getId())
            .indexes(part.getIndexes())
            .key(part.getKey())
            .size(part.getSize())
            .videoProfile(part.getVideoProfile())
            .build();
    }
}
