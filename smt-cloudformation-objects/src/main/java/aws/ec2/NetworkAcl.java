
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
 * NetworkAcl
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Tags",
    "VpcId"
})
public class NetworkAcl {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public NetworkAcl withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html#cfn-ec2-networkacl-vpcid
     * 
     */
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public NetworkAcl withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tags", tags).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).append(vpcId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkAcl) == false) {
            return false;
        }
        NetworkAcl rhs = ((NetworkAcl) other);
        return new EqualsBuilder().append(tags, rhs.tags).append(vpcId, rhs.vpcId).isEquals();
    }

}
