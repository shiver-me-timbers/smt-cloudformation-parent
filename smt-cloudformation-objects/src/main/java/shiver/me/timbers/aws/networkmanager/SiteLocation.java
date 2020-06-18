
package shiver.me.timbers.aws.networkmanager;

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
 * SiteLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Address",
    "Latitude",
    "Longitude"
})
public class SiteLocation implements Property<SiteLocation>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-address
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-address")
    private CharSequence address;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-latitude
     * 
     */
    @JsonProperty("Latitude")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-latitude")
    private CharSequence latitude;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-longitude
     * 
     */
    @JsonProperty("Longitude")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-longitude")
    private CharSequence longitude;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-address
     * 
     */
    @JsonIgnore
    public CharSequence getAddress() {
        return address;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-address
     * 
     */
    @JsonIgnore
    public void setAddress(CharSequence address) {
        this.address = address;
    }

    public SiteLocation withAddress(CharSequence address) {
        this.address = address;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-latitude
     * 
     */
    @JsonIgnore
    public CharSequence getLatitude() {
        return latitude;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-latitude
     * 
     */
    @JsonIgnore
    public void setLatitude(CharSequence latitude) {
        this.latitude = latitude;
    }

    public SiteLocation withLatitude(CharSequence latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-longitude
     * 
     */
    @JsonIgnore
    public CharSequence getLongitude() {
        return longitude;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-longitude
     * 
     */
    @JsonIgnore
    public void setLongitude(CharSequence longitude) {
        this.longitude = longitude;
    }

    public SiteLocation withLongitude(CharSequence longitude) {
        this.longitude = longitude;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("address", address).append("latitude", latitude).append("longitude", longitude).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(address).append(latitude).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SiteLocation) == false) {
            return false;
        }
        SiteLocation rhs = ((SiteLocation) other);
        return new EqualsBuilder().append(address, rhs.address).append(latitude, rhs.latitude).append(longitude, rhs.longitude).isEquals();
    }

}
