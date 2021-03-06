
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
 * AutoScalingGroupLaunchTemplateSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LaunchTemplateId",
    "LaunchTemplateName",
    "Version"
})
public class AutoScalingGroupLaunchTemplateSpecification implements Property<AutoScalingGroupLaunchTemplateSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid
     * 
     */
    @JsonProperty("LaunchTemplateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid")
    private CharSequence launchTemplateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename
     * 
     */
    @JsonProperty("LaunchTemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename")
    private CharSequence launchTemplateName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version")
    private CharSequence version;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchTemplateId() {
        return launchTemplateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateId(CharSequence launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    public AutoScalingGroupLaunchTemplateSpecification withLaunchTemplateId(CharSequence launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    public AutoScalingGroupLaunchTemplateSpecification withLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version
     * 
     */
    @JsonIgnore
    public CharSequence getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version
     * 
     */
    @JsonIgnore
    public void setVersion(CharSequence version) {
        this.version = version;
    }

    public AutoScalingGroupLaunchTemplateSpecification withVersion(CharSequence version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("launchTemplateId", launchTemplateId).append("launchTemplateName", launchTemplateName).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(launchTemplateId).append(version).append(launchTemplateName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoScalingGroupLaunchTemplateSpecification) == false) {
            return false;
        }
        AutoScalingGroupLaunchTemplateSpecification rhs = ((AutoScalingGroupLaunchTemplateSpecification) other);
        return new EqualsBuilder().append(launchTemplateId, rhs.launchTemplateId).append(version, rhs.version).append(launchTemplateName, rhs.launchTemplateName).isEquals();
    }

}
