
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
 * CustomerGatewayAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GlobalNetworkId",
    "CustomerGatewayArn",
    "DeviceId",
    "LinkId"
})
public class CustomerGatewayAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid
     * 
     */
    @JsonProperty("GlobalNetworkId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid")
    private CharSequence globalNetworkId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn
     * 
     */
    @JsonProperty("CustomerGatewayArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn")
    private CharSequence customerGatewayArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid
     * 
     */
    @JsonProperty("DeviceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid")
    private CharSequence deviceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid
     * 
     */
    @JsonProperty("LinkId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid")
    private CharSequence linkId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid
     * 
     */
    @JsonIgnore
    public CharSequence getGlobalNetworkId() {
        return globalNetworkId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid
     * 
     */
    @JsonIgnore
    public void setGlobalNetworkId(CharSequence globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    public CustomerGatewayAssociation withGlobalNetworkId(CharSequence globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn
     * 
     */
    @JsonIgnore
    public CharSequence getCustomerGatewayArn() {
        return customerGatewayArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn
     * 
     */
    @JsonIgnore
    public void setCustomerGatewayArn(CharSequence customerGatewayArn) {
        this.customerGatewayArn = customerGatewayArn;
    }

    public CustomerGatewayAssociation withCustomerGatewayArn(CharSequence customerGatewayArn) {
        this.customerGatewayArn = customerGatewayArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceId() {
        return deviceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid
     * 
     */
    @JsonIgnore
    public void setDeviceId(CharSequence deviceId) {
        this.deviceId = deviceId;
    }

    public CustomerGatewayAssociation withDeviceId(CharSequence deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid
     * 
     */
    @JsonIgnore
    public CharSequence getLinkId() {
        return linkId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid
     * 
     */
    @JsonIgnore
    public void setLinkId(CharSequence linkId) {
        this.linkId = linkId;
    }

    public CustomerGatewayAssociation withLinkId(CharSequence linkId) {
        this.linkId = linkId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("globalNetworkId", globalNetworkId).append("customerGatewayArn", customerGatewayArn).append("deviceId", deviceId).append("linkId", linkId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linkId).append(customerGatewayArn).append(globalNetworkId).append(deviceId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomerGatewayAssociation) == false) {
            return false;
        }
        CustomerGatewayAssociation rhs = ((CustomerGatewayAssociation) other);
        return new EqualsBuilder().append(linkId, rhs.linkId).append(customerGatewayArn, rhs.customerGatewayArn).append(globalNetworkId, rhs.globalNetworkId).append(deviceId, rhs.deviceId).isEquals();
    }

}
