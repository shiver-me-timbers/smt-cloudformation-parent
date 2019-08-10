
package aws.msk;

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
 * ClusterEncryptionAtRest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DataVolumeKMSKeyId"
})
public class ClusterEncryptionAtRest implements Property<ClusterEncryptionAtRest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html#cfn-msk-cluster-encryptionatrest-datavolumekmskeyid
     * 
     */
    @JsonProperty("DataVolumeKMSKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html#cfn-msk-cluster-encryptionatrest-datavolumekmskeyid")
    private CharSequence dataVolumeKMSKeyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html#cfn-msk-cluster-encryptionatrest-datavolumekmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getDataVolumeKMSKeyId() {
        return dataVolumeKMSKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html#cfn-msk-cluster-encryptionatrest-datavolumekmskeyid
     * 
     */
    @JsonIgnore
    public void setDataVolumeKMSKeyId(CharSequence dataVolumeKMSKeyId) {
        this.dataVolumeKMSKeyId = dataVolumeKMSKeyId;
    }

    public ClusterEncryptionAtRest withDataVolumeKMSKeyId(CharSequence dataVolumeKMSKeyId) {
        this.dataVolumeKMSKeyId = dataVolumeKMSKeyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataVolumeKMSKeyId", dataVolumeKMSKeyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataVolumeKMSKeyId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterEncryptionAtRest) == false) {
            return false;
        }
        ClusterEncryptionAtRest rhs = ((ClusterEncryptionAtRest) other);
        return new EqualsBuilder().append(dataVolumeKMSKeyId, rhs.dataVolumeKMSKeyId).isEquals();
    }

}
