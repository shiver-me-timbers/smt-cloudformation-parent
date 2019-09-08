
package shiver.me.timbers.aws.codedeploy;

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
 * DeploymentConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeploymentConfigName",
    "MinimumHealthyHosts"
})
public class DeploymentConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname
     * 
     */
    @JsonProperty("DeploymentConfigName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname")
    private CharSequence deploymentConfigName;
    /**
     * DeploymentConfigMinimumHealthyHosts
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html
     * 
     */
    @JsonProperty("MinimumHealthyHosts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html")
    private Property<DeploymentConfigMinimumHealthyHosts> minimumHealthyHosts;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname
     * 
     */
    @JsonIgnore
    public void setDeploymentConfigName(CharSequence deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    public DeploymentConfig withDeploymentConfigName(CharSequence deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * DeploymentConfigMinimumHealthyHosts
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentConfigMinimumHealthyHosts> getMinimumHealthyHosts() {
        return minimumHealthyHosts;
    }

    /**
     * DeploymentConfigMinimumHealthyHosts
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html
     * 
     */
    @JsonIgnore
    public void setMinimumHealthyHosts(Property<DeploymentConfigMinimumHealthyHosts> minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
    }

    public DeploymentConfig withMinimumHealthyHosts(Property<DeploymentConfigMinimumHealthyHosts> minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deploymentConfigName", deploymentConfigName).append("minimumHealthyHosts", minimumHealthyHosts).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deploymentConfigName).append(minimumHealthyHosts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentConfig) == false) {
            return false;
        }
        DeploymentConfig rhs = ((DeploymentConfig) other);
        return new EqualsBuilder().append(deploymentConfigName, rhs.deploymentConfigName).append(minimumHealthyHosts, rhs.minimumHealthyHosts).isEquals();
    }

}
