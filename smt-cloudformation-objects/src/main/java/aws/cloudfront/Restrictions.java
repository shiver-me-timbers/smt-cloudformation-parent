
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Restrictions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GeoRestriction"
})
public class Restrictions {

    /**
     * GeoRestriction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
     * 
     */
    @JsonProperty("GeoRestriction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html")
    private GeoRestriction geoRestriction;

    /**
     * GeoRestriction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
     * 
     */
    public GeoRestriction getGeoRestriction() {
        return geoRestriction;
    }

    /**
     * GeoRestriction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html
     * 
     */
    public void setGeoRestriction(GeoRestriction geoRestriction) {
        this.geoRestriction = geoRestriction;
    }

    public Restrictions withGeoRestriction(GeoRestriction geoRestriction) {
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
        if ((other instanceof Restrictions) == false) {
            return false;
        }
        Restrictions rhs = ((Restrictions) other);
        return new EqualsBuilder().append(geoRestriction, rhs.geoRestriction).isEquals();
    }

}
