
package aws.lambda;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Alias
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "FunctionName",
    "FunctionVersion",
    "Name",
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
     * AliasRoutingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
     * 
     */
    @JsonProperty("RoutingConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html")
    private AliasRoutingConfiguration routingConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description
     * 
     */
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
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname
     * 
     */
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
    public CharSequence getFunctionVersion() {
        return functionVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion
     * 
     */
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
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Alias withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * AliasRoutingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
     * 
     */
    public AliasRoutingConfiguration getRoutingConfig() {
        return routingConfig;
    }

    /**
     * AliasRoutingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html
     * 
     */
    public void setRoutingConfig(AliasRoutingConfiguration routingConfig) {
        this.routingConfig = routingConfig;
    }

    public Alias withRoutingConfig(AliasRoutingConfiguration routingConfig) {
        this.routingConfig = routingConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("functionName", functionName).append("functionVersion", functionVersion).append("name", name).append("routingConfig", routingConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(functionVersion).append(functionName).append(routingConfig).toHashCode();
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
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(functionVersion, rhs.functionVersion).append(functionName, rhs.functionName).append(routingConfig, rhs.routingConfig).isEquals();
    }

}
