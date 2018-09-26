
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AbortIncompleteMultipartUpload
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DaysAfterInitiation"
})
public class AbortIncompleteMultipartUpload {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation
     * 
     */
    @JsonProperty("DaysAfterInitiation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation")
    private Integer daysAfterInitiation;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation
     * 
     */
    public Integer getDaysAfterInitiation() {
        return daysAfterInitiation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation
     * 
     */
    public void setDaysAfterInitiation(Integer daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    public AbortIncompleteMultipartUpload withDaysAfterInitiation(Integer daysAfterInitiation) {
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
        if ((other instanceof AbortIncompleteMultipartUpload) == false) {
            return false;
        }
        AbortIncompleteMultipartUpload rhs = ((AbortIncompleteMultipartUpload) other);
        return new EqualsBuilder().append(daysAfterInitiation, rhs.daysAfterInitiation).isEquals();
    }

}
