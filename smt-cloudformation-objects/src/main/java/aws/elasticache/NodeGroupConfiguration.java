
package aws.elasticache;

import java.util.LinkedHashSet;
import java.util.Set;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PrimaryAvailabilityZone",
    "ReplicaAvailabilityZones",
    "ReplicaCount",
    "Slots"
})
public class NodeGroupConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone
     * 
     */
    @JsonProperty("PrimaryAvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone")
    private String primaryAvailabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones
     * 
     */
    @JsonProperty("ReplicaAvailabilityZones")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones")
    private Set<String> replicaAvailabilityZones = new LinkedHashSet<String>();
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
    private String slots;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone
     * 
     */
    @JsonProperty("PrimaryAvailabilityZone")
    public String getPrimaryAvailabilityZone() {
        return primaryAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone
     * 
     */
    @JsonProperty("PrimaryAvailabilityZone")
    public void setPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
    }

    public NodeGroupConfiguration withPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones
     * 
     */
    @JsonProperty("ReplicaAvailabilityZones")
    public Set<String> getReplicaAvailabilityZones() {
        return replicaAvailabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones
     * 
     */
    @JsonProperty("ReplicaAvailabilityZones")
    public void setReplicaAvailabilityZones(Set<String> replicaAvailabilityZones) {
        this.replicaAvailabilityZones = replicaAvailabilityZones;
    }

    public NodeGroupConfiguration withReplicaAvailabilityZones(Set<String> replicaAvailabilityZones) {
        this.replicaAvailabilityZones = replicaAvailabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount
     * 
     */
    @JsonProperty("ReplicaCount")
    public Integer getReplicaCount() {
        return replicaCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount
     * 
     */
    @JsonProperty("ReplicaCount")
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
    @JsonProperty("Slots")
    public String getSlots() {
        return slots;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots
     * 
     */
    @JsonProperty("Slots")
    public void setSlots(String slots) {
        this.slots = slots;
    }

    public NodeGroupConfiguration withSlots(String slots) {
        this.slots = slots;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("primaryAvailabilityZone", primaryAvailabilityZone).append("replicaAvailabilityZones", replicaAvailabilityZones).append("replicaCount", replicaCount).append("slots", slots).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(primaryAvailabilityZone).append(replicaCount).append(slots).append(replicaAvailabilityZones).toHashCode();
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
        return new EqualsBuilder().append(primaryAvailabilityZone, rhs.primaryAvailabilityZone).append(replicaCount, rhs.replicaCount).append(slots, rhs.slots).append(replicaAvailabilityZones, rhs.replicaAvailabilityZones).isEquals();
    }

}