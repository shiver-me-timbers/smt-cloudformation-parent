
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ThingPrincipalAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Principal",
    "ThingName"
})
public class ThingPrincipalAttachment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal
     * 
     */
    @JsonProperty("Principal")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal")
    private CharSequence principal;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname
     * 
     */
    @JsonProperty("ThingName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname")
    private CharSequence thingName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal
     * 
     */
    public CharSequence getPrincipal() {
        return principal;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal
     * 
     */
    public void setPrincipal(CharSequence principal) {
        this.principal = principal;
    }

    public ThingPrincipalAttachment withPrincipal(CharSequence principal) {
        this.principal = principal;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname
     * 
     */
    public CharSequence getThingName() {
        return thingName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname
     * 
     */
    public void setThingName(CharSequence thingName) {
        this.thingName = thingName;
    }

    public ThingPrincipalAttachment withThingName(CharSequence thingName) {
        this.thingName = thingName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("principal", principal).append("thingName", thingName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(principal).append(thingName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThingPrincipalAttachment) == false) {
            return false;
        }
        ThingPrincipalAttachment rhs = ((ThingPrincipalAttachment) other);
        return new EqualsBuilder().append(principal, rhs.principal).append(thingName, rhs.thingName).isEquals();
    }

}
