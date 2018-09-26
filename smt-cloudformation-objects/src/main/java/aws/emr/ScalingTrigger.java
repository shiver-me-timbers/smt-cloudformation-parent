
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalingTrigger
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchAlarmDefinition"
})
public class ScalingTrigger {

    /**
     * CloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html
     * 
     */
    @JsonProperty("CloudWatchAlarmDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html")
    private CloudWatchAlarmDefinition cloudWatchAlarmDefinition;

    /**
     * CloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html
     * 
     */
    public CloudWatchAlarmDefinition getCloudWatchAlarmDefinition() {
        return cloudWatchAlarmDefinition;
    }

    /**
     * CloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html
     * 
     */
    public void setCloudWatchAlarmDefinition(CloudWatchAlarmDefinition cloudWatchAlarmDefinition) {
        this.cloudWatchAlarmDefinition = cloudWatchAlarmDefinition;
    }

    public ScalingTrigger withCloudWatchAlarmDefinition(CloudWatchAlarmDefinition cloudWatchAlarmDefinition) {
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
        if ((other instanceof ScalingTrigger) == false) {
            return false;
        }
        ScalingTrigger rhs = ((ScalingTrigger) other);
        return new EqualsBuilder().append(cloudWatchAlarmDefinition, rhs.cloudWatchAlarmDefinition).isEquals();
    }

}
