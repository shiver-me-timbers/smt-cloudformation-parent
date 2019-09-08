
package shiver.me.timbers.aws.greengrass;

import java.util.ArrayList;
import java.util.List;
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
 * FunctionDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DefaultConfig",
    "Functions",
    "FunctionDefinitionId"
})
public class FunctionDefinitionVersion {

    /**
     * FunctionDefinitionVersionDefaultConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html
     * 
     */
    @JsonProperty("DefaultConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html")
    private Property<FunctionDefinitionVersionDefaultConfig> defaultConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions
     * 
     */
    @JsonProperty("Functions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions")
    private List<Property<FunctionDefinitionVersionFunction>> functions = new ArrayList<Property<FunctionDefinitionVersionFunction>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid
     * 
     */
    @JsonProperty("FunctionDefinitionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid")
    private CharSequence functionDefinitionId;

    /**
     * FunctionDefinitionVersionDefaultConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionVersionDefaultConfig> getDefaultConfig() {
        return defaultConfig;
    }

    /**
     * FunctionDefinitionVersionDefaultConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html
     * 
     */
    @JsonIgnore
    public void setDefaultConfig(Property<FunctionDefinitionVersionDefaultConfig> defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    public FunctionDefinitionVersion withDefaultConfig(Property<FunctionDefinitionVersionDefaultConfig> defaultConfig) {
        this.defaultConfig = defaultConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions
     * 
     */
    @JsonIgnore
    public List<Property<FunctionDefinitionVersionFunction>> getFunctions() {
        return functions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions
     * 
     */
    @JsonIgnore
    public void setFunctions(List<Property<FunctionDefinitionVersionFunction>> functions) {
        this.functions = functions;
    }

    public FunctionDefinitionVersion withFunctions(List<Property<FunctionDefinitionVersionFunction>> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionDefinitionId() {
        return functionDefinitionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid
     * 
     */
    @JsonIgnore
    public void setFunctionDefinitionId(CharSequence functionDefinitionId) {
        this.functionDefinitionId = functionDefinitionId;
    }

    public FunctionDefinitionVersion withFunctionDefinitionId(CharSequence functionDefinitionId) {
        this.functionDefinitionId = functionDefinitionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultConfig", defaultConfig).append("functions", functions).append("functionDefinitionId", functionDefinitionId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(functionDefinitionId).append(functions).append(defaultConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionDefinitionVersion) == false) {
            return false;
        }
        FunctionDefinitionVersion rhs = ((FunctionDefinitionVersion) other);
        return new EqualsBuilder().append(functionDefinitionId, rhs.functionDefinitionId).append(functions, rhs.functions).append(defaultConfig, rhs.defaultConfig).isEquals();
    }

}
