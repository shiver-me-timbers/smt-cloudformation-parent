
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
    private String principal;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname
     * 
     */
    @JsonProperty("ThingName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname")
    private String thingName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal
     * 
     */
    @JsonProperty("Principal")
    public String getPrincipal() {
        return principal;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal
     * 
     */
    @JsonProperty("Principal")
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public ThingPrincipalAttachment withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname
     * 
     */
    @JsonProperty("ThingName")
    public String getThingName() {
        return thingName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname
     * 
     */
    @JsonProperty("ThingName")
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    public ThingPrincipalAttachment withThingName(String thingName) {
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