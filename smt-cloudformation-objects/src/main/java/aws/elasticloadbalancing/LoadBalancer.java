
package aws.elasticloadbalancing;

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
 * LoadBalancer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private AccessLoggingPolicy accessLoggingPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy
     * 
     */
    @JsonProperty("AppCookieStickinessPolicy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy")
    private Set<AppCookieStickinessPolicy> appCookieStickinessPolicy = new LinkedHashSet<AppCookieStickinessPolicy>();
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
    private ConnectionDrainingPolicy connectionDrainingPolicy;
    /**
     * ConnectionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
     * 
     */
    @JsonProperty("ConnectionSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html")
    private ConnectionSettings connectionSettings;
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
    private HealthCheck healthCheck;
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
    private Set<LBCookieStickinessPolicy> lBCookieStickinessPolicy = new LinkedHashSet<LBCookieStickinessPolicy>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners
     * 
     */
    @JsonProperty("Listeners")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners")
    private Set<Listeners> listeners = new LinkedHashSet<Listeners>();
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
    private Set<Policies> policies = new LinkedHashSet<Policies>();
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
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * AccessLoggingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
     * 
     */
    public AccessLoggingPolicy getAccessLoggingPolicy() {
        return accessLoggingPolicy;
    }

    /**
     * AccessLoggingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
     * 
     */
    public void setAccessLoggingPolicy(AccessLoggingPolicy accessLoggingPolicy) {
        this.accessLoggingPolicy = accessLoggingPolicy;
    }

    public LoadBalancer withAccessLoggingPolicy(AccessLoggingPolicy accessLoggingPolicy) {
        this.accessLoggingPolicy = accessLoggingPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy
     * 
     */
    public Set<AppCookieStickinessPolicy> getAppCookieStickinessPolicy() {
        return appCookieStickinessPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy
     * 
     */
    public void setAppCookieStickinessPolicy(Set<AppCookieStickinessPolicy> appCookieStickinessPolicy) {
        this.appCookieStickinessPolicy = appCookieStickinessPolicy;
    }

    public LoadBalancer withAppCookieStickinessPolicy(Set<AppCookieStickinessPolicy> appCookieStickinessPolicy) {
        this.appCookieStickinessPolicy = appCookieStickinessPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones
     * 
     */
    public Set<CharSequence> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones
     * 
     */
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
    public ConnectionDrainingPolicy getConnectionDrainingPolicy() {
        return connectionDrainingPolicy;
    }

    /**
     * ConnectionDrainingPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html
     * 
     */
    public void setConnectionDrainingPolicy(ConnectionDrainingPolicy connectionDrainingPolicy) {
        this.connectionDrainingPolicy = connectionDrainingPolicy;
    }

    public LoadBalancer withConnectionDrainingPolicy(ConnectionDrainingPolicy connectionDrainingPolicy) {
        this.connectionDrainingPolicy = connectionDrainingPolicy;
        return this;
    }

    /**
     * ConnectionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
     * 
     */
    public ConnectionSettings getConnectionSettings() {
        return connectionSettings;
    }

    /**
     * ConnectionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
     * 
     */
    public void setConnectionSettings(ConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
    }

    public LoadBalancer withConnectionSettings(ConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone
     * 
     */
    public Boolean getCrossZone() {
        return crossZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone
     * 
     */
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
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
     * 
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    public LoadBalancer withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances
     * 
     */
    public Set<CharSequence> getInstances() {
        return instances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances
     * 
     */
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
    public Set<LBCookieStickinessPolicy> getLBCookieStickinessPolicy() {
        return lBCookieStickinessPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy
     * 
     */
    public void setLBCookieStickinessPolicy(Set<LBCookieStickinessPolicy> lBCookieStickinessPolicy) {
        this.lBCookieStickinessPolicy = lBCookieStickinessPolicy;
    }

    public LoadBalancer withLBCookieStickinessPolicy(Set<LBCookieStickinessPolicy> lBCookieStickinessPolicy) {
        this.lBCookieStickinessPolicy = lBCookieStickinessPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners
     * 
     */
    public Set<Listeners> getListeners() {
        return listeners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners
     * 
     */
    public void setListeners(Set<Listeners> listeners) {
        this.listeners = listeners;
    }

    public LoadBalancer withListeners(Set<Listeners> listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname
     * 
     */
    public CharSequence getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname
     * 
     */
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
    public Set<Policies> getPolicies() {
        return policies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies
     * 
     */
    public void setPolicies(Set<Policies> policies) {
        this.policies = policies;
    }

    public LoadBalancer withPolicies(Set<Policies> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme
     * 
     */
    public CharSequence getScheme() {
        return scheme;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme
     * 
     */
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
    public Set<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups
     * 
     */
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
    public Set<CharSequence> getSubnets() {
        return subnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets
     * 
     */
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
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public LoadBalancer withTags(List<Tag> tags) {
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
