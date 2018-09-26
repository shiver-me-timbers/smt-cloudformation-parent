package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudformationProperty {

    @JsonProperty("Documentation")
    private String documentation;

    @JsonProperty("DuplicatesAllowed")
    private Boolean duplicatesAllowed;

    @JsonProperty("ItemType")
    private String itemType;

    @JsonProperty("PrimitiveItemType")
    private String primitiveItemType;

    @JsonProperty("PrimitiveType")
    private String primitiveType;

    @JsonProperty("Required")
    private Boolean required;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("UpdateType")
    private String updateType;

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public Boolean getDuplicatesAllowed() {
        return duplicatesAllowed;
    }

    public boolean isDuplicatesAllowed() {
        return duplicatesAllowed == null || duplicatesAllowed;
    }

    public void setDuplicatesAllowed(Boolean duplicatesAllowed) {
        this.duplicatesAllowed = duplicatesAllowed;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getPrimitiveItemType() {
        return primitiveItemType;
    }

    public void setPrimitiveItemType(String primitiveItemType) {
        this.primitiveItemType = primitiveItemType;
    }

    public String getPrimitiveType() {
        return primitiveType;
    }

    public void setPrimitiveType(String primitiveType) {
        this.primitiveType = primitiveType;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }
}
