
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Volume
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ec2VolumeId",
    "MountPoint",
    "Name",
    "StackId"
})
public class Volume {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid
     * 
     */
    @JsonProperty("Ec2VolumeId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid")
    private CharSequence ec2VolumeId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint
     * 
     */
    @JsonProperty("MountPoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint")
    private CharSequence mountPoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid
     * 
     */
    @JsonProperty("StackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid")
    private CharSequence stackId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid
     * 
     */
    public CharSequence getEc2VolumeId() {
        return ec2VolumeId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid
     * 
     */
    public void setEc2VolumeId(CharSequence ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
    }

    public Volume withEc2VolumeId(CharSequence ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint
     * 
     */
    public CharSequence getMountPoint() {
        return mountPoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint
     * 
     */
    public void setMountPoint(CharSequence mountPoint) {
        this.mountPoint = mountPoint;
    }

    public Volume withMountPoint(CharSequence mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Volume withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid
     * 
     */
    public CharSequence getStackId() {
        return stackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid
     * 
     */
    public void setStackId(CharSequence stackId) {
        this.stackId = stackId;
    }

    public Volume withStackId(CharSequence stackId) {
        this.stackId = stackId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ec2VolumeId", ec2VolumeId).append("mountPoint", mountPoint).append("name", name).append("stackId", stackId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(mountPoint).append(ec2VolumeId).append(stackId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Volume) == false) {
            return false;
        }
        Volume rhs = ((Volume) other);
        return new EqualsBuilder().append(name, rhs.name).append(mountPoint, rhs.mountPoint).append(ec2VolumeId, rhs.ec2VolumeId).append(stackId, rhs.stackId).isEquals();
    }

}
