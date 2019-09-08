
package shiver.me.timbers.aws.sns;

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
import shiver.me.timbers.aws.iam.PolicyDocument;


/**
 * TopicPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PolicyDocument",
    "Topics"
})
public class TopicPolicy {

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html")
    private Property<PolicyDocument> policyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics
     * 
     */
    @JsonProperty("Topics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics")
    private List<CharSequence> topics = new ArrayList<CharSequence>();

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public Property<PolicyDocument> getPolicyDocument() {
        return policyDocument;
    }

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public void setPolicyDocument(Property<PolicyDocument> policyDocument) {
        this.policyDocument = policyDocument;
    }

    public TopicPolicy withPolicyDocument(Property<PolicyDocument> policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics
     * 
     */
    @JsonIgnore
    public List<CharSequence> getTopics() {
        return topics;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics
     * 
     */
    @JsonIgnore
    public void setTopics(List<CharSequence> topics) {
        this.topics = topics;
    }

    public TopicPolicy withTopics(List<CharSequence> topics) {
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
