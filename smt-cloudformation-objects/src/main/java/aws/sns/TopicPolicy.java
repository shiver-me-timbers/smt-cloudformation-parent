
package aws.sns;

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
 * TopicPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PolicyDocument",
    "Topics"
})
public class TopicPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-policydocument")
    private PolicyDocument policyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics
     * 
     */
    @JsonProperty("Topics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics")
    private List<String> topics = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public PolicyDocument getPolicyDocument() {
        return policyDocument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public void setPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
    }

    public TopicPolicy withPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics
     * 
     */
    @JsonProperty("Topics")
    public List<String> getTopics() {
        return topics;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics
     * 
     */
    @JsonProperty("Topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public TopicPolicy withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policyDocument", policyDocument).append("topics", topics).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyDocument).append(topics).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicPolicy) == false) {
            return false;
        }
        TopicPolicy rhs = ((TopicPolicy) other);
        return new EqualsBuilder().append(policyDocument, rhs.policyDocument).append(topics, rhs.topics).isEquals();
    }

}