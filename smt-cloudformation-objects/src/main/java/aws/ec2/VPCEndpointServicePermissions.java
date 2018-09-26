
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPCEndpointServicePermissions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllowedPrincipals",
    "ServiceId"
})
public class VPCEndpointServicePermissions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals
     * 
     */
    @JsonProperty("AllowedPrincipals")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals")
    private List<CharSequence> allowedPrincipals = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid
     * 
     */
    @JsonProperty("ServiceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid")
    private CharSequence serviceId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals
     * 
     */
    public List<CharSequence> getAllowedPrincipals() {
        return allowedPrincipals;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals
     * 
     */
    public void setAllowedPrincipals(List<CharSequence> allowedPrincipals) {
        this.allowedPrincipals = allowedPrincipals;
    }

    public VPCEndpointServicePermissions withAllowedPrincipals(List<CharSequence> allowedPrincipals) {
        this.allowedPrincipals = allowedPrincipals;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid
     * 
     */
    public CharSequence getServiceId() {
        return serviceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid
     * 
     */
    public void setServiceId(CharSequence serviceId) {
        this.serviceId = serviceId;
    }

    public VPCEndpointServicePermissions withServiceId(CharSequence serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allowedPrincipals", allowedPrincipals).append("serviceId", serviceId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceId).append(allowedPrincipals).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCEndpointServicePermissions) == false) {
            return false;
        }
        VPCEndpointServicePermissions rhs = ((VPCEndpointServicePermissions) other);
        return new EqualsBuilder().append(serviceId, rhs.serviceId).append(allowedPrincipals, rhs.allowedPrincipals).isEquals();
    }

}
