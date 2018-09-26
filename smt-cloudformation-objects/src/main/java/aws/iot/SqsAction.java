
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SqsAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "QueueUrl",
    "RoleArn",
    "UseBase64"
})
public class SqsAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl
     * 
     */
    @JsonProperty("QueueUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl")
    private CharSequence queueUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64
     * 
     */
    @JsonProperty("UseBase64")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64")
    private Boolean useBase64;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl
     * 
     */
    public CharSequence getQueueUrl() {
        return queueUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl
     * 
     */
    public void setQueueUrl(CharSequence queueUrl) {
        this.queueUrl = queueUrl;
    }

    public SqsAction withQueueUrl(CharSequence queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public SqsAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64
     * 
     */
    public Boolean getUseBase64() {
        return useBase64;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64
     * 
     */
    public void setUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
    }

    public SqsAction withUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("queueUrl", queueUrl).append("roleArn", roleArn).append("useBase64", useBase64).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(queueUrl).append(useBase64).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SqsAction) == false) {
            return false;
        }
        SqsAction rhs = ((SqsAction) other);
        return new EqualsBuilder().append(queueUrl, rhs.queueUrl).append(useBase64, rhs.useBase64).append(roleArn, rhs.roleArn).isEquals();
    }

}
