
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
 * User
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Groups",
    "LoginProfile",
    "ManagedPolicyArns",
    "Path",
    "Policies",
    "UserName"
})
public class User {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-groups
     * 
     */
    @JsonProperty("Groups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-groups")
    private List<String> groups = new ArrayList<String>();
    /**
     * LoginProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html
     * 
     */
    @JsonProperty("LoginProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html")
    private LoginProfile loginProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-managepolicyarns
     * 
     */
    @JsonProperty("ManagedPolicyArns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-managepolicyarns")
    private Set<String> managedPolicyArns = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-path")
    private String path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-policies
     * 
     */
    @JsonProperty("Policies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-policies")
    private List<Policy> policies = new ArrayList<Policy>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-username
     * 
     */
    @JsonProperty("UserName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-username")
    private String userName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-groups
     * 
     */
    @JsonProperty("Groups")
    public List<String> getGroups() {
        return groups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-groups
     * 
     */
    @JsonProperty("Groups")
    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public User withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * LoginProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html
     * 
     */
    @JsonProperty("LoginProfile")
    public LoginProfile getLoginProfile() {
        return loginProfile;
    }

    /**
     * LoginProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html
     * 
     */
    @JsonProperty("LoginProfile")
    public void setLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
    }

    public User withLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-managepolicyarns
     * 
     */
    @JsonProperty("ManagedPolicyArns")
    public Set<String> getManagedPolicyArns() {
        return managedPolicyArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-managepolicyarns
     * 
     */
    @JsonProperty("ManagedPolicyArns")
    public void setManagedPolicyArns(Set<String> managedPolicyArns) {
        this.managedPolicyArns = managedPolicyArns;
    }

    public User withManagedPolicyArns(Set<String> managedPolicyArns) {
        this.managedPolicyArns = managedPolicyArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-path
     * 
     */
    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-path
     * 
     */
    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    public User withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-policies
     * 
     */
    @JsonProperty("Policies")
    public List<Policy> getPolicies() {
        return policies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-policies
     * 
     */
    @JsonProperty("Policies")
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public User withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-username
     * 
     */
    @JsonProperty("UserName")
    public String getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-username
     * 
     */
    @JsonProperty("UserName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groups", groups).append("loginProfile", loginProfile).append("managedPolicyArns", managedPolicyArns).append("path", path).append("policies", policies).append("userName", userName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(loginProfile).append(path).append(managedPolicyArns).append(policies).append(groups).append(userName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(loginProfile, rhs.loginProfile).append(path, rhs.path).append(managedPolicyArns, rhs.managedPolicyArns).append(policies, rhs.policies).append(groups, rhs.groups).append(userName, rhs.userName).isEquals();
    }

}
