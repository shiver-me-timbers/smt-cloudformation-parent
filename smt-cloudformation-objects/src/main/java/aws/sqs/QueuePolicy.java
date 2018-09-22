
package aws.sqs;

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
 * QueuePolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PolicyDocument",
    "Queues"
})
public class QueuePolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-policydoc
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-policydoc")
    private PolicyDocument policyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-queues
     * 
     */
    @JsonProperty("Queues")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-queues")
    private List<String> queues = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-policydoc
     * 
     */
    @JsonProperty("PolicyDocument")
    public PolicyDocument getPolicyDocument() {
        return policyDocument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-policydoc
     * 
     */
    @JsonProperty("PolicyDocument")
    public void setPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
    }

    public QueuePolicy withPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-queues
     * 
     */
    @JsonProperty("Queues")
    public List<String> getQueues() {
        return queues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-queues
     * 
     */
    @JsonProperty("Queues")
    public void setQueues(List<String> queues) {
        this.queues = queues;
    }

    public QueuePolicy withQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policyDocument", policyDocument).append("queues", queues).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyDocument).append(queues).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueuePolicy) == false) {
            return false;
        }
        QueuePolicy rhs = ((QueuePolicy) other);
        return new EqualsBuilder().append(policyDocument, rhs.policyDocument).append(queues, rhs.queues).isEquals();
    }

}
