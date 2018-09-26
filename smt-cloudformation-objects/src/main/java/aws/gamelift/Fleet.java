
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
    private CharSequence buildId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description")
    private CharSequence description;
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
    private CharSequence eC2InstanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    @JsonProperty("LogPaths")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths")
    private Set<CharSequence> logPaths = new LinkedHashSet<CharSequence>();
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
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    @JsonProperty("ServerLaunchParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters")
    private CharSequence serverLaunchParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    @JsonProperty("ServerLaunchPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath")
    private CharSequence serverLaunchPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    public CharSequence getBuildId() {
        return buildId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    public void setBuildId(CharSequence buildId) {
        this.buildId = buildId;
    }

    public Fleet withBuildId(CharSequence buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Fleet withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
    public Integer getDesiredEC2Instances() {
        return desiredEC2Instances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
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
    public Set<IpPermission> getEC2InboundPermissions() {
        return eC2InboundPermissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions
     * 
     */
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
    public CharSequence getEC2InstanceType() {
        return eC2InstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype
     * 
     */
    public void setEC2InstanceType(CharSequence eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    public Fleet withEC2InstanceType(CharSequence eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    public Set<CharSequence> getLogPaths() {
        return logPaths;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    public void setLogPaths(Set<CharSequence> logPaths) {
        this.logPaths = logPaths;
    }

    public Fleet withLogPaths(Set<CharSequence> logPaths) {
        this.logPaths = logPaths;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
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
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize
     * 
     */
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
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Fleet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    public CharSequence getServerLaunchParameters() {
        return serverLaunchParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    public void setServerLaunchParameters(CharSequence serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    public Fleet withServerLaunchParameters(CharSequence serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    public CharSequence getServerLaunchPath() {
        return serverLaunchPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    public void setServerLaunchPath(CharSequence serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    public Fleet withServerLaunchPath(CharSequence serverLaunchPath) {
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
