
package aws.autoscalingplans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CustomizedScalingMetricSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MetricName",
    "Statistic",
    "Dimensions",
    "Unit",
    "Namespace"
})
public class CustomizedScalingMetricSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname")
    private CharSequence metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic
     * 
     */
    @JsonProperty("Statistic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic")
    private CharSequence statistic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions
     * 
     */
    @JsonProperty("Dimensions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions")
    private List<MetricDimension> dimensions = new ArrayList<MetricDimension>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit
     * 
     */
    @JsonProperty("Unit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit")
    private CharSequence unit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace
     * 
     */
    @JsonProperty("Namespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace")
    private CharSequence namespace;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname
     * 
     */
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname
     * 
     */
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public CustomizedScalingMetricSpecification withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic
     * 
     */
    public CharSequence getStatistic() {
        return statistic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic
     * 
     */
    public void setStatistic(CharSequence statistic) {
        this.statistic = statistic;
    }

    public CustomizedScalingMetricSpecification withStatistic(CharSequence statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions
     * 
     */
    public List<MetricDimension> getDimensions() {
        return dimensions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions
     * 
     */
    public void setDimensions(List<MetricDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public CustomizedScalingMetricSpecification withDimensions(List<MetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit
     * 
     */
    public CharSequence getUnit() {
        return unit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit
     * 
     */
    public void setUnit(CharSequence unit) {
        this.unit = unit;
    }

    public CustomizedScalingMetricSpecification withUnit(CharSequence unit) {
        this.unit = unit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace
     * 
     */
    public CharSequence getNamespace() {
        return namespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace
     * 
     */
    public void setNamespace(CharSequence namespace) {
        this.namespace = namespace;
    }

    public CustomizedScalingMetricSpecification withNamespace(CharSequence namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metricName", metricName).append("statistic", statistic).append("dimensions", dimensions).append("unit", unit).append("namespace", namespace).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(namespace).append(statistic).append(unit).append(metricName).append(dimensions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomizedScalingMetricSpecification) == false) {
            return false;
        }
        CustomizedScalingMetricSpecification rhs = ((CustomizedScalingMetricSpecification) other);
        return new EqualsBuilder().append(namespace, rhs.namespace).append(statistic, rhs.statistic).append(unit, rhs.unit).append(metricName, rhs.metricName).append(dimensions, rhs.dimensions).isEquals();
    }

}
