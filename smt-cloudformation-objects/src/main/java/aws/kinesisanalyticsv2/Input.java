
package aws.kinesisanalyticsv2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Input
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NamePrefix",
    "InputSchema",
    "KinesisStreamsInput",
    "KinesisFirehoseInput",
    "InputProcessingConfiguration",
    "InputParallelism"
})
public class Input {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix
     * 
     */
    @JsonProperty("NamePrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix")
    private CharSequence namePrefix;
    /**
     * InputSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html
     * 
     */
    @JsonProperty("InputSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html")
    private InputSchema inputSchema;
    /**
     * KinesisStreamsInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html
     * 
     */
    @JsonProperty("KinesisStreamsInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html")
    private KinesisStreamsInput kinesisStreamsInput;
    /**
     * KinesisFirehoseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html
     * 
     */
    @JsonProperty("KinesisFirehoseInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html")
    private KinesisFirehoseInput kinesisFirehoseInput;
    /**
     * InputProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
     * 
     */
    @JsonProperty("InputProcessingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html")
    private InputProcessingConfiguration inputProcessingConfiguration;
    /**
     * InputParallelism
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html
     * 
     */
    @JsonProperty("InputParallelism")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html")
    private InputParallelism inputParallelism;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix
     * 
     */
    @JsonIgnore
    public CharSequence getNamePrefix() {
        return namePrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix
     * 
     */
    @JsonIgnore
    public void setNamePrefix(CharSequence namePrefix) {
        this.namePrefix = namePrefix;
    }

    public Input withNamePrefix(CharSequence namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * InputSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html
     * 
     */
    @JsonIgnore
    public InputSchema getInputSchema() {
        return inputSchema;
    }

    /**
     * InputSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html
     * 
     */
    @JsonIgnore
    public void setInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
    }

    public Input withInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * KinesisStreamsInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html
     * 
     */
    @JsonIgnore
    public KinesisStreamsInput getKinesisStreamsInput() {
        return kinesisStreamsInput;
    }

    /**
     * KinesisStreamsInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html
     * 
     */
    @JsonIgnore
    public void setKinesisStreamsInput(KinesisStreamsInput kinesisStreamsInput) {
        this.kinesisStreamsInput = kinesisStreamsInput;
    }

    public Input withKinesisStreamsInput(KinesisStreamsInput kinesisStreamsInput) {
        this.kinesisStreamsInput = kinesisStreamsInput;
        return this;
    }

    /**
     * KinesisFirehoseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html
     * 
     */
    @JsonIgnore
    public KinesisFirehoseInput getKinesisFirehoseInput() {
        return kinesisFirehoseInput;
    }

    /**
     * KinesisFirehoseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html
     * 
     */
    @JsonIgnore
    public void setKinesisFirehoseInput(KinesisFirehoseInput kinesisFirehoseInput) {
        this.kinesisFirehoseInput = kinesisFirehoseInput;
    }

    public Input withKinesisFirehoseInput(KinesisFirehoseInput kinesisFirehoseInput) {
        this.kinesisFirehoseInput = kinesisFirehoseInput;
        return this;
    }

    /**
     * InputProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
     * 
     */
    @JsonIgnore
    public InputProcessingConfiguration getInputProcessingConfiguration() {
        return inputProcessingConfiguration;
    }

    /**
     * InputProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
     * 
     */
    @JsonIgnore
    public void setInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        this.inputProcessingConfiguration = inputProcessingConfiguration;
    }

    public Input withInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        this.inputProcessingConfiguration = inputProcessingConfiguration;
        return this;
    }

    /**
     * InputParallelism
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html
     * 
     */
    @JsonIgnore
    public InputParallelism getInputParallelism() {
        return inputParallelism;
    }

    /**
     * InputParallelism
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html
     * 
     */
    @JsonIgnore
    public void setInputParallelism(InputParallelism inputParallelism) {
        this.inputParallelism = inputParallelism;
    }

    public Input withInputParallelism(InputParallelism inputParallelism) {
        this.inputParallelism = inputParallelism;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("namePrefix", namePrefix).append("inputSchema", inputSchema).append("kinesisStreamsInput", kinesisStreamsInput).append("kinesisFirehoseInput", kinesisFirehoseInput).append("inputProcessingConfiguration", inputProcessingConfiguration).append("inputParallelism", inputParallelism).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kinesisFirehoseInput).append(inputProcessingConfiguration).append(inputSchema).append(namePrefix).append(kinesisStreamsInput).append(inputParallelism).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return new EqualsBuilder().append(kinesisFirehoseInput, rhs.kinesisFirehoseInput).append(inputProcessingConfiguration, rhs.inputProcessingConfiguration).append(inputSchema, rhs.inputSchema).append(namePrefix, rhs.namePrefix).append(kinesisStreamsInput, rhs.kinesisStreamsInput).append(inputParallelism, rhs.inputParallelism).isEquals();
    }

}
