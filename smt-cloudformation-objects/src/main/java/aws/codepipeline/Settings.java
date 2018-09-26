
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Settings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EntityUrlTemplate",
    "ExecutionUrlTemplate",
    "RevisionUrlTemplate",
    "ThirdPartyConfigurationUrl"
})
public class Settings {

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
    public CharSequence getEntityUrlTemplate() {
        return entityUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate
     * 
     */
    public void setEntityUrlTemplate(CharSequence entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
    }

    public Settings withEntityUrlTemplate(CharSequence entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    public CharSequence getExecutionUrlTemplate() {
        return executionUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    public void setExecutionUrlTemplate(CharSequence executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
    }

    public Settings withExecutionUrlTemplate(CharSequence executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    public CharSequence getRevisionUrlTemplate() {
        return revisionUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    public void setRevisionUrlTemplate(CharSequence revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
    }

    public Settings withRevisionUrlTemplate(CharSequence revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    public CharSequence getThirdPartyConfigurationUrl() {
        return thirdPartyConfigurationUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    public void setThirdPartyConfigurationUrl(CharSequence thirdPartyConfigurationUrl) {
        this.thirdPartyConfigurationUrl = thirdPartyConfigurationUrl;
    }

    public Settings withThirdPartyConfigurationUrl(CharSequence thirdPartyConfigurationUrl) {
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
        if ((other instanceof Settings) == false) {
            return false;
        }
        Settings rhs = ((Settings) other);
        return new EqualsBuilder().append(executionUrlTemplate, rhs.executionUrlTemplate).append(thirdPartyConfigurationUrl, rhs.thirdPartyConfigurationUrl).append(entityUrlTemplate, rhs.entityUrlTemplate).append(revisionUrlTemplate, rhs.revisionUrlTemplate).isEquals();
    }

}
