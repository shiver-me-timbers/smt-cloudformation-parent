
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * KinesisAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PartitionKey",
    "RoleArn",
    "StreamName"
})
public class KinesisAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey
     * 
     */
    @JsonProperty("PartitionKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey")
    private CharSequence partitionKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname
     * 
     */
    @JsonProperty("StreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname")
    private CharSequence streamName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey
     * 
     */
    public CharSequence getPartitionKey() {
        return partitionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey
     * 
     */
    public void setPartitionKey(CharSequence partitionKey) {
        this.partitionKey = partitionKey;
    }

    public KinesisAction withPartitionKey(CharSequence partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public KinesisAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname
     * 
     */
    public CharSequence getStreamName() {
        return streamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname
     * 
     */
    public void setStreamName(CharSequence streamName) {
        this.streamName = streamName;
    }

    public KinesisAction withStreamName(CharSequence streamName) {
        this.streamName = streamName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("partitionKey", partitionKey).append("roleArn", roleArn).append("streamName", streamName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(partitionKey).append(streamName).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KinesisAction) == false) {
            return false;
        }
        KinesisAction rhs = ((KinesisAction) other);
        return new EqualsBuilder().append(partitionKey, rhs.partitionKey).append(streamName, rhs.streamName).append(roleArn, rhs.roleArn).isEquals();
    }

}
