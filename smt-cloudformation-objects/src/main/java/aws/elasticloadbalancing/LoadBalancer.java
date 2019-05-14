
package aws.elasticloadbalancing;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LoadBalancer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccessLoggingPolicy",
    "AppCookieStickinessPolicy",
    "AvailabilityZones",
    "ConnectionDrainingPolicy",
    "ConnectionSettings",
    "CrossZone",
    "HealthCheck",
    "Instances",
    "LBCookieStickinessPolicy",
    "Listeners",
    "LoadBalancerName",
    "Policies",
    "Scheme",
    "SecurityGroups",
    "Subnets",
    "Tags"
})
public class LoadBalancer {

    /**
     * AccessLoggingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
     * 
     */
    @JsonProperty("AccessLoggingPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html")
    private Property<AccessLoggingPolicy> accessLoggingPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy
     * 
     */
    @JsonProperty("AppCookieStickinessPolicy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy")
    private Set<Property<AppCookieStickinessPolicy>> appCookieStickinessPolicy = new LinkedHashSet<Property<AppCookieStickinessPolicy>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones")
    private Set<CharSequence> availabilityZones = new LinkedHashSet<CharSequence>();
    /**
     * ConnectionDrainingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html
     * 
     */
    @JsonProperty("ConnectionDrainingPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html")
    private Property<ConnectionDrainingPolicy> connectionDrainingPolicy;
    /**
     * ConnectionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
     * 
     */
    @JsonProperty("ConnectionSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html")
    private Property<ConnectionSettings> connectionSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone
     * 
     */
    @JsonProperty("CrossZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone")
    private Boolean crossZone;
    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
     * 
     */
    @JsonProperty("HealthCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html")
    private Property<HealthCheck> healthCheck;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances
     * 
     */
    @JsonProperty("Instances")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances")
    private Set<CharSequence> instances = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy
     * 
     */
    @JsonProperty("LBCookieStickinessPolicy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy")
    private Set<Property<LBCookieStickinessPolicy>> lBCookieStickinessPolicy = new LinkedHashSet<Property<LBCookieStickinessPolicy>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners
     * 
     */
    @JsonProperty("Listeners")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners")
    private Set<Property<Listeners>> listeners = new LinkedHashSet<Property<Listeners>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname
     * 
     */
    @JsonProperty("LoadBalancerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname")
    private CharSequence loadBalancerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies
     * 
     */
    @JsonProperty("Policies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies")
    private Set<Property<Policies>> policies = new LinkedHashSet<Property<Policies>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme
     * 
     */
    @JsonProperty("Scheme")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme")
    private CharSequence scheme;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups")
    private Set<CharSequence> securityGroups = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets
     * 
     */
    @JsonProperty("Subnets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets")
    private Set<CharSequence> subnets = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * AccessLoggingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
     * 
     */
    @JsonIgnore
    public Property<AccessLoggingPolicy> getAccessLoggingPolicy() {
        return accessLoggingPolicy;
    }

    /**
     * AccessLoggingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
     * 
     */
    @JsonIgnore
    public void setAccessLoggingPolicy(Property<AccessLoggingPolicy> accessLoggingPolicy) {
        this.accessLoggingPolicy = accessLoggingPolicy;
    }

