
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LambdaConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Event",
    "Filter",
    "Function"
})
public class LambdaConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event
     * 
     */
    @JsonProperty("Event")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event")
    private CharSequence event;
    /**
     * NotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html")
    private NotificationFilter filter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function
     * 
     */
    @JsonProperty("Function")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function")
    private CharSequence function;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event
     * 
     */
    public CharSequence getEvent() {
        return event;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event
     * 
     */
    public void setEvent(CharSequence event) {
        this.event = event;
    }

    public LambdaConfiguration withEvent(CharSequence event) {
        this.event = event;
        return this;
    }

    /**
     * NotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    public NotificationFilter getFilter() {
        return filter;
    }

    /**
     * NotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    public void setFilter(NotificationFilter filter) {
        this.filter = filter;
    }

    public LambdaConfiguration withFilter(NotificationFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function
     * 
     */
    public CharSequence getFunction() {
        return function;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function
     * 
     */
    public void setFunction(CharSequence function) {
        this.function = function;
    }

    public LambdaConfiguration withFunction(CharSequence function) {
        this.function = function;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("event", event).append("filter", filter).append("function", function).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter).append(event).append(function).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LambdaConfiguration) == false) {
            return false;
        }
        LambdaConfiguration rhs = ((LambdaConfiguration) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(event, rhs.event).append(function, rhs.function).isEquals();
    }

}
