
package aws.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EcsParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TaskCount",
    "TaskDefinitionArn"
})
public class EcsParameters {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount
     * 
     */
    @JsonProperty("TaskCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount")
    private Integer taskCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn
     * 
     */
    @JsonProperty("TaskDefinitionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn")
    private CharSequence taskDefinitionArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount
     * 
     */
    public Integer getTaskCount() {
        return taskCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount
     * 
     */
    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public EcsParameters withTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn
     * 
     */
    public CharSequence getTaskDefinitionArn() {
        return taskDefinitionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn
     * 
     */
    public void setTaskDefinitionArn(CharSequence taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    public EcsParameters withTaskDefinitionArn(CharSequence taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("taskCount", taskCount).append("taskDefinitionArn", taskDefinitionArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(taskCount).append(taskDefinitionArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EcsParameters) == false) {
            return false;
        }
        EcsParameters rhs = ((EcsParameters) other);
        return new EqualsBuilder().append(taskCount, rhs.taskCount).append(taskDefinitionArn, rhs.taskDefinitionArn).isEquals();
    }

}
