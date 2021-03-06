
package shiver.me.timbers.aws.dms;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * ReplicationSubnetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReplicationSubnetGroupDescription",
    "ReplicationSubnetGroupIdentifier",
    "SubnetIds",
    "Tags"
})
public class ReplicationSubnetGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription
     * 
     */
    @JsonProperty("ReplicationSubnetGroupDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription")
    private CharSequence replicationSubnetGroupDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier
     * 
     */
    @JsonProperty("ReplicationSubnetGroupIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier")
    private CharSequence replicationSubnetGroupIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids")
    private List<CharSequence> subnetIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription
     * 
     */
    @JsonIgnore
    public CharSequence getReplicationSubnetGroupDescription() {
        return replicationSubnetGroupDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription
     * 
     */
    @JsonIgnore
    public void setReplicationSubnetGroupDescription(CharSequence replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
    }

    public ReplicationSubnetGroup withReplicationSubnetGroupDescription(CharSequence replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getReplicationSubnetGroupIdentifier() {
        return replicationSubnetGroupIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier
     * 
     */
    @JsonIgnore
    public void setReplicationSubnetGroupIdentifier(CharSequence replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    public ReplicationSubnetGroup withReplicationSubnetGroupIdentifier(CharSequence replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids
     * 
     */
    @JsonIgnore
    public void setSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public ReplicationSubnetGroup withSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public ReplicationSubnetGroup withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replicationSubnetGroupDescription", replicationSubnetGroupDescription).append("replicationSubnetGroupIdentifier", replicationSubnetGroupIdentifier).append("subnetIds", subnetIds).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(replicationSubnetGroupDescription).append(replicationSubnetGroupIdentifier).append(subnetIds).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationSubnetGroup) == false) {
            return false;
        }
        ReplicationSubnetGroup rhs = ((ReplicationSubnetGroup) other);
        return new EqualsBuilder().append(replicationSubnetGroupDescription, rhs.replicationSubnetGroupDescription).append(replicationSubnetGroupIdentifier, rhs.replicationSubnetGroupIdentifier).append(subnetIds, rhs.subnetIds).append(tags, rhs.tags).isEquals();
    }

}
