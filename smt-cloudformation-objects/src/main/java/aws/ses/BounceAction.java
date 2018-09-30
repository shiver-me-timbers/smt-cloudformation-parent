
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BounceAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Sender",
    "SmtpReplyCode",
    "Message",
    "TopicArn",
    "StatusCode"
})
public class BounceAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender
     * 
     */
    @JsonProperty("Sender")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender")
    private CharSequence sender;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode
     * 
     */
    @JsonProperty("SmtpReplyCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode")
    private CharSequence smtpReplyCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message
     * 
     */
    @JsonProperty("Message")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message")
    private CharSequence message;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn")
    private CharSequence topicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode")
    private CharSequence statusCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender
     * 
     */
    public CharSequence getSender() {
        return sender;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender
     * 
     */
    public void setSender(CharSequence sender) {
        this.sender = sender;
    }

    public BounceAction withSender(CharSequence sender) {
        this.sender = sender;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode
     * 
     */
    public CharSequence getSmtpReplyCode() {
        return smtpReplyCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode
     * 
     */
    public void setSmtpReplyCode(CharSequence smtpReplyCode) {
        this.smtpReplyCode = smtpReplyCode;
    }

    public BounceAction withSmtpReplyCode(CharSequence smtpReplyCode) {
        this.smtpReplyCode = smtpReplyCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message
     * 
     */
    public CharSequence getMessage() {
        return message;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message
     * 
     */
    public void setMessage(CharSequence message) {
        this.message = message;
    }

    public BounceAction withMessage(CharSequence message) {
        this.message = message;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn
     * 
     */
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn
     * 
     */
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public BounceAction withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode
     * 
     */
    public CharSequence getStatusCode() {
        return statusCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode
     * 
     */
    public void setStatusCode(CharSequence statusCode) {
        this.statusCode = statusCode;
    }

    public BounceAction withStatusCode(CharSequence statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sender", sender).append("smtpReplyCode", smtpReplyCode).append("message", message).append("topicArn", topicArn).append("statusCode", statusCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(smtpReplyCode).append(message).append(sender).append(topicArn).append(statusCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BounceAction) == false) {
            return false;
        }
        BounceAction rhs = ((BounceAction) other);
        return new EqualsBuilder().append(smtpReplyCode, rhs.smtpReplyCode).append(message, rhs.message).append(sender, rhs.sender).append(topicArn, rhs.topicArn).append(statusCode, rhs.statusCode).isEquals();
    }

}
