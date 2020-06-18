
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
 * RouteGrpcRouteAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "WeightedTargets"
})
public class RouteGrpcRouteAction implements Property<RouteGrpcRouteAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets
     * 
     */
    @JsonProperty("WeightedTargets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets")
    private List<Property<RouteWeightedTarget>> weightedTargets = new ArrayList<Property<RouteWeightedTarget>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets
     * 
     */
    @JsonIgnore
    public List<Property<RouteWeightedTarget>> getWeightedTargets() {
        return weightedTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets
     * 
     */
    @JsonIgnore
    public void setWeightedTargets(List<Property<RouteWeightedTarget>> weightedTargets) {
        this.weightedTargets = weightedTargets;
    }

    public RouteGrpcRouteAction withWeightedTargets(List<Property<RouteWeightedTarget>> weightedTargets) {
        this.weightedTargets = weightedTargets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("weightedTargets", weightedTargets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(weightedTargets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteGrpcRouteAction) == false) {
            return false;
        }
        RouteGrpcRouteAction rhs = ((RouteGrpcRouteAction) other);
        return new EqualsBuilder().append(weightedTargets, rhs.weightedTargets).isEquals();
    }

}
