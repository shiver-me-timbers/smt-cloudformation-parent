
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
 * ListenerForwardConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetGroupStickinessConfig",
    "TargetGroups"
})
public class ListenerForwardConfig implements Property<ListenerForwardConfig>
{

    /**
     * ListenerRuleTargetGroupStickinessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html
     * 
     */
    @JsonProperty("TargetGroupStickinessConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html")
    private Property<ListenerTargetGroupStickinessConfig> targetGroupStickinessConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroups
     * 
     */
    @JsonProperty("TargetGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroups")
    private Set<Property<ListenerTargetGroupTuple>> targetGroups = new LinkedHashSet<Property<ListenerTargetGroupTuple>>();

    /**
     * ListenerRuleTargetGroupStickinessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerTargetGroupStickinessConfig> getTargetGroupStickinessConfig() {
        return targetGroupStickinessConfig;
    }

    /**
     * ListenerRuleTargetGroupStickinessConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html
     * 
     */
    @JsonIgnore
    public void setTargetGroupStickinessConfig(Property<ListenerTargetGroupStickinessConfig> targetGroupStickinessConfig) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
    }

    public ListenerForwardConfig withTargetGroupStickinessConfig(Property<ListenerTargetGroupStickinessConfig> targetGroupStickinessConfig) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroups
     * 
     */
    @JsonIgnore
    public Set<Property<ListenerTargetGroupTuple>> getTargetGroups() {
        return targetGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroups
     * 
     */
    @JsonIgnore
    public void setTargetGroups(Set<Property<ListenerTargetGroupTuple>> targetGroups) {
        this.targetGroups = targetGroups;
    }

    public ListenerForwardConfig withTargetGroups(Set<Property<ListenerTargetGroupTuple>> targetGroups) {
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
        if ((other instanceof ListenerForwardConfig) == false) {
            return false;
        }
        ListenerForwardConfig rhs = ((ListenerForwardConfig) other);
        return new EqualsBuilder().append(targetGroups, rhs.targetGroups).append(targetGroupStickinessConfig, rhs.targetGroupStickinessConfig).isEquals();
    }

}
