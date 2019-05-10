
package aws.appmesh;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RouteSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HttpRoute",
    "TcpRoute"
})
public class RouteSpec {

    /**
     * HttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonProperty("HttpRoute")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html")
    private HttpRoute httpRoute;
    /**
     * TcpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html
     * 
     */
    @JsonProperty("TcpRoute")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html")
    private TcpRoute tcpRoute;

    /**
     * HttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonIgnore
    public HttpRoute getHttpRoute() {
        return httpRoute;
    }

    /**
     * HttpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
     * 
     */
    @JsonIgnore
    public void setHttpRoute(HttpRoute httpRoute) {
        this.httpRoute = httpRoute;
    }

    public RouteSpec withHttpRoute(HttpRoute httpRoute) {
        this.httpRoute = httpRoute;
        return this;
    }

    /**
     * TcpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html
     * 
     */
    @JsonIgnore
    public TcpRoute getTcpRoute() {
        return tcpRoute;
    }

    /**
     * TcpRoute
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html
     * 
     */
    @JsonIgnore
    public void setTcpRoute(TcpRoute tcpRoute) {
        this.tcpRoute = tcpRoute;
    }

    public RouteSpec withTcpRoute(TcpRoute tcpRoute) {
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
        if ((other instanceof RouteSpec) == false) {
            return false;
        }
        RouteSpec rhs = ((RouteSpec) other);
        return new EqualsBuilder().append(httpRoute, rhs.httpRoute).append(tcpRoute, rhs.tcpRoute).isEquals();
    }

}
