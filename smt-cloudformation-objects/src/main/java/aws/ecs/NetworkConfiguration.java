
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NetworkConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AwsvpcConfiguration"
})
public class NetworkConfiguration {

    /**
     * AwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
     * 
     */
    @JsonProperty("AwsvpcConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html")
    private AwsVpcConfiguration awsvpcConfiguration;

    /**
     * AwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
     * 
     */
    public AwsVpcConfiguration getAwsvpcConfiguration() {
        return awsvpcConfiguration;
    }

    /**
     * AwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
     * 
     */
    public void setAwsvpcConfiguration(AwsVpcConfiguration awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
    }

    public NetworkConfiguration withAwsvpcConfiguration(AwsVpcConfiguration awsvpcConfiguration) {
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
        if ((other instanceof NetworkConfiguration) == false) {
            return false;
        }
        NetworkConfiguration rhs = ((NetworkConfiguration) other);
        return new EqualsBuilder().append(awsvpcConfiguration, rhs.awsvpcConfiguration).isEquals();
    }

}
