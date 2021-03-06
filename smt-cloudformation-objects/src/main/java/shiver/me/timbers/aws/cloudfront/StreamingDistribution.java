
package shiver.me.timbers.aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * StreamingDistribution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "StreamingDistributionConfig",
    "Tags"
})
public class StreamingDistribution {

    /**
     * StreamingDistributionStreamingDistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
     * 
     */
    @JsonProperty("StreamingDistributionConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html")
    private Property<StreamingDistributionStreamingDistributionConfig> streamingDistributionConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * StreamingDistributionStreamingDistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
     * 
     */
    @JsonIgnore
    public Property<StreamingDistributionStreamingDistributionConfig> getStreamingDistributionConfig() {
        return streamingDistributionConfig;
    }

    /**
     * StreamingDistributionStreamingDistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
     * 
     */
    @JsonIgnore
    public void setStreamingDistributionConfig(Property<StreamingDistributionStreamingDistributionConfig> streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    public StreamingDistribution withStreamingDistributionConfig(Property<StreamingDistributionStreamingDistributionConfig> streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public StreamingDistribution withTags(List<Property<Tag>> tags) {
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
