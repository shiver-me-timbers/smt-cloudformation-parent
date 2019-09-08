
package shiver.me.timbers.aws.apigatewayv2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RouteResponse
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RouteResponseKey",
    "ResponseParameters",
    "RouteId",
    "ModelSelectionExpression",
    "ApiId",
    "ResponseModels"
})
public class RouteResponse {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey
     * 
     */
    @JsonProperty("RouteResponseKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey")
    private CharSequence routeResponseKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters
     * 
     */
    @JsonProperty("ResponseParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters")
    private Object responseParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid
     * 
     */
    @JsonProperty("RouteId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid")
    private CharSequence routeId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression
     * 
     */
    @JsonProperty("ModelSelectionExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression")
    private CharSequence modelSelectionExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid")
    private CharSequence apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels
     * 
     */
    @JsonProperty("ResponseModels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels")
    private Object responseModels;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey
     * 
     */
    @JsonIgnore
    public CharSequence getRouteResponseKey() {
        return routeResponseKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey
     * 
     */
    @JsonIgnore
    public void setRouteResponseKey(CharSequence routeResponseKey) {
        this.routeResponseKey = routeResponseKey;
    }

    public RouteResponse withRouteResponseKey(CharSequence routeResponseKey) {
        this.routeResponseKey = routeResponseKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters
     * 
     */
    @JsonIgnore
    public Object getResponseParameters() {
        return responseParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters
     * 
     */
    @JsonIgnore
    public void setResponseParameters(Object responseParameters) {
        this.responseParameters = responseParameters;
    }

    public RouteResponse withResponseParameters(Object responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid
     * 
     */
    @JsonIgnore
    public CharSequence getRouteId() {
        return routeId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid
     * 
     */
    @JsonIgnore
    public void setRouteId(CharSequence routeId) {
        this.routeId = routeId;
    }

    public RouteResponse withRouteId(CharSequence routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression
     * 
     */
    @JsonIgnore
    public CharSequence getModelSelectionExpression() {
        return modelSelectionExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression
     * 
     */
    @JsonIgnore
    public void setModelSelectionExpression(CharSequence modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
    }

    public RouteResponse withModelSelectionExpression(CharSequence modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid
     * 
     */
    @JsonIgnore
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid
     * 
     */
    @JsonIgnore
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public RouteResponse withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels
     * 
     */
    @JsonIgnore
    public Object getResponseModels() {
        return responseModels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels
     * 
     */
    @JsonIgnore
    public void setResponseModels(Object responseModels) {
        this.responseModels = responseModels;
    }

    public RouteResponse withResponseModels(Object responseModels) {
        this.responseModels = responseModels;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("routeResponseKey", routeResponseKey).append("responseParameters", responseParameters).append("routeId", routeId).append("modelSelectionExpression", modelSelectionExpression).append("apiId", apiId).append("responseModels", responseModels).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseParameters).append(modelSelectionExpression).append(routeId).append(responseModels).append(routeResponseKey).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteResponse) == false) {
            return false;
        }
        RouteResponse rhs = ((RouteResponse) other);
        return new EqualsBuilder().append(responseParameters, rhs.responseParameters).append(modelSelectionExpression, rhs.modelSelectionExpression).append(routeId, rhs.routeId).append(responseModels, rhs.responseModels).append(routeResponseKey, rhs.routeResponseKey).append(apiId, rhs.apiId).isEquals();
    }

}
