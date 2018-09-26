
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPNConnectionRoute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DestinationCidrBlock",
    "VpnConnectionId"
})
public class VPNConnectionRoute {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-cidrblock
     * 
     */
    @JsonProperty("DestinationCidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-cidrblock")
    private CharSequence destinationCidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-connectionid
     * 
     */
    @JsonProperty("VpnConnectionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-connectionid")
    private CharSequence vpnConnectionId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-cidrblock
     * 
     */
    public CharSequence getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-cidrblock
     * 
     */
    public void setDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public VPNConnectionRoute withDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-connectionid
     * 
     */
    public CharSequence getVpnConnectionId() {
        return vpnConnectionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-connectionid
     * 
     */
    public void setVpnConnectionId(CharSequence vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    public VPNConnectionRoute withVpnConnectionId(CharSequence vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationCidrBlock", destinationCidrBlock).append("vpnConnectionId", vpnConnectionId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationCidrBlock).append(vpnConnectionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPNConnectionRoute) == false) {
            return false;
        }
        VPNConnectionRoute rhs = ((VPNConnectionRoute) other);
        return new EqualsBuilder().append(destinationCidrBlock, rhs.destinationCidrBlock).append(vpnConnectionId, rhs.vpnConnectionId).isEquals();
    }

}
