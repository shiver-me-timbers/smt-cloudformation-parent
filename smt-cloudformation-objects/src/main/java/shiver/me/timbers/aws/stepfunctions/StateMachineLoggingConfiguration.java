
package shiver.me.timbers.aws.stepfunctions;

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
 * StateMachineLoggingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IncludeExecutionData",
    "Destinations",
    "Level"
})
public class StateMachineLoggingConfiguration implements Property<StateMachineLoggingConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-includeexecutiondata
     * 
     */
    @JsonProperty("IncludeExecutionData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-includeexecutiondata")
    private CharSequence includeExecutionData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-destinations
     * 
     */
    @JsonProperty("Destinations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-destinations")
    private List<Property<StateMachineLogDestination>> destinations = new ArrayList<Property<StateMachineLogDestination>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-level
     * 
     */
    @JsonProperty("Level")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-level")
    private CharSequence level;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-includeexecutiondata
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeExecutionData() {
        return includeExecutionData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-includeexecutiondata
     * 
     */
    @JsonIgnore
    public void setIncludeExecutionData(CharSequence includeExecutionData) {
        this.includeExecutionData = includeExecutionData;
    }

    public StateMachineLoggingConfiguration withIncludeExecutionData(CharSequence includeExecutionData) {
        this.includeExecutionData = includeExecutionData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-destinations
     * 
     */
    @JsonIgnore
    public List<Property<StateMachineLogDestination>> getDestinations() {
        return destinations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-destinations
     * 
     */
    @JsonIgnore
    public void setDestinations(List<Property<StateMachineLogDestination>> destinations) {
        this.destinations = destinations;
    }

    public StateMachineLoggingConfiguration withDestinations(List<Property<StateMachineLogDestination>> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-level
     * 
     */
    @JsonIgnore
    public CharSequence getLevel() {
        return level;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-level
     * 
     */
    @JsonIgnore
    public void setLevel(CharSequence level) {
        this.level = level;
    }

    public StateMachineLoggingConfiguration withLevel(CharSequence level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("includeExecutionData", includeExecutionData).append("destinations", destinations).append("level", level).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(includeExecutionData).append(level).append(destinations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateMachineLoggingConfiguration) == false) {
            return false;
        }
        StateMachineLoggingConfiguration rhs = ((StateMachineLoggingConfiguration) other);
        return new EqualsBuilder().append(includeExecutionData, rhs.includeExecutionData).append(level, rhs.level).append(destinations, rhs.destinations).isEquals();
    }

}
