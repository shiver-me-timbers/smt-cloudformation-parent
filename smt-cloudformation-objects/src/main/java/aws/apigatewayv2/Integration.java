
package aws.apigatewayv2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Integration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "TemplateSelectionExpression",
    "ConnectionType",
    "IntegrationMethod",
    "PassthroughBehavior",
    "RequestParameters",
    "IntegrationUri",
    "CredentialsArn",
    "RequestTemplates",
    "TimeoutInMillis",
    "ContentHandlingStrategy",
    "ApiId",
    "IntegrationType"
})
public class Integration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression
     * 
     */
    @JsonProperty("TemplateSelectionExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression")
    private CharSequence templateSelectionExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype
     * 
     */
    @JsonProperty("ConnectionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype")
    private CharSequence connectionType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod
     * 
     */
    @JsonProperty("IntegrationMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod")
    private CharSequence integrationMethod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-passthroughbehavior
     * 
     */
    @JsonProperty("PassthroughBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-passthroughbehavior")
    private CharSequence passthroughBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requestparameters")
    private Object requestParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationuri
     * 
     */
    @JsonProperty("IntegrationUri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationuri")
    private CharSequence integrationUri;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn
     * 
     */
    @JsonProperty("CredentialsArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn")
    private CharSequence credentialsArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates
     * 
     */
    @JsonProperty("RequestTemplates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates")
    private Object requestTemplates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis
     * 
     */
    @JsonProperty("TimeoutInMillis")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis")
    private Number timeoutInMillis;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-contenthandlingstrategy
     * 
     */
    @JsonProperty("ContentHandlingStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-contenthandlingstrategy")
    private CharSequence contentHandlingStrategy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid")
    private CharSequence apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationtype
     * 
     */
    @JsonProperty("IntegrationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationtype")
    private CharSequence integrationType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Integration withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateSelectionExpression() {
        return templateSelectionExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-templateselectionexpression
     * 
     */
    @JsonIgnore
    public void setTemplateSelectionExpression(CharSequence templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
    }

    public Integration withTemplateSelectionExpression(CharSequence templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype
     * 
     */
    @JsonIgnore
    public CharSequence getConnectionType() {
        return connectionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-connectiontype
     * 
     */
    @JsonIgnore
    public void setConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
    }

    public Integration withConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod
     * 
     */
    @JsonIgnore
    public CharSequence getIntegrationMethod() {
        return integrationMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationmethod
     * 
     */
    @JsonIgnore
    public void setIntegrationMethod(CharSequence integrationMethod) {
        this.integrationMethod = integrationMethod;
    }

    public Integration withIntegrationMethod(CharSequence integrationMethod) {
        this.integrationMethod = integrationMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-passthroughbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getPassthroughBehavior() {
        return passthroughBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-passthroughbehavior
     * 
     */
    @JsonIgnore
    public void setPassthroughBehavior(CharSequence passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    public Integration withPassthroughBehavior(CharSequence passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requestparameters
     * 
     */
    @JsonIgnore
    public Object getRequestParameters() {
        return requestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requestparameters
     * 
     */
    @JsonIgnore
    public void setRequestParameters(Object requestParameters) {
        this.requestParameters = requestParameters;
    }

    public Integration withRequestParameters(Object requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationuri
     * 
     */
    @JsonIgnore
    public CharSequence getIntegrationUri() {
        return integrationUri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationuri
     * 
     */
    @JsonIgnore
    public void setIntegrationUri(CharSequence integrationUri) {
        this.integrationUri = integrationUri;
    }

    public Integration withIntegrationUri(CharSequence integrationUri) {
        this.integrationUri = integrationUri;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn
     * 
     */
    @JsonIgnore
    public CharSequence getCredentialsArn() {
        return credentialsArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-credentialsarn
     * 
     */
    @JsonIgnore
    public void setCredentialsArn(CharSequence credentialsArn) {
        this.credentialsArn = credentialsArn;
    }

    public Integration withCredentialsArn(CharSequence credentialsArn) {
        this.credentialsArn = credentialsArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates
     * 
     */
    @JsonIgnore
    public Object getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-requesttemplates
     * 
     */
    @JsonIgnore
    public void setRequestTemplates(Object requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    public Integration withRequestTemplates(Object requestTemplates) {
        this.requestTemplates = requestTemplates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis
     * 
     */
    @JsonIgnore
    public Number getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-timeoutinmillis
     * 
     */
    @JsonIgnore
    public void setTimeoutInMillis(Number timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    public Integration withTimeoutInMillis(Number timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-contenthandlingstrategy
     * 
     */
    @JsonIgnore
    public CharSequence getContentHandlingStrategy() {
        return contentHandlingStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-contenthandlingstrategy
     * 
     */
    @JsonIgnore
    public void setContentHandlingStrategy(CharSequence contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy;
    }

    public Integration withContentHandlingStrategy(CharSequence contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid
     * 
     */
    @JsonIgnore
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-apiid
     * 
     */
    @JsonIgnore
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public Integration withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationtype
     * 
     */
    @JsonIgnore
    public CharSequence getIntegrationType() {
        return integrationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html#cfn-apigatewayv2-integration-integrationtype
     * 
     */
    @JsonIgnore
    public void setIntegrationType(CharSequence integrationType) {
        this.integrationType = integrationType;
    }

    public Integration withIntegrationType(CharSequence integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("templateSelectionExpression", templateSelectionExpression).append("connectionType", connectionType).append("integrationMethod", integrationMethod).append("passthroughBehavior", passthroughBehavior).append("requestParameters", requestParameters).append("integrationUri", integrationUri).append("credentialsArn", credentialsArn).append("requestTemplates", requestTemplates).append("timeoutInMillis", timeoutInMillis).append("contentHandlingStrategy", contentHandlingStrategy).append("apiId", apiId).append("integrationType", integrationType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(integrationMethod).append(templateSelectionExpression).append(requestParameters).append(description).append(connectionType).append(credentialsArn).append(timeoutInMillis).append(contentHandlingStrategy).append(passthroughBehavior).append(requestTemplates).append(integrationType).append(integrationUri).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Integration) == false) {
            return false;
        }
        Integration rhs = ((Integration) other);
        return new EqualsBuilder().append(integrationMethod, rhs.integrationMethod).append(templateSelectionExpression, rhs.templateSelectionExpression).append(requestParameters, rhs.requestParameters).append(description, rhs.description).append(connectionType, rhs.connectionType).append(credentialsArn, rhs.credentialsArn).append(timeoutInMillis, rhs.timeoutInMillis).append(contentHandlingStrategy, rhs.contentHandlingStrategy).append(passthroughBehavior, rhs.passthroughBehavior).append(requestTemplates, rhs.requestTemplates).append(integrationType, rhs.integrationType).append(integrationUri, rhs.integrationUri).append(apiId, rhs.apiId).isEquals();
    }

}
