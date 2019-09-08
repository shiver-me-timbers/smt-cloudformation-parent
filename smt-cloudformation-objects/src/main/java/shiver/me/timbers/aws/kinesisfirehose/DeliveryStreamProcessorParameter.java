
package shiver.me.timbers.aws.kinesisfirehose;

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
 * DeliveryStreamProcessorParameter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ParameterName",
    "ParameterValue"
})
public class DeliveryStreamProcessorParameter implements Property<DeliveryStreamProcessorParameter>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername
     * 
     */
    @JsonProperty("ParameterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername")
    private CharSequence parameterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue
     * 
     */
    @JsonProperty("ParameterValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue")
    private CharSequence parameterValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername
     * 
     */
    @JsonIgnore
    public CharSequence getParameterName() {
        return parameterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername
     * 
     */
    @JsonIgnore
    public void setParameterName(CharSequence parameterName) {
        this.parameterName = parameterName;
    }

    public DeliveryStreamProcessorParameter withParameterName(CharSequence parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue
     * 
     */
    @JsonIgnore
    public CharSequence getParameterValue() {
        return parameterValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue
     * 
     */
    @JsonIgnore
    public void setParameterValue(CharSequence parameterValue) {
        this.parameterValue = parameterValue;
    }

    public DeliveryStreamProcessorParameter withParameterValue(CharSequence parameterValue) {
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
        if ((other instanceof DeliveryStreamProcessorParameter) == false) {
            return false;
        }
        DeliveryStreamProcessorParameter rhs = ((DeliveryStreamProcessorParameter) other);
        return new EqualsBuilder().append(parameterValue, rhs.parameterValue).append(parameterName, rhs.parameterName).isEquals();
    }

}
