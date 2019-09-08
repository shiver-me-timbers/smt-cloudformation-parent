
package shiver.me.timbers.aws.autoscaling;

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
 * ScalingPolicyTargetTrackingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CustomizedMetricSpecification",
    "DisableScaleIn",
    "PredefinedMetricSpecification",
    "TargetValue"
})
public class ScalingPolicyTargetTrackingConfiguration implements Property<ScalingPolicyTargetTrackingConfiguration>
{

    /**
     * ScalingPolicyCustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonProperty("CustomizedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html")
    private Property<ScalingPolicyCustomizedMetricSpecification> customizedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonProperty("DisableScaleIn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein")
    private CharSequence disableScaleIn;
    /**
     * ScalingPolicyPredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonProperty("PredefinedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html")
    private Property<ScalingPolicyPredefinedMetricSpecification> predefinedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonProperty("TargetValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue")
    private Number targetValue;

    /**
     * ScalingPolicyCustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPolicyCustomizedMetricSpecification> getCustomizedMetricSpecification() {
        return customizedMetricSpecification;
    }

    /**
     * ScalingPolicyCustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setCustomizedMetricSpecification(Property<ScalingPolicyCustomizedMetricSpecification> customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    public ScalingPolicyTargetTrackingConfiguration withCustomizedMetricSpecification(Property<ScalingPolicyCustomizedMetricSpecification> customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonIgnore
    public CharSequence getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonIgnore
    public void setDisableScaleIn(CharSequence disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    public ScalingPolicyTargetTrackingConfiguration withDisableScaleIn(CharSequence disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }

    /**
     * ScalingPolicyPredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPolicyPredefinedMetricSpecification> getPredefinedMetricSpecification() {
        return predefinedMetricSpecification;
    }

    /**
     * ScalingPolicyPredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setPredefinedMetricSpecification(Property<ScalingPolicyPredefinedMetricSpecification> predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    public ScalingPolicyTargetTrackingConfiguration withPredefinedMetricSpecification(Property<ScalingPolicyPredefinedMetricSpecification> predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonIgnore
    public Number getTargetValue() {
        return targetValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonIgnore
    public void setTargetValue(Number targetValue) {
        this.targetValue = targetValue;
    }

    public ScalingPolicyTargetTrackingConfiguration withTargetValue(Number targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customizedMetricSpecification", customizedMetricSpecification).append("disableScaleIn", disableScaleIn).append("predefinedMetricSpecification", predefinedMetricSpecification).append("targetValue", targetValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(predefinedMetricSpecification).append(targetValue).append(disableScaleIn).append(customizedMetricSpecification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPolicyTargetTrackingConfiguration) == false) {
            return false;
        }
        ScalingPolicyTargetTrackingConfiguration rhs = ((ScalingPolicyTargetTrackingConfiguration) other);
        return new EqualsBuilder().append(predefinedMetricSpecification, rhs.predefinedMetricSpecification).append(targetValue, rhs.targetValue).append(disableScaleIn, rhs.disableScaleIn).append(customizedMetricSpecification, rhs.customizedMetricSpecification).isEquals();
    }

}
