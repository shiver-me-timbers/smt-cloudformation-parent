
package shiver.me.timbers.aws.glue;

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
 * JobNotificationProperty
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NotifyDelayAfter"
})
public class JobNotificationProperty implements Property<JobNotificationProperty>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html#cfn-glue-job-notificationproperty-notifydelayafter
     * 
     */
    @JsonProperty("NotifyDelayAfter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html#cfn-glue-job-notificationproperty-notifydelayafter")
    private Number notifyDelayAfter;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html#cfn-glue-job-notificationproperty-notifydelayafter
     * 
     */
    @JsonIgnore
    public Number getNotifyDelayAfter() {
        return notifyDelayAfter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html#cfn-glue-job-notificationproperty-notifydelayafter
     * 
     */
    @JsonIgnore
    public void setNotifyDelayAfter(Number notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
    }

    public JobNotificationProperty withNotifyDelayAfter(Number notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notifyDelayAfter", notifyDelayAfter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notifyDelayAfter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobNotificationProperty) == false) {
            return false;
        }
        JobNotificationProperty rhs = ((JobNotificationProperty) other);
        return new EqualsBuilder().append(notifyDelayAfter, rhs.notifyDelayAfter).isEquals();
    }

}
