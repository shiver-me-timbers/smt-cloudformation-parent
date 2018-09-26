
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
 * NatGateway
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllocationId",
    "SubnetId",
    "Tags"
})
public class NatGateway {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid
     * 
     */
    @JsonProperty("AllocationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid")
    private CharSequence allocationId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid")
    private CharSequence subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid
     * 
     */
    public CharSequence getAllocationId() {
        return allocationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid
     * 
     */
    public void setAllocationId(CharSequence allocationId) {
        this.allocationId = allocationId;
    }

    public NatGateway withAllocationId(CharSequence allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid
     * 
     */
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public NatGateway withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public NatGateway withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allocationId", allocationId).append("subnetId", subnetId).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(allocationId).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NatGateway) == false) {
            return false;
        }
        NatGateway rhs = ((NatGateway) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(allocationId, rhs.allocationId).append(tags, rhs.tags).isEquals();
    }

}
