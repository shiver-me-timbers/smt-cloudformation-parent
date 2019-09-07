
package aws.appmesh;

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
 * RouteHttpRouteMatch
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Scheme",
    "Headers",
    "Prefix",
    "Method"
})
public class RouteHttpRouteMatch implements Property<RouteHttpRouteMatch>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme
     * 
     */
    @JsonProperty("Scheme")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme")
    private CharSequence scheme;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers
     * 
     */
    @JsonProperty("Headers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers")
    private List<Property<RouteHttpRouteHeader>> headers = new ArrayList<Property<RouteHttpRouteHeader>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix")
    private CharSequence prefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method
     * 
     */
    @JsonProperty("Method")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method")
    private CharSequence method;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme
     * 
     */
    @JsonIgnore
    public CharSequence getScheme() {
        return scheme;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme
     * 
     */
    @JsonIgnore
    public void setScheme(CharSequence scheme) {
        this.scheme = scheme;
    }

    public RouteHttpRouteMatch withScheme(CharSequence scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers
     * 
     */
    @JsonIgnore
    public List<Property<RouteHttpRouteHeader>> getHeaders() {
        return headers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers
     * 
     */
    @JsonIgnore
    public void setHeaders(List<Property<RouteHttpRouteHeader>> headers) {
        this.headers = headers;
    }

    public RouteHttpRouteMatch withHeaders(List<Property<RouteHttpRouteHeader>> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix
     * 
     */
    @JsonIgnore
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix
     * 
     */
    @JsonIgnore
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public RouteHttpRouteMatch withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method
     * 
     */
    @JsonIgnore
    public CharSequence getMethod() {
        return method;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method
     * 
     */
    @JsonIgnore
    public void setMethod(CharSequence method) {
        this.method = method;
    }

    public RouteHttpRouteMatch withMethod(CharSequence method) {
        this.method = method;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scheme", scheme).append("headers", headers).append("prefix", prefix).append("method", method).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(headers).append(scheme).append(method).append(prefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteHttpRouteMatch) == false) {
            return false;
        }
        RouteHttpRouteMatch rhs = ((RouteHttpRouteMatch) other);
        return new EqualsBuilder().append(headers, rhs.headers).append(scheme, rhs.scheme).append(method, rhs.method).append(prefix, rhs.prefix).isEquals();
    }

}
