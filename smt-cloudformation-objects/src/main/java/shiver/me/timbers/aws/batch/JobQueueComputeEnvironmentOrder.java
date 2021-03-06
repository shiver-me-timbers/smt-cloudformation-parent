
package shiver.me.timbers.aws.batch;

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
 * JobQueueComputeEnvironmentOrder
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ComputeEnvironment",
    "Order"
})
public class JobQueueComputeEnvironmentOrder implements Property<JobQueueComputeEnvironmentOrder>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment
     * 
     */
    @JsonProperty("ComputeEnvironment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment")
    private CharSequence computeEnvironment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order
     * 
     */
    @JsonProperty("Order")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order")
    private Number order;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment
     * 
     */
    @JsonIgnore
    public CharSequence getComputeEnvironment() {
        return computeEnvironment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment
     * 
     */
    @JsonIgnore
    public void setComputeEnvironment(CharSequence computeEnvironment) {
        this.computeEnvironment = computeEnvironment;
    }

    public JobQueueComputeEnvironmentOrder withComputeEnvironment(CharSequence computeEnvironment) {
        this.computeEnvironment = computeEnvironment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order
     * 
     */
    @JsonIgnore
    public Number getOrder() {
        return order;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order
     * 
     */
    @JsonIgnore
    public void setOrder(Number order) {
        this.order = order;
    }

    public JobQueueComputeEnvironmentOrder withOrder(Number order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("computeEnvironment", computeEnvironment).append("order", order).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(computeEnvironment).append(order).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobQueueComputeEnvironmentOrder) == false) {
            return false;
        }
        JobQueueComputeEnvironmentOrder rhs = ((JobQueueComputeEnvironmentOrder) other);
        return new EqualsBuilder().append(computeEnvironment, rhs.computeEnvironment).append(order, rhs.order).isEquals();
    }

}
