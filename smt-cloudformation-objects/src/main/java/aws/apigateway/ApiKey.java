
package aws.apigateway;

import java.util.LinkedHashSet;
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
 * ApiKey
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustomerId",
    "Description",
    "Enabled",
    "GenerateDistinctId",
    "Name",
    "StageKeys"
})
public class ApiKey {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid
     * 
     */
    @JsonProperty("CustomerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid")
    private CharSequence customerId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid
     * 
     */
    @JsonProperty("GenerateDistinctId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid")
    private Boolean generateDistinctId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys
     * 
     */
    @JsonProperty("StageKeys")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys")
    private Set<StageKey> stageKeys = new LinkedHashSet<StageKey>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid
     * 
     */
    public CharSequence getCustomerId() {
        return customerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid
     * 
     */
    public void setCustomerId(CharSequence customerId) {
        this.customerId = customerId;
    }

    public ApiKey withCustomerId(CharSequence customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ApiKey withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ApiKey withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid
     * 
     */
    public Boolean getGenerateDistinctId() {
        return generateDistinctId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid
     * 
     */
    public void setGenerateDistinctId(Boolean generateDistinctId) {
        this.generateDistinctId = generateDistinctId;
    }

    public ApiKey withGenerateDistinctId(Boolean generateDistinctId) {
        this.generateDistinctId = generateDistinctId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ApiKey withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys
     * 
     */
    public Set<StageKey> getStageKeys() {
        return stageKeys;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys
     * 
     */
    public void setStageKeys(Set<StageKey> stageKeys) {
        this.stageKeys = stageKeys;
    }

    public ApiKey withStageKeys(Set<StageKey> stageKeys) {
        this.stageKeys = stageKeys;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerId", customerId).append("description", description).append("enabled", enabled).append("generateDistinctId", generateDistinctId).append("name", name).append("stageKeys", stageKeys).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(generateDistinctId).append(customerId).append(name).append(description).append(stageKeys).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiKey) == false) {
            return false;
        }
        ApiKey rhs = ((ApiKey) other);
        return new EqualsBuilder().append(generateDistinctId, rhs.generateDistinctId).append(customerId, rhs.customerId).append(name, rhs.name).append(description, rhs.description).append(stageKeys, rhs.stageKeys).append(enabled, rhs.enabled).isEquals();
    }

}
