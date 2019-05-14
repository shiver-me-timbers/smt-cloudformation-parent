
package aws.batch;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NodeProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MainNode",
    "NodeRangeProperties",
    "NumNodes"
})
public class NodeProperties implements Property<NodeProperties>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-mainnode
     * 
     */
    @JsonProperty("MainNode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-mainnode")
    private Integer mainNode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-noderangeproperties
     * 
     */
    @JsonProperty("NodeRangeProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-noderangeproperties")
    private List<Property<NodeRangeProperty>> nodeRangeProperties = new ArrayList<Property<NodeRangeProperty>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-numnodes
     * 
     */
    @JsonProperty("NumNodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-numnodes")
    private Integer numNodes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-mainnode
     * 
     */
    @JsonIgnore
    public Integer getMainNode() {
        return mainNode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-mainnode
     * 
     */
    @JsonIgnore
    public void setMainNode(Integer mainNode) {
        this.mainNode = mainNode;
    }

    public NodeProperties withMainNode(Integer mainNode) {
        this.mainNode = mainNode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-noderangeproperties
     * 
     */
    @JsonIgnore
    public List<Property<NodeRangeProperty>> getNodeRangeProperties() {
        return nodeRangeProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-noderangeproperties
     * 
     */
    @JsonIgnore
    public void setNodeRangeProperties(List<Property<NodeRangeProperty>> nodeRangeProperties) {
        this.nodeRangeProperties = nodeRangeProperties;
    }

    public NodeProperties withNodeRangeProperties(List<Property<NodeRangeProperty>> nodeRangeProperties) {
        this.nodeRangeProperties = nodeRangeProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-numnodes
     * 
     */
    @JsonIgnore
    public Integer getNumNodes() {
        return numNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html#cfn-batch-jobdefinition-nodeproperties-numnodes
     * 
     */
    @JsonIgnore
    public void setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
    }

    public NodeProperties withNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mainNode", mainNode).append("nodeRangeProperties", nodeRangeProperties).append("numNodes", numNodes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nodeRangeProperties).append(numNodes).append(mainNode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeProperties) == false) {
            return false;
        }
        NodeProperties rhs = ((NodeProperties) other);
        return new EqualsBuilder().append(nodeRangeProperties, rhs.nodeRangeProperties).append(numNodes, rhs.numNodes).append(mainNode, rhs.mainNode).isEquals();
    }

}
