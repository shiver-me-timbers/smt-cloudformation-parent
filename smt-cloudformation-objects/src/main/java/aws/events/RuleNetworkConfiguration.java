
package aws.events;

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
 * RuleNetworkConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AwsVpcConfiguration"
})
public class RuleNetworkConfiguration implements Property<RuleNetworkConfiguration>
{

    /**
     * RuleAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html
     * 
     */
    @JsonProperty("AwsVpcConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html")
    private Property<RuleAwsVpcConfiguration> awsVpcConfiguration;

    /**
     * RuleAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<RuleAwsVpcConfiguration> getAwsVpcConfiguration() {
        return awsVpcConfiguration;
    }

    /**
     * RuleAwsVpcConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAwsVpcConfiguration(Property<RuleAwsVpcConfiguration> awsVpcConfiguration) {
        this.awsVpcConfiguration = awsVpcConfiguration;
    }

    public RuleNetworkConfiguration withAwsVpcConfiguration(Property<RuleAwsVpcConfiguration> awsVpcConfiguration) {
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
        if ((other instanceof RuleNetworkConfiguration) == false) {
            return false;
        }
        RuleNetworkConfiguration rhs = ((RuleNetworkConfiguration) other);
        return new EqualsBuilder().append(awsVpcConfiguration, rhs.awsVpcConfiguration).isEquals();
    }

}
