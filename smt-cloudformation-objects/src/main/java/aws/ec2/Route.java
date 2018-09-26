
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Route
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DestinationCidrBlock",
    "DestinationIpv6CidrBlock",
    "EgressOnlyInternetGatewayId",
    "GatewayId",
    "InstanceId",
    "NatGatewayId",
    "NetworkInterfaceId",
    "RouteTableId",
    "VpcPeeringConnectionId"
})
public class Route {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock
     * 
     */
    @JsonProperty("DestinationCidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock")
    private CharSequence destinationCidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock
     * 
     */
    @JsonProperty("DestinationIpv6CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock")
    private CharSequence destinationIpv6CidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid
     * 
     */
    @JsonProperty("EgressOnlyInternetGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid")
    private CharSequence egressOnlyInternetGatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid
     * 
     */
    @JsonProperty("GatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid")
    private CharSequence gatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid
     * 
     */
    @JsonProperty("NatGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid")
    private CharSequence natGatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid")
    private CharSequence networkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid
     * 
     */
    @JsonProperty("RouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid")
    private CharSequence routeTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid
     * 
     */
    @JsonProperty("VpcPeeringConnectionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid")
    private CharSequence vpcPeeringConnectionId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock
     * 
     */
    public CharSequence getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock
     * 
     */
    public void setDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public Route withDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock
     * 
     */
    public CharSequence getDestinationIpv6CidrBlock() {
        return destinationIpv6CidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock
     * 
     */
    public void setDestinationIpv6CidrBlock(CharSequence destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    public Route withDestinationIpv6CidrBlock(CharSequence destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid
     * 
     */
    public CharSequence getEgressOnlyInternetGatewayId() {
        return egressOnlyInternetGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid
     * 
     */
    public void setEgressOnlyInternetGatewayId(CharSequence egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    public Route withEgressOnlyInternetGatewayId(CharSequence egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid
     * 
     */
    public CharSequence getGatewayId() {
        return gatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid
     * 
     */
    public void setGatewayId(CharSequence gatewayId) {
        this.gatewayId = gatewayId;
    }

    public Route withGatewayId(CharSequence gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid
     * 
     */
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid
     * 
     */
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public Route withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid
     * 
     */
    public CharSequence getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid
     * 
     */
    public void setNatGatewayId(CharSequence natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public Route withNatGatewayId(CharSequence natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid
     * 
     */
    public CharSequence getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid
     * 
     */
    public void setNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public Route withNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid
     * 
     */
    public CharSequence getRouteTableId() {
        return routeTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid
     * 
     */
    public void setRouteTableId(CharSequence routeTableId) {
        this.routeTableId = routeTableId;
    }

    public Route withRouteTableId(CharSequence routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid
     * 
     */
    public CharSequence getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid
     * 
     */
    public void setVpcPeeringConnectionId(CharSequence vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    public Route withVpcPeeringConnectionId(CharSequence vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationCidrBlock", destinationCidrBlock).append("destinationIpv6CidrBlock", destinationIpv6CidrBlock).append("egressOnlyInternetGatewayId", egressOnlyInternetGatewayId).append("gatewayId", gatewayId).append("instanceId", instanceId).append("natGatewayId", natGatewayId).append("networkInterfaceId", networkInterfaceId).append("routeTableId", routeTableId).append("vpcPeeringConnectionId", vpcPeeringConnectionId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationCidrBlock).append(networkInterfaceId).append(destinationIpv6CidrBlock).append(instanceId).append(routeTableId).append(natGatewayId).append(vpcPeeringConnectionId).append(egressOnlyInternetGatewayId).append(gatewayId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Route) == false) {
            return false;
        }
        Route rhs = ((Route) other);
        return new EqualsBuilder().append(destinationCidrBlock, rhs.destinationCidrBlock).append(networkInterfaceId, rhs.networkInterfaceId).append(destinationIpv6CidrBlock, rhs.destinationIpv6CidrBlock).append(instanceId, rhs.instanceId).append(routeTableId, rhs.routeTableId).append(natGatewayId, rhs.natGatewayId).append(vpcPeeringConnectionId, rhs.vpcPeeringConnectionId).append(egressOnlyInternetGatewayId, rhs.egressOnlyInternetGatewayId).append(gatewayId, rhs.gatewayId).isEquals();
    }

}
