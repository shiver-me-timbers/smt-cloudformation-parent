
package aws.iam;

import java.util.LinkedHashSet;
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
 * Group
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GroupName",
    "ManagedPolicyArns",
    "Path",
    "Policies"
})
public class Group {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-groupname")
    private String groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-managepolicyarns
     * 
     */
    @JsonProperty("ManagedPolicyArns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-managepolicyarns")
    private Set<String> managedPolicyArns = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-path")
    private String path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-policies
     * 
     */
    @JsonProperty("Policies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-policies")
    private Set<Policy> policies = new LinkedHashSet<Policy>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-groupname
     * 
     */
    @JsonProperty("GroupName")
    public String getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-groupname
     * 
     */
    @JsonProperty("GroupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Group withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-managepolicyarns
     * 
     */
    @JsonProperty("ManagedPolicyArns")
    public Set<String> getManagedPolicyArns() {
        return managedPolicyArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-managepolicyarns
     * 
     */
    @JsonProperty("ManagedPolicyArns")
    public void setManagedPolicyArns(Set<String> managedPolicyArns) {
        this.managedPolicyArns = managedPolicyArns;
    }

    public Group withManagedPolicyArns(Set<String> managedPolicyArns) {
        this.managedPolicyArns = managedPolicyArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-path
     * 
     */
    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-path
     * 
     */
    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    public Group withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-policies
     * 
     */
    @JsonProperty("Policies")
    public Set<Policy> getPolicies() {
        return policies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-policies
     * 
     */
    @JsonProperty("Policies")
    public void setPolicies(Set<Policy> policies) {
        this.policies = policies;
    }

    public Group withPolicies(Set<Policy> policies) {
        this.policies = policies;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupName", groupName).append("managedPolicyArns", managedPolicyArns).append("path", path).append("policies", policies).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policies).append(path).append(groupName).append(managedPolicyArns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group) == false) {
            return false;
        }
        Group rhs = ((Group) other);
        return new EqualsBuilder().append(policies, rhs.policies).append(path, rhs.path).append(groupName, rhs.groupName).append(managedPolicyArns, rhs.managedPolicyArns).isEquals();
    }

}
