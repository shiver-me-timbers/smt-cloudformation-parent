
package shiver.me.timbers.aws.kinesisanalyticsv2;

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
 * ApplicationInput
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
public class ApplicationInput implements Property<ApplicationInput>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix
     * 
     */
    @JsonProperty("NamePrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix")
    private CharSequence namePrefix;
    /**
     * ApplicationInputSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html
     * 
     */
    @JsonProperty("InputSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html")
    private Property<ApplicationInputSchema> inputSchema;
    /**
     * ApplicationKinesisStreamsInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html
     * 
     */
    @JsonProperty("KinesisStreamsInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html")
    private Property<ApplicationKinesisStreamsInput> kinesisStreamsInput;
    /**
     * ApplicationKinesisFirehoseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html
     * 
     */
    @JsonProperty("KinesisFirehoseInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html")
    private Property<ApplicationKinesisFirehoseInput> kinesisFirehoseInput;
    /**
     * ApplicationInputProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
     * 
     */
    @JsonProperty("InputProcessingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html")
    private Property<ApplicationInputProcessingConfiguration> inputProcessingConfiguration;
    /**
     * ApplicationInputParallelism
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html
     * 
     */
    @JsonProperty("InputParallelism")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html")
    private Property<ApplicationInputParallelism> inputParallelism;

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

    public ApplicationInput withNamePrefix(CharSequence namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * ApplicationInputSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationInputSchema> getInputSchema() {
        return inputSchema;
    }

    /**
     * ApplicationInputSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html
     * 
     */
    @JsonIgnore
    public void setInputSchema(Property<ApplicationInputSchema> inputSchema) {
        this.inputSchema = inputSchema;
    }

    public ApplicationInput withInputSchema(Property<ApplicationInputSchema> inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * ApplicationKinesisStreamsInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationKinesisStreamsInput> getKinesisStreamsInput() {
        return kinesisStreamsInput;
    }

    /**
     * ApplicationKinesisStreamsInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html
     * 
     */
    @JsonIgnore
    public void setKinesisStreamsInput(Property<ApplicationKinesisStreamsInput> kinesisStreamsInput) {
        this.kinesisStreamsInput = kinesisStreamsInput;
    }

    public ApplicationInput withKinesisStreamsInput(Property<ApplicationKinesisStreamsInput> kinesisStreamsInput) {
        this.kinesisStreamsInput = kinesisStreamsInput;
        return this;
    }

    /**
     * ApplicationKinesisFirehoseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationKinesisFirehoseInput> getKinesisFirehoseInput() {
        return kinesisFirehoseInput;
    }

    /**
     * ApplicationKinesisFirehoseInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html
     * 
     */
    @JsonIgnore
    public void setKinesisFirehoseInput(Property<ApplicationKinesisFirehoseInput> kinesisFirehoseInput) {
        this.kinesisFirehoseInput = kinesisFirehoseInput;
    }

    public ApplicationInput withKinesisFirehoseInput(Property<ApplicationKinesisFirehoseInput> kinesisFirehoseInput) {
        this.kinesisFirehoseInput = kinesisFirehoseInput;
        return this;
    }

    /**
     * ApplicationInputProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationInputProcessingConfiguration> getInputProcessingConfiguration() {
        return inputProcessingConfiguration;
    }

    /**
     * ApplicationInputProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
     * 
     */
    @JsonIgnore
    public void setInputProcessingConfiguration(Property<ApplicationInputProcessingConfiguration> inputProcessingConfiguration) {
        this.inputProcessingConfiguration = inputProcessingConfiguration;
    }

    public ApplicationInput withInputProcessingConfiguration(Property<ApplicationInputProcessingConfiguration> inputProcessingConfiguration) {
        this.inputProcessingConfiguration = inputProcessingConfiguration;
        return this;
    }

    /**
     * ApplicationInputParallelism
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationInputParallelism> getInputParallelism() {
        return inputParallelism;
    }

    /**
     * ApplicationInputParallelism
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html
     * 
     */
    @JsonIgnore
    public void setInputParallelism(Property<ApplicationInputParallelism> inputParallelism) {
        this.inputParallelism = inputParallelism;
    }

    public ApplicationInput withInputParallelism(Property<ApplicationInputParallelism> inputParallelism) {
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
        if ((other instanceof ApplicationInput) == false) {
            return false;
        }
        ApplicationInput rhs = ((ApplicationInput) other);
        return new EqualsBuilder().append(kinesisFirehoseInput, rhs.kinesisFirehoseInput).append(inputProcessingConfiguration, rhs.inputProcessingConfiguration).append(inputSchema, rhs.inputSchema).append(namePrefix, rhs.namePrefix).append(kinesisStreamsInput, rhs.kinesisStreamsInput).append(inputParallelism, rhs.inputParallelism).isEquals();
    }

}
