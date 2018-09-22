
package aws.opsworks;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeviceName",
    "Ebs",
    "NoDevice",
    "VirtualName"
})
public class BlockDeviceMapping {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename
     * 
     */
    @JsonProperty("DeviceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename")
    private String deviceName;
    /**
     * EbsBlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
     * 
     */
    @JsonProperty("Ebs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html")
    private EbsBlockDevice ebs;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice
     * 
     */
    @JsonProperty("NoDevice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice")
    private String noDevice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname
     * 
     */
    @JsonProperty("VirtualName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname")
    private String virtualName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename
     * 
     */
    @JsonProperty("DeviceName")
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename
     * 
     */
    @JsonProperty("DeviceName")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * EbsBlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
     * 
     */
    @JsonProperty("Ebs")
    public EbsBlockDevice getEbs() {
        return ebs;
    }

    /**
     * EbsBlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html
     * 
     */
    @JsonProperty("Ebs")
    public void setEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
    }

    public BlockDeviceMapping withEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice
     * 
     */
    @JsonProperty("NoDevice")
    public String getNoDevice() {
        return noDevice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice
     * 
     */
    @JsonProperty("NoDevice")
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    public BlockDeviceMapping withNoDevice(String noDevice) {
        this.noDevice = noDevice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname
     * 
     */
    @JsonProperty("VirtualName")
    public String getVirtualName() {
        return virtualName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname
     * 
     */
    @JsonProperty("VirtualName")
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    public BlockDeviceMapping withVirtualName(String virtualName) {
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
