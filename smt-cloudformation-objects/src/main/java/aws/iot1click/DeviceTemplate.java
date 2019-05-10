
package aws.iot1click;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeviceTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeviceType",
    "CallbackOverrides"
})
public class DeviceTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype
     * 
     */
    @JsonProperty("DeviceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype")
    private CharSequence deviceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides
     * 
     */
    @JsonProperty("CallbackOverrides")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides")
    private Object callbackOverrides;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceType() {
        return deviceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype
     * 
     */
    @JsonIgnore
    public void setDeviceType(CharSequence deviceType) {
        this.deviceType = deviceType;
    }

    public DeviceTemplate withDeviceType(CharSequence deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides
     * 
     */
    @JsonIgnore
    public Object getCallbackOverrides() {
        return callbackOverrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides
     * 
     */
    @JsonIgnore
    public void setCallbackOverrides(Object callbackOverrides) {
        this.callbackOverrides = callbackOverrides;
    }

    public DeviceTemplate withCallbackOverrides(Object callbackOverrides) {
        this.callbackOverrides = callbackOverrides;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceType", deviceType).append("callbackOverrides", callbackOverrides).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deviceType).append(callbackOverrides).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceTemplate) == false) {
            return false;
        }
        DeviceTemplate rhs = ((DeviceTemplate) other);
        return new EqualsBuilder().append(deviceType, rhs.deviceType).append(callbackOverrides, rhs.callbackOverrides).isEquals();
    }

}
