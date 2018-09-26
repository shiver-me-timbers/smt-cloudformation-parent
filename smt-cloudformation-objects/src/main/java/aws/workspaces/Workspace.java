
package aws.workspaces;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Workspace
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BundleId",
    "DirectoryId",
    "RootVolumeEncryptionEnabled",
    "UserName",
    "UserVolumeEncryptionEnabled",
    "VolumeEncryptionKey"
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
    private Boolean rootVolumeEncryptionEnabled;
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
    private Boolean userVolumeEncryptionEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey
     * 
     */
    @JsonProperty("VolumeEncryptionKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey")
    private CharSequence volumeEncryptionKey;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid
     * 
     */
    public CharSequence getBundleId() {
        return bundleId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid
     * 
     */
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
    public CharSequence getDirectoryId() {
        return directoryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid
     * 
     */
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
    public Boolean getRootVolumeEncryptionEnabled() {
        return rootVolumeEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled
     * 
     */
    public void setRootVolumeEncryptionEnabled(Boolean rootVolumeEncryptionEnabled) {
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
    }

    public Workspace withRootVolumeEncryptionEnabled(Boolean rootVolumeEncryptionEnabled) {
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username
     * 
     */
    public CharSequence getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username
     * 
     */
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
    public Boolean getUserVolumeEncryptionEnabled() {
        return userVolumeEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled
     * 
     */
    public void setUserVolumeEncryptionEnabled(Boolean userVolumeEncryptionEnabled) {
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
    }

    public Workspace withUserVolumeEncryptionEnabled(Boolean userVolumeEncryptionEnabled) {
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey
     * 
     */
    public CharSequence getVolumeEncryptionKey() {
        return volumeEncryptionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey
     * 
     */
    public void setVolumeEncryptionKey(CharSequence volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
    }

    public Workspace withVolumeEncryptionKey(CharSequence volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bundleId", bundleId).append("directoryId", directoryId).append("rootVolumeEncryptionEnabled", rootVolumeEncryptionEnabled).append("userName", userName).append("userVolumeEncryptionEnabled", userVolumeEncryptionEnabled).append("volumeEncryptionKey", volumeEncryptionKey).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(userVolumeEncryptionEnabled).append(volumeEncryptionKey).append(bundleId).append(directoryId).append(rootVolumeEncryptionEnabled).append(userName).toHashCode();
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
        return new EqualsBuilder().append(userVolumeEncryptionEnabled, rhs.userVolumeEncryptionEnabled).append(volumeEncryptionKey, rhs.volumeEncryptionKey).append(bundleId, rhs.bundleId).append(directoryId, rhs.directoryId).append(rootVolumeEncryptionEnabled, rhs.rootVolumeEncryptionEnabled).append(userName, rhs.userName).isEquals();
    }

}
