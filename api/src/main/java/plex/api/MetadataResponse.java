package plex.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"directory"})
@XmlRootElement(name = "MetadataResponse")
class MetadataResponse {

    @XmlElement(name = "Directory", required = true)
    protected MetadataResponse.Directory directory;
    @XmlAttribute(name = "size")
    protected Byte size;
    @XmlAttribute(name = "allowSync")
    protected Byte allowSync;
    @XmlAttribute(name = "augmentationKey")
    protected String augmentationKey;
    @XmlAttribute(name = "identifier")
    protected String identifier;
    @XmlAttribute(name = "librarySectionID")
    protected Byte librarySectionID;
    @XmlAttribute(name = "librarySectionTitle")
    protected String librarySectionTitle;
    @XmlAttribute(name = "librarySectionUUID")
    protected String librarySectionUUID;
    @XmlAttribute(name = "mediaTagPrefix")
    protected String mediaTagPrefix;
    @XmlAttribute(name = "mediaTagVersion")
    protected Integer mediaTagVersion;

    /**
     * Gets the value of the directory property.
     *
     * @return possible object is
     * {@link MetadataResponse.Directory }
     */
    public MetadataResponse.Directory getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     *
     * @param value allowed object is
     *              {@link MetadataResponse.Directory }
     */
    public void setDirectory(MetadataResponse.Directory value) {
        this.directory = value;
    }

    /**
     * Gets the value of the size property.
     *
     * @return possible object is
     * {@link Byte }
     */
    public Byte getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     *
     * @param value allowed object is
     *              {@link Byte }
     */
    public void setSize(Byte value) {
        this.size = value;
    }

    /**
     * Gets the value of the allowSync property.
     *
     * @return possible object is
     * {@link Byte }
     */
    public Byte getAllowSync() {
        return allowSync;
    }

    /**
     * Sets the value of the allowSync property.
     *
     * @param value allowed object is
     *              {@link Byte }
     */
    public void setAllowSync(Byte value) {
        this.allowSync = value;
    }

    /**
     * Gets the value of the augmentationKey property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAugmentationKey() {
        return augmentationKey;
    }

    /**
     * Sets the value of the augmentationKey property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAugmentationKey(String value) {
        this.augmentationKey = value;
    }

    /**
     * Gets the value of the identifier property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the librarySectionID property.
     *
     * @return possible object is
     * {@link Byte }
     */
    public Byte getLibrarySectionID() {
        return librarySectionID;
    }

    /**
     * Sets the value of the librarySectionID property.
     *
     * @param value allowed object is
     *              {@link Byte }
     */
    public void setLibrarySectionID(Byte value) {
        this.librarySectionID = value;
    }

    /**
     * Gets the value of the librarySectionTitle property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    /**
     * Sets the value of the librarySectionTitle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLibrarySectionTitle(String value) {
        this.librarySectionTitle = value;
    }

    /**
     * Gets the value of the librarySectionUUID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLibrarySectionUUID() {
        return librarySectionUUID;
    }

    /**
     * Sets the value of the librarySectionUUID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLibrarySectionUUID(String value) {
        this.librarySectionUUID = value;
    }

    /**
     * Gets the value of the mediaTagPrefix property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMediaTagPrefix() {
        return mediaTagPrefix;
    }

    /**
     * Sets the value of the mediaTagPrefix property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMediaTagPrefix(String value) {
        this.mediaTagPrefix = value;
    }

    /**
     * Gets the value of the mediaTagVersion property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMediaTagVersion() {
        return mediaTagVersion;
    }

    /**
     * Sets the value of the mediaTagVersion property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setMediaTagVersion(Integer value) {
        this.mediaTagVersion = value;
    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Genre" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Country">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                 &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Rating" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="image" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="rating" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Role" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tagKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Location">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Preferences">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Setting" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="setting" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                           &lt;attribute name="advanced" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                           &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="enumValues" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Extras">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Video" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Media">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Part">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Stream" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                                         &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                         &lt;attribute name="bitDepth" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="chromaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="chromaSubsampling" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="codedHeight" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                         &lt;attribute name="codedWidth" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                         &lt;attribute name="colorPrimaries" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="colorRange" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="colorSpace" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="colorTrc" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="frameRate" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                         &lt;attribute name="hasScalingMatrix" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                         &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="refFrames" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="scanType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="streamIdentifier" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                         &lt;attribute name="displayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="extendedDisplayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                         &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="languageTag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="audioChannelLayout" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                               &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                               &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                     &lt;attribute name="aspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                     &lt;attribute name="audioChannels" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                     &lt;attribute name="audioCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="videoCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="videoResolution" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                     &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="videoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                     &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                     &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ratingKey" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                           &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="primaryGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="addedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="extraType" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ratingKey" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="studio" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="librarySectionTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="librarySectionID" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="librarySectionKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="originalTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="contentRating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="audienceRating" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="viewCount" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="skipCount" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="lastViewedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}short" />
     *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="art" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="originallyAvailableAt" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="leafCount" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="viewedLeafCount" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="childCount" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="addedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="audienceRatingImage" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="primaryExtraKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"genre", "country", "rating", "role", "location", "preferences", "extras"})
    public static class Directory {

        @XmlElement(name = "Genre")
        protected List<MetadataResponse.Directory.Genre> genre;
        @XmlElement(name = "Country", required = true)
        protected MetadataResponse.Directory.Country country;
        @XmlElement(name = "Rating")
        protected List<MetadataResponse.Directory.Rating> rating;
        @XmlElement(name = "Role")
        protected List<MetadataResponse.Directory.Role> role;
        @XmlElement(name = "Location", required = true)
        protected MetadataResponse.Directory.Location location;
        @XmlElement(name = "Preferences", required = true)
        protected MetadataResponse.Directory.Preferences preferences;
        @XmlElement(name = "Extras", required = true)
        protected MetadataResponse.Directory.Extras extras;
        @XmlAttribute(name = "ratingKey")
        protected Integer ratingKey;
        @XmlAttribute(name = "key")
        protected String key;
        @XmlAttribute(name = "guid")
        protected String guid;
        @XmlAttribute(name = "studio")
        protected String studio;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "librarySectionTitle")
        protected String librarySectionTitle;
        @XmlAttribute(name = "librarySectionID")
        protected Byte librarySectionID;
        @XmlAttribute(name = "librarySectionKey")
        protected String librarySectionKey;
        @XmlAttribute(name = "originalTitle")
        protected String originalTitle;
        @XmlAttribute(name = "contentRating")
        protected String contentRating;
        @XmlAttribute(name = "summary")
        protected String summary;
        @XmlAttribute(name = "index")
        protected Byte index;
        @XmlAttribute(name = "audienceRating")
        protected Float audienceRating;
        @XmlAttribute(name = "viewCount")
        protected Byte viewCount;
        @XmlAttribute(name = "skipCount")
        protected Byte skipCount;
        @XmlAttribute(name = "lastViewedAt")
        protected Integer lastViewedAt;
        @XmlAttribute(name = "year")
        protected Short year;
        @XmlAttribute(name = "thumb")
        protected String thumb;
        @XmlAttribute(name = "art")
        protected String art;
        @XmlAttribute(name = "duration")
        protected Integer duration;
        @XmlAttribute(name = "originallyAvailableAt")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originallyAvailableAt;
        @XmlAttribute(name = "leafCount")
        protected Byte leafCount;
        @XmlAttribute(name = "viewedLeafCount")
        protected Byte viewedLeafCount;
        @XmlAttribute(name = "childCount")
        protected Byte childCount;
        @XmlAttribute(name = "addedAt")
        protected Integer addedAt;
        @XmlAttribute(name = "updatedAt")
        protected Integer updatedAt;
        @XmlAttribute(name = "audienceRatingImage")
        protected String audienceRatingImage;
        @XmlAttribute(name = "primaryExtraKey")
        protected String primaryExtraKey;

        /**
         * Gets the value of the genre property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the genre property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGenre().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetadataResponse.Directory.Genre }
         */
        public List<MetadataResponse.Directory.Genre> getGenre() {
            if (genre == null) {
                genre = new ArrayList<MetadataResponse.Directory.Genre>();
            }
            return this.genre;
        }

