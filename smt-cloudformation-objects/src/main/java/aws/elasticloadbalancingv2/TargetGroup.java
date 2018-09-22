
package aws.elasticloadbalancingv2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TargetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HealthCheckIntervalSeconds",
    "HealthCheckPath",
    "HealthCheckPort",
    "HealthCheckProtocol",
    "HealthCheckTimeoutSeconds",
    "HealthyThresholdCount",
    "Matcher",
    "Name",
    "Port",
    "Protocol",
    "Tags",
    "TargetGroupAttributes",
    "TargetType",
    "Targets",
    "UnhealthyThresholdCount",
    "VpcId"
})
public class TargetGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds
     * 
     */
    @JsonProperty("HealthCheckIntervalSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds")
    private Integer healthCheckIntervalSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath
     * 
     */
    @JsonProperty("HealthCheckPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath")
    private String healthCheckPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport
     * 
     */
    @JsonProperty("HealthCheckPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport")
    private String healthCheckPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol
     * 
     */
    @JsonProperty("HealthCheckProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol")
    private String healthCheckProtocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds
     * 
     */
    @JsonProperty("HealthCheckTimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds")
    private Integer healthCheckTimeoutSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount
     * 
     */
    @JsonProperty("HealthyThresholdCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount")
    private Integer healthyThresholdCount;
    /**
     * Matcher
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
     * 
     */
    @JsonProperty("Matcher")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html")
    private Matcher matcher;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol")
    private String protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes
     * 
     */
    @JsonProperty("TargetGroupAttributes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes")
    private Set<TargetGroupAttribute> targetGroupAttributes = new LinkedHashSet<TargetGroupAttribute>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype
     * 
     */
    @JsonProperty("TargetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype")
    private String targetType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets
     * 
     */
    @JsonProperty("Targets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets")
    private Set<TargetDescription> targets = new LinkedHashSet<TargetDescription>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount
     * 
     */
    @JsonProperty("UnhealthyThresholdCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount")
    private Integer unhealthyThresholdCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid")
    private String vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds
     * 
     */
    @JsonProperty("HealthCheckIntervalSeconds")
    public Integer getHealthCheckIntervalSeconds() {
        return healthCheckIntervalSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds
     * 
     */
    @JsonProperty("HealthCheckIntervalSeconds")
    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    public TargetGroup withHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath
     * 
     */
    @JsonProperty("HealthCheckPath")
    public String getHealthCheckPath() {
        return healthCheckPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath
     * 
     */
    @JsonProperty("HealthCheckPath")
    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    public TargetGroup withHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport
     * 
     */
    @JsonProperty("HealthCheckPort")
    public String getHealthCheckPort() {
        return healthCheckPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport
     * 
     */
    @JsonProperty("HealthCheckPort")
    public void setHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    public TargetGroup withHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol
     * 
     */
    @JsonProperty("HealthCheckProtocol")
    public String getHealthCheckProtocol() {
        return healthCheckProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol
     * 
     */
    @JsonProperty("HealthCheckProtocol")
    public void setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    public TargetGroup withHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds
     * 
     */
    @JsonProperty("HealthCheckTimeoutSeconds")
    public Integer getHealthCheckTimeoutSeconds() {
        return healthCheckTimeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds
     * 
     */
    @JsonProperty("HealthCheckTimeoutSeconds")
    public void setHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
    }

    public TargetGroup withHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount
     * 
     */
    @JsonProperty("HealthyThresholdCount")
    public Integer getHealthyThresholdCount() {
        return healthyThresholdCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount
     * 
     */
    @JsonProperty("HealthyThresholdCount")
    public void setHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }

    public TargetGroup withHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
        return this;
    }

    /**
     * Matcher
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
     * 
     */
    @JsonProperty("Matcher")
    public Matcher getMatcher() {
        return matcher;
    }

    /**
     * Matcher
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
     * 
     */
    @JsonProperty("Matcher")
    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    public TargetGroup withMatcher(Matcher matcher) {
        this.matcher = matcher;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public TargetGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port
     * 
     */
    @JsonProperty("Port")
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port
     * 
     */
    @JsonProperty("Port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public TargetGroup withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol
     * 
     */
    @JsonProperty("Protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol
     * 
     */
    @JsonProperty("Protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public TargetGroup withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public TargetGroup withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes
     * 
     */
    @JsonProperty("TargetGroupAttributes")
    public Set<TargetGroupAttribute> getTargetGroupAttributes() {
        return targetGroupAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes
     * 
     */
    @JsonProperty("TargetGroupAttributes")
    public void setTargetGroupAttributes(Set<TargetGroupAttribute> targetGroupAttributes) {
        this.targetGroupAttributes = targetGroupAttributes;
    }

    public TargetGroup withTargetGroupAttributes(Set<TargetGroupAttribute> targetGroupAttributes) {
        this.targetGroupAttributes = targetGroupAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype
     * 
     */
    @JsonProperty("TargetType")
    public String getTargetType() {
        return targetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype
     * 
     */
    @JsonProperty("TargetType")
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public TargetGroup withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets
     * 
     */
    @JsonProperty("Targets")
    public Set<TargetDescription> getTargets() {
        return targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets
     * 
     */
    @JsonProperty("Targets")
    public void setTargets(Set<TargetDescription> targets) {
        this.targets = targets;
    }

    public TargetGroup withTargets(Set<TargetDescription> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount
     * 
     */
    @JsonProperty("UnhealthyThresholdCount")
    public Integer getUnhealthyThresholdCount() {
        return unhealthyThresholdCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount
     * 
     */
    @JsonProperty("UnhealthyThresholdCount")
    public void setUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }

    public TargetGroup withUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid
     * 
     */
    @JsonProperty("VpcId")
    public String getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid
     * 
     */
    @JsonProperty("VpcId")
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public TargetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("healthCheckIntervalSeconds", healthCheckIntervalSeconds).append("healthCheckPath", healthCheckPath).append("healthCheckPort", healthCheckPort).append("healthCheckProtocol", healthCheckProtocol).append("healthCheckTimeoutSeconds", healthCheckTimeoutSeconds).append("healthyThresholdCount", healthyThresholdCount).append("matcher", matcher).append("name", name).append("port", port).append("protocol", protocol).append("tags", tags).append("targetGroupAttributes", targetGroupAttributes).append("targetType", targetType).append("targets", targets).append("unhealthyThresholdCount", unhealthyThresholdCount).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckTimeoutSeconds).append(healthCheckPort).append(targetType).append(matcher).append(healthCheckProtocol).append(targets).append(tags).append(healthCheckPath).append(protocol).append(port).append(healthCheckIntervalSeconds).append(healthyThresholdCount).append(vpcId).append(name).append(targetGroupAttributes).append(unhealthyThresholdCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TargetGroup) == false) {
            return false;
        }
        TargetGroup rhs = ((TargetGroup) other);
        return new EqualsBuilder().append(healthCheckTimeoutSeconds, rhs.healthCheckTimeoutSeconds).append(healthCheckPort, rhs.healthCheckPort).append(targetType, rhs.targetType).append(matcher, rhs.matcher).append(healthCheckProtocol, rhs.healthCheckProtocol).append(targets, rhs.targets).append(tags, rhs.tags).append(healthCheckPath, rhs.healthCheckPath).append(protocol, rhs.protocol).append(port, rhs.port).append(healthCheckIntervalSeconds, rhs.healthCheckIntervalSeconds).append(healthyThresholdCount, rhs.healthyThresholdCount).append(vpcId, rhs.vpcId).append(name, rhs.name).append(targetGroupAttributes, rhs.targetGroupAttributes).append(unhealthyThresholdCount, rhs.unhealthyThresholdCount).isEquals();
    }

}
