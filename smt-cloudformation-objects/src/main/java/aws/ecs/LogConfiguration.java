
package aws.ecs;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LogConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LogDriver",
    "Options"
})
public class LogConfiguration {

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
    private Map<String, String> options;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver
     * 
     */
    public CharSequence getLogDriver() {
        return logDriver;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver
     * 
     */
    public void setLogDriver(CharSequence logDriver) {
        this.logDriver = logDriver;
    }

    public LogConfiguration withLogDriver(CharSequence logDriver) {
        this.logDriver = logDriver;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options
     * 
     */
    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public LogConfiguration withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("logDriver", logDriver).append("options", options).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logDriver).append(options).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogConfiguration) == false) {
            return false;
        }
        LogConfiguration rhs = ((LogConfiguration) other);
        return new EqualsBuilder().append(logDriver, rhs.logDriver).append(options, rhs.options).isEquals();
    }

}
