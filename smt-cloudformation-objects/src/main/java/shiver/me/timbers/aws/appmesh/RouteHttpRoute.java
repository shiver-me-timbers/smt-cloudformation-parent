
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
 * RouteHttpRoute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Action",
    "RetryPolicy",
    "Match"
})
public class RouteHttpRoute implements Property<RouteHttpRoute>
{

    /**
     * RouteHttpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html")
    private Property<RouteHttpRouteAction> action;
    /**
     * RouteHttpRetryPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html
     * 
     */
    @JsonProperty("RetryPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html")
    private Property<RouteHttpRetryPolicy> retryPolicy;
    /**
     * RouteHttpRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html
     * 
     */
    @JsonProperty("Match")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html")
    private Property<RouteHttpRouteMatch> match;

    /**
     * RouteHttpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html
     * 
     */
    @JsonIgnore
    public Property<RouteHttpRouteAction> getAction() {
        return action;
    }

    /**
     * RouteHttpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html
     * 
     */
    @JsonIgnore
    public void setAction(Property<RouteHttpRouteAction> action) {
        this.action = action;
    }

    public RouteHttpRoute withAction(Property<RouteHttpRouteAction> action) {
        this.action = action;
        return this;
    }

    /**
     * RouteHttpRetryPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html
     * 
     */
    @JsonIgnore
    public Property<RouteHttpRetryPolicy> getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * RouteHttpRetryPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html
     * 
     */
    @JsonIgnore
    public void setRetryPolicy(Property<RouteHttpRetryPolicy> retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    public RouteHttpRoute withRetryPolicy(Property<RouteHttpRetryPolicy> retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * RouteHttpRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html
     * 
     */
    @JsonIgnore
    public Property<RouteHttpRouteMatch> getMatch() {
        return match;
    }

    /**
     * RouteHttpRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html
     * 
     */
    @JsonIgnore
    public void setMatch(Property<RouteHttpRouteMatch> match) {
        this.match = match;
    }

    public RouteHttpRoute withMatch(Property<RouteHttpRouteMatch> match) {
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
        if ((other instanceof RouteHttpRoute) == false) {
            return false;
        }
        RouteHttpRoute rhs = ((RouteHttpRoute) other);
        return new EqualsBuilder().append(match, rhs.match).append(action, rhs.action).append(retryPolicy, rhs.retryPolicy).isEquals();
    }

}
