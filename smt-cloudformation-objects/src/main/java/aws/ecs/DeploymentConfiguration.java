
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeploymentConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MaximumPercent",
    "MinimumHealthyPercent"
})
public class DeploymentConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent
     * 
     */
    @JsonProperty("MaximumPercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent")
    private Integer maximumPercent;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent
     * 
     */
    @JsonProperty("MinimumHealthyPercent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent")
    private Integer minimumHealthyPercent;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent
     * 
     */
    public Integer getMaximumPercent() {
        return maximumPercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent
     * 
     */
    public void setMaximumPercent(Integer maximumPercent) {
        this.maximumPercent = maximumPercent;
    }

    public DeploymentConfiguration withMaximumPercent(Integer maximumPercent) {
        this.maximumPercent = maximumPercent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent
     * 
     */
    public Integer getMinimumHealthyPercent() {
        return minimumHealthyPercent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent
     * 
     */
    public void setMinimumHealthyPercent(Integer minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    public DeploymentConfiguration withMinimumHealthyPercent(Integer minimumHealthyPercent) {
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
        if ((other instanceof DeploymentConfiguration) == false) {
            return false;
        }
        DeploymentConfiguration rhs = ((DeploymentConfiguration) other);
        return new EqualsBuilder().append(maximumPercent, rhs.maximumPercent).append(minimumHealthyPercent, rhs.minimumHealthyPercent).isEquals();
    }

}
