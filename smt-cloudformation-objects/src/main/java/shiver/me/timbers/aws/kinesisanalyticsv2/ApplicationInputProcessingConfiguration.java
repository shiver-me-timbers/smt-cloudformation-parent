
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
 * ApplicationInputProcessingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InputLambdaProcessor"
})
public class ApplicationInputProcessingConfiguration implements Property<ApplicationInputProcessingConfiguration>
{

    /**
     * ApplicationInputLambdaProcessor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html
     * 
     */
    @JsonProperty("InputLambdaProcessor")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html")
    private Property<ApplicationInputLambdaProcessor> inputLambdaProcessor;

    /**
     * ApplicationInputLambdaProcessor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationInputLambdaProcessor> getInputLambdaProcessor() {
        return inputLambdaProcessor;
    }

    /**
     * ApplicationInputLambdaProcessor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html
     * 
     */
    @JsonIgnore
    public void setInputLambdaProcessor(Property<ApplicationInputLambdaProcessor> inputLambdaProcessor) {
        this.inputLambdaProcessor = inputLambdaProcessor;
    }

    public ApplicationInputProcessingConfiguration withInputLambdaProcessor(Property<ApplicationInputLambdaProcessor> inputLambdaProcessor) {
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
        if ((other instanceof ApplicationInputProcessingConfiguration) == false) {
            return false;
        }
        ApplicationInputProcessingConfiguration rhs = ((ApplicationInputProcessingConfiguration) other);
        return new EqualsBuilder().append(inputLambdaProcessor, rhs.inputLambdaProcessor).isEquals();
    }

}
