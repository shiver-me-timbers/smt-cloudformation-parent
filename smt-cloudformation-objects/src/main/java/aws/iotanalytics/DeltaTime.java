
package aws.iotanalytics;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeltaTime
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimeExpression",
    "OffsetSeconds"
})
public class DeltaTime {

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
    private Integer offsetSeconds;

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

    public DeltaTime withTimeExpression(CharSequence timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds
     * 
     */
    @JsonIgnore
    public Integer getOffsetSeconds() {
        return offsetSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds
     * 
     */
    @JsonIgnore
    public void setOffsetSeconds(Integer offsetSeconds) {
        this.offsetSeconds = offsetSeconds;
    }

    public DeltaTime withOffsetSeconds(Integer offsetSeconds) {
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
        if ((other instanceof DeltaTime) == false) {
            return false;
        }
        DeltaTime rhs = ((DeltaTime) other);
        return new EqualsBuilder().append(timeExpression, rhs.timeExpression).append(offsetSeconds, rhs.offsetSeconds).isEquals();
    }

}
