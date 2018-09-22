
package aws.iam;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ManagedPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Groups",
    "ManagedPolicyName",
    "Path",
    "PolicyDocument",
    "Roles",
    "Users"
})
public class ManagedPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups
     * 
     */
    @JsonProperty("Groups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups")
    private Set<String> groups = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname
     * 
     */
    @JsonProperty("ManagedPolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname")
    private String managedPolicyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-ec2-dhcpoptions-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-ec2-dhcpoptions-path")
    private String path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument")
    private PolicyDocument_ policyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles
     * 
     */
    @JsonProperty("Roles")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles")
    private List<String> roles = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users
     * 
     */
    @JsonProperty("Users")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users")
    private List<String> users = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ManagedPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups
     * 
     */
    @JsonProperty("Groups")
    public Set<String> getGroups() {
        return groups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups
     * 
     */
    @JsonProperty("Groups")
    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }

    public ManagedPolicy withGroups(Set<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname
     * 
     */
    @JsonProperty("ManagedPolicyName")
    public String getManagedPolicyName() {
        return managedPolicyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname
     * 
     */
    @JsonProperty("ManagedPolicyName")
    public void setManagedPolicyName(String managedPolicyName) {
        this.managedPolicyName = managedPolicyName;
    }

    public ManagedPolicy withManagedPolicyName(String managedPolicyName) {
        this.managedPolicyName = managedPolicyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-ec2-dhcpoptions-path
     * 
     */
    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-ec2-dhcpoptions-path
     * 
     */
    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    public ManagedPolicy withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public PolicyDocument_ getPolicyDocument() {
        return policyDocument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public void setPolicyDocument(PolicyDocument_ policyDocument) {
        this.policyDocument = policyDocument;
    }

    public ManagedPolicy withPolicyDocument(PolicyDocument_ policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles
     * 
     */
    @JsonProperty("Roles")
    public List<String> getRoles() {
        return roles;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles
     * 
     */
    @JsonProperty("Roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public ManagedPolicy withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users
     * 
     */
    @JsonProperty("Users")
    public List<String> getUsers() {
        return users;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users
     * 
     */
    @JsonProperty("Users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    public ManagedPolicy withUsers(List<String> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("groups", groups).append("managedPolicyName", managedPolicyName).append("path", path).append("policyDocument", policyDocument).append("roles", roles).append("users", users).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyDocument).append(path).append(roles).append(description).append(groups).append(managedPolicyName).append(users).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManagedPolicy) == false) {
            return false;
        }
        ManagedPolicy rhs = ((ManagedPolicy) other);
        return new EqualsBuilder().append(policyDocument, rhs.policyDocument).append(path, rhs.path).append(roles, rhs.roles).append(description, rhs.description).append(groups, rhs.groups).append(managedPolicyName, rhs.managedPolicyName).append(users, rhs.users).isEquals();
    }

}
