
package shiver.me.timbers.aws.ssm;

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
 * AssociationS3OutputLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OutputS3Region",
    "OutputS3BucketName",
    "OutputS3KeyPrefix"
})
public class AssociationS3OutputLocation implements Property<AssociationS3OutputLocation>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3region
     * 
     */
    @JsonProperty("OutputS3Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3region")
    private CharSequence outputS3Region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname
     * 
     */
    @JsonProperty("OutputS3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname")
    private CharSequence outputS3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix
     * 
     */
    @JsonProperty("OutputS3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix")
    private CharSequence outputS3KeyPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3region
     * 
     */
    @JsonIgnore
    public CharSequence getOutputS3Region() {
        return outputS3Region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3region
     * 
     */
    @JsonIgnore
    public void setOutputS3Region(CharSequence outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    public AssociationS3OutputLocation withOutputS3Region(CharSequence outputS3Region) {
        this.outputS3Region = outputS3Region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname
     * 
     */
    @JsonIgnore
    public void setOutputS3BucketName(CharSequence outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    public AssociationS3OutputLocation withOutputS3BucketName(CharSequence outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix
     * 
     */
    @JsonIgnore
    public CharSequence getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix
     * 
     */
    @JsonIgnore
    public void setOutputS3KeyPrefix(CharSequence outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    public AssociationS3OutputLocation withOutputS3KeyPrefix(CharSequence outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("outputS3Region", outputS3Region).append("outputS3BucketName", outputS3BucketName).append("outputS3KeyPrefix", outputS3KeyPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputS3BucketName).append(outputS3Region).append(outputS3KeyPrefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssociationS3OutputLocation) == false) {
            return false;
        }
        AssociationS3OutputLocation rhs = ((AssociationS3OutputLocation) other);
        return new EqualsBuilder().append(outputS3BucketName, rhs.outputS3BucketName).append(outputS3Region, rhs.outputS3Region).append(outputS3KeyPrefix, rhs.outputS3KeyPrefix).isEquals();
    }

}
