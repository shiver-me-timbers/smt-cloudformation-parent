
package aws.autoscaling;

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
 * NotificationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NotificationTypes",
    "TopicARN"
})
public class NotificationConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes
     * 
     */
    @JsonProperty("NotificationTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes")
    private List<String> notificationTypes = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn
     * 
     */
    @JsonProperty("TopicARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn")
    private String topicARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes
     * 
     */
    @JsonProperty("NotificationTypes")
    public List<String> getNotificationTypes() {
        return notificationTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes
     * 
     */
    @JsonProperty("NotificationTypes")
    public void setNotificationTypes(List<String> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }

    public NotificationConfiguration withNotificationTypes(List<String> notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn
     * 
     */
    @JsonProperty("TopicARN")
    public String getTopicARN() {
        return topicARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn
     * 
     */
    @JsonProperty("TopicARN")
    public void setTopicARN(String topicARN) {
        this.topicARN = topicARN;
    }

    public NotificationConfiguration withTopicARN(String topicARN) {
        this.topicARN = topicARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notificationTypes", notificationTypes).append("topicARN", topicARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topicARN).append(notificationTypes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotificationConfiguration) == false) {
            return false;
        }
        NotificationConfiguration rhs = ((NotificationConfiguration) other);
        return new EqualsBuilder().append(topicARN, rhs.topicARN).append(notificationTypes, rhs.notificationTypes).isEquals();
    }

}