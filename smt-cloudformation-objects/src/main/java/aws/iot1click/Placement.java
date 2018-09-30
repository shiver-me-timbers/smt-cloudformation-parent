
package aws.iot1click;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Placement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PlacementName",
    "ProjectName",
    "AssociatedDevices",
    "Attributes"
})
public class Placement {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname
     * 
     */
    @JsonProperty("PlacementName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname")
    private CharSequence placementName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname
     * 
     */
    @JsonProperty("ProjectName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname")
    private CharSequence projectName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices
     * 
     */
    @JsonProperty("AssociatedDevices")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices")
    private Object associatedDevices;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes")
    private Object attributes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname
     * 
     */
    public CharSequence getPlacementName() {
        return placementName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname
     * 
     */
    public void setPlacementName(CharSequence placementName) {
        this.placementName = placementName;
    }

    public Placement withPlacementName(CharSequence placementName) {
        this.placementName = placementName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname
     * 
     */
    public CharSequence getProjectName() {
        return projectName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname
     * 
     */
    public void setProjectName(CharSequence projectName) {
        this.projectName = projectName;
    }

    public Placement withProjectName(CharSequence projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices
     * 
     */
    public Object getAssociatedDevices() {
        return associatedDevices;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices
     * 
     */
    public void setAssociatedDevices(Object associatedDevices) {
        this.associatedDevices = associatedDevices;
    }

    public Placement withAssociatedDevices(Object associatedDevices) {
        this.associatedDevices = associatedDevices;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes
     * 
     */
    public Object getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes
     * 
     */
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public Placement withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("placementName", placementName).append("projectName", projectName).append("associatedDevices", associatedDevices).append("attributes", attributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).append(associatedDevices).append(projectName).append(placementName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Placement) == false) {
            return false;
        }
        Placement rhs = ((Placement) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(associatedDevices, rhs.associatedDevices).append(projectName, rhs.projectName).append(placementName, rhs.placementName).isEquals();
    }

}
