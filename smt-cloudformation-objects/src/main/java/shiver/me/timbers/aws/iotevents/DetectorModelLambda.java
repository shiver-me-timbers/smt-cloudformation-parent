
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelLambda
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FunctionArn"
})
public class DetectorModelLambda implements Property<DetectorModelLambda>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-functionarn
     * 
     */
    @JsonProperty("FunctionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-functionarn")
    private CharSequence functionArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-functionarn
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionArn() {
        return functionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-functionarn
     * 
     */
    @JsonIgnore
    public void setFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
    }

    public DetectorModelLambda withFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("functionArn", functionArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(functionArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelLambda) == false) {
            return false;
        }
        DetectorModelLambda rhs = ((DetectorModelLambda) other);
        return new EqualsBuilder().append(functionArn, rhs.functionArn).isEquals();
    }

}
