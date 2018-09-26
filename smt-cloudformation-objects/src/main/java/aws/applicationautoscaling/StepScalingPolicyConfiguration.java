
package aws.applicationautoscaling;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StepScalingPolicyConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AdjustmentType",
    "Cooldown",
    "MetricAggregationType",
    "MinAdjustmentMagnitude",
    "StepAdjustments"
})
public class StepScalingPolicyConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype
     * 
     */
    @JsonProperty("AdjustmentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype")
    private CharSequence adjustmentType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown")
    private Integer cooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype
     * 
     */
    @JsonProperty("MetricAggregationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype")
    private CharSequence metricAggregationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude
     * 
     */
    @JsonProperty("MinAdjustmentMagnitude")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude")
    private Integer minAdjustmentMagnitude;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments
     * 
     */
    @JsonProperty("StepAdjustments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments")
    private Set<StepAdjustment> stepAdjustments = new LinkedHashSet<StepAdjustment>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype
     * 
     */
    public CharSequence getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype
     * 
     */
    public void setAdjustmentType(CharSequence adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public StepScalingPolicyConfiguration withAdjustmentType(CharSequence adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown
     * 
     */
    public Integer getCooldown() {
        return cooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown
     * 
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    public StepScalingPolicyConfiguration withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype
     * 
     */
    public CharSequence getMetricAggregationType() {
        return metricAggregationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype
     * 
     */
    public void setMetricAggregationType(CharSequence metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    public StepScalingPolicyConfiguration withMetricAggregationType(CharSequence metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude
     * 
     */
    public Integer getMinAdjustmentMagnitude() {
        return minAdjustmentMagnitude;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude
     * 
     */
    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    public StepScalingPolicyConfiguration withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments
     * 
     */
    public Set<StepAdjustment> getStepAdjustments() {
        return stepAdjustments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments
     * 
     */
    public void setStepAdjustments(Set<StepAdjustment> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
    }

    public StepScalingPolicyConfiguration withStepAdjustments(Set<StepAdjustment> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("adjustmentType", adjustmentType).append("cooldown", cooldown).append("metricAggregationType", metricAggregationType).append("minAdjustmentMagnitude", minAdjustmentMagnitude).append("stepAdjustments", stepAdjustments).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cooldown).append(stepAdjustments).append(adjustmentType).append(minAdjustmentMagnitude).append(metricAggregationType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepScalingPolicyConfiguration) == false) {
            return false;
        }
        StepScalingPolicyConfiguration rhs = ((StepScalingPolicyConfiguration) other);
        return new EqualsBuilder().append(cooldown, rhs.cooldown).append(stepAdjustments, rhs.stepAdjustments).append(adjustmentType, rhs.adjustmentType).append(minAdjustmentMagnitude, rhs.minAdjustmentMagnitude).append(metricAggregationType, rhs.metricAggregationType).isEquals();
    }

}
