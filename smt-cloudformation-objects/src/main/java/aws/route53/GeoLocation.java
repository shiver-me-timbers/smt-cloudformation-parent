
package aws.route53;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GeoLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContinentCode",
    "CountryCode",
    "SubdivisionCode"
})
public class GeoLocation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-continentcode
     * 
     */
    @JsonProperty("ContinentCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-continentcode")
    private String continentCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode
     * 
     */
    @JsonProperty("CountryCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode")
    private String countryCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode
     * 
     */
    @JsonProperty("SubdivisionCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode")
    private String subdivisionCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-continentcode
     * 
     */
    @JsonProperty("ContinentCode")
    public String getContinentCode() {
        return continentCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-continentcode
     * 
     */
    @JsonProperty("ContinentCode")
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public GeoLocation withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode
     * 
     */
    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode
     * 
     */
    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public GeoLocation withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode
     * 
     */
    @JsonProperty("SubdivisionCode")
    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode
     * 
     */
    @JsonProperty("SubdivisionCode")
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    public GeoLocation withSubdivisionCode(String subdivisionCode) {
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
        if ((other instanceof GeoLocation) == false) {
            return false;
        }
        GeoLocation rhs = ((GeoLocation) other);
        return new EqualsBuilder().append(subdivisionCode, rhs.subdivisionCode).append(countryCode, rhs.countryCode).append(continentCode, rhs.continentCode).isEquals();
    }

}
