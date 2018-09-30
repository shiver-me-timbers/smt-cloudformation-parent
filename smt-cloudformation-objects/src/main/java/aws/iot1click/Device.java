
package aws.iot1click;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Device
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeviceId",
    "Enabled"
})
public class Device {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid
     * 
     */
    @JsonProperty("DeviceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid")
    private CharSequence deviceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled")
    private Boolean enabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid
     * 
     */
    public CharSequence getDeviceId() {
        return deviceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid
     * 
     */
    public void setDeviceId(CharSequence deviceId) {
        this.deviceId = deviceId;
    }

    public Device withDeviceId(CharSequence deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Device withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceId", deviceId).append("enabled", enabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deviceId).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device) == false) {
            return false;
        }
        Device rhs = ((Device) other);
        return new EqualsBuilder().append(deviceId, rhs.deviceId).append(enabled, rhs.enabled).isEquals();
    }

}
