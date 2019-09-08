
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
 * Member
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MemberConfiguration",
    "NetworkConfiguration",
    "NetworkId",
    "InvitationId"
})
public class Member {

    /**
     * MemberMemberConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html
     * 
     */
    @JsonProperty("MemberConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html")
    private Property<MemberMemberConfiguration> memberConfiguration;
    /**
     * MemberNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html
     * 
     */
    @JsonProperty("NetworkConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html")
    private Property<MemberNetworkConfiguration> networkConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid
     * 
     */
    @JsonProperty("NetworkId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid")
    private CharSequence networkId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid
     * 
     */
    @JsonProperty("InvitationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid")
    private CharSequence invitationId;

    /**
     * MemberMemberConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<MemberMemberConfiguration> getMemberConfiguration() {
        return memberConfiguration;
    }

    /**
     * MemberMemberConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html
     * 
     */
    @JsonIgnore
    public void setMemberConfiguration(Property<MemberMemberConfiguration> memberConfiguration) {
        this.memberConfiguration = memberConfiguration;
    }

    public Member withMemberConfiguration(Property<MemberMemberConfiguration> memberConfiguration) {
        this.memberConfiguration = memberConfiguration;
        return this;
    }

    /**
     * MemberNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<MemberNetworkConfiguration> getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * MemberNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNetworkConfiguration(Property<MemberNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    public Member withNetworkConfiguration(Property<MemberNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid
     * 
     */
    @JsonIgnore
    public CharSequence getNetworkId() {
        return networkId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid
     * 
     */
    @JsonIgnore
    public void setNetworkId(CharSequence networkId) {
        this.networkId = networkId;
    }

    public Member withNetworkId(CharSequence networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid
     * 
     */
    @JsonIgnore
    public CharSequence getInvitationId() {
        return invitationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid
     * 
     */
    @JsonIgnore
    public void setInvitationId(CharSequence invitationId) {
        this.invitationId = invitationId;
    }

    public Member withInvitationId(CharSequence invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("memberConfiguration", memberConfiguration).append("networkConfiguration", networkConfiguration).append("networkId", networkId).append("invitationId", invitationId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkId).append(invitationId).append(networkConfiguration).append(memberConfiguration).toHashCode();
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
        return new EqualsBuilder().append(networkId, rhs.networkId).append(invitationId, rhs.invitationId).append(networkConfiguration, rhs.networkConfiguration).append(memberConfiguration, rhs.memberConfiguration).isEquals();
    }

}
