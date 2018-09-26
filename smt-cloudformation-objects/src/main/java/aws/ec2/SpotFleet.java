
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotFleet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SpotFleetRequestConfigData"
})
public class SpotFleet {

    /**
     * SpotFleetRequestConfigData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
     * 
     */
    @JsonProperty("SpotFleetRequestConfigData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html")
    private SpotFleetRequestConfigData spotFleetRequestConfigData;

    /**
     * SpotFleetRequestConfigData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
     * 
     */
    public SpotFleetRequestConfigData getSpotFleetRequestConfigData() {
        return spotFleetRequestConfigData;
    }

    /**
     * SpotFleetRequestConfigData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
     * 
     */
    public void setSpotFleetRequestConfigData(SpotFleetRequestConfigData spotFleetRequestConfigData) {
        this.spotFleetRequestConfigData = spotFleetRequestConfigData;
    }

    public SpotFleet withSpotFleetRequestConfigData(SpotFleetRequestConfigData spotFleetRequestConfigData) {
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
