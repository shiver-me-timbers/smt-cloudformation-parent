
package shiver.me.timbers.aws.autoscaling;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ScalingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    private CharSequence adjustmentType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname")
    private CharSequence autoScalingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown")
    private CharSequence cooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup
     * 
     */
    @JsonProperty("EstimatedInstanceWarmup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup")
    private Number estimatedInstanceWarmup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype
     * 
     */
    @JsonProperty("MetricAggregationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype")
    private CharSequence metricAggregationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude
     * 
     */
    @JsonProperty("MinAdjustmentMagnitude")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude")
    private Number minAdjustmentMagnitude;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype")
    private CharSequence policyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment
     * 
     */
    @JsonProperty("ScalingAdjustment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment")
    private Number scalingAdjustment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments
     * 
     */
    @JsonProperty("StepAdjustments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments")
    private Set<Property<ScalingPolicyStepAdjustment>> stepAdjustments = new LinkedHashSet<Property<ScalingPolicyStepAdjustment>>();
    /**
     * ScalingPolicyTargetTrackingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
     * 
     */
    @JsonProperty("TargetTrackingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html")
    private Property<ScalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype
     * 
     */
    @JsonIgnore
    public CharSequence getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype
     * 
     */
    @JsonIgnore
    public void setAdjustmentType(CharSequence adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public ScalingPolicy withAdjustmentType(CharSequence adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname
     * 
     */
    @JsonIgnore
    public CharSequence getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname
     * 
     */
    @JsonIgnore
    public void setAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    public ScalingPolicy withAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown
     * 
     */
    @JsonIgnore
    public CharSequence getCooldown() {
        return cooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown
     * 
     */
    @JsonIgnore
    public void setCooldown(CharSequence cooldown) {
        this.cooldown = cooldown;
    }

    public ScalingPolicy withCooldown(CharSequence cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup
     * 
     */
    @JsonIgnore
    public Number getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup
     * 
     */
    @JsonIgnore
    public void setEstimatedInstanceWarmup(Number estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    public ScalingPolicy withEstimatedInstanceWarmup(Number estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype
     * 
     */
    @JsonIgnore
    public CharSequence getMetricAggregationType() {
        return metricAggregationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype
     * 
     */
    @JsonIgnore
    public void setMetricAggregationType(CharSequence metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    public ScalingPolicy withMetricAggregationType(CharSequence metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude
     * 
     */
    @JsonIgnore
    public Number getMinAdjustmentMagnitude() {
        return minAdjustmentMagnitude;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude
     * 
     */
    @JsonIgnore
    public void setMinAdjustmentMagnitude(Number minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    public ScalingPolicy withMinAdjustmentMagnitude(Number minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype
     * 
     */
    @JsonIgnore
    public void setPolicyType(CharSequence policyType) {
        this.policyType = policyType;
    }

    public ScalingPolicy withPolicyType(CharSequence policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment
     * 
     */
    @JsonIgnore
    public Number getScalingAdjustment() {
        return scalingAdjustment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment
     * 
     */
    @JsonIgnore
    public void setScalingAdjustment(Number scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    public ScalingPolicy withScalingAdjustment(Number scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments
     * 
     */
    @JsonIgnore
    public Set<Property<ScalingPolicyStepAdjustment>> getStepAdjustments() {
        return stepAdjustments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments
     * 
     */
    @JsonIgnore
    public void setStepAdjustments(Set<Property<ScalingPolicyStepAdjustment>> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
    }

    public ScalingPolicy withStepAdjustments(Set<Property<ScalingPolicyStepAdjustment>> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
        return this;
    }

    /**
     * ScalingPolicyTargetTrackingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPolicyTargetTrackingConfiguration> getTargetTrackingConfiguration() {
        return targetTrackingConfiguration;
    }

    /**
     * ScalingPolicyTargetTrackingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
     * 
     */
    @JsonIgnore
    public void setTargetTrackingConfiguration(Property<ScalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    public ScalingPolicy withTargetTrackingConfiguration(Property<ScalingPolicyTargetTrackingConfiguration> targetTrackingConfiguration) {
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
