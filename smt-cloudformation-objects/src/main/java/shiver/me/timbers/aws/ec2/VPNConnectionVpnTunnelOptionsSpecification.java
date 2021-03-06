
package shiver.me.timbers.aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * VPNConnectionVpnTunnelOptionsSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PreSharedKey",
    "TunnelInsideCidr"
})
public class VPNConnectionVpnTunnelOptionsSpecification implements Property<VPNConnectionVpnTunnelOptionsSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey
     * 
     */
    @JsonProperty("PreSharedKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey")
    private CharSequence preSharedKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr
     * 
     */
    @JsonProperty("TunnelInsideCidr")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr")
    private CharSequence tunnelInsideCidr;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey
     * 
     */
    @JsonIgnore
    public CharSequence getPreSharedKey() {
        return preSharedKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey
     * 
     */
    @JsonIgnore
    public void setPreSharedKey(CharSequence preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    public VPNConnectionVpnTunnelOptionsSpecification withPreSharedKey(CharSequence preSharedKey) {
        this.preSharedKey = preSharedKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr
     * 
     */
    @JsonIgnore
    public CharSequence getTunnelInsideCidr() {
        return tunnelInsideCidr;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr
     * 
     */
    @JsonIgnore
    public void setTunnelInsideCidr(CharSequence tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
    }

    public VPNConnectionVpnTunnelOptionsSpecification withTunnelInsideCidr(CharSequence tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("preSharedKey", preSharedKey).append("tunnelInsideCidr", tunnelInsideCidr).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(preSharedKey).append(tunnelInsideCidr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPNConnectionVpnTunnelOptionsSpecification) == false) {
            return false;
        }
        VPNConnectionVpnTunnelOptionsSpecification rhs = ((VPNConnectionVpnTunnelOptionsSpecification) other);
        return new EqualsBuilder().append(preSharedKey, rhs.preSharedKey).append(tunnelInsideCidr, rhs.tunnelInsideCidr).isEquals();
    }

}
