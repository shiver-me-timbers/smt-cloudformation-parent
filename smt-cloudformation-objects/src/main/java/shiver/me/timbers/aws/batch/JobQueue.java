
package shiver.me.timbers.aws.batch;

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
 * JobQueue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    private List<Property<JobQueueComputeEnvironmentOrder>> computeEnvironmentOrder = new ArrayList<Property<JobQueueComputeEnvironmentOrder>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority")
    private Number priority;
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
    @JsonIgnore
    public List<Property<JobQueueComputeEnvironmentOrder>> getComputeEnvironmentOrder() {
        return computeEnvironmentOrder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder
     * 
     */
    @JsonIgnore
    public void setComputeEnvironmentOrder(List<Property<JobQueueComputeEnvironmentOrder>> computeEnvironmentOrder) {
        this.computeEnvironmentOrder = computeEnvironmentOrder;
    }

    public JobQueue withComputeEnvironmentOrder(List<Property<JobQueueComputeEnvironmentOrder>> computeEnvironmentOrder) {
        this.computeEnvironmentOrder = computeEnvironmentOrder;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority
     * 
     */
    @JsonIgnore
    public Number getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority
     * 
     */
    @JsonIgnore
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public JobQueue withPriority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state
     * 
     */
    @JsonIgnore
    public CharSequence getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getJobQueueName() {
        return jobQueueName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename
     * 
     */
    @JsonIgnore
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
