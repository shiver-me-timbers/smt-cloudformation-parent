
package aws.emr;

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
 * Cluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AdditionalInfo",
    "Applications",
    "AutoScalingRole",
    "BootstrapActions",
    "Configurations",
    "CustomAmiId",
    "EbsRootVolumeSize",
    "Instances",
    "JobFlowRole",
    "KerberosAttributes",
    "LogUri",
    "Name",
    "ReleaseLabel",
    "ScaleDownBehavior",
    "SecurityConfiguration",
    "ServiceRole",
    "Steps",
    "Tags",
    "VisibleToAllUsers"
})
public class Cluster {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo
     * 
     */
    @JsonProperty("AdditionalInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo")
    private Object additionalInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications
     * 
     */
    @JsonProperty("Applications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications")
    private Set<Property<ClusterApplication>> applications = new LinkedHashSet<Property<ClusterApplication>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole
     * 
     */
    @JsonProperty("AutoScalingRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole")
    private CharSequence autoScalingRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions
     * 
     */
    @JsonProperty("BootstrapActions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions")
    private Set<Property<ClusterBootstrapActionConfig>> bootstrapActions = new LinkedHashSet<Property<ClusterBootstrapActionConfig>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations")
    private Set<Property<ClusterConfiguration>> configurations = new LinkedHashSet<Property<ClusterConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid
     * 
     */
    @JsonProperty("CustomAmiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid")
    private CharSequence customAmiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize
     * 
     */
    @JsonProperty("EbsRootVolumeSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize")
    private Number ebsRootVolumeSize;
    /**
     * ClusterJobFlowInstancesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
     * 
     */
    @JsonProperty("Instances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html")
    private Property<ClusterJobFlowInstancesConfig> instances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole
     * 
     */
    @JsonProperty("JobFlowRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole")
    private CharSequence jobFlowRole;
    /**
     * ClusterKerberosAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html
     * 
     */
    @JsonProperty("KerberosAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html")
    private Property<ClusterKerberosAttributes> kerberosAttributes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri
     * 
     */
    @JsonProperty("LogUri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri")
    private CharSequence logUri;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel
     * 
     */
    @JsonProperty("ReleaseLabel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel")
    private CharSequence releaseLabel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior
     * 
     */
    @JsonProperty("ScaleDownBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior")
    private CharSequence scaleDownBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration
     * 
     */
    @JsonProperty("SecurityConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration")
    private CharSequence securityConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole")
    private CharSequence serviceRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-steps
     * 
     */
    @JsonProperty("Steps")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-steps")
    private Set<Property<ClusterStepConfig>> steps = new LinkedHashSet<Property<ClusterStepConfig>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers
     * 
     */
    @JsonProperty("VisibleToAllUsers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers")
    private CharSequence visibleToAllUsers;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo
     * 
     */
    @JsonIgnore
    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo
     * 
     */
    @JsonIgnore
    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Cluster withAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterApplication>> getApplications() {
        return applications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications
     * 
     */
    @JsonIgnore
    public void setApplications(Set<Property<ClusterApplication>> applications) {
        this.applications = applications;
    }

    public Cluster withApplications(Set<Property<ClusterApplication>> applications) {
        this.applications = applications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole
     * 
     */
    @JsonIgnore
    public CharSequence getAutoScalingRole() {
        return autoScalingRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole
     * 
     */
    @JsonIgnore
    public void setAutoScalingRole(CharSequence autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
    }

    public Cluster withAutoScalingRole(CharSequence autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterBootstrapActionConfig>> getBootstrapActions() {
        return bootstrapActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions
     * 
     */
    @JsonIgnore
    public void setBootstrapActions(Set<Property<ClusterBootstrapActionConfig>> bootstrapActions) {
        this.bootstrapActions = bootstrapActions;
    }

    public Cluster withBootstrapActions(Set<Property<ClusterBootstrapActionConfig>> bootstrapActions) {
        this.bootstrapActions = bootstrapActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterConfiguration>> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations
     * 
     */
    @JsonIgnore
    public void setConfigurations(Set<Property<ClusterConfiguration>> configurations) {
        this.configurations = configurations;
    }

    public Cluster withConfigurations(Set<Property<ClusterConfiguration>> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid
     * 
     */
    @JsonIgnore
    public CharSequence getCustomAmiId() {
        return customAmiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid
     * 
     */
    @JsonIgnore
    public void setCustomAmiId(CharSequence customAmiId) {
        this.customAmiId = customAmiId;
    }

    public Cluster withCustomAmiId(CharSequence customAmiId) {
        this.customAmiId = customAmiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize
     * 
     */
    @JsonIgnore
    public Number getEbsRootVolumeSize() {
        return ebsRootVolumeSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize
     * 
     */
    @JsonIgnore
    public void setEbsRootVolumeSize(Number ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
    }

    public Cluster withEbsRootVolumeSize(Number ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
        return this;
    }

    /**
     * ClusterJobFlowInstancesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
     * 
     */
    @JsonIgnore
    public Property<ClusterJobFlowInstancesConfig> getInstances() {
        return instances;
    }

    /**
     * ClusterJobFlowInstancesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
     * 
     */
    @JsonIgnore
    public void setInstances(Property<ClusterJobFlowInstancesConfig> instances) {
        this.instances = instances;
    }

    public Cluster withInstances(Property<ClusterJobFlowInstancesConfig> instances) {
        this.instances = instances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole
     * 
     */
    @JsonIgnore
    public CharSequence getJobFlowRole() {
        return jobFlowRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole
     * 
     */
    @JsonIgnore
    public void setJobFlowRole(CharSequence jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }

    public Cluster withJobFlowRole(CharSequence jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
        return this;
    }

    /**
     * ClusterKerberosAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html
     * 
     */
    @JsonIgnore
    public Property<ClusterKerberosAttributes> getKerberosAttributes() {
        return kerberosAttributes;
    }

    /**
     * ClusterKerberosAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html
     * 
     */
    @JsonIgnore
    public void setKerberosAttributes(Property<ClusterKerberosAttributes> kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
    }

    public Cluster withKerberosAttributes(Property<ClusterKerberosAttributes> kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri
     * 
     */
    @JsonIgnore
    public CharSequence getLogUri() {
        return logUri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri
     * 
     */
    @JsonIgnore
    public void setLogUri(CharSequence logUri) {
        this.logUri = logUri;
    }

    public Cluster withLogUri(CharSequence logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Cluster withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel
     * 
     */
    @JsonIgnore
    public CharSequence getReleaseLabel() {
        return releaseLabel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel
     * 
     */
    @JsonIgnore
    public void setReleaseLabel(CharSequence releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    public Cluster withReleaseLabel(CharSequence releaseLabel) {
        this.releaseLabel = releaseLabel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getScaleDownBehavior() {
        return scaleDownBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior
     * 
     */
    @JsonIgnore
    public void setScaleDownBehavior(CharSequence scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
    }

    public Cluster withScaleDownBehavior(CharSequence scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration
     * 
     */
    @JsonIgnore
    public void setSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    public Cluster withSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRole() {
        return serviceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole
     * 
     */
    @JsonIgnore
    public void setServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
    }

    public Cluster withServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-steps
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterStepConfig>> getSteps() {
        return steps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-steps
     * 
     */
    @JsonIgnore
    public void setSteps(Set<Property<ClusterStepConfig>> steps) {
        this.steps = steps;
    }

    public Cluster withSteps(Set<Property<ClusterStepConfig>> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Cluster withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers
     * 
     */
    @JsonIgnore
    public CharSequence getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers
     * 
     */
    @JsonIgnore
    public void setVisibleToAllUsers(CharSequence visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    public Cluster withVisibleToAllUsers(CharSequence visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalInfo", additionalInfo).append("applications", applications).append("autoScalingRole", autoScalingRole).append("bootstrapActions", bootstrapActions).append("configurations", configurations).append("customAmiId", customAmiId).append("ebsRootVolumeSize", ebsRootVolumeSize).append("instances", instances).append("jobFlowRole", jobFlowRole).append("kerberosAttributes", kerberosAttributes).append("logUri", logUri).append("name", name).append("releaseLabel", releaseLabel).append("scaleDownBehavior", scaleDownBehavior).append("securityConfiguration", securityConfiguration).append("serviceRole", serviceRole).append("steps", steps).append("tags", tags).append("visibleToAllUsers", visibleToAllUsers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customAmiId).append(instances).append(serviceRole).append(configurations).append(ebsRootVolumeSize).append(releaseLabel).append(visibleToAllUsers).append(jobFlowRole).append(steps).append(tags).append(scaleDownBehavior).append(additionalInfo).append(name).append(autoScalingRole).append(securityConfiguration).append(applications).append(bootstrapActions).append(kerberosAttributes).append(logUri).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cluster) == false) {
            return false;
        }
        Cluster rhs = ((Cluster) other);
        return new EqualsBuilder().append(customAmiId, rhs.customAmiId).append(instances, rhs.instances).append(serviceRole, rhs.serviceRole).append(configurations, rhs.configurations).append(ebsRootVolumeSize, rhs.ebsRootVolumeSize).append(releaseLabel, rhs.releaseLabel).append(visibleToAllUsers, rhs.visibleToAllUsers).append(jobFlowRole, rhs.jobFlowRole).append(steps, rhs.steps).append(tags, rhs.tags).append(scaleDownBehavior, rhs.scaleDownBehavior).append(additionalInfo, rhs.additionalInfo).append(name, rhs.name).append(autoScalingRole, rhs.autoScalingRole).append(securityConfiguration, rhs.securityConfiguration).append(applications, rhs.applications).append(bootstrapActions, rhs.bootstrapActions).append(kerberosAttributes, rhs.kerberosAttributes).append(logUri, rhs.logUri).isEquals();
    }

}
