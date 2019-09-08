
package shiver.me.timbers.aws.autoscaling;

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
 * AutoScalingGroupMixedInstancesPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-group-mixedinstancespolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InstancesDistribution",
    "LaunchTemplate"
})
public class AutoScalingGroupMixedInstancesPolicy implements Property<AutoScalingGroupMixedInstancesPolicy>
{

    /**
     * AutoScalingGroupInstancesDistribution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html
     * 
     */
    @JsonProperty("InstancesDistribution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html")
    private Property<AutoScalingGroupInstancesDistribution> instancesDistribution;
    /**
     * AutoScalingGroupLaunchTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html")
    private Property<AutoScalingGroupLaunchTemplate> launchTemplate;

    /**
     * AutoScalingGroupInstancesDistribution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html
     * 
     */
    @JsonIgnore
    public Property<AutoScalingGroupInstancesDistribution> getInstancesDistribution() {
        return instancesDistribution;
    }

    /**
     * AutoScalingGroupInstancesDistribution
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html
     * 
     */
    @JsonIgnore
    public void setInstancesDistribution(Property<AutoScalingGroupInstancesDistribution> instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
    }

    public AutoScalingGroupMixedInstancesPolicy withInstancesDistribution(Property<AutoScalingGroupInstancesDistribution> instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
        return this;
    }

    /**
     * AutoScalingGroupLaunchTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
     * 
     */
    @JsonIgnore
    public Property<AutoScalingGroupLaunchTemplate> getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * AutoScalingGroupLaunchTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplate(Property<AutoScalingGroupLaunchTemplate> launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public AutoScalingGroupMixedInstancesPolicy withLaunchTemplate(Property<AutoScalingGroupLaunchTemplate> launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instancesDistribution", instancesDistribution).append("launchTemplate", launchTemplate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instancesDistribution).append(launchTemplate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoScalingGroupMixedInstancesPolicy) == false) {
            return false;
        }
        AutoScalingGroupMixedInstancesPolicy rhs = ((AutoScalingGroupMixedInstancesPolicy) other);
        return new EqualsBuilder().append(instancesDistribution, rhs.instancesDistribution).append(launchTemplate, rhs.launchTemplate).isEquals();
    }

}
