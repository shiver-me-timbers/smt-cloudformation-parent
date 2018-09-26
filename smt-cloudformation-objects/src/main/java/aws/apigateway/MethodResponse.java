
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
 * MethodResponse
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResponseModels",
    "ResponseParameters",
    "StatusCode"
})
public class MethodResponse {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels
     * 
     */
    @JsonProperty("ResponseModels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels")
    private Map<String, String> responseModels;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters
     * 
     */
    @JsonProperty("ResponseParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters")
    private Map<String, Boolean> responseParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode")
    private CharSequence statusCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels
     * 
     */
    public Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels
     * 
     */
    public void setResponseModels(Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    public MethodResponse withResponseModels(Map<String, String> responseModels) {
        this.responseModels = responseModels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters
     * 
     */
    public Map<String, Boolean> getResponseParameters() {
        return responseParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters
     * 
     */
    public void setResponseParameters(Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
    }

    public MethodResponse withResponseParameters(Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode
     * 
     */
    public CharSequence getStatusCode() {
        return statusCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode
     * 
     */
    public void setStatusCode(CharSequence statusCode) {
        this.statusCode = statusCode;
    }

    public MethodResponse withStatusCode(CharSequence statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("responseModels", responseModels).append("responseParameters", responseParameters).append("statusCode", statusCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseParameters).append(responseModels).append(statusCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MethodResponse) == false) {
            return false;
        }
        MethodResponse rhs = ((MethodResponse) other);
        return new EqualsBuilder().append(responseParameters, rhs.responseParameters).append(responseModels, rhs.responseModels).append(statusCode, rhs.statusCode).isEquals();
    }

}
