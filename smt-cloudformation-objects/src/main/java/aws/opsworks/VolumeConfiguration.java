
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VolumeConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Iops",
    "MountPoint",
    "NumberOfDisks",
    "RaidLevel",
    "Size",
    "VolumeType"
})
public class VolumeConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops
     * 
     */
    @JsonProperty("Iops")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops")
    private Integer iops;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint
     * 
     */
    @JsonProperty("MountPoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint")
    private CharSequence mountPoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks
     * 
     */
    @JsonProperty("NumberOfDisks")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks")
    private Integer numberOfDisks;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel
     * 
     */
    @JsonProperty("RaidLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel")
    private Integer raidLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size
     * 
     */
    @JsonProperty("Size")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size")
    private Integer size;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype
     * 
     */
    @JsonProperty("VolumeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype")
    private CharSequence volumeType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops
     * 
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops
     * 
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public VolumeConfiguration withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint
     * 
     */
    public CharSequence getMountPoint() {
        return mountPoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint
     * 
     */
    public void setMountPoint(CharSequence mountPoint) {
        this.mountPoint = mountPoint;
    }

    public VolumeConfiguration withMountPoint(CharSequence mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks
     * 
     */
    public Integer getNumberOfDisks() {
        return numberOfDisks;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks
     * 
     */
    public void setNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }

    public VolumeConfiguration withNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel
     * 
     */
    public Integer getRaidLevel() {
        return raidLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel
     * 
     */
    public void setRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
    }

    public VolumeConfiguration withRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size
     * 
     */
    public Integer getSize() {
        return size;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size
     * 
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    public VolumeConfiguration withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype
     * 
     */
    public CharSequence getVolumeType() {
        return volumeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype
     * 
     */
    public void setVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
    }

    public VolumeConfiguration withVolumeType(CharSequence volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iops", iops).append("mountPoint", mountPoint).append("numberOfDisks", numberOfDisks).append("raidLevel", raidLevel).append("size", size).append("volumeType", volumeType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeType).append(mountPoint).append(size).append(raidLevel).append(iops).append(numberOfDisks).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeConfiguration) == false) {
            return false;
        }
        VolumeConfiguration rhs = ((VolumeConfiguration) other);
        return new EqualsBuilder().append(volumeType, rhs.volumeType).append(mountPoint, rhs.mountPoint).append(size, rhs.size).append(raidLevel, rhs.raidLevel).append(iops, rhs.iops).append(numberOfDisks, rhs.numberOfDisks).isEquals();
    }

}
