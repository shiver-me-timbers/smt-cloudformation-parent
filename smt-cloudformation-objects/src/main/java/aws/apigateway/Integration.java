
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
    "ConnectionId",
    "ConnectionType",
    "ContentHandling",
    "Credentials",
    "IntegrationHttpMethod",
    "IntegrationResponses",
    "PassthroughBehavior",
    "RequestParameters",
    "RequestTemplates",
    "TimeoutInMillis",
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
    private Set<CharSequence> cacheKeyParameters = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    @JsonProperty("CacheNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace")
    private CharSequence cacheNamespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid
     * 
     */
    @JsonProperty("ConnectionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid")
    private CharSequence connectionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype
     * 
     */
    @JsonProperty("ConnectionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype")
    private CharSequence connectionType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    @JsonProperty("ContentHandling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling")
    private CharSequence contentHandling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    @JsonProperty("Credentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials")
    private CharSequence credentials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    @JsonProperty("IntegrationHttpMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod")
    private CharSequence integrationHttpMethod;
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
    private CharSequence passthroughBehavior;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis
     * 
     */
    @JsonProperty("TimeoutInMillis")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis")
    private Integer timeoutInMillis;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    @JsonProperty("Uri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri")
    private CharSequence uri;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters
     * 
     */
    public Set<CharSequence> getCacheKeyParameters() {
        return cacheKeyParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters
     * 
     */
    public void setCacheKeyParameters(Set<CharSequence> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
    }

    public Integration withCacheKeyParameters(Set<CharSequence> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    public CharSequence getCacheNamespace() {
        return cacheNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    public void setCacheNamespace(CharSequence cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
    }

    public Integration withCacheNamespace(CharSequence cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid
     * 
     */
    public CharSequence getConnectionId() {
        return connectionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid
     * 
     */
    public void setConnectionId(CharSequence connectionId) {
        this.connectionId = connectionId;
    }

    public Integration withConnectionId(CharSequence connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype
     * 
     */
    public CharSequence getConnectionType() {
        return connectionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype
     * 
     */
    public void setConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
    }

    public Integration withConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    public CharSequence getContentHandling() {
        return contentHandling;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    public void setContentHandling(CharSequence contentHandling) {
        this.contentHandling = contentHandling;
    }

    public Integration withContentHandling(CharSequence contentHandling) {
        this.contentHandling = contentHandling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    public CharSequence getCredentials() {
        return credentials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    public void setCredentials(CharSequence credentials) {
        this.credentials = credentials;
    }

    public Integration withCredentials(CharSequence credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    public CharSequence getIntegrationHttpMethod() {
        return integrationHttpMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    public void setIntegrationHttpMethod(CharSequence integrationHttpMethod) {
        this.integrationHttpMethod = integrationHttpMethod;
    }

    public Integration withIntegrationHttpMethod(CharSequence integrationHttpMethod) {
        this.integrationHttpMethod = integrationHttpMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses
     * 
     */
    public Set<IntegrationResponse> getIntegrationResponses() {
        return integrationResponses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses
     * 
     */
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
    public CharSequence getPassthroughBehavior() {
        return passthroughBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior
     * 
     */
    public void setPassthroughBehavior(CharSequence passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    public Integration withPassthroughBehavior(CharSequence passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters
     * 
     */
    public Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters
     * 
     */
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
    public Map<String, String> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates
     * 
     */
    public void setRequestTemplates(Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    public Integration withRequestTemplates(Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis
     * 
     */
    public Integer getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis
     * 
     */
    public void setTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    public Integration withTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Integration withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    public CharSequence getUri() {
        return uri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    public void setUri(CharSequence uri) {
        this.uri = uri;
    }

    public Integration withUri(CharSequence uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("cacheKeyParameters", cacheKeyParameters).append("cacheNamespace", cacheNamespace).append("connectionId", connectionId).append("connectionType", connectionType).append("contentHandling", contentHandling).append("credentials", credentials).append("integrationHttpMethod", integrationHttpMethod).append("integrationResponses", integrationResponses).append("passthroughBehavior", passthroughBehavior).append("requestParameters", requestParameters).append("requestTemplates", requestTemplates).append("timeoutInMillis", timeoutInMillis).append("type", type).append("uri", uri).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(integrationHttpMethod).append(credentials).append(cacheKeyParameters).append(integrationResponses).append(requestParameters).append(contentHandling).append(cacheNamespace).append(type).append(connectionType).append(uri).append(timeoutInMillis).append(passthroughBehavior).append(requestTemplates).append(connectionId).toHashCode();
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
        return new EqualsBuilder().append(integrationHttpMethod, rhs.integrationHttpMethod).append(credentials, rhs.credentials).append(cacheKeyParameters, rhs.cacheKeyParameters).append(integrationResponses, rhs.integrationResponses).append(requestParameters, rhs.requestParameters).append(contentHandling, rhs.contentHandling).append(cacheNamespace, rhs.cacheNamespace).append(type, rhs.type).append(connectionType, rhs.connectionType).append(uri, rhs.uri).append(timeoutInMillis, rhs.timeoutInMillis).append(passthroughBehavior, rhs.passthroughBehavior).append(requestTemplates, rhs.requestTemplates).append(connectionId, rhs.connectionId).isEquals();
    }

}
