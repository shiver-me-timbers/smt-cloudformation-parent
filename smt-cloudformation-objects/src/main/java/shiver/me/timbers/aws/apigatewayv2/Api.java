
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
 * Api
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RouteSelectionExpression",
    "BodyS3Location",
    "Description",
    "BasePath",
    "FailOnWarnings",
    "DisableSchemaValidation",
    "Name",
    "Target",
    "CredentialsArn",
    "CorsConfiguration",
    "Version",
    "ProtocolType",
    "RouteKey",
    "Body",
    "Tags",
    "ApiKeySelectionExpression"
})
public class Api {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression
     * 
     */
    @JsonProperty("RouteSelectionExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression")
    private CharSequence routeSelectionExpression;
    /**
     * ApiBodyS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html
     * 
     */
    @JsonProperty("BodyS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html")
    private Property<ApiBodyS3Location> bodyS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath
     * 
     */
    @JsonProperty("BasePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath")
    private CharSequence basePath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings
     * 
     */
    @JsonProperty("FailOnWarnings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings")
    private CharSequence failOnWarnings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation
     * 
     */
    @JsonProperty("DisableSchemaValidation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation")
    private CharSequence disableSchemaValidation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target
     * 
     */
    @JsonProperty("Target")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target")
    private CharSequence target;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-credentialsarn
     * 
     */
    @JsonProperty("CredentialsArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-credentialsarn")
    private CharSequence credentialsArn;
    /**
     * ApiCors
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html
     * 
     */
    @JsonProperty("CorsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html")
    private Property<ApiCors> corsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version")
    private CharSequence version;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype
     * 
     */
    @JsonProperty("ProtocolType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype")
    private CharSequence protocolType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey
     * 
     */
    @JsonProperty("RouteKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey")
    private CharSequence routeKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body
     * 
     */
    @JsonProperty("Body")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body")
    private Object body;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression
     * 
     */
    @JsonProperty("ApiKeySelectionExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression")
    private CharSequence apiKeySelectionExpression;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression
     * 
     */
    @JsonIgnore
    public CharSequence getRouteSelectionExpression() {
        return routeSelectionExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression
     * 
     */
    @JsonIgnore
    public void setRouteSelectionExpression(CharSequence routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
    }

    public Api withRouteSelectionExpression(CharSequence routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
        return this;
    }

    /**
     * ApiBodyS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html
     * 
     */
    @JsonIgnore
    public Property<ApiBodyS3Location> getBodyS3Location() {
        return bodyS3Location;
    }

    /**
     * ApiBodyS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html
     * 
     */
    @JsonIgnore
    public void setBodyS3Location(Property<ApiBodyS3Location> bodyS3Location) {
        this.bodyS3Location = bodyS3Location;
    }

    public Api withBodyS3Location(Property<ApiBodyS3Location> bodyS3Location) {
        this.bodyS3Location = bodyS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Api withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath
     * 
     */
    @JsonIgnore
    public CharSequence getBasePath() {
        return basePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath
     * 
     */
    @JsonIgnore
    public void setBasePath(CharSequence basePath) {
        this.basePath = basePath;
    }

    public Api withBasePath(CharSequence basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings
     * 
     */
    @JsonIgnore
    public CharSequence getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings
     * 
     */
    @JsonIgnore
    public void setFailOnWarnings(CharSequence failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    public Api withFailOnWarnings(CharSequence failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation
     * 
     */
    @JsonIgnore
    public CharSequence getDisableSchemaValidation() {
        return disableSchemaValidation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation
     * 
     */
    @JsonIgnore
    public void setDisableSchemaValidation(CharSequence disableSchemaValidation) {
        this.disableSchemaValidation = disableSchemaValidation;
    }

    public Api withDisableSchemaValidation(CharSequence disableSchemaValidation) {
        this.disableSchemaValidation = disableSchemaValidation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Api withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target
     * 
     */
    @JsonIgnore
    public CharSequence getTarget() {
        return target;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target
     * 
     */
    @JsonIgnore
    public void setTarget(CharSequence target) {
        this.target = target;
    }

    public Api withTarget(CharSequence target) {
        this.target = target;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-credentialsarn
     * 
     */
    @JsonIgnore
    public CharSequence getCredentialsArn() {
        return credentialsArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-credentialsarn
     * 
     */
    @JsonIgnore
    public void setCredentialsArn(CharSequence credentialsArn) {
        this.credentialsArn = credentialsArn;
    }

    public Api withCredentialsArn(CharSequence credentialsArn) {
        this.credentialsArn = credentialsArn;
        return this;
    }

    /**
     * ApiCors
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html
     * 
     */
    @JsonIgnore
    public Property<ApiCors> getCorsConfiguration() {
        return corsConfiguration;
    }

    /**
     * ApiCors
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html
     * 
     */
    @JsonIgnore
    public void setCorsConfiguration(Property<ApiCors> corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
    }

    public Api withCorsConfiguration(Property<ApiCors> corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version
     * 
     */
    @JsonIgnore
    public CharSequence getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version
     * 
     */
    @JsonIgnore
    public void setVersion(CharSequence version) {
        this.version = version;
    }

    public Api withVersion(CharSequence version) {
        this.version = version;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype
     * 
     */
    @JsonIgnore
    public CharSequence getProtocolType() {
        return protocolType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype
     * 
     */
    @JsonIgnore
    public void setProtocolType(CharSequence protocolType) {
        this.protocolType = protocolType;
    }

    public Api withProtocolType(CharSequence protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey
     * 
     */
    @JsonIgnore
    public CharSequence getRouteKey() {
        return routeKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey
     * 
     */
    @JsonIgnore
    public void setRouteKey(CharSequence routeKey) {
        this.routeKey = routeKey;
    }

    public Api withRouteKey(CharSequence routeKey) {
        this.routeKey = routeKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body
     * 
     */
    @JsonIgnore
    public Object getBody() {
        return body;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body
     * 
     */
    @JsonIgnore
    public void setBody(Object body) {
        this.body = body;
    }

    public Api withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Api withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression
     * 
     */
    @JsonIgnore
    public CharSequence getApiKeySelectionExpression() {
        return apiKeySelectionExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression
     * 
     */
    @JsonIgnore
    public void setApiKeySelectionExpression(CharSequence apiKeySelectionExpression) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
    }

    public Api withApiKeySelectionExpression(CharSequence apiKeySelectionExpression) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("routeSelectionExpression", routeSelectionExpression).append("bodyS3Location", bodyS3Location).append("description", description).append("basePath", basePath).append("failOnWarnings", failOnWarnings).append("disableSchemaValidation", disableSchemaValidation).append("name", name).append("target", target).append("credentialsArn", credentialsArn).append("corsConfiguration", corsConfiguration).append("version", version).append("protocolType", protocolType).append("routeKey", routeKey).append("body", body).append("tags", tags).append("apiKeySelectionExpression", apiKeySelectionExpression).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(disableSchemaValidation).append(routeKey).append(description).append(protocolType).append(failOnWarnings).append(body).append(version).append(credentialsArn).append(target).append(tags).append(corsConfiguration).append(basePath).append(apiKeySelectionExpression).append(routeSelectionExpression).append(bodyS3Location).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Api) == false) {
            return false;
        }
        Api rhs = ((Api) other);
        return new EqualsBuilder().append(disableSchemaValidation, rhs.disableSchemaValidation).append(routeKey, rhs.routeKey).append(description, rhs.description).append(protocolType, rhs.protocolType).append(failOnWarnings, rhs.failOnWarnings).append(body, rhs.body).append(version, rhs.version).append(credentialsArn, rhs.credentialsArn).append(target, rhs.target).append(tags, rhs.tags).append(corsConfiguration, rhs.corsConfiguration).append(basePath, rhs.basePath).append(apiKeySelectionExpression, rhs.apiKeySelectionExpression).append(routeSelectionExpression, rhs.routeSelectionExpression).append(bodyS3Location, rhs.bodyS3Location).append(name, rhs.name).isEquals();
    }

}
