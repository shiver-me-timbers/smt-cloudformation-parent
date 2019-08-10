
package aws.cloudwatch;

import java.util.ArrayList;
import java.util.List;
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
 * AnomalyDetectorConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MetricTimeZone",
    "ExcludedTimeRanges"
})
public class AnomalyDetectorConfiguration implements Property<AnomalyDetectorConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-metrictimezone
     * 
     */
    @JsonProperty("MetricTimeZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-metrictimezone")
    private CharSequence metricTimeZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-excludedtimeranges
     * 
     */
    @JsonProperty("ExcludedTimeRanges")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-excludedtimeranges")
    private List<Property<AnomalyDetectorRange>> excludedTimeRanges = new ArrayList<Property<AnomalyDetectorRange>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-metrictimezone
     * 
     */
    @JsonIgnore
    public CharSequence getMetricTimeZone() {
        return metricTimeZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-metrictimezone
     * 
     */
    @JsonIgnore
    public void setMetricTimeZone(CharSequence metricTimeZone) {
        this.metricTimeZone = metricTimeZone;
    }

    public AnomalyDetectorConfiguration withMetricTimeZone(CharSequence metricTimeZone) {
        this.metricTimeZone = metricTimeZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-excludedtimeranges
     * 
     */
    @JsonIgnore
    public List<Property<AnomalyDetectorRange>> getExcludedTimeRanges() {
        return excludedTimeRanges;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-excludedtimeranges
     * 
     */
    @JsonIgnore
    public void setExcludedTimeRanges(List<Property<AnomalyDetectorRange>> excludedTimeRanges) {
        this.excludedTimeRanges = excludedTimeRanges;
    }

    public AnomalyDetectorConfiguration withExcludedTimeRanges(List<Property<AnomalyDetectorRange>> excludedTimeRanges) {
        this.excludedTimeRanges = excludedTimeRanges;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metricTimeZone", metricTimeZone).append("excludedTimeRanges", excludedTimeRanges).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metricTimeZone).append(excludedTimeRanges).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnomalyDetectorConfiguration) == false) {
            return false;
        }
        AnomalyDetectorConfiguration rhs = ((AnomalyDetectorConfiguration) other);
        return new EqualsBuilder().append(metricTimeZone, rhs.metricTimeZone).append(excludedTimeRanges, rhs.excludedTimeRanges).isEquals();
    }

}
