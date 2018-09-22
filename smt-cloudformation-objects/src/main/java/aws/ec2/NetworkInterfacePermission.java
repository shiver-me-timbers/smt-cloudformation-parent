
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NetworkInterfacePermission
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AwsAccountId",
    "NetworkInterfaceId",
    "Permission"
})
public class NetworkInterfacePermission {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid
     * 
     */
    @JsonProperty("AwsAccountId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid")
    private String awsAccountId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid")
    private String networkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission
     * 
     */
    @JsonProperty("Permission")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission")
    private String permission;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid
     * 
     */
    @JsonProperty("AwsAccountId")
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid
     * 
     */
    @JsonProperty("AwsAccountId")
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    public NetworkInterfacePermission withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public NetworkInterfacePermission withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission
     * 
     */
    @JsonProperty("Permission")
    public String getPermission() {
        return permission;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission
     * 
     */
    @JsonProperty("Permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    public NetworkInterfacePermission withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("awsAccountId", awsAccountId).append("networkInterfaceId", networkInterfaceId).append("permission", permission).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkInterfaceId).append(permission).append(awsAccountId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkInterfacePermission) == false) {
            return false;
        }
        NetworkInterfacePermission rhs = ((NetworkInterfacePermission) other);
        return new EqualsBuilder().append(networkInterfaceId, rhs.networkInterfaceId).append(permission, rhs.permission).append(awsAccountId, rhs.awsAccountId).isEquals();
    }

}
