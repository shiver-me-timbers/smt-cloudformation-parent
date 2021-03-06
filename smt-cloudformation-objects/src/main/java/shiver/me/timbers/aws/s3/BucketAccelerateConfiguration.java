
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
 * BucketAccelerateConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccelerationStatus"
})
public class BucketAccelerateConfiguration implements Property<BucketAccelerateConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus
     * 
     */
    @JsonProperty("AccelerationStatus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus")
    private CharSequence accelerationStatus;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus
     * 
     */
    @JsonIgnore
    public CharSequence getAccelerationStatus() {
        return accelerationStatus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus
     * 
     */
    @JsonIgnore
    public void setAccelerationStatus(CharSequence accelerationStatus) {
        this.accelerationStatus = accelerationStatus;
    }

    public BucketAccelerateConfiguration withAccelerationStatus(CharSequence accelerationStatus) {
        this.accelerationStatus = accelerationStatus;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accelerationStatus", accelerationStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accelerationStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketAccelerateConfiguration) == false) {
            return false;
        }
        BucketAccelerateConfiguration rhs = ((BucketAccelerateConfiguration) other);
        return new EqualsBuilder().append(accelerationStatus, rhs.accelerationStatus).isEquals();
    }

}
