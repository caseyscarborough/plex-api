package plex.api;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@Getter
@Setter
class MediaPartResponse {

    @XmlValue
    private String value;
    @XmlAttribute(name = "id")
    private Integer id;
    @XmlAttribute(name = "key")
    private String key;
    @XmlAttribute(name = "duration")
    private Integer duration;
    @XmlAttribute(name = "file")
    private String file;
    @XmlAttribute(name = "size")
    private Long size;
    @XmlAttribute(name = "audioProfile")
    private String audioProfile;
    @XmlAttribute(name = "container")
    private String container;
    @XmlAttribute(name = "has64bitOffsets")
    private Integer has64BitOffsets;
    @XmlAttribute(name = "indexes")
    private String indexes;
    @XmlAttribute(name = "optimizedForStreaming")
    private Integer optimizedForStreaming;
    @XmlAttribute(name = "videoProfile")
    private String videoProfile;
    @XmlAttribute(name = "hasThumbnail")
    private Integer hasThumbnail;
}
