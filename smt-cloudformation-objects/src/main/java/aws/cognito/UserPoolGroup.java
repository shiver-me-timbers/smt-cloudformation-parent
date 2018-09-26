
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * UserPoolGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GroupName",
    "Description",
    "UserPoolId",
    "Precedence",
    "RoleArn"
})
public class UserPoolGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname")
    private CharSequence groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid")
    private CharSequence userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-precedence
     * 
     */
    @JsonProperty("Precedence")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-precedence")
    private Double precedence;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname
     * 
     */
    public CharSequence getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname
     * 
     */
    public void setGroupName(CharSequence groupName) {
        this.groupName = groupName;
    }

    public UserPoolGroup withGroupName(CharSequence groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public UserPoolGroup withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid
     * 
     */
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid
     * 
     */
    public void setUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolGroup withUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-precedence
     * 
     */
    public Double getPrecedence() {
        return precedence;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-precedence
     * 
     */
    public void setPrecedence(Double precedence) {
        this.precedence = precedence;
    }

    public UserPoolGroup withPrecedence(Double precedence) {
        this.precedence = precedence;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public UserPoolGroup withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupName", groupName).append("description", description).append("userPoolId", userPoolId).append("precedence", precedence).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(groupName).append(userPoolId).append(precedence).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolGroup) == false) {
            return false;
        }
        UserPoolGroup rhs = ((UserPoolGroup) other);
        return new EqualsBuilder().append(description, rhs.description).append(groupName, rhs.groupName).append(userPoolId, rhs.userPoolId).append(precedence, rhs.precedence).append(roleArn, rhs.roleArn).isEquals();
    }

}
