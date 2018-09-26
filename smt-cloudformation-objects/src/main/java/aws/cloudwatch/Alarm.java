
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
    private List<CharSequence> alarmActions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription
     * 
     */
    @JsonProperty("AlarmDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription")
    private CharSequence alarmDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname
     * 
     */
    @JsonProperty("AlarmName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname")
    private CharSequence alarmName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator")
    private CharSequence comparisonOperator;
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
    private CharSequence evaluateLowSampleCountPercentile;
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
    private CharSequence extendedStatistic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions
     * 
     */
    @JsonProperty("InsufficientDataActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions")
    private List<CharSequence> insufficientDataActions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname")
    private CharSequence metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace
     * 
     */
    @JsonProperty("Namespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace")
    private CharSequence namespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions
     * 
     */
    @JsonProperty("OKActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions")
    private List<CharSequence> oKActions = new ArrayList<CharSequence>();
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
    private CharSequence statistic;
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
    private CharSequence treatMissingData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit
     * 
     */
    @JsonProperty("Unit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit")
    private CharSequence unit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled
     * 
     */
    public Boolean getActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled
     * 
     */
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
    public List<CharSequence> getAlarmActions() {
        return alarmActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions
     * 
     */
    public void setAlarmActions(List<CharSequence> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public Alarm withAlarmActions(List<CharSequence> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription
     * 
     */
    public CharSequence getAlarmDescription() {
        return alarmDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription
     * 
     */
    public void setAlarmDescription(CharSequence alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public Alarm withAlarmDescription(CharSequence alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname
     * 
     */
    public CharSequence getAlarmName() {
        return alarmName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname
     * 
     */
    public void setAlarmName(CharSequence alarmName) {
        this.alarmName = alarmName;
    }

    public Alarm withAlarmName(CharSequence alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator
     * 
     */
    public CharSequence getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator
     * 
     */
    public void setComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Alarm withComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension
     * 
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension
     * 
     */
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
    public CharSequence getEvaluateLowSampleCountPercentile() {
        return evaluateLowSampleCountPercentile;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile
     * 
     */
    public void setEvaluateLowSampleCountPercentile(CharSequence evaluateLowSampleCountPercentile) {
        this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
    }

    public Alarm withEvaluateLowSampleCountPercentile(CharSequence evaluateLowSampleCountPercentile) {
        this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods
     * 
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods
     * 
     */
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
    public CharSequence getExtendedStatistic() {
        return extendedStatistic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic
     * 
     */
    public void setExtendedStatistic(CharSequence extendedStatistic) {
        this.extendedStatistic = extendedStatistic;
    }

    public Alarm withExtendedStatistic(CharSequence extendedStatistic) {
        this.extendedStatistic = extendedStatistic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions
     * 
     */
    public List<CharSequence> getInsufficientDataActions() {
        return insufficientDataActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions
     * 
     */
    public void setInsufficientDataActions(List<CharSequence> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
    }

    public Alarm withInsufficientDataActions(List<CharSequence> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname
     * 
     */
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname
     * 
     */
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public Alarm withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace
     * 
     */
    public CharSequence getNamespace() {
        return namespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace
     * 
     */
    public void setNamespace(CharSequence namespace) {
        this.namespace = namespace;
    }

    public Alarm withNamespace(CharSequence namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions
     * 
     */
    public List<CharSequence> getOKActions() {
        return oKActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions
     * 
     */
    public void setOKActions(List<CharSequence> oKActions) {
        this.oKActions = oKActions;
    }

    public Alarm withOKActions(List<CharSequence> oKActions) {
        this.oKActions = oKActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period
     * 
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period
     * 
     */
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
    public CharSequence getStatistic() {
        return statistic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic
     * 
     */
    public void setStatistic(CharSequence statistic) {
        this.statistic = statistic;
    }

    public Alarm withStatistic(CharSequence statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold
     * 
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold
     * 
     */
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
    public CharSequence getTreatMissingData() {
        return treatMissingData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata
     * 
     */
    public void setTreatMissingData(CharSequence treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    public Alarm withTreatMissingData(CharSequence treatMissingData) {
        this.treatMissingData = treatMissingData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit
     * 
     */
    public CharSequence getUnit() {
        return unit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit
     * 
     */
    public void setUnit(CharSequence unit) {
        this.unit = unit;
    }

    public Alarm withUnit(CharSequence unit) {
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
