
package aws.ec2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceEbs
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeleteOnTermination",
    "Encrypted",
    "Iops",
    "KmsKeyId",
    "SnapshotId",
    "VolumeSize",
    "VolumeType"
})
public class InstanceEbs implements Property<InstanceEbs>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination
     * 
     */
    @JsonProperty("DeleteOnTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination")
    private CharSequence deleteOnTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted")
    private CharSequence encrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops
     * 
     */
    @JsonProperty("Iops")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops")
    private Number iops;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-instance-ebs-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-instance-ebs-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid
     * 
     */
    @JsonProperty("SnapshotId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid")
    private CharSequence snapshotId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize
     * 
     */
    @JsonProperty("VolumeSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize")
    private Number volumeSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype
     * 
     */
    @JsonProperty("VolumeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype")
    private CharSequence volumeType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination
     * 
     */
    @JsonIgnore
    public CharSequence getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination
     * 
     */
    @JsonIgnore
    public void setDeleteOnTermination(CharSequence deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public InstanceEbs withDeleteOnTermination(CharSequence deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted
     * 
     */
    @JsonIgnore
    public CharSequence getEncrypted() {
        return encrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted
     * 
     */
    @JsonIgnore
    public void setEncrypted(CharSequence encrypted) {
        this.encrypted = encrypted;
    }

    public InstanceEbs withEncrypted(CharSequence encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops
     * 
     */
    @JsonIgnore
    public Number getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops
     * 
     */
    @JsonIgnore
    public void setIops(Number iops) {
        this.iops = iops;
    }

    public InstanceEbs withIops(Number iops) {
        this.iops = iops;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-instance-ebs-kmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-instance-ebs-kmskeyid
     * 
     */
    @JsonIgnore
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public InstanceEbs withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid
     * 
     */
    @JsonIgnore
    public CharSequence getSnapshotId() {
        return snapshotId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid
     * 
     */
    @JsonIgnore
    public void setSnapshotId(CharSequence snapshotId) {
        this.snapshotId = snapshotId;
    }

    public InstanceEbs withSnapshotId(CharSequence snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize
     * 
     */
    @JsonIgnore
    public Number getVolumeSize() {
        return volumeSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize
     * 
     */
    @JsonIgnore
    public void setVolumeSize(Number volumeSize) {
        this.volumeSize = volumeSize;
    }

    public InstanceEbs withVolumeSize(Number volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype
     * 
     */
    @JsonIgnore
    public CharSequence getVolumeType() {
        return volumeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype
     * 
     */
    @JsonIgnore
    public void setVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
    }

    public InstanceEbs withVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteOnTermination", deleteOnTermination).append("encrypted", encrypted).append("iops", iops).append("kmsKeyId", kmsKeyId).append("snapshotId", snapshotId).append("volumeSize", volumeSize).append("volumeType", volumeType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeType).append(snapshotId).append(encrypted).append(iops).append(deleteOnTermination).append(kmsKeyId).append(volumeSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceEbs) == false) {
            return false;
        }
        InstanceEbs rhs = ((InstanceEbs) other);
        return new EqualsBuilder().append(volumeType, rhs.volumeType).append(snapshotId, rhs.snapshotId).append(encrypted, rhs.encrypted).append(iops, rhs.iops).append(deleteOnTermination, rhs.deleteOnTermination).append(kmsKeyId, rhs.kmsKeyId).append(volumeSize, rhs.volumeSize).isEquals();
    }

}
