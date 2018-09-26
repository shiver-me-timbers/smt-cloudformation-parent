
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
 * VPCEndpointService
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NetworkLoadBalancerArns",
    "AcceptanceRequired"
})
public class VPCEndpointService {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns
     * 
     */
    @JsonProperty("NetworkLoadBalancerArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns")
    private List<CharSequence> networkLoadBalancerArns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired
     * 
     */
    @JsonProperty("AcceptanceRequired")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired")
    private Boolean acceptanceRequired;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns
     * 
     */
    public List<CharSequence> getNetworkLoadBalancerArns() {
        return networkLoadBalancerArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns
     * 
     */
    public void setNetworkLoadBalancerArns(List<CharSequence> networkLoadBalancerArns) {
        this.networkLoadBalancerArns = networkLoadBalancerArns;
    }

    public VPCEndpointService withNetworkLoadBalancerArns(List<CharSequence> networkLoadBalancerArns) {
        this.networkLoadBalancerArns = networkLoadBalancerArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired
     * 
     */
    public Boolean getAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired
     * 
     */
    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    public VPCEndpointService withAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("networkLoadBalancerArns", networkLoadBalancerArns).append("acceptanceRequired", acceptanceRequired).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceptanceRequired).append(networkLoadBalancerArns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCEndpointService) == false) {
            return false;
        }
        VPCEndpointService rhs = ((VPCEndpointService) other);
        return new EqualsBuilder().append(acceptanceRequired, rhs.acceptanceRequired).append(networkLoadBalancerArns, rhs.networkLoadBalancerArns).isEquals();
    }

}
