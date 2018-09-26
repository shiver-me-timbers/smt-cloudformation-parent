
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SnsAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MessageFormat",
    "RoleArn",
    "TargetArn"
})
public class SnsAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat
     * 
     */
    @JsonProperty("MessageFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat")
    private CharSequence messageFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn
     * 
     */
    @JsonProperty("TargetArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn")
    private CharSequence targetArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat
     * 
     */
    public CharSequence getMessageFormat() {
        return messageFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat
     * 
     */
    public void setMessageFormat(CharSequence messageFormat) {
        this.messageFormat = messageFormat;
    }

    public SnsAction withMessageFormat(CharSequence messageFormat) {
        this.messageFormat = messageFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public SnsAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn
     * 
     */
    public CharSequence getTargetArn() {
        return targetArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn
     * 
     */
    public void setTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
    }

    public SnsAction withTargetArn(CharSequence targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("messageFormat", messageFormat).append("roleArn", roleArn).append("targetArn", targetArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(messageFormat).append(roleArn).append(targetArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SnsAction) == false) {
            return false;
        }
        SnsAction rhs = ((SnsAction) other);
        return new EqualsBuilder().append(messageFormat, rhs.messageFormat).append(roleArn, rhs.roleArn).append(targetArn, rhs.targetArn).isEquals();
    }

}
