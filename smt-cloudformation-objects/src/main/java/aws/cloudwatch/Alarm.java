
package aws.cloudwatch;

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
 * Alarm
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ActionsEnabled",
    "AlarmActions",
    "AlarmDescription",
    "AlarmName",
    "ComparisonOperator",
    "Dimensions",
    "EvaluateLowSampleCountPercentile",
    "EvaluationPeriods",
    "ExtendedStatistic",
    "InsufficientDataActions",
    "MetricName",
    "Namespace",
    "OKActions",
    "Period",
    "Statistic",
    "Threshold",
    "TreatMissingData",
    "Unit"
})
public class Alarm {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled
     * 
     */
    @JsonProperty("ActionsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled")
    private Boolean actionsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions
     * 
     */
    @JsonProperty("AlarmActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions")
    private List<String> alarmActions = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription
     * 
     */
    @JsonProperty("AlarmDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription")
    private String alarmDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname
     * 
     */
    @JsonProperty("AlarmName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname")
    private String alarmName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator")
    private String comparisonOperator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension
     * 
     */
    @JsonProperty("Dimensions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension")
    private List<Dimension> dimensions = new ArrayList<Dimension>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile
     * 
     */
    @JsonProperty("EvaluateLowSampleCountPercentile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile")
    private String evaluateLowSampleCountPercentile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods
     * 
     */
    @JsonProperty("EvaluationPeriods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods")
    private Integer evaluationPeriods;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic
     * 
     */
    @JsonProperty("ExtendedStatistic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic")
    private String extendedStatistic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions
     * 
     */
    @JsonProperty("InsufficientDataActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions")
    private List<String> insufficientDataActions = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname")
    private String metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace
     * 
     */
    @JsonProperty("Namespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace")
    private String namespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions
     * 
     */
    @JsonProperty("OKActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions")
    private List<String> oKActions = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period
     * 
     */
    @JsonProperty("Period")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period")
    private Integer period;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic
     * 
     */
    @JsonProperty("Statistic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic")
    private String statistic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold
     * 
     */
    @JsonProperty("Threshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold")
    private Double threshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata
     * 
     */
    @JsonProperty("TreatMissingData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata")
    private String treatMissingData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit
     * 
     */
    @JsonProperty("Unit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit")
    private String unit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled
     * 
     */
    @JsonProperty("ActionsEnabled")
    public Boolean getActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled
     * 
     */
    @JsonProperty("ActionsEnabled")
    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    public Alarm withActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions
     * 
     */
    @JsonProperty("AlarmActions")
    public List<String> getAlarmActions() {
        return alarmActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions
     * 
     */
    @JsonProperty("AlarmActions")
    public void setAlarmActions(List<String> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public Alarm withAlarmActions(List<String> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription
     * 
     */
    @JsonProperty("AlarmDescription")
    public String getAlarmDescription() {
        return alarmDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription
     * 
     */
    @JsonProperty("AlarmDescription")
    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public Alarm withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname
     * 
     */
    @JsonProperty("AlarmName")
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname
     * 
     */
    @JsonProperty("AlarmName")
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public Alarm withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Alarm withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension
     * 
     */
    @JsonProperty("Dimensions")
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension
     * 
     */
    @JsonProperty("Dimensions")
    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    public Alarm withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile
     * 
     */
    @JsonProperty("EvaluateLowSampleCountPercentile")
    public String getEvaluateLowSampleCountPercentile() {
        return evaluateLowSampleCountPercentile;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile
     * 
     */
    @JsonProperty("EvaluateLowSampleCountPercentile")
    public void setEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
        this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
    }

    public Alarm withEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
        this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods
     * 
     */
    @JsonProperty("EvaluationPeriods")
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods
     * 
     */
    @JsonProperty("EvaluationPeriods")
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    public Alarm withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic
     * 
     */
    @JsonProperty("ExtendedStatistic")
    public String getExtendedStatistic() {
        return extendedStatistic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic
     * 
     */
    @JsonProperty("ExtendedStatistic")
    public void setExtendedStatistic(String extendedStatistic) {
        this.extendedStatistic = extendedStatistic;
    }

    public Alarm withExtendedStatistic(String extendedStatistic) {
        this.extendedStatistic = extendedStatistic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions
     * 
     */
    @JsonProperty("InsufficientDataActions")
    public List<String> getInsufficientDataActions() {
        return insufficientDataActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions
     * 
     */
    @JsonProperty("InsufficientDataActions")
    public void setInsufficientDataActions(List<String> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
    }

    public Alarm withInsufficientDataActions(List<String> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname
     * 
     */
    @JsonProperty("MetricName")
    public String getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname
     * 
     */
    @JsonProperty("MetricName")
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Alarm withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace
     * 
     */
    @JsonProperty("Namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace
     * 
     */
    @JsonProperty("Namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Alarm withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions
     * 
     */
    @JsonProperty("OKActions")
    public List<String> getOKActions() {
        return oKActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions
     * 
     */
    @JsonProperty("OKActions")
    public void setOKActions(List<String> oKActions) {
        this.oKActions = oKActions;
    }

    public Alarm withOKActions(List<String> oKActions) {
        this.oKActions = oKActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period
     * 
     */
    @JsonProperty("Period")
    public Integer getPeriod() {
        return period;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period
     * 
     */
    @JsonProperty("Period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Alarm withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic
     * 
     */
    @JsonProperty("Statistic")
    public String getStatistic() {
        return statistic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic
     * 
     */
    @JsonProperty("Statistic")
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public Alarm withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold
     * 
     */
    @JsonProperty("Threshold")
    public Double getThreshold() {
        return threshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold
     * 
     */
    @JsonProperty("Threshold")
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Alarm withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata
     * 
     */
    @JsonProperty("TreatMissingData")
    public String getTreatMissingData() {
        return treatMissingData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata
     * 
     */
    @JsonProperty("TreatMissingData")
    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    public Alarm withTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit
     * 
     */
    @JsonProperty("Unit")
    public String getUnit() {
        return unit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit
     * 
     */
    @JsonProperty("Unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Alarm withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actionsEnabled", actionsEnabled).append("alarmActions", alarmActions).append("alarmDescription", alarmDescription).append("alarmName", alarmName).append("comparisonOperator", comparisonOperator).append("dimensions", dimensions).append("evaluateLowSampleCountPercentile", evaluateLowSampleCountPercentile).append("evaluationPeriods", evaluationPeriods).append("extendedStatistic", extendedStatistic).append("insufficientDataActions", insufficientDataActions).append("metricName", metricName).append("namespace", namespace).append("oKActions", oKActions).append("period", period).append("statistic", statistic).append("threshold", threshold).append("treatMissingData", treatMissingData).append("unit", unit).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(period).append(statistic).append(metricName).append(comparisonOperator).append(extendedStatistic).append(treatMissingData).append(evaluateLowSampleCountPercentile).append(alarmName).append(threshold).append(evaluationPeriods).append(insufficientDataActions).append(alarmDescription).append(unit).append(actionsEnabled).append(namespace).append(oKActions).append(alarmActions).append(dimensions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alarm) == false) {
            return false;
        }
        Alarm rhs = ((Alarm) other);
        return new EqualsBuilder().append(period, rhs.period).append(statistic, rhs.statistic).append(metricName, rhs.metricName).append(comparisonOperator, rhs.comparisonOperator).append(extendedStatistic, rhs.extendedStatistic).append(treatMissingData, rhs.treatMissingData).append(evaluateLowSampleCountPercentile, rhs.evaluateLowSampleCountPercentile).append(alarmName, rhs.alarmName).append(threshold, rhs.threshold).append(evaluationPeriods, rhs.evaluationPeriods).append(insufficientDataActions, rhs.insufficientDataActions).append(alarmDescription, rhs.alarmDescription).append(unit, rhs.unit).append(actionsEnabled, rhs.actionsEnabled).append(namespace, rhs.namespace).append(oKActions, rhs.oKActions).append(alarmActions, rhs.alarmActions).append(dimensions, rhs.dimensions).isEquals();
    }

}
