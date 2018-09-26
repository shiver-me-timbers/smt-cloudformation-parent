
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PlacementConstraint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Expression",
    "Type"
})
public class PlacementConstraint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression
     * 
     */
    @JsonProperty("Expression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression")
    private CharSequence expression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression
     * 
     */
    public CharSequence getExpression() {
        return expression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression
     * 
     */
    public void setExpression(CharSequence expression) {
        this.expression = expression;
    }

    public PlacementConstraint withExpression(CharSequence expression) {
        this.expression = expression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public PlacementConstraint withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("expression", expression).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(expression).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlacementConstraint) == false) {
            return false;
        }
        PlacementConstraint rhs = ((PlacementConstraint) other);
        return new EqualsBuilder().append(type, rhs.type).append(expression, rhs.expression).isEquals();
    }

}
