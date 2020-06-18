
package shiver.me.timbers.aws.elasticloadbalancingv2;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ListenerRuleForwardConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetGroupStickinessConfig",
    "TargetGroups"
})
public class ListenerRuleForwardConfig implements Property<ListenerRuleForwardConfig>
{

    /**
     * ListenerRuleTargetGroupStickinessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html
     * 
     */
    @JsonProperty("TargetGroupStickinessConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html")
    private Property<ListenerRuleTargetGroupStickinessConfig> targetGroupStickinessConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroups
     * 
     */
    @JsonProperty("TargetGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroups")
    private Set<Property<ListenerRuleTargetGroupTuple>> targetGroups = new LinkedHashSet<Property<ListenerRuleTargetGroupTuple>>();

    /**
     * ListenerRuleTargetGroupStickinessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleTargetGroupStickinessConfig> getTargetGroupStickinessConfig() {
        return targetGroupStickinessConfig;
    }

    /**
     * ListenerRuleTargetGroupStickinessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html
     * 
     */
    @JsonIgnore
    public void setTargetGroupStickinessConfig(Property<ListenerRuleTargetGroupStickinessConfig> targetGroupStickinessConfig) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
    }

    public ListenerRuleForwardConfig withTargetGroupStickinessConfig(Property<ListenerRuleTargetGroupStickinessConfig> targetGroupStickinessConfig) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroups
     * 
     */
    @JsonIgnore
    public Set<Property<ListenerRuleTargetGroupTuple>> getTargetGroups() {
        return targetGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroups
     * 
     */
    @JsonIgnore
    public void setTargetGroups(Set<Property<ListenerRuleTargetGroupTuple>> targetGroups) {
        this.targetGroups = targetGroups;
    }

    public ListenerRuleForwardConfig withTargetGroups(Set<Property<ListenerRuleTargetGroupTuple>> targetGroups) {
        this.targetGroups = targetGroups;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetGroupStickinessConfig", targetGroupStickinessConfig).append("targetGroups", targetGroups).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetGroups).append(targetGroupStickinessConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerRuleForwardConfig) == false) {
            return false;
        }
        ListenerRuleForwardConfig rhs = ((ListenerRuleForwardConfig) other);
        return new EqualsBuilder().append(targetGroups, rhs.targetGroups).append(targetGroupStickinessConfig, rhs.targetGroupStickinessConfig).isEquals();
    }

}
