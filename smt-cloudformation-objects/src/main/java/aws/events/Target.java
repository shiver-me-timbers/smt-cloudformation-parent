
package aws.events;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Target
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
public class Target implements Property<Target>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn
     * 
     */
    @JsonProperty("Arn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn")
    private CharSequence arn;
    /**
     * EcsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
     * 
     */
    @JsonProperty("EcsParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html")
    private Property<EcsParameters> ecsParameters;
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
     * InputTransformer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
     * 
     */
    @JsonProperty("InputTransformer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html")
    private Property<InputTransformer> inputTransformer;
    /**
     * KinesisParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
     * 
     */
    @JsonProperty("KinesisParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html")
    private Property<KinesisParameters> kinesisParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn")
    private CharSequence roleArn;
    /**
     * RunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
     * 
     */
    @JsonProperty("RunCommandParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html")
    private Property<RunCommandParameters> runCommandParameters;
    /**
     * SqsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html
     * 
     */
    @JsonProperty("SqsParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html")
    private Property<SqsParameters> sqsParameters;

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

    public Target withArn(CharSequence arn) {
        this.arn = arn;
        return this;
    }

    /**
     * EcsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
     * 
     */
    @JsonIgnore
    public Property<EcsParameters> getEcsParameters() {
        return ecsParameters;
    }

    /**
     * EcsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
     * 
     */
    @JsonIgnore
    public void setEcsParameters(Property<EcsParameters> ecsParameters) {
        this.ecsParameters = ecsParameters;
    }

    public Target withEcsParameters(Property<EcsParameters> ecsParameters) {
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

    public Target withId(CharSequence id) {
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

    public Target withInput(CharSequence input) {
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

    public Target withInputPath(CharSequence inputPath) {
        this.inputPath = inputPath;
        return this;
    }

    /**
     * InputTransformer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
     * 
     */
    @JsonIgnore
    public Property<InputTransformer> getInputTransformer() {
        return inputTransformer;
    }

    /**
     * InputTransformer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
     * 
     */
    @JsonIgnore
    public void setInputTransformer(Property<InputTransformer> inputTransformer) {
        this.inputTransformer = inputTransformer;
    }

    public Target withInputTransformer(Property<InputTransformer> inputTransformer) {
        this.inputTransformer = inputTransformer;
        return this;
    }

    /**
     * KinesisParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
     * 
     */
    @JsonIgnore
    public Property<KinesisParameters> getKinesisParameters() {
        return kinesisParameters;
    }

    /**
     * KinesisParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
     * 
     */
    @JsonIgnore
    public void setKinesisParameters(Property<KinesisParameters> kinesisParameters) {
        this.kinesisParameters = kinesisParameters;
    }

    public Target withKinesisParameters(Property<KinesisParameters> kinesisParameters) {
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

    public Target withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * RunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
     * 
     */
    @JsonIgnore
    public Property<RunCommandParameters> getRunCommandParameters() {
        return runCommandParameters;
    }

    /**
     * RunCommandParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
     * 
     */
    @JsonIgnore
    public void setRunCommandParameters(Property<RunCommandParameters> runCommandParameters) {
        this.runCommandParameters = runCommandParameters;
    }

    public Target withRunCommandParameters(Property<RunCommandParameters> runCommandParameters) {
        this.runCommandParameters = runCommandParameters;
        return this;
    }

    /**
     * SqsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html
     * 
     */
    @JsonIgnore
    public Property<SqsParameters> getSqsParameters() {
        return sqsParameters;
    }

    /**
     * SqsParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html
     * 
     */
    @JsonIgnore
    public void setSqsParameters(Property<SqsParameters> sqsParameters) {
        this.sqsParameters = sqsParameters;
    }

    public Target withSqsParameters(Property<SqsParameters> sqsParameters) {
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
        if ((other instanceof Target) == false) {
            return false;
        }
        Target rhs = ((Target) other);
        return new EqualsBuilder().append(inputTransformer, rhs.inputTransformer).append(input, rhs.input).append(runCommandParameters, rhs.runCommandParameters).append(inputPath, rhs.inputPath).append(sqsParameters, rhs.sqsParameters).append(ecsParameters, rhs.ecsParameters).append(roleArn, rhs.roleArn).append(kinesisParameters, rhs.kinesisParameters).append(id, rhs.id).append(arn, rhs.arn).isEquals();
    }

}
