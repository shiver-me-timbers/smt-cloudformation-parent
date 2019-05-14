
package aws.cognito;

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
 * Policies
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PasswordPolicy"
})
public class Policies implements Property<Policies>
{

    /**
     * PasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    @JsonProperty("PasswordPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html")
    private Property<PasswordPolicy> passwordPolicy;

    /**
     * PasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    @JsonIgnore
    public Property<PasswordPolicy> getPasswordPolicy() {
        return passwordPolicy;
    }

    /**
     * PasswordPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
     * 
     */
    @JsonIgnore
    public void setPasswordPolicy(Property<PasswordPolicy> passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    public Policies withPasswordPolicy(Property<PasswordPolicy> passwordPolicy) {
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
