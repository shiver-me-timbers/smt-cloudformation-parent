
package aws.autoscaling;

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
 * ScalingPolicyStepAdjustment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MetricIntervalLowerBound",
    "MetricIntervalUpperBound",
    "ScalingAdjustment"
})
public class ScalingPolicyStepAdjustment implements Property<ScalingPolicyStepAdjustment>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound
     * 
     */
    @JsonProperty("MetricIntervalLowerBound")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound")
    private Number metricIntervalLowerBound;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound
     * 
     */
    @JsonProperty("MetricIntervalUpperBound")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound")
    private Number metricIntervalUpperBound;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment
     * 
     */
    @JsonProperty("ScalingAdjustment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment")
    private Number scalingAdjustment;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound
     * 
     */
    @JsonIgnore
    public Number getMetricIntervalLowerBound() {
        return metricIntervalLowerBound;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound
     * 
     */
    @JsonIgnore
    public void setMetricIntervalLowerBound(Number metricIntervalLowerBound) {
        this.metricIntervalLowerBound = metricIntervalLowerBound;
    }

    public ScalingPolicyStepAdjustment withMetricIntervalLowerBound(Number metricIntervalLowerBound) {
        this.metricIntervalLowerBound = metricIntervalLowerBound;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound
     * 
     */
    @JsonIgnore
    public Number getMetricIntervalUpperBound() {
        return metricIntervalUpperBound;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound
     * 
     */
    @JsonIgnore
    public void setMetricIntervalUpperBound(Number metricIntervalUpperBound) {
        this.metricIntervalUpperBound = metricIntervalUpperBound;
    }

    public ScalingPolicyStepAdjustment withMetricIntervalUpperBound(Number metricIntervalUpperBound) {
        this.metricIntervalUpperBound = metricIntervalUpperBound;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment
     * 
     */
    @JsonIgnore
    public Number getScalingAdjustment() {
        return scalingAdjustment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment
     * 
     */
    @JsonIgnore
    public void setScalingAdjustment(Number scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    public ScalingPolicyStepAdjustment withScalingAdjustment(Number scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metricIntervalLowerBound", metricIntervalLowerBound).append("metricIntervalUpperBound", metricIntervalUpperBound).append("scalingAdjustment", scalingAdjustment).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scalingAdjustment).append(metricIntervalLowerBound).append(metricIntervalUpperBound).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPolicyStepAdjustment) == false) {
            return false;
        }
        ScalingPolicyStepAdjustment rhs = ((ScalingPolicyStepAdjustment) other);
        return new EqualsBuilder().append(scalingAdjustment, rhs.scalingAdjustment).append(metricIntervalLowerBound, rhs.metricIntervalLowerBound).append(metricIntervalUpperBound, rhs.metricIntervalUpperBound).isEquals();
    }

}
