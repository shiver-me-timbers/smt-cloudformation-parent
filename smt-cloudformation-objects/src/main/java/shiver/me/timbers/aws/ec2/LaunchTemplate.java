
package shiver.me.timbers.aws.ec2;

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
 * LaunchTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LaunchTemplateName",
    "LaunchTemplateData"
})
public class LaunchTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename
     * 
     */
    @JsonProperty("LaunchTemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename")
    private CharSequence launchTemplateName;
    /**
     * LaunchTemplateLaunchTemplateData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
     * 
     */
    @JsonProperty("LaunchTemplateData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html")
    private Property<LaunchTemplateLaunchTemplateData> launchTemplateData;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    public LaunchTemplate withLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * LaunchTemplateLaunchTemplateData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
     * 
     */
    @JsonIgnore
    public Property<LaunchTemplateLaunchTemplateData> getLaunchTemplateData() {
        return launchTemplateData;
    }

    /**
     * LaunchTemplateLaunchTemplateData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateData(Property<LaunchTemplateLaunchTemplateData> launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    public LaunchTemplate withLaunchTemplateData(Property<LaunchTemplateLaunchTemplateData> launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("launchTemplateName", launchTemplateName).append("launchTemplateData", launchTemplateData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(launchTemplateName).append(launchTemplateData).toHashCode();
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
        return new EqualsBuilder().append(launchTemplateName, rhs.launchTemplateName).append(launchTemplateData, rhs.launchTemplateData).isEquals();
    }

}
