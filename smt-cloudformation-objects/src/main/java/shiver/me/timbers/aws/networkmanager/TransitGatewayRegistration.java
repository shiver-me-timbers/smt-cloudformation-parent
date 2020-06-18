
package shiver.me.timbers.aws.networkmanager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TransitGatewayRegistration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GlobalNetworkId",
    "TransitGatewayArn"
})
public class TransitGatewayRegistration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid
     * 
     */
    @JsonProperty("GlobalNetworkId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid")
    private CharSequence globalNetworkId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn
     * 
     */
    @JsonProperty("TransitGatewayArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn")
    private CharSequence transitGatewayArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid
     * 
     */
    @JsonIgnore
    public CharSequence getGlobalNetworkId() {
        return globalNetworkId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid
     * 
     */
    @JsonIgnore
    public void setGlobalNetworkId(CharSequence globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    public TransitGatewayRegistration withGlobalNetworkId(CharSequence globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn
     * 
     */
    @JsonIgnore
    public CharSequence getTransitGatewayArn() {
        return transitGatewayArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn
     * 
     */
    @JsonIgnore
    public void setTransitGatewayArn(CharSequence transitGatewayArn) {
        this.transitGatewayArn = transitGatewayArn;
    }

    public TransitGatewayRegistration withTransitGatewayArn(CharSequence transitGatewayArn) {
        this.transitGatewayArn = transitGatewayArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("globalNetworkId", globalNetworkId).append("transitGatewayArn", transitGatewayArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transitGatewayArn).append(globalNetworkId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransitGatewayRegistration) == false) {
            return false;
        }
        TransitGatewayRegistration rhs = ((TransitGatewayRegistration) other);
        return new EqualsBuilder().append(transitGatewayArn, rhs.transitGatewayArn).append(globalNetworkId, rhs.globalNetworkId).isEquals();
    }

}
