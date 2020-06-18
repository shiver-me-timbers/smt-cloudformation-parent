
package shiver.me.timbers.aws.eks;

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
 * NodegroupScalingConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MinSize",
    "DesiredSize",
    "MaxSize"
})
public class NodegroupScalingConfig implements Property<NodegroupScalingConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-minsize
     * 
     */
    @JsonProperty("MinSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-minsize")
    private Number minSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-desiredsize
     * 
     */
    @JsonProperty("DesiredSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-desiredsize")
    private Number desiredSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-maxsize")
    private Number maxSize;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-minsize
     * 
     */
    @JsonIgnore
    public Number getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-minsize
     * 
     */
    @JsonIgnore
    public void setMinSize(Number minSize) {
        this.minSize = minSize;
    }

    public NodegroupScalingConfig withMinSize(Number minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-desiredsize
     * 
     */
    @JsonIgnore
    public Number getDesiredSize() {
        return desiredSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-desiredsize
     * 
     */
    @JsonIgnore
    public void setDesiredSize(Number desiredSize) {
        this.desiredSize = desiredSize;
    }

    public NodegroupScalingConfig withDesiredSize(Number desiredSize) {
        this.desiredSize = desiredSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-maxsize
     * 
     */
    @JsonIgnore
    public Number getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-maxsize
     * 
     */
    @JsonIgnore
    public void setMaxSize(Number maxSize) {
        this.maxSize = maxSize;
    }

    public NodegroupScalingConfig withMaxSize(Number maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minSize", minSize).append("desiredSize", desiredSize).append("maxSize", maxSize).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minSize).append(desiredSize).append(maxSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodegroupScalingConfig) == false) {
            return false;
        }
        NodegroupScalingConfig rhs = ((NodegroupScalingConfig) other);
        return new EqualsBuilder().append(minSize, rhs.minSize).append(desiredSize, rhs.desiredSize).append(maxSize, rhs.maxSize).isEquals();
    }

}
