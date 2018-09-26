package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudformationAttribute {

    @JsonProperty("ItemType")
    private String itemType;

    @JsonProperty("PrimitiveItemType")
    private String primitiveItemType;

    @JsonProperty("PrimitiveType")
    private String primitiveType;

    @JsonProperty("Type")
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
