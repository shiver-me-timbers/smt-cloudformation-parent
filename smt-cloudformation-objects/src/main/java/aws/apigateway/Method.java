
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
 * Method
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApiKeyRequired",
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
    private java.lang.Boolean apiKeyRequired;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype
     * 
     */
    @JsonProperty("AuthorizationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype")
    private java.lang.String authorizationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid
     * 
     */
    @JsonProperty("AuthorizerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid")
    private java.lang.String authorizerId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod
     * 
     */
    @JsonProperty("HttpMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod")
    private java.lang.String httpMethod;
    /**
     * Integration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
     * 
     */
    @JsonProperty("Integration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html")
    private Integration integration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses
     * 
     */
    @JsonProperty("MethodResponses")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses")
    private Set<MethodResponse> methodResponses = new LinkedHashSet<MethodResponse>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname
     * 
     */
    @JsonProperty("OperationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname")
    private java.lang.String operationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels
     * 
     */
    @JsonProperty("RequestModels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels")
    private Map<String, String> requestModels;
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
    private java.lang.String requestValidatorId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid")
    private java.lang.String resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid")
    private java.lang.String restApiId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired
     * 
     */
    @JsonProperty("ApiKeyRequired")
    public java.lang.Boolean getApiKeyRequired() {
        return apiKeyRequired;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired
     * 
     */
    @JsonProperty("ApiKeyRequired")
    public void setApiKeyRequired(java.lang.Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    public Method withApiKeyRequired(java.lang.Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype
     * 
     */
    @JsonProperty("AuthorizationType")
    public java.lang.String getAuthorizationType() {
        return authorizationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype
     * 
     */
    @JsonProperty("AuthorizationType")
    public void setAuthorizationType(java.lang.String authorizationType) {
        this.authorizationType = authorizationType;
    }

    public Method withAuthorizationType(java.lang.String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid
     * 
     */
    @JsonProperty("AuthorizerId")
    public java.lang.String getAuthorizerId() {
        return authorizerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid
     * 
     */
    @JsonProperty("AuthorizerId")
    public void setAuthorizerId(java.lang.String authorizerId) {
        this.authorizerId = authorizerId;
    }

    public Method withAuthorizerId(java.lang.String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod
     * 
     */
    @JsonProperty("HttpMethod")
    public java.lang.String getHttpMethod() {
        return httpMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod
     * 
     */
    @JsonProperty("HttpMethod")
    public void setHttpMethod(java.lang.String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public Method withHttpMethod(java.lang.String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * Integration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
     * 
     */
    @JsonProperty("Integration")
    public Integration getIntegration() {
        return integration;
    }

    /**
     * Integration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
     * 
     */
    @JsonProperty("Integration")
    public void setIntegration(Integration integration) {
        this.integration = integration;
    }

    public Method withIntegration(Integration integration) {
        this.integration = integration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses
     * 
     */
    @JsonProperty("MethodResponses")
    public Set<MethodResponse> getMethodResponses() {
        return methodResponses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses
     * 
     */
    @JsonProperty("MethodResponses")
    public void setMethodResponses(Set<MethodResponse> methodResponses) {
        this.methodResponses = methodResponses;
    }

    public Method withMethodResponses(Set<MethodResponse> methodResponses) {
        this.methodResponses = methodResponses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname
     * 
     */
    @JsonProperty("OperationName")
    public java.lang.String getOperationName() {
        return operationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname
     * 
     */
    @JsonProperty("OperationName")
    public void setOperationName(java.lang.String operationName) {
        this.operationName = operationName;
    }

    public Method withOperationName(java.lang.String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels
     * 
     */
    @JsonProperty("RequestModels")
    public Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels
     * 
     */
    @JsonProperty("RequestModels")
    public void setRequestModels(Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    public Method withRequestModels(Map<String, String> requestModels) {
        this.requestModels = requestModels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
    public Map<String, Boolean> getRequestParameters() {
        return requestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
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
    @JsonProperty("RequestValidatorId")
    public java.lang.String getRequestValidatorId() {
        return requestValidatorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid
     * 
     */
    @JsonProperty("RequestValidatorId")
    public void setRequestValidatorId(java.lang.String requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
    }

    public Method withRequestValidatorId(java.lang.String requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    public java.lang.String getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    public void setResourceId(java.lang.String resourceId) {
        this.resourceId = resourceId;
    }

    public Method withResourceId(java.lang.String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public java.lang.String getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public void setRestApiId(java.lang.String restApiId) {
        this.restApiId = restApiId;
    }

    public Method withRestApiId(java.lang.String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("apiKeyRequired", apiKeyRequired).append("authorizationType", authorizationType).append("authorizerId", authorizerId).append("httpMethod", httpMethod).append("integration", integration).append("methodResponses", methodResponses).append("operationName", operationName).append("requestModels", requestModels).append("requestParameters", requestParameters).append("requestValidatorId", requestValidatorId).append("resourceId", resourceId).append("restApiId", restApiId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authorizerId).append(resourceId).append(requestModels).append(requestParameters).append(operationName).append(httpMethod).append(requestValidatorId).append(apiKeyRequired).append(restApiId).append(integration).append(authorizationType).append(methodResponses).toHashCode();
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
        return new EqualsBuilder().append(authorizerId, rhs.authorizerId).append(resourceId, rhs.resourceId).append(requestModels, rhs.requestModels).append(requestParameters, rhs.requestParameters).append(operationName, rhs.operationName).append(httpMethod, rhs.httpMethod).append(requestValidatorId, rhs.requestValidatorId).append(apiKeyRequired, rhs.apiKeyRequired).append(restApiId, rhs.restApiId).append(integration, rhs.integration).append(authorizationType, rhs.authorizationType).append(methodResponses, rhs.methodResponses).isEquals();
    }

}