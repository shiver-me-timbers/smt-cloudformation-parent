
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GroupIdentifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GroupId"
})
public class GroupIdentifier {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid
     * 
     */
    @JsonProperty("GroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid")
    private CharSequence groupId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid
     * 
     */
    public CharSequence getGroupId() {
        return groupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid
     * 
     */
    public void setGroupId(CharSequence groupId) {
        this.groupId = groupId;
    }

    public GroupIdentifier withGroupId(CharSequence groupId) {
        this.groupId = groupId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupId", groupId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupIdentifier) == false) {
            return false;
        }
        GroupIdentifier rhs = ((GroupIdentifier) other);
        return new EqualsBuilder().append(groupId, rhs.groupId).isEquals();
    }

}
