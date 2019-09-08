
package shiver.me.timbers.aws.managedblockchain;

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
 * MemberApprovalThresholdPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ThresholdComparator",
    "ThresholdPercentage",
    "ProposalDurationInHours"
})
public class MemberApprovalThresholdPolicy implements Property<MemberApprovalThresholdPolicy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdcomparator
     * 
     */
    @JsonProperty("ThresholdComparator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdcomparator")
    private CharSequence thresholdComparator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdpercentage
     * 
     */
    @JsonProperty("ThresholdPercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdpercentage")
    private Number thresholdPercentage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-proposaldurationinhours
     * 
     */
    @JsonProperty("ProposalDurationInHours")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-proposaldurationinhours")
    private Number proposalDurationInHours;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdcomparator
     * 
     */
    @JsonIgnore
    public CharSequence getThresholdComparator() {
        return thresholdComparator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdcomparator
     * 
     */
    @JsonIgnore
    public void setThresholdComparator(CharSequence thresholdComparator) {
        this.thresholdComparator = thresholdComparator;
    }

    public MemberApprovalThresholdPolicy withThresholdComparator(CharSequence thresholdComparator) {
        this.thresholdComparator = thresholdComparator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdpercentage
     * 
     */
    @JsonIgnore
    public Number getThresholdPercentage() {
        return thresholdPercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-thresholdpercentage
     * 
     */
    @JsonIgnore
    public void setThresholdPercentage(Number thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    public MemberApprovalThresholdPolicy withThresholdPercentage(Number thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-proposaldurationinhours
     * 
     */
    @JsonIgnore
    public Number getProposalDurationInHours() {
        return proposalDurationInHours;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html#cfn-managedblockchain-member-approvalthresholdpolicy-proposaldurationinhours
     * 
     */
    @JsonIgnore
    public void setProposalDurationInHours(Number proposalDurationInHours) {
        this.proposalDurationInHours = proposalDurationInHours;
    }

    public MemberApprovalThresholdPolicy withProposalDurationInHours(Number proposalDurationInHours) {
        this.proposalDurationInHours = proposalDurationInHours;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("thresholdComparator", thresholdComparator).append("thresholdPercentage", thresholdPercentage).append("proposalDurationInHours", proposalDurationInHours).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(thresholdComparator).append(thresholdPercentage).append(proposalDurationInHours).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberApprovalThresholdPolicy) == false) {
            return false;
        }
        MemberApprovalThresholdPolicy rhs = ((MemberApprovalThresholdPolicy) other);
        return new EqualsBuilder().append(thresholdComparator, rhs.thresholdComparator).append(thresholdPercentage, rhs.thresholdPercentage).append(proposalDurationInHours, rhs.proposalDurationInHours).isEquals();
    }

}
