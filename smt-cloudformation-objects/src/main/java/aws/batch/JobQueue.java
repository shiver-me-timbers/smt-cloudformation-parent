
package aws.batch;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * JobQueue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComputeEnvironmentOrder",
    "Priority",
    "State",
    "JobQueueName"
})
public class JobQueue {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder
     * 
     */
    @JsonProperty("ComputeEnvironmentOrder")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder")
    private List<ComputeEnvironmentOrder> computeEnvironmentOrder = new ArrayList<ComputeEnvironmentOrder>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority")
    private Integer priority;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state
     * 
     */
    @JsonProperty("State")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state")
    private CharSequence state;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename
     * 
     */
    @JsonProperty("JobQueueName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename")
    private CharSequence jobQueueName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder
     * 
     */
    public List<ComputeEnvironmentOrder> getComputeEnvironmentOrder() {
        return computeEnvironmentOrder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder
     * 
     */
    public void setComputeEnvironmentOrder(List<ComputeEnvironmentOrder> computeEnvironmentOrder) {
        this.computeEnvironmentOrder = computeEnvironmentOrder;
    }

    public JobQueue withComputeEnvironmentOrder(List<ComputeEnvironmentOrder> computeEnvironmentOrder) {
        this.computeEnvironmentOrder = computeEnvironmentOrder;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority
     * 
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority
     * 
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public JobQueue withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state
     * 
     */
    public CharSequence getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state
     * 
     */
    public void setState(CharSequence state) {
        this.state = state;
    }

    public JobQueue withState(CharSequence state) {
        this.state = state;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename
     * 
     */
    public CharSequence getJobQueueName() {
        return jobQueueName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename
     * 
     */
    public void setJobQueueName(CharSequence jobQueueName) {
        this.jobQueueName = jobQueueName;
    }

    public JobQueue withJobQueueName(CharSequence jobQueueName) {
        this.jobQueueName = jobQueueName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("computeEnvironmentOrder", computeEnvironmentOrder).append("priority", priority).append("state", state).append("jobQueueName", jobQueueName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(computeEnvironmentOrder).append(jobQueueName).append(state).append(priority).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobQueue) == false) {
            return false;
        }
        JobQueue rhs = ((JobQueue) other);
        return new EqualsBuilder().append(computeEnvironmentOrder, rhs.computeEnvironmentOrder).append(jobQueueName, rhs.jobQueueName).append(state, rhs.state).append(priority, rhs.priority).isEquals();
    }

}
