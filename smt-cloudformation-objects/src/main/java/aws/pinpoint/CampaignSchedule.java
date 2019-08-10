
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
 * CampaignSchedule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimeZone",
    "QuietTime",
    "EndTime",
    "StartTime",
    "Frequency",
    "EventFilter",
    "IsLocalTime"
})
public class CampaignSchedule implements Property<CampaignSchedule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-timezone
     * 
     */
    @JsonProperty("TimeZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-timezone")
    private CharSequence timeZone;
    /**
     * CampaignQuietTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule-quiettime.html
     * 
     */
    @JsonProperty("QuietTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule-quiettime.html")
    private Property<CampaignQuietTime> quietTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-endtime
     * 
     */
    @JsonProperty("EndTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-endtime")
    private CharSequence endTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-starttime
     * 
     */
    @JsonProperty("StartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-starttime")
    private CharSequence startTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-frequency
     * 
     */
    @JsonProperty("Frequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-frequency")
    private CharSequence frequency;
    /**
     * CampaignCampaignEventFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html
     * 
     */
    @JsonProperty("EventFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html")
    private Property<CampaignCampaignEventFilter> eventFilter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-islocaltime
     * 
     */
    @JsonProperty("IsLocalTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-islocaltime")
    private CharSequence isLocalTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-timezone
     * 
     */
    @JsonIgnore
    public CharSequence getTimeZone() {
        return timeZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-timezone
     * 
     */
    @JsonIgnore
    public void setTimeZone(CharSequence timeZone) {
        this.timeZone = timeZone;
    }

    public CampaignSchedule withTimeZone(CharSequence timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * CampaignQuietTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule-quiettime.html
     * 
     */
    @JsonIgnore
    public Property<CampaignQuietTime> getQuietTime() {
        return quietTime;
    }

    /**
     * CampaignQuietTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule-quiettime.html
     * 
     */
    @JsonIgnore
    public void setQuietTime(Property<CampaignQuietTime> quietTime) {
        this.quietTime = quietTime;
    }

    public CampaignSchedule withQuietTime(Property<CampaignQuietTime> quietTime) {
        this.quietTime = quietTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-endtime
     * 
     */
    @JsonIgnore
    public CharSequence getEndTime() {
        return endTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-endtime
     * 
     */
    @JsonIgnore
    public void setEndTime(CharSequence endTime) {
        this.endTime = endTime;
    }

    public CampaignSchedule withEndTime(CharSequence endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-starttime
     * 
     */
    @JsonIgnore
    public CharSequence getStartTime() {
        return startTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-starttime
     * 
     */
    @JsonIgnore
    public void setStartTime(CharSequence startTime) {
        this.startTime = startTime;
    }

    public CampaignSchedule withStartTime(CharSequence startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-frequency
     * 
     */
    @JsonIgnore
    public CharSequence getFrequency() {
        return frequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-frequency
     * 
     */
    @JsonIgnore
    public void setFrequency(CharSequence frequency) {
        this.frequency = frequency;
    }

    public CampaignSchedule withFrequency(CharSequence frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * CampaignCampaignEventFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html
     * 
     */
    @JsonIgnore
    public Property<CampaignCampaignEventFilter> getEventFilter() {
        return eventFilter;
    }

    /**
     * CampaignCampaignEventFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html
     * 
     */
    @JsonIgnore
    public void setEventFilter(Property<CampaignCampaignEventFilter> eventFilter) {
        this.eventFilter = eventFilter;
    }

    public CampaignSchedule withEventFilter(Property<CampaignCampaignEventFilter> eventFilter) {
        this.eventFilter = eventFilter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-islocaltime
     * 
     */
    @JsonIgnore
    public CharSequence getIsLocalTime() {
        return isLocalTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html#cfn-pinpoint-campaign-schedule-islocaltime
     * 
     */
    @JsonIgnore
    public void setIsLocalTime(CharSequence isLocalTime) {
        this.isLocalTime = isLocalTime;
    }

    public CampaignSchedule withIsLocalTime(CharSequence isLocalTime) {
        this.isLocalTime = isLocalTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timeZone", timeZone).append("quietTime", quietTime).append("endTime", endTime).append("startTime", startTime).append("frequency", frequency).append("eventFilter", eventFilter).append("isLocalTime", isLocalTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(quietTime).append(eventFilter).append(timeZone).append(isLocalTime).append(startTime).append(endTime).append(frequency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignSchedule) == false) {
            return false;
        }
        CampaignSchedule rhs = ((CampaignSchedule) other);
        return new EqualsBuilder().append(quietTime, rhs.quietTime).append(eventFilter, rhs.eventFilter).append(timeZone, rhs.timeZone).append(isLocalTime, rhs.isLocalTime).append(startTime, rhs.startTime).append(endTime, rhs.endTime).append(frequency, rhs.frequency).isEquals();
    }

}
