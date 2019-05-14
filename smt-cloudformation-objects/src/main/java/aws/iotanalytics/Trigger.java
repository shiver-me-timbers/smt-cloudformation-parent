
package aws.iotanalytics;

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
 * Trigger
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Schedule",
    "TriggeringDataset"
})
public class Trigger implements Property<Trigger>
{

    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html")
    private Property<Schedule> schedule;
    /**
     * TriggeringDataset
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html
     * 
     */
    @JsonProperty("TriggeringDataset")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html")
    private Property<TriggeringDataset> triggeringDataset;

    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html
     * 
     */
    @JsonIgnore
    public Property<Schedule> getSchedule() {
        return schedule;
    }

    /**
     * Schedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html
     * 
     */
    @JsonIgnore
    public void setSchedule(Property<Schedule> schedule) {
        this.schedule = schedule;
    }

    public Trigger withSchedule(Property<Schedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * TriggeringDataset
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html
     * 
     */
    @JsonIgnore
    public Property<TriggeringDataset> getTriggeringDataset() {
        return triggeringDataset;
    }

    /**
     * TriggeringDataset
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html
     * 
     */
    @JsonIgnore
    public void setTriggeringDataset(Property<TriggeringDataset> triggeringDataset) {
        this.triggeringDataset = triggeringDataset;
    }

    public Trigger withTriggeringDataset(Property<TriggeringDataset> triggeringDataset) {
        this.triggeringDataset = triggeringDataset;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("schedule", schedule).append("triggeringDataset", triggeringDataset).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schedule).append(triggeringDataset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trigger) == false) {
            return false;
        }
        Trigger rhs = ((Trigger) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(triggeringDataset, rhs.triggeringDataset).isEquals();
    }

}
