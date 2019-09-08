
package shiver.me.timbers.aws.workspaces;

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
 * Workspace
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BundleId",
    "DirectoryId",
    "RootVolumeEncryptionEnabled",
    "Tags",
    "UserName",
    "UserVolumeEncryptionEnabled",
    "VolumeEncryptionKey",
    "WorkspaceProperties"
})
public class Workspace {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid
     * 
     */
    @JsonProperty("BundleId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid")
    private CharSequence bundleId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid
     * 
     */
    @JsonProperty("DirectoryId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid")
    private CharSequence directoryId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled
     * 
     */
    @JsonProperty("RootVolumeEncryptionEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled")
    private CharSequence rootVolumeEncryptionEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username
     * 
     */
    @JsonProperty("UserName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username")
    private CharSequence userName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled
     * 
     */
    @JsonProperty("UserVolumeEncryptionEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled")
    private CharSequence userVolumeEncryptionEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey
     * 
     */
    @JsonProperty("VolumeEncryptionKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey")
    private CharSequence volumeEncryptionKey;
    /**
     * WorkspaceWorkspaceProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html
     * 
     */
    @JsonProperty("WorkspaceProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html")
    private Property<WorkspaceWorkspaceProperties> workspaceProperties;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid
     * 
     */
    @JsonIgnore
    public CharSequence getBundleId() {
        return bundleId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid
     * 
     */
    @JsonIgnore
    public void setBundleId(CharSequence bundleId) {
        this.bundleId = bundleId;
    }

    public Workspace withBundleId(CharSequence bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid
     * 
     */
    @JsonIgnore
    public CharSequence getDirectoryId() {
        return directoryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid
     * 
     */
    @JsonIgnore
    public void setDirectoryId(CharSequence directoryId) {
        this.directoryId = directoryId;
    }

    public Workspace withDirectoryId(CharSequence directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled
     * 
     */
    @JsonIgnore
    public CharSequence getRootVolumeEncryptionEnabled() {
        return rootVolumeEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled
     * 
     */
    @JsonIgnore
    public void setRootVolumeEncryptionEnabled(CharSequence rootVolumeEncryptionEnabled) {
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
    }

    public Workspace withRootVolumeEncryptionEnabled(CharSequence rootVolumeEncryptionEnabled) {
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Workspace withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username
     * 
     */
    @JsonIgnore
    public CharSequence getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username
     * 
     */
    @JsonIgnore
    public void setUserName(CharSequence userName) {
        this.userName = userName;
    }

    public Workspace withUserName(CharSequence userName) {
        this.userName = userName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled
     * 
     */
    @JsonIgnore
    public CharSequence getUserVolumeEncryptionEnabled() {
        return userVolumeEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled
     * 
     */
    @JsonIgnore
    public void setUserVolumeEncryptionEnabled(CharSequence userVolumeEncryptionEnabled) {
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
    }

    public Workspace withUserVolumeEncryptionEnabled(CharSequence userVolumeEncryptionEnabled) {
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey
     * 
     */
    @JsonIgnore
    public CharSequence getVolumeEncryptionKey() {
        return volumeEncryptionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey
     * 
     */
    @JsonIgnore
    public void setVolumeEncryptionKey(CharSequence volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
    }

    public Workspace withVolumeEncryptionKey(CharSequence volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
        return this;
    }

    /**
     * WorkspaceWorkspaceProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html
     * 
     */
    @JsonIgnore
    public Property<WorkspaceWorkspaceProperties> getWorkspaceProperties() {
        return workspaceProperties;
    }

    /**
     * WorkspaceWorkspaceProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html
     * 
     */
    @JsonIgnore
    public void setWorkspaceProperties(Property<WorkspaceWorkspaceProperties> workspaceProperties) {
        this.workspaceProperties = workspaceProperties;
    }

    public Workspace withWorkspaceProperties(Property<WorkspaceWorkspaceProperties> workspaceProperties) {
        this.workspaceProperties = workspaceProperties;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bundleId", bundleId).append("directoryId", directoryId).append("rootVolumeEncryptionEnabled", rootVolumeEncryptionEnabled).append("tags", tags).append("userName", userName).append("userVolumeEncryptionEnabled", userVolumeEncryptionEnabled).append("volumeEncryptionKey", volumeEncryptionKey).append("workspaceProperties", workspaceProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(userVolumeEncryptionEnabled).append(volumeEncryptionKey).append(workspaceProperties).append(bundleId).append(directoryId).append(rootVolumeEncryptionEnabled).append(userName).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workspace) == false) {
            return false;
        }
        Workspace rhs = ((Workspace) other);
        return new EqualsBuilder().append(userVolumeEncryptionEnabled, rhs.userVolumeEncryptionEnabled).append(volumeEncryptionKey, rhs.volumeEncryptionKey).append(workspaceProperties, rhs.workspaceProperties).append(bundleId, rhs.bundleId).append(directoryId, rhs.directoryId).append(rootVolumeEncryptionEnabled, rhs.rootVolumeEncryptionEnabled).append(userName, rhs.userName).append(tags, rhs.tags).isEquals();
    }

}
