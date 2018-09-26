
package aws.ec2;

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
 * SecurityGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GroupDescription",
    "GroupName",
    "SecurityGroupEgress",
    "SecurityGroupIngress",
    "Tags",
    "VpcId"
})
public class SecurityGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupdescription
     * 
     */
    @JsonProperty("GroupDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupdescription")
    private CharSequence groupDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupname")
    private CharSequence groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupegress
     * 
     */
    @JsonProperty("SecurityGroupEgress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupegress")
    private List<Egress> securityGroupEgress = new ArrayList<Egress>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupingress
     * 
     */
    @JsonProperty("SecurityGroupIngress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupingress")
    private List<Ingress> securityGroupIngress = new ArrayList<Ingress>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupdescription
     * 
     */
    public CharSequence getGroupDescription() {
        return groupDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupdescription
     * 
     */
    public void setGroupDescription(CharSequence groupDescription) {
        this.groupDescription = groupDescription;
    }

    public SecurityGroup withGroupDescription(CharSequence groupDescription) {
        this.groupDescription = groupDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupname
     * 
     */
    public CharSequence getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupname
     * 
     */
    public void setGroupName(CharSequence groupName) {
        this.groupName = groupName;
    }

    public SecurityGroup withGroupName(CharSequence groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupegress
     * 
     */
    public List<Egress> getSecurityGroupEgress() {
        return securityGroupEgress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupegress
     * 
     */
    public void setSecurityGroupEgress(List<Egress> securityGroupEgress) {
        this.securityGroupEgress = securityGroupEgress;
    }

    public SecurityGroup withSecurityGroupEgress(List<Egress> securityGroupEgress) {
        this.securityGroupEgress = securityGroupEgress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupingress
     * 
     */
    public List<Ingress> getSecurityGroupIngress() {
        return securityGroupIngress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupingress
     * 
     */
    public void setSecurityGroupIngress(List<Ingress> securityGroupIngress) {
        this.securityGroupIngress = securityGroupIngress;
    }

    public SecurityGroup withSecurityGroupIngress(List<Ingress> securityGroupIngress) {
        this.securityGroupIngress = securityGroupIngress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public SecurityGroup withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid
     * 
     */
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public SecurityGroup withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupDescription", groupDescription).append("groupName", groupName).append("securityGroupEgress", securityGroupEgress).append("securityGroupIngress", securityGroupIngress).append("tags", tags).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupName).append(securityGroupEgress).append(securityGroupIngress).append(groupDescription).append(vpcId).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityGroup) == false) {
            return false;
        }
        SecurityGroup rhs = ((SecurityGroup) other);
        return new EqualsBuilder().append(groupName, rhs.groupName).append(securityGroupEgress, rhs.securityGroupEgress).append(securityGroupIngress, rhs.securityGroupIngress).append(groupDescription, rhs.groupDescription).append(vpcId, rhs.vpcId).append(tags, rhs.tags).isEquals();
    }

}
