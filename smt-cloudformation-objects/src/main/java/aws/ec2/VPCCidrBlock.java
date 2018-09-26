
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPCCidrBlock
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AmazonProvidedIpv6CidrBlock",
    "CidrBlock",
    "VpcId"
})
public class VPCCidrBlock {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock
     * 
     */
    @JsonProperty("AmazonProvidedIpv6CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock")
    private Boolean amazonProvidedIpv6CidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock
     * 
     */
    @JsonProperty("CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock")
    private CharSequence cidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock
     * 
     */
    public Boolean getAmazonProvidedIpv6CidrBlock() {
        return amazonProvidedIpv6CidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock
     * 
     */
    public void setAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
    }

    public VPCCidrBlock withAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock
     * 
     */
    public CharSequence getCidrBlock() {
        return cidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock
     * 
     */
    public void setCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public VPCCidrBlock withCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid
     * 
     */
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public VPCCidrBlock withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amazonProvidedIpv6CidrBlock", amazonProvidedIpv6CidrBlock).append("cidrBlock", cidrBlock).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amazonProvidedIpv6CidrBlock).append(cidrBlock).append(vpcId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCCidrBlock) == false) {
            return false;
        }
        VPCCidrBlock rhs = ((VPCCidrBlock) other);
        return new EqualsBuilder().append(amazonProvidedIpv6CidrBlock, rhs.amazonProvidedIpv6CidrBlock).append(cidrBlock, rhs.cidrBlock).append(vpcId, rhs.vpcId).isEquals();
    }

}
