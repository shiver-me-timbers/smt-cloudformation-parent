
package aws.autoscalingplans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TargetTrackingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ScaleOutCooldown",
    "TargetValue",
    "PredefinedScalingMetricSpecification",
    "DisableScaleIn",
    "ScaleInCooldown",
    "EstimatedInstanceWarmup",
    "CustomizedScalingMetricSpecification"
})
public class TargetTrackingConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown
     * 
     */
    @JsonProperty("ScaleOutCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown")
    private Integer scaleOutCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonProperty("TargetValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue")
    private Double targetValue;
    /**
     * PredefinedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
     * 
     */
    @JsonProperty("PredefinedScalingMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html")
    private PredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonProperty("DisableScaleIn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein")
    private Boolean disableScaleIn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown
     * 
     */
    @JsonProperty("ScaleInCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown")
    private Integer scaleInCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup
     * 
     */
    @JsonProperty("EstimatedInstanceWarmup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup")
    private Integer estimatedInstanceWarmup;
    /**
     * CustomizedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
     * 
     */
    @JsonProperty("CustomizedScalingMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html")
    private CustomizedScalingMetricSpecification customizedScalingMetricSpecification;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown
     * 
     */
    public Integer getScaleOutCooldown() {
        return scaleOutCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown
     * 
     */
    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    public TargetTrackingConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue
     * 
     */
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue
     * 
     */
    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    public TargetTrackingConfiguration withTargetValue(Double targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * PredefinedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
     * 
     */
    public PredefinedScalingMetricSpecification getPredefinedScalingMetricSpecification() {
        return predefinedScalingMetricSpecification;
    }

    /**
     * PredefinedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
     * 
     */
    public void setPredefinedScalingMetricSpecification(PredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
    }

    public TargetTrackingConfiguration withPredefinedScalingMetricSpecification(PredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein
     * 
     */
    public Boolean getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein
     * 
     */
    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    public TargetTrackingConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown
     * 
     */
    public Integer getScaleInCooldown() {
        return scaleInCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown
     * 
     */
    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    public TargetTrackingConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup
     * 
     */
    public Integer getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup
     * 
     */
    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    public TargetTrackingConfiguration withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }

    /**
     * CustomizedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
     * 
     */
    public CustomizedScalingMetricSpecification getCustomizedScalingMetricSpecification() {
        return customizedScalingMetricSpecification;
    }

    /**
     * CustomizedScalingMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
     * 
     */
    public void setCustomizedScalingMetricSpecification(CustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
        this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
    }

    public TargetTrackingConfiguration withCustomizedScalingMetricSpecification(CustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
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
        if ((other instanceof TargetTrackingConfiguration) == false) {
            return false;
        }
        TargetTrackingConfiguration rhs = ((TargetTrackingConfiguration) other);
        return new EqualsBuilder().append(disableScaleIn, rhs.disableScaleIn).append(estimatedInstanceWarmup, rhs.estimatedInstanceWarmup).append(customizedScalingMetricSpecification, rhs.customizedScalingMetricSpecification).append(scaleOutCooldown, rhs.scaleOutCooldown).append(scaleInCooldown, rhs.scaleInCooldown).append(targetValue, rhs.targetValue).append(predefinedScalingMetricSpecification, rhs.predefinedScalingMetricSpecification).isEquals();
    }

}
