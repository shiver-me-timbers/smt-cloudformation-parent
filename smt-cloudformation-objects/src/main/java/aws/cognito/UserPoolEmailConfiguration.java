
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
 * UserPoolEmailConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReplyToEmailAddress",
    "EmailSendingAccount",
    "SourceArn"
})
public class UserPoolEmailConfiguration implements Property<UserPoolEmailConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress
     * 
     */
    @JsonProperty("ReplyToEmailAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress")
    private CharSequence replyToEmailAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount
     * 
     */
    @JsonProperty("EmailSendingAccount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount")
    private CharSequence emailSendingAccount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn
     * 
     */
    @JsonProperty("SourceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn")
    private CharSequence sourceArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress
     * 
     */
    @JsonIgnore
    public CharSequence getReplyToEmailAddress() {
        return replyToEmailAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress
     * 
     */
    @JsonIgnore
    public void setReplyToEmailAddress(CharSequence replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
    }

    public UserPoolEmailConfiguration withReplyToEmailAddress(CharSequence replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount
     * 
     */
    @JsonIgnore
    public CharSequence getEmailSendingAccount() {
        return emailSendingAccount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount
     * 
     */
    @JsonIgnore
    public void setEmailSendingAccount(CharSequence emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount;
    }

    public UserPoolEmailConfiguration withEmailSendingAccount(CharSequence emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn
     * 
     */
    @JsonIgnore
    public CharSequence getSourceArn() {
        return sourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn
     * 
     */
    @JsonIgnore
    public void setSourceArn(CharSequence sourceArn) {
        this.sourceArn = sourceArn;
    }

    public UserPoolEmailConfiguration withSourceArn(CharSequence sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replyToEmailAddress", replyToEmailAddress).append("emailSendingAccount", emailSendingAccount).append("sourceArn", sourceArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceArn).append(replyToEmailAddress).append(emailSendingAccount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolEmailConfiguration) == false) {
            return false;
        }
        UserPoolEmailConfiguration rhs = ((UserPoolEmailConfiguration) other);
        return new EqualsBuilder().append(sourceArn, rhs.sourceArn).append(replyToEmailAddress, rhs.replyToEmailAddress).append(emailSendingAccount, rhs.emailSendingAccount).isEquals();
    }

}