
package shiver.me.timbers.aws.config;

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
 * RemediationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetVersion",
    "ExecutionControls",
    "Parameters",
    "TargetType",
    "ConfigRuleName",
    "ResourceType",
    "RetryAttemptSeconds",
    "MaximumAutomaticAttempts",
    "TargetId",
    "Automatic"
})
public class RemediationConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion
     * 
     */
    @JsonProperty("TargetVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion")
    private CharSequence targetVersion;
    /**
     * RemediationConfigurationExecutionControls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html
     * 
     */
    @JsonProperty("ExecutionControls")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html")
    private Property<RemediationConfigurationExecutionControls> executionControls;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters")
    private Object parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype
     * 
     */
    @JsonProperty("TargetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype")
    private CharSequence targetType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename
     * 
     */
    @JsonProperty("ConfigRuleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename")
    private CharSequence configRuleName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype")
    private CharSequence resourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-retryattemptseconds
     * 
     */
    @JsonProperty("RetryAttemptSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-retryattemptseconds")
    private Number retryAttemptSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts
     * 
     */
    @JsonProperty("MaximumAutomaticAttempts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts")
    private Number maximumAutomaticAttempts;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid
     * 
     */
    @JsonProperty("TargetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid")
    private CharSequence targetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic
     * 
     */
    @JsonProperty("Automatic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic")
    private CharSequence automatic;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion
     * 
     */
    @JsonIgnore
    public CharSequence getTargetVersion() {
        return targetVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion
     * 
     */
    @JsonIgnore
    public void setTargetVersion(CharSequence targetVersion) {
        this.targetVersion = targetVersion;
    }

    public RemediationConfiguration withTargetVersion(CharSequence targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * RemediationConfigurationExecutionControls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html
     * 
     */
    @JsonIgnore
    public Property<RemediationConfigurationExecutionControls> getExecutionControls() {
        return executionControls;
    }

    /**
     * RemediationConfigurationExecutionControls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html
     * 
     */
    @JsonIgnore
    public void setExecutionControls(Property<RemediationConfigurationExecutionControls> executionControls) {
        this.executionControls = executionControls;
    }

    public RemediationConfiguration withExecutionControls(Property<RemediationConfigurationExecutionControls> executionControls) {
        this.executionControls = executionControls;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters
     * 
     */
    @JsonIgnore
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public RemediationConfiguration withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype
     * 
     */
    @JsonIgnore
    public CharSequence getTargetType() {
        return targetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype
     * 
     */
    @JsonIgnore
    public void setTargetType(CharSequence targetType) {
        this.targetType = targetType;
    }

    public RemediationConfiguration withTargetType(CharSequence targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename
     * 
     */
    @JsonIgnore
    public CharSequence getConfigRuleName() {
        return configRuleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename
     * 
     */
    @JsonIgnore
    public void setConfigRuleName(CharSequence configRuleName) {
        this.configRuleName = configRuleName;
    }

    public RemediationConfiguration withConfigRuleName(CharSequence configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype
     * 
     */
    @JsonIgnore
    public CharSequence getResourceType() {
        return resourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype
     * 
     */
    @JsonIgnore
    public void setResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
    }

    public RemediationConfiguration withResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-retryattemptseconds
     * 
     */
    @JsonIgnore
    public Number getRetryAttemptSeconds() {
        return retryAttemptSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-retryattemptseconds
     * 
     */
    @JsonIgnore
    public void setRetryAttemptSeconds(Number retryAttemptSeconds) {
        this.retryAttemptSeconds = retryAttemptSeconds;
    }

    public RemediationConfiguration withRetryAttemptSeconds(Number retryAttemptSeconds) {
        this.retryAttemptSeconds = retryAttemptSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts
     * 
     */
    @JsonIgnore
    public Number getMaximumAutomaticAttempts() {
        return maximumAutomaticAttempts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts
     * 
     */
    @JsonIgnore
    public void setMaximumAutomaticAttempts(Number maximumAutomaticAttempts) {
        this.maximumAutomaticAttempts = maximumAutomaticAttempts;
    }

    public RemediationConfiguration withMaximumAutomaticAttempts(Number maximumAutomaticAttempts) {
        this.maximumAutomaticAttempts = maximumAutomaticAttempts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid
     * 
     */
    @JsonIgnore
    public CharSequence getTargetId() {
        return targetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid
     * 
     */
    @JsonIgnore
    public void setTargetId(CharSequence targetId) {
        this.targetId = targetId;
    }

    public RemediationConfiguration withTargetId(CharSequence targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic
     * 
     */
    @JsonIgnore
    public CharSequence getAutomatic() {
        return automatic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic
     * 
     */
    @JsonIgnore
    public void setAutomatic(CharSequence automatic) {
        this.automatic = automatic;
    }

    public RemediationConfiguration withAutomatic(CharSequence automatic) {
        this.automatic = automatic;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetVersion", targetVersion).append("executionControls", executionControls).append("parameters", parameters).append("targetType", targetType).append("configRuleName", configRuleName).append("resourceType", resourceType).append("retryAttemptSeconds", retryAttemptSeconds).append("maximumAutomaticAttempts", maximumAutomaticAttempts).append("targetId", targetId).append("automatic", automatic).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(configRuleName).append(targetId).append(executionControls).append(retryAttemptSeconds).append(automatic).append(targetType).append(parameters).append(maximumAutomaticAttempts).append(targetVersion).append(resourceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemediationConfiguration) == false) {
            return false;
        }
        RemediationConfiguration rhs = ((RemediationConfiguration) other);
        return new EqualsBuilder().append(configRuleName, rhs.configRuleName).append(targetId, rhs.targetId).append(executionControls, rhs.executionControls).append(retryAttemptSeconds, rhs.retryAttemptSeconds).append(automatic, rhs.automatic).append(targetType, rhs.targetType).append(parameters, rhs.parameters).append(maximumAutomaticAttempts, rhs.maximumAutomaticAttempts).append(targetVersion, rhs.targetVersion).append(resourceType, rhs.resourceType).isEquals();
    }

}
