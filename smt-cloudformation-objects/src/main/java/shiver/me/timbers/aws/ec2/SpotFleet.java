
package shiver.me.timbers.aws.ec2;

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
 * SpotFleet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SpotFleetRequestConfigData"
})
public class SpotFleet {

    /**
     * SpotFleetSpotFleetRequestConfigData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
     * 
     */
    @JsonProperty("SpotFleetRequestConfigData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html")
    private Property<SpotFleetSpotFleetRequestConfigData> spotFleetRequestConfigData;

    /**
     * SpotFleetSpotFleetRequestConfigData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetSpotFleetRequestConfigData> getSpotFleetRequestConfigData() {
        return spotFleetRequestConfigData;
    }

    /**
     * SpotFleetSpotFleetRequestConfigData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
     * 
     */
    @JsonIgnore
    public void setSpotFleetRequestConfigData(Property<SpotFleetSpotFleetRequestConfigData> spotFleetRequestConfigData) {
        this.spotFleetRequestConfigData = spotFleetRequestConfigData;
    }

    public SpotFleet withSpotFleetRequestConfigData(Property<SpotFleetSpotFleetRequestConfigData> spotFleetRequestConfigData) {
        this.spotFleetRequestConfigData = spotFleetRequestConfigData;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spotFleetRequestConfigData", spotFleetRequestConfigData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(spotFleetRequestConfigData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpotFleet) == false) {
            return false;
        }
        SpotFleet rhs = ((SpotFleet) other);
        return new EqualsBuilder().append(spotFleetRequestConfigData, rhs.spotFleetRequestConfigData).isEquals();
    }

}
