
package aws.applicationautoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TargetTrackingScalingPolicyConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustomizedMetricSpecification",
    "DisableScaleIn",
    "PredefinedMetricSpecification",
    "ScaleInCooldown",
    "ScaleOutCooldown",
    "TargetValue"
})
public class TargetTrackingScalingPolicyConfiguration {

    /**
     * CustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonProperty("CustomizedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html")
    private CustomizedMetricSpecification customizedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein
     * 
     */
    @JsonProperty("DisableScaleIn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein")
    private Boolean disableScaleIn;
    /**
     * PredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonProperty("PredefinedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html")
    private PredefinedMetricSpecification predefinedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown
     * 
     */
    @JsonProperty("ScaleInCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown")
    private Integer scaleInCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown
     * 
     */
    @JsonProperty("ScaleOutCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown")
    private Integer scaleOutCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue
     * 
     */
    @JsonProperty("TargetValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue")
    private Double targetValue;

    /**
     * CustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    public CustomizedMetricSpecification getCustomizedMetricSpecification() {
        return customizedMetricSpecification;
    }

    /**
     * CustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    public void setCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    public TargetTrackingScalingPolicyConfiguration withCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein
     * 
     */
    public Boolean getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein
     * 
     */
    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    public TargetTrackingScalingPolicyConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }

    /**
     * PredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    public PredefinedMetricSpecification getPredefinedMetricSpecification() {
        return predefinedMetricSpecification;
    }

    /**
     * PredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    public void setPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    public TargetTrackingScalingPolicyConfiguration withPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown
     * 
     */
    public Integer getScaleInCooldown() {
        return scaleInCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown
     * 
     */
    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    public TargetTrackingScalingPolicyConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown
     * 
     */
    public Integer getScaleOutCooldown() {
        return scaleOutCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown
     * 
     */
    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    public TargetTrackingScalingPolicyConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue
     * 
     */
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue
     * 
     */
    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    public TargetTrackingScalingPolicyConfiguration withTargetValue(Double targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customizedMetricSpecification", customizedMetricSpecification).append("disableScaleIn", disableScaleIn).append("predefinedMetricSpecification", predefinedMetricSpecification).append("scaleInCooldown", scaleInCooldown).append("scaleOutCooldown", scaleOutCooldown).append("targetValue", targetValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(predefinedMetricSpecification).append(disableScaleIn).append(scaleOutCooldown).append(scaleInCooldown).append(targetValue).append(customizedMetricSpecification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TargetTrackingScalingPolicyConfiguration) == false) {
            return false;
        }
        TargetTrackingScalingPolicyConfiguration rhs = ((TargetTrackingScalingPolicyConfiguration) other);
        return new EqualsBuilder().append(predefinedMetricSpecification, rhs.predefinedMetricSpecification).append(disableScaleIn, rhs.disableScaleIn).append(scaleOutCooldown, rhs.scaleOutCooldown).append(scaleInCooldown, rhs.scaleInCooldown).append(targetValue, rhs.targetValue).append(customizedMetricSpecification, rhs.customizedMetricSpecification).isEquals();
    }

}
