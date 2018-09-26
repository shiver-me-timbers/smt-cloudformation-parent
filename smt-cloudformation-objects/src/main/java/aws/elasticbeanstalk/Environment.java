
package aws.elasticbeanstalk;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Environment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationName",
    "CNAMEPrefix",
    "Description",
    "EnvironmentName",
    "OptionSettings",
    "PlatformArn",
    "SolutionStackName",
    "Tags",
    "TemplateName",
    "Tier",
    "VersionLabel"
})
public class Environment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-applicationname")
    private CharSequence applicationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-cnameprefix
     * 
     */
    @JsonProperty("CNAMEPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-cnameprefix")
    private CharSequence cNAMEPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-name
     * 
     */
    @JsonProperty("EnvironmentName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-name")
    private CharSequence environmentName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-optionsettings
     * 
     */
    @JsonProperty("OptionSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-optionsettings")
    private List<OptionSetting> optionSettings = new ArrayList<OptionSetting>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn
     * 
     */
    @JsonProperty("PlatformArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn")
    private CharSequence platformArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-solutionstackname
     * 
     */
    @JsonProperty("SolutionStackName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-solutionstackname")
    private CharSequence solutionStackName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-elasticbeanstalk-environment-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-elasticbeanstalk-environment-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-templatename
     * 
     */
    @JsonProperty("TemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-templatename")
    private CharSequence templateName;
    /**
     * Tier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html
     * 
     */
    @JsonProperty("Tier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html")
    private Tier tier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-versionlabel
     * 
     */
    @JsonProperty("VersionLabel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-versionlabel")
    private CharSequence versionLabel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-applicationname
     * 
     */
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-applicationname
     * 
     */
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public Environment withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-cnameprefix
     * 
     */
    public CharSequence getCNAMEPrefix() {
        return cNAMEPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-cnameprefix
     * 
     */
    public void setCNAMEPrefix(CharSequence cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
    }

    public Environment withCNAMEPrefix(CharSequence cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Environment withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-name
     * 
     */
    public CharSequence getEnvironmentName() {
        return environmentName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-name
     * 
     */
    public void setEnvironmentName(CharSequence environmentName) {
        this.environmentName = environmentName;
    }

    public Environment withEnvironmentName(CharSequence environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-optionsettings
     * 
     */
    public List<OptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-optionsettings
     * 
     */
    public void setOptionSettings(List<OptionSetting> optionSettings) {
        this.optionSettings = optionSettings;
    }

    public Environment withOptionSettings(List<OptionSetting> optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn
     * 
     */
    public CharSequence getPlatformArn() {
        return platformArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn
     * 
     */
    public void setPlatformArn(CharSequence platformArn) {
        this.platformArn = platformArn;
    }

    public Environment withPlatformArn(CharSequence platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-solutionstackname
     * 
     */
    public CharSequence getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-solutionstackname
     * 
     */
    public void setSolutionStackName(CharSequence solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    public Environment withSolutionStackName(CharSequence solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-elasticbeanstalk-environment-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-elasticbeanstalk-environment-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Environment withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-templatename
     * 
     */
    public CharSequence getTemplateName() {
        return templateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-templatename
     * 
     */
    public void setTemplateName(CharSequence templateName) {
        this.templateName = templateName;
    }

    public Environment withTemplateName(CharSequence templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Tier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html
     * 
     */
    public Tier getTier() {
        return tier;
    }

    /**
     * Tier
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html
     * 
     */
    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public Environment withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-versionlabel
     * 
     */
    public CharSequence getVersionLabel() {
        return versionLabel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-versionlabel
     * 
     */
    public void setVersionLabel(CharSequence versionLabel) {
        this.versionLabel = versionLabel;
    }

    public Environment withVersionLabel(CharSequence versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("cNAMEPrefix", cNAMEPrefix).append("description", description).append("environmentName", environmentName).append("optionSettings", optionSettings).append("platformArn", platformArn).append("solutionStackName", solutionStackName).append("tags", tags).append("templateName", templateName).append("tier", tier).append("versionLabel", versionLabel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cNAMEPrefix).append(versionLabel).append(platformArn).append(tier).append(templateName).append(environmentName).append(solutionStackName).append(description).append(applicationName).append(optionSettings).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Environment) == false) {
            return false;
        }
        Environment rhs = ((Environment) other);
        return new EqualsBuilder().append(cNAMEPrefix, rhs.cNAMEPrefix).append(versionLabel, rhs.versionLabel).append(platformArn, rhs.platformArn).append(tier, rhs.tier).append(templateName, rhs.templateName).append(environmentName, rhs.environmentName).append(solutionStackName, rhs.solutionStackName).append(description, rhs.description).append(applicationName, rhs.applicationName).append(optionSettings, rhs.optionSettings).append(tags, rhs.tags).isEquals();
    }

}
