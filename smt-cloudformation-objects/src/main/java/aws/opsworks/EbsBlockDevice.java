
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EbsBlockDevice
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeleteOnTermination",
    "Iops",
    "SnapshotId",
    "VolumeSize",
    "VolumeType"
})
public class EbsBlockDevice {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination
     * 
     */
    @JsonProperty("DeleteOnTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination")
    private Boolean deleteOnTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops
     * 
     */
    @JsonProperty("Iops")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops")
    private Integer iops;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid
     * 
     */
    @JsonProperty("SnapshotId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid")
    private CharSequence snapshotId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize
     * 
     */
    @JsonProperty("VolumeSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize")
    private Integer volumeSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype
     * 
     */
    @JsonProperty("VolumeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype")
    private CharSequence volumeType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination
     * 
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination
     * 
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops
     * 
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops
     * 
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public EbsBlockDevice withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid
     * 
     */
    public CharSequence getSnapshotId() {
        return snapshotId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid
     * 
     */
    public void setSnapshotId(CharSequence snapshotId) {
        this.snapshotId = snapshotId;
    }

    public EbsBlockDevice withSnapshotId(CharSequence snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize
     * 
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize
     * 
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype
     * 
     */
    public CharSequence getVolumeType() {
        return volumeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype
     * 
     */
    public void setVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
    }

    public EbsBlockDevice withVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteOnTermination", deleteOnTermination).append("iops", iops).append("snapshotId", snapshotId).append("volumeSize", volumeSize).append("volumeType", volumeType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iops).append(volumeType).append(deleteOnTermination).append(snapshotId).append(volumeSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EbsBlockDevice) == false) {
            return false;
        }
        EbsBlockDevice rhs = ((EbsBlockDevice) other);
        return new EqualsBuilder().append(iops, rhs.iops).append(volumeType, rhs.volumeType).append(deleteOnTermination, rhs.deleteOnTermination).append(snapshotId, rhs.snapshotId).append(volumeSize, rhs.volumeSize).isEquals();
    }

}
