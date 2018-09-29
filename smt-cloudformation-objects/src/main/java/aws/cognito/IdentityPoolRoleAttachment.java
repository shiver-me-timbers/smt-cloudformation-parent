
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IdentityPoolRoleAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RoleMappings",
    "IdentityPoolId",
    "Roles"
})
public class IdentityPoolRoleAttachment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings
     * 
     */
    @JsonProperty("RoleMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings")
    private Object roleMappings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid
     * 
     */
    @JsonProperty("IdentityPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid")
    private CharSequence identityPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles
     * 
     */
    @JsonProperty("Roles")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles")
    private Object roles;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings
     * 
     */
    public Object getRoleMappings() {
        return roleMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings
     * 
     */
    public void setRoleMappings(Object roleMappings) {
        this.roleMappings = roleMappings;
    }

    public IdentityPoolRoleAttachment withRoleMappings(Object roleMappings) {
        this.roleMappings = roleMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid
     * 
     */
    public CharSequence getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid
     * 
     */
    public void setIdentityPoolId(CharSequence identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    public IdentityPoolRoleAttachment withIdentityPoolId(CharSequence identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles
     * 
     */
    public Object getRoles() {
        return roles;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles
     * 
     */
    public void setRoles(Object roles) {
        this.roles = roles;
    }

    public IdentityPoolRoleAttachment withRoles(Object roles) {
        this.roles = roles;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("roleMappings", roleMappings).append("identityPoolId", identityPoolId).append("roles", roles).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(roleMappings).append(identityPoolId).append(roles).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentityPoolRoleAttachment) == false) {
            return false;
        }
        IdentityPoolRoleAttachment rhs = ((IdentityPoolRoleAttachment) other);
        return new EqualsBuilder().append(roleMappings, rhs.roleMappings).append(identityPoolId, rhs.identityPoolId).append(roles, rhs.roles).isEquals();
    }

}
