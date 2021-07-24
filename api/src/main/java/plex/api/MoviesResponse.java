package plex.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "video"
})
@XmlRootElement(name = "MediaContainer")
@Getter
@Setter
class MoviesResponse {

    @XmlElement(name = "Video")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<MoviesResponse.Video> video;
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

    public List<MoviesResponse.Video> getVideo() {
        if (video == null) {
            video = new ArrayList<>();
        }
        return this.video;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "media",
        "genre",
        "director",
        "writer",
        "country",
        "collection",
        "role"
    })
    @Getter
    @Setter
    public static class Video {

        @XmlElement(name = "Media", required = true)
        private MoviesResponse.Video.Media media;
        @XmlElement(name = "Genre")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<MoviesResponse.Video.Genre> genre;
        @XmlElement(name = "Director")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<MoviesResponse.Video.Director> director;
        @XmlElement(name = "Writer")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<MoviesResponse.Video.Writer> writer;
        @XmlElement(name = "Country")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<MoviesResponse.Video.Country> country;
        @XmlElement(name = "Collection")
        private MoviesResponse.Video.Collection collection;
        @XmlElement(name = "Role")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<MoviesResponse.Video.Role> role;
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
        @XmlAttribute(name = "rating")
        private Float rating;
        @XmlAttribute(name = "viewCount")
        private Integer viewCount;
        @XmlAttribute(name = "lastViewedAt")
        private Integer lastViewedAt;
        @XmlAttribute(name = "year")
        private Integer year;
        @XmlAttribute(name = "tagline")
        private String tagline;
        @XmlAttribute(name = "thumb")
        private String thumb;
        @XmlAttribute(name = "art")
        private String art;
        @XmlAttribute(name = "duration")
        private Integer duration;
        @XmlAttribute(name = "originallyAvailableAt")
        @XmlSchemaType(name = "date")
        private XMLGregorianCalendar originallyAvailableAt;
        @XmlAttribute(name = "addedAt")
        private Integer addedAt;
        @XmlAttribute(name = "updatedAt")
        private Integer updatedAt;
        @XmlAttribute(name = "chapterSource")
        private String chapterSource;
        @XmlAttribute(name = "primaryExtraKey")
        private String primaryExtraKey;
        @XmlAttribute(name = "skipCount")
        private Integer skipCount;
        @XmlAttribute(name = "titleSort")
        private String titleSort;
        @XmlAttribute(name = "originalTitle")
        private String originalTitle;
        @XmlAttribute(name = "ratingImage")
        private String ratingImage;
        @XmlAttribute(name = "userRating")
        private Float userRating;
        @XmlAttribute(name = "audienceRating")
        private Float audienceRating;
        @XmlAttribute(name = "audienceRatingImage")
        private String audienceRatingImage;
        @XmlAttribute(name = "viewOffset")
        private Integer viewOffset;

        public List<MoviesResponse.Video.Genre> getGenre() {
            if (genre == null) {
                genre = new ArrayList<>();
            }
            return this.genre;
        }

        public List<MoviesResponse.Video.Director> getDirector() {
            if (director == null) {
                director = new ArrayList<>();
            }
            return this.director;
        }

        public List<MoviesResponse.Video.Writer> getWriter() {
            if (writer == null) {
                writer = new ArrayList<>();
            }
            return this.writer;
        }

        public List<MoviesResponse.Video.Country> getCountry() {
            if (country == null) {
                country = new ArrayList<>();
            }
            return this.country;
        }

        public List<MoviesResponse.Video.Role> getRole() {
            if (role == null) {
                role = new ArrayList<>();
            }
            return this.role;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Getter
        @Setter
        public static class Collection {

            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Getter
        @Setter
        public static class Country {

            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Getter
        @Setter
        public static class Director {

            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Getter
        @Setter
        public static class Genre {

            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "part"
        })
        @Getter
        @Setter
        public static class Media {

            @XmlElement(name = "Part", required = true)
            private MoviesResponse.Video.Media.Part part;
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

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            @Getter
            @Setter
            public static class Part {

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

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Getter
        @Setter
        public static class Role {

            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Getter
        @Setter
        public static class Writer {

            @XmlValue
            private String value;
            @XmlAttribute(name = "tag")
            private String tag;

        }
    }
}
