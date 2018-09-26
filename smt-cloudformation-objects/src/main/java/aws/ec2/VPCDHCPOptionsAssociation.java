
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPCDHCPOptionsAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DhcpOptionsId",
    "VpcId"
})
public class VPCDHCPOptionsAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid
     * 
     */
    @JsonProperty("DhcpOptionsId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid")
    private CharSequence dhcpOptionsId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid
     * 
     */
    public CharSequence getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid
     * 
     */
    public void setDhcpOptionsId(CharSequence dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    public VPCDHCPOptionsAssociation withDhcpOptionsId(CharSequence dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid
     * 
     */
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public VPCDHCPOptionsAssociation withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dhcpOptionsId", dhcpOptionsId).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dhcpOptionsId).append(vpcId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCDHCPOptionsAssociation) == false) {
            return false;
        }
        VPCDHCPOptionsAssociation rhs = ((VPCDHCPOptionsAssociation) other);
        return new EqualsBuilder().append(dhcpOptionsId, rhs.dhcpOptionsId).append(vpcId, rhs.vpcId).isEquals();
    }

}
