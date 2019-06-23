
package aws.logs;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MetricFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FilterPattern",
    "LogGroupName",
    "MetricTransformations"
})
public class MetricFilter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-filterpattern
     * 
     */
    @JsonProperty("FilterPattern")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-filterpattern")
    private CharSequence filterPattern;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-loggroupname")
    private CharSequence logGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-metrictransformations
     * 
     */
    @JsonProperty("MetricTransformations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-metrictransformations")
    private Set<Property<MetricFilterMetricTransformation>> metricTransformations = new LinkedHashSet<Property<MetricFilterMetricTransformation>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-filterpattern
     * 
     */
    @JsonIgnore
    public CharSequence getFilterPattern() {
        return filterPattern;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-filterpattern
     * 
     */
    @JsonIgnore
    public void setFilterPattern(CharSequence filterPattern) {
        this.filterPattern = filterPattern;
    }

    public MetricFilter withFilterPattern(CharSequence filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-loggroupname
     * 
     */
    @JsonIgnore
    public CharSequence getLogGroupName() {
        return logGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-loggroupname
     * 
     */
    @JsonIgnore
    public void setLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
    }

    public MetricFilter withLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-metrictransformations
     * 
     */
    @JsonIgnore
    public Set<Property<MetricFilterMetricTransformation>> getMetricTransformations() {
        return metricTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-metrictransformations
     * 
     */
    @JsonIgnore
    public void setMetricTransformations(Set<Property<MetricFilterMetricTransformation>> metricTransformations) {
        this.metricTransformations = metricTransformations;
    }

    public MetricFilter withMetricTransformations(Set<Property<MetricFilterMetricTransformation>> metricTransformations) {
        this.metricTransformations = metricTransformations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("filterPattern", filterPattern).append("logGroupName", logGroupName).append("metricTransformations", metricTransformations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filterPattern).append(metricTransformations).append(logGroupName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetricFilter) == false) {
            return false;
        }
        MetricFilter rhs = ((MetricFilter) other);
        return new EqualsBuilder().append(filterPattern, rhs.filterPattern).append(metricTransformations, rhs.metricTransformations).append(logGroupName, rhs.logGroupName).isEquals();
    }

}
