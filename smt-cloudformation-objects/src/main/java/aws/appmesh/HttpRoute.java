
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
 * HttpRoute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Action",
    "Match"
})
public class HttpRoute implements Property<HttpRoute>
{

    /**
     * HttpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html")
    private Property<HttpRouteAction> action;
    /**
     * HttpRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html
     * 
     */
    @JsonProperty("Match")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html")
    private Property<HttpRouteMatch> match;

    /**
     * HttpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html
     * 
     */
    @JsonIgnore
    public Property<HttpRouteAction> getAction() {
        return action;
    }

    /**
     * HttpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html
     * 
     */
    @JsonIgnore
    public void setAction(Property<HttpRouteAction> action) {
        this.action = action;
    }

    public HttpRoute withAction(Property<HttpRouteAction> action) {
        this.action = action;
        return this;
    }

    /**
     * HttpRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html
     * 
     */
    @JsonIgnore
    public Property<HttpRouteMatch> getMatch() {
        return match;
    }

    /**
     * HttpRouteMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html
     * 
     */
    @JsonIgnore
    public void setMatch(Property<HttpRouteMatch> match) {
        this.match = match;
    }

    public HttpRoute withMatch(Property<HttpRouteMatch> match) {
        this.match = match;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).append("match", match).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(match).append(action).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HttpRoute) == false) {
            return false;
        }
        HttpRoute rhs = ((HttpRoute) other);
        return new EqualsBuilder().append(match, rhs.match).append(action, rhs.action).isEquals();
    }

}
