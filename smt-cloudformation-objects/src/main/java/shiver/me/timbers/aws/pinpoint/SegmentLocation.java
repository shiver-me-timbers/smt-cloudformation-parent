
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
 * SegmentLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GPSPoint",
    "Country"
})
public class SegmentLocation implements Property<SegmentLocation>
{

    /**
     * SegmentGPSPoint
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html
     * 
     */
    @JsonProperty("GPSPoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html")
    private Property<SegmentGPSPoint> gPSPoint;
    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html")
    private Property<SegmentSetDimension> country;

    /**
     * SegmentGPSPoint
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html
     * 
     */
    @JsonIgnore
    public Property<SegmentGPSPoint> getGPSPoint() {
        return gPSPoint;
    }

    /**
     * SegmentGPSPoint
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location-gpspoint.html
     * 
     */
    @JsonIgnore
    public void setGPSPoint(Property<SegmentGPSPoint> gPSPoint) {
        this.gPSPoint = gPSPoint;
    }

    public SegmentLocation withGPSPoint(Property<SegmentGPSPoint> gPSPoint) {
        this.gPSPoint = gPSPoint;
        return this;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<SegmentSetDimension> getCountry() {
        return country;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public void setCountry(Property<SegmentSetDimension> country) {
        this.country = country;
    }

    public SegmentLocation withCountry(Property<SegmentSetDimension> country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gPSPoint", gPSPoint).append("country", country).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(gPSPoint).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegmentLocation) == false) {
            return false;
        }
        SegmentLocation rhs = ((SegmentLocation) other);
        return new EqualsBuilder().append(country, rhs.country).append(gPSPoint, rhs.gPSPoint).isEquals();
    }

}
