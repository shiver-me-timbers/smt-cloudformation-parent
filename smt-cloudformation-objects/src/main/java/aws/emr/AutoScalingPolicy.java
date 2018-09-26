
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AutoScalingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Constraints",
    "Rules"
})
public class AutoScalingPolicy {

    /**
     * ScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html
     * 
     */
    @JsonProperty("Constraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html")
    private ScalingConstraints constraints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules")
    private Set<ScalingRule> rules = new LinkedHashSet<ScalingRule>();

    /**
     * ScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html
     * 
     */
    public ScalingConstraints getConstraints() {
        return constraints;
    }

    /**
     * ScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html
     * 
     */
    public void setConstraints(ScalingConstraints constraints) {
        this.constraints = constraints;
    }

    public AutoScalingPolicy withConstraints(ScalingConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules
     * 
     */
    public Set<ScalingRule> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules
     * 
     */
    public void setRules(Set<ScalingRule> rules) {
        this.rules = rules;
    }

    public AutoScalingPolicy withRules(Set<ScalingRule> rules) {
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
        if ((other instanceof AutoScalingPolicy) == false) {
            return false;
        }
        AutoScalingPolicy rhs = ((AutoScalingPolicy) other);
        return new EqualsBuilder().append(constraints, rhs.constraints).append(rules, rhs.rules).isEquals();
    }

}
