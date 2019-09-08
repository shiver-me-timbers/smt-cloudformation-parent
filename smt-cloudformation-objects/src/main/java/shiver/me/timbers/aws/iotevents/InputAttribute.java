
package shiver.me.timbers.aws.iotevents;

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
 * InputAttribute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "JsonPath"
})
public class InputAttribute implements Property<InputAttribute>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html#cfn-iotevents-input-attribute-jsonpath
     * 
     */
    @JsonProperty("JsonPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html#cfn-iotevents-input-attribute-jsonpath")
    private CharSequence jsonPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html#cfn-iotevents-input-attribute-jsonpath
     * 
     */
    @JsonIgnore
    public CharSequence getJsonPath() {
        return jsonPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html#cfn-iotevents-input-attribute-jsonpath
     * 
     */
    @JsonIgnore
    public void setJsonPath(CharSequence jsonPath) {
        this.jsonPath = jsonPath;
    }

    public InputAttribute withJsonPath(CharSequence jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jsonPath", jsonPath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jsonPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputAttribute) == false) {
            return false;
        }
        InputAttribute rhs = ((InputAttribute) other);
        return new EqualsBuilder().append(jsonPath, rhs.jsonPath).isEquals();
    }

}
