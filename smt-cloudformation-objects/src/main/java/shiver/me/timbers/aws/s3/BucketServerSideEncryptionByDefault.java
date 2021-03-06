
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
 * BucketServerSideEncryptionByDefault
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KMSMasterKeyID",
    "SSEAlgorithm"
})
public class BucketServerSideEncryptionByDefault implements Property<BucketServerSideEncryptionByDefault>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid
     * 
     */
    @JsonProperty("KMSMasterKeyID")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid")
    private CharSequence kMSMasterKeyID;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm
     * 
     */
    @JsonProperty("SSEAlgorithm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm")
    private CharSequence sSEAlgorithm;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKMSMasterKeyID() {
        return kMSMasterKeyID;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public void setKMSMasterKeyID(CharSequence kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
    }

    public BucketServerSideEncryptionByDefault withKMSMasterKeyID(CharSequence kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm
     * 
     */
    @JsonIgnore
    public CharSequence getSSEAlgorithm() {
        return sSEAlgorithm;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm
     * 
     */
    @JsonIgnore
    public void setSSEAlgorithm(CharSequence sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
    }

    public BucketServerSideEncryptionByDefault withSSEAlgorithm(CharSequence sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kMSMasterKeyID", kMSMasterKeyID).append("sSEAlgorithm", sSEAlgorithm).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kMSMasterKeyID).append(sSEAlgorithm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketServerSideEncryptionByDefault) == false) {
            return false;
        }
        BucketServerSideEncryptionByDefault rhs = ((BucketServerSideEncryptionByDefault) other);
        return new EqualsBuilder().append(kMSMasterKeyID, rhs.kMSMasterKeyID).append(sSEAlgorithm, rhs.sSEAlgorithm).isEquals();
    }

}
