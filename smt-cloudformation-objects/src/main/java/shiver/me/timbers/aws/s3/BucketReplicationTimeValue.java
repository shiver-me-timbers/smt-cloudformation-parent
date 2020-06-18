
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
 * BucketReplicationTimeValue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Minutes"
})
public class BucketReplicationTimeValue implements Property<BucketReplicationTimeValue>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html#cfn-s3-bucket-replicationtimevalue-minutes
     * 
     */
    @JsonProperty("Minutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html#cfn-s3-bucket-replicationtimevalue-minutes")
    private Number minutes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html#cfn-s3-bucket-replicationtimevalue-minutes
     * 
     */
    @JsonIgnore
    public Number getMinutes() {
        return minutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html#cfn-s3-bucket-replicationtimevalue-minutes
     * 
     */
    @JsonIgnore
    public void setMinutes(Number minutes) {
        this.minutes = minutes;
    }

    public BucketReplicationTimeValue withMinutes(Number minutes) {
        this.minutes = minutes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minutes", minutes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minutes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketReplicationTimeValue) == false) {
            return false;
        }
        BucketReplicationTimeValue rhs = ((BucketReplicationTimeValue) other);
        return new EqualsBuilder().append(minutes, rhs.minutes).isEquals();
    }

}
