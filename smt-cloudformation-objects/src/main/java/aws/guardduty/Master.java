
package aws.guardduty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Master
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DetectorId",
    "MasterId",
    "InvitationId"
})
public class Master {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid
     * 
     */
    @JsonProperty("DetectorId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid")
    private CharSequence detectorId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid
     * 
     */
    @JsonProperty("MasterId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid")
    private CharSequence masterId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid
     * 
     */
    @JsonProperty("InvitationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid")
    private CharSequence invitationId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid
     * 
     */
    public CharSequence getDetectorId() {
        return detectorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid
     * 
     */
    public void setDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
    }

    public Master withDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid
     * 
     */
    public CharSequence getMasterId() {
        return masterId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid
     * 
     */
    public void setMasterId(CharSequence masterId) {
        this.masterId = masterId;
    }

    public Master withMasterId(CharSequence masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid
     * 
     */
    public CharSequence getInvitationId() {
        return invitationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid
     * 
     */
    public void setInvitationId(CharSequence invitationId) {
        this.invitationId = invitationId;
    }

    public Master withInvitationId(CharSequence invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("detectorId", detectorId).append("masterId", masterId).append("invitationId", invitationId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(masterId).append(invitationId).append(detectorId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Master) == false) {
            return false;
        }
        Master rhs = ((Master) other);
        return new EqualsBuilder().append(masterId, rhs.masterId).append(invitationId, rhs.invitationId).append(detectorId, rhs.detectorId).isEquals();
    }

}
