
package shiver.me.timbers.aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GatewayRouteTableAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RouteTableId",
    "GatewayId"
})
public class GatewayRouteTableAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid
     * 
     */
    @JsonProperty("RouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid")
    private CharSequence routeTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid
     * 
     */
    @JsonProperty("GatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid")
    private CharSequence gatewayId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid
     * 
     */
    @JsonIgnore
    public CharSequence getRouteTableId() {
        return routeTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid
     * 
     */
    @JsonIgnore
    public void setRouteTableId(CharSequence routeTableId) {
        this.routeTableId = routeTableId;
    }

    public GatewayRouteTableAssociation withRouteTableId(CharSequence routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid
     * 
     */
    @JsonIgnore
    public CharSequence getGatewayId() {
        return gatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid
     * 
     */
    @JsonIgnore
    public void setGatewayId(CharSequence gatewayId) {
        this.gatewayId = gatewayId;
    }

    public GatewayRouteTableAssociation withGatewayId(CharSequence gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("routeTableId", routeTableId).append("gatewayId", gatewayId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(gatewayId).append(routeTableId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GatewayRouteTableAssociation) == false) {
            return false;
        }
        GatewayRouteTableAssociation rhs = ((GatewayRouteTableAssociation) other);
        return new EqualsBuilder().append(gatewayId, rhs.gatewayId).append(routeTableId, rhs.routeTableId).isEquals();
    }

}
