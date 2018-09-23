
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VpnTunnelOptionsSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PreSharedKey",
    "TunnelInsideCidr"
})
public class VpnTunnelOptionsSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey
     * 
     */
    @JsonProperty("PreSharedKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey")
    private String preSharedKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr
     * 
     */
    @JsonProperty("TunnelInsideCidr")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr")
    private String tunnelInsideCidr;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey
     * 
     */
    @JsonProperty("PreSharedKey")
    public String getPreSharedKey() {
        return preSharedKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey
     * 
     */
    @JsonProperty("PreSharedKey")
    public void setPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    public VpnTunnelOptionsSpecification withPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr
     * 
     */
    @JsonProperty("TunnelInsideCidr")
    public String getTunnelInsideCidr() {
        return tunnelInsideCidr;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr
     * 
     */
    @JsonProperty("TunnelInsideCidr")
    public void setTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
    }

    public VpnTunnelOptionsSpecification withTunnelInsideCidr(String tunnelInsideCidr) {
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
        if ((other instanceof VpnTunnelOptionsSpecification) == false) {
            return false;
        }
        VpnTunnelOptionsSpecification rhs = ((VpnTunnelOptionsSpecification) other);
        return new EqualsBuilder().append(preSharedKey, rhs.preSharedKey).append(tunnelInsideCidr, rhs.tunnelInsideCidr).isEquals();
    }

}