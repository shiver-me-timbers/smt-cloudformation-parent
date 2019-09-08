
package shiver.me.timbers.aws.greengrass;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DeviceDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeviceDefinitionId",
    "Devices"
})
public class DeviceDefinitionVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid
     * 
     */
    @JsonProperty("DeviceDefinitionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid")
    private CharSequence deviceDefinitionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices
     * 
     */
    @JsonProperty("Devices")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices")
    private List<Property<DeviceDefinitionVersionDevice>> devices = new ArrayList<Property<DeviceDefinitionVersionDevice>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceDefinitionId() {
        return deviceDefinitionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid
     * 
     */
    @JsonIgnore
    public void setDeviceDefinitionId(CharSequence deviceDefinitionId) {
        this.deviceDefinitionId = deviceDefinitionId;
    }

    public DeviceDefinitionVersion withDeviceDefinitionId(CharSequence deviceDefinitionId) {
        this.deviceDefinitionId = deviceDefinitionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices
     * 
     */
    @JsonIgnore
    public List<Property<DeviceDefinitionVersionDevice>> getDevices() {
        return devices;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices
     * 
     */
    @JsonIgnore
    public void setDevices(List<Property<DeviceDefinitionVersionDevice>> devices) {
        this.devices = devices;
    }

    public DeviceDefinitionVersion withDevices(List<Property<DeviceDefinitionVersionDevice>> devices) {
        this.devices = devices;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceDefinitionId", deviceDefinitionId).append("devices", devices).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(devices).append(deviceDefinitionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceDefinitionVersion) == false) {
            return false;
        }
        DeviceDefinitionVersion rhs = ((DeviceDefinitionVersion) other);
        return new EqualsBuilder().append(devices, rhs.devices).append(deviceDefinitionId, rhs.deviceDefinitionId).isEquals();
    }

}
