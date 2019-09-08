
package shiver.me.timbers.aws.managedblockchain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Node
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MemberId",
    "NetworkId",
    "NodeConfiguration"
})
public class Node {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid
     * 
     */
    @JsonProperty("MemberId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid")
    private CharSequence memberId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid
     * 
     */
    @JsonProperty("NetworkId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid")
    private CharSequence networkId;
    /**
     * NodeNodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html
     * 
     */
    @JsonProperty("NodeConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html")
    private Property<NodeNodeConfiguration> nodeConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid
     * 
     */
    @JsonIgnore
    public CharSequence getMemberId() {
        return memberId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid
     * 
     */
    @JsonIgnore
    public void setMemberId(CharSequence memberId) {
        this.memberId = memberId;
    }

    public Node withMemberId(CharSequence memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid
     * 
     */
    @JsonIgnore
    public CharSequence getNetworkId() {
        return networkId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid
     * 
     */
    @JsonIgnore
    public void setNetworkId(CharSequence networkId) {
        this.networkId = networkId;
    }

    public Node withNetworkId(CharSequence networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * NodeNodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<NodeNodeConfiguration> getNodeConfiguration() {
        return nodeConfiguration;
    }

    /**
     * NodeNodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNodeConfiguration(Property<NodeNodeConfiguration> nodeConfiguration) {
        this.nodeConfiguration = nodeConfiguration;
    }

    public Node withNodeConfiguration(Property<NodeNodeConfiguration> nodeConfiguration) {
        this.nodeConfiguration = nodeConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("memberId", memberId).append("networkId", networkId).append("nodeConfiguration", nodeConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nodeConfiguration).append(networkId).append(memberId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Node) == false) {
            return false;
        }
        Node rhs = ((Node) other);
        return new EqualsBuilder().append(nodeConfiguration, rhs.nodeConfiguration).append(networkId, rhs.networkId).append(memberId, rhs.memberId).isEquals();
    }

}
