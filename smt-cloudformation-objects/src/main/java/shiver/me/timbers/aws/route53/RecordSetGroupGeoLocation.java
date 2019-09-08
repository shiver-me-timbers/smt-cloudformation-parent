
package shiver.me.timbers.aws.route53;

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
 * RecordSetGroupGeoLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContinentCode",
    "CountryCode",
    "SubdivisionCode"
})
public class RecordSetGroupGeoLocation implements Property<RecordSetGroupGeoLocation>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode
     * 
     */
    @JsonProperty("ContinentCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode")
    private CharSequence continentCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode
     * 
     */
    @JsonProperty("CountryCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode")
    private CharSequence countryCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode
     * 
     */
    @JsonProperty("SubdivisionCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode")
    private CharSequence subdivisionCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode
     * 
     */
    @JsonIgnore
    public CharSequence getContinentCode() {
        return continentCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode
     * 
     */
    @JsonIgnore
    public void setContinentCode(CharSequence continentCode) {
        this.continentCode = continentCode;
    }

    public RecordSetGroupGeoLocation withContinentCode(CharSequence continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode
     * 
     */
    @JsonIgnore
    public CharSequence getCountryCode() {
        return countryCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode
     * 
     */
    @JsonIgnore
    public void setCountryCode(CharSequence countryCode) {
        this.countryCode = countryCode;
    }

    public RecordSetGroupGeoLocation withCountryCode(CharSequence countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode
     * 
     */
    @JsonIgnore
    public CharSequence getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode
     * 
     */
    @JsonIgnore
    public void setSubdivisionCode(CharSequence subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    public RecordSetGroupGeoLocation withSubdivisionCode(CharSequence subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("continentCode", continentCode).append("countryCode", countryCode).append("subdivisionCode", subdivisionCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subdivisionCode).append(countryCode).append(continentCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordSetGroupGeoLocation) == false) {
            return false;
        }
        RecordSetGroupGeoLocation rhs = ((RecordSetGroupGeoLocation) other);
        return new EqualsBuilder().append(subdivisionCode, rhs.subdivisionCode).append(countryCode, rhs.countryCode).append(continentCode, rhs.continentCode).isEquals();
    }

}
