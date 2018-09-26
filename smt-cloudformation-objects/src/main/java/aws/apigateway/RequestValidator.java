
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RequestValidator
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "RestApiId",
    "ValidateRequestBody",
    "ValidateRequestParameters"
})
public class RequestValidator {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid")
    private CharSequence restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody
     * 
     */
    @JsonProperty("ValidateRequestBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody")
    private Boolean validateRequestBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters
     * 
     */
    @JsonProperty("ValidateRequestParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters")
    private Boolean validateRequestParameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RequestValidator withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid
     * 
     */
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public RequestValidator withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody
     * 
     */
    public Boolean getValidateRequestBody() {
        return validateRequestBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody
     * 
     */
    public void setValidateRequestBody(Boolean validateRequestBody) {
        this.validateRequestBody = validateRequestBody;
    }

    public RequestValidator withValidateRequestBody(Boolean validateRequestBody) {
        this.validateRequestBody = validateRequestBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters
     * 
     */
    public Boolean getValidateRequestParameters() {
        return validateRequestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters
     * 
     */
    public void setValidateRequestParameters(Boolean validateRequestParameters) {
        this.validateRequestParameters = validateRequestParameters;
    }

    public RequestValidator withValidateRequestParameters(Boolean validateRequestParameters) {
        this.validateRequestParameters = validateRequestParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("restApiId", restApiId).append("validateRequestBody", validateRequestBody).append("validateRequestParameters", validateRequestParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(validateRequestParameters).append(validateRequestBody).append(restApiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestValidator) == false) {
            return false;
        }
        RequestValidator rhs = ((RequestValidator) other);
        return new EqualsBuilder().append(name, rhs.name).append(validateRequestParameters, rhs.validateRequestParameters).append(validateRequestBody, rhs.validateRequestBody).append(restApiId, rhs.restApiId).isEquals();
    }

}
