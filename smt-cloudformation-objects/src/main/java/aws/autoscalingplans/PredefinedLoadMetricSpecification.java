
package aws.autoscalingplans;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PredefinedLoadMetricSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PredefinedLoadMetricType",
    "ResourceLabel"
})
public class PredefinedLoadMetricSpecification implements Property<PredefinedLoadMetricSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-predefinedloadmetrictype
     * 
     */
    @JsonProperty("PredefinedLoadMetricType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-predefinedloadmetrictype")
    private CharSequence predefinedLoadMetricType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-resourcelabel
     * 
     */
    @JsonProperty("ResourceLabel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-resourcelabel")
    private CharSequence resourceLabel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-predefinedloadmetrictype
     * 
     */
    @JsonIgnore
    public CharSequence getPredefinedLoadMetricType() {
        return predefinedLoadMetricType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-predefinedloadmetrictype
     * 
     */
    @JsonIgnore
    public void setPredefinedLoadMetricType(CharSequence predefinedLoadMetricType) {
        this.predefinedLoadMetricType = predefinedLoadMetricType;
    }

    public PredefinedLoadMetricSpecification withPredefinedLoadMetricType(CharSequence predefinedLoadMetricType) {
        this.predefinedLoadMetricType = predefinedLoadMetricType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-resourcelabel
     * 
     */
    @JsonIgnore
    public CharSequence getResourceLabel() {
        return resourceLabel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-resourcelabel
     * 
     */
    @JsonIgnore
    public void setResourceLabel(CharSequence resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    public PredefinedLoadMetricSpecification withResourceLabel(CharSequence resourceLabel) {
        this.resourceLabel = resourceLabel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("predefinedLoadMetricType", predefinedLoadMetricType).append("resourceLabel", resourceLabel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(predefinedLoadMetricType).append(resourceLabel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PredefinedLoadMetricSpecification) == false) {
            return false;
        }
        PredefinedLoadMetricSpecification rhs = ((PredefinedLoadMetricSpecification) other);
        return new EqualsBuilder().append(predefinedLoadMetricType, rhs.predefinedLoadMetricType).append(resourceLabel, rhs.resourceLabel).isEquals();
    }

}
