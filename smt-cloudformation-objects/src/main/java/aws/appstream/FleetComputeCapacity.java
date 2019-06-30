
package aws.appstream;

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
 * FleetComputeCapacity
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DesiredInstances"
})
public class FleetComputeCapacity implements Property<FleetComputeCapacity>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredinstances
     * 
     */
    @JsonProperty("DesiredInstances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredinstances")
    private Number desiredInstances;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredinstances
     * 
     */
    @JsonIgnore
    public Number getDesiredInstances() {
        return desiredInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredinstances
     * 
     */
    @JsonIgnore
    public void setDesiredInstances(Number desiredInstances) {
        this.desiredInstances = desiredInstances;
    }

    public FleetComputeCapacity withDesiredInstances(Number desiredInstances) {
        this.desiredInstances = desiredInstances;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("desiredInstances", desiredInstances).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(desiredInstances).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FleetComputeCapacity) == false) {
            return false;
        }
        FleetComputeCapacity rhs = ((FleetComputeCapacity) other);
        return new EqualsBuilder().append(desiredInstances, rhs.desiredInstances).isEquals();
    }

}
