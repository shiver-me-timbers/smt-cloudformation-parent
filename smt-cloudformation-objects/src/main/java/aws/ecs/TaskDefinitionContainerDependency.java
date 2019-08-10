
package aws.ecs;

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
 * TaskDefinitionContainerDependency
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Condition",
    "ContainerName"
})
public class TaskDefinitionContainerDependency implements Property<TaskDefinitionContainerDependency>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-condition
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-condition")
    private CharSequence condition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-containername
     * 
     */
    @JsonProperty("ContainerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-containername")
    private CharSequence containerName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-condition
     * 
     */
    @JsonIgnore
    public CharSequence getCondition() {
        return condition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-condition
     * 
     */
    @JsonIgnore
    public void setCondition(CharSequence condition) {
        this.condition = condition;
    }

    public TaskDefinitionContainerDependency withCondition(CharSequence condition) {
        this.condition = condition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-containername
     * 
     */
    @JsonIgnore
    public CharSequence getContainerName() {
        return containerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-containername
     * 
     */
    @JsonIgnore
    public void setContainerName(CharSequence containerName) {
        this.containerName = containerName;
    }

    public TaskDefinitionContainerDependency withContainerName(CharSequence containerName) {
        this.containerName = containerName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("condition", condition).append("containerName", containerName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(condition).append(containerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionContainerDependency) == false) {
            return false;
        }
        TaskDefinitionContainerDependency rhs = ((TaskDefinitionContainerDependency) other);
        return new EqualsBuilder().append(condition, rhs.condition).append(containerName, rhs.containerName).isEquals();
    }

}
