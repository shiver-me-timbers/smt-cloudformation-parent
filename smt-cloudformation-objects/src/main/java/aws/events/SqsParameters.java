
package aws.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SqsParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MessageGroupId"
})
public class SqsParameters {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid
     * 
     */
    @JsonProperty("MessageGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid")
    private CharSequence messageGroupId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid
     * 
     */
    public CharSequence getMessageGroupId() {
        return messageGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid
     * 
     */
    public void setMessageGroupId(CharSequence messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    public SqsParameters withMessageGroupId(CharSequence messageGroupId) {
        this.messageGroupId = messageGroupId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("messageGroupId", messageGroupId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(messageGroupId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SqsParameters) == false) {
            return false;
        }
        SqsParameters rhs = ((SqsParameters) other);
        return new EqualsBuilder().append(messageGroupId, rhs.messageGroupId).isEquals();
    }

}
