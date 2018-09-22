
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
    private String destinationCidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock
     * 
     */
    @JsonProperty("DestinationIpv6CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock")
    private String destinationIpv6CidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid
     * 
     */
    @JsonProperty("EgressOnlyInternetGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid")
    private String egressOnlyInternetGatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid
     * 
     */
    @JsonProperty("GatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid")
    private String gatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid")
    private String instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid
     * 
     */
    @JsonProperty("NatGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid")
    private String natGatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid")
    private String networkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid
     * 
     */
    @JsonProperty("RouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid")
    private String routeTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid
     * 
     */
    @JsonProperty("VpcPeeringConnectionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid")
    private String vpcPeeringConnectionId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock
     * 
     */
    @JsonProperty("DestinationCidrBlock")
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock
     * 
     */
    @JsonProperty("DestinationCidrBlock")
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public Route withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock
     * 
     */
    @JsonProperty("DestinationIpv6CidrBlock")
    public String getDestinationIpv6CidrBlock() {
        return destinationIpv6CidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock
     * 
     */
    @JsonProperty("DestinationIpv6CidrBlock")
    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    public Route withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid
     * 
     */
    @JsonProperty("EgressOnlyInternetGatewayId")
    public String getEgressOnlyInternetGatewayId() {
        return egressOnlyInternetGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid
     * 
     */
    @JsonProperty("EgressOnlyInternetGatewayId")
    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    public Route withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid
     * 
     */
    @JsonProperty("GatewayId")
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid
     * 
     */
    @JsonProperty("GatewayId")
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public Route withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Route withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid
     * 
     */
    @JsonProperty("NatGatewayId")
    public String getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid
     * 
     */
    @JsonProperty("NatGatewayId")
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public Route withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public Route withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid
     * 
     */
    @JsonProperty("RouteTableId")
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid
     * 
     */
    @JsonProperty("RouteTableId")
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public Route withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid
     * 
     */
    @JsonProperty("VpcPeeringConnectionId")
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid
     * 
     */
    @JsonProperty("VpcPeeringConnectionId")
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    public Route withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
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
