
package shiver.me.timbers.aws.config;

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
 * OrganizationConfigRuleOrganizationManagedRuleMetadata
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TagKeyScope",
    "TagValueScope",
    "Description",
    "ResourceIdScope",
    "RuleIdentifier",
    "ResourceTypesScope",
    "MaximumExecutionFrequency",
    "InputParameters"
})
public class OrganizationConfigRuleOrganizationManagedRuleMetadata implements Property<OrganizationConfigRuleOrganizationManagedRuleMetadata>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagkeyscope
     * 
     */
    @JsonProperty("TagKeyScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagkeyscope")
    private CharSequence tagKeyScope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagvaluescope
     * 
     */
    @JsonProperty("TagValueScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagvaluescope")
    private CharSequence tagValueScope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourceidscope
     * 
     */
    @JsonProperty("ResourceIdScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourceidscope")
    private CharSequence resourceIdScope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-ruleidentifier
     * 
     */
    @JsonProperty("RuleIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-ruleidentifier")
    private CharSequence ruleIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourcetypesscope
     * 
     */
    @JsonProperty("ResourceTypesScope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourcetypesscope")
    private List<CharSequence> resourceTypesScope = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-maximumexecutionfrequency
     * 
     */
    @JsonProperty("MaximumExecutionFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-maximumexecutionfrequency")
    private CharSequence maximumExecutionFrequency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-inputparameters
     * 
     */
    @JsonProperty("InputParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-inputparameters")
    private CharSequence inputParameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagkeyscope
     * 
     */
    @JsonIgnore
    public CharSequence getTagKeyScope() {
        return tagKeyScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagkeyscope
     * 
     */
    @JsonIgnore
    public void setTagKeyScope(CharSequence tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withTagKeyScope(CharSequence tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagvaluescope
     * 
     */
    @JsonIgnore
    public CharSequence getTagValueScope() {
        return tagValueScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-tagvaluescope
     * 
     */
    @JsonIgnore
    public void setTagValueScope(CharSequence tagValueScope) {
        this.tagValueScope = tagValueScope;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withTagValueScope(CharSequence tagValueScope) {
        this.tagValueScope = tagValueScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourceidscope
     * 
     */
    @JsonIgnore
    public CharSequence getResourceIdScope() {
        return resourceIdScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourceidscope
     * 
     */
    @JsonIgnore
    public void setResourceIdScope(CharSequence resourceIdScope) {
        this.resourceIdScope = resourceIdScope;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withResourceIdScope(CharSequence resourceIdScope) {
        this.resourceIdScope = resourceIdScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-ruleidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getRuleIdentifier() {
        return ruleIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-ruleidentifier
     * 
     */
    @JsonIgnore
    public void setRuleIdentifier(CharSequence ruleIdentifier) {
        this.ruleIdentifier = ruleIdentifier;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withRuleIdentifier(CharSequence ruleIdentifier) {
        this.ruleIdentifier = ruleIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourcetypesscope
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResourceTypesScope() {
        return resourceTypesScope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-resourcetypesscope
     * 
     */
    @JsonIgnore
    public void setResourceTypesScope(List<CharSequence> resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withResourceTypesScope(List<CharSequence> resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-maximumexecutionfrequency
     * 
     */
    @JsonIgnore
    public CharSequence getMaximumExecutionFrequency() {
        return maximumExecutionFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-maximumexecutionfrequency
     * 
     */
    @JsonIgnore
    public void setMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-inputparameters
     * 
     */
    @JsonIgnore
    public CharSequence getInputParameters() {
        return inputParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html#cfn-config-organizationconfigrule-organizationmanagedrulemetadata-inputparameters
     * 
     */
    @JsonIgnore
    public void setInputParameters(CharSequence inputParameters) {
        this.inputParameters = inputParameters;
    }

    public OrganizationConfigRuleOrganizationManagedRuleMetadata withInputParameters(CharSequence inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tagKeyScope", tagKeyScope).append("tagValueScope", tagValueScope).append("description", description).append("resourceIdScope", resourceIdScope).append("ruleIdentifier", ruleIdentifier).append("resourceTypesScope", resourceTypesScope).append("maximumExecutionFrequency", maximumExecutionFrequency).append("inputParameters", inputParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagValueScope).append(resourceIdScope).append(maximumExecutionFrequency).append(description).append(ruleIdentifier).append(resourceTypesScope).append(tagKeyScope).append(inputParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationConfigRuleOrganizationManagedRuleMetadata) == false) {
            return false;
        }
        OrganizationConfigRuleOrganizationManagedRuleMetadata rhs = ((OrganizationConfigRuleOrganizationManagedRuleMetadata) other);
        return new EqualsBuilder().append(tagValueScope, rhs.tagValueScope).append(resourceIdScope, rhs.resourceIdScope).append(maximumExecutionFrequency, rhs.maximumExecutionFrequency).append(description, rhs.description).append(ruleIdentifier, rhs.ruleIdentifier).append(resourceTypesScope, rhs.resourceTypesScope).append(tagKeyScope, rhs.tagKeyScope).append(inputParameters, rhs.inputParameters).isEquals();
    }

}
