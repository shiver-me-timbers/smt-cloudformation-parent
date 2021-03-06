
package shiver.me.timbers.aws.sagemaker;

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
 * WorkteamNotificationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NotificationTopicArn"
})
public class WorkteamNotificationConfiguration implements Property<WorkteamNotificationConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html#cfn-sagemaker-workteam-notificationconfiguration-notificationtopicarn
     * 
     */
    @JsonProperty("NotificationTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html#cfn-sagemaker-workteam-notificationconfiguration-notificationtopicarn")
    private CharSequence notificationTopicArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html#cfn-sagemaker-workteam-notificationconfiguration-notificationtopicarn
     * 
     */
    @JsonIgnore
    public CharSequence getNotificationTopicArn() {
        return notificationTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html#cfn-sagemaker-workteam-notificationconfiguration-notificationtopicarn
     * 
     */
    @JsonIgnore
    public void setNotificationTopicArn(CharSequence notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    public WorkteamNotificationConfiguration withNotificationTopicArn(CharSequence notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notificationTopicArn", notificationTopicArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notificationTopicArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkteamNotificationConfiguration) == false) {
            return false;
        }
        WorkteamNotificationConfiguration rhs = ((WorkteamNotificationConfiguration) other);
        return new EqualsBuilder().append(notificationTopicArn, rhs.notificationTopicArn).isEquals();
    }

}
