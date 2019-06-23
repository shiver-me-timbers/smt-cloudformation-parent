
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
 * RouteRouteSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HttpRoute",
    "TcpRoute"
})
public class RouteRouteSpec implements Property<RouteRouteSpec>
{

    /**
     * RouteHttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonProperty("HttpRoute")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html")
    private Property<RouteHttpRoute> httpRoute;
    /**
     * RouteTcpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html
     * 
     */
    @JsonProperty("TcpRoute")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html")
    private Property<RouteTcpRoute> tcpRoute;

    /**
     * RouteHttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonIgnore
    public Property<RouteHttpRoute> getHttpRoute() {
        return httpRoute;
    }

    /**
     * RouteHttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonIgnore
    public void setHttpRoute(Property<RouteHttpRoute> httpRoute) {
        this.httpRoute = httpRoute;
    }

    public RouteRouteSpec withHttpRoute(Property<RouteHttpRoute> httpRoute) {
        this.httpRoute = httpRoute;
        return this;
    }

    /**
     * RouteTcpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html
     * 
     */
    @JsonIgnore
    public Property<RouteTcpRoute> getTcpRoute() {
        return tcpRoute;
    }

    /**
     * RouteTcpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html
     * 
     */
    @JsonIgnore
    public void setTcpRoute(Property<RouteTcpRoute> tcpRoute) {
        this.tcpRoute = tcpRoute;
    }

    public RouteRouteSpec withTcpRoute(Property<RouteTcpRoute> tcpRoute) {
        this.tcpRoute = tcpRoute;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("httpRoute", httpRoute).append("tcpRoute", tcpRoute).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(httpRoute).append(tcpRoute).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteRouteSpec) == false) {
            return false;
        }
        RouteRouteSpec rhs = ((RouteRouteSpec) other);
        return new EqualsBuilder().append(httpRoute, rhs.httpRoute).append(tcpRoute, rhs.tcpRoute).isEquals();
    }

}
