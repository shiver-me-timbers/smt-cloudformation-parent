
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
    private CharSequence extraJarsS3Path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    @JsonProperty("EndpointName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname")
    private CharSequence endpointName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    @JsonProperty("PublicKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey")
    private CharSequence publicKey;
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
    private CharSequence subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    @JsonProperty("ExtraPythonLibsS3Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path")
    private CharSequence extraPythonLibsS3Path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path
     * 
     */
    public CharSequence getExtraJarsS3Path() {
        return extraJarsS3Path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path
     * 
     */
    public void setExtraJarsS3Path(CharSequence extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    public DevEndpoint withExtraJarsS3Path(CharSequence extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    public CharSequence getEndpointName() {
        return endpointName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    public void setEndpointName(CharSequence endpointName) {
        this.endpointName = endpointName;
    }

    public DevEndpoint withEndpointName(CharSequence endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    public CharSequence getPublicKey() {
        return publicKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    public void setPublicKey(CharSequence publicKey) {
        this.publicKey = publicKey;
    }

    public DevEndpoint withPublicKey(CharSequence publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes
     * 
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes
     * 
     */
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
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public DevEndpoint withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    public CharSequence getExtraPythonLibsS3Path() {
        return extraPythonLibsS3Path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    public void setExtraPythonLibsS3Path(CharSequence extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    public DevEndpoint withExtraPythonLibsS3Path(CharSequence extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public DevEndpoint withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public DevEndpoint withRoleArn(CharSequence roleArn) {
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
