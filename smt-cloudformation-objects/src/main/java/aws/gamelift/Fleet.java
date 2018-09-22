
package aws.gamelift;

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
 * Fleet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BuildId",
    "Description",
    "DesiredEC2Instances",
    "EC2InboundPermissions",
    "EC2InstanceType",
    "LogPaths",
    "MaxSize",
    "MinSize",
    "Name",
    "ServerLaunchParameters",
    "ServerLaunchPath"
})
public class Fleet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    @JsonProperty("BuildId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid")
    private String buildId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
    @JsonProperty("DesiredEC2Instances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances")
    private Integer desiredEC2Instances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions
     * 
     */
    @JsonProperty("EC2InboundPermissions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions")
    private Set<IpPermission> eC2InboundPermissions = new LinkedHashSet<IpPermission>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype
     * 
     */
    @JsonProperty("EC2InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype")
    private String eC2InstanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    @JsonProperty("LogPaths")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths")
    private Set<String> logPaths = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize")
    private Integer maxSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize
     * 
     */
    @JsonProperty("MinSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize")
    private Integer minSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    @JsonProperty("ServerLaunchParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters")
    private String serverLaunchParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    @JsonProperty("ServerLaunchPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath")
    private String serverLaunchPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    @JsonProperty("BuildId")
    public String getBuildId() {
        return buildId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    @JsonProperty("BuildId")
    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public Fleet withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Fleet withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
    @JsonProperty("DesiredEC2Instances")
    public Integer getDesiredEC2Instances() {
        return desiredEC2Instances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
    @JsonProperty("DesiredEC2Instances")
    public void setDesiredEC2Instances(Integer desiredEC2Instances) {
        this.desiredEC2Instances = desiredEC2Instances;
    }

    public Fleet withDesiredEC2Instances(Integer desiredEC2Instances) {
        this.desiredEC2Instances = desiredEC2Instances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions
     * 
     */
    @JsonProperty("EC2InboundPermissions")
    public Set<IpPermission> getEC2InboundPermissions() {
        return eC2InboundPermissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions
     * 
     */
    @JsonProperty("EC2InboundPermissions")
    public void setEC2InboundPermissions(Set<IpPermission> eC2InboundPermissions) {
        this.eC2InboundPermissions = eC2InboundPermissions;
    }

    public Fleet withEC2InboundPermissions(Set<IpPermission> eC2InboundPermissions) {
        this.eC2InboundPermissions = eC2InboundPermissions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype
     * 
     */
    @JsonProperty("EC2InstanceType")
    public String getEC2InstanceType() {
        return eC2InstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype
     * 
     */
    @JsonProperty("EC2InstanceType")
    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    public Fleet withEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    @JsonProperty("LogPaths")
    public Set<String> getLogPaths() {
        return logPaths;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    @JsonProperty("LogPaths")
    public void setLogPaths(Set<String> logPaths) {
        this.logPaths = logPaths;
    }

    public Fleet withLogPaths(Set<String> logPaths) {
        this.logPaths = logPaths;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Fleet withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize
     * 
     */
    @JsonProperty("MinSize")
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize
     * 
     */
    @JsonProperty("MinSize")
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public Fleet withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Fleet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    @JsonProperty("ServerLaunchParameters")
    public String getServerLaunchParameters() {
        return serverLaunchParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    @JsonProperty("ServerLaunchParameters")
    public void setServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    public Fleet withServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    @JsonProperty("ServerLaunchPath")
    public String getServerLaunchPath() {
        return serverLaunchPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    @JsonProperty("ServerLaunchPath")
    public void setServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    public Fleet withServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("buildId", buildId).append("description", description).append("desiredEC2Instances", desiredEC2Instances).append("eC2InboundPermissions", eC2InboundPermissions).append("eC2InstanceType", eC2InstanceType).append("logPaths", logPaths).append("maxSize", maxSize).append("minSize", minSize).append("name", name).append("serverLaunchParameters", serverLaunchParameters).append("serverLaunchPath", serverLaunchPath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logPaths).append(desiredEC2Instances).append(eC2InstanceType).append(serverLaunchPath).append(eC2InboundPermissions).append(name).append(description).append(serverLaunchParameters).append(buildId).append(maxSize).append(minSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fleet) == false) {
            return false;
        }
        Fleet rhs = ((Fleet) other);
        return new EqualsBuilder().append(logPaths, rhs.logPaths).append(desiredEC2Instances, rhs.desiredEC2Instances).append(eC2InstanceType, rhs.eC2InstanceType).append(serverLaunchPath, rhs.serverLaunchPath).append(eC2InboundPermissions, rhs.eC2InboundPermissions).append(name, rhs.name).append(description, rhs.description).append(serverLaunchParameters, rhs.serverLaunchParameters).append(buildId, rhs.buildId).append(maxSize, rhs.maxSize).append(minSize, rhs.minSize).isEquals();
    }

}
