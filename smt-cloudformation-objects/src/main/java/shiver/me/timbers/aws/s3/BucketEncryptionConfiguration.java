
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
 * BucketEncryptionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReplicaKmsKeyID"
})
public class BucketEncryptionConfiguration implements Property<BucketEncryptionConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid
     * 
     */
    @JsonProperty("ReplicaKmsKeyID")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid")
    private CharSequence replicaKmsKeyID;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getReplicaKmsKeyID() {
        return replicaKmsKeyID;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid
     * 
     */
    @JsonIgnore
    public void setReplicaKmsKeyID(CharSequence replicaKmsKeyID) {
        this.replicaKmsKeyID = replicaKmsKeyID;
    }

    public BucketEncryptionConfiguration withReplicaKmsKeyID(CharSequence replicaKmsKeyID) {
        this.replicaKmsKeyID = replicaKmsKeyID;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replicaKmsKeyID", replicaKmsKeyID).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(replicaKmsKeyID).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketEncryptionConfiguration) == false) {
            return false;
        }
        BucketEncryptionConfiguration rhs = ((BucketEncryptionConfiguration) other);
        return new EqualsBuilder().append(replicaKmsKeyID, rhs.replicaKmsKeyID).isEquals();
    }

}
