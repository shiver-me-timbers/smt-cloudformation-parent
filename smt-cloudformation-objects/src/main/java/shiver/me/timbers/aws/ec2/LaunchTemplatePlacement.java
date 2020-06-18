
package shiver.me.timbers.aws.ec2;

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
 * LaunchTemplatePlacement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GroupName",
    "Tenancy",
    "SpreadDomain",
    "PartitionNumber",
    "AvailabilityZone",
    "Affinity",
    "HostId",
    "HostResourceGroupArn"
})
public class LaunchTemplatePlacement implements Property<LaunchTemplatePlacement>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname")
    private CharSequence groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy")
    private CharSequence tenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-spreaddomain
     * 
     */
    @JsonProperty("SpreadDomain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-spreaddomain")
    private CharSequence spreadDomain;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-partitionnumber
     * 
     */
    @JsonProperty("PartitionNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-partitionnumber")
    private Number partitionNumber;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity
     * 
     */
    @JsonProperty("Affinity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity")
    private CharSequence affinity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid
     * 
     */
    @JsonProperty("HostId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid")
    private CharSequence hostId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostresourcegrouparn
     * 
     */
    @JsonProperty("HostResourceGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostresourcegrouparn")
    private CharSequence hostResourceGroupArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname
     * 
     */
    @JsonIgnore
    public CharSequence getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname
     * 
     */
    @JsonIgnore
    public void setGroupName(CharSequence groupName) {
        this.groupName = groupName;
    }

    public LaunchTemplatePlacement withGroupName(CharSequence groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy
     * 
     */
    @JsonIgnore
    public CharSequence getTenancy() {
        return tenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy
     * 
     */
    @JsonIgnore
    public void setTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
    }

    public LaunchTemplatePlacement withTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-spreaddomain
     * 
     */
    @JsonIgnore
    public CharSequence getSpreadDomain() {
        return spreadDomain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-spreaddomain
     * 
     */
    @JsonIgnore
    public void setSpreadDomain(CharSequence spreadDomain) {
        this.spreadDomain = spreadDomain;
    }

    public LaunchTemplatePlacement withSpreadDomain(CharSequence spreadDomain) {
        this.spreadDomain = spreadDomain;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-partitionnumber
     * 
     */
    @JsonIgnore
    public Number getPartitionNumber() {
        return partitionNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-partitionnumber
     * 
     */
    @JsonIgnore
    public void setPartitionNumber(Number partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public LaunchTemplatePlacement withPartitionNumber(Number partitionNumber) {
        this.partitionNumber = partitionNumber;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone
     * 
     */
    @JsonIgnore
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public LaunchTemplatePlacement withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity
     * 
     */
    @JsonIgnore
    public CharSequence getAffinity() {
        return affinity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity
     * 
     */
    @JsonIgnore
    public void setAffinity(CharSequence affinity) {
        this.affinity = affinity;
    }

    public LaunchTemplatePlacement withAffinity(CharSequence affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid
     * 
     */
    @JsonIgnore
    public CharSequence getHostId() {
        return hostId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid
     * 
     */
    @JsonIgnore
    public void setHostId(CharSequence hostId) {
        this.hostId = hostId;
    }

    public LaunchTemplatePlacement withHostId(CharSequence hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostresourcegrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getHostResourceGroupArn() {
        return hostResourceGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostresourcegrouparn
     * 
     */
    @JsonIgnore
    public void setHostResourceGroupArn(CharSequence hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
    }

    public LaunchTemplatePlacement withHostResourceGroupArn(CharSequence hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupName", groupName).append("tenancy", tenancy).append("spreadDomain", spreadDomain).append("partitionNumber", partitionNumber).append("availabilityZone", availabilityZone).append("affinity", affinity).append("hostId", hostId).append("hostResourceGroupArn", hostResourceGroupArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(partitionNumber).append(groupName).append(hostResourceGroupArn).append(tenancy).append(hostId).append(availabilityZone).append(spreadDomain).append(affinity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplatePlacement) == false) {
            return false;
        }
        LaunchTemplatePlacement rhs = ((LaunchTemplatePlacement) other);
        return new EqualsBuilder().append(partitionNumber, rhs.partitionNumber).append(groupName, rhs.groupName).append(hostResourceGroupArn, rhs.hostResourceGroupArn).append(tenancy, rhs.tenancy).append(hostId, rhs.hostId).append(availabilityZone, rhs.availabilityZone).append(spreadDomain, rhs.spreadDomain).append(affinity, rhs.affinity).isEquals();
    }

}
