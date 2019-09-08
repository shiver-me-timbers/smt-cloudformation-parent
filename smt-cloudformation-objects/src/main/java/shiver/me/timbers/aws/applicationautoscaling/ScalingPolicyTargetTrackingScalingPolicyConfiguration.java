
package shiver.me.timbers.aws.applicationautoscaling;

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
 * ScalingPolicyTargetTrackingScalingPolicyConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CustomizedMetricSpecification",
    "DisableScaleIn",
    "PredefinedMetricSpecification",
    "ScaleInCooldown",
    "ScaleOutCooldown",
    "TargetValue"
})
public class ScalingPolicyTargetTrackingScalingPolicyConfiguration implements Property<ScalingPolicyTargetTrackingScalingPolicyConfiguration>
{

    /**
     * ScalingPolicyCustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonProperty("CustomizedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html")
    private Property<ScalingPolicyCustomizedMetricSpecification> customizedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein
     * 
     */
    @JsonProperty("DisableScaleIn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein")
    private CharSequence disableScaleIn;
    /**
     * ScalingPolicyPredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonProperty("PredefinedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html")
    private Property<ScalingPolicyPredefinedMetricSpecification> predefinedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown
     * 
     */
    @JsonProperty("ScaleInCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown")
    private Number scaleInCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown
     * 
     */
    @JsonProperty("ScaleOutCooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown")
    private Number scaleOutCooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue
     * 
     */
    @JsonProperty("TargetValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue")
    private Number targetValue;

    /**
     * ScalingPolicyCustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPolicyCustomizedMetricSpecification> getCustomizedMetricSpecification() {
        return customizedMetricSpecification;
    }

    /**
     * ScalingPolicyCustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setCustomizedMetricSpecification(Property<ScalingPolicyCustomizedMetricSpecification> customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    public ScalingPolicyTargetTrackingScalingPolicyConfiguration withCustomizedMetricSpecification(Property<ScalingPolicyCustomizedMetricSpecification> customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein
     * 
     */
    @JsonIgnore
    public CharSequence getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein
     * 
     */
    @JsonIgnore
    public void setDisableScaleIn(CharSequence disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    public ScalingPolicyTargetTrackingScalingPolicyConfiguration withDisableScaleIn(CharSequence disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }

    /**
     * ScalingPolicyPredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPolicyPredefinedMetricSpecification> getPredefinedMetricSpecification() {
        return predefinedMetricSpecification;
    }

    /**
     * ScalingPolicyPredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setPredefinedMetricSpecification(Property<ScalingPolicyPredefinedMetricSpecification> predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    public ScalingPolicyTargetTrackingScalingPolicyConfiguration withPredefinedMetricSpecification(Property<ScalingPolicyPredefinedMetricSpecification> predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown
     * 
     */
    @JsonIgnore
    public Number getScaleInCooldown() {
        return scaleInCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown
     * 
     */
    @JsonIgnore
    public void setScaleInCooldown(Number scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    public ScalingPolicyTargetTrackingScalingPolicyConfiguration withScaleInCooldown(Number scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown
     * 
     */
    @JsonIgnore
    public Number getScaleOutCooldown() {
        return scaleOutCooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown
     * 
     */
    @JsonIgnore
    public void setScaleOutCooldown(Number scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    public ScalingPolicyTargetTrackingScalingPolicyConfiguration withScaleOutCooldown(Number scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue
     * 
     */
    @JsonIgnore
    public Number getTargetValue() {
        return targetValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue
     * 
     */
    @JsonIgnore
    public void setTargetValue(Number targetValue) {
        this.targetValue = targetValue;
    }

    public ScalingPolicyTargetTrackingScalingPolicyConfiguration withTargetValue(Number targetValue) {
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
        if ((other instanceof ScalingPolicyTargetTrackingScalingPolicyConfiguration) == false) {
            return false;
        }
        ScalingPolicyTargetTrackingScalingPolicyConfiguration rhs = ((ScalingPolicyTargetTrackingScalingPolicyConfiguration) other);
        return new EqualsBuilder().append(predefinedMetricSpecification, rhs.predefinedMetricSpecification).append(disableScaleIn, rhs.disableScaleIn).append(scaleOutCooldown, rhs.scaleOutCooldown).append(scaleInCooldown, rhs.scaleInCooldown).append(targetValue, rhs.targetValue).append(customizedMetricSpecification, rhs.customizedMetricSpecification).isEquals();
    }

}
