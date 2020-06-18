
package shiver.me.timbers.aws.appstream;

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
 * StackAccessEndpoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EndpointType",
    "VpceId"
})
public class StackAccessEndpoint implements Property<StackAccessEndpoint>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-endpointtype
     * 
     */
    @JsonProperty("EndpointType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-endpointtype")
    private CharSequence endpointType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-vpceid
     * 
     */
    @JsonProperty("VpceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-vpceid")
    private CharSequence vpceId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-endpointtype
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointType() {
        return endpointType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-endpointtype
     * 
     */
    @JsonIgnore
    public void setEndpointType(CharSequence endpointType) {
        this.endpointType = endpointType;
    }

    public StackAccessEndpoint withEndpointType(CharSequence endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-vpceid
     * 
     */
    @JsonIgnore
    public CharSequence getVpceId() {
        return vpceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-vpceid
     * 
     */
    @JsonIgnore
    public void setVpceId(CharSequence vpceId) {
        this.vpceId = vpceId;
    }

    public StackAccessEndpoint withVpceId(CharSequence vpceId) {
        this.vpceId = vpceId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endpointType", endpointType).append("vpceId", vpceId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpointType).append(vpceId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackAccessEndpoint) == false) {
            return false;
        }
        StackAccessEndpoint rhs = ((StackAccessEndpoint) other);
        return new EqualsBuilder().append(endpointType, rhs.endpointType).append(vpceId, rhs.vpceId).isEquals();
    }

}
