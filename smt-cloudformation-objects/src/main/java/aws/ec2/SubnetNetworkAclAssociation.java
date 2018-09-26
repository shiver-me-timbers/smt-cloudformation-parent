
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SubnetNetworkAclAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NetworkAclId",
    "SubnetId"
})
public class SubnetNetworkAclAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-networkaclid
     * 
     */
    @JsonProperty("NetworkAclId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-networkaclid")
    private CharSequence networkAclId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-associationid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-associationid")
    private CharSequence subnetId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-networkaclid
     * 
     */
    public CharSequence getNetworkAclId() {
        return networkAclId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-networkaclid
     * 
     */
    public void setNetworkAclId(CharSequence networkAclId) {
        this.networkAclId = networkAclId;
    }

    public SubnetNetworkAclAssociation withNetworkAclId(CharSequence networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-associationid
     * 
     */
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-associationid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public SubnetNetworkAclAssociation withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("networkAclId", networkAclId).append("subnetId", subnetId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(networkAclId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubnetNetworkAclAssociation) == false) {
            return false;
        }
        SubnetNetworkAclAssociation rhs = ((SubnetNetworkAclAssociation) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(networkAclId, rhs.networkAclId).isEquals();
    }

}
