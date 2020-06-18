
package shiver.me.timbers.aws.fms;

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
 * Policy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExcludeMap",
    "ExcludeResourceTags",
    "IncludeMap",
    "PolicyName",
    "RemediationEnabled",
    "ResourceTags",
    "ResourceType",
    "ResourceTypeList",
    "SecurityServicePolicyData",
    "DeleteAllPolicyResources",
    "Tags"
})
public class Policy {

    /**
     * PolicyIEMap
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html
     * 
     */
    @JsonProperty("ExcludeMap")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html")
    private Property<shiver.me.timbers.aws.fms.PolicyIEMap> excludeMap;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags
     * 
     */
    @JsonProperty("ExcludeResourceTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags")
    private CharSequence excludeResourceTags;
    /**
     * PolicyIEMap
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html
     * 
     */
    @JsonProperty("IncludeMap")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html")
    private Property<shiver.me.timbers.aws.fms.PolicyIEMap> includeMap;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname")
    private CharSequence policyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled
     * 
     */
    @JsonProperty("RemediationEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled")
    private CharSequence remediationEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags
     * 
     */
    @JsonProperty("ResourceTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags")
    private List<Property<PolicyResourceTag>> resourceTags = new ArrayList<Property<PolicyResourceTag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetype")
    private CharSequence resourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist
     * 
     */
    @JsonProperty("ResourceTypeList")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist")
    private List<CharSequence> resourceTypeList = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata
     * 
     */
    @JsonProperty("SecurityServicePolicyData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata")
    private Object securityServicePolicyData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources
     * 
     */
    @JsonProperty("DeleteAllPolicyResources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources")
    private CharSequence deleteAllPolicyResources;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags")
    private List<Property<PolicyPolicyTag>> tags = new ArrayList<Property<PolicyPolicyTag>>();

    /**
     * PolicyIEMap
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.fms.PolicyIEMap> getExcludeMap() {
        return excludeMap;
    }

    /**
     * PolicyIEMap
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html
     * 
     */
    @JsonIgnore
    public void setExcludeMap(Property<shiver.me.timbers.aws.fms.PolicyIEMap> excludeMap) {
        this.excludeMap = excludeMap;
    }

    public Policy withExcludeMap(Property<shiver.me.timbers.aws.fms.PolicyIEMap> excludeMap) {
        this.excludeMap = excludeMap;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags
     * 
     */
    @JsonIgnore
    public CharSequence getExcludeResourceTags() {
        return excludeResourceTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags
     * 
     */
    @JsonIgnore
    public void setExcludeResourceTags(CharSequence excludeResourceTags) {
        this.excludeResourceTags = excludeResourceTags;
    }

    public Policy withExcludeResourceTags(CharSequence excludeResourceTags) {
        this.excludeResourceTags = excludeResourceTags;
        return this;
    }

    /**
     * PolicyIEMap
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.fms.PolicyIEMap> getIncludeMap() {
        return includeMap;
    }

    /**
     * PolicyIEMap
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html
     * 
     */
    @JsonIgnore
    public void setIncludeMap(Property<shiver.me.timbers.aws.fms.PolicyIEMap> includeMap) {
        this.includeMap = includeMap;
    }

    public Policy withIncludeMap(Property<shiver.me.timbers.aws.fms.PolicyIEMap> includeMap) {
        this.includeMap = includeMap;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname
     * 
     */
    @JsonIgnore
    public void setPolicyName(CharSequence policyName) {
        this.policyName = policyName;
    }

    public Policy withPolicyName(CharSequence policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled
     * 
     */
    @JsonIgnore
    public CharSequence getRemediationEnabled() {
        return remediationEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled
     * 
     */
    @JsonIgnore
    public void setRemediationEnabled(CharSequence remediationEnabled) {
        this.remediationEnabled = remediationEnabled;
    }

    public Policy withRemediationEnabled(CharSequence remediationEnabled) {
        this.remediationEnabled = remediationEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags
     * 
     */
    @JsonIgnore
    public List<Property<PolicyResourceTag>> getResourceTags() {
        return resourceTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags
     * 
     */
    @JsonIgnore
    public void setResourceTags(List<Property<PolicyResourceTag>> resourceTags) {
        this.resourceTags = resourceTags;
    }

    public Policy withResourceTags(List<Property<PolicyResourceTag>> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetype
     * 
     */
    @JsonIgnore
    public CharSequence getResourceType() {
        return resourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetype
     * 
     */
    @JsonIgnore
    public void setResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
    }

    public Policy withResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist
     * 
     */
    @JsonIgnore
    public List<CharSequence> getResourceTypeList() {
        return resourceTypeList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist
     * 
     */
    @JsonIgnore
    public void setResourceTypeList(List<CharSequence> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
    }

    public Policy withResourceTypeList(List<CharSequence> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata
     * 
     */
    @JsonIgnore
    public Object getSecurityServicePolicyData() {
        return securityServicePolicyData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata
     * 
     */
    @JsonIgnore
    public void setSecurityServicePolicyData(Object securityServicePolicyData) {
        this.securityServicePolicyData = securityServicePolicyData;
    }

    public Policy withSecurityServicePolicyData(Object securityServicePolicyData) {
        this.securityServicePolicyData = securityServicePolicyData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources
     * 
     */
    @JsonIgnore
    public CharSequence getDeleteAllPolicyResources() {
        return deleteAllPolicyResources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources
     * 
     */
    @JsonIgnore
    public void setDeleteAllPolicyResources(CharSequence deleteAllPolicyResources) {
        this.deleteAllPolicyResources = deleteAllPolicyResources;
    }

    public Policy withDeleteAllPolicyResources(CharSequence deleteAllPolicyResources) {
        this.deleteAllPolicyResources = deleteAllPolicyResources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags
     * 
     */
    @JsonIgnore
    public List<Property<PolicyPolicyTag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<PolicyPolicyTag>> tags) {
        this.tags = tags;
    }

    public Policy withTags(List<Property<PolicyPolicyTag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("excludeMap", excludeMap).append("excludeResourceTags", excludeResourceTags).append("includeMap", includeMap).append("policyName", policyName).append("remediationEnabled", remediationEnabled).append("resourceTags", resourceTags).append("resourceType", resourceType).append("resourceTypeList", resourceTypeList).append("securityServicePolicyData", securityServicePolicyData).append("deleteAllPolicyResources", deleteAllPolicyResources).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(remediationEnabled).append(resourceTags).append(securityServicePolicyData).append(excludeResourceTags).append(policyName).append(includeMap).append(excludeMap).append(resourceTypeList).append(deleteAllPolicyResources).append(resourceType).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Policy) == false) {
            return false;
        }
        Policy rhs = ((Policy) other);
        return new EqualsBuilder().append(remediationEnabled, rhs.remediationEnabled).append(resourceTags, rhs.resourceTags).append(securityServicePolicyData, rhs.securityServicePolicyData).append(excludeResourceTags, rhs.excludeResourceTags).append(policyName, rhs.policyName).append(includeMap, rhs.includeMap).append(excludeMap, rhs.excludeMap).append(resourceTypeList, rhs.resourceTypeList).append(deleteAllPolicyResources, rhs.deleteAllPolicyResources).append(resourceType, rhs.resourceType).append(tags, rhs.tags).isEquals();
    }

}
