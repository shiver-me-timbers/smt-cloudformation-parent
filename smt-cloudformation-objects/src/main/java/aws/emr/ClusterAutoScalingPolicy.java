
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
 * ClusterAutoScalingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Constraints",
    "Rules"
})
public class ClusterAutoScalingPolicy implements Property<ClusterAutoScalingPolicy>
{

    /**
     * ClusterScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html
     * 
     */
    @JsonProperty("Constraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html")
    private Property<ClusterScalingConstraints> constraints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules
     * 
     */
    @JsonProperty("Rules")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules")
    private Set<Property<ClusterScalingRule>> rules = new LinkedHashSet<Property<ClusterScalingRule>>();

    /**
     * ClusterScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html
     * 
     */
    @JsonIgnore
    public Property<ClusterScalingConstraints> getConstraints() {
        return constraints;
    }

    /**
     * ClusterScalingConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html
     * 
     */
    @JsonIgnore
    public void setConstraints(Property<ClusterScalingConstraints> constraints) {
        this.constraints = constraints;
    }

    public ClusterAutoScalingPolicy withConstraints(Property<ClusterScalingConstraints> constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterScalingRule>> getRules() {
        return rules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules
     * 
     */
    @JsonIgnore
    public void setRules(Set<Property<ClusterScalingRule>> rules) {
        this.rules = rules;
    }

    public ClusterAutoScalingPolicy withRules(Set<Property<ClusterScalingRule>> rules) {
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
        if ((other instanceof ClusterAutoScalingPolicy) == false) {
            return false;
        }
        ClusterAutoScalingPolicy rhs = ((ClusterAutoScalingPolicy) other);
        return new EqualsBuilder().append(constraints, rhs.constraints).append(rules, rhs.rules).isEquals();
    }

}
