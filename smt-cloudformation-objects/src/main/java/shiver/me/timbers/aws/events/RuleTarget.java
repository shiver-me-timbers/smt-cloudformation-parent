
package shiver.me.timbers.aws.events;

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
 * RuleTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Arn",
    "EcsParameters",
    "Id",
    "Input",
    "InputPath",
    "InputTransformer",
    "KinesisParameters",
    "RoleArn",
    "RunCommandParameters",
    "SqsParameters"
})
public class RuleTarget implements Property<RuleTarget>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn
     * 
     */
    @JsonProperty("Arn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn")
    private CharSequence arn;
    /**
     * RuleEcsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
     * 
     */
    @JsonProperty("EcsParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html")
    private Property<RuleEcsParameters> ecsParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input
     * 
     */
    @JsonProperty("Input")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input")
    private CharSequence input;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath
     * 
     */
    @JsonProperty("InputPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath")
    private CharSequence inputPath;
    /**
     * RuleInputTransformer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
     * 
     */
    @JsonProperty("InputTransformer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html")
    private Property<RuleInputTransformer> inputTransformer;
    /**
     * RuleKinesisParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
     * 
     */
    @JsonProperty("KinesisParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html")
    private Property<RuleKinesisParameters> kinesisParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn")
    private CharSequence roleArn;
    /**
     * RuleRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
     * 
     */
    @JsonProperty("RunCommandParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html")
    private Property<RuleRunCommandParameters> runCommandParameters;
    /**
     * RuleSqsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html
     * 
     */
    @JsonProperty("SqsParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html")
    private Property<RuleSqsParameters> sqsParameters;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn
     * 
     */
    @JsonIgnore
    public CharSequence getArn() {
        return arn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn
     * 
     */
    @JsonIgnore
    public void setArn(CharSequence arn) {
        this.arn = arn;
    }

    public RuleTarget withArn(CharSequence arn) {
        this.arn = arn;
        return this;
    }

    /**
     * RuleEcsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
     * 
     */
    @JsonIgnore
    public Property<RuleEcsParameters> getEcsParameters() {
        return ecsParameters;
    }

    /**
     * RuleEcsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
     * 
     */
    @JsonIgnore
    public void setEcsParameters(Property<RuleEcsParameters> ecsParameters) {
        this.ecsParameters = ecsParameters;
    }

    public RuleTarget withEcsParameters(Property<RuleEcsParameters> ecsParameters) {
        this.ecsParameters = ecsParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public RuleTarget withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input
     * 
     */
    @JsonIgnore
    public CharSequence getInput() {
        return input;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input
     * 
     */
    @JsonIgnore
    public void setInput(CharSequence input) {
        this.input = input;
    }

    public RuleTarget withInput(CharSequence input) {
        this.input = input;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath
     * 
     */
    @JsonIgnore
    public CharSequence getInputPath() {
        return inputPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath
     * 
     */
    @JsonIgnore
    public void setInputPath(CharSequence inputPath) {
        this.inputPath = inputPath;
    }

    public RuleTarget withInputPath(CharSequence inputPath) {
        this.inputPath = inputPath;
        return this;
    }

    /**
     * RuleInputTransformer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
     * 
     */
    @JsonIgnore
    public Property<RuleInputTransformer> getInputTransformer() {
        return inputTransformer;
    }

    /**
     * RuleInputTransformer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
     * 
     */
    @JsonIgnore
    public void setInputTransformer(Property<RuleInputTransformer> inputTransformer) {
        this.inputTransformer = inputTransformer;
    }

    public RuleTarget withInputTransformer(Property<RuleInputTransformer> inputTransformer) {
        this.inputTransformer = inputTransformer;
        return this;
    }

    /**
     * RuleKinesisParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
     * 
     */
    @JsonIgnore
    public Property<RuleKinesisParameters> getKinesisParameters() {
        return kinesisParameters;
    }

    /**
     * RuleKinesisParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
     * 
     */
    @JsonIgnore
    public void setKinesisParameters(Property<RuleKinesisParameters> kinesisParameters) {
        this.kinesisParameters = kinesisParameters;
    }

    public RuleTarget withKinesisParameters(Property<RuleKinesisParameters> kinesisParameters) {
        this.kinesisParameters = kinesisParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public RuleTarget withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * RuleRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
     * 
     */
    @JsonIgnore
    public Property<RuleRunCommandParameters> getRunCommandParameters() {
        return runCommandParameters;
    }

    /**
     * RuleRunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
     * 
     */
    @JsonIgnore
    public void setRunCommandParameters(Property<RuleRunCommandParameters> runCommandParameters) {
        this.runCommandParameters = runCommandParameters;
    }

    public RuleTarget withRunCommandParameters(Property<RuleRunCommandParameters> runCommandParameters) {
        this.runCommandParameters = runCommandParameters;
        return this;
    }

    /**
     * RuleSqsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html
     * 
     */
    @JsonIgnore
    public Property<RuleSqsParameters> getSqsParameters() {
        return sqsParameters;
    }

    /**
     * RuleSqsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html
     * 
     */
    @JsonIgnore
    public void setSqsParameters(Property<RuleSqsParameters> sqsParameters) {
        this.sqsParameters = sqsParameters;
    }

    public RuleTarget withSqsParameters(Property<RuleSqsParameters> sqsParameters) {
        this.sqsParameters = sqsParameters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arn", arn).append("ecsParameters", ecsParameters).append("id", id).append("input", input).append("inputPath", inputPath).append("inputTransformer", inputTransformer).append("kinesisParameters", kinesisParameters).append("roleArn", roleArn).append("runCommandParameters", runCommandParameters).append("sqsParameters", sqsParameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputTransformer).append(input).append(runCommandParameters).append(inputPath).append(sqsParameters).append(ecsParameters).append(roleArn).append(kinesisParameters).append(id).append(arn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleTarget) == false) {
            return false;
        }
        RuleTarget rhs = ((RuleTarget) other);
        return new EqualsBuilder().append(inputTransformer, rhs.inputTransformer).append(input, rhs.input).append(runCommandParameters, rhs.runCommandParameters).append(inputPath, rhs.inputPath).append(sqsParameters, rhs.sqsParameters).append(ecsParameters, rhs.ecsParameters).append(roleArn, rhs.roleArn).append(kinesisParameters, rhs.kinesisParameters).append(id, rhs.id).append(arn, rhs.arn).isEquals();
    }

}
