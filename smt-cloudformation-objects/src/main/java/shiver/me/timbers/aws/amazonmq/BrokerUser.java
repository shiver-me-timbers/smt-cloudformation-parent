
package shiver.me.timbers.aws.amazonmq;

import java.util.ArrayList;
import java.util.List;
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
 * BrokerUser
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Username",
    "Groups",
    "ConsoleAccess",
    "Password"
})
public class BrokerUser implements Property<BrokerUser>
{

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
    private CharSequence consoleAccess;
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
    @JsonIgnore
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username
     * 
     */
    @JsonIgnore
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public BrokerUser withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getGroups() {
        return groups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups
     * 
     */
    @JsonIgnore
    public void setGroups(List<CharSequence> groups) {
        this.groups = groups;
    }

    public BrokerUser withGroups(List<CharSequence> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess
     * 
     */
    @JsonIgnore
    public CharSequence getConsoleAccess() {
        return consoleAccess;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess
     * 
     */
    @JsonIgnore
    public void setConsoleAccess(CharSequence consoleAccess) {
        this.consoleAccess = consoleAccess;
    }

    public BrokerUser withConsoleAccess(CharSequence consoleAccess) {
        this.consoleAccess = consoleAccess;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password
     * 
     */
    @JsonIgnore
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password
     * 
     */
    @JsonIgnore
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public BrokerUser withPassword(CharSequence password) {
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
        if ((other instanceof BrokerUser) == false) {
            return false;
        }
        BrokerUser rhs = ((BrokerUser) other);
        return new EqualsBuilder().append(groups, rhs.groups).append(consoleAccess, rhs.consoleAccess).append(password, rhs.password).append(username, rhs.username).isEquals();
    }

}
