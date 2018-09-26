
package aws.guardduty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Member
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Status",
    "MemberId",
    "Email",
    "Message",
    "DisableEmailNotification",
    "DetectorId"
})
public class Member {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status")
    private CharSequence status;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid
     * 
     */
    @JsonProperty("MemberId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid")
    private CharSequence memberId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email
     * 
     */
    @JsonProperty("Email")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email")
    private CharSequence email;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message
     * 
     */
    @JsonProperty("Message")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message")
    private CharSequence message;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification
     * 
     */
    @JsonProperty("DisableEmailNotification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification")
    private Boolean disableEmailNotification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid
     * 
     */
    @JsonProperty("DetectorId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid")
    private CharSequence detectorId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public Member withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid
     * 
     */
    public CharSequence getMemberId() {
        return memberId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid
     * 
     */
    public void setMemberId(CharSequence memberId) {
        this.memberId = memberId;
    }

    public Member withMemberId(CharSequence memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email
     * 
     */
    public CharSequence getEmail() {
        return email;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email
     * 
     */
    public void setEmail(CharSequence email) {
        this.email = email;
    }

    public Member withEmail(CharSequence email) {
        this.email = email;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message
     * 
     */
    public CharSequence getMessage() {
        return message;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message
     * 
     */
    public void setMessage(CharSequence message) {
        this.message = message;
    }

    public Member withMessage(CharSequence message) {
        this.message = message;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification
     * 
     */
    public Boolean getDisableEmailNotification() {
        return disableEmailNotification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification
     * 
     */
    public void setDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
    }

    public Member withDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid
     * 
     */
    public CharSequence getDetectorId() {
        return detectorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid
     * 
     */
    public void setDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
    }

    public Member withDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("memberId", memberId).append("email", email).append("message", message).append("disableEmailNotification", disableEmailNotification).append("detectorId", detectorId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(disableEmailNotification).append(detectorId).append(message).append(email).append(status).append(memberId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return new EqualsBuilder().append(disableEmailNotification, rhs.disableEmailNotification).append(detectorId, rhs.detectorId).append(message, rhs.message).append(email, rhs.email).append(status, rhs.status).append(memberId, rhs.memberId).isEquals();
    }

}
