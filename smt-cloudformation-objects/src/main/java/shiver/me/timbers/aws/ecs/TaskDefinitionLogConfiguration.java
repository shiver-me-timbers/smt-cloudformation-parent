
package shiver.me.timbers.aws.ecs;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TaskDefinitionLogConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LogDriver",
    "Options",
    "SecretOptions"
})
public class TaskDefinitionLogConfiguration implements Property<TaskDefinitionLogConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver
     * 
     */
    @JsonProperty("LogDriver")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver")
    private CharSequence logDriver;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options
     * 
     */
    @JsonProperty("Options")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options")
    private Map<String, CharSequence> options;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-secretoptions
     * 
     */
    @JsonProperty("SecretOptions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-secretoptions")
    private Set<Property<TaskDefinitionSecret>> secretOptions = new LinkedHashSet<Property<TaskDefinitionSecret>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver
     * 
     */
    @JsonIgnore
    public CharSequence getLogDriver() {
        return logDriver;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver
     * 
     */
    @JsonIgnore
    public void setLogDriver(CharSequence logDriver) {
        this.logDriver = logDriver;
    }

    public TaskDefinitionLogConfiguration withLogDriver(CharSequence logDriver) {
        this.logDriver = logDriver;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getOptions() {
        return options;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options
     * 
     */
    @JsonIgnore
    public void setOptions(Map<String, CharSequence> options) {
        this.options = options;
    }

    public TaskDefinitionLogConfiguration withOptions(Map<String, CharSequence> options) {
        this.options = options;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-secretoptions
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionSecret>> getSecretOptions() {
        return secretOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-secretoptions
     * 
     */
    @JsonIgnore
    public void setSecretOptions(Set<Property<TaskDefinitionSecret>> secretOptions) {
        this.secretOptions = secretOptions;
    }

    public TaskDefinitionLogConfiguration withSecretOptions(Set<Property<TaskDefinitionSecret>> secretOptions) {
        this.secretOptions = secretOptions;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("logDriver", logDriver).append("options", options).append("secretOptions", secretOptions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logDriver).append(options).append(secretOptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionLogConfiguration) == false) {
            return false;
        }
        TaskDefinitionLogConfiguration rhs = ((TaskDefinitionLogConfiguration) other);
        return new EqualsBuilder().append(logDriver, rhs.logDriver).append(options, rhs.options).append(secretOptions, rhs.secretOptions).isEquals();
    }

}
