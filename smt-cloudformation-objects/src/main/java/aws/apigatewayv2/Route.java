
package aws.apigatewayv2;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Route
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Target",
    "RouteResponseSelectionExpression",
    "AuthorizerId",
    "RequestModels",
    "OperationName",
    "AuthorizationScopes",
    "ApiKeyRequired",
    "RouteKey",
    "AuthorizationType",
    "ModelSelectionExpression",
    "ApiId",
    "RequestParameters"
})
public class Route {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-target
     * 
     */
    @JsonProperty("Target")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-target")
    private CharSequence target;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routeresponseselectionexpression
     * 
     */
    @JsonProperty("RouteResponseSelectionExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routeresponseselectionexpression")
    private CharSequence routeResponseSelectionExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizerid
     * 
     */
    @JsonProperty("AuthorizerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizerid")
    private CharSequence authorizerId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels
     * 
     */
    @JsonProperty("RequestModels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels")
    private Object requestModels;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-operationname
     * 
     */
    @JsonProperty("OperationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-operationname")
    private CharSequence operationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes
     * 
     */
    @JsonProperty("AuthorizationScopes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes")
    private List<CharSequence> authorizationScopes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired
     * 
     */
    @JsonProperty("ApiKeyRequired")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired")
    private CharSequence apiKeyRequired;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routekey
     * 
     */
    @JsonProperty("RouteKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routekey")
    private CharSequence routeKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype
     * 
     */
    @JsonProperty("AuthorizationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype")
    private CharSequence authorizationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-modelselectionexpression
     * 
     */
    @JsonProperty("ModelSelectionExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-modelselectionexpression")
    private CharSequence modelSelectionExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apiid")
    private CharSequence apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters")
    private Object requestParameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-target
     * 
     */
    @JsonIgnore
    public CharSequence getTarget() {
        return target;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-target
     * 
     */
    @JsonIgnore
    public void setTarget(CharSequence target) {
        this.target = target;
    }

    public Route withTarget(CharSequence target) {
        this.target = target;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routeresponseselectionexpression
     * 
     */
    @JsonIgnore
    public CharSequence getRouteResponseSelectionExpression() {
        return routeResponseSelectionExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routeresponseselectionexpression
     * 
     */
    @JsonIgnore
    public void setRouteResponseSelectionExpression(CharSequence routeResponseSelectionExpression) {
        this.routeResponseSelectionExpression = routeResponseSelectionExpression;
    }

    public Route withRouteResponseSelectionExpression(CharSequence routeResponseSelectionExpression) {
        this.routeResponseSelectionExpression = routeResponseSelectionExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizerid
     * 
     */
    @JsonIgnore
    public CharSequence getAuthorizerId() {
        return authorizerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizerid
     * 
     */
    @JsonIgnore
    public void setAuthorizerId(CharSequence authorizerId) {
        this.authorizerId = authorizerId;
    }

    public Route withAuthorizerId(CharSequence authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels
     * 
     */
    @JsonIgnore
    public Object getRequestModels() {
        return requestModels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels
     * 
     */
    @JsonIgnore
    public void setRequestModels(Object requestModels) {
        this.requestModels = requestModels;
    }

    public Route withRequestModels(Object requestModels) {
        this.requestModels = requestModels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-operationname
     * 
     */
    @JsonIgnore
    public CharSequence getOperationName() {
        return operationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-operationname
     * 
     */
    @JsonIgnore
    public void setOperationName(CharSequence operationName) {
        this.operationName = operationName;
    }

    public Route withOperationName(CharSequence operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAuthorizationScopes() {
        return authorizationScopes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes
     * 
     */
    @JsonIgnore
    public void setAuthorizationScopes(List<CharSequence> authorizationScopes) {
        this.authorizationScopes = authorizationScopes;
    }

    public Route withAuthorizationScopes(List<CharSequence> authorizationScopes) {
        this.authorizationScopes = authorizationScopes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired
     * 
     */
    @JsonIgnore
    public CharSequence getApiKeyRequired() {
        return apiKeyRequired;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired
     * 
     */
    @JsonIgnore
    public void setApiKeyRequired(CharSequence apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    public Route withApiKeyRequired(CharSequence apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routekey
     * 
     */
    @JsonIgnore
    public CharSequence getRouteKey() {
        return routeKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routekey
     * 
     */
    @JsonIgnore
    public void setRouteKey(CharSequence routeKey) {
        this.routeKey = routeKey;
    }

    public Route withRouteKey(CharSequence routeKey) {
        this.routeKey = routeKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype
     * 
     */
    @JsonIgnore
    public CharSequence getAuthorizationType() {
        return authorizationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype
     * 
     */
    @JsonIgnore
    public void setAuthorizationType(CharSequence authorizationType) {
        this.authorizationType = authorizationType;
    }

    public Route withAuthorizationType(CharSequence authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-modelselectionexpression
     * 
     */
    @JsonIgnore
    public CharSequence getModelSelectionExpression() {
        return modelSelectionExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-modelselectionexpression
     * 
     */
    @JsonIgnore
    public void setModelSelectionExpression(CharSequence modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
    }

    public Route withModelSelectionExpression(CharSequence modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apiid
     * 
     */
    @JsonIgnore
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apiid
     * 
     */
    @JsonIgnore
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public Route withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters
     * 
     */
    @JsonIgnore
    public Object getRequestParameters() {
        return requestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters
     * 
     */
    @JsonIgnore
    public void setRequestParameters(Object requestParameters) {
        this.requestParameters = requestParameters;
    }

    public Route withRequestParameters(Object requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("target", target).append("routeResponseSelectionExpression", routeResponseSelectionExpression).append("authorizerId", authorizerId).append("requestModels", requestModels).append("operationName", operationName).append("authorizationScopes", authorizationScopes).append("apiKeyRequired", apiKeyRequired).append("routeKey", routeKey).append("authorizationType", authorizationType).append("modelSelectionExpression", modelSelectionExpression).append("apiId", apiId).append("requestParameters", requestParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authorizerId).append(modelSelectionExpression).append(routeKey).append(requestModels).append(authorizationScopes).append(requestParameters).append(operationName).append(routeResponseSelectionExpression).append(target).append(apiKeyRequired).append(authorizationType).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Route) == false) {
            return false;
        }
        Route rhs = ((Route) other);
        return new EqualsBuilder().append(authorizerId, rhs.authorizerId).append(modelSelectionExpression, rhs.modelSelectionExpression).append(routeKey, rhs.routeKey).append(requestModels, rhs.requestModels).append(authorizationScopes, rhs.authorizationScopes).append(requestParameters, rhs.requestParameters).append(operationName, rhs.operationName).append(routeResponseSelectionExpression, rhs.routeResponseSelectionExpression).append(target, rhs.target).append(apiKeyRequired, rhs.apiKeyRequired).append(authorizationType, rhs.authorizationType).append(apiId, rhs.apiId).isEquals();
    }

}
