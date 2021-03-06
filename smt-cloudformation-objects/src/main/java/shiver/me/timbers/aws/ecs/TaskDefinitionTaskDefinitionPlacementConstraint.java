
package shiver.me.timbers.aws.ecs;

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
 * TaskDefinitionTaskDefinitionPlacementConstraint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Expression",
    "Type"
})
public class TaskDefinitionTaskDefinitionPlacementConstraint implements Property<TaskDefinitionTaskDefinitionPlacementConstraint>
{

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
    @JsonIgnore
    public CharSequence getExpression() {
        return expression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression
     * 
     */
    @JsonIgnore
    public void setExpression(CharSequence expression) {
        this.expression = expression;
    }

    public TaskDefinitionTaskDefinitionPlacementConstraint withExpression(CharSequence expression) {
        this.expression = expression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public TaskDefinitionTaskDefinitionPlacementConstraint withType(CharSequence type) {
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
        if ((other instanceof TaskDefinitionTaskDefinitionPlacementConstraint) == false) {
            return false;
        }
        TaskDefinitionTaskDefinitionPlacementConstraint rhs = ((TaskDefinitionTaskDefinitionPlacementConstraint) other);
        return new EqualsBuilder().append(type, rhs.type).append(expression, rhs.expression).isEquals();
    }

}
