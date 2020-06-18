
package shiver.me.timbers.aws.appmesh;

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
 * RouteGrpcRouteMetadata
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Invert",
    "Name",
    "Match"
})
public class RouteGrpcRouteMetadata implements Property<RouteGrpcRouteMetadata>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert
     * 
     */
    @JsonProperty("Invert")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert")
    private CharSequence invert;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name")
    private CharSequence name;
    /**
     * RouteGrpcRouteMetadataMatchMethod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html
     * 
     */
    @JsonProperty("Match")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html")
    private Property<RouteGrpcRouteMetadataMatchMethod> match;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert
     * 
     */
    @JsonIgnore
    public CharSequence getInvert() {
        return invert;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert
     * 
     */
    @JsonIgnore
    public void setInvert(CharSequence invert) {
        this.invert = invert;
    }

    public RouteGrpcRouteMetadata withInvert(CharSequence invert) {
        this.invert = invert;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RouteGrpcRouteMetadata withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * RouteGrpcRouteMetadataMatchMethod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html
     * 
     */
    @JsonIgnore
    public Property<RouteGrpcRouteMetadataMatchMethod> getMatch() {
        return match;
    }

    /**
     * RouteGrpcRouteMetadataMatchMethod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html
     * 
     */
    @JsonIgnore
    public void setMatch(Property<RouteGrpcRouteMetadataMatchMethod> match) {
        this.match = match;
    }

    public RouteGrpcRouteMetadata withMatch(Property<RouteGrpcRouteMetadataMatchMethod> match) {
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
        if ((other instanceof RouteGrpcRouteMetadata) == false) {
            return false;
        }
        RouteGrpcRouteMetadata rhs = ((RouteGrpcRouteMetadata) other);
        return new EqualsBuilder().append(name, rhs.name).append(match, rhs.match).append(invert, rhs.invert).isEquals();
    }

}
