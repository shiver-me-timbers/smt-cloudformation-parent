
package shiver.me.timbers.aws.iot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Thing
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AttributePayload",
    "ThingName"
})
public class Thing {

    /**
     * ThingAttributePayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html
     * 
     */
    @JsonProperty("AttributePayload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html")
    private Property<ThingAttributePayload> attributePayload;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname
     * 
     */
    @JsonProperty("ThingName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname")
    private CharSequence thingName;

    /**
     * ThingAttributePayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html
     * 
     */
    @JsonIgnore
    public Property<ThingAttributePayload> getAttributePayload() {
        return attributePayload;
    }

    /**
     * ThingAttributePayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html
     * 
     */
    @JsonIgnore
    public void setAttributePayload(Property<ThingAttributePayload> attributePayload) {
        this.attributePayload = attributePayload;
    }

    public Thing withAttributePayload(Property<ThingAttributePayload> attributePayload) {
        this.attributePayload = attributePayload;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname
     * 
     */
    @JsonIgnore
    public CharSequence getThingName() {
        return thingName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname
     * 
     */
    @JsonIgnore
    public void setThingName(CharSequence thingName) {
        this.thingName = thingName;
    }

    public Thing withThingName(CharSequence thingName) {
        this.thingName = thingName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributePayload", attributePayload).append("thingName", thingName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(thingName).append(attributePayload).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thing) == false) {
            return false;
        }
        Thing rhs = ((Thing) other);
        return new EqualsBuilder().append(thingName, rhs.thingName).append(attributePayload, rhs.attributePayload).isEquals();
    }

}
