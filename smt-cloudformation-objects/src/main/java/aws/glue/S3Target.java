
package aws.glue;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3Target
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Path",
    "Exclusions"
})
public class S3Target {

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
    public CharSequence getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path
     * 
     */
    public void setPath(CharSequence path) {
        this.path = path;
    }

    public S3Target withPath(CharSequence path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions
     * 
     */
    public List<CharSequence> getExclusions() {
        return exclusions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions
     * 
     */
    public void setExclusions(List<CharSequence> exclusions) {
        this.exclusions = exclusions;
    }

    public S3Target withExclusions(List<CharSequence> exclusions) {
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
        if ((other instanceof S3Target) == false) {
            return false;
        }
        S3Target rhs = ((S3Target) other);
        return new EqualsBuilder().append(path, rhs.path).append(exclusions, rhs.exclusions).isEquals();
    }

}
