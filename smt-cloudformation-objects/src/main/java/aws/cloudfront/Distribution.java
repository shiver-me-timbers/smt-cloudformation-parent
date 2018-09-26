
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
 * Distribution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DistributionConfig",
    "Tags"
})
public class Distribution {

    /**
     * DistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html
     * 
     */
    @JsonProperty("DistributionConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html")
    private DistributionConfig distributionConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * DistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html
     * 
     */
    public DistributionConfig getDistributionConfig() {
        return distributionConfig;
    }

    /**
     * DistributionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html
     * 
     */
    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    public Distribution withDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Distribution withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("distributionConfig", distributionConfig).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(distributionConfig).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Distribution) == false) {
            return false;
        }
        Distribution rhs = ((Distribution) other);
        return new EqualsBuilder().append(distributionConfig, rhs.distributionConfig).append(tags, rhs.tags).isEquals();
    }

}
