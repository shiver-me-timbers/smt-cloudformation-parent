
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TaskDefinitionPlacementConstraint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Expression",
    "Type"
})
public class TaskDefinitionPlacementConstraint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression
     * 
     */
    @JsonProperty("Expression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression")
    private CharSequence expression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression
     * 
     */
    public CharSequence getExpression() {
        return expression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression
     * 
     */
    public void setExpression(CharSequence expression) {
        this.expression = expression;
    }

    public TaskDefinitionPlacementConstraint withExpression(CharSequence expression) {
        this.expression = expression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public TaskDefinitionPlacementConstraint withType(CharSequence type) {
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
        if ((other instanceof TaskDefinitionPlacementConstraint) == false) {
            return false;
        }
        TaskDefinitionPlacementConstraint rhs = ((TaskDefinitionPlacementConstraint) other);
        return new EqualsBuilder().append(type, rhs.type).append(expression, rhs.expression).isEquals();
    }

}
