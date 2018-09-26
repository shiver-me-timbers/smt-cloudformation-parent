
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Policies
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PasswordPolicy"
})
public class Policies {

    /**
     * PasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    @JsonProperty("PasswordPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html")
    private PasswordPolicy passwordPolicy;

    /**
     * PasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    public PasswordPolicy getPasswordPolicy() {
        return passwordPolicy;
    }

    /**
     * PasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    public Policies withPasswordPolicy(PasswordPolicy passwordPolicy) {
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
        if ((other instanceof Policies) == false) {
            return false;
        }
        Policies rhs = ((Policies) other);
        return new EqualsBuilder().append(passwordPolicy, rhs.passwordPolicy).isEquals();
    }

}
