
package shiver.me.timbers.aws.pinpoint;

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
 * SegmentGPSPoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RangeInKilometers",
    "Coordinates"
})
public class SegmentGPSPoint implements Property<SegmentGPSPoint>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html#cfn-pinpoint-segment-segmentdimensions-location-gpspoint-rangeinkilometers
     * 
     */
    @JsonProperty("RangeInKilometers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html#cfn-pinpoint-segment-segmentdimensions-location-gpspoint-rangeinkilometers")
    private Number rangeInKilometers;
    /**
     * SegmentCoordinates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint-coordinates.html
     * 
     */
    @JsonProperty("Coordinates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint-coordinates.html")
    private Property<SegmentCoordinates> coordinates;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html#cfn-pinpoint-segment-segmentdimensions-location-gpspoint-rangeinkilometers
     * 
     */
    @JsonIgnore
    public Number getRangeInKilometers() {
        return rangeInKilometers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html#cfn-pinpoint-segment-segmentdimensions-location-gpspoint-rangeinkilometers
     * 
     */
    @JsonIgnore
    public void setRangeInKilometers(Number rangeInKilometers) {
        this.rangeInKilometers = rangeInKilometers;
    }

    public SegmentGPSPoint withRangeInKilometers(Number rangeInKilometers) {
        this.rangeInKilometers = rangeInKilometers;
        return this;
    }

    /**
     * SegmentCoordinates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint-coordinates.html
     * 
     */
    @JsonIgnore
    public Property<SegmentCoordinates> getCoordinates() {
        return coordinates;
    }

    /**
     * SegmentCoordinates
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint-coordinates.html
     * 
     */
    @JsonIgnore
    public void setCoordinates(Property<SegmentCoordinates> coordinates) {
        this.coordinates = coordinates;
    }

    public SegmentGPSPoint withCoordinates(Property<SegmentCoordinates> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rangeInKilometers", rangeInKilometers).append("coordinates", coordinates).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(coordinates).append(rangeInKilometers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegmentGPSPoint) == false) {
            return false;
        }
        SegmentGPSPoint rhs = ((SegmentGPSPoint) other);
        return new EqualsBuilder().append(coordinates, rhs.coordinates).append(rangeInKilometers, rhs.rangeInKilometers).isEquals();
    }

}
