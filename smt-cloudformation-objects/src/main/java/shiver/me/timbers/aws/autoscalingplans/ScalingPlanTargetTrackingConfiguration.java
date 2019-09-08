
package shiver.me.timbers.aws.autoscalingplans;

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
 * ScalingPlanTargetTrackingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ScaleOutCooldown",
    "TargetValue",
    "PredefinedScalingMetricSpecification",
    "DisableScaleIn",
    "ScaleInCooldown",
    "EstimatedInstanceWarmup",
    "CustomizedScalingMetricSpecification"
})
public class ScalingPlanTargetTrackingConfiguration implements Property<ScalingPlanTargetTrackingConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown
     * 
     */
    @JsonProperty("ScaleOutCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown")
    private Number scaleOutCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonProperty("TargetValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue")
    private Number targetValue;
    /**
     * ScalingPlanPredefinedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
     * 
     */
    @JsonProperty("PredefinedScalingMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html")
    private Property<ScalingPlanPredefinedScalingMetricSpecification> predefinedScalingMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonProperty("DisableScaleIn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein")
    private CharSequence disableScaleIn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown
     * 
     */
    @JsonProperty("ScaleInCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown")
    private Number scaleInCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup
     * 
     */
    @JsonProperty("EstimatedInstanceWarmup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup")
    private Number estimatedInstanceWarmup;
    /**
     * ScalingPlanCustomizedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
     * 
     */
    @JsonProperty("CustomizedScalingMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html")
    private Property<ScalingPlanCustomizedScalingMetricSpecification> customizedScalingMetricSpecification;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown
     * 
     */
    @JsonIgnore
    public Number getScaleOutCooldown() {
        return scaleOutCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown
     * 
     */
    @JsonIgnore
    public void setScaleOutCooldown(Number scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    public ScalingPlanTargetTrackingConfiguration withScaleOutCooldown(Number scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonIgnore
    public Number getTargetValue() {
        return targetValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonIgnore
    public void setTargetValue(Number targetValue) {
        this.targetValue = targetValue;
    }

    public ScalingPlanTargetTrackingConfiguration withTargetValue(Number targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * ScalingPlanPredefinedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPlanPredefinedScalingMetricSpecification> getPredefinedScalingMetricSpecification() {
        return predefinedScalingMetricSpecification;
    }

    /**
     * ScalingPlanPredefinedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setPredefinedScalingMetricSpecification(Property<ScalingPlanPredefinedScalingMetricSpecification> predefinedScalingMetricSpecification) {
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
    }

    public ScalingPlanTargetTrackingConfiguration withPredefinedScalingMetricSpecification(Property<ScalingPlanPredefinedScalingMetricSpecification> predefinedScalingMetricSpecification) {
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonIgnore
    public CharSequence getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonIgnore
    public void setDisableScaleIn(CharSequence disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    public ScalingPlanTargetTrackingConfiguration withDisableScaleIn(CharSequence disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown
     * 
     */
    @JsonIgnore
    public Number getScaleInCooldown() {
        return scaleInCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown
     * 
     */
    @JsonIgnore
    public void setScaleInCooldown(Number scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    public ScalingPlanTargetTrackingConfiguration withScaleInCooldown(Number scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup
     * 
     */
    @JsonIgnore
    public Number getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup
     * 
     */
    @JsonIgnore
    public void setEstimatedInstanceWarmup(Number estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    public ScalingPlanTargetTrackingConfiguration withEstimatedInstanceWarmup(Number estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }

    /**
     * ScalingPlanCustomizedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPlanCustomizedScalingMetricSpecification> getCustomizedScalingMetricSpecification() {
        return customizedScalingMetricSpecification;
    }

    /**
     * ScalingPlanCustomizedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setCustomizedScalingMetricSpecification(Property<ScalingPlanCustomizedScalingMetricSpecification> customizedScalingMetricSpecification) {
        this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
    }

    public ScalingPlanTargetTrackingConfiguration withCustomizedScalingMetricSpecification(Property<ScalingPlanCustomizedScalingMetricSpecification> customizedScalingMetricSpecification) {
        this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scaleOutCooldown", scaleOutCooldown).append("targetValue", targetValue).append("predefinedScalingMetricSpecification", predefinedScalingMetricSpecification).append("disableScaleIn", disableScaleIn).append("scaleInCooldown", scaleInCooldown).append("estimatedInstanceWarmup", estimatedInstanceWarmup).append("customizedScalingMetricSpecification", customizedScalingMetricSpecification).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(disableScaleIn).append(estimatedInstanceWarmup).append(customizedScalingMetricSpecification).append(scaleOutCooldown).append(scaleInCooldown).append(targetValue).append(predefinedScalingMetricSpecification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPlanTargetTrackingConfiguration) == false) {
            return false;
        }
        ScalingPlanTargetTrackingConfiguration rhs = ((ScalingPlanTargetTrackingConfiguration) other);
        return new EqualsBuilder().append(disableScaleIn, rhs.disableScaleIn).append(estimatedInstanceWarmup, rhs.estimatedInstanceWarmup).append(customizedScalingMetricSpecification, rhs.customizedScalingMetricSpecification).append(scaleOutCooldown, rhs.scaleOutCooldown).append(scaleInCooldown, rhs.scaleInCooldown).append(targetValue, rhs.targetValue).append(predefinedScalingMetricSpecification, rhs.predefinedScalingMetricSpecification).isEquals();
    }

}
