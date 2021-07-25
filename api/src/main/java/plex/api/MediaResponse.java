package plex.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "part"
})
@Getter
@Setter
class MediaResponse {

    @XmlElement(name = "Part", required = true)
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<MediaPartResponse> part;
    @XmlAttribute(name = "id")
    private Integer id;
    @XmlAttribute(name = "duration")
    private Integer duration;
    @XmlAttribute(name = "bitrate")
    private Integer bitrate;
    @XmlAttribute(name = "width")
    private Integer width;
    @XmlAttribute(name = "height")
    private Integer height;
    @XmlAttribute(name = "aspectRatio")
    private Float aspectRatio;
    @XmlAttribute(name = "audioChannels")
    private Integer audioChannels;
    @XmlAttribute(name = "audioCodec")
    private String audioCodec;
    @XmlAttribute(name = "videoCodec")
    private String videoCodec;
    @XmlAttribute(name = "videoResolution")
    private String videoResolution;
    @XmlAttribute(name = "container")
    private String container;
    @XmlAttribute(name = "videoFrameRate")
    private String videoFrameRate;
    @XmlAttribute(name = "optimizedForStreaming")
    private Integer optimizedForStreaming;
    @XmlAttribute(name = "audioProfile")
    private String audioProfile;
    @XmlAttribute(name = "has64bitOffsets")
    private Integer has64BitOffsets;
    @XmlAttribute(name = "videoProfile")
    private String videoProfile;

    public List<MediaPartResponse> getPart() {
        if (part == null) {
            part = new ArrayList<>();
        }
        return this.part;
    }
}
