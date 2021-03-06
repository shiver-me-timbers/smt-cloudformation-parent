
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
 * DatasetDeltaTime
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimeExpression",
    "OffsetSeconds"
})
public class DatasetDeltaTime implements Property<DatasetDeltaTime>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-timeexpression
     * 
     */
    @JsonProperty("TimeExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-timeexpression")
    private CharSequence timeExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds
     * 
     */
    @JsonProperty("OffsetSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds")
    private Number offsetSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-timeexpression
     * 
     */
    @JsonIgnore
    public CharSequence getTimeExpression() {
        return timeExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-timeexpression
     * 
     */
    @JsonIgnore
    public void setTimeExpression(CharSequence timeExpression) {
        this.timeExpression = timeExpression;
    }

    public DatasetDeltaTime withTimeExpression(CharSequence timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds
     * 
     */
    @JsonIgnore
    public Number getOffsetSeconds() {
        return offsetSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds
     * 
     */
    @JsonIgnore
    public void setOffsetSeconds(Number offsetSeconds) {
        this.offsetSeconds = offsetSeconds;
    }

    public DatasetDeltaTime withOffsetSeconds(Number offsetSeconds) {
        this.offsetSeconds = offsetSeconds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timeExpression", timeExpression).append("offsetSeconds", offsetSeconds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeExpression).append(offsetSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatasetDeltaTime) == false) {
            return false;
        }
        DatasetDeltaTime rhs = ((DatasetDeltaTime) other);
        return new EqualsBuilder().append(timeExpression, rhs.timeExpression).append(offsetSeconds, rhs.offsetSeconds).isEquals();
    }

}
