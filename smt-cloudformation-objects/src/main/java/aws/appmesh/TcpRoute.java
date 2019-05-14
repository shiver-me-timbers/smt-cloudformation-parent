
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
 * TcpRoute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Action"
})
public class TcpRoute implements Property<TcpRoute>
{

    /**
     * TcpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html")
    private Property<TcpRouteAction> action;

    /**
     * TcpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html
     * 
     */
    @JsonIgnore
    public Property<TcpRouteAction> getAction() {
        return action;
    }

    /**
     * TcpRouteAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html
     * 
     */
    @JsonIgnore
    public void setAction(Property<TcpRouteAction> action) {
        this.action = action;
    }

    public TcpRoute withAction(Property<TcpRouteAction> action) {
        this.action = action;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(action).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TcpRoute) == false) {
            return false;
        }
        TcpRoute rhs = ((TcpRoute) other);
        return new EqualsBuilder().append(action, rhs.action).isEquals();
    }

}
