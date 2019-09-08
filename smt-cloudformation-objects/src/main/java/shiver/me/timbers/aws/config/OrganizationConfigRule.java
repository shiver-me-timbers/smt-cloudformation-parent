
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
 * OrganizationConfigRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OrganizationManagedRuleMetadata",
    "OrganizationConfigRuleName",
    "OrganizationCustomRuleMetadata",
    "ExcludedAccounts"
})
public class OrganizationConfigRule {

    /**
     * OrganizationConfigRuleOrganizationManagedRuleMetadata
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html
     * 
     */
    @JsonProperty("OrganizationManagedRuleMetadata")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html")
    private Property<OrganizationConfigRuleOrganizationManagedRuleMetadata> organizationManagedRuleMetadata;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename
     * 
     */
    @JsonProperty("OrganizationConfigRuleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename")
    private CharSequence organizationConfigRuleName;
    /**
     * OrganizationConfigRuleOrganizationCustomRuleMetadata
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html
     * 
     */
    @JsonProperty("OrganizationCustomRuleMetadata")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html")
    private Property<OrganizationConfigRuleOrganizationCustomRuleMetadata> organizationCustomRuleMetadata;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts
     * 
     */
    @JsonProperty("ExcludedAccounts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts")
    private List<CharSequence> excludedAccounts = new ArrayList<CharSequence>();

    /**
     * OrganizationConfigRuleOrganizationManagedRuleMetadata
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html
     * 
     */
    @JsonIgnore
    public Property<OrganizationConfigRuleOrganizationManagedRuleMetadata> getOrganizationManagedRuleMetadata() {
        return organizationManagedRuleMetadata;
    }

    /**
     * OrganizationConfigRuleOrganizationManagedRuleMetadata
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html
     * 
     */
    @JsonIgnore
    public void setOrganizationManagedRuleMetadata(Property<OrganizationConfigRuleOrganizationManagedRuleMetadata> organizationManagedRuleMetadata) {
        this.organizationManagedRuleMetadata = organizationManagedRuleMetadata;
    }

    public OrganizationConfigRule withOrganizationManagedRuleMetadata(Property<OrganizationConfigRuleOrganizationManagedRuleMetadata> organizationManagedRuleMetadata) {
        this.organizationManagedRuleMetadata = organizationManagedRuleMetadata;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename
     * 
     */
    @JsonIgnore
    public CharSequence getOrganizationConfigRuleName() {
        return organizationConfigRuleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-organizationconfigrulename
     * 
     */
    @JsonIgnore
    public void setOrganizationConfigRuleName(CharSequence organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
    }

    public OrganizationConfigRule withOrganizationConfigRuleName(CharSequence organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
        return this;
    }

    /**
     * OrganizationConfigRuleOrganizationCustomRuleMetadata
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html
     * 
     */
    @JsonIgnore
    public Property<OrganizationConfigRuleOrganizationCustomRuleMetadata> getOrganizationCustomRuleMetadata() {
        return organizationCustomRuleMetadata;
    }

    /**
     * OrganizationConfigRuleOrganizationCustomRuleMetadata
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html
     * 
     */
    @JsonIgnore
    public void setOrganizationCustomRuleMetadata(Property<OrganizationConfigRuleOrganizationCustomRuleMetadata> organizationCustomRuleMetadata) {
        this.organizationCustomRuleMetadata = organizationCustomRuleMetadata;
    }

    public OrganizationConfigRule withOrganizationCustomRuleMetadata(Property<OrganizationConfigRuleOrganizationCustomRuleMetadata> organizationCustomRuleMetadata) {
        this.organizationCustomRuleMetadata = organizationCustomRuleMetadata;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts
     * 
     */
    @JsonIgnore
    public List<CharSequence> getExcludedAccounts() {
        return excludedAccounts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html#cfn-config-organizationconfigrule-excludedaccounts
     * 
     */
    @JsonIgnore
    public void setExcludedAccounts(List<CharSequence> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
    }

    public OrganizationConfigRule withExcludedAccounts(List<CharSequence> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("organizationManagedRuleMetadata", organizationManagedRuleMetadata).append("organizationConfigRuleName", organizationConfigRuleName).append("organizationCustomRuleMetadata", organizationCustomRuleMetadata).append("excludedAccounts", excludedAccounts).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(organizationManagedRuleMetadata).append(organizationCustomRuleMetadata).append(organizationConfigRuleName).append(excludedAccounts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationConfigRule) == false) {
            return false;
        }
        OrganizationConfigRule rhs = ((OrganizationConfigRule) other);
        return new EqualsBuilder().append(organizationManagedRuleMetadata, rhs.organizationManagedRuleMetadata).append(organizationCustomRuleMetadata, rhs.organizationCustomRuleMetadata).append(organizationConfigRuleName, rhs.organizationConfigRuleName).append(excludedAccounts, rhs.excludedAccounts).isEquals();
    }

}
