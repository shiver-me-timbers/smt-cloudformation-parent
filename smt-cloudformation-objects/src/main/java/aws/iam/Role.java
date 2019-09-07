
package aws.iam;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Role
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AssumeRolePolicyDocument",
    "Description",
    "ManagedPolicyArns",
    "MaxSessionDuration",
    "Path",
    "PermissionsBoundary",
    "Policies",
    "RoleName",
    "Tags"
})
public class Role {

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonProperty("AssumeRolePolicyDocument")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html")
    private Property<PolicyDocument> assumeRolePolicyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managepolicyarns
     * 
     */
    @JsonProperty("ManagedPolicyArns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managepolicyarns")
    private Set<CharSequence> managedPolicyArns = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration
     * 
     */
    @JsonProperty("MaxSessionDuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration")
    private Number maxSessionDuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path")
    private CharSequence path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary
     * 
     */
    @JsonProperty("PermissionsBoundary")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary")
    private CharSequence permissionsBoundary;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies
     * 
     */
    @JsonProperty("Policies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies")
    private List<Property<RolePolicy>> policies = new ArrayList<Property<RolePolicy>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename
     * 
     */
    @JsonProperty("RoleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename")
    private CharSequence roleName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public Property<PolicyDocument> getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public void setAssumeRolePolicyDocument(Property<PolicyDocument> assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    public Role withAssumeRolePolicyDocument(Property<PolicyDocument> assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Role withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managepolicyarns
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getManagedPolicyArns() {
        return managedPolicyArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managepolicyarns
     * 
     */
    @JsonIgnore
    public void setManagedPolicyArns(Set<CharSequence> managedPolicyArns) {
        this.managedPolicyArns = managedPolicyArns;
    }

    public Role withManagedPolicyArns(Set<CharSequence> managedPolicyArns) {
        this.managedPolicyArns = managedPolicyArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration
     * 
     */
    @JsonIgnore
    public Number getMaxSessionDuration() {
        return maxSessionDuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration
     * 
     */
    @JsonIgnore
    public void setMaxSessionDuration(Number maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    public Role withMaxSessionDuration(Number maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path
     * 
     */
    @JsonIgnore
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path
     * 
     */
    @JsonIgnore
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public Role withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary
     * 
     */
    @JsonIgnore
    public CharSequence getPermissionsBoundary() {
        return permissionsBoundary;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary
     * 
     */
    @JsonIgnore
    public void setPermissionsBoundary(CharSequence permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    public Role withPermissionsBoundary(CharSequence permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies
     * 
     */
    @JsonIgnore
    public List<Property<RolePolicy>> getPolicies() {
        return policies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies
     * 
     */
    @JsonIgnore
    public void setPolicies(List<Property<RolePolicy>> policies) {
        this.policies = policies;
    }

    public Role withPolicies(List<Property<RolePolicy>> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename
     * 
     */
    @JsonIgnore
    public CharSequence getRoleName() {
        return roleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename
     * 
     */
    @JsonIgnore
    public void setRoleName(CharSequence roleName) {
        this.roleName = roleName;
    }

    public Role withRoleName(CharSequence roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Role withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("assumeRolePolicyDocument", assumeRolePolicyDocument).append("description", description).append("managedPolicyArns", managedPolicyArns).append("maxSessionDuration", maxSessionDuration).append("path", path).append("permissionsBoundary", permissionsBoundary).append("policies", policies).append("roleName", roleName).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(permissionsBoundary).append(assumeRolePolicyDocument).append(managedPolicyArns).append(maxSessionDuration).append(policies).append(roleName).append(description).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Role) == false) {
            return false;
        }
        Role rhs = ((Role) other);
        return new EqualsBuilder().append(path, rhs.path).append(permissionsBoundary, rhs.permissionsBoundary).append(assumeRolePolicyDocument, rhs.assumeRolePolicyDocument).append(managedPolicyArns, rhs.managedPolicyArns).append(maxSessionDuration, rhs.maxSessionDuration).append(policies, rhs.policies).append(roleName, rhs.roleName).append(description, rhs.description).append(tags, rhs.tags).isEquals();
    }

}
