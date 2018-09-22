
package aws.elasticbeanstalk;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationName",
    "Description",
    "EnvironmentId",
    "OptionSettings",
    "PlatformArn",
    "SolutionStackName",
    "SourceConfiguration"
})
public class ConfigurationTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname")
    private String applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid
     * 
     */
    @JsonProperty("EnvironmentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid")
    private String environmentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings
     * 
     */
    @JsonProperty("OptionSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings")
    private List<ConfigurationOptionSetting> optionSettings = new ArrayList<ConfigurationOptionSetting>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn
     * 
     */
    @JsonProperty("PlatformArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn")
    private String platformArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname
     * 
     */
    @JsonProperty("SolutionStackName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname")
    private String solutionStackName;
    /**
     * SourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html
     * 
     */
    @JsonProperty("SourceConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html")
    private SourceConfiguration sourceConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public ConfigurationTemplate withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid
     * 
     */
    @JsonProperty("EnvironmentId")
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid
     * 
     */
    @JsonProperty("EnvironmentId")
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ConfigurationTemplate withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings
     * 
     */
    @JsonProperty("OptionSettings")
    public List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings
     * 
     */
    @JsonProperty("OptionSettings")
    public void setOptionSettings(List<ConfigurationOptionSetting> optionSettings) {
        this.optionSettings = optionSettings;
    }

    public ConfigurationTemplate withOptionSettings(List<ConfigurationOptionSetting> optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn
     * 
     */
    @JsonProperty("PlatformArn")
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn
     * 
     */
    @JsonProperty("PlatformArn")
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    public ConfigurationTemplate withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname
     * 
     */
    @JsonProperty("SolutionStackName")
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname
     * 
     */
    @JsonProperty("SolutionStackName")
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    public ConfigurationTemplate withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * SourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html
     * 
     */
    @JsonProperty("SourceConfiguration")
    public SourceConfiguration getSourceConfiguration() {
        return sourceConfiguration;
    }

    /**
     * SourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html
     * 
     */
    @JsonProperty("SourceConfiguration")
    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    public ConfigurationTemplate withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("description", description).append("environmentId", environmentId).append("optionSettings", optionSettings).append("platformArn", platformArn).append("solutionStackName", solutionStackName).append("sourceConfiguration", sourceConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(environmentId).append(platformArn).append(sourceConfiguration).append(solutionStackName).append(description).append(applicationName).append(optionSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationTemplate) == false) {
            return false;
        }
        ConfigurationTemplate rhs = ((ConfigurationTemplate) other);
        return new EqualsBuilder().append(environmentId, rhs.environmentId).append(platformArn, rhs.platformArn).append(sourceConfiguration, rhs.sourceConfiguration).append(solutionStackName, rhs.solutionStackName).append(description, rhs.description).append(applicationName, rhs.applicationName).append(optionSettings, rhs.optionSettings).isEquals();
    }

}
