
package aws.iam;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * UserToGroupAddition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GroupName",
    "Users"
})
public class UserToGroupAddition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-groupname")
    private CharSequence groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-users
     * 
     */
    @JsonProperty("Users")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-users")
    private List<CharSequence> users = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-groupname
     * 
     */
    public CharSequence getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-groupname
     * 
     */
    public void setGroupName(CharSequence groupName) {
        this.groupName = groupName;
    }

    public UserToGroupAddition withGroupName(CharSequence groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-users
     * 
     */
    public List<CharSequence> getUsers() {
        return users;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-users
     * 
     */
    public void setUsers(List<CharSequence> users) {
        this.users = users;
    }

    public UserToGroupAddition withUsers(List<CharSequence> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupName", groupName).append("users", users).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupName).append(users).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserToGroupAddition) == false) {
            return false;
        }
        UserToGroupAddition rhs = ((UserToGroupAddition) other);
        return new EqualsBuilder().append(groupName, rhs.groupName).append(users, rhs.users).isEquals();
    }

}
