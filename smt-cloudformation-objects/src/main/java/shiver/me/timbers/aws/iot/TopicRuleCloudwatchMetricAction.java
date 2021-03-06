
package shiver.me.timbers.aws.iot;

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
 * TopicRuleCloudwatchMetricAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MetricName",
    "MetricNamespace",
    "MetricTimestamp",
    "MetricUnit",
    "MetricValue",
    "RoleArn"
})
public class TopicRuleCloudwatchMetricAction implements Property<TopicRuleCloudwatchMetricAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname")
    private CharSequence metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace
     * 
     */
    @JsonProperty("MetricNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace")
    private CharSequence metricNamespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp
     * 
     */
    @JsonProperty("MetricTimestamp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp")
    private CharSequence metricTimestamp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit
     * 
     */
    @JsonProperty("MetricUnit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit")
    private CharSequence metricUnit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue
     * 
     */
    @JsonProperty("MetricValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue")
    private CharSequence metricValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname
     * 
     */
    @JsonIgnore
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname
     * 
     */
    @JsonIgnore
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public TopicRuleCloudwatchMetricAction withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace
     * 
     */
    @JsonIgnore
    public CharSequence getMetricNamespace() {
        return metricNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace
     * 
     */
    @JsonIgnore
    public void setMetricNamespace(CharSequence metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    public TopicRuleCloudwatchMetricAction withMetricNamespace(CharSequence metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp
     * 
     */
    @JsonIgnore
    public CharSequence getMetricTimestamp() {
        return metricTimestamp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp
     * 
     */
    @JsonIgnore
    public void setMetricTimestamp(CharSequence metricTimestamp) {
        this.metricTimestamp = metricTimestamp;
    }

    public TopicRuleCloudwatchMetricAction withMetricTimestamp(CharSequence metricTimestamp) {
        this.metricTimestamp = metricTimestamp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit
     * 
     */
    @JsonIgnore
    public CharSequence getMetricUnit() {
        return metricUnit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit
     * 
     */
    @JsonIgnore
    public void setMetricUnit(CharSequence metricUnit) {
        this.metricUnit = metricUnit;
    }

    public TopicRuleCloudwatchMetricAction withMetricUnit(CharSequence metricUnit) {
        this.metricUnit = metricUnit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue
     * 
     */
    @JsonIgnore
    public CharSequence getMetricValue() {
        return metricValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue
     * 
     */
    @JsonIgnore
    public void setMetricValue(CharSequence metricValue) {
        this.metricValue = metricValue;
    }

    public TopicRuleCloudwatchMetricAction withMetricValue(CharSequence metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public TopicRuleCloudwatchMetricAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metricName", metricName).append("metricNamespace", metricNamespace).append("metricTimestamp", metricTimestamp).append("metricUnit", metricUnit).append("metricValue", metricValue).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metricTimestamp).append(metricName).append(roleArn).append(metricValue).append(metricNamespace).append(metricUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRuleCloudwatchMetricAction) == false) {
            return false;
        }
        TopicRuleCloudwatchMetricAction rhs = ((TopicRuleCloudwatchMetricAction) other);
        return new EqualsBuilder().append(metricTimestamp, rhs.metricTimestamp).append(metricName, rhs.metricName).append(roleArn, rhs.roleArn).append(metricValue, rhs.metricValue).append(metricNamespace, rhs.metricNamespace).append(metricUnit, rhs.metricUnit).isEquals();
    }

}
