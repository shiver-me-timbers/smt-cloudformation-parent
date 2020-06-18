
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
 * RouteRouteSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HttpRoute",
    "Priority",
    "Http2Route",
    "GrpcRoute",
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
    private Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> httpRoute;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority")
    private Number priority;
    /**
     * RouteHttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonProperty("Http2Route")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html")
    private Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> http2Route;
    /**
     * RouteGrpcRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html
     * 
     */
    @JsonProperty("GrpcRoute")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html")
    private Property<RouteGrpcRoute> grpcRoute;
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
    public Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> getHttpRoute() {
        return httpRoute;
    }

    /**
     * RouteHttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonIgnore
    public void setHttpRoute(Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> httpRoute) {
        this.httpRoute = httpRoute;
    }

    public RouteRouteSpec withHttpRoute(Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> httpRoute) {
        this.httpRoute = httpRoute;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority
     * 
     */
    @JsonIgnore
    public Number getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority
     * 
     */
    @JsonIgnore
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public RouteRouteSpec withPriority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * RouteHttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> getHttp2Route() {
        return http2Route;
    }

    /**
     * RouteHttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonIgnore
    public void setHttp2Route(Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> http2Route) {
        this.http2Route = http2Route;
    }

    public RouteRouteSpec withHttp2Route(Property<shiver.me.timbers.aws.appmesh.RouteHttpRoute> http2Route) {
        this.http2Route = http2Route;
        return this;
    }

    /**
     * RouteGrpcRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html
     * 
     */
    @JsonIgnore
    public Property<RouteGrpcRoute> getGrpcRoute() {
        return grpcRoute;
    }

    /**
     * RouteGrpcRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html
     * 
     */
    @JsonIgnore
    public void setGrpcRoute(Property<RouteGrpcRoute> grpcRoute) {
        this.grpcRoute = grpcRoute;
    }

    public RouteRouteSpec withGrpcRoute(Property<RouteGrpcRoute> grpcRoute) {
        this.grpcRoute = grpcRoute;
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
        return new ToStringBuilder(this).append("httpRoute", httpRoute).append("priority", priority).append("http2Route", http2Route).append("grpcRoute", grpcRoute).append("tcpRoute", tcpRoute).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(http2Route).append(grpcRoute).append(priority).append(httpRoute).append(tcpRoute).toHashCode();
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
        return new EqualsBuilder().append(http2Route, rhs.http2Route).append(grpcRoute, rhs.grpcRoute).append(priority, rhs.priority).append(httpRoute, rhs.httpRoute).append(tcpRoute, rhs.tcpRoute).isEquals();
    }

}
