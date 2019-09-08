
package shiver.me.timbers.aws.fsx;

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
 * FileSystem
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KmsKeyId",
    "StorageCapacity",
    "FileSystemType",
    "LustreConfiguration",
    "BackupId",
    "SubnetIds",
    "SecurityGroupIds",
    "Tags",
    "WindowsConfiguration"
})
public class FileSystem {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity
     * 
     */
    @JsonProperty("StorageCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity")
    private Number storageCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype
     * 
     */
    @JsonProperty("FileSystemType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype")
    private CharSequence fileSystemType;
    /**
     * FileSystemLustreConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html
     * 
     */
    @JsonProperty("LustreConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html")
    private Property<FileSystemLustreConfiguration> lustreConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid
     * 
     */
    @JsonProperty("BackupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid")
    private CharSequence backupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-subnetids")
    private List<CharSequence> subnetIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * FileSystemWindowsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html
     * 
     */
    @JsonProperty("WindowsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html")
    private Property<FileSystemWindowsConfiguration> windowsConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid
     * 
     */
    @JsonIgnore
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public FileSystem withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity
     * 
     */
    @JsonIgnore
    public Number getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity
     * 
     */
    @JsonIgnore
    public void setStorageCapacity(Number storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public FileSystem withStorageCapacity(Number storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype
     * 
     */
    @JsonIgnore
    public CharSequence getFileSystemType() {
        return fileSystemType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype
     * 
     */
    @JsonIgnore
    public void setFileSystemType(CharSequence fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    public FileSystem withFileSystemType(CharSequence fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }

    /**
     * FileSystemLustreConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<FileSystemLustreConfiguration> getLustreConfiguration() {
        return lustreConfiguration;
    }

    /**
     * FileSystemLustreConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html
     * 
     */
    @JsonIgnore
    public void setLustreConfiguration(Property<FileSystemLustreConfiguration> lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    public FileSystem withLustreConfiguration(Property<FileSystemLustreConfiguration> lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid
     * 
     */
    @JsonIgnore
    public CharSequence getBackupId() {
        return backupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid
     * 
     */
    @JsonIgnore
    public void setBackupId(CharSequence backupId) {
        this.backupId = backupId;
    }

    public FileSystem withBackupId(CharSequence backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-subnetids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-subnetids
     * 
     */
    @JsonIgnore
    public void setSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public FileSystem withSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-securitygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-securitygroupids
     * 
     */
    @JsonIgnore
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public FileSystem withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public FileSystem withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * FileSystemWindowsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<FileSystemWindowsConfiguration> getWindowsConfiguration() {
        return windowsConfiguration;
    }

    /**
     * FileSystemWindowsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html
     * 
     */
    @JsonIgnore
    public void setWindowsConfiguration(Property<FileSystemWindowsConfiguration> windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    public FileSystem withWindowsConfiguration(Property<FileSystemWindowsConfiguration> windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kmsKeyId", kmsKeyId).append("storageCapacity", storageCapacity).append("fileSystemType", fileSystemType).append("lustreConfiguration", lustreConfiguration).append("backupId", backupId).append("subnetIds", subnetIds).append("securityGroupIds", securityGroupIds).append("tags", tags).append("windowsConfiguration", windowsConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lustreConfiguration).append(securityGroupIds).append(backupId).append(storageCapacity).append(kmsKeyId).append(windowsConfiguration).append(fileSystemType).append(subnetIds).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileSystem) == false) {
            return false;
        }
        FileSystem rhs = ((FileSystem) other);
        return new EqualsBuilder().append(lustreConfiguration, rhs.lustreConfiguration).append(securityGroupIds, rhs.securityGroupIds).append(backupId, rhs.backupId).append(storageCapacity, rhs.storageCapacity).append(kmsKeyId, rhs.kmsKeyId).append(windowsConfiguration, rhs.windowsConfiguration).append(fileSystemType, rhs.fileSystemType).append(subnetIds, rhs.subnetIds).append(tags, rhs.tags).isEquals();
    }

}
