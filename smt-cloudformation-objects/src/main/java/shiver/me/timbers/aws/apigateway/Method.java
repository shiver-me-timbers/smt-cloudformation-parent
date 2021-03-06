
package shiver.me.timbers.aws.apigateway;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Method
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApiKeyRequired",
    "AuthorizationScopes",
    "AuthorizationType",
    "AuthorizerId",
    "HttpMethod",
    "Integration",
    "MethodResponses",
    "OperationName",
    "RequestModels",
    "RequestParameters",
    "RequestValidatorId",
    "ResourceId",
    "RestApiId"
})
public class Method {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired
     * 
     */
    @JsonProperty("ApiKeyRequired")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired")
    private CharSequence apiKeyRequired;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes
     * 
     */
    @JsonProperty("AuthorizationScopes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes")
    private Set<CharSequence> authorizationScopes = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype
     * 
     */
    @JsonProperty("AuthorizationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype")
    private CharSequence authorizationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid
     * 
     */
    @JsonProperty("AuthorizerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid")
    private CharSequence authorizerId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod
     * 
     */
    @JsonProperty("HttpMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod")
    private CharSequence httpMethod;
    /**
     * MethodIntegration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
     * 
     */
    @JsonProperty("Integration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html")
    private Property<MethodIntegration> integration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses
     * 
     */
    @JsonProperty("MethodResponses")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses")
    private Set<Property<MethodMethodResponse>> methodResponses = new LinkedHashSet<Property<MethodMethodResponse>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname
     * 
     */
    @JsonProperty("OperationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname")
    private CharSequence operationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels
     * 
     */
    @JsonProperty("RequestModels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels")
    private Map<String, CharSequence> requestModels;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters")
    private Map<String, Boolean> requestParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid
     * 
     */
    @JsonProperty("RequestValidatorId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid")
    private CharSequence requestValidatorId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid")
    private CharSequence resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid")
    private CharSequence restApiId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired
     * 
     */
    @JsonIgnore
    public CharSequence getApiKeyRequired() {
        return apiKeyRequired;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired
     * 
     */
    @JsonIgnore
    public void setApiKeyRequired(CharSequence apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    public Method withApiKeyRequired(CharSequence apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAuthorizationScopes() {
        return authorizationScopes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes
     * 
     */
    @JsonIgnore
    public void setAuthorizationScopes(Set<CharSequence> authorizationScopes) {
        this.authorizationScopes = authorizationScopes;
    }

    public Method withAuthorizationScopes(Set<CharSequence> authorizationScopes) {
        this.authorizationScopes = authorizationScopes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype
     * 
     */
    @JsonIgnore
    public CharSequence getAuthorizationType() {
        return authorizationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype
     * 
     */
    @JsonIgnore
    public void setAuthorizationType(CharSequence authorizationType) {
        this.authorizationType = authorizationType;
    }

    public Method withAuthorizationType(CharSequence authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid
     * 
     */
    @JsonIgnore
    public CharSequence getAuthorizerId() {
        return authorizerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid
     * 
     */
    @JsonIgnore
    public void setAuthorizerId(CharSequence authorizerId) {
        this.authorizerId = authorizerId;
    }

    public Method withAuthorizerId(CharSequence authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod
     * 
     */
    @JsonIgnore
    public CharSequence getHttpMethod() {
        return httpMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod
     * 
     */
    @JsonIgnore
    public void setHttpMethod(CharSequence httpMethod) {
        this.httpMethod = httpMethod;
    }

    public Method withHttpMethod(CharSequence httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * MethodIntegration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
     * 
     */
    @JsonIgnore
    public Property<MethodIntegration> getIntegration() {
        return integration;
    }

    /**
     * MethodIntegration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
     * 
     */
    @JsonIgnore
    public void setIntegration(Property<MethodIntegration> integration) {
        this.integration = integration;
    }

    public Method withIntegration(Property<MethodIntegration> integration) {
        this.integration = integration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses
     * 
     */
    @JsonIgnore
    public Set<Property<MethodMethodResponse>> getMethodResponses() {
        return methodResponses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses
     * 
     */
    @JsonIgnore
    public void setMethodResponses(Set<Property<MethodMethodResponse>> methodResponses) {
        this.methodResponses = methodResponses;
    }

    public Method withMethodResponses(Set<Property<MethodMethodResponse>> methodResponses) {
        this.methodResponses = methodResponses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname
     * 
     */
    @JsonIgnore
    public CharSequence getOperationName() {
        return operationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname
     * 
     */
    @JsonIgnore
    public void setOperationName(CharSequence operationName) {
        this.operationName = operationName;
    }

    public Method withOperationName(CharSequence operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getRequestModels() {
        return requestModels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels
     * 
     */
    @JsonIgnore
    public void setRequestModels(Map<String, CharSequence> requestModels) {
        this.requestModels = requestModels;
    }

    public Method withRequestModels(Map<String, CharSequence> requestModels) {
        this.requestModels = requestModels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters
     * 
     */
    @JsonIgnore
    public Map<String, Boolean> getRequestParameters() {
        return requestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters
     * 
     */
    @JsonIgnore
    public void setRequestParameters(Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public Method withRequestParameters(Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid
     * 
     */
    @JsonIgnore
    public CharSequence getRequestValidatorId() {
        return requestValidatorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid
     * 
     */
    @JsonIgnore
    public void setRequestValidatorId(CharSequence requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
    }

    public Method withRequestValidatorId(CharSequence requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid
     * 
     */
    @JsonIgnore
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid
     * 
     */
    @JsonIgnore
    public void setResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
    }

    public Method withResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid
     * 
     */
    @JsonIgnore
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid
     * 
     */
    @JsonIgnore
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public Method withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("apiKeyRequired", apiKeyRequired).append("authorizationScopes", authorizationScopes).append("authorizationType", authorizationType).append("authorizerId", authorizerId).append("httpMethod", httpMethod).append("integration", integration).append("methodResponses", methodResponses).append("operationName", operationName).append("requestModels", requestModels).append("requestParameters", requestParameters).append("requestValidatorId", requestValidatorId).append("resourceId", resourceId).append("restApiId", restApiId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authorizerId).append(resourceId).append(authorizationScopes).append(requestModels).append(requestParameters).append(operationName).append(httpMethod).append(requestValidatorId).append(apiKeyRequired).append(restApiId).append(integration).append(authorizationType).append(methodResponses).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Method) == false) {
            return false;
        }
        Method rhs = ((Method) other);
        return new EqualsBuilder().append(authorizerId, rhs.authorizerId).append(resourceId, rhs.resourceId).append(authorizationScopes, rhs.authorizationScopes).append(requestModels, rhs.requestModels).append(requestParameters, rhs.requestParameters).append(operationName, rhs.operationName).append(httpMethod, rhs.httpMethod).append(requestValidatorId, rhs.requestValidatorId).append(apiKeyRequired, rhs.apiKeyRequired).append(restApiId, rhs.restApiId).append(integration, rhs.integration).append(authorizationType, rhs.authorizationType).append(methodResponses, rhs.methodResponses).isEquals();
    }

}
