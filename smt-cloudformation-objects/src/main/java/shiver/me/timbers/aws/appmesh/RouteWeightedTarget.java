
package shiver.me.timbers.aws.appmesh;

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
 * RouteWeightedTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VirtualNode",
    "Weight"
})
public class RouteWeightedTarget implements Property<RouteWeightedTarget>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode
     * 
     */
    @JsonProperty("VirtualNode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode")
    private CharSequence virtualNode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight
     * 
     */
    @JsonProperty("Weight")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight")
    private Number weight;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualNode() {
        return virtualNode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode
     * 
     */
    @JsonIgnore
    public void setVirtualNode(CharSequence virtualNode) {
        this.virtualNode = virtualNode;
    }

    public RouteWeightedTarget withVirtualNode(CharSequence virtualNode) {
        this.virtualNode = virtualNode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight
     * 
     */
    @JsonIgnore
    public Number getWeight() {
        return weight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight
     * 
     */
    @JsonIgnore
    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public RouteWeightedTarget withWeight(Number weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("virtualNode", virtualNode).append("weight", weight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualNode).append(weight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteWeightedTarget) == false) {
            return false;
        }
        RouteWeightedTarget rhs = ((RouteWeightedTarget) other);
        return new EqualsBuilder().append(virtualNode, rhs.virtualNode).append(weight, rhs.weight).isEquals();
    }

}
