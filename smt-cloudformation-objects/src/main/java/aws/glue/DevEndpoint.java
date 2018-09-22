
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
 * DevEndpoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ExtraJarsS3Path",
    "EndpointName",
    "PublicKey",
    "NumberOfNodes",
    "SubnetId",
    "ExtraPythonLibsS3Path",
    "SecurityGroupIds",
    "RoleArn"
})
public class DevEndpoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path
     * 
     */
    @JsonProperty("ExtraJarsS3Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path")
    private String extraJarsS3Path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    @JsonProperty("EndpointName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname")
    private String endpointName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    @JsonProperty("PublicKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey")
    private String publicKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes
     * 
     */
    @JsonProperty("NumberOfNodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes")
    private Integer numberOfNodes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid")
    private String subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    @JsonProperty("ExtraPythonLibsS3Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path")
    private String extraPythonLibsS3Path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids")
    private List<String> securityGroupIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn")
    private String roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path
     * 
     */
    @JsonProperty("ExtraJarsS3Path")
    public String getExtraJarsS3Path() {
        return extraJarsS3Path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path
     * 
     */
    @JsonProperty("ExtraJarsS3Path")
    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    public DevEndpoint withExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    @JsonProperty("EndpointName")
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    @JsonProperty("EndpointName")
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public DevEndpoint withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    @JsonProperty("PublicKey")
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    @JsonProperty("PublicKey")
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public DevEndpoint withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes
     * 
     */
    @JsonProperty("NumberOfNodes")
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes
     * 
     */
    @JsonProperty("NumberOfNodes")
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    public DevEndpoint withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public DevEndpoint withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    @JsonProperty("ExtraPythonLibsS3Path")
    public String getExtraPythonLibsS3Path() {
        return extraPythonLibsS3Path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    @JsonProperty("ExtraPythonLibsS3Path")
    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    public DevEndpoint withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public DevEndpoint withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    public DevEndpoint withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("extraJarsS3Path", extraJarsS3Path).append("endpointName", endpointName).append("publicKey", publicKey).append("numberOfNodes", numberOfNodes).append("subnetId", subnetId).append("extraPythonLibsS3Path", extraPythonLibsS3Path).append("securityGroupIds", securityGroupIds).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(extraJarsS3Path).append(securityGroupIds).append(roleArn).append(endpointName).append(publicKey).append(numberOfNodes).append(extraPythonLibsS3Path).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DevEndpoint) == false) {
            return false;
        }
        DevEndpoint rhs = ((DevEndpoint) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(extraJarsS3Path, rhs.extraJarsS3Path).append(securityGroupIds, rhs.securityGroupIds).append(roleArn, rhs.roleArn).append(endpointName, rhs.endpointName).append(publicKey, rhs.publicKey).append(numberOfNodes, rhs.numberOfNodes).append(extraPythonLibsS3Path, rhs.extraPythonLibsS3Path).isEquals();
    }

}
