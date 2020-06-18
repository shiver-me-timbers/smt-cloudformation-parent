
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
 * ClusterOpenMonitoring
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Prometheus"
})
public class ClusterOpenMonitoring implements Property<ClusterOpenMonitoring>
{

    /**
     * ClusterPrometheus
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html
     * 
     */
    @JsonProperty("Prometheus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html")
    private Property<ClusterPrometheus> prometheus;

    /**
     * ClusterPrometheus
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html
     * 
     */
    @JsonIgnore
    public Property<ClusterPrometheus> getPrometheus() {
        return prometheus;
    }

    /**
     * ClusterPrometheus
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html
     * 
     */
    @JsonIgnore
    public void setPrometheus(Property<ClusterPrometheus> prometheus) {
        this.prometheus = prometheus;
    }

    public ClusterOpenMonitoring withPrometheus(Property<ClusterPrometheus> prometheus) {
        this.prometheus = prometheus;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("prometheus", prometheus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(prometheus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterOpenMonitoring) == false) {
            return false;
        }
        ClusterOpenMonitoring rhs = ((ClusterOpenMonitoring) other);
        return new EqualsBuilder().append(prometheus, rhs.prometheus).isEquals();
    }

}