        /**
         * Gets the value of the country property.
         *
         * @return possible object is
         * {@link MetadataResponse.Directory.Country }
         */
        public MetadataResponse.Directory.Country getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         *
         * @param value allowed object is
         *              {@link MetadataResponse.Directory.Country }
         */
        public void setCountry(MetadataResponse.Directory.Country value) {
            this.country = value;
        }

        /**
         * Gets the value of the rating property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rating property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRating().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetadataResponse.Directory.Rating }
         */
        public List<MetadataResponse.Directory.Rating> getRating() {
            if (rating == null) {
                rating = new ArrayList<MetadataResponse.Directory.Rating>();
            }
            return this.rating;
        }

        /**
         * Gets the value of the role property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetadataResponse.Directory.Role }
         */
        public List<MetadataResponse.Directory.Role> getRole() {
            if (role == null) {
                role = new ArrayList<MetadataResponse.Directory.Role>();
            }
            return this.role;
        }

        /**
         * Gets the value of the location property.
         *
         * @return possible object is
         * {@link MetadataResponse.Directory.Location }
         */
        public MetadataResponse.Directory.Location getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         *
         * @param value allowed object is
         *              {@link MetadataResponse.Directory.Location }
         */
        public void setLocation(MetadataResponse.Directory.Location value) {
            this.location = value;
        }

        /**
         * Gets the value of the preferences property.
         *
         * @return possible object is
         * {@link MetadataResponse.Directory.Preferences }
         */
        public MetadataResponse.Directory.Preferences getPreferences() {
            return preferences;
        }

        /**
         * Sets the value of the preferences property.
         *
         * @param value allowed object is
         *              {@link MetadataResponse.Directory.Preferences }
         */
        public void setPreferences(MetadataResponse.Directory.Preferences value) {
            this.preferences = value;
        }

        /**
         * Gets the value of the extras property.
         *
         * @return possible object is
         * {@link MetadataResponse.Directory.Extras }
         */
        public MetadataResponse.Directory.Extras getExtras() {
            return extras;
        }

        /**
         * Sets the value of the extras property.
         *
         * @param value allowed object is
         *              {@link MetadataResponse.Directory.Extras }
         */
        public void setExtras(MetadataResponse.Directory.Extras value) {
            this.extras = value;
        }

        /**
         * Gets the value of the ratingKey property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getRatingKey() {
            return ratingKey;
        }

        /**
         * Sets the value of the ratingKey property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setRatingKey(Integer value) {
            this.ratingKey = value;
        }

        /**
         * Gets the value of the key property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the guid property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getGuid() {
            return guid;
        }

        /**
         * Sets the value of the guid property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGuid(String value) {
            this.guid = value;
        }

        /**
         * Gets the value of the studio property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getStudio() {
            return studio;
        }

        /**
         * Sets the value of the studio property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStudio(String value) {
            this.studio = value;
        }

        /**
         * Gets the value of the type property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the title property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the librarySectionTitle property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getLibrarySectionTitle() {
            return librarySectionTitle;
        }

        /**
         * Sets the value of the librarySectionTitle property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLibrarySectionTitle(String value) {
            this.librarySectionTitle = value;
        }

        /**
         * Gets the value of the librarySectionID property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getLibrarySectionID() {
            return librarySectionID;
        }

        /**
         * Sets the value of the librarySectionID property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setLibrarySectionID(Byte value) {
            this.librarySectionID = value;
        }

        /**
         * Gets the value of the librarySectionKey property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getLibrarySectionKey() {
            return librarySectionKey;
        }

        /**
         * Sets the value of the librarySectionKey property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLibrarySectionKey(String value) {
            this.librarySectionKey = value;
        }

        /**
         * Gets the value of the originalTitle property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalTitle() {
            return originalTitle;
        }

        /**
         * Sets the value of the originalTitle property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalTitle(String value) {
            this.originalTitle = value;
        }

        /**
         * Gets the value of the contentRating property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getContentRating() {
            return contentRating;
        }

        /**
         * Sets the value of the contentRating property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContentRating(String value) {
            this.contentRating = value;
        }

        /**
         * Gets the value of the summary property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSummary(String value) {
            this.summary = value;
        }

        /**
         * Gets the value of the index property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setIndex(Byte value) {
            this.index = value;
        }

        /**
         * Gets the value of the audienceRating property.
         *
         * @return possible object is
         * {@link Float }
         */
        public Float getAudienceRating() {
            return audienceRating;
        }

        /**
         * Sets the value of the audienceRating property.
         *
         * @param value allowed object is
         *              {@link Float }
         */
        public void setAudienceRating(Float value) {
            this.audienceRating = value;
        }

        /**
         * Gets the value of the viewCount property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getViewCount() {
            return viewCount;
        }

        /**
         * Sets the value of the viewCount property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setViewCount(Byte value) {
            this.viewCount = value;
        }

        /**
         * Gets the value of the skipCount property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getSkipCount() {
            return skipCount;
        }

        /**
         * Sets the value of the skipCount property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setSkipCount(Byte value) {
            this.skipCount = value;
        }

        /**
         * Gets the value of the lastViewedAt property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getLastViewedAt() {
            return lastViewedAt;
        }

        /**
         * Sets the value of the lastViewedAt property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setLastViewedAt(Integer value) {
            this.lastViewedAt = value;
        }

        /**
         * Gets the value of the year property.
         *
         * @return possible object is
         * {@link Short }
         */
        public Short getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         *
         * @param value allowed object is
         *              {@link Short }
         */
        public void setYear(Short value) {
            this.year = value;
        }

