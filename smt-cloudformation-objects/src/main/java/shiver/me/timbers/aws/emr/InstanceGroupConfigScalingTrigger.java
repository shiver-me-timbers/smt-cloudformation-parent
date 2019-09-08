
package shiver.me.timbers.aws.emr;

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
 * InstanceGroupConfigScalingTrigger
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchAlarmDefinition"
})
public class InstanceGroupConfigScalingTrigger implements Property<InstanceGroupConfigScalingTrigger>
{

    /**
     * InstanceGroupConfigCloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html
     * 
     */
    @JsonProperty("CloudWatchAlarmDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html")
    private Property<InstanceGroupConfigCloudWatchAlarmDefinition> cloudWatchAlarmDefinition;

    /**
     * InstanceGroupConfigCloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html
     * 
     */
    @JsonIgnore
    public Property<InstanceGroupConfigCloudWatchAlarmDefinition> getCloudWatchAlarmDefinition() {
        return cloudWatchAlarmDefinition;
    }

    /**
     * InstanceGroupConfigCloudWatchAlarmDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchAlarmDefinition(Property<InstanceGroupConfigCloudWatchAlarmDefinition> cloudWatchAlarmDefinition) {
        this.cloudWatchAlarmDefinition = cloudWatchAlarmDefinition;
    }

    public InstanceGroupConfigScalingTrigger withCloudWatchAlarmDefinition(Property<InstanceGroupConfigCloudWatchAlarmDefinition> cloudWatchAlarmDefinition) {
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
        if ((other instanceof InstanceGroupConfigScalingTrigger) == false) {
            return false;
        }
        InstanceGroupConfigScalingTrigger rhs = ((InstanceGroupConfigScalingTrigger) other);
        return new EqualsBuilder().append(cloudWatchAlarmDefinition, rhs.cloudWatchAlarmDefinition).isEquals();
    }

}
