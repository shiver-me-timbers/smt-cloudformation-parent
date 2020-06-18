
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
 * UserPoolRiskConfigurationAttachmentNotifyEmailType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TextBody",
    "HtmlBody",
    "Subject"
})
public class UserPoolRiskConfigurationAttachmentNotifyEmailType implements Property<UserPoolRiskConfigurationAttachmentNotifyEmailType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-textbody
     * 
     */
    @JsonProperty("TextBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-textbody")
    private CharSequence textBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody
     * 
     */
    @JsonProperty("HtmlBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody")
    private CharSequence htmlBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject
     * 
     */
    @JsonProperty("Subject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject")
    private CharSequence subject;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-textbody
     * 
     */
    @JsonIgnore
    public CharSequence getTextBody() {
        return textBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-textbody
     * 
     */
    @JsonIgnore
    public void setTextBody(CharSequence textBody) {
        this.textBody = textBody;
    }

    public UserPoolRiskConfigurationAttachmentNotifyEmailType withTextBody(CharSequence textBody) {
        this.textBody = textBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody
     * 
     */
    @JsonIgnore
    public CharSequence getHtmlBody() {
        return htmlBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody
     * 
     */
    @JsonIgnore
    public void setHtmlBody(CharSequence htmlBody) {
        this.htmlBody = htmlBody;
    }

    public UserPoolRiskConfigurationAttachmentNotifyEmailType withHtmlBody(CharSequence htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject
     * 
     */
    @JsonIgnore
    public CharSequence getSubject() {
        return subject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject
     * 
     */
    @JsonIgnore
    public void setSubject(CharSequence subject) {
        this.subject = subject;
    }

    public UserPoolRiskConfigurationAttachmentNotifyEmailType withSubject(CharSequence subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("textBody", textBody).append("htmlBody", htmlBody).append("subject", subject).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(textBody).append(htmlBody).append(subject).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentNotifyEmailType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentNotifyEmailType rhs = ((UserPoolRiskConfigurationAttachmentNotifyEmailType) other);
        return new EqualsBuilder().append(textBody, rhs.textBody).append(htmlBody, rhs.htmlBody).append(subject, rhs.subject).isEquals();
    }

}
