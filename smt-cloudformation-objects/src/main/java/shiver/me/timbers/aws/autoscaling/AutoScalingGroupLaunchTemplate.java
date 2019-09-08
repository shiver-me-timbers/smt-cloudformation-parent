
package shiver.me.timbers.aws.autoscaling;

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
 * AutoScalingGroupLaunchTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LaunchTemplateSpecification",
    "Overrides"
})
public class AutoScalingGroupLaunchTemplate implements Property<AutoScalingGroupLaunchTemplate>
{

    /**
     * AutoScalingGroupLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplateSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html")
    private Property<AutoScalingGroupLaunchTemplateSpecification> launchTemplateSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides
     * 
     */
    @JsonProperty("Overrides")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides")
    private Set<Property<AutoScalingGroupLaunchTemplateOverrides>> overrides = new LinkedHashSet<Property<AutoScalingGroupLaunchTemplateOverrides>>();

    /**
     * AutoScalingGroupLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public Property<AutoScalingGroupLaunchTemplateSpecification> getLaunchTemplateSpecification() {
        return launchTemplateSpecification;
    }

    /**
     * AutoScalingGroupLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateSpecification(Property<AutoScalingGroupLaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    public AutoScalingGroupLaunchTemplate withLaunchTemplateSpecification(Property<AutoScalingGroupLaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides
     * 
     */
    @JsonIgnore
    public Set<Property<AutoScalingGroupLaunchTemplateOverrides>> getOverrides() {
        return overrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides
     * 
     */
    @JsonIgnore
    public void setOverrides(Set<Property<AutoScalingGroupLaunchTemplateOverrides>> overrides) {
        this.overrides = overrides;
    }

    public AutoScalingGroupLaunchTemplate withOverrides(Set<Property<AutoScalingGroupLaunchTemplateOverrides>> overrides) {
        this.overrides = overrides;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("launchTemplateSpecification", launchTemplateSpecification).append("overrides", overrides).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(launchTemplateSpecification).append(overrides).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoScalingGroupLaunchTemplate) == false) {
            return false;
        }
        AutoScalingGroupLaunchTemplate rhs = ((AutoScalingGroupLaunchTemplate) other);
        return new EqualsBuilder().append(launchTemplateSpecification, rhs.launchTemplateSpecification).append(overrides, rhs.overrides).isEquals();
    }

}
