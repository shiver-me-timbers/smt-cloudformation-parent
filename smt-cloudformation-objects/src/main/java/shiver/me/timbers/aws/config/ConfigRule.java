
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
 * ConfigRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConfigRuleName",
    "Description",
    "InputParameters",
    "MaximumExecutionFrequency",
    "Scope",
    "Source"
})
public class ConfigRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename
     * 
     */
    @JsonProperty("ConfigRuleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename")
    private CharSequence configRuleName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters
     * 
     */
    @JsonProperty("InputParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters")
    private Object inputParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency
     * 
     */
    @JsonProperty("MaximumExecutionFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency")
    private CharSequence maximumExecutionFrequency;
    /**
     * ConfigRuleScope
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html
     * 
     */
    @JsonProperty("Scope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html")
    private Property<ConfigRuleScope> scope;
    /**
     * ConfigRuleSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html
     * 
     */
    @JsonProperty("Source")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html")
    private Property<ConfigRuleSource> source;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename
     * 
     */
    @JsonIgnore
    public CharSequence getConfigRuleName() {
        return configRuleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename
     * 
     */
    @JsonIgnore
    public void setConfigRuleName(CharSequence configRuleName) {
        this.configRuleName = configRuleName;
    }

    public ConfigRule withConfigRuleName(CharSequence configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ConfigRule withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters
     * 
     */
    @JsonIgnore
    public Object getInputParameters() {
        return inputParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters
     * 
     */
    @JsonIgnore
    public void setInputParameters(Object inputParameters) {
        this.inputParameters = inputParameters;
    }

    public ConfigRule withInputParameters(Object inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency
     * 
     */
    @JsonIgnore
    public CharSequence getMaximumExecutionFrequency() {
        return maximumExecutionFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency
     * 
     */
    @JsonIgnore
    public void setMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    public ConfigRule withMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }

    /**
     * ConfigRuleScope
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html
     * 
     */
    @JsonIgnore
    public Property<ConfigRuleScope> getScope() {
        return scope;
    }

    /**
     * ConfigRuleScope
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html
     * 
     */
    @JsonIgnore
    public void setScope(Property<ConfigRuleScope> scope) {
        this.scope = scope;
    }

    public ConfigRule withScope(Property<ConfigRuleScope> scope) {
        this.scope = scope;
        return this;
    }

    /**
     * ConfigRuleSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html
     * 
     */
    @JsonIgnore
    public Property<ConfigRuleSource> getSource() {
        return source;
    }

    /**
     * ConfigRuleSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html
     * 
     */
    @JsonIgnore
    public void setSource(Property<ConfigRuleSource> source) {
        this.source = source;
    }

    public ConfigRule withSource(Property<ConfigRuleSource> source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configRuleName", configRuleName).append("description", description).append("inputParameters", inputParameters).append("maximumExecutionFrequency", maximumExecutionFrequency).append("scope", scope).append("source", source).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(configRuleName).append(maximumExecutionFrequency).append(scope).append(description).append(source).append(inputParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigRule) == false) {
            return false;
        }
        ConfigRule rhs = ((ConfigRule) other);
        return new EqualsBuilder().append(configRuleName, rhs.configRuleName).append(maximumExecutionFrequency, rhs.maximumExecutionFrequency).append(scope, rhs.scope).append(description, rhs.description).append(source, rhs.source).append(inputParameters, rhs.inputParameters).isEquals();
    }

}
