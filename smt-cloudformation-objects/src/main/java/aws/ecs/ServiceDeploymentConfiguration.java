
package aws.ecs;

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
 * ServiceDeploymentConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaximumPercent",
    "MinimumHealthyPercent"
})
public class ServiceDeploymentConfiguration implements Property<ServiceDeploymentConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent
     * 
     */
    @JsonProperty("MaximumPercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent")
    private Number maximumPercent;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent
     * 
     */
    @JsonProperty("MinimumHealthyPercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent")
    private Number minimumHealthyPercent;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent
     * 
     */
    @JsonIgnore
    public Number getMaximumPercent() {
        return maximumPercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent
     * 
     */
    @JsonIgnore
    public void setMaximumPercent(Number maximumPercent) {
        this.maximumPercent = maximumPercent;
    }

    public ServiceDeploymentConfiguration withMaximumPercent(Number maximumPercent) {
        this.maximumPercent = maximumPercent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent
     * 
     */
    @JsonIgnore
    public Number getMinimumHealthyPercent() {
        return minimumHealthyPercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent
     * 
     */
    @JsonIgnore
    public void setMinimumHealthyPercent(Number minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    public ServiceDeploymentConfiguration withMinimumHealthyPercent(Number minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maximumPercent", maximumPercent).append("minimumHealthyPercent", minimumHealthyPercent).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maximumPercent).append(minimumHealthyPercent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceDeploymentConfiguration) == false) {
            return false;
        }
        ServiceDeploymentConfiguration rhs = ((ServiceDeploymentConfiguration) other);
        return new EqualsBuilder().append(maximumPercent, rhs.maximumPercent).append(minimumHealthyPercent, rhs.minimumHealthyPercent).isEquals();
    }

}
