
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
 * InputProcessingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InputLambdaProcessor"
})
public class InputProcessingConfiguration implements Property<InputProcessingConfiguration>
{

    /**
     * InputLambdaProcessor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html
     * 
     */
    @JsonProperty("InputLambdaProcessor")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html")
    private Property<InputLambdaProcessor> inputLambdaProcessor;

    /**
     * InputLambdaProcessor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html
     * 
     */
    @JsonIgnore
    public Property<InputLambdaProcessor> getInputLambdaProcessor() {
        return inputLambdaProcessor;
    }

    /**
     * InputLambdaProcessor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html
     * 
     */
    @JsonIgnore
    public void setInputLambdaProcessor(Property<InputLambdaProcessor> inputLambdaProcessor) {
        this.inputLambdaProcessor = inputLambdaProcessor;
    }

    public InputProcessingConfiguration withInputLambdaProcessor(Property<InputLambdaProcessor> inputLambdaProcessor) {
        this.inputLambdaProcessor = inputLambdaProcessor;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("inputLambdaProcessor", inputLambdaProcessor).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputLambdaProcessor).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputProcessingConfiguration) == false) {
            return false;
        }
        InputProcessingConfiguration rhs = ((InputProcessingConfiguration) other);
        return new EqualsBuilder().append(inputLambdaProcessor, rhs.inputLambdaProcessor).isEquals();
    }

}
