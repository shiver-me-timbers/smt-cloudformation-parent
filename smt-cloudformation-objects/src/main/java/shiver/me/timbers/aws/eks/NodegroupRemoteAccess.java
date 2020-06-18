
package shiver.me.timbers.aws.eks;

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


/**
 * NodegroupRemoteAccess
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourceSecurityGroups",
    "Ec2SshKey"
})
public class NodegroupRemoteAccess implements Property<NodegroupRemoteAccess>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-sourcesecuritygroups
     * 
     */
    @JsonProperty("SourceSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-sourcesecuritygroups")
    private List<CharSequence> sourceSecurityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-ec2sshkey
     * 
     */
    @JsonProperty("Ec2SshKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-ec2sshkey")
    private CharSequence ec2SshKey;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-sourcesecuritygroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSourceSecurityGroups() {
        return sourceSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-sourcesecuritygroups
     * 
     */
    @JsonIgnore
    public void setSourceSecurityGroups(List<CharSequence> sourceSecurityGroups) {
        this.sourceSecurityGroups = sourceSecurityGroups;
    }

    public NodegroupRemoteAccess withSourceSecurityGroups(List<CharSequence> sourceSecurityGroups) {
        this.sourceSecurityGroups = sourceSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-ec2sshkey
     * 
     */
    @JsonIgnore
    public CharSequence getEc2SshKey() {
        return ec2SshKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-ec2sshkey
     * 
     */
    @JsonIgnore
    public void setEc2SshKey(CharSequence ec2SshKey) {
        this.ec2SshKey = ec2SshKey;
    }

    public NodegroupRemoteAccess withEc2SshKey(CharSequence ec2SshKey) {
        this.ec2SshKey = ec2SshKey;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourceSecurityGroups", sourceSecurityGroups).append("ec2SshKey", ec2SshKey).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ec2SshKey).append(sourceSecurityGroups).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodegroupRemoteAccess) == false) {
            return false;
        }
        NodegroupRemoteAccess rhs = ((NodegroupRemoteAccess) other);
        return new EqualsBuilder().append(ec2SshKey, rhs.ec2SshKey).append(sourceSecurityGroups, rhs.sourceSecurityGroups).isEquals();
    }

}
