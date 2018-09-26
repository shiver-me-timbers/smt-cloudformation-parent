
package aws.rds;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DBSubnetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DBSubnetGroupDescription",
    "DBSubnetGroupName",
    "SubnetIds",
    "Tags"
})
public class DBSubnetGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription
     * 
     */
    @JsonProperty("DBSubnetGroupDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription")
    private CharSequence dBSubnetGroupDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname")
    private CharSequence dBSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-subnetids")
    private Set<CharSequence> subnetIds = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription
     * 
     */
    public CharSequence getDBSubnetGroupDescription() {
        return dBSubnetGroupDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription
     * 
     */
    public void setDBSubnetGroupDescription(CharSequence dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
    }

    public DBSubnetGroup withDBSubnetGroupDescription(CharSequence dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname
     * 
     */
    public CharSequence getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname
     * 
     */
    public void setDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    public DBSubnetGroup withDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-subnetids
     * 
     */
    public Set<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-subnetids
     * 
     */
    public void setSubnetIds(Set<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public DBSubnetGroup withSubnetIds(Set<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DBSubnetGroup withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dBSubnetGroupDescription", dBSubnetGroupDescription).append("dBSubnetGroupName", dBSubnetGroupName).append("subnetIds", subnetIds).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dBSubnetGroupDescription).append(dBSubnetGroupName).append(subnetIds).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBSubnetGroup) == false) {
            return false;
        }
        DBSubnetGroup rhs = ((DBSubnetGroup) other);
        return new EqualsBuilder().append(dBSubnetGroupDescription, rhs.dBSubnetGroupDescription).append(dBSubnetGroupName, rhs.dBSubnetGroupName).append(subnetIds, rhs.subnetIds).append(tags, rhs.tags).isEquals();
    }

}
