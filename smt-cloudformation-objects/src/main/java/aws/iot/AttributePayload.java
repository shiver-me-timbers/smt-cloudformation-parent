
package aws.iot;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AttributePayload
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Attributes"
})
public class AttributePayload {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes")
    private Map<String, String> attributes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes
     * 
     */
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes
     * 
     */
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public AttributePayload withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("attributes", attributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributePayload) == false) {
            return false;
        }
        AttributePayload rhs = ((AttributePayload) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).isEquals();
    }

}
