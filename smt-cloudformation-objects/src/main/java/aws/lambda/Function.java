
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
    private CharSequence description;
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
    public Code getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
     * 
     */
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
    public DeadLetterConfig getDeadLetterConfig() {
        return deadLetterConfig;
    }

    /**
     * DeadLetterConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
     * 
     */
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
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Function withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html
     * 
     */
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
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname
     * 
     */
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
    public CharSequence getHandler() {
        return handler;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler
     * 
     */
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
    public CharSequence getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn
     * 
     */
    public void setKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    public Function withKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
    public Integer getMemorySize() {
        return memorySize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize
     * 
     */
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
    public Integer getReservedConcurrentExecutions() {
        return reservedConcurrentExecutions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions
     * 
     */
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
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role
     * 
     */
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
    public CharSequence getRuntime() {
        return runtime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime
     * 
     */
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
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags
     * 
     */
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
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout
     * 
     */
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
    public TracingConfig getTracingConfig() {
        return tracingConfig;
    }

    /**
     * TracingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html
     * 
     */
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
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
     * 
     */
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
