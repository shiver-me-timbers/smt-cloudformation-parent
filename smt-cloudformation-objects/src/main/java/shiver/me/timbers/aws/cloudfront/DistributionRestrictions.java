
package shiver.me.timbers.aws.cloudfront;

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
 * DistributionRestrictions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GeoRestriction"
})
public class DistributionRestrictions implements Property<DistributionRestrictions>
{

    /**
     * DistributionGeoRestriction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
     * 
     */
    @JsonProperty("GeoRestriction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html")
    private Property<DistributionGeoRestriction> geoRestriction;

    /**
     * DistributionGeoRestriction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
     * 
     */
    @JsonIgnore
    public Property<DistributionGeoRestriction> getGeoRestriction() {
        return geoRestriction;
    }

    /**
     * DistributionGeoRestriction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
     * 
     */
    @JsonIgnore
    public void setGeoRestriction(Property<DistributionGeoRestriction> geoRestriction) {
        this.geoRestriction = geoRestriction;
    }

    public DistributionRestrictions withGeoRestriction(Property<DistributionGeoRestriction> geoRestriction) {
        this.geoRestriction = geoRestriction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("geoRestriction", geoRestriction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geoRestriction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionRestrictions) == false) {
            return false;
        }
        DistributionRestrictions rhs = ((DistributionRestrictions) other);
        return new EqualsBuilder().append(geoRestriction, rhs.geoRestriction).isEquals();
    }

}
