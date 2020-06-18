
package shiver.me.timbers.aws.ecs;

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
 * TaskSetNetworkConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AwsVpcConfiguration"
})
public class TaskSetNetworkConfiguration implements Property<TaskSetNetworkConfiguration>
{

    /**
     * TaskSetAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html
     * 
     */
    @JsonProperty("AwsVpcConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html")
    private Property<TaskSetAwsVpcConfiguration> awsVpcConfiguration;

    /**
     * TaskSetAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<TaskSetAwsVpcConfiguration> getAwsVpcConfiguration() {
        return awsVpcConfiguration;
    }

    /**
     * TaskSetAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAwsVpcConfiguration(Property<TaskSetAwsVpcConfiguration> awsVpcConfiguration) {
        this.awsVpcConfiguration = awsVpcConfiguration;
    }

    public TaskSetNetworkConfiguration withAwsVpcConfiguration(Property<TaskSetAwsVpcConfiguration> awsVpcConfiguration) {
        this.awsVpcConfiguration = awsVpcConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("awsVpcConfiguration", awsVpcConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsVpcConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskSetNetworkConfiguration) == false) {
            return false;
        }
        TaskSetNetworkConfiguration rhs = ((TaskSetNetworkConfiguration) other);
        return new EqualsBuilder().append(awsVpcConfiguration, rhs.awsVpcConfiguration).isEquals();
    }

}
