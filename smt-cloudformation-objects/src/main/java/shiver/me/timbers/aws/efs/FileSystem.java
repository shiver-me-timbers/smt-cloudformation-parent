
package shiver.me.timbers.aws.efs;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * FileSystem
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Encrypted",
    "FileSystemTags",
    "KmsKeyId",
    "LifecyclePolicies",
    "PerformanceMode",
    "ProvisionedThroughputInMibps",
    "ThroughputMode"
})
public class FileSystem {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted")
    private CharSequence encrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags
     * 
     */
    @JsonProperty("FileSystemTags")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags")
    private Set<Property<FileSystemElasticFileSystemTag>> fileSystemTags = new LinkedHashSet<Property<FileSystemElasticFileSystemTag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-lifecyclepolicies
     * 
     */
    @JsonProperty("LifecyclePolicies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-lifecyclepolicies")
    private Set<Property<FileSystemLifecyclePolicy>> lifecyclePolicies = new LinkedHashSet<Property<FileSystemLifecyclePolicy>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode
     * 
     */
    @JsonProperty("PerformanceMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode")
    private CharSequence performanceMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps
     * 
     */
    @JsonProperty("ProvisionedThroughputInMibps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps")
    private Number provisionedThroughputInMibps;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode
     * 
     */
    @JsonProperty("ThroughputMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode")
    private CharSequence throughputMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted
     * 
     */
    @JsonIgnore
    public CharSequence getEncrypted() {
        return encrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted
     * 
     */
    @JsonIgnore
    public void setEncrypted(CharSequence encrypted) {
        this.encrypted = encrypted;
    }

    public FileSystem withEncrypted(CharSequence encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags
     * 
     */
    @JsonIgnore
    public Set<Property<FileSystemElasticFileSystemTag>> getFileSystemTags() {
        return fileSystemTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags
     * 
     */
    @JsonIgnore
    public void setFileSystemTags(Set<Property<FileSystemElasticFileSystemTag>> fileSystemTags) {
        this.fileSystemTags = fileSystemTags;
    }

    public FileSystem withFileSystemTags(Set<Property<FileSystemElasticFileSystemTag>> fileSystemTags) {
        this.fileSystemTags = fileSystemTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-lifecyclepolicies
     * 
     */
    @JsonIgnore
    public Set<Property<FileSystemLifecyclePolicy>> getLifecyclePolicies() {
        return lifecyclePolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-lifecyclepolicies
     * 
     */
    @JsonIgnore
    public void setLifecyclePolicies(Set<Property<FileSystemLifecyclePolicy>> lifecyclePolicies) {
        this.lifecyclePolicies = lifecyclePolicies;
    }

    public FileSystem withLifecyclePolicies(Set<Property<FileSystemLifecyclePolicy>> lifecyclePolicies) {
        this.lifecyclePolicies = lifecyclePolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode
     * 
     */
    @JsonIgnore
    public CharSequence getPerformanceMode() {
        return performanceMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode
     * 
     */
    @JsonIgnore
    public void setPerformanceMode(CharSequence performanceMode) {
        this.performanceMode = performanceMode;
    }

    public FileSystem withPerformanceMode(CharSequence performanceMode) {
        this.performanceMode = performanceMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps
     * 
     */
    @JsonIgnore
    public Number getProvisionedThroughputInMibps() {
        return provisionedThroughputInMibps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps
     * 
     */
    @JsonIgnore
    public void setProvisionedThroughputInMibps(Number provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    public FileSystem withProvisionedThroughputInMibps(Number provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode
     * 
     */
    @JsonIgnore
    public CharSequence getThroughputMode() {
        return throughputMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode
     * 
     */
    @JsonIgnore
    public void setThroughputMode(CharSequence throughputMode) {
        this.throughputMode = throughputMode;
    }

    public FileSystem withThroughputMode(CharSequence throughputMode) {
        this.throughputMode = throughputMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encrypted", encrypted).append("fileSystemTags", fileSystemTags).append("kmsKeyId", kmsKeyId).append("lifecyclePolicies", lifecyclePolicies).append("performanceMode", performanceMode).append("provisionedThroughputInMibps", provisionedThroughputInMibps).append("throughputMode", throughputMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encrypted).append(lifecyclePolicies).append(performanceMode).append(throughputMode).append(provisionedThroughputInMibps).append(kmsKeyId).append(fileSystemTags).toHashCode();
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
        return new EqualsBuilder().append(encrypted, rhs.encrypted).append(lifecyclePolicies, rhs.lifecyclePolicies).append(performanceMode, rhs.performanceMode).append(throughputMode, rhs.throughputMode).append(provisionedThroughputInMibps, rhs.provisionedThroughputInMibps).append(kmsKeyId, rhs.kmsKeyId).append(fileSystemTags, rhs.fileSystemTags).isEquals();
    }

}
