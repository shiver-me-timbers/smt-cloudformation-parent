
package aws.appmesh;

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
 * RouteHttpRouteHeader
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Invert",
    "Name",
    "Match"
})
public class RouteHttpRouteHeader implements Property<RouteHttpRouteHeader>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert
     * 
     */
    @JsonProperty("Invert")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert")
    private CharSequence invert;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name")
    private CharSequence name;
    /**
     * RouteHeaderMatchMethod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html
     * 
     */
    @JsonProperty("Match")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html")
    private Property<RouteHeaderMatchMethod> match;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert
     * 
     */
    @JsonIgnore
    public CharSequence getInvert() {
        return invert;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert
     * 
     */
    @JsonIgnore
    public void setInvert(CharSequence invert) {
        this.invert = invert;
    }

    public RouteHttpRouteHeader withInvert(CharSequence invert) {
        this.invert = invert;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RouteHttpRouteHeader withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * RouteHeaderMatchMethod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html
     * 
     */
    @JsonIgnore
    public Property<RouteHeaderMatchMethod> getMatch() {
        return match;
    }

    /**
     * RouteHeaderMatchMethod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html
     * 
     */
    @JsonIgnore
    public void setMatch(Property<RouteHeaderMatchMethod> match) {
        this.match = match;
    }

    public RouteHttpRouteHeader withMatch(Property<RouteHeaderMatchMethod> match) {
        this.match = match;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("invert", invert).append("name", name).append("match", match).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(match).append(invert).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteHttpRouteHeader) == false) {
            return false;
        }
        RouteHttpRouteHeader rhs = ((RouteHttpRouteHeader) other);
        return new EqualsBuilder().append(name, rhs.name).append(match, rhs.match).append(invert, rhs.invert).isEquals();
    }

}
