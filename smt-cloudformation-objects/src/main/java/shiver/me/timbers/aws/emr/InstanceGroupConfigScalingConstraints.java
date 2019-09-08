
package shiver.me.timbers.aws.emr;

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
 * InstanceGroupConfigScalingConstraints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxCapacity",
    "MinCapacity"
})
public class InstanceGroupConfigScalingConstraints implements Property<InstanceGroupConfigScalingConstraints>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity")
    private Number maxCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity
     * 
     */
    @JsonProperty("MinCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity")
    private Number minCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity
     * 
     */
    @JsonIgnore
    public Number getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity
     * 
     */
    @JsonIgnore
    public void setMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public InstanceGroupConfigScalingConstraints withMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity
     * 
     */
    @JsonIgnore
    public Number getMinCapacity() {
        return minCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity
     * 
     */
    @JsonIgnore
    public void setMinCapacity(Number minCapacity) {
        this.minCapacity = minCapacity;
    }

    public InstanceGroupConfigScalingConstraints withMinCapacity(Number minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxCapacity", maxCapacity).append("minCapacity", minCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxCapacity).append(minCapacity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceGroupConfigScalingConstraints) == false) {
            return false;
        }
        InstanceGroupConfigScalingConstraints rhs = ((InstanceGroupConfigScalingConstraints) other);
        return new EqualsBuilder().append(maxCapacity, rhs.maxCapacity).append(minCapacity, rhs.minCapacity).isEquals();
    }

}
