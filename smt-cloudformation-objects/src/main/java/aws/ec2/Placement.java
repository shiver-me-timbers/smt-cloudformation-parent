
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Placement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GroupName",
    "Tenancy",
    "AvailabilityZone",
    "Affinity",
    "HostId"
})
public class Placement {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname")
    private String groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy")
    private String tenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone")
    private String availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity
     * 
     */
    @JsonProperty("Affinity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity")
    private String affinity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid
     * 
     */
    @JsonProperty("HostId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid")
    private String hostId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname
     * 
     */
    @JsonProperty("GroupName")
    public String getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname
     * 
     */
    @JsonProperty("GroupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Placement withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    public String getTenancy() {
        return tenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public Placement withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Placement withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity
     * 
     */
    @JsonProperty("Affinity")
    public String getAffinity() {
        return affinity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity
     * 
     */
    @JsonProperty("Affinity")
    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    public Placement withAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid
     * 
     */
    @JsonProperty("HostId")
    public String getHostId() {
        return hostId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid
     * 
     */
    @JsonProperty("HostId")
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public Placement withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupName", groupName).append("tenancy", tenancy).append("availabilityZone", availabilityZone).append("affinity", affinity).append("hostId", hostId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tenancy).append(hostId).append(groupName).append(availabilityZone).append(affinity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Placement) == false) {
            return false;
        }
        Placement rhs = ((Placement) other);
        return new EqualsBuilder().append(tenancy, rhs.tenancy).append(hostId, rhs.hostId).append(groupName, rhs.groupName).append(availabilityZone, rhs.availabilityZone).append(affinity, rhs.affinity).isEquals();
    }

}
