
package aws.apigateway;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MethodIntegration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
public class MethodIntegration implements Property<MethodIntegration>
{

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
    private Set<Property<MethodIntegrationResponse>> integrationResponses = new LinkedHashSet<Property<MethodIntegrationResponse>>();
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
    private Map<String, CharSequence> requestParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates
     * 
     */
    @JsonProperty("RequestTemplates")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates")
    private Map<String, CharSequence> requestTemplates;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis
     * 
     */
    @JsonProperty("TimeoutInMillis")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis")
    private Number timeoutInMillis;
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
    @JsonIgnore
    public Set<CharSequence> getCacheKeyParameters() {
        return cacheKeyParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters
     * 
     */
    @JsonIgnore
    public void setCacheKeyParameters(Set<CharSequence> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
    }

    public MethodIntegration withCacheKeyParameters(Set<CharSequence> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    @JsonIgnore
    public CharSequence getCacheNamespace() {
        return cacheNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace
     * 
     */
    @JsonIgnore
    public void setCacheNamespace(CharSequence cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
    }

    public MethodIntegration withCacheNamespace(CharSequence cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid
     * 
     */
    @JsonIgnore
    public CharSequence getConnectionId() {
        return connectionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid
     * 
     */
    @JsonIgnore
    public void setConnectionId(CharSequence connectionId) {
        this.connectionId = connectionId;
    }

    public MethodIntegration withConnectionId(CharSequence connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype
     * 
     */
    @JsonIgnore
    public CharSequence getConnectionType() {
        return connectionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype
     * 
     */
    @JsonIgnore
    public void setConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
    }

    public MethodIntegration withConnectionType(CharSequence connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    @JsonIgnore
    public CharSequence getContentHandling() {
        return contentHandling;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling
     * 
     */
    @JsonIgnore
    public void setContentHandling(CharSequence contentHandling) {
        this.contentHandling = contentHandling;
    }

    public MethodIntegration withContentHandling(CharSequence contentHandling) {
        this.contentHandling = contentHandling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    @JsonIgnore
    public CharSequence getCredentials() {
        return credentials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials
     * 
     */
    @JsonIgnore
    public void setCredentials(CharSequence credentials) {
        this.credentials = credentials;
    }

    public MethodIntegration withCredentials(CharSequence credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    @JsonIgnore
    public CharSequence getIntegrationHttpMethod() {
        return integrationHttpMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod
     * 
     */
    @JsonIgnore
    public void setIntegrationHttpMethod(CharSequence integrationHttpMethod) {
        this.integrationHttpMethod = integrationHttpMethod;
    }

    public MethodIntegration withIntegrationHttpMethod(CharSequence integrationHttpMethod) {
        this.integrationHttpMethod = integrationHttpMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses
     * 
     */
    @JsonIgnore
    public Set<Property<MethodIntegrationResponse>> getIntegrationResponses() {
        return integrationResponses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses
     * 
     */
    @JsonIgnore
    public void setIntegrationResponses(Set<Property<MethodIntegrationResponse>> integrationResponses) {
        this.integrationResponses = integrationResponses;
    }

    public MethodIntegration withIntegrationResponses(Set<Property<MethodIntegrationResponse>> integrationResponses) {
        this.integrationResponses = integrationResponses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getPassthroughBehavior() {
        return passthroughBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior
     * 
     */
    @JsonIgnore
    public void setPassthroughBehavior(CharSequence passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    public MethodIntegration withPassthroughBehavior(CharSequence passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getRequestParameters() {
        return requestParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters
     * 
     */
    @JsonIgnore
    public void setRequestParameters(Map<String, CharSequence> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public MethodIntegration withRequestParameters(Map<String, CharSequence> requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates
     * 
     */
    @JsonIgnore
    public void setRequestTemplates(Map<String, CharSequence> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    public MethodIntegration withRequestTemplates(Map<String, CharSequence> requestTemplates) {
        this.requestTemplates = requestTemplates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis
     * 
     */
    @JsonIgnore
    public Number getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis
     * 
     */
    @JsonIgnore
    public void setTimeoutInMillis(Number timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    public MethodIntegration withTimeoutInMillis(Number timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public MethodIntegration withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    @JsonIgnore
    public CharSequence getUri() {
        return uri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri
     * 
     */
    @JsonIgnore
    public void setUri(CharSequence uri) {
        this.uri = uri;
    }

    public MethodIntegration withUri(CharSequence uri) {
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
        if ((other instanceof MethodIntegration) == false) {
            return false;
        }
        MethodIntegration rhs = ((MethodIntegration) other);
        return new EqualsBuilder().append(integrationHttpMethod, rhs.integrationHttpMethod).append(credentials, rhs.credentials).append(cacheKeyParameters, rhs.cacheKeyParameters).append(integrationResponses, rhs.integrationResponses).append(requestParameters, rhs.requestParameters).append(contentHandling, rhs.contentHandling).append(cacheNamespace, rhs.cacheNamespace).append(type, rhs.type).append(connectionType, rhs.connectionType).append(uri, rhs.uri).append(timeoutInMillis, rhs.timeoutInMillis).append(passthroughBehavior, rhs.passthroughBehavior).append(requestTemplates, rhs.requestTemplates).append(connectionId, rhs.connectionId).isEquals();
    }

}
