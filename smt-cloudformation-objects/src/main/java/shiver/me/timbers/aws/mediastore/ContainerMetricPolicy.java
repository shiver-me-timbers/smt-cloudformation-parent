
package shiver.me.timbers.aws.mediastore;

import java.util.ArrayList;
import java.util.List;
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
 * ContainerMetricPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContainerLevelMetrics",
    "MetricPolicyRules"
})
public class ContainerMetricPolicy implements Property<ContainerMetricPolicy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-containerlevelmetrics
     * 
     */
    @JsonProperty("ContainerLevelMetrics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-containerlevelmetrics")
    private CharSequence containerLevelMetrics;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-metricpolicyrules
     * 
     */
    @JsonProperty("MetricPolicyRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-metricpolicyrules")
    private List<Property<ContainerMetricPolicyRule>> metricPolicyRules = new ArrayList<Property<ContainerMetricPolicyRule>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-containerlevelmetrics
     * 
     */
    @JsonIgnore
    public CharSequence getContainerLevelMetrics() {
        return containerLevelMetrics;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-containerlevelmetrics
     * 
     */
    @JsonIgnore
    public void setContainerLevelMetrics(CharSequence containerLevelMetrics) {
        this.containerLevelMetrics = containerLevelMetrics;
    }

    public ContainerMetricPolicy withContainerLevelMetrics(CharSequence containerLevelMetrics) {
        this.containerLevelMetrics = containerLevelMetrics;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-metricpolicyrules
     * 
     */
    @JsonIgnore
    public List<Property<ContainerMetricPolicyRule>> getMetricPolicyRules() {
        return metricPolicyRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-metricpolicyrules
     * 
     */
    @JsonIgnore
    public void setMetricPolicyRules(List<Property<ContainerMetricPolicyRule>> metricPolicyRules) {
        this.metricPolicyRules = metricPolicyRules;
    }

    public ContainerMetricPolicy withMetricPolicyRules(List<Property<ContainerMetricPolicyRule>> metricPolicyRules) {
        this.metricPolicyRules = metricPolicyRules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerLevelMetrics", containerLevelMetrics).append("metricPolicyRules", metricPolicyRules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metricPolicyRules).append(containerLevelMetrics).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerMetricPolicy) == false) {
            return false;
        }
        ContainerMetricPolicy rhs = ((ContainerMetricPolicy) other);
        return new EqualsBuilder().append(metricPolicyRules, rhs.metricPolicyRules).append(containerLevelMetrics, rhs.containerLevelMetrics).isEquals();
    }

}
