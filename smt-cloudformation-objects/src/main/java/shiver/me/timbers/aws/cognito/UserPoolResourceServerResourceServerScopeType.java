
package shiver.me.timbers.aws.cognito;

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
 * UserPoolResourceServerResourceServerScopeType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ScopeName",
    "ScopeDescription"
})
public class UserPoolResourceServerResourceServerScopeType implements Property<UserPoolResourceServerResourceServerScopeType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopename
     * 
     */
    @JsonProperty("ScopeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopename")
    private CharSequence scopeName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription
     * 
     */
    @JsonProperty("ScopeDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription")
    private CharSequence scopeDescription;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopename
     * 
     */
    @JsonIgnore
    public CharSequence getScopeName() {
        return scopeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopename
     * 
     */
    @JsonIgnore
    public void setScopeName(CharSequence scopeName) {
        this.scopeName = scopeName;
    }

    public UserPoolResourceServerResourceServerScopeType withScopeName(CharSequence scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription
     * 
     */
    @JsonIgnore
    public CharSequence getScopeDescription() {
        return scopeDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription
     * 
     */
    @JsonIgnore
    public void setScopeDescription(CharSequence scopeDescription) {
        this.scopeDescription = scopeDescription;
    }

    public UserPoolResourceServerResourceServerScopeType withScopeDescription(CharSequence scopeDescription) {
        this.scopeDescription = scopeDescription;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scopeName", scopeName).append("scopeDescription", scopeDescription).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scopeName).append(scopeDescription).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolResourceServerResourceServerScopeType) == false) {
            return false;
        }
        UserPoolResourceServerResourceServerScopeType rhs = ((UserPoolResourceServerResourceServerScopeType) other);
        return new EqualsBuilder().append(scopeName, rhs.scopeName).append(scopeDescription, rhs.scopeDescription).isEquals();
    }

}
