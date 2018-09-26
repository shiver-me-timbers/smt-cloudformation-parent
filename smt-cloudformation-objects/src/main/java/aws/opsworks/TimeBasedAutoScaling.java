
package aws.opsworks;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TimeBasedAutoScaling
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Friday",
    "Monday",
    "Saturday",
    "Sunday",
    "Thursday",
    "Tuesday",
    "Wednesday"
})
public class TimeBasedAutoScaling {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday
     * 
     */
    @JsonProperty("Friday")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday")
    private Map<String, String> friday;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday
     * 
     */
    @JsonProperty("Monday")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday")
    private Map<String, String> monday;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday
     * 
     */
    @JsonProperty("Saturday")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday")
    private Map<String, String> saturday;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday
     * 
     */
    @JsonProperty("Sunday")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday")
    private Map<String, String> sunday;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday
     * 
     */
    @JsonProperty("Thursday")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday")
    private Map<String, String> thursday;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday
     * 
     */
    @JsonProperty("Tuesday")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday")
    private Map<String, String> tuesday;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday
     * 
     */
    @JsonProperty("Wednesday")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday")
    private Map<String, String> wednesday;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday
     * 
     */
    public Map<String, String> getFriday() {
        return friday;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday
     * 
     */
    public void setFriday(Map<String, String> friday) {
        this.friday = friday;
    }

    public TimeBasedAutoScaling withFriday(Map<String, String> friday) {
        this.friday = friday;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday
     * 
     */
    public Map<String, String> getMonday() {
        return monday;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday
     * 
     */
    public void setMonday(Map<String, String> monday) {
        this.monday = monday;
    }

    public TimeBasedAutoScaling withMonday(Map<String, String> monday) {
        this.monday = monday;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday
     * 
     */
    public Map<String, String> getSaturday() {
        return saturday;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday
     * 
     */
    public void setSaturday(Map<String, String> saturday) {
        this.saturday = saturday;
    }

    public TimeBasedAutoScaling withSaturday(Map<String, String> saturday) {
        this.saturday = saturday;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday
     * 
     */
    public Map<String, String> getSunday() {
        return sunday;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday
     * 
     */
    public void setSunday(Map<String, String> sunday) {
        this.sunday = sunday;
    }

    public TimeBasedAutoScaling withSunday(Map<String, String> sunday) {
        this.sunday = sunday;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday
     * 
     */
    public Map<String, String> getThursday() {
        return thursday;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday
     * 
     */
    public void setThursday(Map<String, String> thursday) {
        this.thursday = thursday;
    }

    public TimeBasedAutoScaling withThursday(Map<String, String> thursday) {
        this.thursday = thursday;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday
     * 
     */
    public Map<String, String> getTuesday() {
        return tuesday;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday
     * 
     */
    public void setTuesday(Map<String, String> tuesday) {
        this.tuesday = tuesday;
    }

    public TimeBasedAutoScaling withTuesday(Map<String, String> tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday
     * 
     */
    public Map<String, String> getWednesday() {
        return wednesday;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday
     * 
     */
    public void setWednesday(Map<String, String> wednesday) {
        this.wednesday = wednesday;
    }

    public TimeBasedAutoScaling withWednesday(Map<String, String> wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("friday", friday).append("monday", monday).append("saturday", saturday).append("sunday", sunday).append("thursday", thursday).append("tuesday", tuesday).append("wednesday", wednesday).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sunday).append(saturday).append(tuesday).append(friday).append(thursday).append(wednesday).append(monday).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeBasedAutoScaling) == false) {
            return false;
        }
        TimeBasedAutoScaling rhs = ((TimeBasedAutoScaling) other);
        return new EqualsBuilder().append(sunday, rhs.sunday).append(saturday, rhs.saturday).append(tuesday, rhs.tuesday).append(friday, rhs.friday).append(thursday, rhs.thursday).append(wednesday, rhs.wednesday).append(monday, rhs.monday).isEquals();
    }

}
