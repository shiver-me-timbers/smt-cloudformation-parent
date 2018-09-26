
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
 * VPNGatewayRoutePropagation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RouteTableIds",
    "VpnGatewayId"
})
public class VPNGatewayRoutePropagation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-routetableids
     * 
     */
    @JsonProperty("RouteTableIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-routetableids")
    private List<CharSequence> routeTableIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-vpngatewayid
     * 
     */
    @JsonProperty("VpnGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-vpngatewayid")
    private CharSequence vpnGatewayId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-routetableids
     * 
     */
    public List<CharSequence> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-routetableids
     * 
     */
    public void setRouteTableIds(List<CharSequence> routeTableIds) {
        this.routeTableIds = routeTableIds;
    }

    public VPNGatewayRoutePropagation withRouteTableIds(List<CharSequence> routeTableIds) {
        this.routeTableIds = routeTableIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-vpngatewayid
     * 
     */
    public CharSequence getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-vpngatewayid
     * 
     */
    public void setVpnGatewayId(CharSequence vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    public VPNGatewayRoutePropagation withVpnGatewayId(CharSequence vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("routeTableIds", routeTableIds).append("vpnGatewayId", vpnGatewayId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(routeTableIds).append(vpnGatewayId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPNGatewayRoutePropagation) == false) {
            return false;
        }
        VPNGatewayRoutePropagation rhs = ((VPNGatewayRoutePropagation) other);
        return new EqualsBuilder().append(routeTableIds, rhs.routeTableIds).append(vpnGatewayId, rhs.vpnGatewayId).isEquals();
    }

}
