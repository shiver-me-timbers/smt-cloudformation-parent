
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
 * ClusterLoggingInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BrokerLogs"
})
public class ClusterLoggingInfo implements Property<ClusterLoggingInfo>
{

    /**
     * ClusterBrokerLogs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html
     * 
     */
    @JsonProperty("BrokerLogs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html")
    private Property<ClusterBrokerLogs> brokerLogs;

    /**
     * ClusterBrokerLogs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html
     * 
     */
    @JsonIgnore
    public Property<ClusterBrokerLogs> getBrokerLogs() {
        return brokerLogs;
    }

    /**
     * ClusterBrokerLogs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html
     * 
     */
    @JsonIgnore
    public void setBrokerLogs(Property<ClusterBrokerLogs> brokerLogs) {
        this.brokerLogs = brokerLogs;
    }

    public ClusterLoggingInfo withBrokerLogs(Property<ClusterBrokerLogs> brokerLogs) {
        this.brokerLogs = brokerLogs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("brokerLogs", brokerLogs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(brokerLogs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterLoggingInfo) == false) {
            return false;
        }
        ClusterLoggingInfo rhs = ((ClusterLoggingInfo) other);
        return new EqualsBuilder().append(brokerLogs, rhs.brokerLogs).isEquals();
    }

}
