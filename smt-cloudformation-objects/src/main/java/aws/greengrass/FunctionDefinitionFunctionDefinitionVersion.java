
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FunctionDefinitionFunctionDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DefaultConfig",
    "Functions"
})
public class FunctionDefinitionFunctionDefinitionVersion implements Property<FunctionDefinitionFunctionDefinitionVersion>
{

    /**
     * FunctionDefinitionVersionDefaultConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html
     * 
     */
    @JsonProperty("DefaultConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html")
    private Property<FunctionDefinitionDefaultConfig> defaultConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-functions
     * 
     */
    @JsonProperty("Functions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-functions")
    private List<Property<FunctionDefinitionFunction>> functions = new ArrayList<Property<FunctionDefinitionFunction>>();

    /**
     * FunctionDefinitionVersionDefaultConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionDefaultConfig> getDefaultConfig() {
        return defaultConfig;
    }

    /**
     * FunctionDefinitionVersionDefaultConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html
     * 
     */
    @JsonIgnore
    public void setDefaultConfig(Property<FunctionDefinitionDefaultConfig> defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    public FunctionDefinitionFunctionDefinitionVersion withDefaultConfig(Property<FunctionDefinitionDefaultConfig> defaultConfig) {
        this.defaultConfig = defaultConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-functions
     * 
     */
    @JsonIgnore
    public List<Property<FunctionDefinitionFunction>> getFunctions() {
        return functions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-functions
     * 
     */
    @JsonIgnore
    public void setFunctions(List<Property<FunctionDefinitionFunction>> functions) {
        this.functions = functions;
    }

    public FunctionDefinitionFunctionDefinitionVersion withFunctions(List<Property<FunctionDefinitionFunction>> functions) {
        this.functions = functions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultConfig", defaultConfig).append("functions", functions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(functions).append(defaultConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionDefinitionFunctionDefinitionVersion) == false) {
            return false;
        }
        FunctionDefinitionFunctionDefinitionVersion rhs = ((FunctionDefinitionFunctionDefinitionVersion) other);
        return new EqualsBuilder().append(functions, rhs.functions).append(defaultConfig, rhs.defaultConfig).isEquals();
    }

}
