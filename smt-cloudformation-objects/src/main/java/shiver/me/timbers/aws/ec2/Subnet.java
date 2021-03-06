
package shiver.me.timbers.aws.ec2;

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
 * Subnet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AssignIpv6AddressOnCreation",
    "AvailabilityZone",
    "CidrBlock",
    "Ipv6CidrBlock",
    "MapPublicIpOnLaunch",
    "Tags",
    "VpcId"
})
public class Subnet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation
     * 
     */
    @JsonProperty("AssignIpv6AddressOnCreation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation")
    private CharSequence assignIpv6AddressOnCreation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock
     * 
     */
    @JsonProperty("CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock")
    private CharSequence cidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock
     * 
     */
    @JsonProperty("Ipv6CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock")
    private CharSequence ipv6CidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch
     * 
     */
    @JsonProperty("MapPublicIpOnLaunch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch")
    private CharSequence mapPublicIpOnLaunch;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-awsec2subnet-prop-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-awsec2subnet-prop-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation
     * 
     */
    @JsonIgnore
    public CharSequence getAssignIpv6AddressOnCreation() {
        return assignIpv6AddressOnCreation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation
     * 
     */
    @JsonIgnore
    public void setAssignIpv6AddressOnCreation(CharSequence assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    }

    public Subnet withAssignIpv6AddressOnCreation(CharSequence assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone
     * 
     */
    @JsonIgnore
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Subnet withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getCidrBlock() {
        return cidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock
     * 
     */
    @JsonIgnore
    public void setCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public Subnet withCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock
     * 
     */
    @JsonIgnore
    public void setIpv6CidrBlock(CharSequence ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    public Subnet withIpv6CidrBlock(CharSequence ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch
     * 
     */
    @JsonIgnore
    public CharSequence getMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch
     * 
     */
    @JsonIgnore
    public void setMapPublicIpOnLaunch(CharSequence mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    public Subnet withMapPublicIpOnLaunch(CharSequence mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Subnet withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-awsec2subnet-prop-vpcid
     * 
     */
    @JsonIgnore
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-awsec2subnet-prop-vpcid
     * 
     */
    @JsonIgnore
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public Subnet withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("assignIpv6AddressOnCreation", assignIpv6AddressOnCreation).append("availabilityZone", availabilityZone).append("cidrBlock", cidrBlock).append("ipv6CidrBlock", ipv6CidrBlock).append("mapPublicIpOnLaunch", mapPublicIpOnLaunch).append("tags", tags).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cidrBlock).append(vpcId).append(mapPublicIpOnLaunch).append(assignIpv6AddressOnCreation).append(availabilityZone).append(ipv6CidrBlock).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subnet) == false) {
            return false;
        }
        Subnet rhs = ((Subnet) other);
        return new EqualsBuilder().append(cidrBlock, rhs.cidrBlock).append(vpcId, rhs.vpcId).append(mapPublicIpOnLaunch, rhs.mapPublicIpOnLaunch).append(assignIpv6AddressOnCreation, rhs.assignIpv6AddressOnCreation).append(availabilityZone, rhs.availabilityZone).append(ipv6CidrBlock, rhs.ipv6CidrBlock).append(tags, rhs.tags).isEquals();
    }

}
