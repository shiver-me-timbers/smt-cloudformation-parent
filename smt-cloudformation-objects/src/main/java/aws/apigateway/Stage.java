
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
    "AccessLogSetting",
    "CacheClusterEnabled",
    "CacheClusterSize",
    "CanarySetting",
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
     * AccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    @JsonProperty("AccessLogSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html")
    private AccessLogSetting accessLogSetting;
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
    private CharSequence cacheClusterSize;
    /**
     * CanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    @JsonProperty("CanarySetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html")
    private CanarySetting canarySetting;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid")
    private CharSequence clientCertificateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid
     * 
     */
    @JsonProperty("DeploymentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid")
    private CharSequence deploymentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion")
    private CharSequence documentationVersion;
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
    private CharSequence restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename")
    private CharSequence stageName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables")
    private Map<String, String> variables;

    /**
     * AccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    public AccessLogSetting getAccessLogSetting() {
        return accessLogSetting;
    }

    /**
     * AccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    public void setAccessLogSetting(AccessLogSetting accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
    }

    public Stage withAccessLogSetting(AccessLogSetting accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
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
    public CharSequence getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize
     * 
     */
    public void setCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    public Stage withCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * CanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    public CanarySetting getCanarySetting() {
        return canarySetting;
    }

    /**
     * CanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    public void setCanarySetting(CanarySetting canarySetting) {
        this.canarySetting = canarySetting;
    }

    public Stage withCanarySetting(CanarySetting canarySetting) {
        this.canarySetting = canarySetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    public CharSequence getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    public void setClientCertificateId(CharSequence clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    public Stage withClientCertificateId(CharSequence clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid
     * 
     */
    public CharSequence getDeploymentId() {
        return deploymentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid
     * 
     */
    public void setDeploymentId(CharSequence deploymentId) {
        this.deploymentId = deploymentId;
    }

    public Stage withDeploymentId(CharSequence deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Stage withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion
     * 
     */
    public CharSequence getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion
     * 
     */
    public void setDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    public Stage withDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings
     * 
     */
    public Set<MethodSetting> getMethodSettings() {
        return methodSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings
     * 
     */
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
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public Stage withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename
     * 
     */
    public CharSequence getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename
     * 
     */
    public void setStageName(CharSequence stageName) {
        this.stageName = stageName;
    }

    public Stage withStageName(CharSequence stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    public Map<String, String> getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public Stage withVariables(Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("accessLogSetting", accessLogSetting).append("cacheClusterEnabled", cacheClusterEnabled).append("cacheClusterSize", cacheClusterSize).append("canarySetting", canarySetting).append("clientCertificateId", clientCertificateId).append("deploymentId", deploymentId).append("description", description).append("documentationVersion", documentationVersion).append("methodSettings", methodSettings).append("restApiId", restApiId).append("stageName", stageName).append("variables", variables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variables).append(clientCertificateId).append(description).append(cacheClusterEnabled).append(canarySetting).append(stageName).append(documentationVersion).append(restApiId).append(deploymentId).append(accessLogSetting).append(cacheClusterSize).append(methodSettings).toHashCode();
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
        return new EqualsBuilder().append(variables, rhs.variables).append(clientCertificateId, rhs.clientCertificateId).append(description, rhs.description).append(cacheClusterEnabled, rhs.cacheClusterEnabled).append(canarySetting, rhs.canarySetting).append(stageName, rhs.stageName).append(documentationVersion, rhs.documentationVersion).append(restApiId, rhs.restApiId).append(deploymentId, rhs.deploymentId).append(accessLogSetting, rhs.accessLogSetting).append(cacheClusterSize, rhs.cacheClusterSize).append(methodSettings, rhs.methodSettings).isEquals();
    }

}
