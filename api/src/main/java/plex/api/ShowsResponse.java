package plex.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MediaContainer")
@Getter
@Setter
class ShowsResponse {

    @XmlElement(name = "Directory")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ShowsResponse.Directory> directory;
    @XmlAttribute(name = "size")
    private Integer size;
    @XmlAttribute(name = "allowSync")
    private Integer allowSync;
    @XmlAttribute(name = "art")
    private String art;
    @XmlAttribute(name = "identifier")
    private String identifier;
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

    public List<ShowsResponse.Directory> getDirectory() {
        if (directory == null) {
            directory = new ArrayList<>();
        }
        return this.directory;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Getter
    @Setter
    public static class Directory {

        @XmlAttribute(name = "Collection")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<ShowsResponse.Directory.Collection> collection;
        @XmlAttribute(name = "Role")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<ShowsResponse.Directory.Role> role;
        @XmlAttribute(name = "Genre")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<ShowsResponse.Directory.Genre> genre;
        @XmlAttribute(name = "ratingKey")
        private Integer ratingKey;
        @XmlAttribute(name = "key")
        private String key;
        @XmlAttribute(name = "guid")
        private String guid;
        @XmlAttribute(name = "studio")
        private String studio;
        @XmlAttribute(name = "type")
        private String type;
        @XmlAttribute(name = "title")
        private String title;
        @XmlAttribute(name = "contentRating")
        private String contentRating;
        @XmlAttribute(name = "summary")
        private String summary;
        @XmlAttribute(name = "index")
        private Integer index;
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
        @XmlAttribute(name = "banner")
        private String banner;
        @XmlAttribute(name = "duration")
        private Integer duration;
        @XmlAttribute(name = "originallyAvailableAt")
        private String originallyAvailableAt;
        @XmlAttribute(name = "leafCount")
        private Integer leafCount;
        @XmlAttribute(name = "viewedLeafCount")
        private Integer viewedLeafCount;
        @XmlAttribute(name = "childCount")
        private Integer childCount;
        @XmlAttribute(name = "addedAt")
        private Integer addedAt;
        @XmlAttribute(name = "updatedAt")
        private Integer updatedAt;
        @XmlAttribute(name = "rating")
        private Float rating;
        @XmlAttribute(name = "theme")
        private String theme;
        @XmlAttribute(name = "titleSort")
        private String titleSort;
        @XmlAttribute(name = "skipCount")
        private Integer skipCount;
        @XmlAttribute(name = "flattenSeasons")
        private Integer flattenSeasons;
        @XmlAttribute(name = "showOrdering")
        private String showOrdering;
        @XmlAttribute(name = "userRating")
        private Float userRating;
        @XmlAttribute(name = "primaryExtraKey")
        private String primaryExtraKey;

        public List<ShowsResponse.Directory.Genre> getGenre() {
            if (genre == null) {
                genre = new ArrayList<>();
            }
            return this.genre;
        }

        public List<ShowsResponse.Directory.Role> getRole() {
            if (role == null) {
                role = new ArrayList<>();
            }
            return this.role;
        }

        public List<ShowsResponse.Directory.Collection> getCollection() {
            if (collection == null) {
                collection = new ArrayList<>();
            }
            return this.collection;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @Getter
        @Setter
        public static class Collection {
            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @Getter
        @Setter
        public static class Genre {
            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @Getter
        @Setter
        public static class Role {
            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;
        }
    }
}
