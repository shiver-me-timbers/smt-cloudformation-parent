
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
 * UserPoolUsernameConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CaseSensitive"
})
public class UserPoolUsernameConfiguration implements Property<UserPoolUsernameConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive
     * 
     */
    @JsonProperty("CaseSensitive")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive")
    private CharSequence caseSensitive;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive
     * 
     */
    @JsonIgnore
    public CharSequence getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive
     * 
     */
    @JsonIgnore
    public void setCaseSensitive(CharSequence caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public UserPoolUsernameConfiguration withCaseSensitive(CharSequence caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("caseSensitive", caseSensitive).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(caseSensitive).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolUsernameConfiguration) == false) {
            return false;
        }
        UserPoolUsernameConfiguration rhs = ((UserPoolUsernameConfiguration) other);
        return new EqualsBuilder().append(caseSensitive, rhs.caseSensitive).isEquals();
    }

}
