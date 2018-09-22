
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
 * RestApi
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApiKeySourceType",
    "BinaryMediaTypes",
    "Body",
    "BodyS3Location",
    "CloneFrom",
    "Description",
    "EndpointConfiguration",
    "FailOnWarnings",
    "MinimumCompressionSize",
    "Name",
    "Parameters",
    "Policy"
})
public class RestApi {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype
     * 
     */
    @JsonProperty("ApiKeySourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype")
    private java.lang.String apiKeySourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes
     * 
     */
    @JsonProperty("BinaryMediaTypes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes")
    private Set<java.lang.String> binaryMediaTypes = new LinkedHashSet<java.lang.String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body
     * 
     */
    @JsonProperty("Body")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body")
    private Body body;
    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html
     * 
     */
    @JsonProperty("BodyS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html")
    private S3Location bodyS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom
     * 
     */
    @JsonProperty("CloneFrom")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom")
    private java.lang.String cloneFrom;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description")
    private java.lang.String description;
    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonProperty("EndpointConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html")
    private EndpointConfiguration endpointConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings
     * 
     */
    @JsonProperty("FailOnWarnings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings")
    private Boolean failOnWarnings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize
     * 
     */
    @JsonProperty("MinimumCompressionSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize")
    private Integer minimumCompressionSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name")
    private java.lang.String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters")
    private Map<String, String> parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy
     * 
     */
    @JsonProperty("Policy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy")
    private Policy policy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype
     * 
     */
    @JsonProperty("ApiKeySourceType")
    public java.lang.String getApiKeySourceType() {
        return apiKeySourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype
     * 
     */
    @JsonProperty("ApiKeySourceType")
    public void setApiKeySourceType(java.lang.String apiKeySourceType) {
        this.apiKeySourceType = apiKeySourceType;
    }

    public RestApi withApiKeySourceType(java.lang.String apiKeySourceType) {
        this.apiKeySourceType = apiKeySourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes
     * 
     */
    @JsonProperty("BinaryMediaTypes")
    public Set<java.lang.String> getBinaryMediaTypes() {
        return binaryMediaTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes
     * 
     */
    @JsonProperty("BinaryMediaTypes")
    public void setBinaryMediaTypes(Set<java.lang.String> binaryMediaTypes) {
        this.binaryMediaTypes = binaryMediaTypes;
    }

    public RestApi withBinaryMediaTypes(Set<java.lang.String> binaryMediaTypes) {
        this.binaryMediaTypes = binaryMediaTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body
     * 
     */
    @JsonProperty("Body")
    public Body getBody() {
        return body;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body
     * 
     */
    @JsonProperty("Body")
    public void setBody(Body body) {
        this.body = body;
    }

    public RestApi withBody(Body body) {
        this.body = body;
        return this;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html
     * 
     */
    @JsonProperty("BodyS3Location")
    public S3Location getBodyS3Location() {
        return bodyS3Location;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html
     * 
     */
    @JsonProperty("BodyS3Location")
    public void setBodyS3Location(S3Location bodyS3Location) {
        this.bodyS3Location = bodyS3Location;
    }

    public RestApi withBodyS3Location(S3Location bodyS3Location) {
        this.bodyS3Location = bodyS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom
     * 
     */
    @JsonProperty("CloneFrom")
    public java.lang.String getCloneFrom() {
        return cloneFrom;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom
     * 
     */
    @JsonProperty("CloneFrom")
    public void setCloneFrom(java.lang.String cloneFrom) {
        this.cloneFrom = cloneFrom;
    }

    public RestApi withCloneFrom(java.lang.String cloneFrom) {
        this.cloneFrom = cloneFrom;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description
     * 
     */
    @JsonProperty("Description")
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public RestApi withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonProperty("EndpointConfiguration")
    public EndpointConfiguration getEndpointConfiguration() {
        return endpointConfiguration;
    }

    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonProperty("EndpointConfiguration")
    public void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    public RestApi withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings
     * 
     */
    @JsonProperty("FailOnWarnings")
    public Boolean getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings
     * 
     */
    @JsonProperty("FailOnWarnings")
    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    public RestApi withFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize
     * 
     */
    @JsonProperty("MinimumCompressionSize")
    public Integer getMinimumCompressionSize() {
        return minimumCompressionSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize
     * 
     */
    @JsonProperty("MinimumCompressionSize")
    public void setMinimumCompressionSize(Integer minimumCompressionSize) {
        this.minimumCompressionSize = minimumCompressionSize;
    }

    public RestApi withMinimumCompressionSize(Integer minimumCompressionSize) {
        this.minimumCompressionSize = minimumCompressionSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name
     * 
     */
    @JsonProperty("Name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name
     * 
     */
    @JsonProperty("Name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public RestApi withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters
     * 
     */
    @JsonProperty("Parameters")
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters
     * 
     */
    @JsonProperty("Parameters")
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public RestApi withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy
     * 
     */
    @JsonProperty("Policy")
    public Policy getPolicy() {
        return policy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy
     * 
     */
    @JsonProperty("Policy")
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public RestApi withPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("apiKeySourceType", apiKeySourceType).append("binaryMediaTypes", binaryMediaTypes).append("body", body).append("bodyS3Location", bodyS3Location).append("cloneFrom", cloneFrom).append("description", description).append("endpointConfiguration", endpointConfiguration).append("failOnWarnings", failOnWarnings).append("minimumCompressionSize", minimumCompressionSize).append("name", name).append("parameters", parameters).append("policy", policy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(binaryMediaTypes).append(apiKeySourceType).append(cloneFrom).append(minimumCompressionSize).append(description).append(body).append(failOnWarnings).append(bodyS3Location).append(endpointConfiguration).append(name).append(parameters).append(policy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestApi) == false) {
            return false;
        }
        RestApi rhs = ((RestApi) other);
        return new EqualsBuilder().append(binaryMediaTypes, rhs.binaryMediaTypes).append(apiKeySourceType, rhs.apiKeySourceType).append(cloneFrom, rhs.cloneFrom).append(minimumCompressionSize, rhs.minimumCompressionSize).append(description, rhs.description).append(body, rhs.body).append(failOnWarnings, rhs.failOnWarnings).append(bodyS3Location, rhs.bodyS3Location).append(endpointConfiguration, rhs.endpointConfiguration).append(name, rhs.name).append(parameters, rhs.parameters).append(policy, rhs.policy).isEquals();
    }

}
