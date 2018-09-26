
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPCGatewayAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InternetGatewayId",
    "VpcId",
    "VpnGatewayId"
})
public class VPCGatewayAttachment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid
     * 
     */
    @JsonProperty("InternetGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid")
    private CharSequence internetGatewayId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpcid")
    private CharSequence vpcId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid
     * 
     */
    @JsonProperty("VpnGatewayId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid")
    private CharSequence vpnGatewayId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid
     * 
     */
    public CharSequence getInternetGatewayId() {
        return internetGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid
     * 
     */
    public void setInternetGatewayId(CharSequence internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }

    public VPCGatewayAttachment withInternetGatewayId(CharSequence internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpcid
     * 
     */
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public VPCGatewayAttachment withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid
     * 
     */
    public CharSequence getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid
     * 
     */
    public void setVpnGatewayId(CharSequence vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    public VPCGatewayAttachment withVpnGatewayId(CharSequence vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("internetGatewayId", internetGatewayId).append("vpcId", vpcId).append("vpnGatewayId", vpnGatewayId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vpnGatewayId).append(internetGatewayId).append(vpcId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCGatewayAttachment) == false) {
            return false;
        }
        VPCGatewayAttachment rhs = ((VPCGatewayAttachment) other);
        return new EqualsBuilder().append(vpnGatewayId, rhs.vpnGatewayId).append(internetGatewayId, rhs.internetGatewayId).append(vpcId, rhs.vpcId).isEquals();
    }

}
