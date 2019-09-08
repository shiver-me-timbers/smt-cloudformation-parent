
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
 * ServiceNetworkConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AwsvpcConfiguration"
})
public class ServiceNetworkConfiguration implements Property<ServiceNetworkConfiguration>
{

    /**
     * ServiceAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
     * 
     */
    @JsonProperty("AwsvpcConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html")
    private Property<ServiceAwsVpcConfiguration> awsvpcConfiguration;

    /**
     * ServiceAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ServiceAwsVpcConfiguration> getAwsvpcConfiguration() {
        return awsvpcConfiguration;
    }

    /**
     * ServiceAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAwsvpcConfiguration(Property<ServiceAwsVpcConfiguration> awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
    }

    public ServiceNetworkConfiguration withAwsvpcConfiguration(Property<ServiceAwsVpcConfiguration> awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("awsvpcConfiguration", awsvpcConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsvpcConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceNetworkConfiguration) == false) {
            return false;
        }
        ServiceNetworkConfiguration rhs = ((ServiceNetworkConfiguration) other);
        return new EqualsBuilder().append(awsvpcConfiguration, rhs.awsvpcConfiguration).isEquals();
    }

}
