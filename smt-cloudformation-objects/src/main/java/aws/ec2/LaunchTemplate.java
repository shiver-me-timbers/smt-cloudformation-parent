
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LaunchTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
     * LaunchTemplateData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
     * 
     */
    @JsonProperty("LaunchTemplateData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html")
    private LaunchTemplateData launchTemplateData;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename
     * 
     */
    public CharSequence getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename
     * 
     */
    public void setLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    public LaunchTemplate withLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * LaunchTemplateData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
     * 
     */
    public LaunchTemplateData getLaunchTemplateData() {
        return launchTemplateData;
    }

    /**
     * LaunchTemplateData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
     * 
     */
    public void setLaunchTemplateData(LaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    public LaunchTemplate withLaunchTemplateData(LaunchTemplateData launchTemplateData) {
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