        /**
         * Gets the value of the thumb property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getThumb() {
            return thumb;
        }

        /**
         * Sets the value of the thumb property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setThumb(String value) {
            this.thumb = value;
        }

        /**
         * Gets the value of the art property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getArt() {
            return art;
        }

        /**
         * Sets the value of the art property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setArt(String value) {
            this.art = value;
        }

        /**
         * Gets the value of the duration property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setDuration(Integer value) {
            this.duration = value;
        }

        /**
         * Gets the value of the originallyAvailableAt property.
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getOriginallyAvailableAt() {
            return originallyAvailableAt;
        }

        /**
         * Sets the value of the originallyAvailableAt property.
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setOriginallyAvailableAt(XMLGregorianCalendar value) {
            this.originallyAvailableAt = value;
        }

        /**
         * Gets the value of the leafCount property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getLeafCount() {
            return leafCount;
        }

        /**
         * Sets the value of the leafCount property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setLeafCount(Byte value) {
            this.leafCount = value;
        }

        /**
         * Gets the value of the viewedLeafCount property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getViewedLeafCount() {
            return viewedLeafCount;
        }

        /**
         * Sets the value of the viewedLeafCount property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setViewedLeafCount(Byte value) {
            this.viewedLeafCount = value;
        }

        /**
         * Gets the value of the childCount property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getChildCount() {
            return childCount;
        }

        /**
         * Sets the value of the childCount property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setChildCount(Byte value) {
            this.childCount = value;
        }

        /**
         * Gets the value of the addedAt property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getAddedAt() {
            return addedAt;
        }

        /**
         * Sets the value of the addedAt property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setAddedAt(Integer value) {
            this.addedAt = value;
        }

        /**
         * Gets the value of the updatedAt property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getUpdatedAt() {
            return updatedAt;
        }

        /**
         * Sets the value of the updatedAt property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setUpdatedAt(Integer value) {
            this.updatedAt = value;
        }

        /**
         * Gets the value of the audienceRatingImage property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAudienceRatingImage() {
            return audienceRatingImage;
        }

        /**
         * Sets the value of the audienceRatingImage property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAudienceRatingImage(String value) {
            this.audienceRatingImage = value;
        }

        /**
         * Gets the value of the primaryExtraKey property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPrimaryExtraKey() {
            return primaryExtraKey;
        }

        /**
         * Sets the value of the primaryExtraKey property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPrimaryExtraKey(String value) {
            this.primaryExtraKey = value;
        }

        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}short" />
         *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"value"})
        public static class Country {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected Short id;
            @XmlAttribute(name = "filter")
            protected String filter;
            @XmlAttribute(name = "tag")
            protected String tag;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             *
             * @return possible object is
             * {@link Short }
             */
            public Short getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value allowed object is
             *              {@link Short }
             */
            public void setId(Short value) {
                this.id = value;
            }

            /**
             * Gets the value of the filter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFilter() {
                return filter;
            }

            /**
             * Sets the value of the filter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFilter(String value) {
                this.filter = value;
            }

            /**
             * Gets the value of the tag property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTag() {
                return tag;
            }

            /**
             * Sets the value of the tag property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTag(String value) {
                this.tag = value;
            }

        }

        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Video" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Media">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Part">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Stream" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                               &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                               &lt;attribute name="bitDepth" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="chromaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="chromaSubsampling" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="codedHeight" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                               &lt;attribute name="codedWidth" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                               &lt;attribute name="colorPrimaries" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="colorRange" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="colorSpace" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="colorTrc" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="frameRate" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                               &lt;attribute name="hasScalingMatrix" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                               &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="refFrames" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="scanType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="streamIdentifier" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                                               &lt;attribute name="displayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="extendedDisplayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                               &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="languageTag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="audioChannelLayout" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                     &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                     &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                           &lt;attribute name="aspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                           &lt;attribute name="audioChannels" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                           &lt;attribute name="audioCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="videoCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="videoResolution" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                           &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="videoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                           &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                           &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ratingKey" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                 &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="primaryGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="addedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="extraType" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"video"})
        public static class Extras {

            @XmlElement(name = "Video")
            protected List<MetadataResponse.Directory.Extras.Video> video;
            @XmlAttribute(name = "size")
            protected Byte size;

            /**
             * Gets the value of the video property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the video property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVideo().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MetadataResponse.Directory.Extras.Video }
             */
            public List<MetadataResponse.Directory.Extras.Video> getVideo() {
                if (video == null) {
                    video = new ArrayList<MetadataResponse.Directory.Extras.Video>();
                }
                return this.video;
            }

