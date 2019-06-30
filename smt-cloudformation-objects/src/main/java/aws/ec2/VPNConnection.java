
package aws.ec2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPNConnection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CustomerGatewayId",
    "StaticRoutesOnly",
    "Tags",
    "Type",
    "VpnGatewayId",
    "VpnTunnelOptionsSpecifications"
})
public class VPNConnection {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-customergatewayid
     * 
     */
    @JsonProperty("CustomerGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-customergatewayid")
    private CharSequence customerGatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-StaticRoutesOnly
     * 
     */
    @JsonProperty("StaticRoutesOnly")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-StaticRoutesOnly")
    private CharSequence staticRoutesOnly;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpngatewayid
     * 
     */
    @JsonProperty("VpnGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpngatewayid")
    private CharSequence vpnGatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications
     * 
     */
    @JsonProperty("VpnTunnelOptionsSpecifications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications")
    private Set<Property<VPNConnectionVpnTunnelOptionsSpecification>> vpnTunnelOptionsSpecifications = new LinkedHashSet<Property<VPNConnectionVpnTunnelOptionsSpecification>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-customergatewayid
     * 
     */
    @JsonIgnore
    public CharSequence getCustomerGatewayId() {
        return customerGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-customergatewayid
     * 
     */
    @JsonIgnore
    public void setCustomerGatewayId(CharSequence customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    public VPNConnection withCustomerGatewayId(CharSequence customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-StaticRoutesOnly
     * 
     */
    @JsonIgnore
    public CharSequence getStaticRoutesOnly() {
        return staticRoutesOnly;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-StaticRoutesOnly
     * 
     */
    @JsonIgnore
    public void setStaticRoutesOnly(CharSequence staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }

    public VPNConnection withStaticRoutesOnly(CharSequence staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public VPNConnection withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public VPNConnection withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpngatewayid
     * 
     */
    @JsonIgnore
    public CharSequence getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpngatewayid
     * 
     */
    @JsonIgnore
    public void setVpnGatewayId(CharSequence vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    public VPNConnection withVpnGatewayId(CharSequence vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications
     * 
     */
    @JsonIgnore
    public Set<Property<VPNConnectionVpnTunnelOptionsSpecification>> getVpnTunnelOptionsSpecifications() {
        return vpnTunnelOptionsSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications
     * 
     */
    @JsonIgnore
    public void setVpnTunnelOptionsSpecifications(Set<Property<VPNConnectionVpnTunnelOptionsSpecification>> vpnTunnelOptionsSpecifications) {
        this.vpnTunnelOptionsSpecifications = vpnTunnelOptionsSpecifications;
    }

    public VPNConnection withVpnTunnelOptionsSpecifications(Set<Property<VPNConnectionVpnTunnelOptionsSpecification>> vpnTunnelOptionsSpecifications) {
        this.vpnTunnelOptionsSpecifications = vpnTunnelOptionsSpecifications;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerGatewayId", customerGatewayId).append("staticRoutesOnly", staticRoutesOnly).append("tags", tags).append("type", type).append("vpnGatewayId", vpnGatewayId).append("vpnTunnelOptionsSpecifications", vpnTunnelOptionsSpecifications).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customerGatewayId).append(vpnTunnelOptionsSpecifications).append(vpnGatewayId).append(type).append(staticRoutesOnly).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPNConnection) == false) {
            return false;
        }
        VPNConnection rhs = ((VPNConnection) other);
        return new EqualsBuilder().append(customerGatewayId, rhs.customerGatewayId).append(vpnTunnelOptionsSpecifications, rhs.vpnTunnelOptionsSpecifications).append(vpnGatewayId, rhs.vpnGatewayId).append(type, rhs.type).append(staticRoutesOnly, rhs.staticRoutesOnly).append(tags, rhs.tags).isEquals();
    }

}
