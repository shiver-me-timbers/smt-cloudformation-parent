
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
 * StateMachine
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DefinitionString",
    "LoggingConfiguration",
    "DefinitionSubstitutions",
    "DefinitionS3Location",
    "StateMachineName",
    "RoleArn",
    "Tags",
    "StateMachineType"
})
public class StateMachine {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring
     * 
     */
    @JsonProperty("DefinitionString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring")
    private CharSequence definitionString;
    /**
     * StateMachineLoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html
     * 
     */
    @JsonProperty("LoggingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html")
    private Property<StateMachineLoggingConfiguration> loggingConfiguration;
    /**
     * StateMachineDefinitionSubstitutions
     * <p>
     * 
     * 
     */
    @JsonProperty("DefinitionSubstitutions")
    private Object definitionSubstitutions;
    /**
     * StateMachineS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html
     * 
     */
    @JsonProperty("DefinitionS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html")
    private Property<StateMachineS3Location> definitionS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename
     * 
     */
    @JsonProperty("StateMachineName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename")
    private CharSequence stateMachineName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags")
    private List<Property<StateMachineTagsEntry>> tags = new ArrayList<Property<StateMachineTagsEntry>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinetype
     * 
     */
    @JsonProperty("StateMachineType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinetype")
    private CharSequence stateMachineType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring
     * 
     */
    @JsonIgnore
    public CharSequence getDefinitionString() {
        return definitionString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring
     * 
     */
    @JsonIgnore
    public void setDefinitionString(CharSequence definitionString) {
        this.definitionString = definitionString;
    }

    public StateMachine withDefinitionString(CharSequence definitionString) {
        this.definitionString = definitionString;
        return this;
    }

    /**
     * StateMachineLoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<StateMachineLoggingConfiguration> getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * StateMachineLoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html
     * 
     */
    @JsonIgnore
    public void setLoggingConfiguration(Property<StateMachineLoggingConfiguration> loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    public StateMachine withLoggingConfiguration(Property<StateMachineLoggingConfiguration> loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }

    /**
     * StateMachineDefinitionSubstitutions
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public Object getDefinitionSubstitutions() {
        return definitionSubstitutions;
    }

    /**
     * StateMachineDefinitionSubstitutions
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public void setDefinitionSubstitutions(Object definitionSubstitutions) {
        this.definitionSubstitutions = definitionSubstitutions;
    }

    public StateMachine withDefinitionSubstitutions(Object definitionSubstitutions) {
        this.definitionSubstitutions = definitionSubstitutions;
        return this;
    }

    /**
     * StateMachineS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html
     * 
     */
    @JsonIgnore
    public Property<StateMachineS3Location> getDefinitionS3Location() {
        return definitionS3Location;
    }

    /**
     * StateMachineS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html
     * 
     */
    @JsonIgnore
    public void setDefinitionS3Location(Property<StateMachineS3Location> definitionS3Location) {
        this.definitionS3Location = definitionS3Location;
    }

    public StateMachine withDefinitionS3Location(Property<StateMachineS3Location> definitionS3Location) {
        this.definitionS3Location = definitionS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename
     * 
     */
    @JsonIgnore
    public CharSequence getStateMachineName() {
        return stateMachineName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename
     * 
     */
    @JsonIgnore
    public void setStateMachineName(CharSequence stateMachineName) {
        this.stateMachineName = stateMachineName;
    }

    public StateMachine withStateMachineName(CharSequence stateMachineName) {
        this.stateMachineName = stateMachineName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public StateMachine withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags
     * 
     */
    @JsonIgnore
    public List<Property<StateMachineTagsEntry>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<StateMachineTagsEntry>> tags) {
        this.tags = tags;
    }

    public StateMachine withTags(List<Property<StateMachineTagsEntry>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinetype
     * 
     */
    @JsonIgnore
    public CharSequence getStateMachineType() {
        return stateMachineType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinetype
     * 
     */
    @JsonIgnore
    public void setStateMachineType(CharSequence stateMachineType) {
        this.stateMachineType = stateMachineType;
    }

    public StateMachine withStateMachineType(CharSequence stateMachineType) {
        this.stateMachineType = stateMachineType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("definitionString", definitionString).append("loggingConfiguration", loggingConfiguration).append("definitionSubstitutions", definitionSubstitutions).append("definitionS3Location", definitionS3Location).append("stateMachineName", stateMachineName).append("roleArn", roleArn).append("tags", tags).append("stateMachineType", stateMachineType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(definitionS3Location).append(stateMachineName).append(roleArn).append(definitionString).append(stateMachineType).append(loggingConfiguration).append(definitionSubstitutions).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateMachine) == false) {
            return false;
        }
        StateMachine rhs = ((StateMachine) other);
        return new EqualsBuilder().append(definitionS3Location, rhs.definitionS3Location).append(stateMachineName, rhs.stateMachineName).append(roleArn, rhs.roleArn).append(definitionString, rhs.definitionString).append(stateMachineType, rhs.stateMachineType).append(loggingConfiguration, rhs.loggingConfiguration).append(definitionSubstitutions, rhs.definitionSubstitutions).append(tags, rhs.tags).isEquals();
    }

}
