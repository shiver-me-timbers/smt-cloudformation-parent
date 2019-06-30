
package aws.lambda;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
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
 * Function
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Code",
    "DeadLetterConfig",
    "Description",
    "Environment",
    "FunctionName",
    "Handler",
    "KmsKeyArn",
    "Layers",
    "MemorySize",
    "ReservedConcurrentExecutions",
    "Role",
    "Runtime",
    "Tags",
    "Timeout",
    "TracingConfig",
    "VpcConfig"
})
public class Function {

    /**
     * FunctionCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html")
    private Property<FunctionCode> code;
    /**
     * FunctionDeadLetterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
     * 
     */
    @JsonProperty("DeadLetterConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html")
    private Property<FunctionDeadLetterConfig> deadLetterConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description")
    private CharSequence description;
    /**
     * FunctionEnvironment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html")
    private Property<FunctionEnvironment> environment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname
     * 
     */
    @JsonProperty("FunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname")
    private CharSequence functionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler
     * 
     */
    @JsonProperty("Handler")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler")
    private CharSequence handler;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn")
    private CharSequence kmsKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers
     * 
     */
    @JsonProperty("Layers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers")
    private Set<CharSequence> layers = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
    @JsonProperty("MemorySize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize")
    private Number memorySize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions
     * 
     */
    @JsonProperty("ReservedConcurrentExecutions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions")
    private Number reservedConcurrentExecutions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role")
    private CharSequence role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime
     * 
     */
    @JsonProperty("Runtime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime")
    private CharSequence runtime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout")
    private Number timeout;
    /**
     * FunctionTracingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
     * 
     */
    @JsonProperty("TracingConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html")
    private Property<FunctionTracingConfig> tracingConfig;
    /**
     * FunctionVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html")
    private Property<FunctionVpcConfig> vpcConfig;

    /**
     * FunctionCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
     * 
     */
    @JsonIgnore
    public Property<FunctionCode> getCode() {
        return code;
    }

    /**
     * FunctionCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
     * 
     */
    @JsonIgnore
    public void setCode(Property<FunctionCode> code) {
        this.code = code;
    }

    public Function withCode(Property<FunctionCode> code) {
        this.code = code;
        return this;
    }

    /**
     * FunctionDeadLetterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
     * 
     */
    @JsonIgnore
    public Property<FunctionDeadLetterConfig> getDeadLetterConfig() {
        return deadLetterConfig;
    }

    /**
     * FunctionDeadLetterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
     * 
     */
    @JsonIgnore
    public void setDeadLetterConfig(Property<FunctionDeadLetterConfig> deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    public Function withDeadLetterConfig(Property<FunctionDeadLetterConfig> deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Function withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * FunctionEnvironment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
    @JsonIgnore
    public Property<FunctionEnvironment> getEnvironment() {
        return environment;
    }

    /**
     * FunctionEnvironment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
    @JsonIgnore
    public void setEnvironment(Property<FunctionEnvironment> environment) {
        this.environment = environment;
    }

    public Function withEnvironment(Property<FunctionEnvironment> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname
     * 
     */
    @JsonIgnore
    public void setFunctionName(CharSequence functionName) {
        this.functionName = functionName;
    }

    public Function withFunctionName(CharSequence functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler
     * 
     */
    @JsonIgnore
    public CharSequence getHandler() {
        return handler;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler
     * 
     */
    @JsonIgnore
    public void setHandler(CharSequence handler) {
        this.handler = handler;
    }

    public Function withHandler(CharSequence handler) {
        this.handler = handler;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn
     * 
     */
    @JsonIgnore
    public void setKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    public Function withKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getLayers() {
        return layers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers
     * 
     */
    @JsonIgnore
    public void setLayers(Set<CharSequence> layers) {
        this.layers = layers;
    }

    public Function withLayers(Set<CharSequence> layers) {
        this.layers = layers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
    @JsonIgnore
    public Number getMemorySize() {
        return memorySize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
    @JsonIgnore
    public void setMemorySize(Number memorySize) {
        this.memorySize = memorySize;
    }

    public Function withMemorySize(Number memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions
     * 
     */
    @JsonIgnore
    public Number getReservedConcurrentExecutions() {
        return reservedConcurrentExecutions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions
     * 
     */
    @JsonIgnore
    public void setReservedConcurrentExecutions(Number reservedConcurrentExecutions) {
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
    }

    public Function withReservedConcurrentExecutions(Number reservedConcurrentExecutions) {
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role
     * 
     */
    @JsonIgnore
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role
     * 
     */
    @JsonIgnore
    public void setRole(CharSequence role) {
        this.role = role;
    }

    public Function withRole(CharSequence role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime
     * 
     */
    @JsonIgnore
    public CharSequence getRuntime() {
        return runtime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime
     * 
     */
    @JsonIgnore
    public void setRuntime(CharSequence runtime) {
        this.runtime = runtime;
    }

    public Function withRuntime(CharSequence runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Function withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout
     * 
     */
    @JsonIgnore
    public Number getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout
     * 
     */
    @JsonIgnore
    public void setTimeout(Number timeout) {
        this.timeout = timeout;
    }

    public Function withTimeout(Number timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * FunctionTracingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
     * 
     */
    @JsonIgnore
    public Property<FunctionTracingConfig> getTracingConfig() {
        return tracingConfig;
    }

    /**
     * FunctionTracingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
     * 
     */
    @JsonIgnore
    public void setTracingConfig(Property<FunctionTracingConfig> tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    public Function withTracingConfig(Property<FunctionTracingConfig> tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }

    /**
     * FunctionVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
     * 
     */
    @JsonIgnore
    public Property<FunctionVpcConfig> getVpcConfig() {
        return vpcConfig;
    }

    /**
     * FunctionVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
     * 
     */
    @JsonIgnore
    public void setVpcConfig(Property<FunctionVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Function withVpcConfig(Property<FunctionVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("deadLetterConfig", deadLetterConfig).append("description", description).append("environment", environment).append("functionName", functionName).append("handler", handler).append("kmsKeyArn", kmsKeyArn).append("layers", layers).append("memorySize", memorySize).append("reservedConcurrentExecutions", reservedConcurrentExecutions).append("role", role).append("runtime", runtime).append("tags", tags).append("timeout", timeout).append("tracingConfig", tracingConfig).append("vpcConfig", vpcConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(handler).append(code).append(role).append(functionName).append(kmsKeyArn).append(tracingConfig).append(description).append(runtime).append(deadLetterConfig).append(reservedConcurrentExecutions).append(timeout).append(tags).append(environment).append(memorySize).append(vpcConfig).append(layers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Function) == false) {
            return false;
        }
        Function rhs = ((Function) other);
        return new EqualsBuilder().append(handler, rhs.handler).append(code, rhs.code).append(role, rhs.role).append(functionName, rhs.functionName).append(kmsKeyArn, rhs.kmsKeyArn).append(tracingConfig, rhs.tracingConfig).append(description, rhs.description).append(runtime, rhs.runtime).append(deadLetterConfig, rhs.deadLetterConfig).append(reservedConcurrentExecutions, rhs.reservedConcurrentExecutions).append(timeout, rhs.timeout).append(tags, rhs.tags).append(environment, rhs.environment).append(memorySize, rhs.memorySize).append(vpcConfig, rhs.vpcConfig).append(layers, rhs.layers).isEquals();
    }

}
