
package aws.logs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MetricTransformation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DefaultValue",
    "MetricName",
    "MetricNamespace",
    "MetricValue"
})
public class MetricTransformation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue
     * 
     */
    @JsonProperty("DefaultValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue")
    private Double defaultValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname
     * 
     */
    @JsonProperty("MetricName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname")
    private CharSequence metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace
     * 
     */
    @JsonProperty("MetricNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace")
    private CharSequence metricNamespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue
     * 
     */
    @JsonProperty("MetricValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue")
    private CharSequence metricValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue
     * 
     */
    public Double getDefaultValue() {
        return defaultValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue
     * 
     */
    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
    }

    public MetricTransformation withDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname
     * 
     */
    public CharSequence getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname
     * 
     */
    public void setMetricName(CharSequence metricName) {
        this.metricName = metricName;
    }

    public MetricTransformation withMetricName(CharSequence metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace
     * 
     */
    public CharSequence getMetricNamespace() {
        return metricNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace
     * 
     */
    public void setMetricNamespace(CharSequence metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    public MetricTransformation withMetricNamespace(CharSequence metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue
     * 
     */
    public CharSequence getMetricValue() {
        return metricValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue
     * 
     */
    public void setMetricValue(CharSequence metricValue) {
        this.metricValue = metricValue;
    }

    public MetricTransformation withMetricValue(CharSequence metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultValue", defaultValue).append("metricName", metricName).append("metricNamespace", metricNamespace).append("metricValue", metricValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metricValue).append(metricName).append(metricNamespace).append(defaultValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetricTransformation) == false) {
            return false;
        }
        MetricTransformation rhs = ((MetricTransformation) other);
        return new EqualsBuilder().append(metricValue, rhs.metricValue).append(metricName, rhs.metricName).append(metricNamespace, rhs.metricNamespace).append(defaultValue, rhs.defaultValue).isEquals();
    }

}
