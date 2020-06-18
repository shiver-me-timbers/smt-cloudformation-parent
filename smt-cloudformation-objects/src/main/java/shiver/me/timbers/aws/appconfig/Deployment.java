
package shiver.me.timbers.aws.appconfig;

import java.util.ArrayList;
import java.util.List;
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
 * Deployment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeploymentStrategyId",
    "ConfigurationProfileId",
    "EnvironmentId",
    "Description",
    "ConfigurationVersion",
    "ApplicationId",
    "Tags"
})
public class Deployment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid
     * 
     */
    @JsonProperty("DeploymentStrategyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid")
    private CharSequence deploymentStrategyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid
     * 
     */
    @JsonProperty("ConfigurationProfileId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid")
    private CharSequence configurationProfileId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid
     * 
     */
    @JsonProperty("EnvironmentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid")
    private CharSequence environmentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion
     * 
     */
    @JsonProperty("ConfigurationVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion")
    private CharSequence configurationVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-applicationid
     * 
     */
    @JsonProperty("ApplicationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-applicationid")
    private CharSequence applicationId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags")
    private List<Property<DeploymentTags>> tags = new ArrayList<Property<DeploymentTags>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentStrategyId() {
        return deploymentStrategyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid
     * 
     */
    @JsonIgnore
    public void setDeploymentStrategyId(CharSequence deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
    }

    public Deployment withDeploymentStrategyId(CharSequence deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationProfileId() {
        return configurationProfileId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid
     * 
     */
    @JsonIgnore
    public void setConfigurationProfileId(CharSequence configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    public Deployment withConfigurationProfileId(CharSequence configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid
     * 
     */
    @JsonIgnore
    public CharSequence getEnvironmentId() {
        return environmentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid
     * 
     */
    @JsonIgnore
    public void setEnvironmentId(CharSequence environmentId) {
        this.environmentId = environmentId;
    }

    public Deployment withEnvironmentId(CharSequence environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Deployment withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationVersion() {
        return configurationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion
     * 
     */
    @JsonIgnore
    public void setConfigurationVersion(CharSequence configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    public Deployment withConfigurationVersion(CharSequence configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-applicationid
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationId() {
        return applicationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-applicationid
     * 
     */
    @JsonIgnore
    public void setApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
    }

    public Deployment withApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags
     * 
     */
    @JsonIgnore
    public List<Property<DeploymentTags>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<DeploymentTags>> tags) {
        this.tags = tags;
    }

    public Deployment withTags(List<Property<DeploymentTags>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deploymentStrategyId", deploymentStrategyId).append("configurationProfileId", configurationProfileId).append("environmentId", environmentId).append("description", description).append("configurationVersion", configurationVersion).append("applicationId", applicationId).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(configurationVersion).append(environmentId).append(configurationProfileId).append(description).append(applicationId).append(deploymentStrategyId).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deployment) == false) {
            return false;
        }
        Deployment rhs = ((Deployment) other);
        return new EqualsBuilder().append(configurationVersion, rhs.configurationVersion).append(environmentId, rhs.environmentId).append(configurationProfileId, rhs.configurationProfileId).append(description, rhs.description).append(applicationId, rhs.applicationId).append(deploymentStrategyId, rhs.deploymentStrategyId).append(tags, rhs.tags).isEquals();
    }

}
