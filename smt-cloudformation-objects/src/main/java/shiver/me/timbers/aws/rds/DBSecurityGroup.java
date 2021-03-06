
package shiver.me.timbers.aws.rds;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * DBSecurityGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DBSecurityGroupIngress",
    "EC2VpcId",
    "GroupDescription",
    "Tags"
})
public class DBSecurityGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress
     * 
     */
    @JsonProperty("DBSecurityGroupIngress")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress")
    private Set<Property<DBSecurityGroupIngress>> dBSecurityGroupIngress = new LinkedHashSet<Property<DBSecurityGroupIngress>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-ec2vpcid
     * 
     */
    @JsonProperty("EC2VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-ec2vpcid")
    private CharSequence eC2VpcId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-groupdescription
     * 
     */
    @JsonProperty("GroupDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-groupdescription")
    private CharSequence groupDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress
     * 
     */
    @JsonIgnore
    public Set<Property<DBSecurityGroupIngress>> getDBSecurityGroupIngress() {
        return dBSecurityGroupIngress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress
     * 
     */
    @JsonIgnore
    public void setDBSecurityGroupIngress(Set<Property<DBSecurityGroupIngress>> dBSecurityGroupIngress) {
        this.dBSecurityGroupIngress = dBSecurityGroupIngress;
    }

    public DBSecurityGroup withDBSecurityGroupIngress(Set<Property<DBSecurityGroupIngress>> dBSecurityGroupIngress) {
        this.dBSecurityGroupIngress = dBSecurityGroupIngress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-ec2vpcid
     * 
     */
    @JsonIgnore
    public CharSequence getEC2VpcId() {
        return eC2VpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-ec2vpcid
     * 
     */
    @JsonIgnore
    public void setEC2VpcId(CharSequence eC2VpcId) {
        this.eC2VpcId = eC2VpcId;
    }

    public DBSecurityGroup withEC2VpcId(CharSequence eC2VpcId) {
        this.eC2VpcId = eC2VpcId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-groupdescription
     * 
     */
    @JsonIgnore
    public CharSequence getGroupDescription() {
        return groupDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-groupdescription
     * 
     */
    @JsonIgnore
    public void setGroupDescription(CharSequence groupDescription) {
        this.groupDescription = groupDescription;
    }

    public DBSecurityGroup withGroupDescription(CharSequence groupDescription) {
        this.groupDescription = groupDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public DBSecurityGroup withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dBSecurityGroupIngress", dBSecurityGroupIngress).append("eC2VpcId", eC2VpcId).append("groupDescription", groupDescription).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dBSecurityGroupIngress).append(eC2VpcId).append(groupDescription).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBSecurityGroup) == false) {
            return false;
        }
        DBSecurityGroup rhs = ((DBSecurityGroup) other);
        return new EqualsBuilder().append(dBSecurityGroupIngress, rhs.dBSecurityGroupIngress).append(eC2VpcId, rhs.eC2VpcId).append(groupDescription, rhs.groupDescription).append(tags, rhs.tags).isEquals();
    }

}
