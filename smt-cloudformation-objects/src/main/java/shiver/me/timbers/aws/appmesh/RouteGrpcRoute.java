
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
 * RouteGrpcRoute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Action",
    "RetryPolicy",
    "Match"
})
public class RouteGrpcRoute implements Property<RouteGrpcRoute>
{

    /**
     * RouteGrpcRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html")
    private Property<RouteGrpcRouteAction> action;
    /**
     * RouteGrpcRetryPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html
     * 
     */
    @JsonProperty("RetryPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html")
    private Property<RouteGrpcRetryPolicy> retryPolicy;
    /**
     * RouteGrpcRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html
     * 
     */
    @JsonProperty("Match")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html")
    private Property<RouteGrpcRouteMatch> match;

    /**
     * RouteGrpcRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html
     * 
     */
    @JsonIgnore
    public Property<RouteGrpcRouteAction> getAction() {
        return action;
    }

    /**
     * RouteGrpcRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html
     * 
     */
    @JsonIgnore
    public void setAction(Property<RouteGrpcRouteAction> action) {
        this.action = action;
    }

    public RouteGrpcRoute withAction(Property<RouteGrpcRouteAction> action) {
        this.action = action;
        return this;
    }

    /**
     * RouteGrpcRetryPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html
     * 
     */
    @JsonIgnore
    public Property<RouteGrpcRetryPolicy> getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * RouteGrpcRetryPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html
     * 
     */
    @JsonIgnore
    public void setRetryPolicy(Property<RouteGrpcRetryPolicy> retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    public RouteGrpcRoute withRetryPolicy(Property<RouteGrpcRetryPolicy> retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * RouteGrpcRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html
     * 
     */
    @JsonIgnore
    public Property<RouteGrpcRouteMatch> getMatch() {
        return match;
    }

    /**
     * RouteGrpcRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html
     * 
     */
    @JsonIgnore
    public void setMatch(Property<RouteGrpcRouteMatch> match) {
        this.match = match;
    }

    public RouteGrpcRoute withMatch(Property<RouteGrpcRouteMatch> match) {
        this.match = match;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).append("retryPolicy", retryPolicy).append("match", match).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(match).append(action).append(retryPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteGrpcRoute) == false) {
            return false;
        }
        RouteGrpcRoute rhs = ((RouteGrpcRoute) other);
        return new EqualsBuilder().append(match, rhs.match).append(action, rhs.action).append(retryPolicy, rhs.retryPolicy).isEquals();
    }

}
