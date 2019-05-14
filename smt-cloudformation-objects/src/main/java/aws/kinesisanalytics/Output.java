
package aws.kinesisanalytics;

import aws.Property;
import aws.kinesisanalyticsv2.KinesisStreamsOutput;
import aws.kinesisanalyticsv2.LambdaOutput;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Output
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html
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
public class Output implements Property<Output>
{

    /**
     * DestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html
     * 
     */
    @JsonProperty("DestinationSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html")
    private Property<DestinationSchema> destinationSchema;
    /**
     * LambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html
     * 
     */
    @JsonProperty("LambdaOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html")
    private Property<LambdaOutput> lambdaOutput;
    /**
     * KinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    @JsonProperty("KinesisFirehoseOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html")
    private Property<KinesisFirehoseOutput> kinesisFirehoseOutput;
    /**
     * KinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    @JsonProperty("KinesisStreamsOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html")
    private Property<KinesisStreamsOutput> kinesisStreamsOutput;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name")
    private CharSequence name;

    /**
     * DestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html
     * 
     */
    @JsonIgnore
    public Property<DestinationSchema> getDestinationSchema() {
        return destinationSchema;
    }

    /**
     * DestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html
     * 
     */
    @JsonIgnore
    public void setDestinationSchema(Property<DestinationSchema> destinationSchema) {
        this.destinationSchema = destinationSchema;
    }

    public Output withDestinationSchema(Property<DestinationSchema> destinationSchema) {
        this.destinationSchema = destinationSchema;
        return this;
    }

    /**
     * LambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html
     * 
     */
    @JsonIgnore
    public Property<LambdaOutput> getLambdaOutput() {
        return lambdaOutput;
    }

    /**
     * LambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html
     * 
     */
    @JsonIgnore
    public void setLambdaOutput(Property<LambdaOutput> lambdaOutput) {
        this.lambdaOutput = lambdaOutput;
    }

    public Output withLambdaOutput(Property<LambdaOutput> lambdaOutput) {
        this.lambdaOutput = lambdaOutput;
        return this;
    }

    /**
     * KinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    @JsonIgnore
    public Property<KinesisFirehoseOutput> getKinesisFirehoseOutput() {
        return kinesisFirehoseOutput;
    }

    /**
     * KinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    @JsonIgnore
    public void setKinesisFirehoseOutput(Property<KinesisFirehoseOutput> kinesisFirehoseOutput) {
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
    }

    public Output withKinesisFirehoseOutput(Property<KinesisFirehoseOutput> kinesisFirehoseOutput) {
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
        return this;
    }

    /**
     * KinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    @JsonIgnore
    public Property<KinesisStreamsOutput> getKinesisStreamsOutput() {
        return kinesisStreamsOutput;
    }

    /**
     * KinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    @JsonIgnore
    public void setKinesisStreamsOutput(Property<KinesisStreamsOutput> kinesisStreamsOutput) {
        this.kinesisStreamsOutput = kinesisStreamsOutput;
    }

    public Output withKinesisStreamsOutput(Property<KinesisStreamsOutput> kinesisStreamsOutput) {
        this.kinesisStreamsOutput = kinesisStreamsOutput;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Output withName(CharSequence name) {
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
        if ((other instanceof Output) == false) {
            return false;
        }
        Output rhs = ((Output) other);
        return new EqualsBuilder().append(name, rhs.name).append(lambdaOutput, rhs.lambdaOutput).append(kinesisStreamsOutput, rhs.kinesisStreamsOutput).append(kinesisFirehoseOutput, rhs.kinesisFirehoseOutput).append(destinationSchema, rhs.destinationSchema).isEquals();
    }

}