            /**
             * Gets the value of the size property.
             *
             * @return possible object is
             * {@link Byte }
             */
            public Byte getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             *
             * @param value allowed object is
             *              {@link Byte }
             */
            public void setSize(Byte value) {
                this.size = value;
            }

            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Media">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Part">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Stream" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                                     &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                                     &lt;attribute name="bitDepth" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="chromaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="chromaSubsampling" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="codedHeight" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                                     &lt;attribute name="codedWidth" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                                     &lt;attribute name="colorPrimaries" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="colorRange" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="colorSpace" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="colorTrc" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="frameRate" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                     &lt;attribute name="hasScalingMatrix" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                                     &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="refFrames" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="scanType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="streamIdentifier" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                                     &lt;attribute name="displayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="extendedDisplayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                                     &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="languageTag" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="audioChannelLayout" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                           &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                           &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                 &lt;attribute name="aspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                 &lt;attribute name="audioChannels" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                 &lt;attribute name="audioCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="videoCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="videoResolution" type="{http://www.w3.org/2001/XMLSchema}short" />
             *                 &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="videoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                 &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                 &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ratingKey" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="primaryGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="addedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="extraType" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"media"})
            public static class Video {

                @XmlElement(name = "Media", required = true)
                protected MetadataResponse.Directory.Extras.Video.Media media;
                @XmlAttribute(name = "ratingKey")
                protected Integer ratingKey;
                @XmlAttribute(name = "key")
                protected String key;
                @XmlAttribute(name = "guid")
                protected String guid;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "title")
                protected String title;
                @XmlAttribute(name = "summary")
                protected String summary;
                @XmlAttribute(name = "index")
                protected Byte index;
                @XmlAttribute(name = "thumb")
                protected String thumb;
                @XmlAttribute(name = "primaryGuid")
                protected String primaryGuid;
                @XmlAttribute(name = "subtype")
                protected String subtype;
                @XmlAttribute(name = "duration")
                protected Integer duration;
                @XmlAttribute(name = "addedAt")
                protected Integer addedAt;
                @XmlAttribute(name = "updatedAt")
                protected Integer updatedAt;
                @XmlAttribute(name = "extraType")
                protected Byte extraType;

                /**
                 * Gets the value of the media property.
                 *
                 * @return possible object is
                 * {@link MetadataResponse.Directory.Extras.Video.Media }
                 */
                public MetadataResponse.Directory.Extras.Video.Media getMedia() {
                    return media;
                }

                /**
                 * Sets the value of the media property.
                 *
                 * @param value allowed object is
                 *              {@link MetadataResponse.Directory.Extras.Video.Media }
                 */
                public void setMedia(MetadataResponse.Directory.Extras.Video.Media value) {
                    this.media = value;
                }

                /**
                 * Gets the value of the ratingKey property.
                 *
                 * @return possible object is
                 * {@link Integer }
                 */
                public Integer getRatingKey() {
                    return ratingKey;
                }

                /**
                 * Sets the value of the ratingKey property.
                 *
                 * @param value allowed object is
                 *              {@link Integer }
                 */
                public void setRatingKey(Integer value) {
                    this.ratingKey = value;
                }

                /**
                 * Gets the value of the key property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getKey() {
                    return key;
                }

                /**
                 * Sets the value of the key property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setKey(String value) {
                    this.key = value;
                }

                /**
                 * Gets the value of the guid property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getGuid() {
                    return guid;
                }

                /**
                 * Sets the value of the guid property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setGuid(String value) {
                    this.guid = value;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the title property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Sets the value of the title property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Gets the value of the summary property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getSummary() {
                    return summary;
                }

                /**
                 * Sets the value of the summary property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setSummary(String value) {
                    this.summary = value;
                }

                /**
                 * Gets the value of the index property.
                 *
                 * @return possible object is
                 * {@link Byte }
                 */
                public Byte getIndex() {
                    return index;
                }

                /**
                 * Sets the value of the index property.
                 *
                 * @param value allowed object is
                 *              {@link Byte }
                 */
                public void setIndex(Byte value) {
                    this.index = value;
                }

                /**
                 * Gets the value of the thumb property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getThumb() {
                    return thumb;
                }

                /**
                 * Sets the value of the thumb property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setThumb(String value) {
                    this.thumb = value;
                }

                /**
                 * Gets the value of the primaryGuid property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPrimaryGuid() {
                    return primaryGuid;
                }

                /**
                 * Sets the value of the primaryGuid property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPrimaryGuid(String value) {
                    this.primaryGuid = value;
                }

                /**
                 * Gets the value of the subtype property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getSubtype() {
                    return subtype;
                }

                /**
                 * Sets the value of the subtype property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setSubtype(String value) {
                    this.subtype = value;
                }

                /**
                 * Gets the value of the duration property.
                 *
                 * @return possible object is
                 * {@link Integer }
                 */
                public Integer getDuration() {
                    return duration;
                }

                /**
                 * Sets the value of the duration property.
                 *
                 * @param value allowed object is
                 *              {@link Integer }
                 */
                public void setDuration(Integer value) {
                    this.duration = value;
                }

                /**
                 * Gets the value of the addedAt property.
                 *
                 * @return possible object is
                 * {@link Integer }
                 */
                public Integer getAddedAt() {
                    return addedAt;
                }

                /**
                 * Sets the value of the addedAt property.
                 *
                 * @param value allowed object is
                 *              {@link Integer }
                 */
                public void setAddedAt(Integer value) {
                    this.addedAt = value;
                }

                /**
                 * Gets the value of the updatedAt property.
                 *
                 * @return possible object is
                 * {@link Integer }
                 */
                public Integer getUpdatedAt() {
                    return updatedAt;
                }

                /**
                 * Sets the value of the updatedAt property.
                 *
                 * @param value allowed object is
                 *              {@link Integer }
                 */
                public void setUpdatedAt(Integer value) {
                    this.updatedAt = value;
                }

                /**
                 * Gets the value of the extraType property.
                 *
                 * @return possible object is
                 * {@link Byte }
                 */
                public Byte getExtraType() {
                    return extraType;
                }

                /**
                 * Sets the value of the extraType property.
                 *
                 * @param value allowed object is
                 *              {@link Byte }
                 */
                public void setExtraType(Byte value) {
                    this.extraType = value;
                }

                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Part">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Stream" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                           &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                           &lt;attribute name="bitDepth" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="chromaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="chromaSubsampling" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="codedHeight" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                           &lt;attribute name="codedWidth" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                           &lt;attribute name="colorPrimaries" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="colorRange" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="colorSpace" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="colorTrc" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="frameRate" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                           &lt;attribute name="hasScalingMatrix" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                           &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="refFrames" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="scanType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="streamIdentifier" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *                           &lt;attribute name="displayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="extendedDisplayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                           &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="languageTag" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="audioChannelLayout" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                 &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                 &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *       &lt;attribute name="aspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *       &lt;attribute name="audioChannels" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *       &lt;attribute name="audioCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="videoCodec" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="videoResolution" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *       &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="videoFrameRate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *       &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *       &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {"part"})
                public static class Media {

                    @XmlElement(name = "Part", required = true)
                    protected MetadataResponse.Directory.Extras.Video.Media.Part part;
                    @XmlAttribute(name = "id")
                    protected Integer id;
                    @XmlAttribute(name = "duration")
                    protected Integer duration;
                    @XmlAttribute(name = "bitrate")
                    protected Short bitrate;
                    @XmlAttribute(name = "width")
                    protected Short width;
                    @XmlAttribute(name = "height")
                    protected Short height;
                    @XmlAttribute(name = "aspectRatio")
                    protected Float aspectRatio;
                    @XmlAttribute(name = "audioChannels")
                    protected Byte audioChannels;
                    @XmlAttribute(name = "audioCodec")
                    protected String audioCodec;
                    @XmlAttribute(name = "videoCodec")
                    protected String videoCodec;
                    @XmlAttribute(name = "videoResolution")
                    protected Short videoResolution;
                    @XmlAttribute(name = "container")
                    protected String container;
                    @XmlAttribute(name = "videoFrameRate")
                    protected String videoFrameRate;
                    @XmlAttribute(name = "optimizedForStreaming")
                    protected Byte optimizedForStreaming;
                    @XmlAttribute(name = "audioProfile")
                    protected String audioProfile;
                    @XmlAttribute(name = "has64bitOffsets")
                    protected Byte has64BitOffsets;
                    @XmlAttribute(name = "videoProfile")
                    protected String videoProfile;

                    /**
                     * Gets the value of the part property.
                     *
                     * @return possible object is
                     * {@link MetadataResponse.Directory.Extras.Video.Media.Part }
                     */
                    public MetadataResponse.Directory.Extras.Video.Media.Part getPart() {
                        return part;
                    }

                    /**
                     * Sets the value of the part property.
                     *
                     * @param value allowed object is
                     *              {@link MetadataResponse.Directory.Extras.Video.Media.Part }
                     */
                    public void setPart(MetadataResponse.Directory.Extras.Video.Media.Part value) {
                        this.part = value;
                    }

                    /**
                     * Gets the value of the id property.
                     *
                     * @return possible object is
                     * {@link Integer }
                     */
                    public Integer getId() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     *
                     * @param value allowed object is
                     *              {@link Integer }
                     */
                    public void setId(Integer value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the duration property.
                     *
                     * @return possible object is
                     * {@link Integer }
                     */
                    public Integer getDuration() {
                        return duration;
                    }

                    /**
                     * Sets the value of the duration property.
                     *
                     * @param value allowed object is
                     *              {@link Integer }
                     */
                    public void setDuration(Integer value) {
                        this.duration = value;
                    }

                    /**
                     * Gets the value of the bitrate property.
                     *
                     * @return possible object is
                     * {@link Short }
                     */
                    public Short getBitrate() {
                        return bitrate;
                    }

                    /**
                     * Sets the value of the bitrate property.
                     *
                     * @param value allowed object is
                     *              {@link Short }
                     */
                    public void setBitrate(Short value) {
                        this.bitrate = value;
                    }

                    /**
                     * Gets the value of the width property.
                     *
                     * @return possible object is
                     * {@link Short }
                     */
                    public Short getWidth() {
                        return width;
                    }

                    /**
                     * Sets the value of the width property.
                     *
                     * @param value allowed object is
                     *              {@link Short }
                     */
                    public void setWidth(Short value) {
                        this.width = value;
                    }

                    /**
                     * Gets the value of the height property.
                     *
                     * @return possible object is
                     * {@link Short }
                     */
                    public Short getHeight() {
                        return height;
                    }

                    /**
                     * Sets the value of the height property.
                     *
                     * @param value allowed object is
                     *              {@link Short }
                     */
                    public void setHeight(Short value) {
                        this.height = value;
                    }

                    /**
                     * Gets the value of the aspectRatio property.
                     *
                     * @return possible object is
                     * {@link Float }
                     */
                    public Float getAspectRatio() {
                        return aspectRatio;
                    }

                    /**
                     * Sets the value of the aspectRatio property.
                     *
                     * @param value allowed object is
                     *              {@link Float }
                     */
                    public void setAspectRatio(Float value) {
                        this.aspectRatio = value;
                    }

                    /**
                     * Gets the value of the audioChannels property.
                     *
                     * @return possible object is
                     * {@link Byte }
                     */
                    public Byte getAudioChannels() {
                        return audioChannels;
                    }

                    /**
                     * Sets the value of the audioChannels property.
                     *
                     * @param value allowed object is
                     *              {@link Byte }
                     */
                    public void setAudioChannels(Byte value) {
                        this.audioChannels = value;
                    }

                    /**
                     * Gets the value of the audioCodec property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getAudioCodec() {
                        return audioCodec;
                    }

                    /**
                     * Sets the value of the audioCodec property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setAudioCodec(String value) {
                        this.audioCodec = value;
                    }

                    /**
                     * Gets the value of the videoCodec property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVideoCodec() {
                        return videoCodec;
                    }

                    /**
                     * Sets the value of the videoCodec property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVideoCodec(String value) {
                        this.videoCodec = value;
                    }

                    /**
                     * Gets the value of the videoResolution property.
                     *
                     * @return possible object is
                     * {@link Short }
                     */
                    public Short getVideoResolution() {
                        return videoResolution;
                    }

                    /**
                     * Sets the value of the videoResolution property.
                     *
                     * @param value allowed object is
                     *              {@link Short }
                     */
                    public void setVideoResolution(Short value) {
                        this.videoResolution = value;
                    }

                    /**
                     * Gets the value of the container property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getContainer() {
                        return container;
                    }

                    /**
                     * Sets the value of the container property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setContainer(String value) {
                        this.container = value;
                    }

                    /**
                     * Gets the value of the videoFrameRate property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVideoFrameRate() {
                        return videoFrameRate;
                    }

                    /**
                     * Sets the value of the videoFrameRate property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVideoFrameRate(String value) {
                        this.videoFrameRate = value;
                    }

                    /**
                     * Gets the value of the optimizedForStreaming property.
                     *
                     * @return possible object is
                     * {@link Byte }
                     */
                    public Byte getOptimizedForStreaming() {
                        return optimizedForStreaming;
                    }

                    /**
                     * Sets the value of the optimizedForStreaming property.
                     *
                     * @param value allowed object is
                     *              {@link Byte }
                     */
                    public void setOptimizedForStreaming(Byte value) {
                        this.optimizedForStreaming = value;
                    }

                    /**
                     * Gets the value of the audioProfile property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getAudioProfile() {
                        return audioProfile;
                    }

                    /**
                     * Sets the value of the audioProfile property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setAudioProfile(String value) {
                        this.audioProfile = value;
                    }

                    /**
                     * Gets the value of the has64BitOffsets property.
                     *
                     * @return possible object is
                     * {@link Byte }
                     */
                    public Byte getHas64BitOffsets() {
                        return has64BitOffsets;
                    }

                    /**
                     * Sets the value of the has64BitOffsets property.
                     *
                     * @param value allowed object is
                     *              {@link Byte }
                     */
                    public void setHas64BitOffsets(Byte value) {
                        this.has64BitOffsets = value;
                    }

                    /**
                     * Gets the value of the videoProfile property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getVideoProfile() {
                        return videoProfile;
                    }

                    /**
                     * Sets the value of the videoProfile property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setVideoProfile(String value) {
                        this.videoProfile = value;
                    }

                    /**
                     * <p>Java class for anonymous complex type.
                     *
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Stream" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *                 &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *                 &lt;attribute name="bitDepth" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="chromaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="chromaSubsampling" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="codedHeight" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *                 &lt;attribute name="codedWidth" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *                 &lt;attribute name="colorPrimaries" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="colorRange" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="colorSpace" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="colorTrc" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="frameRate" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                 &lt;attribute name="hasScalingMatrix" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *                 &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="refFrames" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="scanType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="streamIdentifier" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
                     *                 &lt;attribute name="displayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="extendedDisplayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *                 &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="languageTag" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="audioChannelLayout" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="audioProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="container" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="has64bitOffsets" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *       &lt;attribute name="optimizedForStreaming" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *       &lt;attribute name="videoProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {"stream"})
                    public static class Part {

                        @XmlElement(name = "Stream")
                        protected List<MetadataResponse.Directory.Extras.Video.Media.Part.Stream> stream;
                        @XmlAttribute(name = "id")
                        protected Integer id;
                        @XmlAttribute(name = "key")
                        protected String key;
                        @XmlAttribute(name = "duration")
                        protected Integer duration;
                        @XmlAttribute(name = "file")
                        protected String file;
                        @XmlAttribute(name = "size")
                        protected Integer size;
                        @XmlAttribute(name = "audioProfile")
                        protected String audioProfile;
                        @XmlAttribute(name = "container")
                        protected String container;
                        @XmlAttribute(name = "has64bitOffsets")
                        protected Byte has64BitOffsets;
                        @XmlAttribute(name = "optimizedForStreaming")
                        protected Byte optimizedForStreaming;
                        @XmlAttribute(name = "videoProfile")
                        protected String videoProfile;

                        /**
                         * Gets the value of the stream property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the stream property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getStream().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link MetadataResponse.Directory.Extras.Video.Media.Part.Stream }
                         */
                        public List<MetadataResponse.Directory.Extras.Video.Media.Part.Stream> getStream() {
                            if (stream == null) {
                                stream = new ArrayList<MetadataResponse.Directory.Extras.Video.Media.Part.Stream>();
                            }
                            return this.stream;
                        }

                        /**
                         * Gets the value of the id property.
                         *
                         * @return possible object is
                         * {@link Integer }
                         */
                        public Integer getId() {
                            return id;
                        }

                        /**
                         * Sets the value of the id property.
                         *
                         * @param value allowed object is
                         *              {@link Integer }
                         */
                        public void setId(Integer value) {
                            this.id = value;
                        }

                        /**
                         * Gets the value of the key property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getKey() {
                            return key;
                        }

                        /**
                         * Sets the value of the key property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setKey(String value) {
                            this.key = value;
                        }

                        /**
                         * Gets the value of the duration property.
                         *
                         * @return possible object is
                         * {@link Integer }
                         */
                        public Integer getDuration() {
                            return duration;
                        }

                        /**
                         * Sets the value of the duration property.
                         *
                         * @param value allowed object is
                         *              {@link Integer }
                         */
                        public void setDuration(Integer value) {
                            this.duration = value;
                        }

                        /**
                         * Gets the value of the file property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getFile() {
                            return file;
                        }

                        /**
                         * Sets the value of the file property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setFile(String value) {
                            this.file = value;
                        }

                        /**
                         * Gets the value of the size property.
                         *
                         * @return possible object is
                         * {@link Integer }
                         */
                        public Integer getSize() {
                            return size;
                        }

                        /**
                         * Sets the value of the size property.
                         *
                         * @param value allowed object is
                         *              {@link Integer }
                         */
                        public void setSize(Integer value) {
                            this.size = value;
                        }

                        /**
                         * Gets the value of the audioProfile property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getAudioProfile() {
                            return audioProfile;
                        }

                        /**
                         * Sets the value of the audioProfile property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setAudioProfile(String value) {
                            this.audioProfile = value;
                        }

                        /**
                         * Gets the value of the container property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getContainer() {
                            return container;
                        }

                        /**
                         * Sets the value of the container property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setContainer(String value) {
                            this.container = value;
                        }

                        /**
                         * Gets the value of the has64BitOffsets property.
                         *
                         * @return possible object is
                         * {@link Byte }
                         */
                        public Byte getHas64BitOffsets() {
                            return has64BitOffsets;
                        }

                        /**
                         * Sets the value of the has64BitOffsets property.
                         *
                         * @param value allowed object is
                         *              {@link Byte }
                         */
                        public void setHas64BitOffsets(Byte value) {
                            this.has64BitOffsets = value;
                        }

                        /**
                         * Gets the value of the optimizedForStreaming property.
                         *
                         * @return possible object is
                         * {@link Byte }
                         */
                        public Byte getOptimizedForStreaming() {
                            return optimizedForStreaming;
                        }

                        /**
                         * Sets the value of the optimizedForStreaming property.
                         *
                         * @param value allowed object is
                         *              {@link Byte }
                         */
                        public void setOptimizedForStreaming(Byte value) {
                            this.optimizedForStreaming = value;
                        }

                        /**
                         * Gets the value of the videoProfile property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getVideoProfile() {
                            return videoProfile;
                        }

                        /**
                         * Sets the value of the videoProfile property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setVideoProfile(String value) {
                            this.videoProfile = value;
                        }

                        /**
                         * <p>Java class for anonymous complex type.
                         *
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
                         *       &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}short" />
                         *       &lt;attribute name="bitDepth" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="chromaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="chromaSubsampling" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="codedHeight" type="{http://www.w3.org/2001/XMLSchema}short" />
                         *       &lt;attribute name="codedWidth" type="{http://www.w3.org/2001/XMLSchema}short" />
                         *       &lt;attribute name="colorPrimaries" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="colorRange" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="colorSpace" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="colorTrc" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="frameRate" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *       &lt;attribute name="hasScalingMatrix" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}short" />
                         *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="refFrames" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="scanType" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="streamIdentifier" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}short" />
                         *       &lt;attribute name="displayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="extendedDisplayTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}byte" />
                         *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="languageTag" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="audioChannelLayout" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {"value"})
                        public static class Stream {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "id")
                            protected Integer id;
                            @XmlAttribute(name = "streamType")
                            protected Byte streamType;
                            @XmlAttribute(name = "default")
                            protected Byte _default;
                            @XmlAttribute(name = "codec")
                            protected String codec;
                            @XmlAttribute(name = "index")
                            protected Byte index;
                            @XmlAttribute(name = "bitrate")
                            protected Short bitrate;
                            @XmlAttribute(name = "bitDepth")
                            protected Byte bitDepth;
                            @XmlAttribute(name = "chromaLocation")
                            protected String chromaLocation;
                            @XmlAttribute(name = "chromaSubsampling")
                            protected String chromaSubsampling;
                            @XmlAttribute(name = "codedHeight")
                            protected Short codedHeight;
                            @XmlAttribute(name = "codedWidth")
                            protected Short codedWidth;
                            @XmlAttribute(name = "colorPrimaries")
                            protected String colorPrimaries;
                            @XmlAttribute(name = "colorRange")
                            protected String colorRange;
                            @XmlAttribute(name = "colorSpace")
                            protected String colorSpace;
                            @XmlAttribute(name = "colorTrc")
                            protected String colorTrc;
                            @XmlAttribute(name = "frameRate")
                            protected Float frameRate;
                            @XmlAttribute(name = "hasScalingMatrix")
                            protected Byte hasScalingMatrix;
                            @XmlAttribute(name = "height")
                            protected Short height;
                            @XmlAttribute(name = "level")
                            protected Byte level;
                            @XmlAttribute(name = "profile")
                            protected String profile;
                            @XmlAttribute(name = "refFrames")
                            protected Byte refFrames;
                            @XmlAttribute(name = "scanType")
                            protected String scanType;
                            @XmlAttribute(name = "streamIdentifier")
                            protected Byte streamIdentifier;
                            @XmlAttribute(name = "width")
                            protected Short width;
                            @XmlAttribute(name = "displayTitle")
                            protected String displayTitle;
                            @XmlAttribute(name = "extendedDisplayTitle")
                            protected String extendedDisplayTitle;
                            @XmlAttribute(name = "selected")
                            protected Byte selected;
                            @XmlAttribute(name = "channels")
                            protected Byte channels;
                            @XmlAttribute(name = "language")
                            protected String language;
                            @XmlAttribute(name = "languageTag")
                            protected String languageTag;
                            @XmlAttribute(name = "languageCode")
                            protected String languageCode;
                            @XmlAttribute(name = "audioChannelLayout")
                            protected String audioChannelLayout;
                            @XmlAttribute(name = "samplingRate")
                            protected Integer samplingRate;

                            /**
                             * Gets the value of the value property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Sets the value of the value property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Gets the value of the id property.
                             *
                             * @return possible object is
                             * {@link Integer }
                             */
                            public Integer getId() {
                                return id;
                            }

                            /**
                             * Sets the value of the id property.
                             *
                             * @param value allowed object is
                             *              {@link Integer }
                             */
                            public void setId(Integer value) {
                                this.id = value;
                            }

                            /**
                             * Gets the value of the streamType property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getStreamType() {
                                return streamType;
                            }

                            /**
                             * Sets the value of the streamType property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setStreamType(Byte value) {
                                this.streamType = value;
                            }

                            /**
                             * Gets the value of the default property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getDefault() {
                                return _default;
                            }

                            /**
                             * Sets the value of the default property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setDefault(Byte value) {
                                this._default = value;
                            }

                            /**
                             * Gets the value of the codec property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getCodec() {
                                return codec;
                            }

                            /**
                             * Sets the value of the codec property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setCodec(String value) {
                                this.codec = value;
                            }

                            /**
                             * Gets the value of the index property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getIndex() {
                                return index;
                            }

                            /**
                             * Sets the value of the index property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setIndex(Byte value) {
                                this.index = value;
                            }

                            /**
                             * Gets the value of the bitrate property.
                             *
                             * @return possible object is
                             * {@link Short }
                             */
                            public Short getBitrate() {
                                return bitrate;
                            }

                            /**
                             * Sets the value of the bitrate property.
                             *
                             * @param value allowed object is
                             *              {@link Short }
                             */
                            public void setBitrate(Short value) {
                                this.bitrate = value;
                            }

                            /**
                             * Gets the value of the bitDepth property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getBitDepth() {
                                return bitDepth;
                            }

                            /**
                             * Sets the value of the bitDepth property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setBitDepth(Byte value) {
                                this.bitDepth = value;
                            }

                            /**
                             * Gets the value of the chromaLocation property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getChromaLocation() {
                                return chromaLocation;
                            }

                            /**
                             * Sets the value of the chromaLocation property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setChromaLocation(String value) {
                                this.chromaLocation = value;
                            }

                            /**
                             * Gets the value of the chromaSubsampling property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getChromaSubsampling() {
                                return chromaSubsampling;
                            }

                            /**
                             * Sets the value of the chromaSubsampling property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setChromaSubsampling(String value) {
                                this.chromaSubsampling = value;
                            }

                            /**
                             * Gets the value of the codedHeight property.
                             *
                             * @return possible object is
                             * {@link Short }
                             */
                            public Short getCodedHeight() {
                                return codedHeight;
                            }

                            /**
                             * Sets the value of the codedHeight property.
                             *
                             * @param value allowed object is
                             *              {@link Short }
                             */
                            public void setCodedHeight(Short value) {
                                this.codedHeight = value;
                            }

                            /**
                             * Gets the value of the codedWidth property.
                             *
                             * @return possible object is
                             * {@link Short }
                             */
                            public Short getCodedWidth() {
                                return codedWidth;
                            }

                            /**
                             * Sets the value of the codedWidth property.
                             *
                             * @param value allowed object is
                             *              {@link Short }
                             */
                            public void setCodedWidth(Short value) {
                                this.codedWidth = value;
                            }

                            /**
                             * Gets the value of the colorPrimaries property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getColorPrimaries() {
                                return colorPrimaries;
                            }

                            /**
                             * Sets the value of the colorPrimaries property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setColorPrimaries(String value) {
                                this.colorPrimaries = value;
                            }

                            /**
                             * Gets the value of the colorRange property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getColorRange() {
                                return colorRange;
                            }

                            /**
                             * Sets the value of the colorRange property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setColorRange(String value) {
                                this.colorRange = value;
                            }

                            /**
                             * Gets the value of the colorSpace property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getColorSpace() {
                                return colorSpace;
                            }

                            /**
                             * Sets the value of the colorSpace property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setColorSpace(String value) {
                                this.colorSpace = value;
                            }

                            /**
                             * Gets the value of the colorTrc property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getColorTrc() {
                                return colorTrc;
                            }

                            /**
                             * Sets the value of the colorTrc property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setColorTrc(String value) {
                                this.colorTrc = value;
                            }

                            /**
                             * Gets the value of the frameRate property.
                             *
                             * @return possible object is
                             * {@link Float }
                             */
                            public Float getFrameRate() {
                                return frameRate;
                            }

                            /**
                             * Sets the value of the frameRate property.
                             *
                             * @param value allowed object is
                             *              {@link Float }
                             */
                            public void setFrameRate(Float value) {
                                this.frameRate = value;
                            }

                            /**
                             * Gets the value of the hasScalingMatrix property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getHasScalingMatrix() {
                                return hasScalingMatrix;
                            }

                            /**
                             * Sets the value of the hasScalingMatrix property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setHasScalingMatrix(Byte value) {
                                this.hasScalingMatrix = value;
                            }

                            /**
                             * Gets the value of the height property.
                             *
                             * @return possible object is
                             * {@link Short }
                             */
                            public Short getHeight() {
                                return height;
                            }

                            /**
                             * Sets the value of the height property.
                             *
                             * @param value allowed object is
                             *              {@link Short }
                             */
                            public void setHeight(Short value) {
                                this.height = value;
                            }

                            /**
                             * Gets the value of the level property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getLevel() {
                                return level;
                            }

                            /**
                             * Sets the value of the level property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setLevel(Byte value) {
                                this.level = value;
                            }

                            /**
                             * Gets the value of the profile property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getProfile() {
                                return profile;
                            }

                            /**
                             * Sets the value of the profile property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setProfile(String value) {
                                this.profile = value;
                            }

                            /**
                             * Gets the value of the refFrames property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getRefFrames() {
                                return refFrames;
                            }

                            /**
                             * Sets the value of the refFrames property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setRefFrames(Byte value) {
                                this.refFrames = value;
                            }

                            /**
                             * Gets the value of the scanType property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getScanType() {
                                return scanType;
                            }

                            /**
                             * Sets the value of the scanType property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setScanType(String value) {
                                this.scanType = value;
                            }

                            /**
                             * Gets the value of the streamIdentifier property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getStreamIdentifier() {
                                return streamIdentifier;
                            }

                            /**
                             * Sets the value of the streamIdentifier property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setStreamIdentifier(Byte value) {
                                this.streamIdentifier = value;
                            }

                            /**
                             * Gets the value of the width property.
                             *
                             * @return possible object is
                             * {@link Short }
                             */
                            public Short getWidth() {
                                return width;
                            }

                            /**
                             * Sets the value of the width property.
                             *
                             * @param value allowed object is
                             *              {@link Short }
                             */
                            public void setWidth(Short value) {
                                this.width = value;
                            }

                            /**
                             * Gets the value of the displayTitle property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getDisplayTitle() {
                                return displayTitle;
                            }

                            /**
                             * Sets the value of the displayTitle property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setDisplayTitle(String value) {
                                this.displayTitle = value;
                            }

                            /**
                             * Gets the value of the extendedDisplayTitle property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getExtendedDisplayTitle() {
                                return extendedDisplayTitle;
                            }

                            /**
                             * Sets the value of the extendedDisplayTitle property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setExtendedDisplayTitle(String value) {
                                this.extendedDisplayTitle = value;
                            }

                            /**
                             * Gets the value of the selected property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getSelected() {
                                return selected;
                            }

                            /**
                             * Sets the value of the selected property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setSelected(Byte value) {
                                this.selected = value;
                            }

                            /**
                             * Gets the value of the channels property.
                             *
                             * @return possible object is
                             * {@link Byte }
                             */
                            public Byte getChannels() {
                                return channels;
                            }

                            /**
                             * Sets the value of the channels property.
                             *
                             * @param value allowed object is
                             *              {@link Byte }
                             */
                            public void setChannels(Byte value) {
                                this.channels = value;
                            }

                            /**
                             * Gets the value of the language property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getLanguage() {
                                return language;
                            }

                            /**
                             * Sets the value of the language property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setLanguage(String value) {
                                this.language = value;
                            }

                            /**
                             * Gets the value of the languageTag property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getLanguageTag() {
                                return languageTag;
                            }

                            /**
                             * Sets the value of the languageTag property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setLanguageTag(String value) {
                                this.languageTag = value;
                            }

                            /**
                             * Gets the value of the languageCode property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getLanguageCode() {
                                return languageCode;
                            }

                            /**
                             * Sets the value of the languageCode property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setLanguageCode(String value) {
                                this.languageCode = value;
                            }

                            /**
                             * Gets the value of the audioChannelLayout property.
                             *
                             * @return possible object is
                             * {@link String }
                             */
                            public String getAudioChannelLayout() {
                                return audioChannelLayout;
                            }

                            /**
                             * Sets the value of the audioChannelLayout property.
                             *
                             * @param value allowed object is
                             *              {@link String }
                             */
                            public void setAudioChannelLayout(String value) {
                                this.audioChannelLayout = value;
                            }

                            /**
                             * Gets the value of the samplingRate property.
                             *
                             * @return possible object is
                             * {@link Integer }
                             */
                            public Integer getSamplingRate() {
                                return samplingRate;
                            }

                            /**
                             * Sets the value of the samplingRate property.
                             *
                             * @param value allowed object is
                             *              {@link Integer }
                             */
                            public void setSamplingRate(Integer value) {
                                this.samplingRate = value;
                            }

                        }

                    }

                }

            }

        }

        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"value"})
        public static class Genre {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected Integer id;
            @XmlAttribute(name = "filter")
            protected String filter;
            @XmlAttribute(name = "tag")
            protected String tag;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             *
             * @return possible object is
             * {@link Integer }
             */
            public Integer getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value allowed object is
             *              {@link Integer }
             */
            public void setId(Integer value) {
                this.id = value;
            }

            /**
             * Gets the value of the filter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFilter() {
                return filter;
            }

            /**
             * Sets the value of the filter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFilter(String value) {
                this.filter = value;
            }

            /**
             * Gets the value of the tag property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTag() {
                return tag;
            }

            /**
             * Sets the value of the tag property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTag(String value) {
                this.tag = value;
            }

        }

        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"value"})
        public static class Location {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "path")
            protected String path;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the path property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPath() {
                return path;
            }

            /**
             * Sets the value of the path property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPath(String value) {
                this.path = value;
            }

        }

        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Setting" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="setting" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                 &lt;attribute name="advanced" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                 &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="enumValues" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"setting"})
        public static class Preferences {

            @XmlElement(name = "Setting")
            protected List<MetadataResponse.Directory.Preferences.Setting> setting;

            /**
             * Gets the value of the setting property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the setting property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSetting().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MetadataResponse.Directory.Preferences.Setting }
             */
            public List<MetadataResponse.Directory.Preferences.Setting> getSetting() {
                if (setting == null) {
                    setting = new ArrayList<MetadataResponse.Directory.Preferences.Setting>();
                }
                return this.setting;
            }

            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="setting" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *       &lt;attribute name="advanced" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="enumValues" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"value"})
            public static class Setting {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "label")
                protected String label;
                @XmlAttribute(name = "summary")
                protected String summary;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "default")
                protected String _default;
                @XmlAttribute(name = "setting")
                protected String setting;
                @XmlAttribute(name = "hidden")
                protected Byte hidden;
                @XmlAttribute(name = "advanced")
                protected Byte advanced;
                @XmlAttribute(name = "group")
                protected String group;
                @XmlAttribute(name = "enumValues")
                protected String enumValues;

                /**
                 * Gets the value of the value property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the id property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the label property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getLabel() {
                    return label;
                }

                /**
                 * Sets the value of the label property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setLabel(String value) {
                    this.label = value;
                }

                /**
                 * Gets the value of the summary property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getSummary() {
                    return summary;
                }

                /**
                 * Sets the value of the summary property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setSummary(String value) {
                    this.summary = value;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the default property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getDefault() {
                    return _default;
                }

                /**
                 * Sets the value of the default property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setDefault(String value) {
                    this._default = value;
                }

                /**
                 * Gets the value of the setting property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getSetting() {
                    return setting;
                }

                /**
                 * Sets the value of the setting property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setSetting(String value) {
                    this.setting = value;
                }

                /**
                 * Gets the value of the hidden property.
                 *
                 * @return possible object is
                 * {@link Byte }
                 */
                public Byte getHidden() {
                    return hidden;
                }

                /**
                 * Sets the value of the hidden property.
                 *
                 * @param value allowed object is
                 *              {@link Byte }
                 */
                public void setHidden(Byte value) {
                    this.hidden = value;
                }

                /**
                 * Gets the value of the advanced property.
                 *
                 * @return possible object is
                 * {@link Byte }
                 */
                public Byte getAdvanced() {
                    return advanced;
                }

                /**
                 * Sets the value of the advanced property.
                 *
                 * @param value allowed object is
                 *              {@link Byte }
                 */
                public void setAdvanced(Byte value) {
                    this.advanced = value;
                }

                /**
                 * Gets the value of the group property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getGroup() {
                    return group;
                }

                /**
                 * Sets the value of the group property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setGroup(String value) {
                    this.group = value;
                }

                /**
                 * Gets the value of the enumValues property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getEnumValues() {
                    return enumValues;
                }

                /**
                 * Sets the value of the enumValues property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setEnumValues(String value) {
                    this.enumValues = value;
                }

            }

        }

        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="image" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="rating" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"value"})
        public static class Rating {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "image")
            protected String image;
            @XmlAttribute(name = "rating")
            protected Float rating;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the image property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getImage() {
                return image;
            }

            /**
             * Sets the value of the image property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setImage(String value) {
                this.image = value;
            }

            /**
             * Gets the value of the rating property.
             *
             * @return possible object is
             * {@link Float }
             */
            public Float getRating() {
                return rating;
            }

            /**
             * Sets the value of the rating property.
             *
             * @param value allowed object is
             *              {@link Float }
             */
            public void setRating(Float value) {
                this.rating = value;
            }

            /**
             * Gets the value of the type property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setType(String value) {
                this.type = value;
            }

        }

        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tagKey" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"value"})
        public static class Role {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected Integer id;
            @XmlAttribute(name = "filter")
            protected String filter;
            @XmlAttribute(name = "tag")
            protected String tag;
            @XmlAttribute(name = "tagKey")
            protected String tagKey;
            @XmlAttribute(name = "role")
            protected String role;
            @XmlAttribute(name = "thumb")
            protected String thumb;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             *
             * @return possible object is
             * {@link Integer }
             */
            public Integer getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value allowed object is
             *              {@link Integer }
             */
            public void setId(Integer value) {
                this.id = value;
            }

            /**
             * Gets the value of the filter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFilter() {
                return filter;
            }

            /**
             * Sets the value of the filter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFilter(String value) {
                this.filter = value;
            }

            /**
             * Gets the value of the tag property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTag() {
                return tag;
            }

            /**
             * Sets the value of the tag property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTag(String value) {
                this.tag = value;
            }

            /**
             * Gets the value of the tagKey property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTagKey() {
                return tagKey;
            }

            /**
             * Sets the value of the tagKey property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTagKey(String value) {
                this.tagKey = value;
            }

            /**
             * Gets the value of the role property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRole() {
                return role;
            }

            /**
             * Sets the value of the role property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRole(String value) {
                this.role = value;
            }

            /**
             * Gets the value of the thumb property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getThumb() {
                return thumb;
            }

            /**
             * Sets the value of the thumb property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setThumb(String value) {
                this.thumb = value;
            }

        }

    }

}
