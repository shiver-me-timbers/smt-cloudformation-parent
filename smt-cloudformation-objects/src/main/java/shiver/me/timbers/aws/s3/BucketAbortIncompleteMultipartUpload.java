
package shiver.me.timbers.aws.s3;

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
 * BucketAbortIncompleteMultipartUpload
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DaysAfterInitiation"
})
public class BucketAbortIncompleteMultipartUpload implements Property<BucketAbortIncompleteMultipartUpload>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation
     * 
     */
    @JsonProperty("DaysAfterInitiation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation")
    private Number daysAfterInitiation;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation
     * 
     */
    @JsonIgnore
    public Number getDaysAfterInitiation() {
        return daysAfterInitiation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation
     * 
     */
    @JsonIgnore
    public void setDaysAfterInitiation(Number daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    public BucketAbortIncompleteMultipartUpload withDaysAfterInitiation(Number daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("daysAfterInitiation", daysAfterInitiation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(daysAfterInitiation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketAbortIncompleteMultipartUpload) == false) {
            return false;
        }
        BucketAbortIncompleteMultipartUpload rhs = ((BucketAbortIncompleteMultipartUpload) other);
        return new EqualsBuilder().append(daysAfterInitiation, rhs.daysAfterInitiation).isEquals();
    }

}
