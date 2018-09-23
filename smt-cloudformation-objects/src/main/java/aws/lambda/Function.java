
package aws.lambda;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Function
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "DeadLetterConfig",
    "Description",
    "Environment",
    "FunctionName",
    "Handler",
    "KmsKeyArn",
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
     * Code
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html")
    private Code code;
    /**
     * DeadLetterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
     * 
     */
    @JsonProperty("DeadLetterConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html")
    private DeadLetterConfig deadLetterConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description")
    private String description;
    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html")
    private Environment environment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname
     * 
     */
    @JsonProperty("FunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname")
    private String functionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler
     * 
     */
    @JsonProperty("Handler")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler")
    private String handler;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn")
    private String kmsKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
    @JsonProperty("MemorySize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize")
    private Integer memorySize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions
     * 
     */
    @JsonProperty("ReservedConcurrentExecutions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions")
    private Integer reservedConcurrentExecutions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role")
    private String role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime
     * 
     */
    @JsonProperty("Runtime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime")
    private String runtime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout")
    private Integer timeout;
    /**
     * TracingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
     * 
     */
    @JsonProperty("TracingConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html")
    private TracingConfig tracingConfig;
    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html")
    private VpcConfig vpcConfig;

    /**
     * Code
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
     * 
     */
    @JsonProperty("Code")
    public Code getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
     * 
     */
    @JsonProperty("Code")
    public void setCode(Code code) {
        this.code = code;
    }

    public Function withCode(Code code) {
        this.code = code;
        return this;
    }

    /**
     * DeadLetterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
     * 
     */
    @JsonProperty("DeadLetterConfig")
    public DeadLetterConfig getDeadLetterConfig() {
        return deadLetterConfig;
    }

    /**
     * DeadLetterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
     * 
     */
    @JsonProperty("DeadLetterConfig")
    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    public Function withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Function withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
    @JsonProperty("Environment")
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
    @JsonProperty("Environment")
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Function withEnvironment(Environment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname
     * 
     */
    @JsonProperty("FunctionName")
    public String getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname
     * 
     */
    @JsonProperty("FunctionName")
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Function withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler
     * 
     */
    @JsonProperty("Handler")
    public String getHandler() {
        return handler;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler
     * 
     */
    @JsonProperty("Handler")
    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Function withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    public Function withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
    @JsonProperty("MemorySize")
    public Integer getMemorySize() {
        return memorySize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
    @JsonProperty("MemorySize")
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public Function withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions
     * 
     */
    @JsonProperty("ReservedConcurrentExecutions")
    public Integer getReservedConcurrentExecutions() {
        return reservedConcurrentExecutions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions
     * 
     */
    @JsonProperty("ReservedConcurrentExecutions")
    public void setReservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
    }

    public Function withReservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role
     * 
     */
    @JsonProperty("Role")
    public String getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role
     * 
     */
    @JsonProperty("Role")
    public void setRole(String role) {
        this.role = role;
    }

    public Function withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime
     * 
     */
    @JsonProperty("Runtime")
    public String getRuntime() {
        return runtime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime
     * 
     */
    @JsonProperty("Runtime")
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public Function withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Function withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout
     * 
     */
    @JsonProperty("Timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout
     * 
     */
    @JsonProperty("Timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Function withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * TracingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
     * 
     */
    @JsonProperty("TracingConfig")
    public TracingConfig getTracingConfig() {
        return tracingConfig;
    }

    /**
     * TracingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
     * 
     */
    @JsonProperty("TracingConfig")
    public void setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    public Function withTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Function withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("deadLetterConfig", deadLetterConfig).append("description", description).append("environment", environment).append("functionName", functionName).append("handler", handler).append("kmsKeyArn", kmsKeyArn).append("memorySize", memorySize).append("reservedConcurrentExecutions", reservedConcurrentExecutions).append("role", role).append("runtime", runtime).append("tags", tags).append("timeout", timeout).append("tracingConfig", tracingConfig).append("vpcConfig", vpcConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(handler).append(code).append(role).append(functionName).append(kmsKeyArn).append(tracingConfig).append(description).append(runtime).append(deadLetterConfig).append(reservedConcurrentExecutions).append(timeout).append(tags).append(environment).append(memorySize).append(vpcConfig).toHashCode();
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
        return new EqualsBuilder().append(handler, rhs.handler).append(code, rhs.code).append(role, rhs.role).append(functionName, rhs.functionName).append(kmsKeyArn, rhs.kmsKeyArn).append(tracingConfig, rhs.tracingConfig).append(description, rhs.description).append(runtime, rhs.runtime).append(deadLetterConfig, rhs.deadLetterConfig).append(reservedConcurrentExecutions, rhs.reservedConcurrentExecutions).append(timeout, rhs.timeout).append(tags, rhs.tags).append(environment, rhs.environment).append(memorySize, rhs.memorySize).append(vpcConfig, rhs.vpcConfig).isEquals();
    }

}