
package aws.autoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BlockDevice
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeleteOnTermination",
    "Encrypted",
    "Iops",
    "SnapshotId",
    "VolumeSize",
    "VolumeType"
})
public class BlockDevice {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-deleteonterm
     * 
     */
    @JsonProperty("DeleteOnTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-deleteonterm")
    private Boolean deleteOnTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-encrypted")
    private Boolean encrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-iops
     * 
     */
    @JsonProperty("Iops")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-iops")
    private Integer iops;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-snapshotid
     * 
     */
    @JsonProperty("SnapshotId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-snapshotid")
    private String snapshotId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumesize
     * 
     */
    @JsonProperty("VolumeSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumesize")
    private Integer volumeSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumetype
     * 
     */
    @JsonProperty("VolumeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumetype")
    private String volumeType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-deleteonterm
     * 
     */
    @JsonProperty("DeleteOnTermination")
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-deleteonterm
     * 
     */
    @JsonProperty("DeleteOnTermination")
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public BlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public BlockDevice withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-iops
     * 
     */
    @JsonProperty("Iops")
    public Integer getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-iops
     * 
     */
    @JsonProperty("Iops")
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public BlockDevice withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-snapshotid
     * 
     */
    @JsonProperty("SnapshotId")
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-snapshotid
     * 
     */
    @JsonProperty("SnapshotId")
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public BlockDevice withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumesize
     * 
     */
    @JsonProperty("VolumeSize")
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumesize
     * 
     */
    @JsonProperty("VolumeSize")
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public BlockDevice withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumetype
     * 
     */
    @JsonProperty("VolumeType")
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumetype
     * 
     */
    @JsonProperty("VolumeType")
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public BlockDevice withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteOnTermination", deleteOnTermination).append("encrypted", encrypted).append("iops", iops).append("snapshotId", snapshotId).append("volumeSize", volumeSize).append("volumeType", volumeType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeType).append(snapshotId).append(encrypted).append(iops).append(deleteOnTermination).append(volumeSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockDevice) == false) {
            return false;
        }
        BlockDevice rhs = ((BlockDevice) other);
        return new EqualsBuilder().append(volumeType, rhs.volumeType).append(snapshotId, rhs.snapshotId).append(encrypted, rhs.encrypted).append(iops, rhs.iops).append(deleteOnTermination, rhs.deleteOnTermination).append(volumeSize, rhs.volumeSize).isEquals();
    }

}
