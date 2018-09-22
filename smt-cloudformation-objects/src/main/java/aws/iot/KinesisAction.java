
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
    private String partitionKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn")
    private String roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname
     * 
     */
    @JsonProperty("StreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname")
    private String streamName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey
     * 
     */
    @JsonProperty("PartitionKey")
    public String getPartitionKey() {
        return partitionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey
     * 
     */
    @JsonProperty("PartitionKey")
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    public KinesisAction withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    public KinesisAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname
     * 
     */
    @JsonProperty("StreamName")
    public String getStreamName() {
        return streamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname
     * 
     */
    @JsonProperty("StreamName")
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public KinesisAction withStreamName(String streamName) {
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
