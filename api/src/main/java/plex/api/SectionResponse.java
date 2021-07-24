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
class SectionResponse {

    @XmlElement(name = "Directory")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SectionResponse.Directory> directory;
    @XmlAttribute(name = "size")
    private Integer size;
    @XmlAttribute(name = "allowSync")
    private Integer allowSync;
    @XmlAttribute(name = "identifier")
    private String identifier;
    @XmlAttribute(name = "mediaTagPrefix")
    private String mediaTagPrefix;
    @XmlAttribute(name = "mediaTagVersion")
    private String mediaTagVersion;
    @XmlAttribute(name = "title1")
    private String title1;

    public List<SectionResponse.Directory> getDirectory() {
        if (directory == null) {
            directory = new ArrayList<>();
        }
        return this.directory;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location"
    })
    @Getter
    @Setter
    public static class Directory {

        @XmlElement(name = "Location")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<SectionResponse.Directory.Location> location;
        @XmlAttribute(name = "allowSync")
        private Integer allowSync;
        @XmlAttribute(name = "art")
        private String art;
        @XmlAttribute(name = "composite")
        private String composite;
        @XmlAttribute(name = "filters")
        private Integer filters;
        @XmlAttribute(name = "refreshing")
        private Integer refreshing;
        @XmlAttribute(name = "thumb")
        private String thumb;
        @XmlAttribute(name = "key")
        private Integer key;
        @XmlAttribute(name = "type")
        private String type;
        @XmlAttribute(name = "title")
        private String title;
        @XmlAttribute(name = "agent")
        private String agent;
        @XmlAttribute(name = "scanner")
        private String scanner;
        @XmlAttribute(name = "language")
        private String language;
        @XmlAttribute(name = "uuid")
        private String uuid;
        @XmlAttribute(name = "updatedAt")
        private Integer updatedAt;
        @XmlAttribute(name = "createdAt")
        private Integer createdAt;
        @XmlAttribute(name = "scannedAt")
        private Integer scannedAt;
        @XmlAttribute(name = "content")
        private Integer content;
        @XmlAttribute(name = "directory")
        private Integer directory;
        @XmlAttribute(name = "contentChangedAt")
        private Long contentChangedAt;
        @XmlAttribute(name = "hidden")
        private Integer hidden;

        public List<SectionResponse.Directory.Location> getLocation() {
            if (location == null) {
                location = new ArrayList<>();
            }
            return this.location;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Getter
        @Setter
        public static class Location {
            @XmlValue
            private String value;
            @XmlAttribute(name = "id")
            private Integer id;
            @XmlAttribute(name = "path")
            private String path;
        }
    }
}
