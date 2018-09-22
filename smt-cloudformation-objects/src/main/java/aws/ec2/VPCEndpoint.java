
package aws.ec2;

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
 * VPCEndpoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VpcId",
    "RouteTableIds",
    "ServiceName",
    "PolicyDocument",
    "IsPrivateDnsEnabled",
    "SubnetIds",
    "SecurityGroupIds",
    "VPCEndpointType"
})
public class VPCEndpoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid")
    private String vpcId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids
     * 
     */
    @JsonProperty("RouteTableIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids")
    private List<String> routeTableIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename
     * 
     */
    @JsonProperty("ServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename")
    private String serviceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument")
    private PolicyDocument policyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-isprivatednsenabled
     * 
     */
    @JsonProperty("IsPrivateDnsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-isprivatednsenabled")
    private Boolean isPrivateDnsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids")
    private List<String> subnetIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids")
    private List<String> securityGroupIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype
     * 
     */
    @JsonProperty("VPCEndpointType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype")
    private String vPCEndpointType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid
     * 
     */
    @JsonProperty("VpcId")
    public String getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid
     * 
     */
    @JsonProperty("VpcId")
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VPCEndpoint withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids
     * 
     */
    @JsonProperty("RouteTableIds")
    public List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids
     * 
     */
    @JsonProperty("RouteTableIds")
    public void setRouteTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
    }

    public VPCEndpoint withRouteTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename
     * 
     */
    @JsonProperty("ServiceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename
     * 
     */
    @JsonProperty("ServiceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public VPCEndpoint withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public PolicyDocument getPolicyDocument() {
        return policyDocument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public void setPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
    }

    public VPCEndpoint withPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-isprivatednsenabled
     * 
     */
    @JsonProperty("IsPrivateDnsEnabled")
    public Boolean getIsPrivateDnsEnabled() {
        return isPrivateDnsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-isprivatednsenabled
     * 
     */
    @JsonProperty("IsPrivateDnsEnabled")
    public void setIsPrivateDnsEnabled(Boolean isPrivateDnsEnabled) {
        this.isPrivateDnsEnabled = isPrivateDnsEnabled;
    }

    public VPCEndpoint withIsPrivateDnsEnabled(Boolean isPrivateDnsEnabled) {
        this.isPrivateDnsEnabled = isPrivateDnsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public VPCEndpoint withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public VPCEndpoint withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype
     * 
     */
    @JsonProperty("VPCEndpointType")
    public String getVPCEndpointType() {
        return vPCEndpointType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype
     * 
     */
    @JsonProperty("VPCEndpointType")
    public void setVPCEndpointType(String vPCEndpointType) {
        this.vPCEndpointType = vPCEndpointType;
    }

    public VPCEndpoint withVPCEndpointType(String vPCEndpointType) {
        this.vPCEndpointType = vPCEndpointType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vpcId", vpcId).append("routeTableIds", routeTableIds).append("serviceName", serviceName).append("policyDocument", policyDocument).append("isPrivateDnsEnabled", isPrivateDnsEnabled).append("subnetIds", subnetIds).append("securityGroupIds", securityGroupIds).append("vPCEndpointType", vPCEndpointType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyDocument).append(routeTableIds).append(securityGroupIds).append(vpcId).append(isPrivateDnsEnabled).append(serviceName).append(vPCEndpointType).append(subnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCEndpoint) == false) {
            return false;
        }
        VPCEndpoint rhs = ((VPCEndpoint) other);
        return new EqualsBuilder().append(policyDocument, rhs.policyDocument).append(routeTableIds, rhs.routeTableIds).append(securityGroupIds, rhs.securityGroupIds).append(vpcId, rhs.vpcId).append(isPrivateDnsEnabled, rhs.isPrivateDnsEnabled).append(serviceName, rhs.serviceName).append(vPCEndpointType, rhs.vPCEndpointType).append(subnetIds, rhs.subnetIds).isEquals();
    }

}
