
package shiver.me.timbers.aws.iotanalytics;

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
 * ChannelRetentionPeriod
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NumberOfDays",
    "Unlimited"
})
public class ChannelRetentionPeriod implements Property<ChannelRetentionPeriod>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-numberofdays
     * 
     */
    @JsonProperty("NumberOfDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-numberofdays")
    private Number numberOfDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-unlimited
     * 
     */
    @JsonProperty("Unlimited")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-unlimited")
    private CharSequence unlimited;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-numberofdays
     * 
     */
    @JsonIgnore
    public Number getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-numberofdays
     * 
     */
    @JsonIgnore
    public void setNumberOfDays(Number numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public ChannelRetentionPeriod withNumberOfDays(Number numberOfDays) {
        this.numberOfDays = numberOfDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-unlimited
     * 
     */
    @JsonIgnore
    public CharSequence getUnlimited() {
        return unlimited;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html#cfn-iotanalytics-channel-retentionperiod-unlimited
     * 
     */
    @JsonIgnore
    public void setUnlimited(CharSequence unlimited) {
        this.unlimited = unlimited;
    }

    public ChannelRetentionPeriod withUnlimited(CharSequence unlimited) {
        this.unlimited = unlimited;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numberOfDays", numberOfDays).append("unlimited", unlimited).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unlimited).append(numberOfDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelRetentionPeriod) == false) {
            return false;
        }
        ChannelRetentionPeriod rhs = ((ChannelRetentionPeriod) other);
        return new EqualsBuilder().append(unlimited, rhs.unlimited).append(numberOfDays, rhs.numberOfDays).isEquals();
    }

}
