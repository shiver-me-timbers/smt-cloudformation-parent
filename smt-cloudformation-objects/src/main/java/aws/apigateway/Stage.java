
package aws.apigateway;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    "Tags",
    "TracingEnabled",
    "Variables"
})
public class Stage {

    /**
     * StageAccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    @JsonProperty("AccessLogSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html")
    private Property<StageAccessLogSetting> accessLogSetting;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled")
    private CharSequence cacheClusterEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize")
    private CharSequence cacheClusterSize;
    /**
     * StageCanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    @JsonProperty("CanarySetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html")
    private Property<StageCanarySetting> canarySetting;
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
    private Set<Property<StageMethodSetting>> methodSettings = new LinkedHashSet<Property<StageMethodSetting>>();
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled
     * 
     */
    @JsonProperty("TracingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled")
    private CharSequence tracingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables")
    private Map<String, CharSequence> variables;

    /**
     * StageAccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    @JsonIgnore
    public Property<StageAccessLogSetting> getAccessLogSetting() {
        return accessLogSetting;
    }

    /**
     * StageAccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    @JsonIgnore
    public void setAccessLogSetting(Property<StageAccessLogSetting> accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
    }

    public Stage withAccessLogSetting(Property<StageAccessLogSetting> accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
    @JsonIgnore
    public CharSequence getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled
     * 
     */
    @JsonIgnore
    public void setCacheClusterEnabled(CharSequence cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    public Stage withCacheClusterEnabled(CharSequence cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize
     * 
     */
    @JsonIgnore
    public CharSequence getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize
     * 
     */
    @JsonIgnore
    public void setCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    public Stage withCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * StageCanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    @JsonIgnore
    public Property<StageCanarySetting> getCanarySetting() {
        return canarySetting;
    }

    /**
     * StageCanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    @JsonIgnore
    public void setCanarySetting(Property<StageCanarySetting> canarySetting) {
        this.canarySetting = canarySetting;
    }

    public Stage withCanarySetting(Property<StageCanarySetting> canarySetting) {
        this.canarySetting = canarySetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    @JsonIgnore
    public CharSequence getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDeploymentId() {
        return deploymentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Set<Property<StageMethodSetting>> getMethodSettings() {
        return methodSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings
     * 
     */
    @JsonIgnore
    public void setMethodSettings(Set<Property<StageMethodSetting>> methodSettings) {
        this.methodSettings = methodSettings;
    }

    public Stage withMethodSettings(Set<Property<StageMethodSetting>> methodSettings) {
        this.methodSettings = methodSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid
     * 
     */
    @JsonIgnore
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename
     * 
     */
    @JsonIgnore
    public void setStageName(CharSequence stageName) {
        this.stageName = stageName;
    }

    public Stage withStageName(CharSequence stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Stage withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getTracingEnabled() {
        return tracingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled
     * 
     */
    @JsonIgnore
    public void setTracingEnabled(CharSequence tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
    }

    public Stage withTracingEnabled(CharSequence tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     * 
     */
    @JsonIgnore
    public void setVariables(Map<String, CharSequence> variables) {
        this.variables = variables;
    }

    public Stage withVariables(Map<String, CharSequence> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("accessLogSetting", accessLogSetting).append("cacheClusterEnabled", cacheClusterEnabled).append("cacheClusterSize", cacheClusterSize).append("canarySetting", canarySetting).append("clientCertificateId", clientCertificateId).append("deploymentId", deploymentId).append("description", description).append("documentationVersion", documentationVersion).append("methodSettings", methodSettings).append("restApiId", restApiId).append("stageName", stageName).append("tags", tags).append("tracingEnabled", tracingEnabled).append("variables", variables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variables).append(clientCertificateId).append(description).append(cacheClusterEnabled).append(canarySetting).append(tags).append(stageName).append(documentationVersion).append(restApiId).append(deploymentId).append(accessLogSetting).append(cacheClusterSize).append(methodSettings).append(tracingEnabled).toHashCode();
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
        return new EqualsBuilder().append(variables, rhs.variables).append(clientCertificateId, rhs.clientCertificateId).append(description, rhs.description).append(cacheClusterEnabled, rhs.cacheClusterEnabled).append(canarySetting, rhs.canarySetting).append(tags, rhs.tags).append(stageName, rhs.stageName).append(documentationVersion, rhs.documentationVersion).append(restApiId, rhs.restApiId).append(deploymentId, rhs.deploymentId).append(accessLogSetting, rhs.accessLogSetting).append(cacheClusterSize, rhs.cacheClusterSize).append(methodSettings, rhs.methodSettings).append(tracingEnabled, rhs.tracingEnabled).isEquals();
    }

}
