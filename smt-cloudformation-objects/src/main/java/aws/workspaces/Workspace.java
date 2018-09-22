
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
    private String bundleId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid
     * 
     */
    @JsonProperty("DirectoryId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid")
    private String directoryId;
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
    private String userName;
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
    private String volumeEncryptionKey;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid
     * 
     */
    @JsonProperty("BundleId")
    public String getBundleId() {
        return bundleId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid
     * 
     */
    @JsonProperty("BundleId")
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public Workspace withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid
     * 
     */
    @JsonProperty("DirectoryId")
    public String getDirectoryId() {
        return directoryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid
     * 
     */
    @JsonProperty("DirectoryId")
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public Workspace withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled
     * 
     */
    @JsonProperty("RootVolumeEncryptionEnabled")
    public Boolean getRootVolumeEncryptionEnabled() {
        return rootVolumeEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled
     * 
     */
    @JsonProperty("RootVolumeEncryptionEnabled")
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
    @JsonProperty("UserName")
    public String getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username
     * 
     */
    @JsonProperty("UserName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Workspace withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled
     * 
     */
    @JsonProperty("UserVolumeEncryptionEnabled")
    public Boolean getUserVolumeEncryptionEnabled() {
        return userVolumeEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled
     * 
     */
    @JsonProperty("UserVolumeEncryptionEnabled")
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
    @JsonProperty("VolumeEncryptionKey")
    public String getVolumeEncryptionKey() {
        return volumeEncryptionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey
     * 
     */
    @JsonProperty("VolumeEncryptionKey")
    public void setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
    }

    public Workspace withVolumeEncryptionKey(String volumeEncryptionKey) {
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
