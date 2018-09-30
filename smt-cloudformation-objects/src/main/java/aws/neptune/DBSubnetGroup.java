
package aws.neptune;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DBSubnetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DBSubnetGroupName",
    "DBSubnetGroupDescription",
    "SubnetIds",
    "Tags"
})
public class DBSubnetGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname")
    private CharSequence dBSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription
     * 
     */
    @JsonProperty("DBSubnetGroupDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription")
    private CharSequence dBSubnetGroupDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids")
    private List<CharSequence> subnetIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname
     * 
     */
    public CharSequence getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription
     * 
     */
    public CharSequence getDBSubnetGroupDescription() {
        return dBSubnetGroupDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids
     * 
     */
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids
     * 
     */
    public void setSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public DBSubnetGroup withSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags
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
        return new ToStringBuilder(this).append("dBSubnetGroupName", dBSubnetGroupName).append("dBSubnetGroupDescription", dBSubnetGroupDescription).append("subnetIds", subnetIds).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dBSubnetGroupName).append(dBSubnetGroupDescription).append(subnetIds).append(tags).toHashCode();
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
        return new EqualsBuilder().append(dBSubnetGroupName, rhs.dBSubnetGroupName).append(dBSubnetGroupDescription, rhs.dBSubnetGroupDescription).append(subnetIds, rhs.subnetIds).append(tags, rhs.tags).isEquals();
    }

}
