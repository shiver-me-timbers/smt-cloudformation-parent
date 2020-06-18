
package shiver.me.timbers.aws.wafv2;

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
 * RuleGroupVisibilityConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SampledRequestsEnabled",
    "CloudWatchMetricsEnabled",
    "MetricName"
})
public class RuleGroupVisibilityConfig implements Property<RuleGroupVisibilityConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-sampledrequestsenabled
     * 
     */
    @JsonProperty("SampledRequestsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-sampledrequestsenabled")
    private CharSequence sampledRequestsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-cloudwatchmetricsenabled
     * 
     */
    @JsonProperty("CloudWatchMetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-cloudwatchmetricsenabled")
    private CharSequence cloudWatchMetricsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-metricname")
    private CharSequence metricName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-sampledrequestsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getSampledRequestsEnabled() {
        return sampledRequestsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-sampledrequestsenabled
     * 
     */
    @JsonIgnore
    public void setSampledRequestsEnabled(CharSequence sampledRequestsEnabled) {
        this.sampledRequestsEnabled = sampledRequestsEnabled;
    }

    public RuleGroupVisibilityConfig withSampledRequestsEnabled(CharSequence sampledRequestsEnabled) {
        this.sampledRequestsEnabled = sampledRequestsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-cloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getCloudWatchMetricsEnabled() {
        return cloudWatchMetricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-cloudwatchmetricsenabled
     * 
     */
    @JsonIgnore
    public void setCloudWatchMetricsEnabled(CharSequence cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    public RuleGroupVisibilityConfig withCloudWatchMetricsEnabled(CharSequence cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-metricname
     * 
     */
    @JsonIgnore
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-metricname
     * 
     */
    @JsonIgnore
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public RuleGroupVisibilityConfig withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sampledRequestsEnabled", sampledRequestsEnabled).append("cloudWatchMetricsEnabled", cloudWatchMetricsEnabled).append("metricName", metricName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchMetricsEnabled).append(metricName).append(sampledRequestsEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupVisibilityConfig) == false) {
            return false;
        }
        RuleGroupVisibilityConfig rhs = ((RuleGroupVisibilityConfig) other);
        return new EqualsBuilder().append(cloudWatchMetricsEnabled, rhs.cloudWatchMetricsEnabled).append(metricName, rhs.metricName).append(sampledRequestsEnabled, rhs.sampledRequestsEnabled).isEquals();
    }

}
