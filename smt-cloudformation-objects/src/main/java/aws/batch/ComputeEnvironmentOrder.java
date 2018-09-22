
package aws.batch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ComputeEnvironmentOrder
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComputeEnvironment",
    "Order"
})
public class ComputeEnvironmentOrder {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment
     * 
     */
    @JsonProperty("ComputeEnvironment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment")
    private String computeEnvironment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order
     * 
     */
    @JsonProperty("Order")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order")
    private Integer order;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment
     * 
     */
    @JsonProperty("ComputeEnvironment")
    public String getComputeEnvironment() {
        return computeEnvironment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment
     * 
     */
    @JsonProperty("ComputeEnvironment")
    public void setComputeEnvironment(String computeEnvironment) {
        this.computeEnvironment = computeEnvironment;
    }

    public ComputeEnvironmentOrder withComputeEnvironment(String computeEnvironment) {
        this.computeEnvironment = computeEnvironment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order
     * 
     */
    @JsonProperty("Order")
    public Integer getOrder() {
        return order;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order
     * 
     */
    @JsonProperty("Order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    public ComputeEnvironmentOrder withOrder(Integer order) {
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
        if ((other instanceof ComputeEnvironmentOrder) == false) {
            return false;
        }
        ComputeEnvironmentOrder rhs = ((ComputeEnvironmentOrder) other);
        return new EqualsBuilder().append(computeEnvironment, rhs.computeEnvironment).append(order, rhs.order).isEquals();
    }

}
