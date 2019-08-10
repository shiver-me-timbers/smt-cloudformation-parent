
package aws.iam;

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
 * Policy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Groups",
    "PolicyDocument",
    "PolicyName",
    "Roles",
    "Users"
})
public class Policy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups
     * 
     */
    @JsonProperty("Groups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups")
    private List<CharSequence> groups = new ArrayList<CharSequence>();
    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html")
    private Property<PolicyDocument> policyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname")
    private CharSequence policyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles
     * 
     */
    @JsonProperty("Roles")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles")
    private List<CharSequence> roles = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users
     * 
     */
    @JsonProperty("Users")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users")
    private List<CharSequence> users = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getGroups() {
        return groups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups
     * 
     */
    @JsonIgnore
    public void setGroups(List<CharSequence> groups) {
        this.groups = groups;
    }

    public Policy withGroups(List<CharSequence> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public Property<PolicyDocument> getPolicyDocument() {
        return policyDocument;
    }

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public void setPolicyDocument(Property<PolicyDocument> policyDocument) {
        this.policyDocument = policyDocument;
    }

    public Policy withPolicyDocument(Property<PolicyDocument> policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles
     * 
     */
    @JsonIgnore
    public List<CharSequence> getRoles() {
        return roles;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles
     * 
     */
    @JsonIgnore
    public void setRoles(List<CharSequence> roles) {
        this.roles = roles;
    }

    public Policy withRoles(List<CharSequence> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users
     * 
     */
    @JsonIgnore
    public List<CharSequence> getUsers() {
        return users;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users
     * 
     */
    @JsonIgnore
    public void setUsers(List<CharSequence> users) {
        this.users = users;
    }

    public Policy withUsers(List<CharSequence> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groups", groups).append("policyDocument", policyDocument).append("policyName", policyName).append("roles", roles).append("users", users).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyDocument).append(groups).append(policyName).append(users).append(roles).toHashCode();
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
        return new EqualsBuilder().append(policyDocument, rhs.policyDocument).append(groups, rhs.groups).append(policyName, rhs.policyName).append(users, rhs.users).append(roles, rhs.roles).isEquals();
    }

}
