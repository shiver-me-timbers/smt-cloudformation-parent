
package aws.glue;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PhysicalConnectionRequirements
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AvailabilityZone",
    "SecurityGroupIdList",
    "SubnetId"
})
public class PhysicalConnectionRequirements {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist
     * 
     */
    @JsonProperty("SecurityGroupIdList")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist")
    private List<CharSequence> securityGroupIdList = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid")
    private CharSequence subnetId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone
     * 
     */
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public PhysicalConnectionRequirements withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist
     * 
     */
    public List<CharSequence> getSecurityGroupIdList() {
        return securityGroupIdList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist
     * 
     */
    public void setSecurityGroupIdList(List<CharSequence> securityGroupIdList) {
        this.securityGroupIdList = securityGroupIdList;
    }

    public PhysicalConnectionRequirements withSecurityGroupIdList(List<CharSequence> securityGroupIdList) {
        this.securityGroupIdList = securityGroupIdList;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid
     * 
     */
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public PhysicalConnectionRequirements withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("availabilityZone", availabilityZone).append("securityGroupIdList", securityGroupIdList).append("subnetId", subnetId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(availabilityZone).append(securityGroupIdList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhysicalConnectionRequirements) == false) {
            return false;
        }
        PhysicalConnectionRequirements rhs = ((PhysicalConnectionRequirements) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(availabilityZone, rhs.availabilityZone).append(securityGroupIdList, rhs.securityGroupIdList).isEquals();
    }

}
