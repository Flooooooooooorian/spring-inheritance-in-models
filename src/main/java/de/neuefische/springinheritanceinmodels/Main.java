package de.neuefische.springinheritanceinmodels;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        visible = true,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Main.class, name = "main"),
        @JsonSubTypes.Type(value = SubOne.class, name = "sub"),
        @JsonSubTypes.Type(value = SubTwo.class, name = "sub2")
})
public class Main {

    @JsonTypeId
    protected String type;

    public Main() {
    }

    public Main(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Main{" +
                "a='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Main main)) return false;

        return getType() != null ? getType().equals(main.getType()) : main.getType() == null;
    }

    @Override
    public int hashCode() {
        return getType() != null ? getType().hashCode() : 0;
    }
}
