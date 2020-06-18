
package shiver.me.timbers.aws.glue;

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


/**
 * DevEndpoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExtraJarsS3Path",
    "PublicKey",
    "NumberOfNodes",
    "Arguments",
    "SubnetId",
    "PublicKeys",
    "SecurityGroupIds",
    "RoleArn",
    "WorkerType",
    "EndpointName",
    "GlueVersion",
    "ExtraPythonLibsS3Path",
    "SecurityConfiguration",
    "NumberOfWorkers",
    "Tags"
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
    private Number numberOfNodes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments
     * 
     */
    @JsonProperty("Arguments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments")
    private Object arguments;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid")
    private CharSequence subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys
     * 
     */
    @JsonProperty("PublicKeys")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys")
    private List<CharSequence> publicKeys = new ArrayList<CharSequence>();
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype
     * 
     */
    @JsonProperty("WorkerType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype")
    private CharSequence workerType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    @JsonProperty("EndpointName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname")
    private CharSequence endpointName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion
     * 
     */
    @JsonProperty("GlueVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion")
    private CharSequence glueVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    @JsonProperty("ExtraPythonLibsS3Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path")
    private CharSequence extraPythonLibsS3Path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration
     * 
     */
    @JsonProperty("SecurityConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration")
    private CharSequence securityConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers
     * 
     */
    @JsonProperty("NumberOfWorkers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers")
    private Number numberOfWorkers;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags")
    private Object tags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path
     * 
     */
    @JsonIgnore
    public CharSequence getExtraJarsS3Path() {
        return extraJarsS3Path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path
     * 
     */
    @JsonIgnore
    public void setExtraJarsS3Path(CharSequence extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    public DevEndpoint withExtraJarsS3Path(CharSequence extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    @JsonIgnore
    public CharSequence getPublicKey() {
        return publicKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Number getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes
     * 
     */
    @JsonIgnore
    public void setNumberOfNodes(Number numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    public DevEndpoint withNumberOfNodes(Number numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments
     * 
     */
    @JsonIgnore
    public Object getArguments() {
        return arguments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments
     * 
     */
    @JsonIgnore
    public void setArguments(Object arguments) {
        this.arguments = arguments;
    }

    public DevEndpoint withArguments(Object arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid
     * 
     */
    @JsonIgnore
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid
     * 
     */
    @JsonIgnore
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public DevEndpoint withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys
     * 
     */
    @JsonIgnore
    public List<CharSequence> getPublicKeys() {
        return publicKeys;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys
     * 
     */
    @JsonIgnore
    public void setPublicKeys(List<CharSequence> publicKeys) {
        this.publicKeys = publicKeys;
    }

    public DevEndpoint withPublicKeys(List<CharSequence> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public DevEndpoint withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype
     * 
     */
    @JsonIgnore
    public CharSequence getWorkerType() {
        return workerType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype
     * 
     */
    @JsonIgnore
    public void setWorkerType(CharSequence workerType) {
        this.workerType = workerType;
    }

    public DevEndpoint withWorkerType(CharSequence workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointName() {
        return endpointName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname
     * 
     */
    @JsonIgnore
    public void setEndpointName(CharSequence endpointName) {
        this.endpointName = endpointName;
    }

    public DevEndpoint withEndpointName(CharSequence endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion
     * 
     */
    @JsonIgnore
    public CharSequence getGlueVersion() {
        return glueVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion
     * 
     */
    @JsonIgnore
    public void setGlueVersion(CharSequence glueVersion) {
        this.glueVersion = glueVersion;
    }

    public DevEndpoint withGlueVersion(CharSequence glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    @JsonIgnore
    public CharSequence getExtraPythonLibsS3Path() {
        return extraPythonLibsS3Path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path
     * 
     */
    @JsonIgnore
    public void setExtraPythonLibsS3Path(CharSequence extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    public DevEndpoint withExtraPythonLibsS3Path(CharSequence extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration
     * 
     */
    @JsonIgnore
    public void setSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    public DevEndpoint withSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers
     * 
     */
    @JsonIgnore
    public Number getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers
     * 
     */
    @JsonIgnore
    public void setNumberOfWorkers(Number numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public DevEndpoint withNumberOfWorkers(Number numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public DevEndpoint withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("extraJarsS3Path", extraJarsS3Path).append("publicKey", publicKey).append("numberOfNodes", numberOfNodes).append("arguments", arguments).append("subnetId", subnetId).append("publicKeys", publicKeys).append("securityGroupIds", securityGroupIds).append("roleArn", roleArn).append("workerType", workerType).append("endpointName", endpointName).append("glueVersion", glueVersion).append("extraPythonLibsS3Path", extraPythonLibsS3Path).append("securityConfiguration", securityConfiguration).append("numberOfWorkers", numberOfWorkers).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(workerType).append(numberOfWorkers).append(publicKeys).append(endpointName).append(glueVersion).append(publicKey).append(numberOfNodes).append(tags).append(extraJarsS3Path).append(securityGroupIds).append(roleArn).append(arguments).append(extraPythonLibsS3Path).append(securityConfiguration).toHashCode();
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
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(workerType, rhs.workerType).append(numberOfWorkers, rhs.numberOfWorkers).append(publicKeys, rhs.publicKeys).append(endpointName, rhs.endpointName).append(glueVersion, rhs.glueVersion).append(publicKey, rhs.publicKey).append(numberOfNodes, rhs.numberOfNodes).append(tags, rhs.tags).append(extraJarsS3Path, rhs.extraJarsS3Path).append(securityGroupIds, rhs.securityGroupIds).append(roleArn, rhs.roleArn).append(arguments, rhs.arguments).append(extraPythonLibsS3Path, rhs.extraPythonLibsS3Path).append(securityConfiguration, rhs.securityConfiguration).isEquals();
    }

}
