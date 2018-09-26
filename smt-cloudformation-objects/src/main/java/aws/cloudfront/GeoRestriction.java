
package aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GeoRestriction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Locations",
    "RestrictionType"
})
public class GeoRestriction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations
     * 
     */
    @JsonProperty("Locations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations")
    private List<CharSequence> locations = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype
     * 
     */
    @JsonProperty("RestrictionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype")
    private CharSequence restrictionType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations
     * 
     */
    public List<CharSequence> getLocations() {
        return locations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations
     * 
     */
    public void setLocations(List<CharSequence> locations) {
        this.locations = locations;
    }

    public GeoRestriction withLocations(List<CharSequence> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype
     * 
     */
    public CharSequence getRestrictionType() {
        return restrictionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype
     * 
     */
    public void setRestrictionType(CharSequence restrictionType) {
        this.restrictionType = restrictionType;
    }

    public GeoRestriction withRestrictionType(CharSequence restrictionType) {
        this.restrictionType = restrictionType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("locations", locations).append("restrictionType", restrictionType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(locations).append(restrictionType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoRestriction) == false) {
            return false;
        }
        GeoRestriction rhs = ((GeoRestriction) other);
        return new EqualsBuilder().append(locations, rhs.locations).append(restrictionType, rhs.restrictionType).isEquals();
    }

}
