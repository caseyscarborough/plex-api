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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "video"
})
@XmlRootElement(name = "MediaContainer")
@Getter
@Setter
final class EpisodesResponse {

    @XmlElement(name = "Video")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<EpisodesResponse.Video> video;
    @XmlAttribute(name = "size")
    private Integer size;
    @XmlAttribute(name = "allowSync")
    private Integer allowSync;
    @XmlAttribute(name = "art")
    private String art;
    @XmlAttribute(name = "banner")
    private String banner;
    @XmlAttribute(name = "grandparentContentRating")
    private String grandparentContentRating;
    @XmlAttribute(name = "grandparentRatingKey")
    private Integer grandparentRatingKey;
    @XmlAttribute(name = "grandparentStudio")
    private String grandparentStudio;
    @XmlAttribute(name = "grandparentThumb")
    private String grandparentThumb;
    @XmlAttribute(name = "grandparentTitle")
    private String grandparentTitle;
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
    @XmlAttribute(name = "title1")
    private String title1;
    @XmlAttribute(name = "title2")
    private String title2;
    @XmlAttribute(name = "viewGroup")
    private String viewGroup;
    @XmlAttribute(name = "viewMode")
    private Integer viewMode;

    public List<EpisodesResponse.Video> getVideo() {
        if (video == null) {
            video = new ArrayList<>();
        }
        return video;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "media"
    })
    @Getter
    @Setter
    public static class Video {

        @XmlElement(name = "Media", required = true)
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<MediaResponse> media;
        @XmlAttribute(name = "ratingKey")
        private Integer ratingKey;
        @XmlAttribute(name = "key")
        private String key;
        @XmlAttribute(name = "parentRatingKey")
        private Integer parentRatingKey;
        @XmlAttribute(name = "grandparentRatingKey")
        private Integer grandparentRatingKey;
        @XmlAttribute(name = "guid")
        private String guid;
        @XmlAttribute(name = "parentGuid")
        private String parentGuid;
        @XmlAttribute(name = "grandparentGuid")
        private String grandparentGuid;
        @XmlAttribute(name = "type")
        private String type;
        @XmlAttribute(name = "title")
        private String title;
        @XmlAttribute(name = "grandparentKey")
        private String grandparentKey;
        @XmlAttribute(name = "parentKey")
        private String parentKey;
        @XmlAttribute(name = "grandparentTitle")
        private String grandparentTitle;
        @XmlAttribute(name = "parentTitle")
        private String parentTitle;
        @XmlAttribute(name = "contentRating")
        private String contentRating;
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
        @XmlAttribute(name = "year")
        private Integer year;
        @XmlAttribute(name = "thumb")
        private String thumb;
        @XmlAttribute(name = "art")
        private String art;
        @XmlAttribute(name = "grandparentThumb")
        private String grandparentThumb;
        @XmlAttribute(name = "grandparentArt")
        private String grandparentArt;
        @XmlAttribute(name = "duration")
        private Integer duration;
        @XmlAttribute(name = "originallyAvailableAt")
        private String originallyAvailableAt;
        @XmlAttribute(name = "addedAt")
        private Integer addedAt;
        @XmlAttribute(name = "updatedAt")
        private Integer updatedAt;
        @XmlAttribute(name = "rating")
        private Float rating;
        @XmlAttribute(name = "titleSort")
        private String titleSort;

        public List<MediaResponse> getMedia() {
            if (media == null) {
                media = new ArrayList<>();
            }
            return media;
        }
    }
}
