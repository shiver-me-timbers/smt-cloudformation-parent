
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InviteMessageTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EmailMessage",
    "SMSMessage",
    "EmailSubject"
})
public class InviteMessageTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage
     * 
     */
    @JsonProperty("EmailMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage")
    private CharSequence emailMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage
     * 
     */
    @JsonProperty("SMSMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage")
    private CharSequence sMSMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject
     * 
     */
    @JsonProperty("EmailSubject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject")
    private CharSequence emailSubject;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage
     * 
     */
    public CharSequence getEmailMessage() {
        return emailMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage
     * 
     */
    public void setEmailMessage(CharSequence emailMessage) {
        this.emailMessage = emailMessage;
    }

    public InviteMessageTemplate withEmailMessage(CharSequence emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage
     * 
     */
    public CharSequence getSMSMessage() {
        return sMSMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage
     * 
     */
    public void setSMSMessage(CharSequence sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    public InviteMessageTemplate withSMSMessage(CharSequence sMSMessage) {
        this.sMSMessage = sMSMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject
     * 
     */
    public CharSequence getEmailSubject() {
        return emailSubject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject
     * 
     */
    public void setEmailSubject(CharSequence emailSubject) {
        this.emailSubject = emailSubject;
    }

    public InviteMessageTemplate withEmailSubject(CharSequence emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("emailMessage", emailMessage).append("sMSMessage", sMSMessage).append("emailSubject", emailSubject).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(emailMessage).append(emailSubject).append(sMSMessage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InviteMessageTemplate) == false) {
            return false;
        }
        InviteMessageTemplate rhs = ((InviteMessageTemplate) other);
        return new EqualsBuilder().append(emailMessage, rhs.emailMessage).append(emailSubject, rhs.emailSubject).append(sMSMessage, rhs.sMSMessage).isEquals();
    }

}
