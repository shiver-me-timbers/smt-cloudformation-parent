
package shiver.me.timbers.aws.autoscaling;

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
 * AutoScalingGroupNotificationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NotificationTypes",
    "TopicARN"
})
public class AutoScalingGroupNotificationConfiguration implements Property<AutoScalingGroupNotificationConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes
     * 
     */
    @JsonProperty("NotificationTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes")
    private List<CharSequence> notificationTypes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn
     * 
     */
    @JsonProperty("TopicARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn")
    private CharSequence topicARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getNotificationTypes() {
        return notificationTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes
     * 
     */
    @JsonIgnore
    public void setNotificationTypes(List<CharSequence> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }

    public AutoScalingGroupNotificationConfiguration withNotificationTypes(List<CharSequence> notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn
     * 
     */
    @JsonIgnore
    public CharSequence getTopicARN() {
        return topicARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn
     * 
     */
    @JsonIgnore
    public void setTopicARN(CharSequence topicARN) {
        this.topicARN = topicARN;
    }

    public AutoScalingGroupNotificationConfiguration withTopicARN(CharSequence topicARN) {
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
        if ((other instanceof AutoScalingGroupNotificationConfiguration) == false) {
            return false;
        }
        AutoScalingGroupNotificationConfiguration rhs = ((AutoScalingGroupNotificationConfiguration) other);
        return new EqualsBuilder().append(topicARN, rhs.topicARN).append(notificationTypes, rhs.notificationTypes).isEquals();
    }

}
