
package shiver.me.timbers.aws.batch;

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
 * JobDefinitionLinuxParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Devices"
})
public class JobDefinitionLinuxParameters implements Property<JobDefinitionLinuxParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html#cfn-batch-jobdefinition-containerproperties-linuxparameters-devices
     * 
     */
    @JsonProperty("Devices")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html#cfn-batch-jobdefinition-containerproperties-linuxparameters-devices")
    private List<Property<JobDefinitionDevice>> devices = new ArrayList<Property<JobDefinitionDevice>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html#cfn-batch-jobdefinition-containerproperties-linuxparameters-devices
     * 
     */
    @JsonIgnore
    public List<Property<JobDefinitionDevice>> getDevices() {
        return devices;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html#cfn-batch-jobdefinition-containerproperties-linuxparameters-devices
     * 
     */
    @JsonIgnore
    public void setDevices(List<Property<JobDefinitionDevice>> devices) {
        this.devices = devices;
    }

    public JobDefinitionLinuxParameters withDevices(List<Property<JobDefinitionDevice>> devices) {
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
        if ((other instanceof JobDefinitionLinuxParameters) == false) {
            return false;
        }
        JobDefinitionLinuxParameters rhs = ((JobDefinitionLinuxParameters) other);
        return new EqualsBuilder().append(devices, rhs.devices).isEquals();
    }

}
