
package aws.amazonmq;

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
 * User
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Username",
    "Groups",
    "ConsoleAccess",
    "Password"
})
public class User {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username")
    private CharSequence username;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups
     * 
     */
    @JsonProperty("Groups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups")
    private List<CharSequence> groups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess
     * 
     */
    @JsonProperty("ConsoleAccess")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess")
    private Boolean consoleAccess;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password")
    private CharSequence password;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username
     * 
     */
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username
     * 
     */
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public User withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups
     * 
     */
    public List<CharSequence> getGroups() {
        return groups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups
     * 
     */
    public void setGroups(List<CharSequence> groups) {
        this.groups = groups;
    }

    public User withGroups(List<CharSequence> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess
     * 
     */
    public Boolean getConsoleAccess() {
        return consoleAccess;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess
     * 
     */
    public void setConsoleAccess(Boolean consoleAccess) {
        this.consoleAccess = consoleAccess;
    }

    public User withConsoleAccess(Boolean consoleAccess) {
        this.consoleAccess = consoleAccess;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password
     * 
     */
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password
     * 
     */
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public User withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("username", username).append("groups", groups).append("consoleAccess", consoleAccess).append("password", password).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groups).append(consoleAccess).append(password).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(groups, rhs.groups).append(consoleAccess, rhs.consoleAccess).append(password, rhs.password).append(username, rhs.username).isEquals();
    }

}
