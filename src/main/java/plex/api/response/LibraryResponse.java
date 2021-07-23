package plex.api.response;

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
public class LibraryResponse {
    @XmlElement(name = "Directory")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<LibraryResponse.Directory> directory;
    @XmlAttribute(name = "size")
    private Integer size;
    @XmlAttribute(name = "allowSync")
    private Integer allowSync;
    @XmlAttribute(name = "art")
    private String art;
    @XmlAttribute(name = "content")
    private String content;
    @XmlAttribute(name = "identifier")
    private String identifier;
    @XmlAttribute(name = "mediaTagPrefix")
    private String mediaTagPrefix;
    @XmlAttribute(name = "mediaTagVersion")
    private String mediaTagVersion;
    @XmlAttribute(name = "title1")
    private String title1;
    @XmlAttribute(name = "title2")
    private String title2;

    public List<LibraryResponse.Directory> getDirectory() {
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
        @XmlAttribute(name = "key")
        private String key;
        @XmlAttribute(name = "title")
        private String title;
    }
}
