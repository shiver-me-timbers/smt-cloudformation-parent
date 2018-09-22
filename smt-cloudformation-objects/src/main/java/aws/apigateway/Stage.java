
package aws.apigateway;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Stage
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CacheClusterEnabled",
    "CacheClusterSize",
    "ClientCertificateId",
    "DeploymentId",
    "Description",
    "DocumentationVersion",
    "MethodSettings",
    "RestApiId",
    "StageName",
    "Variables"
})
public class Stage {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled")
    private Boolean cacheClusterEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize")
    private java.lang.String cacheClusterSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid")
    private java.lang.String clientCertificateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid
     * 
     */
    @JsonProperty("DeploymentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid")
    private java.lang.String deploymentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description")
    private java.lang.String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion")
    private java.lang.String documentationVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings
     * 
     */
    @JsonProperty("MethodSettings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings")
    private Set<MethodSetting> methodSettings = new LinkedHashSet<MethodSetting>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid")
    private java.lang.String restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename")
    private java.lang.String stageName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables")
    private Map<String, String> variables;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    public Stage withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    public java.lang.String getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    public void setCacheClusterSize(java.lang.String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    public Stage withCacheClusterSize(java.lang.String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    public java.lang.String getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    public void setClientCertificateId(java.lang.String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    public Stage withClientCertificateId(java.lang.String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid
     * 
     */
    @JsonProperty("DeploymentId")
    public java.lang.String getDeploymentId() {
        return deploymentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid
     * 
     */
    @JsonProperty("DeploymentId")
    public void setDeploymentId(java.lang.String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public Stage withDeploymentId(java.lang.String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description
     * 
     */
    @JsonProperty("Description")
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public Stage withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    public java.lang.String getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    public void setDocumentationVersion(java.lang.String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    public Stage withDocumentationVersion(java.lang.String documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings
     * 
     */
    @JsonProperty("MethodSettings")
    public Set<MethodSetting> getMethodSettings() {
        return methodSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings
     * 
     */
    @JsonProperty("MethodSettings")
    public void setMethodSettings(Set<MethodSetting> methodSettings) {
        this.methodSettings = methodSettings;
    }

    public Stage withMethodSettings(Set<MethodSetting> methodSettings) {
        this.methodSettings = methodSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public java.lang.String getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public void setRestApiId(java.lang.String restApiId) {
        this.restApiId = restApiId;
    }

    public Stage withRestApiId(java.lang.String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename
     * 
     */
    @JsonProperty("StageName")
    public java.lang.String getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename
     * 
     */
    @JsonProperty("StageName")
    public void setStageName(java.lang.String stageName) {
        this.stageName = stageName;
    }

    public Stage withStageName(java.lang.String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    @JsonProperty("Variables")
    public Map<String, String> getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    @JsonProperty("Variables")
    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public Stage withVariables(Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("cacheClusterEnabled", cacheClusterEnabled).append("cacheClusterSize", cacheClusterSize).append("clientCertificateId", clientCertificateId).append("deploymentId", deploymentId).append("description", description).append("documentationVersion", documentationVersion).append("methodSettings", methodSettings).append("restApiId", restApiId).append("stageName", stageName).append("variables", variables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variables).append(stageName).append(clientCertificateId).append(documentationVersion).append(restApiId).append(deploymentId).append(cacheClusterSize).append(description).append(cacheClusterEnabled).append(methodSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stage) == false) {
            return false;
        }
        Stage rhs = ((Stage) other);
        return new EqualsBuilder().append(variables, rhs.variables).append(stageName, rhs.stageName).append(clientCertificateId, rhs.clientCertificateId).append(documentationVersion, rhs.documentationVersion).append(restApiId, rhs.restApiId).append(deploymentId, rhs.deploymentId).append(cacheClusterSize, rhs.cacheClusterSize).append(description, rhs.description).append(cacheClusterEnabled, rhs.cacheClusterEnabled).append(methodSettings, rhs.methodSettings).isEquals();
    }

}
