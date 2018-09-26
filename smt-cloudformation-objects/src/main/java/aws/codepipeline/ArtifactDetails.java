
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ArtifactDetails
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MaximumCount",
    "MinimumCount"
})
public class ArtifactDetails {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount
     * 
     */
    @JsonProperty("MaximumCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount")
    private Integer maximumCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount
     * 
     */
    @JsonProperty("MinimumCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount")
    private Integer minimumCount;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount
     * 
     */
    public Integer getMaximumCount() {
        return maximumCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount
     * 
     */
    public void setMaximumCount(Integer maximumCount) {
        this.maximumCount = maximumCount;
    }

    public ArtifactDetails withMaximumCount(Integer maximumCount) {
        this.maximumCount = maximumCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount
     * 
     */
    public Integer getMinimumCount() {
        return minimumCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount
     * 
     */
    public void setMinimumCount(Integer minimumCount) {
        this.minimumCount = minimumCount;
    }

    public ArtifactDetails withMinimumCount(Integer minimumCount) {
        this.minimumCount = minimumCount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maximumCount", maximumCount).append("minimumCount", minimumCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maximumCount).append(minimumCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArtifactDetails) == false) {
            return false;
        }
        ArtifactDetails rhs = ((ArtifactDetails) other);
        return new EqualsBuilder().append(maximumCount, rhs.maximumCount).append(minimumCount, rhs.minimumCount).isEquals();
    }

}
