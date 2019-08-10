
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
 * UserPoolVerificationMessageTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EmailMessageByLink",
    "EmailMessage",
    "SmsMessage",
    "EmailSubject",
    "DefaultEmailOption",
    "EmailSubjectByLink"
})
public class UserPoolVerificationMessageTemplate implements Property<UserPoolVerificationMessageTemplate>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessagebylink
     * 
     */
    @JsonProperty("EmailMessageByLink")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessagebylink")
    private CharSequence emailMessageByLink;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessage
     * 
     */
    @JsonProperty("EmailMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessage")
    private CharSequence emailMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-smsmessage
     * 
     */
    @JsonProperty("SmsMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-smsmessage")
    private CharSequence smsMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject
     * 
     */
    @JsonProperty("EmailSubject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject")
    private CharSequence emailSubject;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-defaultemailoption
     * 
     */
    @JsonProperty("DefaultEmailOption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-defaultemailoption")
    private CharSequence defaultEmailOption;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubjectbylink
     * 
     */
    @JsonProperty("EmailSubjectByLink")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubjectbylink")
    private CharSequence emailSubjectByLink;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessagebylink
     * 
     */
    @JsonIgnore
    public CharSequence getEmailMessageByLink() {
        return emailMessageByLink;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessagebylink
     * 
     */
    @JsonIgnore
    public void setEmailMessageByLink(CharSequence emailMessageByLink) {
        this.emailMessageByLink = emailMessageByLink;
    }

    public UserPoolVerificationMessageTemplate withEmailMessageByLink(CharSequence emailMessageByLink) {
        this.emailMessageByLink = emailMessageByLink;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessage
     * 
     */
    @JsonIgnore
    public CharSequence getEmailMessage() {
        return emailMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessage
     * 
     */
    @JsonIgnore
    public void setEmailMessage(CharSequence emailMessage) {
        this.emailMessage = emailMessage;
    }

    public UserPoolVerificationMessageTemplate withEmailMessage(CharSequence emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-smsmessage
     * 
     */
    @JsonIgnore
    public CharSequence getSmsMessage() {
        return smsMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-smsmessage
     * 
     */
    @JsonIgnore
    public void setSmsMessage(CharSequence smsMessage) {
        this.smsMessage = smsMessage;
    }

    public UserPoolVerificationMessageTemplate withSmsMessage(CharSequence smsMessage) {
        this.smsMessage = smsMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject
     * 
     */
    @JsonIgnore
    public CharSequence getEmailSubject() {
        return emailSubject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject
     * 
     */
    @JsonIgnore
    public void setEmailSubject(CharSequence emailSubject) {
        this.emailSubject = emailSubject;
    }

    public UserPoolVerificationMessageTemplate withEmailSubject(CharSequence emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-defaultemailoption
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultEmailOption() {
        return defaultEmailOption;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-defaultemailoption
     * 
     */
    @JsonIgnore
    public void setDefaultEmailOption(CharSequence defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption;
    }

    public UserPoolVerificationMessageTemplate withDefaultEmailOption(CharSequence defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubjectbylink
     * 
     */
    @JsonIgnore
    public CharSequence getEmailSubjectByLink() {
        return emailSubjectByLink;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubjectbylink
     * 
     */
    @JsonIgnore
    public void setEmailSubjectByLink(CharSequence emailSubjectByLink) {
        this.emailSubjectByLink = emailSubjectByLink;
    }

    public UserPoolVerificationMessageTemplate withEmailSubjectByLink(CharSequence emailSubjectByLink) {
        this.emailSubjectByLink = emailSubjectByLink;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("emailMessageByLink", emailMessageByLink).append("emailMessage", emailMessage).append("smsMessage", smsMessage).append("emailSubject", emailSubject).append("defaultEmailOption", defaultEmailOption).append("emailSubjectByLink", emailSubjectByLink).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(emailMessageByLink).append(emailMessage).append(smsMessage).append(defaultEmailOption).append(emailSubjectByLink).append(emailSubject).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolVerificationMessageTemplate) == false) {
            return false;
        }
        UserPoolVerificationMessageTemplate rhs = ((UserPoolVerificationMessageTemplate) other);
        return new EqualsBuilder().append(emailMessageByLink, rhs.emailMessageByLink).append(emailMessage, rhs.emailMessage).append(smsMessage, rhs.smsMessage).append(defaultEmailOption, rhs.defaultEmailOption).append(emailSubjectByLink, rhs.emailSubjectByLink).append(emailSubject, rhs.emailSubject).isEquals();
    }

}
