
package aws.autoscaling;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-devicename
     * 
     */
    @JsonProperty("DeviceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-devicename")
    private CharSequence deviceName;
    /**
     * BlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html
     * 
     */
    @JsonProperty("Ebs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html")
    private BlockDevice ebs;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-nodevice
     * 
     */
    @JsonProperty("NoDevice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-nodevice")
    private Boolean noDevice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-virtualname
     * 
     */
    @JsonProperty("VirtualName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-virtualname")
    private CharSequence virtualName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-devicename
     * 
     */
    public CharSequence getDeviceName() {
        return deviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-devicename
     * 
     */
    public void setDeviceName(CharSequence deviceName) {
        this.deviceName = deviceName;
    }

    public BlockDeviceMapping withDeviceName(CharSequence deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * BlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html
     * 
     */
    public BlockDevice getEbs() {
        return ebs;
    }

    /**
     * BlockDevice
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html
     * 
     */
    public void setEbs(BlockDevice ebs) {
        this.ebs = ebs;
    }

    public BlockDeviceMapping withEbs(BlockDevice ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-nodevice
     * 
     */
    public Boolean getNoDevice() {
        return noDevice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-nodevice
     * 
     */
    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }

    public BlockDeviceMapping withNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-virtualname
     * 
     */
    public CharSequence getVirtualName() {
        return virtualName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-virtualname
     * 
     */
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
