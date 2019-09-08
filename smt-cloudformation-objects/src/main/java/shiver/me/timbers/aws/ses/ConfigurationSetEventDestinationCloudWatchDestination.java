
package shiver.me.timbers.aws.ses;

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
 * ConfigurationSetEventDestinationCloudWatchDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DimensionConfigurations"
})
public class ConfigurationSetEventDestinationCloudWatchDestination implements Property<ConfigurationSetEventDestinationCloudWatchDestination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations
     * 
     */
    @JsonProperty("DimensionConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations")
    private List<Property<ConfigurationSetEventDestinationDimensionConfiguration>> dimensionConfigurations = new ArrayList<Property<ConfigurationSetEventDestinationDimensionConfiguration>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations
     * 
     */
    @JsonIgnore
    public List<Property<ConfigurationSetEventDestinationDimensionConfiguration>> getDimensionConfigurations() {
        return dimensionConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations
     * 
     */
    @JsonIgnore
    public void setDimensionConfigurations(List<Property<ConfigurationSetEventDestinationDimensionConfiguration>> dimensionConfigurations) {
        this.dimensionConfigurations = dimensionConfigurations;
    }

    public ConfigurationSetEventDestinationCloudWatchDestination withDimensionConfigurations(List<Property<ConfigurationSetEventDestinationDimensionConfiguration>> dimensionConfigurations) {
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
        if ((other instanceof ConfigurationSetEventDestinationCloudWatchDestination) == false) {
            return false;
        }
        ConfigurationSetEventDestinationCloudWatchDestination rhs = ((ConfigurationSetEventDestinationCloudWatchDestination) other);
        return new EqualsBuilder().append(dimensionConfigurations, rhs.dimensionConfigurations).isEquals();
    }

}
