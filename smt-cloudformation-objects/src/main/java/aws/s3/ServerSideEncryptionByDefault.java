
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ServerSideEncryptionByDefault
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "KMSMasterKeyID",
    "SSEAlgorithm"
})
public class ServerSideEncryptionByDefault {

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
    public CharSequence getKMSMasterKeyID() {
        return kMSMasterKeyID;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid
     * 
     */
    public void setKMSMasterKeyID(CharSequence kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
    }

    public ServerSideEncryptionByDefault withKMSMasterKeyID(CharSequence kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm
     * 
     */
    public CharSequence getSSEAlgorithm() {
        return sSEAlgorithm;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm
     * 
     */
    public void setSSEAlgorithm(CharSequence sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
    }

    public ServerSideEncryptionByDefault withSSEAlgorithm(CharSequence sSEAlgorithm) {
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
        if ((other instanceof ServerSideEncryptionByDefault) == false) {
            return false;
        }
        ServerSideEncryptionByDefault rhs = ((ServerSideEncryptionByDefault) other);
        return new EqualsBuilder().append(kMSMasterKeyID, rhs.kMSMasterKeyID).append(sSEAlgorithm, rhs.sSEAlgorithm).isEquals();
    }

}
