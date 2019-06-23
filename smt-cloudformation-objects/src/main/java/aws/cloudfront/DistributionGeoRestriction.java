
package aws.cloudfront;

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
 * DistributionGeoRestriction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Locations",
    "RestrictionType"
})
public class DistributionGeoRestriction implements Property<DistributionGeoRestriction>
{

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
    @JsonIgnore
    public List<CharSequence> getLocations() {
        return locations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations
     * 
     */
    @JsonIgnore
    public void setLocations(List<CharSequence> locations) {
        this.locations = locations;
    }

    public DistributionGeoRestriction withLocations(List<CharSequence> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype
     * 
     */
    @JsonIgnore
    public CharSequence getRestrictionType() {
        return restrictionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype
     * 
     */
    @JsonIgnore
    public void setRestrictionType(CharSequence restrictionType) {
        this.restrictionType = restrictionType;
    }

    public DistributionGeoRestriction withRestrictionType(CharSequence restrictionType) {
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
        if ((other instanceof DistributionGeoRestriction) == false) {
            return false;
        }
        DistributionGeoRestriction rhs = ((DistributionGeoRestriction) other);
        return new EqualsBuilder().append(locations, rhs.locations).append(restrictionType, rhs.restrictionType).isEquals();
    }

}
