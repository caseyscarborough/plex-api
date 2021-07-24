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
    "setting"
})
@XmlRootElement(name = "MediaContainer")
@Getter
@Setter
class SettingsResponse {

    @XmlElement(name = "Setting")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SettingsResponse.Setting> setting;
    @XmlAttribute(name = "size")
    private Integer size;

    public List<SettingsResponse.Setting> getSetting() {
        if (setting == null) {
            setting = new ArrayList<>();
        }
        return this.setting;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer value) {
        this.size = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Getter
    @Setter
    public static class Setting {

        @XmlAttribute(name = "id")
        private String id;
        @XmlAttribute(name = "label")
        private String label;
        @XmlAttribute(name = "summary")
        private String summary;
        @XmlAttribute(name = "type")
        private String type;
        @XmlAttribute(name = "default")
        private String defaultValue;
        @XmlAttribute(name = "value")
        private String valueAttribute;
        @XmlAttribute(name = "hidden")
        private Integer hidden;
        @XmlAttribute(name = "advanced")
        private Integer advanced;
        @XmlAttribute(name = "group")
        private String group;
        @XmlAttribute(name = "enumValues")
        private String enumValues;
    }
}
