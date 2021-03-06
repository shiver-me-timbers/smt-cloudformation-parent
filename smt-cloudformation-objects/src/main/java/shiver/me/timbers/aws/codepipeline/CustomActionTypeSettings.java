
package shiver.me.timbers.aws.codepipeline;

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
 * CustomActionTypeSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EntityUrlTemplate",
    "ExecutionUrlTemplate",
    "RevisionUrlTemplate",
    "ThirdPartyConfigurationUrl"
})
public class CustomActionTypeSettings implements Property<CustomActionTypeSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate
     * 
     */
    @JsonProperty("EntityUrlTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate")
    private CharSequence entityUrlTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    @JsonProperty("ExecutionUrlTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate")
    private CharSequence executionUrlTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    @JsonProperty("RevisionUrlTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate")
    private CharSequence revisionUrlTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    @JsonProperty("ThirdPartyConfigurationUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl")
    private CharSequence thirdPartyConfigurationUrl;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate
     * 
     */
    @JsonIgnore
    public CharSequence getEntityUrlTemplate() {
        return entityUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate
     * 
     */
    @JsonIgnore
    public void setEntityUrlTemplate(CharSequence entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
    }

    public CustomActionTypeSettings withEntityUrlTemplate(CharSequence entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    @JsonIgnore
    public CharSequence getExecutionUrlTemplate() {
        return executionUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    @JsonIgnore
    public void setExecutionUrlTemplate(CharSequence executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
    }

    public CustomActionTypeSettings withExecutionUrlTemplate(CharSequence executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    @JsonIgnore
    public CharSequence getRevisionUrlTemplate() {
        return revisionUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    @JsonIgnore
    public void setRevisionUrlTemplate(CharSequence revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
    }

    public CustomActionTypeSettings withRevisionUrlTemplate(CharSequence revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    @JsonIgnore
    public CharSequence getThirdPartyConfigurationUrl() {
        return thirdPartyConfigurationUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    @JsonIgnore
    public void setThirdPartyConfigurationUrl(CharSequence thirdPartyConfigurationUrl) {
        this.thirdPartyConfigurationUrl = thirdPartyConfigurationUrl;
    }

    public CustomActionTypeSettings withThirdPartyConfigurationUrl(CharSequence thirdPartyConfigurationUrl) {
        this.thirdPartyConfigurationUrl = thirdPartyConfigurationUrl;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entityUrlTemplate", entityUrlTemplate).append("executionUrlTemplate", executionUrlTemplate).append("revisionUrlTemplate", revisionUrlTemplate).append("thirdPartyConfigurationUrl", thirdPartyConfigurationUrl).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(executionUrlTemplate).append(thirdPartyConfigurationUrl).append(entityUrlTemplate).append(revisionUrlTemplate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomActionTypeSettings) == false) {
            return false;
        }
        CustomActionTypeSettings rhs = ((CustomActionTypeSettings) other);
        return new EqualsBuilder().append(executionUrlTemplate, rhs.executionUrlTemplate).append(thirdPartyConfigurationUrl, rhs.thirdPartyConfigurationUrl).append(entityUrlTemplate, rhs.entityUrlTemplate).append(revisionUrlTemplate, rhs.revisionUrlTemplate).isEquals();
    }

}
