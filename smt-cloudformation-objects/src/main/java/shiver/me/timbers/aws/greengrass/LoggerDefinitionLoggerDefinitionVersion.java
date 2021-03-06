
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
 * LoggerDefinitionLoggerDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Loggers"
})
public class LoggerDefinitionLoggerDefinitionVersion implements Property<LoggerDefinitionLoggerDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html#cfn-greengrass-loggerdefinition-loggerdefinitionversion-loggers
     * 
     */
    @JsonProperty("Loggers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html#cfn-greengrass-loggerdefinition-loggerdefinitionversion-loggers")
    private List<Property<LoggerDefinitionLogger>> loggers = new ArrayList<Property<LoggerDefinitionLogger>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html#cfn-greengrass-loggerdefinition-loggerdefinitionversion-loggers
     * 
     */
    @JsonIgnore
    public List<Property<LoggerDefinitionLogger>> getLoggers() {
        return loggers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html#cfn-greengrass-loggerdefinition-loggerdefinitionversion-loggers
     * 
     */
    @JsonIgnore
    public void setLoggers(List<Property<LoggerDefinitionLogger>> loggers) {
        this.loggers = loggers;
    }

    public LoggerDefinitionLoggerDefinitionVersion withLoggers(List<Property<LoggerDefinitionLogger>> loggers) {
        this.loggers = loggers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("loggers", loggers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(loggers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoggerDefinitionLoggerDefinitionVersion) == false) {
            return false;
        }
        LoggerDefinitionLoggerDefinitionVersion rhs = ((LoggerDefinitionLoggerDefinitionVersion) other);
        return new EqualsBuilder().append(loggers, rhs.loggers).isEquals();
    }

}
