
package aws.autoscaling;

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
 * MetricsCollection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Granularity",
    "Metrics"
})
public class MetricsCollection {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity
     * 
     */
    @JsonProperty("Granularity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity")
    private CharSequence granularity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics
     * 
     */
    @JsonProperty("Metrics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics")
    private List<CharSequence> metrics = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity
     * 
     */
    public CharSequence getGranularity() {
        return granularity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity
     * 
     */
    public void setGranularity(CharSequence granularity) {
        this.granularity = granularity;
    }

    public MetricsCollection withGranularity(CharSequence granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics
     * 
     */
    public List<CharSequence> getMetrics() {
        return metrics;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics
     * 
     */
    public void setMetrics(List<CharSequence> metrics) {
        this.metrics = metrics;
    }

    public MetricsCollection withMetrics(List<CharSequence> metrics) {
        this.metrics = metrics;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("granularity", granularity).append("metrics", metrics).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(granularity).append(metrics).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetricsCollection) == false) {
            return false;
        }
        MetricsCollection rhs = ((MetricsCollection) other);
        return new EqualsBuilder().append(granularity, rhs.granularity).append(metrics, rhs.metrics).isEquals();
    }

}
