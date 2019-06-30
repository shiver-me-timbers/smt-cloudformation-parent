
package aws.codepipeline;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CustomActionTypeArtifactDetails
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaximumCount",
    "MinimumCount"
})
public class CustomActionTypeArtifactDetails implements Property<CustomActionTypeArtifactDetails>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount
     * 
     */
    @JsonProperty("MaximumCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount")
    private Number maximumCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount
     * 
     */
    @JsonProperty("MinimumCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount")
    private Number minimumCount;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount
     * 
     */
    @JsonIgnore
    public Number getMaximumCount() {
        return maximumCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount
     * 
     */
    @JsonIgnore
    public void setMaximumCount(Number maximumCount) {
        this.maximumCount = maximumCount;
    }

    public CustomActionTypeArtifactDetails withMaximumCount(Number maximumCount) {
        this.maximumCount = maximumCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount
     * 
     */
    @JsonIgnore
    public Number getMinimumCount() {
        return minimumCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount
     * 
     */
    @JsonIgnore
    public void setMinimumCount(Number minimumCount) {
        this.minimumCount = minimumCount;
    }

    public CustomActionTypeArtifactDetails withMinimumCount(Number minimumCount) {
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
        if ((other instanceof CustomActionTypeArtifactDetails) == false) {
            return false;
        }
        CustomActionTypeArtifactDetails rhs = ((CustomActionTypeArtifactDetails) other);
        return new EqualsBuilder().append(maximumCount, rhs.maximumCount).append(minimumCount, rhs.minimumCount).isEquals();
    }

}
