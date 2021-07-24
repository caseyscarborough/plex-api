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
class ServerResponse {

    @XmlElement(name = "Directory")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<ServerResponse.Directory> directory;
    @XmlAttribute(name = "size")
    protected Integer size;
    @XmlAttribute(name = "allowCameraUpload")
    protected Integer allowCameraUpload;
    @XmlAttribute(name = "allowChannelAccess")
    protected Integer allowChannelAccess;
    @XmlAttribute(name = "allowMediaDeletion")
    protected Integer allowMediaDeletion;
    @XmlAttribute(name = "allowSharing")
    protected Integer allowSharing;
    @XmlAttribute(name = "allowSync")
    protected Integer allowSync;
    @XmlAttribute(name = "allowTuners")
    protected Integer allowTuners;
    @XmlAttribute(name = "backgroundProcessing")
    protected Integer backgroundProcessing;
    @XmlAttribute(name = "certificate")
    protected Integer certificate;
    @XmlAttribute(name = "companionProxy")
    protected Integer companionProxy;
    @XmlAttribute(name = "countryCode")
    protected String countryCode;
    @XmlAttribute(name = "diagnostics")
    protected String diagnostics;
    @XmlAttribute(name = "eventStream")
    protected Integer eventStream;
    @XmlAttribute(name = "friendlyName")
    protected String friendlyName;
    @XmlAttribute(name = "hubSearch")
    protected Integer hubSearch;
    @XmlAttribute(name = "itemClusters")
    protected Integer itemClusters;
    @XmlAttribute(name = "livetv")
    protected Integer livetv;
    @XmlAttribute(name = "machineIdentifier")
    protected String machineIdentifier;
    @XmlAttribute(name = "mediaProviders")
    protected Integer mediaProviders;
    @XmlAttribute(name = "multiuser")
    protected Integer multiuser;
    @XmlAttribute(name = "myPlex")
    protected Integer myPlex;
    @XmlAttribute(name = "myPlexMappingState")
    protected String myPlexMappingState;
    @XmlAttribute(name = "myPlexSigninState")
    protected String myPlexSigninState;
    @XmlAttribute(name = "myPlexSubscription")
    protected Integer myPlexSubscription;
    @XmlAttribute(name = "myPlexUsername")
    protected String myPlexUsername;
    @XmlAttribute(name = "offlineTranscode")
    protected Integer offlineTranscode;
    @XmlAttribute(name = "ownerFeatures")
    protected String ownerFeatures;
    @XmlAttribute(name = "photoAutoTag")
    protected Integer photoAutoTag;
    @XmlAttribute(name = "platform")
    protected String platform;
    @XmlAttribute(name = "platformVersion")
    protected String platformVersion;
    @XmlAttribute(name = "pluginHost")
    protected Integer pluginHost;
    @XmlAttribute(name = "pushNotifications")
    protected Integer pushNotifications;
    @XmlAttribute(name = "readOnlyLibraries")
    protected Integer readOnlyLibraries;
    @XmlAttribute(name = "requestParametersInCookie")
    protected Integer requestParametersInCookie;
    @XmlAttribute(name = "streamingBrainABRVersion")
    protected String streamingBrainABRVersion;
    @XmlAttribute(name = "streamingBrainVersion")
    protected String streamingBrainVersion;
    @XmlAttribute(name = "sync")
    protected Integer sync;
    @XmlAttribute(name = "transcoderActiveVideoSessions")
    protected Integer transcoderActiveVideoSessions;
    @XmlAttribute(name = "transcoderAudio")
    protected Integer transcoderAudio;
    @XmlAttribute(name = "transcoderLyrics")
    protected Integer transcoderLyrics;
    @XmlAttribute(name = "transcoderPhoto")
    protected Integer transcoderPhoto;
    @XmlAttribute(name = "transcoderSubtitles")
    protected Integer transcoderSubtitles;
    @XmlAttribute(name = "transcoderVideo")
    protected Integer transcoderVideo;
    @XmlAttribute(name = "transcoderVideoBitrates")
    protected String transcoderVideoBitrates;
    @XmlAttribute(name = "transcoderVideoQualities")
    protected String transcoderVideoQualities;
    @XmlAttribute(name = "transcoderVideoResolutions")
    protected String transcoderVideoResolutions;
    @XmlAttribute(name = "updatedAt")
    protected Integer updatedAt;
    @XmlAttribute(name = "updater")
    protected Integer updater;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "voiceSearch")
    protected Integer voiceSearch;

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
        protected String value;
        @XmlAttribute(name = "count")
        protected Integer count;
        @XmlAttribute(name = "key")
        protected String key;
        @XmlAttribute(name = "title")
        protected String title;
    }
}
