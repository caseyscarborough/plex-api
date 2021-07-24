package plex.api.response.converter;

import plex.api.model.Server;
import plex.api.response.ServerResponse;

final class ServerConverter extends BaseConverter<ServerResponse, Server> {
    @Override
    public Server convert(ServerResponse input) {
        return Server.builder()
            .allowsCameraUpload(toBoolean(input.getAllowCameraUpload()))
            .allowsChannelAccess(toBoolean(input.getAllowChannelAccess()))
            .allowsMediaDeletion(toBoolean(input.getAllowMediaDeletion()))
            .allowsSharing(toBoolean(input.getAllowSharing()))
            .allowsSync(toBoolean(input.getAllowSync()))
            .allowsTuners(toBoolean(input.getAllowTuners()))
            .backgroundProcessing(toBoolean(input.getBackgroundProcessing()))
            .certificate(toBoolean(input.getCertificate()))
            .companionProxy(toBoolean(input.getCompanionProxy()))
            .countryCode(input.getCountryCode())
            .diagnostics(toList(input.getDiagnostics()))
            .eventStream(toBoolean(input.getEventStream()))
            .friendlyName(input.getFriendlyName())
            .hubSearch(toBoolean(input.getHubSearch()))
            .itemClusters(toBoolean(input.getItemClusters()))
            .liveTV(toBoolean(input.getLivetv()))
            .machineIdentifier(input.getMachineIdentifier())
            .mediaProviders(toBoolean(input.getMediaProviders()))
            .multiuser(toBoolean(input.getMultiuser()))
            .myPlex(toBoolean(input.getMyPlex()))
            .myPlexMappingState(input.getMyPlexMappingState())
            .myPlexSigninState(input.getMyPlexSigninState())
            .myPlexSubscription(toBoolean(input.getMyPlexSubscription()))
            .myPlexUsername(input.getMyPlexUsername())
            .offlineTranscode(toBoolean(input.getOfflineTranscode()))
            .ownerFeatures(toList(input.getOwnerFeatures()))
            .photoAutoTag(toBoolean(input.getPhotoAutoTag()))
            .platform(input.getPlatform())
            .platformVersion(input.getPlatformVersion())
            .pluginHost(toBoolean(input.getPluginHost()))
            .pushNotifications(toBoolean(input.getPushNotifications()))
            .readOnlyLibraries(input.getReadOnlyLibraries())
            .requestParametersInCookie(toBoolean(input.getRequestParametersInCookie()))
            .streamingBrainABRVersion(input.getStreamingBrainABRVersion())
            .streamingBrainVersion(input.getStreamingBrainVersion())
            .sync(toBoolean(input.getSync()))
            .transcoderActiveVideoSessions(input.getTranscoderActiveVideoSessions())
            .transcoderAudio(toBoolean(input.getTranscoderAudio()))
            .transcoderLyrics(toBoolean(input.getTranscoderLyrics()))
            .transcoderPhoto(toBoolean(input.getTranscoderPhoto()))
            .transcoderSubtitles(toBoolean(input.getTranscoderSubtitles()))
            .transcoderVideo(toBoolean(input.getTranscoderVideo()))
            .transcoderVideoBitrates(toList(input.getTranscoderVideoBitrates()))
            .transcoderVideoQualities(toList(input.getTranscoderVideoQualities()))
            .transcoderVideoResolutions(toList(input.getTranscoderVideoResolutions()))
            .updatedAt(toLocalDateTime(input.getUpdatedAt()))
            .updater(toBoolean(input.getUpdater()))
            .version(input.getVersion())
            .voiceSearch(toBoolean(input.getVoiceSearch()))
            .build();
    }

    @Override
    public Class<ServerResponse> from() {
        return ServerResponse.class;
    }

    @Override
    public Class<Server> to() {
        return Server.class;
    }
}
