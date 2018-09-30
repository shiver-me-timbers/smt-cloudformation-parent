
package aws.kinesisanalytics;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DestinationSchema",
    "LambdaOutput",
    "KinesisFirehoseOutput",
    "KinesisStreamsOutput",
    "Name"
})
public class Output {

    /**
     * DestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html
     * 
     */
    @JsonProperty("DestinationSchema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html")
    private DestinationSchema destinationSchema;
    /**
     * LambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html
     * 
     */
    @JsonProperty("LambdaOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html")
    private LambdaOutput lambdaOutput;
    /**
     * KinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    @JsonProperty("KinesisFirehoseOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html")
    private KinesisFirehoseOutput kinesisFirehoseOutput;
    /**
     * KinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    @JsonProperty("KinesisStreamsOutput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html")
    private KinesisStreamsOutput kinesisStreamsOutput;
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
    public DestinationSchema getDestinationSchema() {
        return destinationSchema;
    }

    /**
     * DestinationSchema
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html
     * 
     */
    public void setDestinationSchema(DestinationSchema destinationSchema) {
        this.destinationSchema = destinationSchema;
    }

    public Output withDestinationSchema(DestinationSchema destinationSchema) {
        this.destinationSchema = destinationSchema;
        return this;
    }

    /**
     * LambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html
     * 
     */
    public LambdaOutput getLambdaOutput() {
        return lambdaOutput;
    }

    /**
     * LambdaOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html
     * 
     */
    public void setLambdaOutput(LambdaOutput lambdaOutput) {
        this.lambdaOutput = lambdaOutput;
    }

    public Output withLambdaOutput(LambdaOutput lambdaOutput) {
        this.lambdaOutput = lambdaOutput;
        return this;
    }

    /**
     * KinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    public KinesisFirehoseOutput getKinesisFirehoseOutput() {
        return kinesisFirehoseOutput;
    }

    /**
     * KinesisFirehoseOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html
     * 
     */
    public void setKinesisFirehoseOutput(KinesisFirehoseOutput kinesisFirehoseOutput) {
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
    }

    public Output withKinesisFirehoseOutput(KinesisFirehoseOutput kinesisFirehoseOutput) {
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
        return this;
    }

    /**
     * KinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    public KinesisStreamsOutput getKinesisStreamsOutput() {
        return kinesisStreamsOutput;
    }

    /**
     * KinesisStreamsOutput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html
     * 
     */
    public void setKinesisStreamsOutput(KinesisStreamsOutput kinesisStreamsOutput) {
        this.kinesisStreamsOutput = kinesisStreamsOutput;
    }

    public Output withKinesisStreamsOutput(KinesisStreamsOutput kinesisStreamsOutput) {
        this.kinesisStreamsOutput = kinesisStreamsOutput;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name
     * 
     */
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
