
package aws.autoscaling;

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
 * ScalingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AdjustmentType",
    "AutoScalingGroupName",
    "Cooldown",
    "EstimatedInstanceWarmup",
    "MetricAggregationType",
    "MinAdjustmentMagnitude",
    "PolicyType",
    "ScalingAdjustment",
    "StepAdjustments",
    "TargetTrackingConfiguration"
})
public class ScalingPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype
     * 
     */
    @JsonProperty("AdjustmentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype")
    private String adjustmentType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname")
    private String autoScalingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown")
    private String cooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup
     * 
     */
    @JsonProperty("EstimatedInstanceWarmup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup")
    private Integer estimatedInstanceWarmup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype
     * 
     */
    @JsonProperty("MetricAggregationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype")
    private String metricAggregationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude
     * 
     */
    @JsonProperty("MinAdjustmentMagnitude")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude")
    private Integer minAdjustmentMagnitude;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype")
    private String policyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment
     * 
     */
    @JsonProperty("ScalingAdjustment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment")
    private Integer scalingAdjustment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments
     * 
     */
    @JsonProperty("StepAdjustments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments")
    private Set<StepAdjustment> stepAdjustments = new LinkedHashSet<StepAdjustment>();
    /**
     * TargetTrackingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
     * 
     */
    @JsonProperty("TargetTrackingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html")
    private TargetTrackingConfiguration targetTrackingConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype
     * 
     */
    @JsonProperty("AdjustmentType")
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype
     * 
     */
    @JsonProperty("AdjustmentType")
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public ScalingPolicy withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    public ScalingPolicy withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    public String getCooldown() {
        return cooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }

    public ScalingPolicy withCooldown(String cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup
     * 
     */
    @JsonProperty("EstimatedInstanceWarmup")
    public Integer getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup
     * 
     */
    @JsonProperty("EstimatedInstanceWarmup")
    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    public ScalingPolicy withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype
     * 
     */
    @JsonProperty("MetricAggregationType")
    public String getMetricAggregationType() {
        return metricAggregationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype
     * 
     */
    @JsonProperty("MetricAggregationType")
    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    public ScalingPolicy withMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude
     * 
     */
    @JsonProperty("MinAdjustmentMagnitude")
    public Integer getMinAdjustmentMagnitude() {
        return minAdjustmentMagnitude;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude
     * 
     */
    @JsonProperty("MinAdjustmentMagnitude")
    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    public ScalingPolicy withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    public String getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public ScalingPolicy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment
     * 
     */
    @JsonProperty("ScalingAdjustment")
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment
     * 
     */
    @JsonProperty("ScalingAdjustment")
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    public ScalingPolicy withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments
     * 
     */
    @JsonProperty("StepAdjustments")
    public Set<StepAdjustment> getStepAdjustments() {
        return stepAdjustments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments
     * 
     */
    @JsonProperty("StepAdjustments")
    public void setStepAdjustments(Set<StepAdjustment> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
    }

    public ScalingPolicy withStepAdjustments(Set<StepAdjustment> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
        return this;
    }

    /**
     * TargetTrackingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
     * 
     */
    @JsonProperty("TargetTrackingConfiguration")
    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return targetTrackingConfiguration;
    }

    /**
     * TargetTrackingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
     * 
     */
    @JsonProperty("TargetTrackingConfiguration")
    public void setTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    public ScalingPolicy withTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("adjustmentType", adjustmentType).append("autoScalingGroupName", autoScalingGroupName).append("cooldown", cooldown).append("estimatedInstanceWarmup", estimatedInstanceWarmup).append("metricAggregationType", metricAggregationType).append("minAdjustmentMagnitude", minAdjustmentMagnitude).append("policyType", policyType).append("scalingAdjustment", scalingAdjustment).append("stepAdjustments", stepAdjustments).append("targetTrackingConfiguration", targetTrackingConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(autoScalingGroupName).append(estimatedInstanceWarmup).append(stepAdjustments).append(adjustmentType).append(metricAggregationType).append(policyType).append(cooldown).append(scalingAdjustment).append(targetTrackingConfiguration).append(minAdjustmentMagnitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPolicy) == false) {
            return false;
        }
        ScalingPolicy rhs = ((ScalingPolicy) other);
        return new EqualsBuilder().append(autoScalingGroupName, rhs.autoScalingGroupName).append(estimatedInstanceWarmup, rhs.estimatedInstanceWarmup).append(stepAdjustments, rhs.stepAdjustments).append(adjustmentType, rhs.adjustmentType).append(metricAggregationType, rhs.metricAggregationType).append(policyType, rhs.policyType).append(cooldown, rhs.cooldown).append(scalingAdjustment, rhs.scalingAdjustment).append(targetTrackingConfiguration, rhs.targetTrackingConfiguration).append(minAdjustmentMagnitude, rhs.minAdjustmentMagnitude).isEquals();
    }

}
