
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
    private String emailMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage
     * 
     */
    @JsonProperty("SMSMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage")
    private String sMSMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject
     * 
     */
    @JsonProperty("EmailSubject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject")
    private String emailSubject;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage
     * 
     */
    @JsonProperty("EmailMessage")
    public String getEmailMessage() {
        return emailMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage
     * 
     */
    @JsonProperty("EmailMessage")
    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    public InviteMessageTemplate withEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage
     * 
     */
    @JsonProperty("SMSMessage")
    public String getSMSMessage() {
        return sMSMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage
     * 
     */
    @JsonProperty("SMSMessage")
    public void setSMSMessage(String sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    public InviteMessageTemplate withSMSMessage(String sMSMessage) {
        this.sMSMessage = sMSMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject
     * 
     */
    @JsonProperty("EmailSubject")
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject
     * 
     */
    @JsonProperty("EmailSubject")
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public InviteMessageTemplate withEmailSubject(String emailSubject) {
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
