package plex.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@Accessors(fluent = true)
@ToString
final class PlexServerDelegate extends BasePlexObject {
    private final boolean allowsCameraUpload;
    private final boolean allowsChannelAccess;
    private final boolean allowsMediaDeletion;
    private final boolean allowsSharing;
    private final boolean allowsSync;
    private final boolean allowsTuners;
    private final boolean backgroundProcessing;
    private final boolean certificate;
    private final boolean companionProxy;
    private final String countryCode;
    private final List<String> diagnostics;
    private final boolean eventStream;
    private final String friendlyName;
    private final boolean hubSearch;
    private final boolean itemClusters;
    private final boolean liveTV;
    private final String machineIdentifier;
    private final boolean mediaProviders;
    private final boolean multiuser;
    private final boolean myPlex;
    private final String myPlexMappingState;
    private final String myPlexSigninState;
    private final boolean myPlexSubscription;
    private final String myPlexUsername;
    private final boolean offlineTranscode;
    private final List<String> ownerFeatures;
    private final boolean photoAutoTag;
    private final String platform;
    private final String platformVersion;
    private final boolean pluginHost;
    private final boolean pushNotifications;
    private final int readOnlyLibraries;
    private final boolean requestParametersInCookie;
    private final String streamingBrainABRVersion;
    private final String streamingBrainVersion;
    private final boolean sync;
    private final int transcoderActiveVideoSessions;
    private final boolean transcoderAudio;
    private final boolean transcoderLyrics;
    private final boolean transcoderPhoto;
    private final boolean transcoderSubtitles;
    private final boolean transcoderVideo;
    private final List<String> transcoderVideoBitrates;
    private final List<String> transcoderVideoQualities;
    private final List<String> transcoderVideoResolutions;
    private final LocalDateTime updatedAt;
    private final boolean updater;
    private final String version;
    private final boolean voiceSearch;

    @Override
    public ObjectType getType() {
        return ObjectType.SERVER;
    }
}
