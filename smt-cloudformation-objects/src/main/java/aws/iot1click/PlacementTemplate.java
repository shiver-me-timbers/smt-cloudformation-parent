
package aws.iot1click;

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
 * PlacementTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeviceTemplates",
    "DefaultAttributes"
})
public class PlacementTemplate implements Property<PlacementTemplate>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates
     * 
     */
    @JsonProperty("DeviceTemplates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates")
    private Object deviceTemplates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes
     * 
     */
    @JsonProperty("DefaultAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes")
    private Object defaultAttributes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates
     * 
     */
    @JsonIgnore
    public Object getDeviceTemplates() {
        return deviceTemplates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates
     * 
     */
    @JsonIgnore
    public void setDeviceTemplates(Object deviceTemplates) {
        this.deviceTemplates = deviceTemplates;
    }

    public PlacementTemplate withDeviceTemplates(Object deviceTemplates) {
        this.deviceTemplates = deviceTemplates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes
     * 
     */
    @JsonIgnore
    public Object getDefaultAttributes() {
        return defaultAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes
     * 
     */
    @JsonIgnore
    public void setDefaultAttributes(Object defaultAttributes) {
        this.defaultAttributes = defaultAttributes;
    }

    public PlacementTemplate withDefaultAttributes(Object defaultAttributes) {
        this.defaultAttributes = defaultAttributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceTemplates", deviceTemplates).append("defaultAttributes", defaultAttributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deviceTemplates).append(defaultAttributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlacementTemplate) == false) {
            return false;
        }
        PlacementTemplate rhs = ((PlacementTemplate) other);
        return new EqualsBuilder().append(deviceTemplates, rhs.deviceTemplates).append(defaultAttributes, rhs.defaultAttributes).isEquals();
    }

}
