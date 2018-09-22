
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudWatchAlarmDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComparisonOperator",
    "Dimensions",
    "EvaluationPeriods",
    "MetricName",
    "Namespace",
    "Period",
    "Statistic",
    "Threshold",
    "Unit"
})
public class CloudWatchAlarmDefinition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator")
    private String comparisonOperator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions
     * 
     */
    @JsonProperty("Dimensions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions")
    private Set<MetricDimension> dimensions = new LinkedHashSet<MetricDimension>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods
     * 
     */
    @JsonProperty("EvaluationPeriods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods")
    private Integer evaluationPeriods;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname")
    private String metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace
     * 
     */
    @JsonProperty("Namespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace")
    private String namespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period
     * 
     */
    @JsonProperty("Period")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period")
    private Integer period;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic
     * 
     */
    @JsonProperty("Statistic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic")
    private String statistic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold
     * 
     */
    @JsonProperty("Threshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold")
    private Double threshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit
     * 
     */
    @JsonProperty("Unit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit")
    private String unit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public CloudWatchAlarmDefinition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions
     * 
     */
    @JsonProperty("Dimensions")
    public Set<MetricDimension> getDimensions() {
        return dimensions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions
     * 
     */
    @JsonProperty("Dimensions")
    public void setDimensions(Set<MetricDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public CloudWatchAlarmDefinition withDimensions(Set<MetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods
     * 
     */
    @JsonProperty("EvaluationPeriods")
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods
     * 
     */
    @JsonProperty("EvaluationPeriods")
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    public CloudWatchAlarmDefinition withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname
     * 
     */
    @JsonProperty("MetricName")
    public String getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname
     * 
     */
    @JsonProperty("MetricName")
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public CloudWatchAlarmDefinition withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace
     * 
     */
    @JsonProperty("Namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace
     * 
     */
    @JsonProperty("Namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CloudWatchAlarmDefinition withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period
     * 
     */
    @JsonProperty("Period")
    public Integer getPeriod() {
        return period;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period
     * 
     */
    @JsonProperty("Period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    public CloudWatchAlarmDefinition withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic
     * 
     */
    @JsonProperty("Statistic")
    public String getStatistic() {
        return statistic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic
     * 
     */
    @JsonProperty("Statistic")
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public CloudWatchAlarmDefinition withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold
     * 
     */
    @JsonProperty("Threshold")
    public Double getThreshold() {
        return threshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold
     * 
     */
    @JsonProperty("Threshold")
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public CloudWatchAlarmDefinition withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit
     * 
     */
    @JsonProperty("Unit")
    public String getUnit() {
        return unit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit
     * 
     */
    @JsonProperty("Unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public CloudWatchAlarmDefinition withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("comparisonOperator", comparisonOperator).append("dimensions", dimensions).append("evaluationPeriods", evaluationPeriods).append("metricName", metricName).append("namespace", namespace).append("period", period).append("statistic", statistic).append("threshold", threshold).append("unit", unit).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(period).append(statistic).append(unit).append(metricName).append(comparisonOperator).append(namespace).append(threshold).append(evaluationPeriods).append(dimensions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudWatchAlarmDefinition) == false) {
            return false;
        }
        CloudWatchAlarmDefinition rhs = ((CloudWatchAlarmDefinition) other);
        return new EqualsBuilder().append(period, rhs.period).append(statistic, rhs.statistic).append(unit, rhs.unit).append(metricName, rhs.metricName).append(comparisonOperator, rhs.comparisonOperator).append(namespace, rhs.namespace).append(threshold, rhs.threshold).append(evaluationPeriods, rhs.evaluationPeriods).append(dimensions, rhs.dimensions).isEquals();
    }

}
