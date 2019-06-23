
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceGroupConfigAutoScalingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Constraints",
    "Rules"
})
public class InstanceGroupConfigAutoScalingPolicy implements Property<InstanceGroupConfigAutoScalingPolicy>
{

    /**
     * InstanceGroupConfigScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html
     * 
     */
    @JsonProperty("Constraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html")
    private Property<InstanceGroupConfigScalingConstraints> constraints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules")
    private Set<Property<InstanceGroupConfigScalingRule>> rules = new LinkedHashSet<Property<InstanceGroupConfigScalingRule>>();

    /**
     * InstanceGroupConfigScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html
     * 
     */
    @JsonIgnore
    public Property<InstanceGroupConfigScalingConstraints> getConstraints() {
        return constraints;
    }

    /**
     * InstanceGroupConfigScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html
     * 
     */
    @JsonIgnore
    public void setConstraints(Property<InstanceGroupConfigScalingConstraints> constraints) {
        this.constraints = constraints;
    }

    public InstanceGroupConfigAutoScalingPolicy withConstraints(Property<InstanceGroupConfigScalingConstraints> constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules
     * 
     */
    @JsonIgnore
    public Set<Property<InstanceGroupConfigScalingRule>> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules
     * 
     */
    @JsonIgnore
    public void setRules(Set<Property<InstanceGroupConfigScalingRule>> rules) {
        this.rules = rules;
    }

    public InstanceGroupConfigAutoScalingPolicy withRules(Set<Property<InstanceGroupConfigScalingRule>> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("constraints", constraints).append("rules", rules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(constraints).append(rules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceGroupConfigAutoScalingPolicy) == false) {
            return false;
        }
        InstanceGroupConfigAutoScalingPolicy rhs = ((InstanceGroupConfigAutoScalingPolicy) other);
        return new EqualsBuilder().append(constraints, rhs.constraints).append(rules, rhs.rules).isEquals();
    }

}
