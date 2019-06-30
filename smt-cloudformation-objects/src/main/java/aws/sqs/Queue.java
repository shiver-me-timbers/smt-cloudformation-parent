
package aws.sqs;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Queue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContentBasedDeduplication",
    "DelaySeconds",
    "FifoQueue",
    "KmsDataKeyReusePeriodSeconds",
    "KmsMasterKeyId",
    "MaximumMessageSize",
    "MessageRetentionPeriod",
    "QueueName",
    "ReceiveMessageWaitTimeSeconds",
    "RedrivePolicy",
    "Tags",
    "VisibilityTimeout"
})
public class Queue {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-contentbaseddeduplication
     * 
     */
    @JsonProperty("ContentBasedDeduplication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-contentbaseddeduplication")
    private CharSequence contentBasedDeduplication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-delayseconds
     * 
     */
    @JsonProperty("DelaySeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-delayseconds")
    private Number delaySeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-fifoqueue
     * 
     */
    @JsonProperty("FifoQueue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-fifoqueue")
    private CharSequence fifoQueue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsdatakeyreuseperiodseconds
     * 
     */
    @JsonProperty("KmsDataKeyReusePeriodSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsdatakeyreuseperiodseconds")
    private Number kmsDataKeyReusePeriodSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsmasterkeyid
     * 
     */
    @JsonProperty("KmsMasterKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsmasterkeyid")
    private CharSequence kmsMasterKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-maxmesgsize
     * 
     */
    @JsonProperty("MaximumMessageSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-maxmesgsize")
    private Number maximumMessageSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-msgretentionperiod
     * 
     */
    @JsonProperty("MessageRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-msgretentionperiod")
    private Number messageRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-name
     * 
     */
    @JsonProperty("QueueName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-name")
    private CharSequence queueName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-receivemsgwaittime
     * 
     */
    @JsonProperty("ReceiveMessageWaitTimeSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-receivemsgwaittime")
    private Number receiveMessageWaitTimeSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-redrive
     * 
     */
    @JsonProperty("RedrivePolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-redrive")
    private Object redrivePolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#cfn-sqs-queue-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#cfn-sqs-queue-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-visiblitytimeout
     * 
     */
    @JsonProperty("VisibilityTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-visiblitytimeout")
    private Number visibilityTimeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-contentbaseddeduplication
     * 
     */
    @JsonIgnore
    public CharSequence getContentBasedDeduplication() {
        return contentBasedDeduplication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-contentbaseddeduplication
     * 
     */
    @JsonIgnore
    public void setContentBasedDeduplication(CharSequence contentBasedDeduplication) {
        this.contentBasedDeduplication = contentBasedDeduplication;
    }

    public Queue withContentBasedDeduplication(CharSequence contentBasedDeduplication) {
        this.contentBasedDeduplication = contentBasedDeduplication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-delayseconds
     * 
     */
    @JsonIgnore
    public Number getDelaySeconds() {
        return delaySeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-delayseconds
     * 
     */
    @JsonIgnore
    public void setDelaySeconds(Number delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    public Queue withDelaySeconds(Number delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-fifoqueue
     * 
     */
    @JsonIgnore
    public CharSequence getFifoQueue() {
        return fifoQueue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-fifoqueue
     * 
     */
    @JsonIgnore
    public void setFifoQueue(CharSequence fifoQueue) {
        this.fifoQueue = fifoQueue;
    }

    public Queue withFifoQueue(CharSequence fifoQueue) {
        this.fifoQueue = fifoQueue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsdatakeyreuseperiodseconds
     * 
     */
    @JsonIgnore
    public Number getKmsDataKeyReusePeriodSeconds() {
        return kmsDataKeyReusePeriodSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsdatakeyreuseperiodseconds
     * 
     */
    @JsonIgnore
    public void setKmsDataKeyReusePeriodSeconds(Number kmsDataKeyReusePeriodSeconds) {
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
    }

    public Queue withKmsDataKeyReusePeriodSeconds(Number kmsDataKeyReusePeriodSeconds) {
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKmsMasterKeyId() {
        return kmsMasterKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public void setKmsMasterKeyId(CharSequence kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    public Queue withKmsMasterKeyId(CharSequence kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-maxmesgsize
     * 
     */
    @JsonIgnore
    public Number getMaximumMessageSize() {
        return maximumMessageSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-maxmesgsize
     * 
     */
    @JsonIgnore
    public void setMaximumMessageSize(Number maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
    }

    public Queue withMaximumMessageSize(Number maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-msgretentionperiod
     * 
     */
    @JsonIgnore
    public Number getMessageRetentionPeriod() {
        return messageRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-msgretentionperiod
     * 
     */
    @JsonIgnore
    public void setMessageRetentionPeriod(Number messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
    }

    public Queue withMessageRetentionPeriod(Number messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-name
     * 
     */
    @JsonIgnore
    public CharSequence getQueueName() {
        return queueName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-name
     * 
     */
    @JsonIgnore
    public void setQueueName(CharSequence queueName) {
        this.queueName = queueName;
    }

    public Queue withQueueName(CharSequence queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-receivemsgwaittime
     * 
     */
    @JsonIgnore
    public Number getReceiveMessageWaitTimeSeconds() {
        return receiveMessageWaitTimeSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-receivemsgwaittime
     * 
     */
    @JsonIgnore
    public void setReceiveMessageWaitTimeSeconds(Number receiveMessageWaitTimeSeconds) {
        this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
    }

    public Queue withReceiveMessageWaitTimeSeconds(Number receiveMessageWaitTimeSeconds) {
        this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-redrive
     * 
     */
    @JsonIgnore
    public Object getRedrivePolicy() {
        return redrivePolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-redrive
     * 
     */
    @JsonIgnore
    public void setRedrivePolicy(Object redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
    }

    public Queue withRedrivePolicy(Object redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#cfn-sqs-queue-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#cfn-sqs-queue-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Queue withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-visiblitytimeout
     * 
     */
    @JsonIgnore
    public Number getVisibilityTimeout() {
        return visibilityTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-visiblitytimeout
     * 
     */
    @JsonIgnore
    public void setVisibilityTimeout(Number visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    public Queue withVisibilityTimeout(Number visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contentBasedDeduplication", contentBasedDeduplication).append("delaySeconds", delaySeconds).append("fifoQueue", fifoQueue).append("kmsDataKeyReusePeriodSeconds", kmsDataKeyReusePeriodSeconds).append("kmsMasterKeyId", kmsMasterKeyId).append("maximumMessageSize", maximumMessageSize).append("messageRetentionPeriod", messageRetentionPeriod).append("queueName", queueName).append("receiveMessageWaitTimeSeconds", receiveMessageWaitTimeSeconds).append("redrivePolicy", redrivePolicy).append("tags", tags).append("visibilityTimeout", visibilityTimeout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contentBasedDeduplication).append(delaySeconds).append(maximumMessageSize).append(kmsDataKeyReusePeriodSeconds).append(receiveMessageWaitTimeSeconds).append(visibilityTimeout).append(tags).append(queueName).append(fifoQueue).append(redrivePolicy).append(kmsMasterKeyId).append(messageRetentionPeriod).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Queue) == false) {
            return false;
        }
        Queue rhs = ((Queue) other);
        return new EqualsBuilder().append(contentBasedDeduplication, rhs.contentBasedDeduplication).append(delaySeconds, rhs.delaySeconds).append(maximumMessageSize, rhs.maximumMessageSize).append(kmsDataKeyReusePeriodSeconds, rhs.kmsDataKeyReusePeriodSeconds).append(receiveMessageWaitTimeSeconds, rhs.receiveMessageWaitTimeSeconds).append(visibilityTimeout, rhs.visibilityTimeout).append(tags, rhs.tags).append(queueName, rhs.queueName).append(fifoQueue, rhs.fifoQueue).append(redrivePolicy, rhs.redrivePolicy).append(kmsMasterKeyId, rhs.kmsMasterKeyId).append(messageRetentionPeriod, rhs.messageRetentionPeriod).isEquals();
    }

}
