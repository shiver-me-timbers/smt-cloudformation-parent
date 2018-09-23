
package aws.efs;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FileSystem
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Encrypted",
    "FileSystemTags",
    "KmsKeyId",
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
    private Boolean encrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags
     * 
     */
    @JsonProperty("FileSystemTags")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags")
    private Set<ElasticFileSystemTag> fileSystemTags = new LinkedHashSet<ElasticFileSystemTag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid")
    private String kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode
     * 
     */
    @JsonProperty("PerformanceMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode")
    private String performanceMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps
     * 
     */
    @JsonProperty("ProvisionedThroughputInMibps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps")
    private Double provisionedThroughputInMibps;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode
     * 
     */
    @JsonProperty("ThroughputMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode")
    private String throughputMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public FileSystem withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags
     * 
     */
    @JsonProperty("FileSystemTags")
    public Set<ElasticFileSystemTag> getFileSystemTags() {
        return fileSystemTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags
     * 
     */
    @JsonProperty("FileSystemTags")
    public void setFileSystemTags(Set<ElasticFileSystemTag> fileSystemTags) {
        this.fileSystemTags = fileSystemTags;
    }

    public FileSystem withFileSystemTags(Set<ElasticFileSystemTag> fileSystemTags) {
        this.fileSystemTags = fileSystemTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public FileSystem withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode
     * 
     */
    @JsonProperty("PerformanceMode")
    public String getPerformanceMode() {
        return performanceMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode
     * 
     */
    @JsonProperty("PerformanceMode")
    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    public FileSystem withPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps
     * 
     */
    @JsonProperty("ProvisionedThroughputInMibps")
    public Double getProvisionedThroughputInMibps() {
        return provisionedThroughputInMibps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps
     * 
     */
    @JsonProperty("ProvisionedThroughputInMibps")
    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    public FileSystem withProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode
     * 
     */
    @JsonProperty("ThroughputMode")
    public String getThroughputMode() {
        return throughputMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode
     * 
     */
    @JsonProperty("ThroughputMode")
    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    public FileSystem withThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encrypted", encrypted).append("fileSystemTags", fileSystemTags).append("kmsKeyId", kmsKeyId).append("performanceMode", performanceMode).append("provisionedThroughputInMibps", provisionedThroughputInMibps).append("throughputMode", throughputMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encrypted).append(performanceMode).append(throughputMode).append(provisionedThroughputInMibps).append(kmsKeyId).append(fileSystemTags).toHashCode();
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
        return new EqualsBuilder().append(encrypted, rhs.encrypted).append(performanceMode, rhs.performanceMode).append(throughputMode, rhs.throughputMode).append(provisionedThroughputInMibps, rhs.provisionedThroughputInMibps).append(kmsKeyId, rhs.kmsKeyId).append(fileSystemTags, rhs.fileSystemTags).isEquals();
    }

}