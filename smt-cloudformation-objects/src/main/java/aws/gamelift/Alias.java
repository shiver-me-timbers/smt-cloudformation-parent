
package aws.gamelift;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Alias
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Name",
    "RoutingStrategy"
})
public class Alias {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name")
    private CharSequence name;
    /**
     * RoutingStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html
     * 
     */
    @JsonProperty("RoutingStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html")
    private RoutingStrategy routingStrategy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Alias withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Alias withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * RoutingStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html
     * 
     */
    public RoutingStrategy getRoutingStrategy() {
        return routingStrategy;
    }

    /**
     * RoutingStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html
     * 
     */
    public void setRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    public Alias withRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("name", name).append("routingStrategy", routingStrategy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(routingStrategy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alias) == false) {
            return false;
        }
        Alias rhs = ((Alias) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(routingStrategy, rhs.routingStrategy).isEquals();
    }

}
