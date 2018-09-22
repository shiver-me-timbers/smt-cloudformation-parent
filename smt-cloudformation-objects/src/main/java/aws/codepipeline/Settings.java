
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
    private String entityUrlTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    @JsonProperty("ExecutionUrlTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate")
    private String executionUrlTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    @JsonProperty("RevisionUrlTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate")
    private String revisionUrlTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    @JsonProperty("ThirdPartyConfigurationUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl")
    private String thirdPartyConfigurationUrl;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate
     * 
     */
    @JsonProperty("EntityUrlTemplate")
    public String getEntityUrlTemplate() {
        return entityUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate
     * 
     */
    @JsonProperty("EntityUrlTemplate")
    public void setEntityUrlTemplate(String entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
    }

    public Settings withEntityUrlTemplate(String entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    @JsonProperty("ExecutionUrlTemplate")
    public String getExecutionUrlTemplate() {
        return executionUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate
     * 
     */
    @JsonProperty("ExecutionUrlTemplate")
    public void setExecutionUrlTemplate(String executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
    }

    public Settings withExecutionUrlTemplate(String executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    @JsonProperty("RevisionUrlTemplate")
    public String getRevisionUrlTemplate() {
        return revisionUrlTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate
     * 
     */
    @JsonProperty("RevisionUrlTemplate")
    public void setRevisionUrlTemplate(String revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
    }

    public Settings withRevisionUrlTemplate(String revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    @JsonProperty("ThirdPartyConfigurationUrl")
    public String getThirdPartyConfigurationUrl() {
        return thirdPartyConfigurationUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl
     * 
     */
    @JsonProperty("ThirdPartyConfigurationUrl")
    public void setThirdPartyConfigurationUrl(String thirdPartyConfigurationUrl) {
        this.thirdPartyConfigurationUrl = thirdPartyConfigurationUrl;
    }

    public Settings withThirdPartyConfigurationUrl(String thirdPartyConfigurationUrl) {
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
