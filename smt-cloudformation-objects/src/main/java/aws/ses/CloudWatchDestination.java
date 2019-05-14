
package aws.ses;

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
 * CloudWatchDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DimensionConfigurations"
})
public class CloudWatchDestination implements Property<CloudWatchDestination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations
     * 
     */
    @JsonProperty("DimensionConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations")
    private List<Property<DimensionConfiguration>> dimensionConfigurations = new ArrayList<Property<DimensionConfiguration>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations
     * 
     */
    @JsonIgnore
    public List<Property<DimensionConfiguration>> getDimensionConfigurations() {
        return dimensionConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations
     * 
     */
    @JsonIgnore
    public void setDimensionConfigurations(List<Property<DimensionConfiguration>> dimensionConfigurations) {
        this.dimensionConfigurations = dimensionConfigurations;
    }

    public CloudWatchDestination withDimensionConfigurations(List<Property<DimensionConfiguration>> dimensionConfigurations) {
        this.dimensionConfigurations = dimensionConfigurations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dimensionConfigurations", dimensionConfigurations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dimensionConfigurations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudWatchDestination) == false) {
            return false;
        }
        CloudWatchDestination rhs = ((CloudWatchDestination) other);
        return new EqualsBuilder().append(dimensionConfigurations, rhs.dimensionConfigurations).isEquals();
    }

}
