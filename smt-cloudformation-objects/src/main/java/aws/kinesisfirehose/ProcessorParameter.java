
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ProcessorParameter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ParameterName",
    "ParameterValue"
})
public class ProcessorParameter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername
     * 
     */
    @JsonProperty("ParameterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername")
    private String parameterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue
     * 
     */
    @JsonProperty("ParameterValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue")
    private String parameterValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername
     * 
     */
    @JsonProperty("ParameterName")
    public String getParameterName() {
        return parameterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername
     * 
     */
    @JsonProperty("ParameterName")
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public ProcessorParameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue
     * 
     */
    @JsonProperty("ParameterValue")
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue
     * 
     */
    @JsonProperty("ParameterValue")
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public ProcessorParameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("parameterName", parameterName).append("parameterValue", parameterValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parameterValue).append(parameterName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessorParameter) == false) {
            return false;
        }
        ProcessorParameter rhs = ((ProcessorParameter) other);
        return new EqualsBuilder().append(parameterValue, rhs.parameterValue).append(parameterName, rhs.parameterName).isEquals();
    }

}
