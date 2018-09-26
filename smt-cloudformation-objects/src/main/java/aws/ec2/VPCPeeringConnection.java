
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
 * VPCPeeringConnection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PeerOwnerId",
    "PeerRegion",
    "PeerRoleArn",
    "PeerVpcId",
    "Tags",
    "VpcId"
})
public class VPCPeeringConnection {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid
     * 
     */
    @JsonProperty("PeerOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid")
    private CharSequence peerOwnerId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion
     * 
     */
    @JsonProperty("PeerRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion")
    private CharSequence peerRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn
     * 
     */
    @JsonProperty("PeerRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn")
    private CharSequence peerRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid
     * 
     */
    @JsonProperty("PeerVpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid")
    private CharSequence peerVpcId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid
     * 
     */
    public CharSequence getPeerOwnerId() {
        return peerOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid
     * 
     */
    public void setPeerOwnerId(CharSequence peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
    }

    public VPCPeeringConnection withPeerOwnerId(CharSequence peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion
     * 
     */
    public CharSequence getPeerRegion() {
        return peerRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion
     * 
     */
    public void setPeerRegion(CharSequence peerRegion) {
        this.peerRegion = peerRegion;
    }

    public VPCPeeringConnection withPeerRegion(CharSequence peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn
     * 
     */
    public CharSequence getPeerRoleArn() {
        return peerRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn
     * 
     */
    public void setPeerRoleArn(CharSequence peerRoleArn) {
        this.peerRoleArn = peerRoleArn;
    }

    public VPCPeeringConnection withPeerRoleArn(CharSequence peerRoleArn) {
        this.peerRoleArn = peerRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid
     * 
     */
    public CharSequence getPeerVpcId() {
        return peerVpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid
     * 
     */
    public void setPeerVpcId(CharSequence peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    public VPCPeeringConnection withPeerVpcId(CharSequence peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VPCPeeringConnection withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid
     * 
     */
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public VPCPeeringConnection withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("peerOwnerId", peerOwnerId).append("peerRegion", peerRegion).append("peerRoleArn", peerRoleArn).append("peerVpcId", peerVpcId).append("tags", tags).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(peerRoleArn).append(peerOwnerId).append(peerVpcId).append(vpcId).append(peerRegion).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCPeeringConnection) == false) {
            return false;
        }
        VPCPeeringConnection rhs = ((VPCPeeringConnection) other);
        return new EqualsBuilder().append(peerRoleArn, rhs.peerRoleArn).append(peerOwnerId, rhs.peerOwnerId).append(peerVpcId, rhs.peerVpcId).append(vpcId, rhs.vpcId).append(peerRegion, rhs.peerRegion).append(tags, rhs.tags).isEquals();
    }

}
