
package shiver.me.timbers.aws.transfer;

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
import shiver.me.timbers.aws.Tag;


/**
 * User
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Policy",
    "Role",
    "HomeDirectory",
    "HomeDirectoryType",
    "ServerId",
    "UserName",
    "HomeDirectoryMappings",
    "SshPublicKeys",
    "Tags"
})
public class User {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-policy
     * 
     */
    @JsonProperty("Policy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-policy")
    private CharSequence policy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-role")
    private CharSequence role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectory
     * 
     */
    @JsonProperty("HomeDirectory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectory")
    private CharSequence homeDirectory;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorytype
     * 
     */
    @JsonProperty("HomeDirectoryType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorytype")
    private CharSequence homeDirectoryType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid
     * 
     */
    @JsonProperty("ServerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid")
    private CharSequence serverId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username
     * 
     */
    @JsonProperty("UserName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username")
    private CharSequence userName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorymappings
     * 
     */
    @JsonProperty("HomeDirectoryMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorymappings")
    private List<Property<UserHomeDirectoryMapEntry>> homeDirectoryMappings = new ArrayList<Property<UserHomeDirectoryMapEntry>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys
     * 
     */
    @JsonProperty("SshPublicKeys")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys")
    private List<CharSequence> sshPublicKeys = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-policy
     * 
     */
    @JsonIgnore
    public CharSequence getPolicy() {
        return policy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-policy
     * 
     */
    @JsonIgnore
    public void setPolicy(CharSequence policy) {
        this.policy = policy;
    }

    public User withPolicy(CharSequence policy) {
        this.policy = policy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-role
     * 
     */
    @JsonIgnore
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-role
     * 
     */
    @JsonIgnore
    public void setRole(CharSequence role) {
        this.role = role;
    }

    public User withRole(CharSequence role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectory
     * 
     */
    @JsonIgnore
    public CharSequence getHomeDirectory() {
        return homeDirectory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectory
     * 
     */
    @JsonIgnore
    public void setHomeDirectory(CharSequence homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    public User withHomeDirectory(CharSequence homeDirectory) {
        this.homeDirectory = homeDirectory;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorytype
     * 
     */
    @JsonIgnore
    public CharSequence getHomeDirectoryType() {
        return homeDirectoryType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorytype
     * 
     */
    @JsonIgnore
    public void setHomeDirectoryType(CharSequence homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
    }

    public User withHomeDirectoryType(CharSequence homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid
     * 
     */
    @JsonIgnore
    public CharSequence getServerId() {
        return serverId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-serverid
     * 
     */
    @JsonIgnore
    public void setServerId(CharSequence serverId) {
        this.serverId = serverId;
    }

    public User withServerId(CharSequence serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username
     * 
     */
    @JsonIgnore
    public CharSequence getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-username
     * 
     */
    @JsonIgnore
    public void setUserName(CharSequence userName) {
        this.userName = userName;
    }

    public User withUserName(CharSequence userName) {
        this.userName = userName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorymappings
     * 
     */
    @JsonIgnore
    public List<Property<UserHomeDirectoryMapEntry>> getHomeDirectoryMappings() {
        return homeDirectoryMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-homedirectorymappings
     * 
     */
    @JsonIgnore
    public void setHomeDirectoryMappings(List<Property<UserHomeDirectoryMapEntry>> homeDirectoryMappings) {
        this.homeDirectoryMappings = homeDirectoryMappings;
    }

    public User withHomeDirectoryMappings(List<Property<UserHomeDirectoryMapEntry>> homeDirectoryMappings) {
        this.homeDirectoryMappings = homeDirectoryMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-sshpublickeys
     * 
     */
    @JsonIgnore
    public void setSshPublicKeys(List<CharSequence> sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
    }

    public User withSshPublicKeys(List<CharSequence> sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html#cfn-transfer-user-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public User withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policy", policy).append("role", role).append("homeDirectory", homeDirectory).append("homeDirectoryType", homeDirectoryType).append("serverId", serverId).append("userName", userName).append("homeDirectoryMappings", homeDirectoryMappings).append("sshPublicKeys", sshPublicKeys).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(role).append(homeDirectory).append(sshPublicKeys).append(homeDirectoryMappings).append(userName).append(serverId).append(homeDirectoryType).append(policy).append(tags).toHashCode();
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
        return new EqualsBuilder().append(role, rhs.role).append(homeDirectory, rhs.homeDirectory).append(sshPublicKeys, rhs.sshPublicKeys).append(homeDirectoryMappings, rhs.homeDirectoryMappings).append(userName, rhs.userName).append(serverId, rhs.serverId).append(homeDirectoryType, rhs.homeDirectoryType).append(policy, rhs.policy).append(tags, rhs.tags).isEquals();
    }

}
