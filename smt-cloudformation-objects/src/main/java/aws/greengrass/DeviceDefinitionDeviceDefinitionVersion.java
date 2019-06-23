
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
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
 * DeviceDefinitionDeviceDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Devices"
})
public class DeviceDefinitionDeviceDefinitionVersion implements Property<DeviceDefinitionDeviceDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices
     * 
     */
    @JsonProperty("Devices")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices")
    private List<Property<DeviceDefinitionDevice>> devices = new ArrayList<Property<DeviceDefinitionDevice>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices
     * 
     */
    @JsonIgnore
    public List<Property<DeviceDefinitionDevice>> getDevices() {
        return devices;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices
     * 
     */
    @JsonIgnore
    public void setDevices(List<Property<DeviceDefinitionDevice>> devices) {
        this.devices = devices;
    }

    public DeviceDefinitionDeviceDefinitionVersion withDevices(List<Property<DeviceDefinitionDevice>> devices) {
        this.devices = devices;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("devices", devices).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(devices).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceDefinitionDeviceDefinitionVersion) == false) {
            return false;
        }
        DeviceDefinitionDeviceDefinitionVersion rhs = ((DeviceDefinitionDeviceDefinitionVersion) other);
        return new EqualsBuilder().append(devices, rhs.devices).isEquals();
    }

}
