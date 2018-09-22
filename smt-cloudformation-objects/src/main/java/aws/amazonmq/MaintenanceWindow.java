
package aws.amazonmq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MaintenanceWindow
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DayOfWeek",
    "TimeOfDay",
    "TimeZone"
})
public class MaintenanceWindow {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-dayofweek
     * 
     */
    @JsonProperty("DayOfWeek")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-dayofweek")
    private String dayOfWeek;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timeofday
     * 
     */
    @JsonProperty("TimeOfDay")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timeofday")
    private String timeOfDay;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timezone
     * 
     */
    @JsonProperty("TimeZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timezone")
    private String timeZone;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-dayofweek
     * 
     */
    @JsonProperty("DayOfWeek")
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-dayofweek
     * 
     */
    @JsonProperty("DayOfWeek")
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public MaintenanceWindow withDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timeofday
     * 
     */
    @JsonProperty("TimeOfDay")
    public String getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timeofday
     * 
     */
    @JsonProperty("TimeOfDay")
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public MaintenanceWindow withTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timezone
     * 
     */
    @JsonProperty("TimeZone")
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timezone
     * 
     */
    @JsonProperty("TimeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public MaintenanceWindow withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dayOfWeek", dayOfWeek).append("timeOfDay", timeOfDay).append("timeZone", timeZone).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeZone).append(dayOfWeek).append(timeOfDay).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaintenanceWindow) == false) {
            return false;
        }
        MaintenanceWindow rhs = ((MaintenanceWindow) other);
        return new EqualsBuilder().append(timeZone, rhs.timeZone).append(dayOfWeek, rhs.dayOfWeek).append(timeOfDay, rhs.timeOfDay).isEquals();
    }

}
