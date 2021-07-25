package plex.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "directory"
})
@XmlRootElement(name = "MediaContainer")
@Getter
@Setter
final class ServerResponse {

    @XmlElement(name = "Directory")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ServerResponse.Directory> directory;
    @XmlAttribute(name = "size")
    private Integer size;
    @XmlAttribute(name = "allowCameraUpload")
    private Integer allowCameraUpload;
    @XmlAttribute(name = "allowChannelAccess")
    private Integer allowChannelAccess;
    @XmlAttribute(name = "allowMediaDeletion")
    private Integer allowMediaDeletion;
    @XmlAttribute(name = "allowSharing")
    private Integer allowSharing;
    @XmlAttribute(name = "allowSync")
    private Integer allowSync;
    @XmlAttribute(name = "allowTuners")
    private Integer allowTuners;
    @XmlAttribute(name = "backgroundProcessing")
    private Integer backgroundProcessing;
    @XmlAttribute(name = "certificate")
    private Integer certificate;
    @XmlAttribute(name = "companionProxy")
    private Integer companionProxy;
    @XmlAttribute(name = "countryCode")
    private String countryCode;
    @XmlAttribute(name = "diagnostics")
    private String diagnostics;
    @XmlAttribute(name = "eventStream")
    private Integer eventStream;
    @XmlAttribute(name = "friendlyName")
    private String friendlyName;
    @XmlAttribute(name = "hubSearch")
    private Integer hubSearch;
    @XmlAttribute(name = "itemClusters")
    private Integer itemClusters;
    @XmlAttribute(name = "livetv")
    private Integer livetv;
    @XmlAttribute(name = "machineIdentifier")
    private String machineIdentifier;
    @XmlAttribute(name = "mediaProviders")
    private Integer mediaProviders;
    @XmlAttribute(name = "multiuser")
    private Integer multiuser;
    @XmlAttribute(name = "myPlex")
    private Integer myPlex;
    @XmlAttribute(name = "myPlexMappingState")
    private String myPlexMappingState;
    @XmlAttribute(name = "myPlexSigninState")
    private String myPlexSigninState;
    @XmlAttribute(name = "myPlexSubscription")
    private Integer myPlexSubscription;
    @XmlAttribute(name = "myPlexUsername")
    private String myPlexUsername;
    @XmlAttribute(name = "offlineTranscode")
    private Integer offlineTranscode;
    @XmlAttribute(name = "ownerFeatures")
    private String ownerFeatures;
    @XmlAttribute(name = "photoAutoTag")
    private Integer photoAutoTag;
    @XmlAttribute(name = "platform")
    private String platform;
    @XmlAttribute(name = "platformVersion")
    private String platformVersion;
    @XmlAttribute(name = "pluginHost")
    private Integer pluginHost;
    @XmlAttribute(name = "pushNotifications")
    private Integer pushNotifications;
    @XmlAttribute(name = "readOnlyLibraries")
    private Integer readOnlyLibraries;
    @XmlAttribute(name = "requestParametersInCookie")
    private Integer requestParametersInCookie;
    @XmlAttribute(name = "streamingBrainABRVersion")
    private String streamingBrainABRVersion;
    @XmlAttribute(name = "streamingBrainVersion")
    private String streamingBrainVersion;
    @XmlAttribute(name = "sync")
    private Integer sync;
    @XmlAttribute(name = "transcoderActiveVideoSessions")
    private Integer transcoderActiveVideoSessions;
    @XmlAttribute(name = "transcoderAudio")
    private Integer transcoderAudio;
    @XmlAttribute(name = "transcoderLyrics")
    private Integer transcoderLyrics;
    @XmlAttribute(name = "transcoderPhoto")
    private Integer transcoderPhoto;
    @XmlAttribute(name = "transcoderSubtitles")
    private Integer transcoderSubtitles;
    @XmlAttribute(name = "transcoderVideo")
    private Integer transcoderVideo;
    @XmlAttribute(name = "transcoderVideoBitrates")
    private String transcoderVideoBitrates;
    @XmlAttribute(name = "transcoderVideoQualities")
    private String transcoderVideoQualities;
    @XmlAttribute(name = "transcoderVideoResolutions")
    private String transcoderVideoResolutions;
    @XmlAttribute(name = "updatedAt")
    private Integer updatedAt;
    @XmlAttribute(name = "updater")
    private Integer updater;
    @XmlAttribute(name = "version")
    private String version;
    @XmlAttribute(name = "voiceSearch")
    private Integer voiceSearch;

    public List<ServerResponse.Directory> getDirectory() {
        if (directory == null) {
            directory = new ArrayList<>();
        }
        return this.directory;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Getter
    @Setter
    public static class Directory {

        @XmlValue
        private String value;
        @XmlAttribute(name = "count")
        private Integer count;
        @XmlAttribute(name = "key")
        private String key;
        @XmlAttribute(name = "title")
        private String title;
    }
}
