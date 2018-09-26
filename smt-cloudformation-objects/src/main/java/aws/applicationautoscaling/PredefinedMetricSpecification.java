
package aws.applicationautoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PredefinedMetricSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PredefinedMetricType",
    "ResourceLabel"
})
public class PredefinedMetricSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype
     * 
     */
    @JsonProperty("PredefinedMetricType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype")
    private CharSequence predefinedMetricType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel
     * 
     */
    @JsonProperty("ResourceLabel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel")
    private CharSequence resourceLabel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype
     * 
     */
    public CharSequence getPredefinedMetricType() {
        return predefinedMetricType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype
     * 
     */
    public void setPredefinedMetricType(CharSequence predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
    }

    public PredefinedMetricSpecification withPredefinedMetricType(CharSequence predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel
     * 
     */
    public CharSequence getResourceLabel() {
        return resourceLabel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel
     * 
     */
    public void setResourceLabel(CharSequence resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    public PredefinedMetricSpecification withResourceLabel(CharSequence resourceLabel) {
        this.resourceLabel = resourceLabel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("predefinedMetricType", predefinedMetricType).append("resourceLabel", resourceLabel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(predefinedMetricType).append(resourceLabel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PredefinedMetricSpecification) == false) {
            return false;
        }
        PredefinedMetricSpecification rhs = ((PredefinedMetricSpecification) other);
        return new EqualsBuilder().append(predefinedMetricType, rhs.predefinedMetricType).append(resourceLabel, rhs.resourceLabel).isEquals();
    }

}
