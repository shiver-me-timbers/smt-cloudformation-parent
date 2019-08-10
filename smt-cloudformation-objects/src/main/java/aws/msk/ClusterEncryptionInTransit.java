
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
 * ClusterEncryptionInTransit
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientBroker",
    "InCluster"
})
public class ClusterEncryptionInTransit implements Property<ClusterEncryptionInTransit>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker
     * 
     */
    @JsonProperty("ClientBroker")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker")
    private CharSequence clientBroker;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-incluster
     * 
     */
    @JsonProperty("InCluster")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-incluster")
    private CharSequence inCluster;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker
     * 
     */
    @JsonIgnore
    public CharSequence getClientBroker() {
        return clientBroker;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-clientbroker
     * 
     */
    @JsonIgnore
    public void setClientBroker(CharSequence clientBroker) {
        this.clientBroker = clientBroker;
    }

    public ClusterEncryptionInTransit withClientBroker(CharSequence clientBroker) {
        this.clientBroker = clientBroker;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-incluster
     * 
     */
    @JsonIgnore
    public CharSequence getInCluster() {
        return inCluster;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html#cfn-msk-cluster-encryptionintransit-incluster
     * 
     */
    @JsonIgnore
    public void setInCluster(CharSequence inCluster) {
        this.inCluster = inCluster;
    }

    public ClusterEncryptionInTransit withInCluster(CharSequence inCluster) {
        this.inCluster = inCluster;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientBroker", clientBroker).append("inCluster", inCluster).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientBroker).append(inCluster).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterEncryptionInTransit) == false) {
            return false;
        }
        ClusterEncryptionInTransit rhs = ((ClusterEncryptionInTransit) other);
        return new EqualsBuilder().append(clientBroker, rhs.clientBroker).append(inCluster, rhs.inCluster).isEquals();
    }

}
