package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudformationType {

    @JsonProperty("Documentation")
    private String documentation;

    @JsonProperty("Properties")
    private CloudformationProperties properties;

    @JsonProperty("PrimitiveType")
    private String primitiveType;

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public CloudformationProperties getProperties() {
        return properties;
    }

    public void setProperties(CloudformationProperties properties) {
        this.properties = properties;
    }

    public String getPrimitiveType() {
        return primitiveType;
    }

    public void setPrimitiveType(String primitiveType) {
        this.primitiveType = primitiveType;
    }
}
