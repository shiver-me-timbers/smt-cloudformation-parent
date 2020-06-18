
package shiver.me.timbers.aws.apigatewayv2;

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
 * Stage
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientCertificateId",
    "DeploymentId",
    "Description",
    "AccessLogSettings",
    "AutoDeploy",
    "RouteSettings",
    "StageName",
    "StageVariables",
    "ApiId",
    "DefaultRouteSettings",
    "Tags"
})
public class Stage {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid")
    private CharSequence clientCertificateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid
     * 
     */
    @JsonProperty("DeploymentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid")
    private CharSequence deploymentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description")
    private CharSequence description;
    /**
     * StageAccessLogSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html
     * 
     */
    @JsonProperty("AccessLogSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html")
    private Property<StageAccessLogSettings> accessLogSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy
     * 
     */
    @JsonProperty("AutoDeploy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy")
    private CharSequence autoDeploy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings
     * 
     */
    @JsonProperty("RouteSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings")
    private Object routeSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename")
    private CharSequence stageName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables
     * 
     */
    @JsonProperty("StageVariables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables")
    private Object stageVariables;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid")
    private CharSequence apiId;
    /**
     * StageRouteSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html
     * 
     */
    @JsonProperty("DefaultRouteSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html")
    private Property<StageRouteSettings> defaultRouteSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags")
    private Object tags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid
     * 
     */
    @JsonIgnore
    public CharSequence getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentId() {
        return deploymentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description
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
     * StageAccessLogSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html
     * 
     */
    @JsonIgnore
    public Property<StageAccessLogSettings> getAccessLogSettings() {
        return accessLogSettings;
    }

    /**
     * StageAccessLogSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html
     * 
     */
    @JsonIgnore
    public void setAccessLogSettings(Property<StageAccessLogSettings> accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
    }

    public Stage withAccessLogSettings(Property<StageAccessLogSettings> accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy
     * 
     */
    @JsonIgnore
    public CharSequence getAutoDeploy() {
        return autoDeploy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy
     * 
     */
    @JsonIgnore
    public void setAutoDeploy(CharSequence autoDeploy) {
        this.autoDeploy = autoDeploy;
    }

    public Stage withAutoDeploy(CharSequence autoDeploy) {
        this.autoDeploy = autoDeploy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings
     * 
     */
    @JsonIgnore
    public Object getRouteSettings() {
        return routeSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings
     * 
     */
    @JsonIgnore
    public void setRouteSettings(Object routeSettings) {
        this.routeSettings = routeSettings;
    }

    public Stage withRouteSettings(Object routeSettings) {
        this.routeSettings = routeSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename
     * 
     */
    @JsonIgnore
    public CharSequence getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables
     * 
     */
    @JsonIgnore
    public Object getStageVariables() {
        return stageVariables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables
     * 
     */
    @JsonIgnore
    public void setStageVariables(Object stageVariables) {
        this.stageVariables = stageVariables;
    }

    public Stage withStageVariables(Object stageVariables) {
        this.stageVariables = stageVariables;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid
     * 
     */
    @JsonIgnore
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid
     * 
     */
    @JsonIgnore
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public Stage withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * StageRouteSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html
     * 
     */
    @JsonIgnore
    public Property<StageRouteSettings> getDefaultRouteSettings() {
        return defaultRouteSettings;
    }

    /**
     * StageRouteSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html
     * 
     */
    @JsonIgnore
    public void setDefaultRouteSettings(Property<StageRouteSettings> defaultRouteSettings) {
        this.defaultRouteSettings = defaultRouteSettings;
    }

    public Stage withDefaultRouteSettings(Property<StageRouteSettings> defaultRouteSettings) {
        this.defaultRouteSettings = defaultRouteSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Stage withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientCertificateId", clientCertificateId).append("deploymentId", deploymentId).append("description", description).append("accessLogSettings", accessLogSettings).append("autoDeploy", autoDeploy).append("routeSettings", routeSettings).append("stageName", stageName).append("stageVariables", stageVariables).append("apiId", apiId).append("defaultRouteSettings", defaultRouteSettings).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stageName).append(clientCertificateId).append(autoDeploy).append(routeSettings).append(deploymentId).append(description).append(defaultRouteSettings).append(stageVariables).append(apiId).append(accessLogSettings).append(tags).toHashCode();
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
        return new EqualsBuilder().append(stageName, rhs.stageName).append(clientCertificateId, rhs.clientCertificateId).append(autoDeploy, rhs.autoDeploy).append(routeSettings, rhs.routeSettings).append(deploymentId, rhs.deploymentId).append(description, rhs.description).append(defaultRouteSettings, rhs.defaultRouteSettings).append(stageVariables, rhs.stageVariables).append(apiId, rhs.apiId).append(accessLogSettings, rhs.accessLogSettings).append(tags, rhs.tags).isEquals();
    }

}
