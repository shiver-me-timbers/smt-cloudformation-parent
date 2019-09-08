
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
 * ScalingPlanPredefinedScalingMetricSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceLabel",
    "PredefinedScalingMetricType"
})
public class ScalingPlanPredefinedScalingMetricSpecification implements Property<ScalingPlanPredefinedScalingMetricSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel
     * 
     */
    @JsonProperty("ResourceLabel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel")
    private CharSequence resourceLabel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype
     * 
     */
    @JsonProperty("PredefinedScalingMetricType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype")
    private CharSequence predefinedScalingMetricType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel
     * 
     */
    @JsonIgnore
    public CharSequence getResourceLabel() {
        return resourceLabel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel
     * 
     */
    @JsonIgnore
    public void setResourceLabel(CharSequence resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    public ScalingPlanPredefinedScalingMetricSpecification withResourceLabel(CharSequence resourceLabel) {
        this.resourceLabel = resourceLabel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype
     * 
     */
    @JsonIgnore
    public CharSequence getPredefinedScalingMetricType() {
        return predefinedScalingMetricType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype
     * 
     */
    @JsonIgnore
    public void setPredefinedScalingMetricType(CharSequence predefinedScalingMetricType) {
        this.predefinedScalingMetricType = predefinedScalingMetricType;
    }

    public ScalingPlanPredefinedScalingMetricSpecification withPredefinedScalingMetricType(CharSequence predefinedScalingMetricType) {
        this.predefinedScalingMetricType = predefinedScalingMetricType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceLabel", resourceLabel).append("predefinedScalingMetricType", predefinedScalingMetricType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceLabel).append(predefinedScalingMetricType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPlanPredefinedScalingMetricSpecification) == false) {
            return false;
        }
        ScalingPlanPredefinedScalingMetricSpecification rhs = ((ScalingPlanPredefinedScalingMetricSpecification) other);
        return new EqualsBuilder().append(resourceLabel, rhs.resourceLabel).append(predefinedScalingMetricType, rhs.predefinedScalingMetricType).isEquals();
    }

}
