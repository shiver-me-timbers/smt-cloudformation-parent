
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PlacementType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AvailabilityZone"
})
public class PlacementType {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone")
    private CharSequence availabilityZone;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone
     * 
     */
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public PlacementType withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("availabilityZone", availabilityZone).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(availabilityZone).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlacementType) == false) {
            return false;
        }
        PlacementType rhs = ((PlacementType) other);
        return new EqualsBuilder().append(availabilityZone, rhs.availabilityZone).isEquals();
    }

}
