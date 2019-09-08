
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
 * UserPoolUserPoolAddOns
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AdvancedSecurityMode"
})
public class UserPoolUserPoolAddOns implements Property<UserPoolUserPoolAddOns>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode
     * 
     */
    @JsonProperty("AdvancedSecurityMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode")
    private CharSequence advancedSecurityMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode
     * 
     */
    @JsonIgnore
    public CharSequence getAdvancedSecurityMode() {
        return advancedSecurityMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode
     * 
     */
    @JsonIgnore
    public void setAdvancedSecurityMode(CharSequence advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode;
    }

    public UserPoolUserPoolAddOns withAdvancedSecurityMode(CharSequence advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("advancedSecurityMode", advancedSecurityMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(advancedSecurityMode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolUserPoolAddOns) == false) {
            return false;
        }
        UserPoolUserPoolAddOns rhs = ((UserPoolUserPoolAddOns) other);
        return new EqualsBuilder().append(advancedSecurityMode, rhs.advancedSecurityMode).isEquals();
    }

}
