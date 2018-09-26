
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FirehoseAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeliveryStreamName",
    "RoleArn",
    "Separator"
})
public class FirehoseAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname
     * 
     */
    @JsonProperty("DeliveryStreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname")
    private CharSequence deliveryStreamName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator
     * 
     */
    @JsonProperty("Separator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator")
    private CharSequence separator;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname
     * 
     */
    public CharSequence getDeliveryStreamName() {
        return deliveryStreamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname
     * 
     */
    public void setDeliveryStreamName(CharSequence deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    public FirehoseAction withDeliveryStreamName(CharSequence deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public FirehoseAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator
     * 
     */
    public CharSequence getSeparator() {
        return separator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator
     * 
     */
    public void setSeparator(CharSequence separator) {
        this.separator = separator;
    }

    public FirehoseAction withSeparator(CharSequence separator) {
        this.separator = separator;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliveryStreamName", deliveryStreamName).append("roleArn", roleArn).append("separator", separator).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deliveryStreamName).append(separator).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FirehoseAction) == false) {
            return false;
        }
        FirehoseAction rhs = ((FirehoseAction) other);
        return new EqualsBuilder().append(deliveryStreamName, rhs.deliveryStreamName).append(separator, rhs.separator).append(roleArn, rhs.roleArn).isEquals();
    }

}
