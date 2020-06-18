
package shiver.me.timbers.aws.detective;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MemberInvitation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GraphArn",
    "MemberId",
    "MemberEmailAddress",
    "Message"
})
public class MemberInvitation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn
     * 
     */
    @JsonProperty("GraphArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn")
    private CharSequence graphArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid
     * 
     */
    @JsonProperty("MemberId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid")
    private CharSequence memberId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress
     * 
     */
    @JsonProperty("MemberEmailAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress")
    private CharSequence memberEmailAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message
     * 
     */
    @JsonProperty("Message")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message")
    private CharSequence message;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn
     * 
     */
    @JsonIgnore
    public CharSequence getGraphArn() {
        return graphArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn
     * 
     */
    @JsonIgnore
    public void setGraphArn(CharSequence graphArn) {
        this.graphArn = graphArn;
    }

    public MemberInvitation withGraphArn(CharSequence graphArn) {
        this.graphArn = graphArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid
     * 
     */
    @JsonIgnore
    public CharSequence getMemberId() {
        return memberId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid
     * 
     */
    @JsonIgnore
    public void setMemberId(CharSequence memberId) {
        this.memberId = memberId;
    }

    public MemberInvitation withMemberId(CharSequence memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress
     * 
     */
    @JsonIgnore
    public CharSequence getMemberEmailAddress() {
        return memberEmailAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress
     * 
     */
    @JsonIgnore
    public void setMemberEmailAddress(CharSequence memberEmailAddress) {
        this.memberEmailAddress = memberEmailAddress;
    }

    public MemberInvitation withMemberEmailAddress(CharSequence memberEmailAddress) {
        this.memberEmailAddress = memberEmailAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message
     * 
     */
    @JsonIgnore
    public CharSequence getMessage() {
        return message;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message
     * 
     */
    @JsonIgnore
    public void setMessage(CharSequence message) {
        this.message = message;
    }

    public MemberInvitation withMessage(CharSequence message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("graphArn", graphArn).append("memberId", memberId).append("memberEmailAddress", memberEmailAddress).append("message", message).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(memberEmailAddress).append(message).append(graphArn).append(memberId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberInvitation) == false) {
            return false;
        }
        MemberInvitation rhs = ((MemberInvitation) other);
        return new EqualsBuilder().append(memberEmailAddress, rhs.memberEmailAddress).append(message, rhs.message).append(graphArn, rhs.graphArn).append(memberId, rhs.memberId).isEquals();
    }

}
