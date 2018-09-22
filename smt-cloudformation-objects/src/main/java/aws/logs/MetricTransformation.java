
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
    private String metricName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace
     * 
     */
    @JsonProperty("MetricNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace")
    private String metricNamespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue
     * 
     */
    @JsonProperty("MetricValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue")
    private String metricValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue
     * 
     */
    @JsonProperty("DefaultValue")
    public Double getDefaultValue() {
        return defaultValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue
     * 
     */
    @JsonProperty("DefaultValue")
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
    @JsonProperty("MetricName")
    public String getMetricName() {
        return metricName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname
     * 
     */
    @JsonProperty("MetricName")
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricTransformation withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace
     * 
     */
    @JsonProperty("MetricNamespace")
    public String getMetricNamespace() {
        return metricNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace
     * 
     */
    @JsonProperty("MetricNamespace")
    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    public MetricTransformation withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue
     * 
     */
    @JsonProperty("MetricValue")
    public String getMetricValue() {
        return metricValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue
     * 
     */
    @JsonProperty("MetricValue")
    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    public MetricTransformation withMetricValue(String metricValue) {
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
