
package shiver.me.timbers.aws.autoscalingplans;

import java.util.ArrayList;
import java.util.List;
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
 * ScalingPlanCustomizedLoadMetricSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MetricName",
    "Statistic",
    "Dimensions",
    "Unit",
    "Namespace"
})
public class ScalingPlanCustomizedLoadMetricSpecification implements Property<ScalingPlanCustomizedLoadMetricSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-metricname")
    private CharSequence metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-statistic
     * 
     */
    @JsonProperty("Statistic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-statistic")
    private CharSequence statistic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-dimensions
     * 
     */
    @JsonProperty("Dimensions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-dimensions")
    private List<Property<ScalingPlanMetricDimension>> dimensions = new ArrayList<Property<ScalingPlanMetricDimension>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-unit
     * 
     */
    @JsonProperty("Unit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-unit")
    private CharSequence unit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-namespace
     * 
     */
    @JsonProperty("Namespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-namespace")
    private CharSequence namespace;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-metricname
     * 
     */
    @JsonIgnore
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-metricname
     * 
     */
    @JsonIgnore
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public ScalingPlanCustomizedLoadMetricSpecification withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-statistic
     * 
     */
    @JsonIgnore
    public CharSequence getStatistic() {
        return statistic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-statistic
     * 
     */
    @JsonIgnore
    public void setStatistic(CharSequence statistic) {
        this.statistic = statistic;
    }

    public ScalingPlanCustomizedLoadMetricSpecification withStatistic(CharSequence statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-dimensions
     * 
     */
    @JsonIgnore
    public List<Property<ScalingPlanMetricDimension>> getDimensions() {
        return dimensions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-dimensions
     * 
     */
    @JsonIgnore
    public void setDimensions(List<Property<ScalingPlanMetricDimension>> dimensions) {
        this.dimensions = dimensions;
    }

    public ScalingPlanCustomizedLoadMetricSpecification withDimensions(List<Property<ScalingPlanMetricDimension>> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-unit
     * 
     */
    @JsonIgnore
    public CharSequence getUnit() {
        return unit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-unit
     * 
     */
    @JsonIgnore
    public void setUnit(CharSequence unit) {
        this.unit = unit;
    }

    public ScalingPlanCustomizedLoadMetricSpecification withUnit(CharSequence unit) {
        this.unit = unit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-namespace
     * 
     */
    @JsonIgnore
    public CharSequence getNamespace() {
        return namespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-namespace
     * 
     */
    @JsonIgnore
    public void setNamespace(CharSequence namespace) {
        this.namespace = namespace;
    }

    public ScalingPlanCustomizedLoadMetricSpecification withNamespace(CharSequence namespace) {
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
        if ((other instanceof ScalingPlanCustomizedLoadMetricSpecification) == false) {
            return false;
        }
        ScalingPlanCustomizedLoadMetricSpecification rhs = ((ScalingPlanCustomizedLoadMetricSpecification) other);
        return new EqualsBuilder().append(namespace, rhs.namespace).append(statistic, rhs.statistic).append(unit, rhs.unit).append(metricName, rhs.metricName).append(dimensions, rhs.dimensions).isEquals();
    }

}
