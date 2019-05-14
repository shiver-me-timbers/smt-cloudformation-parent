
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
 * InputLambdaProcessor
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceARN"
})
public class InputLambdaProcessor implements Property<InputLambdaProcessor>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn
     * 
     */
    @JsonProperty("ResourceARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn")
    private CharSequence resourceARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn
     * 
     */
    @JsonIgnore
    public CharSequence getResourceARN() {
        return resourceARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn
     * 
     */
    @JsonIgnore
    public void setResourceARN(CharSequence resourceARN) {
        this.resourceARN = resourceARN;
    }

    public InputLambdaProcessor withResourceARN(CharSequence resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceARN", resourceARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputLambdaProcessor) == false) {
            return false;
        }
        InputLambdaProcessor rhs = ((InputLambdaProcessor) other);
        return new EqualsBuilder().append(resourceARN, rhs.resourceARN).isEquals();
    }

}
