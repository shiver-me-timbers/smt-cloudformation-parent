
package shiver.me.timbers.aws.appmesh;

import java.util.ArrayList;
import java.util.List;
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
 * RouteGrpcRetryPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxRetries",
    "PerRetryTimeout",
    "GrpcRetryEvents",
    "HttpRetryEvents",
    "TcpRetryEvents"
})
public class RouteGrpcRetryPolicy implements Property<RouteGrpcRetryPolicy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries
     * 
     */
    @JsonProperty("MaxRetries")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries")
    private Number maxRetries;
    /**
     * RouteDuration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html
     * 
     */
    @JsonProperty("PerRetryTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html")
    private Property<RouteDuration> perRetryTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents
     * 
     */
    @JsonProperty("GrpcRetryEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents")
    private List<CharSequence> grpcRetryEvents = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents
     * 
     */
    @JsonProperty("HttpRetryEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents")
    private List<CharSequence> httpRetryEvents = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents
     * 
     */
    @JsonProperty("TcpRetryEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents")
    private List<CharSequence> tcpRetryEvents = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries
     * 
     */
    @JsonIgnore
    public Number getMaxRetries() {
        return maxRetries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries
     * 
     */
    @JsonIgnore
    public void setMaxRetries(Number maxRetries) {
        this.maxRetries = maxRetries;
    }

    public RouteGrpcRetryPolicy withMaxRetries(Number maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * RouteDuration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html
     * 
     */
    @JsonIgnore
    public Property<RouteDuration> getPerRetryTimeout() {
        return perRetryTimeout;
    }

    /**
     * RouteDuration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html
     * 
     */
    @JsonIgnore
    public void setPerRetryTimeout(Property<RouteDuration> perRetryTimeout) {
        this.perRetryTimeout = perRetryTimeout;
    }

    public RouteGrpcRetryPolicy withPerRetryTimeout(Property<RouteDuration> perRetryTimeout) {
        this.perRetryTimeout = perRetryTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents
     * 
     */
    @JsonIgnore
    public List<CharSequence> getGrpcRetryEvents() {
        return grpcRetryEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents
     * 
     */
    @JsonIgnore
    public void setGrpcRetryEvents(List<CharSequence> grpcRetryEvents) {
        this.grpcRetryEvents = grpcRetryEvents;
    }

    public RouteGrpcRetryPolicy withGrpcRetryEvents(List<CharSequence> grpcRetryEvents) {
        this.grpcRetryEvents = grpcRetryEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents
     * 
     */
    @JsonIgnore
    public List<CharSequence> getHttpRetryEvents() {
        return httpRetryEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents
     * 
     */
    @JsonIgnore
    public void setHttpRetryEvents(List<CharSequence> httpRetryEvents) {
        this.httpRetryEvents = httpRetryEvents;
    }

    public RouteGrpcRetryPolicy withHttpRetryEvents(List<CharSequence> httpRetryEvents) {
        this.httpRetryEvents = httpRetryEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents
     * 
     */
    @JsonIgnore
    public List<CharSequence> getTcpRetryEvents() {
        return tcpRetryEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents
     * 
     */
    @JsonIgnore
    public void setTcpRetryEvents(List<CharSequence> tcpRetryEvents) {
        this.tcpRetryEvents = tcpRetryEvents;
    }

    public RouteGrpcRetryPolicy withTcpRetryEvents(List<CharSequence> tcpRetryEvents) {
        this.tcpRetryEvents = tcpRetryEvents;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxRetries", maxRetries).append("perRetryTimeout", perRetryTimeout).append("grpcRetryEvents", grpcRetryEvents).append("httpRetryEvents", httpRetryEvents).append("tcpRetryEvents", tcpRetryEvents).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(grpcRetryEvents).append(maxRetries).append(httpRetryEvents).append(tcpRetryEvents).append(perRetryTimeout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteGrpcRetryPolicy) == false) {
            return false;
        }
        RouteGrpcRetryPolicy rhs = ((RouteGrpcRetryPolicy) other);
        return new EqualsBuilder().append(grpcRetryEvents, rhs.grpcRetryEvents).append(maxRetries, rhs.maxRetries).append(httpRetryEvents, rhs.httpRetryEvents).append(tcpRetryEvents, rhs.tcpRetryEvents).append(perRetryTimeout, rhs.perRetryTimeout).isEquals();
    }

}
