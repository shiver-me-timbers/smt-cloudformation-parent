
package aws.managedblockchain;

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
 * MemberVotingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApprovalThresholdPolicy"
})
public class MemberVotingPolicy implements Property<MemberVotingPolicy>
{

    /**
     * MemberApprovalThresholdPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html
     * 
     */
    @JsonProperty("ApprovalThresholdPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html")
    private Property<MemberApprovalThresholdPolicy> approvalThresholdPolicy;

    /**
     * MemberApprovalThresholdPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html
     * 
     */
    @JsonIgnore
    public Property<MemberApprovalThresholdPolicy> getApprovalThresholdPolicy() {
        return approvalThresholdPolicy;
    }

    /**
     * MemberApprovalThresholdPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html
     * 
     */
    @JsonIgnore
    public void setApprovalThresholdPolicy(Property<MemberApprovalThresholdPolicy> approvalThresholdPolicy) {
        this.approvalThresholdPolicy = approvalThresholdPolicy;
    }

    public MemberVotingPolicy withApprovalThresholdPolicy(Property<MemberApprovalThresholdPolicy> approvalThresholdPolicy) {
        this.approvalThresholdPolicy = approvalThresholdPolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("approvalThresholdPolicy", approvalThresholdPolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(approvalThresholdPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberVotingPolicy) == false) {
            return false;
        }
        MemberVotingPolicy rhs = ((MemberVotingPolicy) other);
        return new EqualsBuilder().append(approvalThresholdPolicy, rhs.approvalThresholdPolicy).isEquals();
    }

}
