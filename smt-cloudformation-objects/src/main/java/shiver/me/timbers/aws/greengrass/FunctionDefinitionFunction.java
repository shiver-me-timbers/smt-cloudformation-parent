
package shiver.me.timbers.aws.greengrass;

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
 * FunctionDefinitionFunction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FunctionArn",
    "FunctionConfiguration",
    "Id"
})
public class FunctionDefinitionFunction implements Property<FunctionDefinitionFunction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionarn
     * 
     */
    @JsonProperty("FunctionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionarn")
    private CharSequence functionArn;
    /**
     * FunctionDefinitionVersionFunctionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html
     * 
     */
    @JsonProperty("FunctionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html")
    private Property<FunctionDefinitionFunctionConfiguration> functionConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-id")
    private CharSequence id;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionarn
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionArn() {
        return functionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionarn
     * 
     */
    @JsonIgnore
    public void setFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
    }

    public FunctionDefinitionFunction withFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
        return this;
    }

    /**
     * FunctionDefinitionVersionFunctionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionFunctionConfiguration> getFunctionConfiguration() {
        return functionConfiguration;
    }

    /**
     * FunctionDefinitionVersionFunctionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html
     * 
     */
    @JsonIgnore
    public void setFunctionConfiguration(Property<FunctionDefinitionFunctionConfiguration> functionConfiguration) {
        this.functionConfiguration = functionConfiguration;
    }

    public FunctionDefinitionFunction withFunctionConfiguration(Property<FunctionDefinitionFunctionConfiguration> functionConfiguration) {
        this.functionConfiguration = functionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public FunctionDefinitionFunction withId(CharSequence id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("functionArn", functionArn).append("functionConfiguration", functionConfiguration).append("id", id).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(functionConfiguration).append(functionArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionDefinitionFunction) == false) {
            return false;
        }
        FunctionDefinitionFunction rhs = ((FunctionDefinitionFunction) other);
        return new EqualsBuilder().append(id, rhs.id).append(functionConfiguration, rhs.functionConfiguration).append(functionArn, rhs.functionArn).isEquals();
    }

}
