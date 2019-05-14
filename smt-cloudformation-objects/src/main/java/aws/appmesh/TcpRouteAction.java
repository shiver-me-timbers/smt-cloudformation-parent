
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
 * TcpRouteAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "WeightedTargets"
})
public class TcpRouteAction implements Property<TcpRouteAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets
     * 
     */
    @JsonProperty("WeightedTargets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets")
    private List<Property<WeightedTarget>> weightedTargets = new ArrayList<Property<WeightedTarget>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets
     * 
     */
    @JsonIgnore
    public List<Property<WeightedTarget>> getWeightedTargets() {
        return weightedTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets
     * 
     */
    @JsonIgnore
    public void setWeightedTargets(List<Property<WeightedTarget>> weightedTargets) {
        this.weightedTargets = weightedTargets;
    }

    public TcpRouteAction withWeightedTargets(List<Property<WeightedTarget>> weightedTargets) {
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
        if ((other instanceof TcpRouteAction) == false) {
            return false;
        }
        TcpRouteAction rhs = ((TcpRouteAction) other);
        return new EqualsBuilder().append(weightedTargets, rhs.weightedTargets).isEquals();
    }

}