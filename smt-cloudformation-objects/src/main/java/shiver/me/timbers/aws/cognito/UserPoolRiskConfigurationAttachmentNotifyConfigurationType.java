
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
 * UserPoolRiskConfigurationAttachmentNotifyConfigurationType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockEmail",
    "ReplyTo",
    "SourceArn",
    "NoActionEmail",
    "From",
    "MfaEmail"
})
public class UserPoolRiskConfigurationAttachmentNotifyConfigurationType implements Property<UserPoolRiskConfigurationAttachmentNotifyConfigurationType>
{

    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonProperty("BlockEmail")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html")
    private Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> blockEmail;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-replyto
     * 
     */
    @JsonProperty("ReplyTo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-replyto")
    private CharSequence replyTo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-sourcearn
     * 
     */
    @JsonProperty("SourceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-sourcearn")
    private CharSequence sourceArn;
    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonProperty("NoActionEmail")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html")
    private Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> noActionEmail;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from
     * 
     */
    @JsonProperty("From")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from")
    private CharSequence from;
    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonProperty("MfaEmail")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html")
    private Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> mfaEmail;

    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> getBlockEmail() {
        return blockEmail;
    }

    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonIgnore
    public void setBlockEmail(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> blockEmail) {
        this.blockEmail = blockEmail;
    }

    public UserPoolRiskConfigurationAttachmentNotifyConfigurationType withBlockEmail(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> blockEmail) {
        this.blockEmail = blockEmail;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-replyto
     * 
     */
    @JsonIgnore
    public CharSequence getReplyTo() {
        return replyTo;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-replyto
     * 
     */
    @JsonIgnore
    public void setReplyTo(CharSequence replyTo) {
        this.replyTo = replyTo;
    }

    public UserPoolRiskConfigurationAttachmentNotifyConfigurationType withReplyTo(CharSequence replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-sourcearn
     * 
     */
    @JsonIgnore
    public CharSequence getSourceArn() {
        return sourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-sourcearn
     * 
     */
    @JsonIgnore
    public void setSourceArn(CharSequence sourceArn) {
        this.sourceArn = sourceArn;
    }

    public UserPoolRiskConfigurationAttachmentNotifyConfigurationType withSourceArn(CharSequence sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> getNoActionEmail() {
        return noActionEmail;
    }

    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonIgnore
    public void setNoActionEmail(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> noActionEmail) {
        this.noActionEmail = noActionEmail;
    }

    public UserPoolRiskConfigurationAttachmentNotifyConfigurationType withNoActionEmail(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> noActionEmail) {
        this.noActionEmail = noActionEmail;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from
     * 
     */
    @JsonIgnore
    public CharSequence getFrom() {
        return from;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from
     * 
     */
    @JsonIgnore
    public void setFrom(CharSequence from) {
        this.from = from;
    }

    public UserPoolRiskConfigurationAttachmentNotifyConfigurationType withFrom(CharSequence from) {
        this.from = from;
        return this;
    }

    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> getMfaEmail() {
        return mfaEmail;
    }

    /**
     * UserPoolRiskConfigurationAttachmentNotifyEmailType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html
     * 
     */
    @JsonIgnore
    public void setMfaEmail(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> mfaEmail) {
        this.mfaEmail = mfaEmail;
    }

    public UserPoolRiskConfigurationAttachmentNotifyConfigurationType withMfaEmail(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentNotifyEmailType> mfaEmail) {
        this.mfaEmail = mfaEmail;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockEmail", blockEmail).append("replyTo", replyTo).append("sourceArn", sourceArn).append("noActionEmail", noActionEmail).append("from", from).append("mfaEmail", mfaEmail).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceArn).append(blockEmail).append(noActionEmail).append(mfaEmail).append(replyTo).append(from).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentNotifyConfigurationType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentNotifyConfigurationType rhs = ((UserPoolRiskConfigurationAttachmentNotifyConfigurationType) other);
        return new EqualsBuilder().append(sourceArn, rhs.sourceArn).append(blockEmail, rhs.blockEmail).append(noActionEmail, rhs.noActionEmail).append(mfaEmail, rhs.mfaEmail).append(replyTo, rhs.replyTo).append(from, rhs.from).isEquals();
    }

}
