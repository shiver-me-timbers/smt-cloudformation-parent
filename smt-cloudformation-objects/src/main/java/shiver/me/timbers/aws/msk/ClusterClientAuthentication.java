
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
 * ClusterClientAuthentication
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Tls"
})
public class ClusterClientAuthentication implements Property<ClusterClientAuthentication>
{

    /**
     * ClusterTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html
     * 
     */
    @JsonProperty("Tls")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html")
    private Property<ClusterTls> tls;

    /**
     * ClusterTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html
     * 
     */
    @JsonIgnore
    public Property<ClusterTls> getTls() {
        return tls;
    }

    /**
     * ClusterTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html
     * 
     */
    @JsonIgnore
    public void setTls(Property<ClusterTls> tls) {
        this.tls = tls;
    }

    public ClusterClientAuthentication withTls(Property<ClusterTls> tls) {
        this.tls = tls;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tls", tls).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tls).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterClientAuthentication) == false) {
            return false;
        }
        ClusterClientAuthentication rhs = ((ClusterClientAuthentication) other);
        return new EqualsBuilder().append(tls, rhs.tls).isEquals();
    }

}
