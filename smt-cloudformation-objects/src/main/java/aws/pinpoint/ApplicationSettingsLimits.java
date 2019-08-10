
package aws.pinpoint;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationSettingsLimits
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Daily",
    "MaximumDuration",
    "Total",
    "MessagesPerSecond"
})
public class ApplicationSettingsLimits implements Property<ApplicationSettingsLimits>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-daily
     * 
     */
    @JsonProperty("Daily")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-daily")
    private Number daily;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-maximumduration
     * 
     */
    @JsonProperty("MaximumDuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-maximumduration")
    private Number maximumDuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-total
     * 
     */
    @JsonProperty("Total")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-total")
    private Number total;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-messagespersecond
     * 
     */
    @JsonProperty("MessagesPerSecond")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-messagespersecond")
    private Number messagesPerSecond;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-daily
     * 
     */
    @JsonIgnore
    public Number getDaily() {
        return daily;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-daily
     * 
     */
    @JsonIgnore
    public void setDaily(Number daily) {
        this.daily = daily;
    }

    public ApplicationSettingsLimits withDaily(Number daily) {
        this.daily = daily;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-maximumduration
     * 
     */
    @JsonIgnore
    public Number getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-maximumduration
     * 
     */
    @JsonIgnore
    public void setMaximumDuration(Number maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    public ApplicationSettingsLimits withMaximumDuration(Number maximumDuration) {
        this.maximumDuration = maximumDuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-total
     * 
     */
    @JsonIgnore
    public Number getTotal() {
        return total;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-total
     * 
     */
    @JsonIgnore
    public void setTotal(Number total) {
        this.total = total;
    }

    public ApplicationSettingsLimits withTotal(Number total) {
        this.total = total;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-messagespersecond
     * 
     */
    @JsonIgnore
    public Number getMessagesPerSecond() {
        return messagesPerSecond;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-messagespersecond
     * 
     */
    @JsonIgnore
    public void setMessagesPerSecond(Number messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    public ApplicationSettingsLimits withMessagesPerSecond(Number messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("daily", daily).append("maximumDuration", maximumDuration).append("total", total).append("messagesPerSecond", messagesPerSecond).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(maximumDuration).append(messagesPerSecond).append(daily).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationSettingsLimits) == false) {
            return false;
        }
        ApplicationSettingsLimits rhs = ((ApplicationSettingsLimits) other);
        return new EqualsBuilder().append(total, rhs.total).append(maximumDuration, rhs.maximumDuration).append(messagesPerSecond, rhs.messagesPerSecond).append(daily, rhs.daily).isEquals();
    }

}
