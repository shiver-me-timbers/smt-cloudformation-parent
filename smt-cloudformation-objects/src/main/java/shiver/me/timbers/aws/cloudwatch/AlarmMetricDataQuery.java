
package shiver.me.timbers.aws.cloudwatch;

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
 * AlarmMetricDataQuery
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Expression",
    "Id",
    "Label",
    "MetricStat",
    "Period",
    "ReturnData"
})
public class AlarmMetricDataQuery implements Property<AlarmMetricDataQuery>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-expression
     * 
     */
    @JsonProperty("Expression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-expression")
    private CharSequence expression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-label
     * 
     */
    @JsonProperty("Label")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-label")
    private CharSequence label;
    /**
     * AlarmMetricStat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html
     * 
     */
    @JsonProperty("MetricStat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html")
    private Property<AlarmMetricStat> metricStat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-period
     * 
     */
    @JsonProperty("Period")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-period")
    private Number period;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-returndata
     * 
     */
    @JsonProperty("ReturnData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-returndata")
    private CharSequence returnData;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-expression
     * 
     */
    @JsonIgnore
    public CharSequence getExpression() {
        return expression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-expression
     * 
     */
    @JsonIgnore
    public void setExpression(CharSequence expression) {
        this.expression = expression;
    }

    public AlarmMetricDataQuery withExpression(CharSequence expression) {
        this.expression = expression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public AlarmMetricDataQuery withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-label
     * 
     */
    @JsonIgnore
    public CharSequence getLabel() {
        return label;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-label
     * 
     */
    @JsonIgnore
    public void setLabel(CharSequence label) {
        this.label = label;
    }

    public AlarmMetricDataQuery withLabel(CharSequence label) {
        this.label = label;
        return this;
    }

    /**
     * AlarmMetricStat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html
     * 
     */
    @JsonIgnore
    public Property<AlarmMetricStat> getMetricStat() {
        return metricStat;
    }

    /**
     * AlarmMetricStat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html
     * 
     */
    @JsonIgnore
    public void setMetricStat(Property<AlarmMetricStat> metricStat) {
        this.metricStat = metricStat;
    }

    public AlarmMetricDataQuery withMetricStat(Property<AlarmMetricStat> metricStat) {
        this.metricStat = metricStat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-period
     * 
     */
    @JsonIgnore
    public Number getPeriod() {
        return period;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-period
     * 
     */
    @JsonIgnore
    public void setPeriod(Number period) {
        this.period = period;
    }

    public AlarmMetricDataQuery withPeriod(Number period) {
        this.period = period;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-returndata
     * 
     */
    @JsonIgnore
    public CharSequence getReturnData() {
        return returnData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html#cfn-cloudwatch-alarm-metricdataquery-returndata
     * 
     */
    @JsonIgnore
    public void setReturnData(CharSequence returnData) {
        this.returnData = returnData;
    }

    public AlarmMetricDataQuery withReturnData(CharSequence returnData) {
        this.returnData = returnData;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("expression", expression).append("id", id).append("label", label).append("metricStat", metricStat).append("period", period).append("returnData", returnData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(period).append(expression).append(returnData).append(id).append(label).append(metricStat).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlarmMetricDataQuery) == false) {
            return false;
        }
        AlarmMetricDataQuery rhs = ((AlarmMetricDataQuery) other);
        return new EqualsBuilder().append(period, rhs.period).append(expression, rhs.expression).append(returnData, rhs.returnData).append(id, rhs.id).append(label, rhs.label).append(metricStat, rhs.metricStat).isEquals();
    }

}
