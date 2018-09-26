
package aws.cloudfront;

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
 * StreamingDistribution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StreamingDistributionConfig",
    "Tags"
})
public class StreamingDistribution {

    /**
     * StreamingDistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
     * 
     */
    @JsonProperty("StreamingDistributionConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html")
    private StreamingDistributionConfig streamingDistributionConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * StreamingDistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
     * 
     */
    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return streamingDistributionConfig;
    }

    /**
     * StreamingDistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
     * 
     */
    public void setStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    public StreamingDistribution withStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public StreamingDistribution withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("streamingDistributionConfig", streamingDistributionConfig).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(streamingDistributionConfig).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamingDistribution) == false) {
            return false;
        }
        StreamingDistribution rhs = ((StreamingDistribution) other);
        return new EqualsBuilder().append(streamingDistributionConfig, rhs.streamingDistributionConfig).append(tags, rhs.tags).isEquals();
    }

}
