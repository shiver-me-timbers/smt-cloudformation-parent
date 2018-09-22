
package aws.ssm;

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
 * NotificationConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NotificationArn",
    "NotificationType",
    "NotificationEvents"
})
public class NotificationConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn
     * 
     */
    @JsonProperty("NotificationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn")
    private String notificationArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype
     * 
     */
    @JsonProperty("NotificationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype")
    private String notificationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents
     * 
     */
    @JsonProperty("NotificationEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents")
    private List<String> notificationEvents = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn
     * 
     */
    @JsonProperty("NotificationArn")
    public String getNotificationArn() {
        return notificationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn
     * 
     */
    @JsonProperty("NotificationArn")
    public void setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
    }

    public NotificationConfig withNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype
     * 
     */
    @JsonProperty("NotificationType")
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype
     * 
     */
    @JsonProperty("NotificationType")
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public NotificationConfig withNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents
     * 
     */
    @JsonProperty("NotificationEvents")
    public List<String> getNotificationEvents() {
        return notificationEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents
     * 
     */
    @JsonProperty("NotificationEvents")
    public void setNotificationEvents(List<String> notificationEvents) {
        this.notificationEvents = notificationEvents;
    }

    public NotificationConfig withNotificationEvents(List<String> notificationEvents) {
        this.notificationEvents = notificationEvents;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notificationArn", notificationArn).append("notificationType", notificationType).append("notificationEvents", notificationEvents).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notificationType).append(notificationEvents).append(notificationArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotificationConfig) == false) {
            return false;
        }
        NotificationConfig rhs = ((NotificationConfig) other);
        return new EqualsBuilder().append(notificationType, rhs.notificationType).append(notificationEvents, rhs.notificationEvents).append(notificationArn, rhs.notificationArn).isEquals();
    }

}
