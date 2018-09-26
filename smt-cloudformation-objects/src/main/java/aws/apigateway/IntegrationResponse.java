
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
 * IntegrationResponse
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContentHandling",
    "ResponseParameters",
    "ResponseTemplates",
    "SelectionPattern",
    "StatusCode"
})
public class IntegrationResponse {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling
     * 
     */
    @JsonProperty("ContentHandling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling")
    private CharSequence contentHandling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responseparameters
     * 
     */
    @JsonProperty("ResponseParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responseparameters")
    private Map<String, String> responseParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responsetemplates
     * 
     */
    @JsonProperty("ResponseTemplates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responsetemplates")
    private Map<String, String> responseTemplates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern
     * 
     */
    @JsonProperty("SelectionPattern")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern")
    private CharSequence selectionPattern;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode")
    private CharSequence statusCode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling
     * 
     */
    public CharSequence getContentHandling() {
        return contentHandling;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling
     * 
     */
    public void setContentHandling(CharSequence contentHandling) {
        this.contentHandling = contentHandling;
    }

    public IntegrationResponse withContentHandling(CharSequence contentHandling) {
        this.contentHandling = contentHandling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responseparameters
     * 
     */
    public Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responseparameters
     * 
     */
    public void setResponseParameters(Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    public IntegrationResponse withResponseParameters(Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responsetemplates
     * 
     */
    public Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responsetemplates
     * 
     */
    public void setResponseTemplates(Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    public IntegrationResponse withResponseTemplates(Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern
     * 
     */
    public CharSequence getSelectionPattern() {
        return selectionPattern;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern
     * 
     */
    public void setSelectionPattern(CharSequence selectionPattern) {
        this.selectionPattern = selectionPattern;
    }

    public IntegrationResponse withSelectionPattern(CharSequence selectionPattern) {
        this.selectionPattern = selectionPattern;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode
     * 
     */
    public CharSequence getStatusCode() {
        return statusCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode
     * 
     */
    public void setStatusCode(CharSequence statusCode) {
        this.statusCode = statusCode;
    }

    public IntegrationResponse withStatusCode(CharSequence statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("contentHandling", contentHandling).append("responseParameters", responseParameters).append("responseTemplates", responseTemplates).append("selectionPattern", selectionPattern).append("statusCode", statusCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(selectionPattern).append(responseParameters).append(contentHandling).append(responseTemplates).append(statusCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntegrationResponse) == false) {
            return false;
        }
        IntegrationResponse rhs = ((IntegrationResponse) other);
        return new EqualsBuilder().append(selectionPattern, rhs.selectionPattern).append(responseParameters, rhs.responseParameters).append(contentHandling, rhs.contentHandling).append(responseTemplates, rhs.responseTemplates).append(statusCode, rhs.statusCode).isEquals();
    }

}
