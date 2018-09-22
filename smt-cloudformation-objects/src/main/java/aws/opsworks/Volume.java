
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
    private String ec2VolumeId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint
     * 
     */
    @JsonProperty("MountPoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint")
    private String mountPoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid
     * 
     */
    @JsonProperty("StackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid")
    private String stackId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid
     * 
     */
    @JsonProperty("Ec2VolumeId")
    public String getEc2VolumeId() {
        return ec2VolumeId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid
     * 
     */
    @JsonProperty("Ec2VolumeId")
    public void setEc2VolumeId(String ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
    }

    public Volume withEc2VolumeId(String ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint
     * 
     */
    @JsonProperty("MountPoint")
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint
     * 
     */
    @JsonProperty("MountPoint")
    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    public Volume withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid
     * 
     */
    @JsonProperty("StackId")
    public String getStackId() {
        return stackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid
     * 
     */
    @JsonProperty("StackId")
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public Volume withStackId(String stackId) {
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
