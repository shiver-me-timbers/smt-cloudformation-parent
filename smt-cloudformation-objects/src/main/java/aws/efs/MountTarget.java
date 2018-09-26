
package aws.efs;

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
 * MountTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FileSystemId",
    "IpAddress",
    "SecurityGroups",
    "SubnetId"
})
public class MountTarget {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid
     * 
     */
    @JsonProperty("FileSystemId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid")
    private CharSequence fileSystemId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress
     * 
     */
    @JsonProperty("IpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress")
    private CharSequence ipAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups")
    private Set<CharSequence> securityGroups = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid")
    private CharSequence subnetId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid
     * 
     */
    public CharSequence getFileSystemId() {
        return fileSystemId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid
     * 
     */
    public void setFileSystemId(CharSequence fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    public MountTarget withFileSystemId(CharSequence fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress
     * 
     */
    public CharSequence getIpAddress() {
        return ipAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress
     * 
     */
    public void setIpAddress(CharSequence ipAddress) {
        this.ipAddress = ipAddress;
    }

    public MountTarget withIpAddress(CharSequence ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups
     * 
     */
    public Set<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups
     * 
     */
    public void setSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public MountTarget withSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid
     * 
     */
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public MountTarget withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fileSystemId", fileSystemId).append("ipAddress", ipAddress).append("securityGroups", securityGroups).append("subnetId", subnetId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ipAddress).append(subnetId).append(securityGroups).append(fileSystemId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MountTarget) == false) {
            return false;
        }
        MountTarget rhs = ((MountTarget) other);
        return new EqualsBuilder().append(ipAddress, rhs.ipAddress).append(subnetId, rhs.subnetId).append(securityGroups, rhs.securityGroups).append(fileSystemId, rhs.fileSystemId).isEquals();
    }

}