    public LoadBalancer withAccessLoggingPolicy(Property<AccessLoggingPolicy> accessLoggingPolicy) {
        this.accessLoggingPolicy = accessLoggingPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy
     * 
     */
    @JsonIgnore
    public Set<Property<AppCookieStickinessPolicy>> getAppCookieStickinessPolicy() {
        return appCookieStickinessPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy
     * 
     */
    @JsonIgnore
    public void setAppCookieStickinessPolicy(Set<Property<AppCookieStickinessPolicy>> appCookieStickinessPolicy) {
        this.appCookieStickinessPolicy = appCookieStickinessPolicy;
    }

    public LoadBalancer withAppCookieStickinessPolicy(Set<Property<AppCookieStickinessPolicy>> appCookieStickinessPolicy) {
        this.appCookieStickinessPolicy = appCookieStickinessPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones
     * 
     */
    @JsonIgnore
    public void setAvailabilityZones(Set<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public LoadBalancer withAvailabilityZones(Set<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * ConnectionDrainingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html
     * 
     */
    @JsonIgnore
    public Property<ConnectionDrainingPolicy> getConnectionDrainingPolicy() {
        return connectionDrainingPolicy;
    }

    /**
     * ConnectionDrainingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html
     * 
     */
    @JsonIgnore
    public void setConnectionDrainingPolicy(Property<ConnectionDrainingPolicy> connectionDrainingPolicy) {
        this.connectionDrainingPolicy = connectionDrainingPolicy;
    }

    public LoadBalancer withConnectionDrainingPolicy(Property<ConnectionDrainingPolicy> connectionDrainingPolicy) {
        this.connectionDrainingPolicy = connectionDrainingPolicy;
        return this;
    }

    /**
     * ConnectionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
     * 
     */
    @JsonIgnore
    public Property<ConnectionSettings> getConnectionSettings() {
        return connectionSettings;
    }

    /**
     * ConnectionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
     * 
     */
    @JsonIgnore
    public void setConnectionSettings(Property<ConnectionSettings> connectionSettings) {
        this.connectionSettings = connectionSettings;
    }

    public LoadBalancer withConnectionSettings(Property<ConnectionSettings> connectionSettings) {
        this.connectionSettings = connectionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone
     * 
     */
    @JsonIgnore
    public Boolean getCrossZone() {
        return crossZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone
     * 
     */
    @JsonIgnore
    public void setCrossZone(Boolean crossZone) {
        this.crossZone = crossZone;
    }

    public LoadBalancer withCrossZone(Boolean crossZone) {
        this.crossZone = crossZone;
        return this;
    }

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
     * 
     */
    @JsonIgnore
    public Property<HealthCheck> getHealthCheck() {
        return healthCheck;
    }

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
     * 
     */
    @JsonIgnore
    public void setHealthCheck(Property<HealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
    }

    public LoadBalancer withHealthCheck(Property<HealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getInstances() {
        return instances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances
     * 
     */
    @JsonIgnore
    public void setInstances(Set<CharSequence> instances) {
        this.instances = instances;
    }

    public LoadBalancer withInstances(Set<CharSequence> instances) {
        this.instances = instances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy
     * 
     */
    @JsonIgnore
    public Set<Property<LBCookieStickinessPolicy>> getLBCookieStickinessPolicy() {
        return lBCookieStickinessPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy
     * 
     */
    @JsonIgnore
    public void setLBCookieStickinessPolicy(Set<Property<LBCookieStickinessPolicy>> lBCookieStickinessPolicy) {
        this.lBCookieStickinessPolicy = lBCookieStickinessPolicy;
    }

    public LoadBalancer withLBCookieStickinessPolicy(Set<Property<LBCookieStickinessPolicy>> lBCookieStickinessPolicy) {
        this.lBCookieStickinessPolicy = lBCookieStickinessPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners
     * 
     */
    @JsonIgnore
    public Set<Property<Listeners>> getListeners() {
        return listeners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners
     * 
     */
    @JsonIgnore
    public void setListeners(Set<Property<Listeners>> listeners) {
        this.listeners = listeners;
    }

    public LoadBalancer withListeners(Set<Property<Listeners>> listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname
     * 
     */
    @JsonIgnore
    public CharSequence getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname
     * 
     */
    @JsonIgnore
    public void setLoadBalancerName(CharSequence loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public LoadBalancer withLoadBalancerName(CharSequence loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies
     * 
     */
    @JsonIgnore
    public Set<Property<Policies>> getPolicies() {
        return policies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies
     * 
     */
    @JsonIgnore
    public void setPolicies(Set<Property<Policies>> policies) {
        this.policies = policies;
    }

    public LoadBalancer withPolicies(Set<Property<Policies>> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme
     * 
     */
    @JsonIgnore
    public CharSequence getScheme() {
        return scheme;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme
     * 
     */
    @JsonIgnore
    public void setScheme(CharSequence scheme) {
        this.scheme = scheme;
    }

    public LoadBalancer withScheme(CharSequence scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public LoadBalancer withSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getSubnets() {
        return subnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets
     * 
     */
    @JsonIgnore
    public void setSubnets(Set<CharSequence> subnets) {
        this.subnets = subnets;
    }

    public LoadBalancer withSubnets(Set<CharSequence> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public LoadBalancer withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accessLoggingPolicy", accessLoggingPolicy).append("appCookieStickinessPolicy", appCookieStickinessPolicy).append("availabilityZones", availabilityZones).append("connectionDrainingPolicy", connectionDrainingPolicy).append("connectionSettings", connectionSettings).append("crossZone", crossZone).append("healthCheck", healthCheck).append("instances", instances).append("lBCookieStickinessPolicy", lBCookieStickinessPolicy).append("listeners", listeners).append("loadBalancerName", loadBalancerName).append("policies", policies).append("scheme", scheme).append("securityGroups", securityGroups).append("subnets", subnets).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accessLoggingPolicy).append(crossZone).append(lBCookieStickinessPolicy).append(listeners).append(scheme).append(instances).append(policies).append(availabilityZones).append(tags).append(connectionDrainingPolicy).append(loadBalancerName).append(healthCheck).append(connectionSettings).append(securityGroups).append(subnets).append(appCookieStickinessPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadBalancer) == false) {
            return false;
        }
        LoadBalancer rhs = ((LoadBalancer) other);
        return new EqualsBuilder().append(accessLoggingPolicy, rhs.accessLoggingPolicy).append(crossZone, rhs.crossZone).append(lBCookieStickinessPolicy, rhs.lBCookieStickinessPolicy).append(listeners, rhs.listeners).append(scheme, rhs.scheme).append(instances, rhs.instances).append(policies, rhs.policies).append(availabilityZones, rhs.availabilityZones).append(tags, rhs.tags).append(connectionDrainingPolicy, rhs.connectionDrainingPolicy).append(loadBalancerName, rhs.loadBalancerName).append(healthCheck, rhs.healthCheck).append(connectionSettings, rhs.connectionSettings).append(securityGroups, rhs.securityGroups).append(subnets, rhs.subnets).append(appCookieStickinessPolicy, rhs.appCookieStickinessPolicy).isEquals();
    }

}
