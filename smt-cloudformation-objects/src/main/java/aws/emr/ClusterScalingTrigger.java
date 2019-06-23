
package aws.emr;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ClusterScalingTrigger
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingtrigger.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchAlarmDefinition"
})
public class ClusterScalingTrigger implements Property<ClusterScalingTrigger>
{

    /**
     * ClusterCloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html
     * 
     */
    @JsonProperty("CloudWatchAlarmDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html")
    private Property<ClusterCloudWatchAlarmDefinition> cloudWatchAlarmDefinition;

    /**
     * ClusterCloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html
     * 
     */
    @JsonIgnore
    public Property<ClusterCloudWatchAlarmDefinition> getCloudWatchAlarmDefinition() {
        return cloudWatchAlarmDefinition;
    }

    /**
     * ClusterCloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchAlarmDefinition(Property<ClusterCloudWatchAlarmDefinition> cloudWatchAlarmDefinition) {
        this.cloudWatchAlarmDefinition = cloudWatchAlarmDefinition;
    }

    public ClusterScalingTrigger withCloudWatchAlarmDefinition(Property<ClusterCloudWatchAlarmDefinition> cloudWatchAlarmDefinition) {
        this.cloudWatchAlarmDefinition = cloudWatchAlarmDefinition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchAlarmDefinition", cloudWatchAlarmDefinition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchAlarmDefinition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterScalingTrigger) == false) {
            return false;
        }
        ClusterScalingTrigger rhs = ((ClusterScalingTrigger) other);
        return new EqualsBuilder().append(cloudWatchAlarmDefinition, rhs.cloudWatchAlarmDefinition).isEquals();
    }

}
