
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LambdaAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FunctionArn"
})
public class LambdaAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn
     * 
     */
    @JsonProperty("FunctionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn")
    private CharSequence functionArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn
     * 
     */
    public CharSequence getFunctionArn() {
        return functionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn
     * 
     */
    public void setFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
    }

    public LambdaAction withFunctionArn(CharSequence functionArn) {
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
        if ((other instanceof LambdaAction) == false) {
            return false;
        }
        LambdaAction rhs = ((LambdaAction) other);
        return new EqualsBuilder().append(functionArn, rhs.functionArn).isEquals();
    }

}
