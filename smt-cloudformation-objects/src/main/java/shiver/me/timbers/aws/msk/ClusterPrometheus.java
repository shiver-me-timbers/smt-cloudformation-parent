
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
 * ClusterPrometheus
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "JmxExporter",
    "NodeExporter"
})
public class ClusterPrometheus implements Property<ClusterPrometheus>
{

    /**
     * ClusterJmxExporter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html
     * 
     */
    @JsonProperty("JmxExporter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html")
    private Property<ClusterJmxExporter> jmxExporter;
    /**
     * ClusterNodeExporter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html
     * 
     */
    @JsonProperty("NodeExporter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html")
    private Property<ClusterNodeExporter> nodeExporter;

    /**
     * ClusterJmxExporter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html
     * 
     */
    @JsonIgnore
    public Property<ClusterJmxExporter> getJmxExporter() {
        return jmxExporter;
    }

    /**
     * ClusterJmxExporter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html
     * 
     */
    @JsonIgnore
    public void setJmxExporter(Property<ClusterJmxExporter> jmxExporter) {
        this.jmxExporter = jmxExporter;
    }

    public ClusterPrometheus withJmxExporter(Property<ClusterJmxExporter> jmxExporter) {
        this.jmxExporter = jmxExporter;
        return this;
    }

    /**
     * ClusterNodeExporter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html
     * 
     */
    @JsonIgnore
    public Property<ClusterNodeExporter> getNodeExporter() {
        return nodeExporter;
    }

    /**
     * ClusterNodeExporter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html
     * 
     */
    @JsonIgnore
    public void setNodeExporter(Property<ClusterNodeExporter> nodeExporter) {
        this.nodeExporter = nodeExporter;
    }

    public ClusterPrometheus withNodeExporter(Property<ClusterNodeExporter> nodeExporter) {
        this.nodeExporter = nodeExporter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jmxExporter", jmxExporter).append("nodeExporter", nodeExporter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nodeExporter).append(jmxExporter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterPrometheus) == false) {
            return false;
        }
        ClusterPrometheus rhs = ((ClusterPrometheus) other);
        return new EqualsBuilder().append(nodeExporter, rhs.nodeExporter).append(jmxExporter, rhs.jmxExporter).isEquals();
    }

}
