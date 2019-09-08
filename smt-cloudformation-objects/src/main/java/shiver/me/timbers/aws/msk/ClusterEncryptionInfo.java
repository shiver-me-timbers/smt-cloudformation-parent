
package shiver.me.timbers.aws.msk;

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
 * ClusterEncryptionInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EncryptionAtRest",
    "EncryptionInTransit"
})
public class ClusterEncryptionInfo implements Property<ClusterEncryptionInfo>
{

    /**
     * ClusterEncryptionAtRest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html
     * 
     */
    @JsonProperty("EncryptionAtRest")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html")
    private Property<ClusterEncryptionAtRest> encryptionAtRest;
    /**
     * ClusterEncryptionInTransit
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html
     * 
     */
    @JsonProperty("EncryptionInTransit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html")
    private Property<ClusterEncryptionInTransit> encryptionInTransit;

    /**
     * ClusterEncryptionAtRest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html
     * 
     */
    @JsonIgnore
    public Property<ClusterEncryptionAtRest> getEncryptionAtRest() {
        return encryptionAtRest;
    }

    /**
     * ClusterEncryptionAtRest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html
     * 
     */
    @JsonIgnore
    public void setEncryptionAtRest(Property<ClusterEncryptionAtRest> encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
    }

    public ClusterEncryptionInfo withEncryptionAtRest(Property<ClusterEncryptionAtRest> encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
        return this;
    }

    /**
     * ClusterEncryptionInTransit
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html
     * 
     */
    @JsonIgnore
    public Property<ClusterEncryptionInTransit> getEncryptionInTransit() {
        return encryptionInTransit;
    }

    /**
     * ClusterEncryptionInTransit
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html
     * 
     */
    @JsonIgnore
    public void setEncryptionInTransit(Property<ClusterEncryptionInTransit> encryptionInTransit) {
        this.encryptionInTransit = encryptionInTransit;
    }

    public ClusterEncryptionInfo withEncryptionInTransit(Property<ClusterEncryptionInTransit> encryptionInTransit) {
        this.encryptionInTransit = encryptionInTransit;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encryptionAtRest", encryptionAtRest).append("encryptionInTransit", encryptionInTransit).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encryptionInTransit).append(encryptionAtRest).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterEncryptionInfo) == false) {
            return false;
        }
        ClusterEncryptionInfo rhs = ((ClusterEncryptionInfo) other);
        return new EqualsBuilder().append(encryptionInTransit, rhs.encryptionInTransit).append(encryptionAtRest, rhs.encryptionAtRest).isEquals();
    }

}
