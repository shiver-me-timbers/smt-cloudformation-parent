
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
 * RouteGrpcRouteMetadataMatchMethod
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Suffix",
    "Regex",
    "Exact",
    "Prefix",
    "Range"
})
public class RouteGrpcRouteMetadataMatchMethod implements Property<RouteGrpcRouteMetadataMatchMethod>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix
     * 
     */
    @JsonProperty("Suffix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix")
    private CharSequence suffix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex
     * 
     */
    @JsonProperty("Regex")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex")
    private CharSequence regex;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact
     * 
     */
    @JsonProperty("Exact")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact")
    private CharSequence exact;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix")
    private CharSequence prefix;
    /**
     * RouteMatchRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html
     * 
     */
    @JsonProperty("Range")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html")
    private Property<RouteMatchRange> range;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix
     * 
     */
    @JsonIgnore
    public CharSequence getSuffix() {
        return suffix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix
     * 
     */
    @JsonIgnore
    public void setSuffix(CharSequence suffix) {
        this.suffix = suffix;
    }

    public RouteGrpcRouteMetadataMatchMethod withSuffix(CharSequence suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex
     * 
     */
    @JsonIgnore
    public CharSequence getRegex() {
        return regex;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex
     * 
     */
    @JsonIgnore
    public void setRegex(CharSequence regex) {
        this.regex = regex;
    }

    public RouteGrpcRouteMetadataMatchMethod withRegex(CharSequence regex) {
        this.regex = regex;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact
     * 
     */
    @JsonIgnore
    public CharSequence getExact() {
        return exact;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact
     * 
     */
    @JsonIgnore
    public void setExact(CharSequence exact) {
        this.exact = exact;
    }

    public RouteGrpcRouteMetadataMatchMethod withExact(CharSequence exact) {
        this.exact = exact;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix
     * 
     */
    @JsonIgnore
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix
     * 
     */
    @JsonIgnore
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public RouteGrpcRouteMetadataMatchMethod withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * RouteMatchRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html
     * 
     */
    @JsonIgnore
    public Property<RouteMatchRange> getRange() {
        return range;
    }

    /**
     * RouteMatchRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html
     * 
     */
    @JsonIgnore
    public void setRange(Property<RouteMatchRange> range) {
        this.range = range;
    }

    public RouteGrpcRouteMetadataMatchMethod withRange(Property<RouteMatchRange> range) {
        this.range = range;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("suffix", suffix).append("regex", regex).append("exact", exact).append("prefix", prefix).append("range", range).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(exact).append(range).append(regex).append(suffix).append(prefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteGrpcRouteMetadataMatchMethod) == false) {
            return false;
        }
        RouteGrpcRouteMetadataMatchMethod rhs = ((RouteGrpcRouteMetadataMatchMethod) other);
        return new EqualsBuilder().append(exact, rhs.exact).append(range, rhs.range).append(regex, rhs.regex).append(suffix, rhs.suffix).append(prefix, rhs.prefix).isEquals();
    }

}
