
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
 * UserPoolPolicies
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PasswordPolicy"
})
public class UserPoolPolicies implements Property<UserPoolPolicies>
{

    /**
     * UserPoolPasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    @JsonProperty("PasswordPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html")
    private Property<UserPoolPasswordPolicy> passwordPolicy;

    /**
     * UserPoolPasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolPasswordPolicy> getPasswordPolicy() {
        return passwordPolicy;
    }

    /**
     * UserPoolPasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    @JsonIgnore
    public void setPasswordPolicy(Property<UserPoolPasswordPolicy> passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    public UserPoolPolicies withPasswordPolicy(Property<UserPoolPasswordPolicy> passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("passwordPolicy", passwordPolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(passwordPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolPolicies) == false) {
            return false;
        }
        UserPoolPolicies rhs = ((UserPoolPolicies) other);
        return new EqualsBuilder().append(passwordPolicy, rhs.passwordPolicy).isEquals();
    }

}
