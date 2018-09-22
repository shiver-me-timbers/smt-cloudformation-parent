
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
 * Integration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CacheKeyParameters",
    "CacheNamespace",
    "ContentHandling",
    "Credentials",
    "IntegrationHttpMethod",
    "IntegrationResponses",
    "PassthroughBehavior",
    "RequestParameters",
    "RequestTemplates",
    "Type",
    "Uri"
})
public class Integration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters
     * 
     */
    @JsonProperty("CacheKeyParameters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters")
    private Set<java.lang.String> cacheKeyParameters = new LinkedHashSet<java.lang.String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    @JsonProperty("CacheNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace")
    private java.lang.String cacheNamespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    @JsonProperty("ContentHandling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling")
    private java.lang.String contentHandling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    @JsonProperty("Credentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials")
    private java.lang.String credentials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    @JsonProperty("IntegrationHttpMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod")
    private java.lang.String integrationHttpMethod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses
     * 
     */
    @JsonProperty("IntegrationResponses")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses")
    private Set<IntegrationResponse> integrationResponses = new LinkedHashSet<IntegrationResponse>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior
     * 
     */
    @JsonProperty("PassthroughBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior")
    private java.lang.String passthroughBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters")
    private Map<String, String> requestParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates
     * 
     */
    @JsonProperty("RequestTemplates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates")
    private Map<String, String> requestTemplates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type")
    private java.lang.String type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    @JsonProperty("Uri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri")
    private java.lang.String uri;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters
     * 
     */
    @JsonProperty("CacheKeyParameters")
    public Set<java.lang.String> getCacheKeyParameters() {
        return cacheKeyParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters
     * 
     */
    @JsonProperty("CacheKeyParameters")
    public void setCacheKeyParameters(Set<java.lang.String> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
    }

    public Integration withCacheKeyParameters(Set<java.lang.String> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    @JsonProperty("CacheNamespace")
    public java.lang.String getCacheNamespace() {
        return cacheNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    @JsonProperty("CacheNamespace")
    public void setCacheNamespace(java.lang.String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
    }

    public Integration withCacheNamespace(java.lang.String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    @JsonProperty("ContentHandling")
    public java.lang.String getContentHandling() {
        return contentHandling;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    @JsonProperty("ContentHandling")
    public void setContentHandling(java.lang.String contentHandling) {
        this.contentHandling = contentHandling;
    }

    public Integration withContentHandling(java.lang.String contentHandling) {
        this.contentHandling = contentHandling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    @JsonProperty("Credentials")
    public java.lang.String getCredentials() {
        return credentials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    @JsonProperty("Credentials")
    public void setCredentials(java.lang.String credentials) {
        this.credentials = credentials;
    }

    public Integration withCredentials(java.lang.String credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    @JsonProperty("IntegrationHttpMethod")
    public java.lang.String getIntegrationHttpMethod() {
        return integrationHttpMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    @JsonProperty("IntegrationHttpMethod")
    public void setIntegrationHttpMethod(java.lang.String integrationHttpMethod) {
        this.integrationHttpMethod = integrationHttpMethod;
    }

    public Integration withIntegrationHttpMethod(java.lang.String integrationHttpMethod) {
        this.integrationHttpMethod = integrationHttpMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses
     * 
     */
    @JsonProperty("IntegrationResponses")
    public Set<IntegrationResponse> getIntegrationResponses() {
        return integrationResponses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses
     * 
     */
    @JsonProperty("IntegrationResponses")
    public void setIntegrationResponses(Set<IntegrationResponse> integrationResponses) {
        this.integrationResponses = integrationResponses;
    }

    public Integration withIntegrationResponses(Set<IntegrationResponse> integrationResponses) {
        this.integrationResponses = integrationResponses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior
     * 
     */
    @JsonProperty("PassthroughBehavior")
    public java.lang.String getPassthroughBehavior() {
        return passthroughBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior
     * 
     */
    @JsonProperty("PassthroughBehavior")
    public void setPassthroughBehavior(java.lang.String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    public Integration withPassthroughBehavior(java.lang.String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
    public Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters
     * 
     */
    @JsonProperty("RequestParameters")
    public void setRequestParameters(Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public Integration withRequestParameters(Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates
     * 
     */
    @JsonProperty("RequestTemplates")
    public Map<String, String> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates
     * 
     */
    @JsonProperty("RequestTemplates")
    public void setRequestTemplates(Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    public Integration withRequestTemplates(Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    @JsonProperty("Type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    @JsonProperty("Type")
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public Integration withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    @JsonProperty("Uri")
    public java.lang.String getUri() {
        return uri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    @JsonProperty("Uri")
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    public Integration withUri(java.lang.String uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("cacheKeyParameters", cacheKeyParameters).append("cacheNamespace", cacheNamespace).append("contentHandling", contentHandling).append("credentials", credentials).append("integrationHttpMethod", integrationHttpMethod).append("integrationResponses", integrationResponses).append("passthroughBehavior", passthroughBehavior).append("requestParameters", requestParameters).append("requestTemplates", requestTemplates).append("type", type).append("uri", uri).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(passthroughBehavior).append(requestTemplates).append(integrationHttpMethod).append(credentials).append(cacheKeyParameters).append(integrationResponses).append(requestParameters).append(contentHandling).append(cacheNamespace).append(type).append(uri).toHashCode();
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
        return new EqualsBuilder().append(passthroughBehavior, rhs.passthroughBehavior).append(requestTemplates, rhs.requestTemplates).append(integrationHttpMethod, rhs.integrationHttpMethod).append(credentials, rhs.credentials).append(cacheKeyParameters, rhs.cacheKeyParameters).append(integrationResponses, rhs.integrationResponses).append(requestParameters, rhs.requestParameters).append(contentHandling, rhs.contentHandling).append(cacheNamespace, rhs.cacheNamespace).append(type, rhs.type).append(uri, rhs.uri).isEquals();
    }

}
