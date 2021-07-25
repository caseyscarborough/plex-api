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
final class SeasonsResponse {

    @XmlElement(name = "Directory")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SeasonsResponse.Directory> directory;
    @XmlAttribute(name = "size")
    private Integer size;
    @XmlAttribute(name = "allowSync")
    private Integer allowSync;
    @XmlAttribute(name = "art")
    private String art;
    @XmlAttribute(name = "banner")
    private String banner;
    @XmlAttribute(name = "identifier")
    private String identifier;
    @XmlAttribute(name = "key")
    private Integer key;
    @XmlAttribute(name = "librarySectionID")
    private Integer librarySectionID;
    @XmlAttribute(name = "librarySectionTitle")
    private String librarySectionTitle;
    @XmlAttribute(name = "librarySectionUUID")
    private String librarySectionUUID;
    @XmlAttribute(name = "mediaTagPrefix")
    private String mediaTagPrefix;
    @XmlAttribute(name = "mediaTagVersion")
    private Integer mediaTagVersion;
    @XmlAttribute(name = "nocache")
    private Integer nocache;
    @XmlAttribute(name = "parentIndex")
    private Integer parentIndex;
    @XmlAttribute(name = "parentTitle")
    private String parentTitle;
    @XmlAttribute(name = "parentYear")
    private Integer parentYear;
    @XmlAttribute(name = "summary")
    private String summary;
    @XmlAttribute(name = "theme")
    private String theme;
    @XmlAttribute(name = "thumb")
    private String thumb;
    @XmlAttribute(name = "title1")
    private String title1;
    @XmlAttribute(name = "title2")
    private String title2;
    @XmlAttribute(name = "viewGroup")
    private String viewGroup;
    @XmlAttribute(name = "viewMode")
    private Integer viewMode;

    public List<SeasonsResponse.Directory> getDirectory() {
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
        @XmlAttribute(name = "ratingKey")
        private Integer ratingKey;
        @XmlAttribute(name = "key")
        private String key;
        @XmlAttribute(name = "parentRatingKey")
        private Integer parentRatingKey;
        @XmlAttribute(name = "guid")
        private String guid;
        @XmlAttribute(name = "parentGuid")
        private String parentGuid;
        @XmlAttribute(name = "parentStudio")
        private String parentStudio;
        @XmlAttribute(name = "type")
        private String type;
        @XmlAttribute(name = "title")
        private String title;
        @XmlAttribute(name = "parentKey")
        private String parentKey;
        @XmlAttribute(name = "parentTitle")
        private String parentTitle;
        @XmlAttribute(name = "summary")
        private String summary;
        @XmlAttribute(name = "index")
        private Integer index;
        @XmlAttribute(name = "parentIndex")
        private Integer parentIndex;
        @XmlAttribute(name = "viewCount")
        private Integer viewCount;
        @XmlAttribute(name = "lastViewedAt")
        private Integer lastViewedAt;
        @XmlAttribute(name = "parentYear")
        private Integer parentYear;
        @XmlAttribute(name = "thumb")
        private String thumb;
        @XmlAttribute(name = "art")
        private String art;
        @XmlAttribute(name = "parentThumb")
        private String parentThumb;
        @XmlAttribute(name = "parentTheme")
        private String parentTheme;
        @XmlAttribute(name = "leafCount")
        private Integer leafCount;
        @XmlAttribute(name = "viewedLeafCount")
        private Integer viewedLeafCount;
        @XmlAttribute(name = "addedAt")
        private Integer addedAt;
        @XmlAttribute(name = "updatedAt")
        private Integer updatedAt;
    }
}
