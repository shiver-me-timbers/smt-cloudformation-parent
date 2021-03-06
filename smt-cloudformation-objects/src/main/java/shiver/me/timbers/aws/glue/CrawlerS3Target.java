
package shiver.me.timbers.aws.glue;

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


/**
 * CrawlerS3Target
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Path",
    "Exclusions"
})
public class CrawlerS3Target implements Property<CrawlerS3Target>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path")
    private CharSequence path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions
     * 
     */
    @JsonProperty("Exclusions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions")
    private List<CharSequence> exclusions = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path
     * 
     */
    @JsonIgnore
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path
     * 
     */
    @JsonIgnore
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public CrawlerS3Target withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getExclusions() {
        return exclusions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions
     * 
     */
    @JsonIgnore
    public void setExclusions(List<CharSequence> exclusions) {
        this.exclusions = exclusions;
    }

    public CrawlerS3Target withExclusions(List<CharSequence> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("path", path).append("exclusions", exclusions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(exclusions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrawlerS3Target) == false) {
            return false;
        }
        CrawlerS3Target rhs = ((CrawlerS3Target) other);
        return new EqualsBuilder().append(path, rhs.path).append(exclusions, rhs.exclusions).isEquals();
    }

}
