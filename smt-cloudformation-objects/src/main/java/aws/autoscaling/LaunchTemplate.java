
package aws.autoscaling;

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
 * LaunchTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LaunchTemplateSpecification",
    "Overrides"
})
public class LaunchTemplate implements Property<LaunchTemplate>
{

    /**
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplateSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html")
    private Property<LaunchTemplateSpecification> launchTemplateSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides
     * 
     */
    @JsonProperty("Overrides")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides")
    private Set<Property<LaunchTemplateOverrides>> overrides = new LinkedHashSet<Property<LaunchTemplateOverrides>>();

    /**
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public Property<LaunchTemplateSpecification> getLaunchTemplateSpecification() {
        return launchTemplateSpecification;
    }

    /**
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateSpecification(Property<LaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    public LaunchTemplate withLaunchTemplateSpecification(Property<LaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides
     * 
     */
    @JsonIgnore
    public Set<Property<LaunchTemplateOverrides>> getOverrides() {
        return overrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-launchtemplate.html#cfn-as-mixedinstancespolicy-overrides
     * 
     */
    @JsonIgnore
    public void setOverrides(Set<Property<LaunchTemplateOverrides>> overrides) {
        this.overrides = overrides;
    }

    public LaunchTemplate withOverrides(Set<Property<LaunchTemplateOverrides>> overrides) {
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
        if ((other instanceof LaunchTemplate) == false) {
            return false;
        }
        LaunchTemplate rhs = ((LaunchTemplate) other);
        return new EqualsBuilder().append(launchTemplateSpecification, rhs.launchTemplateSpecification).append(overrides, rhs.overrides).isEquals();
    }

}
