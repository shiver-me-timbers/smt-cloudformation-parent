
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
    private String status;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid
     * 
     */
    @JsonProperty("MemberId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid")
    private String memberId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email
     * 
     */
    @JsonProperty("Email")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email")
    private String email;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message
     * 
     */
    @JsonProperty("Message")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message")
    private String message;
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
    private String detectorId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status
     * 
     */
    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status
     * 
     */
    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Member withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid
     * 
     */
    @JsonProperty("MemberId")
    public String getMemberId() {
        return memberId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid
     * 
     */
    @JsonProperty("MemberId")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Member withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email
     * 
     */
    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email
     * 
     */
    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Member withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message
     * 
     */
    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message
     * 
     */
    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Member withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification
     * 
     */
    @JsonProperty("DisableEmailNotification")
    public Boolean getDisableEmailNotification() {
        return disableEmailNotification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification
     * 
     */
    @JsonProperty("DisableEmailNotification")
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
    @JsonProperty("DetectorId")
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid
     * 
     */
    @JsonProperty("DetectorId")
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    public Member withDetectorId(String detectorId) {
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
