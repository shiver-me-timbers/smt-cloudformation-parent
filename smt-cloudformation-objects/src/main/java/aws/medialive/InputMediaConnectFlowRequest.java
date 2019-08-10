
package aws.medialive;

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
 * InputMediaConnectFlowRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FlowArn"
})
public class InputMediaConnectFlowRequest implements Property<InputMediaConnectFlowRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html#cfn-medialive-input-mediaconnectflowrequest-flowarn
     * 
     */
    @JsonProperty("FlowArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html#cfn-medialive-input-mediaconnectflowrequest-flowarn")
    private CharSequence flowArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html#cfn-medialive-input-mediaconnectflowrequest-flowarn
     * 
     */
    @JsonIgnore
    public CharSequence getFlowArn() {
        return flowArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html#cfn-medialive-input-mediaconnectflowrequest-flowarn
     * 
     */
    @JsonIgnore
    public void setFlowArn(CharSequence flowArn) {
        this.flowArn = flowArn;
    }

    public InputMediaConnectFlowRequest withFlowArn(CharSequence flowArn) {
        this.flowArn = flowArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flowArn", flowArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flowArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputMediaConnectFlowRequest) == false) {
            return false;
        }
        InputMediaConnectFlowRequest rhs = ((InputMediaConnectFlowRequest) other);
        return new EqualsBuilder().append(flowArn, rhs.flowArn).isEquals();
    }

}
