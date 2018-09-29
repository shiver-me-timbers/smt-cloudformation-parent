
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
    private CharSequence apiKeySourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes
     * 
     */
    @JsonProperty("BinaryMediaTypes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes")
    private Set<CharSequence> binaryMediaTypes = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body
     * 
     */
    @JsonProperty("Body")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body")
    private Object body;
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
    private CharSequence cloneFrom;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description")
    private CharSequence description;
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
    private CharSequence name;
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
    private Object policy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype
     * 
     */
    public CharSequence getApiKeySourceType() {
        return apiKeySourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype
     * 
     */
    public void setApiKeySourceType(CharSequence apiKeySourceType) {
        this.apiKeySourceType = apiKeySourceType;
    }

    public RestApi withApiKeySourceType(CharSequence apiKeySourceType) {
        this.apiKeySourceType = apiKeySourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes
     * 
     */
    public Set<CharSequence> getBinaryMediaTypes() {
        return binaryMediaTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes
     * 
     */
    public void setBinaryMediaTypes(Set<CharSequence> binaryMediaTypes) {
        this.binaryMediaTypes = binaryMediaTypes;
    }

    public RestApi withBinaryMediaTypes(Set<CharSequence> binaryMediaTypes) {
        this.binaryMediaTypes = binaryMediaTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body
     * 
     */
    public Object getBody() {
        return body;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body
     * 
     */
    public void setBody(Object body) {
        this.body = body;
    }

    public RestApi withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html
     * 
     */
    public S3Location getBodyS3Location() {
        return bodyS3Location;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html
     * 
     */
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
    public CharSequence getCloneFrom() {
        return cloneFrom;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom
     * 
     */
    public void setCloneFrom(CharSequence cloneFrom) {
        this.cloneFrom = cloneFrom;
    }

    public RestApi withCloneFrom(CharSequence cloneFrom) {
        this.cloneFrom = cloneFrom;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public RestApi withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    public EndpointConfiguration getEndpointConfiguration() {
        return endpointConfiguration;
    }

    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
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
    public Boolean getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings
     * 
     */
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
    public Integer getMinimumCompressionSize() {
        return minimumCompressionSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize
     * 
     */
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
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RestApi withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters
     * 
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters
     * 
     */
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
    public Object getPolicy() {
        return policy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy
     * 
     */
    public void setPolicy(Object policy) {
        this.policy = policy;
    }

    public RestApi withPolicy(Object policy) {
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
