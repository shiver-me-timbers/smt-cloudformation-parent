
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPC
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CidrBlock",
    "EnableDnsHostnames",
    "EnableDnsSupport",
    "InstanceTenancy",
    "Tags"
})
public class VPC {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-cidrblock
     * 
     */
    @JsonProperty("CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-cidrblock")
    private CharSequence cidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsHostnames
     * 
     */
    @JsonProperty("EnableDnsHostnames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsHostnames")
    private Boolean enableDnsHostnames;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsSupport
     * 
     */
    @JsonProperty("EnableDnsSupport")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsSupport")
    private Boolean enableDnsSupport;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-instancetenancy
     * 
     */
    @JsonProperty("InstanceTenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-instancetenancy")
    private CharSequence instanceTenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-cidrblock
     * 
     */
    public CharSequence getCidrBlock() {
        return cidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-cidrblock
     * 
     */
    public void setCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public VPC withCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsHostnames
     * 
     */
    public Boolean getEnableDnsHostnames() {
        return enableDnsHostnames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsHostnames
     * 
     */
    public void setEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }

    public VPC withEnableDnsHostnames(Boolean enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsSupport
     * 
     */
    public Boolean getEnableDnsSupport() {
        return enableDnsSupport;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsSupport
     * 
     */
    public void setEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }

    public VPC withEnableDnsSupport(Boolean enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-instancetenancy
     * 
     */
    public CharSequence getInstanceTenancy() {
        return instanceTenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-instancetenancy
     * 
     */
    public void setInstanceTenancy(CharSequence instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    public VPC withInstanceTenancy(CharSequence instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VPC withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidrBlock", cidrBlock).append("enableDnsHostnames", enableDnsHostnames).append("enableDnsSupport", enableDnsSupport).append("instanceTenancy", instanceTenancy).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instanceTenancy).append(enableDnsHostnames).append(cidrBlock).append(enableDnsSupport).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPC) == false) {
            return false;
        }
        VPC rhs = ((VPC) other);
        return new EqualsBuilder().append(instanceTenancy, rhs.instanceTenancy).append(enableDnsHostnames, rhs.enableDnsHostnames).append(cidrBlock, rhs.cidrBlock).append(enableDnsSupport, rhs.enableDnsSupport).append(tags, rhs.tags).isEquals();
    }

}
