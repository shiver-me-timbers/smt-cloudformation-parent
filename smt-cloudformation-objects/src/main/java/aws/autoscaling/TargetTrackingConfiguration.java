
package aws.autoscaling;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustomizedMetricSpecification",
    "DisableScaleIn",
    "PredefinedMetricSpecification",
    "TargetValue"
})
public class TargetTrackingConfiguration {

    /**
     * CustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    @JsonProperty("CustomizedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html")
    private CustomizedMetricSpecification customizedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein
     * 
     */
    @JsonProperty("DisableScaleIn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein")
    private Boolean disableScaleIn;
    /**
     * PredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    @JsonProperty("PredefinedMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html")
    private PredefinedMetricSpecification predefinedMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue
     * 
     */
    @JsonProperty("TargetValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue")
    private Double targetValue;

    /**
     * CustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    public CustomizedMetricSpecification getCustomizedMetricSpecification() {
        return customizedMetricSpecification;
    }

    /**
     * CustomizedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
     * 
     */
    public void setCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    public TargetTrackingConfiguration withCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein
     * 
     */
    public Boolean getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein
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
     * PredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    public PredefinedMetricSpecification getPredefinedMetricSpecification() {
        return predefinedMetricSpecification;
    }

    /**
     * PredefinedMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
     * 
     */
    public void setPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    public TargetTrackingConfiguration withPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue
     * 
     */
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue
     * 
     */
    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    public TargetTrackingConfiguration withTargetValue(Double targetValue) {
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
        if ((other instanceof TargetTrackingConfiguration) == false) {
            return false;
        }
        TargetTrackingConfiguration rhs = ((TargetTrackingConfiguration) other);
        return new EqualsBuilder().append(predefinedMetricSpecification, rhs.predefinedMetricSpecification).append(targetValue, rhs.targetValue).append(disableScaleIn, rhs.disableScaleIn).append(customizedMetricSpecification, rhs.customizedMetricSpecification).isEquals();
    }

}
