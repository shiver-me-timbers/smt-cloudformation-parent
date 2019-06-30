
package aws.greengrass;

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
 * FunctionDefinitionVersionFunctionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MemorySize",
    "Pinned",
    "ExecArgs",
    "Timeout",
    "EncodingType",
    "Environment",
    "Executable"
})
public class FunctionDefinitionVersionFunctionConfiguration implements Property<FunctionDefinitionVersionFunctionConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-memorysize
     * 
     */
    @JsonProperty("MemorySize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-memorysize")
    private Number memorySize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-pinned
     * 
     */
    @JsonProperty("Pinned")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-pinned")
    private CharSequence pinned;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-execargs
     * 
     */
    @JsonProperty("ExecArgs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-execargs")
    private CharSequence execArgs;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-timeout")
    private Number timeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-encodingtype
     * 
     */
    @JsonProperty("EncodingType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-encodingtype")
    private CharSequence encodingType;
    /**
     * FunctionDefinitionVersionEnvironment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html")
    private Property<FunctionDefinitionVersionEnvironment> environment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-executable
     * 
     */
    @JsonProperty("Executable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-executable")
    private CharSequence executable;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-memorysize
     * 
     */
    @JsonIgnore
    public Number getMemorySize() {
        return memorySize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-memorysize
     * 
     */
    @JsonIgnore
    public void setMemorySize(Number memorySize) {
        this.memorySize = memorySize;
    }

    public FunctionDefinitionVersionFunctionConfiguration withMemorySize(Number memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-pinned
     * 
     */
    @JsonIgnore
    public CharSequence getPinned() {
        return pinned;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-pinned
     * 
     */
    @JsonIgnore
    public void setPinned(CharSequence pinned) {
        this.pinned = pinned;
    }

    public FunctionDefinitionVersionFunctionConfiguration withPinned(CharSequence pinned) {
        this.pinned = pinned;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-execargs
     * 
     */
    @JsonIgnore
    public CharSequence getExecArgs() {
        return execArgs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-execargs
     * 
     */
    @JsonIgnore
    public void setExecArgs(CharSequence execArgs) {
        this.execArgs = execArgs;
    }

    public FunctionDefinitionVersionFunctionConfiguration withExecArgs(CharSequence execArgs) {
        this.execArgs = execArgs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-timeout
     * 
     */
    @JsonIgnore
    public Number getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-timeout
     * 
     */
    @JsonIgnore
    public void setTimeout(Number timeout) {
        this.timeout = timeout;
    }

    public FunctionDefinitionVersionFunctionConfiguration withTimeout(Number timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-encodingtype
     * 
     */
    @JsonIgnore
    public CharSequence getEncodingType() {
        return encodingType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-encodingtype
     * 
     */
    @JsonIgnore
    public void setEncodingType(CharSequence encodingType) {
        this.encodingType = encodingType;
    }

    public FunctionDefinitionVersionFunctionConfiguration withEncodingType(CharSequence encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * FunctionDefinitionVersionEnvironment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDefinitionVersionEnvironment> getEnvironment() {
        return environment;
    }

    /**
     * FunctionDefinitionVersionEnvironment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html
     * 
     */
    @JsonIgnore
    public void setEnvironment(Property<FunctionDefinitionVersionEnvironment> environment) {
        this.environment = environment;
    }

    public FunctionDefinitionVersionFunctionConfiguration withEnvironment(Property<FunctionDefinitionVersionEnvironment> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-executable
     * 
     */
    @JsonIgnore
    public CharSequence getExecutable() {
        return executable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-executable
     * 
     */
    @JsonIgnore
    public void setExecutable(CharSequence executable) {
        this.executable = executable;
    }

    public FunctionDefinitionVersionFunctionConfiguration withExecutable(CharSequence executable) {
        this.executable = executable;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("memorySize", memorySize).append("pinned", pinned).append("execArgs", execArgs).append("timeout", timeout).append("encodingType", encodingType).append("environment", environment).append("executable", executable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(execArgs).append(pinned).append(environment).append(memorySize).append(encodingType).append(timeout).append(executable).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionDefinitionVersionFunctionConfiguration) == false) {
            return false;
        }
        FunctionDefinitionVersionFunctionConfiguration rhs = ((FunctionDefinitionVersionFunctionConfiguration) other);
        return new EqualsBuilder().append(execArgs, rhs.execArgs).append(pinned, rhs.pinned).append(environment, rhs.environment).append(memorySize, rhs.memorySize).append(encodingType, rhs.encodingType).append(timeout, rhs.timeout).append(executable, rhs.executable).isEquals();
    }

}
