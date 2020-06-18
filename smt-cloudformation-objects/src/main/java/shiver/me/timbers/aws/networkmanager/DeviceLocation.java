
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
 * DeviceLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Address",
    "Latitude",
    "Longitude"
})
public class DeviceLocation implements Property<DeviceLocation>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-address
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-address")
    private CharSequence address;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-latitude
     * 
     */
    @JsonProperty("Latitude")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-latitude")
    private CharSequence latitude;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-longitude
     * 
     */
    @JsonProperty("Longitude")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-longitude")
    private CharSequence longitude;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-address
     * 
     */
    @JsonIgnore
    public CharSequence getAddress() {
        return address;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-address
     * 
     */
    @JsonIgnore
    public void setAddress(CharSequence address) {
        this.address = address;
    }

    public DeviceLocation withAddress(CharSequence address) {
        this.address = address;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-latitude
     * 
     */
    @JsonIgnore
    public CharSequence getLatitude() {
        return latitude;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-latitude
     * 
     */
    @JsonIgnore
    public void setLatitude(CharSequence latitude) {
        this.latitude = latitude;
    }

    public DeviceLocation withLatitude(CharSequence latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-longitude
     * 
     */
    @JsonIgnore
    public CharSequence getLongitude() {
        return longitude;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-device-location.html#cfn-networkmanager-device-location-longitude
     * 
     */
    @JsonIgnore
    public void setLongitude(CharSequence longitude) {
        this.longitude = longitude;
    }

    public DeviceLocation withLongitude(CharSequence longitude) {
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
        if ((other instanceof DeviceLocation) == false) {
            return false;
        }
        DeviceLocation rhs = ((DeviceLocation) other);
        return new EqualsBuilder().append(address, rhs.address).append(latitude, rhs.latitude).append(longitude, rhs.longitude).isEquals();
    }

}
