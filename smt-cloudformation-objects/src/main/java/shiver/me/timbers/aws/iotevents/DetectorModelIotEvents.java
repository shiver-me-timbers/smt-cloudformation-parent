
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelIotEvents
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InputName"
})
public class DetectorModelIotEvents implements Property<DetectorModelIotEvents>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-inputname
     * 
     */
    @JsonProperty("InputName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-inputname")
    private CharSequence inputName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-inputname
     * 
     */
    @JsonIgnore
    public CharSequence getInputName() {
        return inputName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-inputname
     * 
     */
    @JsonIgnore
    public void setInputName(CharSequence inputName) {
        this.inputName = inputName;
    }

    public DetectorModelIotEvents withInputName(CharSequence inputName) {
        this.inputName = inputName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("inputName", inputName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelIotEvents) == false) {
            return false;
        }
        DetectorModelIotEvents rhs = ((DetectorModelIotEvents) other);
        return new EqualsBuilder().append(inputName, rhs.inputName).isEquals();
    }

}
