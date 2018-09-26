
package aws.kinesis;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Stream
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "RetentionPeriodHours",
    "ShardCount",
    "StreamEncryption",
    "Tags"
})
public class Stream {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours
     * 
     */
    @JsonProperty("RetentionPeriodHours")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours")
    private Integer retentionPeriodHours;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount
     * 
     */
    @JsonProperty("ShardCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount")
    private Integer shardCount;
    /**
     * StreamEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html
     * 
     */
    @JsonProperty("StreamEncryption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html")
    private StreamEncryption streamEncryption;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Stream withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours
     * 
     */
    public Integer getRetentionPeriodHours() {
        return retentionPeriodHours;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours
     * 
     */
    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    public Stream withRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount
     * 
     */
    public Integer getShardCount() {
        return shardCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount
     * 
     */
    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    public Stream withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * StreamEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html
     * 
     */
    public StreamEncryption getStreamEncryption() {
        return streamEncryption;
    }

    /**
     * StreamEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html
     * 
     */
    public void setStreamEncryption(StreamEncryption streamEncryption) {
        this.streamEncryption = streamEncryption;
    }

    public Stream withStreamEncryption(StreamEncryption streamEncryption) {
        this.streamEncryption = streamEncryption;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Stream withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("retentionPeriodHours", retentionPeriodHours).append("shardCount", shardCount).append("streamEncryption", streamEncryption).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(retentionPeriodHours).append(streamEncryption).append(shardCount).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stream) == false) {
            return false;
        }
        Stream rhs = ((Stream) other);
        return new EqualsBuilder().append(name, rhs.name).append(retentionPeriodHours, rhs.retentionPeriodHours).append(streamEncryption, rhs.streamEncryption).append(shardCount, rhs.shardCount).append(tags, rhs.tags).isEquals();
    }

}
