
package aws.opsworks;

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
 * BlockDeviceMapping
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeviceName",
    "Ebs",
    "NoDevice",
    "VirtualName"
})
public class BlockDeviceMapping implements Property<BlockDeviceMapping>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename
     * 
     */
    @JsonProperty("DeviceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename")
    private CharSequence deviceName;
    /**
     * EbsBlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
     * 
     */
    @JsonProperty("Ebs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html")
    private Property<EbsBlockDevice> ebs;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice
     * 
     */
    @JsonProperty("NoDevice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice")
    private CharSequence noDevice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname
     * 
     */
    @JsonProperty("VirtualName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname")
    private CharSequence virtualName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceName() {
        return deviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename
     * 
     */
    @JsonIgnore
    public void setDeviceName(CharSequence deviceName) {
        this.deviceName = deviceName;
    }

    public BlockDeviceMapping withDeviceName(CharSequence deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * EbsBlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
     * 
     */
    @JsonIgnore
    public Property<EbsBlockDevice> getEbs() {
        return ebs;
    }

    /**
     * EbsBlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
     * 
     */
    @JsonIgnore
    public void setEbs(Property<EbsBlockDevice> ebs) {
        this.ebs = ebs;
    }

    public BlockDeviceMapping withEbs(Property<EbsBlockDevice> ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice
     * 
     */
    @JsonIgnore
    public CharSequence getNoDevice() {
        return noDevice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice
     * 
     */
    @JsonIgnore
    public void setNoDevice(CharSequence noDevice) {
        this.noDevice = noDevice;
    }

    public BlockDeviceMapping withNoDevice(CharSequence noDevice) {
        this.noDevice = noDevice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualName() {
        return virtualName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname
     * 
     */
    @JsonIgnore
    public void setVirtualName(CharSequence virtualName) {
        this.virtualName = virtualName;
    }

    public BlockDeviceMapping withVirtualName(CharSequence virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceName", deviceName).append("ebs", ebs).append("noDevice", noDevice).append("virtualName", virtualName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(noDevice).append(deviceName).append(ebs).append(virtualName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockDeviceMapping) == false) {
            return false;
        }
        BlockDeviceMapping rhs = ((BlockDeviceMapping) other);
        return new EqualsBuilder().append(noDevice, rhs.noDevice).append(deviceName, rhs.deviceName).append(ebs, rhs.ebs).append(virtualName, rhs.virtualName).isEquals();
    }

}
