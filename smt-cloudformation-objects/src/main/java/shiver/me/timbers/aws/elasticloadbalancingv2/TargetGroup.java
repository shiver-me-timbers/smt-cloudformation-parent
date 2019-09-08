
package shiver.me.timbers.aws.elasticloadbalancingv2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * TargetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HealthCheckEnabled",
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled
     * 
     */
    @JsonProperty("HealthCheckEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled")
    private CharSequence healthCheckEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds
     * 
     */
    @JsonProperty("HealthCheckIntervalSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds")
    private Number healthCheckIntervalSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath
     * 
     */
    @JsonProperty("HealthCheckPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath")
    private CharSequence healthCheckPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport
     * 
     */
    @JsonProperty("HealthCheckPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport")
    private CharSequence healthCheckPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol
     * 
     */
    @JsonProperty("HealthCheckProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol")
    private CharSequence healthCheckProtocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds
     * 
     */
    @JsonProperty("HealthCheckTimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds")
    private Number healthCheckTimeoutSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount
     * 
     */
    @JsonProperty("HealthyThresholdCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount")
    private Number healthyThresholdCount;
    /**
     * TargetGroupMatcher
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
     * 
     */
    @JsonProperty("Matcher")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html")
    private Property<TargetGroupMatcher> matcher;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port")
    private Number port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol")
    private CharSequence protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes
     * 
     */
    @JsonProperty("TargetGroupAttributes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes")
    private Set<Property<TargetGroupTargetGroupAttribute>> targetGroupAttributes = new LinkedHashSet<Property<TargetGroupTargetGroupAttribute>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype
     * 
     */
    @JsonProperty("TargetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype")
    private CharSequence targetType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets
     * 
     */
    @JsonProperty("Targets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets")
    private Set<Property<TargetGroupTargetDescription>> targets = new LinkedHashSet<Property<TargetGroupTargetDescription>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount
     * 
     */
    @JsonProperty("UnhealthyThresholdCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount")
    private Number unhealthyThresholdCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckEnabled() {
        return healthCheckEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled
     * 
     */
    @JsonIgnore
    public void setHealthCheckEnabled(CharSequence healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
    }

    public TargetGroup withHealthCheckEnabled(CharSequence healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds
     * 
     */
    @JsonIgnore
    public Number getHealthCheckIntervalSeconds() {
        return healthCheckIntervalSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds
     * 
     */
    @JsonIgnore
    public void setHealthCheckIntervalSeconds(Number healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    public TargetGroup withHealthCheckIntervalSeconds(Number healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckPath() {
        return healthCheckPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath
     * 
     */
    @JsonIgnore
    public void setHealthCheckPath(CharSequence healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    public TargetGroup withHealthCheckPath(CharSequence healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckPort() {
        return healthCheckPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport
     * 
     */
    @JsonIgnore
    public void setHealthCheckPort(CharSequence healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    public TargetGroup withHealthCheckPort(CharSequence healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckProtocol() {
        return healthCheckProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol
     * 
     */
    @JsonIgnore
    public void setHealthCheckProtocol(CharSequence healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    public TargetGroup withHealthCheckProtocol(CharSequence healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds
     * 
     */
    @JsonIgnore
    public Number getHealthCheckTimeoutSeconds() {
        return healthCheckTimeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds
     * 
     */
    @JsonIgnore
    public void setHealthCheckTimeoutSeconds(Number healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
    }

    public TargetGroup withHealthCheckTimeoutSeconds(Number healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount
     * 
     */
    @JsonIgnore
    public Number getHealthyThresholdCount() {
        return healthyThresholdCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount
     * 
     */
    @JsonIgnore
    public void setHealthyThresholdCount(Number healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }

    public TargetGroup withHealthyThresholdCount(Number healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
        return this;
    }

    /**
     * TargetGroupMatcher
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
     * 
     */
    @JsonIgnore
    public Property<TargetGroupMatcher> getMatcher() {
        return matcher;
    }

    /**
     * TargetGroupMatcher
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
     * 
     */
    @JsonIgnore
    public void setMatcher(Property<TargetGroupMatcher> matcher) {
        this.matcher = matcher;
    }

    public TargetGroup withMatcher(Property<TargetGroupMatcher> matcher) {
        this.matcher = matcher;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public TargetGroup withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port
     * 
     */
    @JsonIgnore
    public Number getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port
     * 
     */
    @JsonIgnore
    public void setPort(Number port) {
        this.port = port;
    }

    public TargetGroup withPort(Number port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol
     * 
     */
    @JsonIgnore
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol
     * 
     */
    @JsonIgnore
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public TargetGroup withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public TargetGroup withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes
     * 
     */
    @JsonIgnore
    public Set<Property<TargetGroupTargetGroupAttribute>> getTargetGroupAttributes() {
        return targetGroupAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes
     * 
     */
    @JsonIgnore
    public void setTargetGroupAttributes(Set<Property<TargetGroupTargetGroupAttribute>> targetGroupAttributes) {
        this.targetGroupAttributes = targetGroupAttributes;
    }

    public TargetGroup withTargetGroupAttributes(Set<Property<TargetGroupTargetGroupAttribute>> targetGroupAttributes) {
        this.targetGroupAttributes = targetGroupAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype
     * 
     */
    @JsonIgnore
    public CharSequence getTargetType() {
        return targetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype
     * 
     */
    @JsonIgnore
    public void setTargetType(CharSequence targetType) {
        this.targetType = targetType;
    }

    public TargetGroup withTargetType(CharSequence targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets
     * 
     */
    @JsonIgnore
    public Set<Property<TargetGroupTargetDescription>> getTargets() {
        return targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets
     * 
     */
    @JsonIgnore
    public void setTargets(Set<Property<TargetGroupTargetDescription>> targets) {
        this.targets = targets;
    }

    public TargetGroup withTargets(Set<Property<TargetGroupTargetDescription>> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount
     * 
     */
    @JsonIgnore
    public Number getUnhealthyThresholdCount() {
        return unhealthyThresholdCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount
     * 
     */
    @JsonIgnore
    public void setUnhealthyThresholdCount(Number unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }

    public TargetGroup withUnhealthyThresholdCount(Number unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid
     * 
     */
    @JsonIgnore
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid
     * 
     */
    @JsonIgnore
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public TargetGroup withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("healthCheckEnabled", healthCheckEnabled).append("healthCheckIntervalSeconds", healthCheckIntervalSeconds).append("healthCheckPath", healthCheckPath).append("healthCheckPort", healthCheckPort).append("healthCheckProtocol", healthCheckProtocol).append("healthCheckTimeoutSeconds", healthCheckTimeoutSeconds).append("healthyThresholdCount", healthyThresholdCount).append("matcher", matcher).append("name", name).append("port", port).append("protocol", protocol).append("tags", tags).append("targetGroupAttributes", targetGroupAttributes).append("targetType", targetType).append("targets", targets).append("unhealthyThresholdCount", unhealthyThresholdCount).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckEnabled).append(healthCheckTimeoutSeconds).append(healthCheckPort).append(targetType).append(matcher).append(healthCheckProtocol).append(targets).append(tags).append(healthCheckPath).append(protocol).append(port).append(healthCheckIntervalSeconds).append(healthyThresholdCount).append(vpcId).append(name).append(targetGroupAttributes).append(unhealthyThresholdCount).toHashCode();
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
        return new EqualsBuilder().append(healthCheckEnabled, rhs.healthCheckEnabled).append(healthCheckTimeoutSeconds, rhs.healthCheckTimeoutSeconds).append(healthCheckPort, rhs.healthCheckPort).append(targetType, rhs.targetType).append(matcher, rhs.matcher).append(healthCheckProtocol, rhs.healthCheckProtocol).append(targets, rhs.targets).append(tags, rhs.tags).append(healthCheckPath, rhs.healthCheckPath).append(protocol, rhs.protocol).append(port, rhs.port).append(healthCheckIntervalSeconds, rhs.healthCheckIntervalSeconds).append(healthyThresholdCount, rhs.healthyThresholdCount).append(vpcId, rhs.vpcId).append(name, rhs.name).append(targetGroupAttributes, rhs.targetGroupAttributes).append(unhealthyThresholdCount, rhs.unhealthyThresholdCount).isEquals();
    }

}
