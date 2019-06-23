
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
 * DatasetTrigger
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Schedule",
    "TriggeringDataset"
})
public class DatasetTrigger implements Property<DatasetTrigger>
{

    /**
     * DatasetSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html")
    private Property<DatasetSchedule> schedule;
    /**
     * DatasetTriggeringDataset
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html
     * 
     */
    @JsonProperty("TriggeringDataset")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html")
    private Property<DatasetTriggeringDataset> triggeringDataset;

    /**
     * DatasetSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html
     * 
     */
    @JsonIgnore
    public Property<DatasetSchedule> getSchedule() {
        return schedule;
    }

    /**
     * DatasetSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger-schedule.html
     * 
     */
    @JsonIgnore
    public void setSchedule(Property<DatasetSchedule> schedule) {
        this.schedule = schedule;
    }

    public DatasetTrigger withSchedule(Property<DatasetSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * DatasetTriggeringDataset
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html
     * 
     */
    @JsonIgnore
    public Property<DatasetTriggeringDataset> getTriggeringDataset() {
        return triggeringDataset;
    }

    /**
     * DatasetTriggeringDataset
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html
     * 
     */
    @JsonIgnore
    public void setTriggeringDataset(Property<DatasetTriggeringDataset> triggeringDataset) {
        this.triggeringDataset = triggeringDataset;
    }

    public DatasetTrigger withTriggeringDataset(Property<DatasetTriggeringDataset> triggeringDataset) {
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
        if ((other instanceof DatasetTrigger) == false) {
            return false;
        }
        DatasetTrigger rhs = ((DatasetTrigger) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(triggeringDataset, rhs.triggeringDataset).isEquals();
    }

}
