
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Deployment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeploymentCanarySettings",
    "Description",
    "RestApiId",
    "StageDescription",
    "StageName"
})
public class Deployment {

    /**
     * DeploymentCanarySettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html
     * 
     */
    @JsonProperty("DeploymentCanarySettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html")
    private DeploymentCanarySettings deploymentCanarySettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid")
    private CharSequence restApiId;
    /**
     * StageDescription
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
     * 
     */
    @JsonProperty("StageDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html")
    private StageDescription stageDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename")
    private CharSequence stageName;

    /**
     * DeploymentCanarySettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html
     * 
     */
    public DeploymentCanarySettings getDeploymentCanarySettings() {
        return deploymentCanarySettings;
    }

    /**
     * DeploymentCanarySettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html
     * 
     */
    public void setDeploymentCanarySettings(DeploymentCanarySettings deploymentCanarySettings) {
        this.deploymentCanarySettings = deploymentCanarySettings;
    }

    public Deployment withDeploymentCanarySettings(DeploymentCanarySettings deploymentCanarySettings) {
        this.deploymentCanarySettings = deploymentCanarySettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Deployment withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid
     * 
     */
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public Deployment withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * StageDescription
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
     * 
     */
    public StageDescription getStageDescription() {
        return stageDescription;
    }

    /**
     * StageDescription
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
     * 
     */
    public void setStageDescription(StageDescription stageDescription) {
        this.stageDescription = stageDescription;
    }

    public Deployment withStageDescription(StageDescription stageDescription) {
        this.stageDescription = stageDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename
     * 
     */
    public CharSequence getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename
     * 
     */
    public void setStageName(CharSequence stageName) {
        this.stageName = stageName;
    }

    public Deployment withStageName(CharSequence stageName) {
        this.stageName = stageName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deploymentCanarySettings", deploymentCanarySettings).append("description", description).append("restApiId", restApiId).append("stageDescription", stageDescription).append("stageName", stageName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(stageName).append(deploymentCanarySettings).append(restApiId).append(stageDescription).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deployment) == false) {
            return false;
        }
        Deployment rhs = ((Deployment) other);
        return new EqualsBuilder().append(description, rhs.description).append(stageName, rhs.stageName).append(deploymentCanarySettings, rhs.deploymentCanarySettings).append(restApiId, rhs.restApiId).append(stageDescription, rhs.stageDescription).isEquals();
    }

}
