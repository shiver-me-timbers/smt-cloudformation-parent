
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
 * LoggerDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LoggerDefinitionId",
    "Loggers"
})
public class LoggerDefinitionVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid
     * 
     */
    @JsonProperty("LoggerDefinitionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid")
    private CharSequence loggerDefinitionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers
     * 
     */
    @JsonProperty("Loggers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers")
    private List<Property<LoggerDefinitionVersionLogger>> loggers = new ArrayList<Property<LoggerDefinitionVersionLogger>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid
     * 
     */
    @JsonIgnore
    public CharSequence getLoggerDefinitionId() {
        return loggerDefinitionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid
     * 
     */
    @JsonIgnore
    public void setLoggerDefinitionId(CharSequence loggerDefinitionId) {
        this.loggerDefinitionId = loggerDefinitionId;
    }

    public LoggerDefinitionVersion withLoggerDefinitionId(CharSequence loggerDefinitionId) {
        this.loggerDefinitionId = loggerDefinitionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers
     * 
     */
    @JsonIgnore
    public List<Property<LoggerDefinitionVersionLogger>> getLoggers() {
        return loggers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers
     * 
     */
    @JsonIgnore
    public void setLoggers(List<Property<LoggerDefinitionVersionLogger>> loggers) {
        this.loggers = loggers;
    }

    public LoggerDefinitionVersion withLoggers(List<Property<LoggerDefinitionVersionLogger>> loggers) {
        this.loggers = loggers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("loggerDefinitionId", loggerDefinitionId).append("loggers", loggers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(loggers).append(loggerDefinitionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoggerDefinitionVersion) == false) {
            return false;
        }
        LoggerDefinitionVersion rhs = ((LoggerDefinitionVersion) other);
        return new EqualsBuilder().append(loggers, rhs.loggers).append(loggerDefinitionId, rhs.loggerDefinitionId).isEquals();
    }

}
