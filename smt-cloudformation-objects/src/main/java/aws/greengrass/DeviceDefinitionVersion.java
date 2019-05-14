
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
 * DeviceDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Devices"
})
public class DeviceDefinitionVersion implements Property<DeviceDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices
     * 
     */
    @JsonProperty("Devices")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices")
    private List<Property<Device>> devices = new ArrayList<Property<Device>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices
     * 
     */
    @JsonIgnore
    public List<Property<Device>> getDevices() {
        return devices;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html#cfn-greengrass-devicedefinition-devicedefinitionversion-devices
     * 
     */
    @JsonIgnore
    public void setDevices(List<Property<Device>> devices) {
        this.devices = devices;
    }

    public DeviceDefinitionVersion withDevices(List<Property<Device>> devices) {
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
        if ((other instanceof DeviceDefinitionVersion) == false) {
            return false;
        }
        DeviceDefinitionVersion rhs = ((DeviceDefinitionVersion) other);
        return new EqualsBuilder().append(devices, rhs.devices).isEquals();
    }

}
