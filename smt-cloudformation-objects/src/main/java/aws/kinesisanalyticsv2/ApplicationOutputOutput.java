
package aws.kinesisanalyticsv2;

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
 * ApplicationOutputOutput
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DestinationSchema",
    "LambdaOutput",
    "KinesisFirehoseOutput",
    "KinesisStreamsOutput",
    "Name"
})
public class ApplicationOutputOutput implements Property<ApplicationOutputOutput>
{

    /**
     * ApplicationOutputDestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html
     * 
     */
    @JsonProperty("DestinationSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html")
    private Property<ApplicationOutputDestinationSchema> destinationSchema;
    /**
     * ApplicationOutputLambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html
     * 
     */
    @JsonProperty("LambdaOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html")
    private Property<ApplicationOutputLambdaOutput> lambdaOutput;
    /**
     * ApplicationOutputKinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    @JsonProperty("KinesisFirehoseOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html")
    private Property<ApplicationOutputKinesisFirehoseOutput> kinesisFirehoseOutput;
    /**
     * ApplicationOutputKinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    @JsonProperty("KinesisStreamsOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html")
    private Property<ApplicationOutputKinesisStreamsOutput> kinesisStreamsOutput;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-name")
    private CharSequence name;

    /**
     * ApplicationOutputDestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationOutputDestinationSchema> getDestinationSchema() {
        return destinationSchema;
    }

    /**
     * ApplicationOutputDestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html
     * 
     */
    @JsonIgnore
    public void setDestinationSchema(Property<ApplicationOutputDestinationSchema> destinationSchema) {
        this.destinationSchema = destinationSchema;
    }

    public ApplicationOutputOutput withDestinationSchema(Property<ApplicationOutputDestinationSchema> destinationSchema) {
        this.destinationSchema = destinationSchema;
        return this;
    }

    /**
     * ApplicationOutputLambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationOutputLambdaOutput> getLambdaOutput() {
        return lambdaOutput;
    }

    /**
     * ApplicationOutputLambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html
     * 
     */
    @JsonIgnore
    public void setLambdaOutput(Property<ApplicationOutputLambdaOutput> lambdaOutput) {
        this.lambdaOutput = lambdaOutput;
    }

    public ApplicationOutputOutput withLambdaOutput(Property<ApplicationOutputLambdaOutput> lambdaOutput) {
        this.lambdaOutput = lambdaOutput;
        return this;
    }

    /**
     * ApplicationOutputKinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationOutputKinesisFirehoseOutput> getKinesisFirehoseOutput() {
        return kinesisFirehoseOutput;
    }

    /**
     * ApplicationOutputKinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    @JsonIgnore
    public void setKinesisFirehoseOutput(Property<ApplicationOutputKinesisFirehoseOutput> kinesisFirehoseOutput) {
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
    }

    public ApplicationOutputOutput withKinesisFirehoseOutput(Property<ApplicationOutputKinesisFirehoseOutput> kinesisFirehoseOutput) {
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
        return this;
    }

    /**
     * ApplicationOutputKinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationOutputKinesisStreamsOutput> getKinesisStreamsOutput() {
        return kinesisStreamsOutput;
    }

    /**
     * ApplicationOutputKinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    @JsonIgnore
    public void setKinesisStreamsOutput(Property<ApplicationOutputKinesisStreamsOutput> kinesisStreamsOutput) {
        this.kinesisStreamsOutput = kinesisStreamsOutput;
    }

    public ApplicationOutputOutput withKinesisStreamsOutput(Property<ApplicationOutputKinesisStreamsOutput> kinesisStreamsOutput) {
        this.kinesisStreamsOutput = kinesisStreamsOutput;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ApplicationOutputOutput withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationSchema", destinationSchema).append("lambdaOutput", lambdaOutput).append("kinesisFirehoseOutput", kinesisFirehoseOutput).append("kinesisStreamsOutput", kinesisStreamsOutput).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(lambdaOutput).append(kinesisStreamsOutput).append(kinesisFirehoseOutput).append(destinationSchema).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationOutputOutput) == false) {
            return false;
        }
        ApplicationOutputOutput rhs = ((ApplicationOutputOutput) other);
        return new EqualsBuilder().append(name, rhs.name).append(lambdaOutput, rhs.lambdaOutput).append(kinesisStreamsOutput, rhs.kinesisStreamsOutput).append(kinesisFirehoseOutput, rhs.kinesisFirehoseOutput).append(destinationSchema, rhs.destinationSchema).isEquals();
    }

}
