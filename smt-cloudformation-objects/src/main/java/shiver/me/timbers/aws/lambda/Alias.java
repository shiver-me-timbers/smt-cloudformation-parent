
package shiver.me.timbers.aws.lambda;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Alias
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "FunctionName",
    "FunctionVersion",
    "Name",
    "ProvisionedConcurrencyConfig",
    "RoutingConfig"
})
public class Alias {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname
     * 
     */
    @JsonProperty("FunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname")
    private CharSequence functionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion
     * 
     */
    @JsonProperty("FunctionVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion")
    private CharSequence functionVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name")
    private CharSequence name;
    /**
     * AliasProvisionedConcurrencyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html
     * 
     */
    @JsonProperty("ProvisionedConcurrencyConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html")
    private Property<AliasProvisionedConcurrencyConfiguration> provisionedConcurrencyConfig;
    /**
     * AliasAliasRoutingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
     * 
     */
    @JsonProperty("RoutingConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html")
    private Property<AliasAliasRoutingConfiguration> routingConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Alias withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname
     * 
     */
    @JsonIgnore
    public void setFunctionName(CharSequence functionName) {
        this.functionName = functionName;
    }

    public Alias withFunctionName(CharSequence functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionVersion() {
        return functionVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion
     * 
     */
    @JsonIgnore
    public void setFunctionVersion(CharSequence functionVersion) {
        this.functionVersion = functionVersion;
    }

    public Alias withFunctionVersion(CharSequence functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Alias withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * AliasProvisionedConcurrencyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<AliasProvisionedConcurrencyConfiguration> getProvisionedConcurrencyConfig() {
        return provisionedConcurrencyConfig;
    }

    /**
     * AliasProvisionedConcurrencyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html
     * 
     */
    @JsonIgnore
    public void setProvisionedConcurrencyConfig(Property<AliasProvisionedConcurrencyConfiguration> provisionedConcurrencyConfig) {
        this.provisionedConcurrencyConfig = provisionedConcurrencyConfig;
    }

    public Alias withProvisionedConcurrencyConfig(Property<AliasProvisionedConcurrencyConfiguration> provisionedConcurrencyConfig) {
        this.provisionedConcurrencyConfig = provisionedConcurrencyConfig;
        return this;
    }

    /**
     * AliasAliasRoutingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<AliasAliasRoutingConfiguration> getRoutingConfig() {
        return routingConfig;
    }

    /**
     * AliasAliasRoutingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
     * 
     */
    @JsonIgnore
    public void setRoutingConfig(Property<AliasAliasRoutingConfiguration> routingConfig) {
        this.routingConfig = routingConfig;
    }

    public Alias withRoutingConfig(Property<AliasAliasRoutingConfiguration> routingConfig) {
        this.routingConfig = routingConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("functionName", functionName).append("functionVersion", functionVersion).append("name", name).append("provisionedConcurrencyConfig", provisionedConcurrencyConfig).append("routingConfig", routingConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(provisionedConcurrencyConfig).append(functionVersion).append(functionName).append(name).append(description).append(routingConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alias) == false) {
            return false;
        }
        Alias rhs = ((Alias) other);
        return new EqualsBuilder().append(provisionedConcurrencyConfig, rhs.provisionedConcurrencyConfig).append(functionVersion, rhs.functionVersion).append(functionName, rhs.functionName).append(name, rhs.name).append(description, rhs.description).append(routingConfig, rhs.routingConfig).isEquals();
    }

}
