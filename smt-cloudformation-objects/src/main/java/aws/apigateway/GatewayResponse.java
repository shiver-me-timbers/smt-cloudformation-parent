
package aws.apigateway;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GatewayResponse
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResponseParameters",
    "ResponseTemplates",
    "ResponseType",
    "RestApiId",
    "StatusCode"
})
public class GatewayResponse {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters
     * 
     */
    @JsonProperty("ResponseParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters")
    private Map<String, String> responseParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates
     * 
     */
    @JsonProperty("ResponseTemplates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates")
    private Map<String, String> responseTemplates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype
     * 
     */
    @JsonProperty("ResponseType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype")
    private java.lang.String responseType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid")
    private java.lang.String restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode")
    private java.lang.String statusCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters
     * 
     */
    @JsonProperty("ResponseParameters")
    public Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters
     * 
     */
    @JsonProperty("ResponseParameters")
    public void setResponseParameters(Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    public GatewayResponse withResponseParameters(Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates
     * 
     */
    @JsonProperty("ResponseTemplates")
    public Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates
     * 
     */
    @JsonProperty("ResponseTemplates")
    public void setResponseTemplates(Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    public GatewayResponse withResponseTemplates(Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype
     * 
     */
    @JsonProperty("ResponseType")
    public java.lang.String getResponseType() {
        return responseType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype
     * 
     */
    @JsonProperty("ResponseType")
    public void setResponseType(java.lang.String responseType) {
        this.responseType = responseType;
    }

    public GatewayResponse withResponseType(java.lang.String responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public java.lang.String getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public void setRestApiId(java.lang.String restApiId) {
        this.restApiId = restApiId;
    }

    public GatewayResponse withRestApiId(java.lang.String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    public java.lang.String getStatusCode() {
        return statusCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }

    public GatewayResponse withStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("responseParameters", responseParameters).append("responseTemplates", responseTemplates).append("responseType", responseType).append("restApiId", restApiId).append("statusCode", statusCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseParameters).append(responseType).append(responseTemplates).append(restApiId).append(statusCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GatewayResponse) == false) {
            return false;
        }
        GatewayResponse rhs = ((GatewayResponse) other);
        return new EqualsBuilder().append(responseParameters, rhs.responseParameters).append(responseType, rhs.responseType).append(responseTemplates, rhs.responseTemplates).append(restApiId, rhs.restApiId).append(statusCode, rhs.statusCode).isEquals();
    }

}
