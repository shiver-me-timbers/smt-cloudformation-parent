
package aws.config;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * OrganizationConfigRuleOrganizationCustomRuleMetadata
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TagKeyScope",
    "TagValueScope",
    "Description",
    "ResourceIdScope",
    "LambdaFunctionArn",
    "OrganizationConfigRuleTriggerTypes",
    "ResourceTypesScope",
    "MaximumExecutionFrequency",
    "InputParameters"
})
public class OrganizationConfigRuleOrganizationCustomRuleMetadata implements Property<OrganizationConfigRuleOrganizationCustomRuleMetadata>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagkeyscope
     * 
     */
    @JsonProperty("TagKeyScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagkeyscope")
    private CharSequence tagKeyScope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagvaluescope
     * 
     */
    @JsonProperty("TagValueScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagvaluescope")
    private CharSequence tagValueScope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourceidscope
     * 
     */
    @JsonProperty("ResourceIdScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourceidscope")
    private CharSequence resourceIdScope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-lambdafunctionarn
     * 
     */
    @JsonProperty("LambdaFunctionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-lambdafunctionarn")
    private CharSequence lambdaFunctionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-organizationconfigruletriggertypes
     * 
     */
    @JsonProperty("OrganizationConfigRuleTriggerTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-organizationconfigruletriggertypes")
    private List<CharSequence> organizationConfigRuleTriggerTypes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourcetypesscope
     * 
     */
    @JsonProperty("ResourceTypesScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourcetypesscope")
    private List<CharSequence> resourceTypesScope = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-maximumexecutionfrequency
     * 
     */
    @JsonProperty("MaximumExecutionFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-maximumexecutionfrequency")
    private CharSequence maximumExecutionFrequency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-inputparameters
     * 
     */
    @JsonProperty("InputParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-inputparameters")
    private CharSequence inputParameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagkeyscope
     * 
     */
    @JsonIgnore
    public CharSequence getTagKeyScope() {
        return tagKeyScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagkeyscope
     * 
     */
    @JsonIgnore
    public void setTagKeyScope(CharSequence tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withTagKeyScope(CharSequence tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagvaluescope
     * 
     */
    @JsonIgnore
    public CharSequence getTagValueScope() {
        return tagValueScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-tagvaluescope
     * 
     */
    @JsonIgnore
    public void setTagValueScope(CharSequence tagValueScope) {
        this.tagValueScope = tagValueScope;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withTagValueScope(CharSequence tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourceidscope
     * 
     */
    @JsonIgnore
    public CharSequence getResourceIdScope() {
        return resourceIdScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourceidscope
     * 
     */
    @JsonIgnore
    public void setResourceIdScope(CharSequence resourceIdScope) {
        this.resourceIdScope = resourceIdScope;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withResourceIdScope(CharSequence resourceIdScope) {
        this.resourceIdScope = resourceIdScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-lambdafunctionarn
     * 
     */
    @JsonIgnore
    public CharSequence getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-lambdafunctionarn
     * 
     */
    @JsonIgnore
    public void setLambdaFunctionArn(CharSequence lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withLambdaFunctionArn(CharSequence lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-organizationconfigruletriggertypes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getOrganizationConfigRuleTriggerTypes() {
        return organizationConfigRuleTriggerTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-organizationconfigruletriggertypes
     * 
     */
    @JsonIgnore
    public void setOrganizationConfigRuleTriggerTypes(List<CharSequence> organizationConfigRuleTriggerTypes) {
        this.organizationConfigRuleTriggerTypes = organizationConfigRuleTriggerTypes;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withOrganizationConfigRuleTriggerTypes(List<CharSequence> organizationConfigRuleTriggerTypes) {
        this.organizationConfigRuleTriggerTypes = organizationConfigRuleTriggerTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourcetypesscope
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResourceTypesScope() {
        return resourceTypesScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-resourcetypesscope
     * 
     */
    @JsonIgnore
    public void setResourceTypesScope(List<CharSequence> resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withResourceTypesScope(List<CharSequence> resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-maximumexecutionfrequency
     * 
     */
    @JsonIgnore
    public CharSequence getMaximumExecutionFrequency() {
        return maximumExecutionFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-maximumexecutionfrequency
     * 
     */
    @JsonIgnore
    public void setMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-inputparameters
     * 
     */
    @JsonIgnore
    public CharSequence getInputParameters() {
        return inputParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html#cfn-config-organizationconfigrule-organizationcustomrulemetadata-inputparameters
     * 
     */
    @JsonIgnore
    public void setInputParameters(CharSequence inputParameters) {
        this.inputParameters = inputParameters;
    }

    public OrganizationConfigRuleOrganizationCustomRuleMetadata withInputParameters(CharSequence inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tagKeyScope", tagKeyScope).append("tagValueScope", tagValueScope).append("description", description).append("resourceIdScope", resourceIdScope).append("lambdaFunctionArn", lambdaFunctionArn).append("organizationConfigRuleTriggerTypes", organizationConfigRuleTriggerTypes).append("resourceTypesScope", resourceTypesScope).append("maximumExecutionFrequency", maximumExecutionFrequency).append("inputParameters", inputParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(organizationConfigRuleTriggerTypes).append(tagValueScope).append(resourceIdScope).append(maximumExecutionFrequency).append(description).append(resourceTypesScope).append(tagKeyScope).append(lambdaFunctionArn).append(inputParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationConfigRuleOrganizationCustomRuleMetadata) == false) {
            return false;
        }
        OrganizationConfigRuleOrganizationCustomRuleMetadata rhs = ((OrganizationConfigRuleOrganizationCustomRuleMetadata) other);
        return new EqualsBuilder().append(organizationConfigRuleTriggerTypes, rhs.organizationConfigRuleTriggerTypes).append(tagValueScope, rhs.tagValueScope).append(resourceIdScope, rhs.resourceIdScope).append(maximumExecutionFrequency, rhs.maximumExecutionFrequency).append(description, rhs.description).append(resourceTypesScope, rhs.resourceTypesScope).append(tagKeyScope, rhs.tagKeyScope).append(lambdaFunctionArn, rhs.lambdaFunctionArn).append(inputParameters, rhs.inputParameters).isEquals();
    }

}
