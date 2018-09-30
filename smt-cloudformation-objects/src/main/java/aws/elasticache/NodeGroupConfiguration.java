
package aws.elasticache;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NodeGroupConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NodeGroupId",
    "PrimaryAvailabilityZone",
    "ReplicaAvailabilityZones",
    "ReplicaCount",
    "Slots"
})
public class NodeGroupConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-nodegroupid
     * 
     */
    @JsonProperty("NodeGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-nodegroupid")
    private CharSequence nodeGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone
     * 
     */
    @JsonProperty("PrimaryAvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone")
    private CharSequence primaryAvailabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones
     * 
     */
    @JsonProperty("ReplicaAvailabilityZones")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones")
    private Set<CharSequence> replicaAvailabilityZones = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount
     * 
     */
    @JsonProperty("ReplicaCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount")
    private Integer replicaCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots
     * 
     */
    @JsonProperty("Slots")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots")
    private CharSequence slots;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-nodegroupid
     * 
     */
    @JsonIgnore
    public CharSequence getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-nodegroupid
     * 
     */
    @JsonIgnore
    public void setNodeGroupId(CharSequence nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    public NodeGroupConfiguration withNodeGroupId(CharSequence nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getPrimaryAvailabilityZone() {
        return primaryAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone
     * 
     */
    @JsonIgnore
    public void setPrimaryAvailabilityZone(CharSequence primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
    }

    public NodeGroupConfiguration withPrimaryAvailabilityZone(CharSequence primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getReplicaAvailabilityZones() {
        return replicaAvailabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones
     * 
     */
    @JsonIgnore
    public void setReplicaAvailabilityZones(Set<CharSequence> replicaAvailabilityZones) {
        this.replicaAvailabilityZones = replicaAvailabilityZones;
    }

    public NodeGroupConfiguration withReplicaAvailabilityZones(Set<CharSequence> replicaAvailabilityZones) {
        this.replicaAvailabilityZones = replicaAvailabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount
     * 
     */
    @JsonIgnore
    public Integer getReplicaCount() {
        return replicaCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount
     * 
     */
    @JsonIgnore
    public void setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
    }

    public NodeGroupConfiguration withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots
     * 
     */
    @JsonIgnore
    public CharSequence getSlots() {
        return slots;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots
     * 
     */
    @JsonIgnore
    public void setSlots(CharSequence slots) {
        this.slots = slots;
    }

    public NodeGroupConfiguration withSlots(CharSequence slots) {
        this.slots = slots;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nodeGroupId", nodeGroupId).append("primaryAvailabilityZone", primaryAvailabilityZone).append("replicaAvailabilityZones", replicaAvailabilityZones).append("replicaCount", replicaCount).append("slots", slots).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(primaryAvailabilityZone).append(replicaCount).append(slots).append(nodeGroupId).append(replicaAvailabilityZones).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeGroupConfiguration) == false) {
            return false;
        }
        NodeGroupConfiguration rhs = ((NodeGroupConfiguration) other);
        return new EqualsBuilder().append(primaryAvailabilityZone, rhs.primaryAvailabilityZone).append(replicaCount, rhs.replicaCount).append(slots, rhs.slots).append(nodeGroupId, rhs.nodeGroupId).append(replicaAvailabilityZones, rhs.replicaAvailabilityZones).isEquals();
    }

}
