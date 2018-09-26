
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SubnetCidrBlock
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ipv6CidrBlock",
    "SubnetId"
})
public class SubnetCidrBlock {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock
     * 
     */
    @JsonProperty("Ipv6CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock")
    private CharSequence ipv6CidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid")
    private CharSequence subnetId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock
     * 
     */
    public CharSequence getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock
     * 
     */
    public void setIpv6CidrBlock(CharSequence ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    public SubnetCidrBlock withIpv6CidrBlock(CharSequence ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid
     * 
     */
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public SubnetCidrBlock withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ipv6CidrBlock", ipv6CidrBlock).append("subnetId", subnetId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(ipv6CidrBlock).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubnetCidrBlock) == false) {
            return false;
        }
        SubnetCidrBlock rhs = ((SubnetCidrBlock) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(ipv6CidrBlock, rhs.ipv6CidrBlock).isEquals();
    }

}
