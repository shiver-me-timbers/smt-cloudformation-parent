
package aws.emr;

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
 * Cluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private AdditionalInfo additionalInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications
     * 
     */
    @JsonProperty("Applications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications")
    private Set<Application> applications = new LinkedHashSet<Application>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole
     * 
     */
    @JsonProperty("AutoScalingRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole")
    private String autoScalingRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions
     * 
     */
    @JsonProperty("BootstrapActions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions")
    private Set<BootstrapActionConfig> bootstrapActions = new LinkedHashSet<BootstrapActionConfig>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations
     * 
     */
    @JsonProperty("Configurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations")
    private Set<Configuration> configurations = new LinkedHashSet<Configuration>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid
     * 
     */
    @JsonProperty("CustomAmiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid")
    private String customAmiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize
     * 
     */
    @JsonProperty("EbsRootVolumeSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize")
    private Integer ebsRootVolumeSize;
    /**
     * JobFlowInstancesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
     * 
     */
    @JsonProperty("Instances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html")
    private JobFlowInstancesConfig instances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole
     * 
     */
    @JsonProperty("JobFlowRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole")
    private String jobFlowRole;
    /**
     * KerberosAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html
     * 
     */
    @JsonProperty("KerberosAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html")
    private KerberosAttributes kerberosAttributes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri
     * 
     */
    @JsonProperty("LogUri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri")
    private String logUri;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel
     * 
     */
    @JsonProperty("ReleaseLabel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel")
    private String releaseLabel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior
     * 
     */
    @JsonProperty("ScaleDownBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior")
    private String scaleDownBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration
     * 
     */
    @JsonProperty("SecurityConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration")
    private String securityConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole")
    private String serviceRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers
     * 
     */
    @JsonProperty("VisibleToAllUsers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers")
    private Boolean visibleToAllUsers;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo
     * 
     */
    @JsonProperty("AdditionalInfo")
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo
     * 
     */
    @JsonProperty("AdditionalInfo")
    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Cluster withAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications
     * 
     */
    @JsonProperty("Applications")
    public Set<Application> getApplications() {
        return applications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications
     * 
     */
    @JsonProperty("Applications")
    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }

    public Cluster withApplications(Set<Application> applications) {
        this.applications = applications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole
     * 
     */
    @JsonProperty("AutoScalingRole")
    public String getAutoScalingRole() {
        return autoScalingRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole
     * 
     */
    @JsonProperty("AutoScalingRole")
    public void setAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
    }

    public Cluster withAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions
     * 
     */
    @JsonProperty("BootstrapActions")
    public Set<BootstrapActionConfig> getBootstrapActions() {
        return bootstrapActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions
     * 
     */
    @JsonProperty("BootstrapActions")
    public void setBootstrapActions(Set<BootstrapActionConfig> bootstrapActions) {
        this.bootstrapActions = bootstrapActions;
    }

    public Cluster withBootstrapActions(Set<BootstrapActionConfig> bootstrapActions) {
        this.bootstrapActions = bootstrapActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations
     * 
     */
    @JsonProperty("Configurations")
    public Set<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations
     * 
     */
    @JsonProperty("Configurations")
    public void setConfigurations(Set<Configuration> configurations) {
        this.configurations = configurations;
    }

    public Cluster withConfigurations(Set<Configuration> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid
     * 
     */
    @JsonProperty("CustomAmiId")
    public String getCustomAmiId() {
        return customAmiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid
     * 
     */
    @JsonProperty("CustomAmiId")
    public void setCustomAmiId(String customAmiId) {
        this.customAmiId = customAmiId;
    }

    public Cluster withCustomAmiId(String customAmiId) {
        this.customAmiId = customAmiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize
     * 
     */
    @JsonProperty("EbsRootVolumeSize")
    public Integer getEbsRootVolumeSize() {
        return ebsRootVolumeSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize
     * 
     */
    @JsonProperty("EbsRootVolumeSize")
    public void setEbsRootVolumeSize(Integer ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
    }

    public Cluster withEbsRootVolumeSize(Integer ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
        return this;
    }

    /**
     * JobFlowInstancesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
     * 
     */
    @JsonProperty("Instances")
    public JobFlowInstancesConfig getInstances() {
        return instances;
    }

    /**
     * JobFlowInstancesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
     * 
     */
    @JsonProperty("Instances")
    public void setInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
    }

    public Cluster withInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole
     * 
     */
    @JsonProperty("JobFlowRole")
    public String getJobFlowRole() {
        return jobFlowRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole
     * 
     */
    @JsonProperty("JobFlowRole")
    public void setJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }

    public Cluster withJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
        return this;
    }

    /**
     * KerberosAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html
     * 
     */
    @JsonProperty("KerberosAttributes")
    public KerberosAttributes getKerberosAttributes() {
        return kerberosAttributes;
    }

    /**
     * KerberosAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html
     * 
     */
    @JsonProperty("KerberosAttributes")
    public void setKerberosAttributes(KerberosAttributes kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
    }

    public Cluster withKerberosAttributes(KerberosAttributes kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri
     * 
     */
    @JsonProperty("LogUri")
    public String getLogUri() {
        return logUri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri
     * 
     */
    @JsonProperty("LogUri")
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    public Cluster withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Cluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel
     * 
     */
    @JsonProperty("ReleaseLabel")
    public String getReleaseLabel() {
        return releaseLabel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel
     * 
     */
    @JsonProperty("ReleaseLabel")
    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    public Cluster withReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior
     * 
     */
    @JsonProperty("ScaleDownBehavior")
    public String getScaleDownBehavior() {
        return scaleDownBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior
     * 
     */
    @JsonProperty("ScaleDownBehavior")
    public void setScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
    }

    public Cluster withScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration
     * 
     */
    @JsonProperty("SecurityConfiguration")
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration
     * 
     */
    @JsonProperty("SecurityConfiguration")
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    public Cluster withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    public Cluster withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Cluster withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers
     * 
     */
    @JsonProperty("VisibleToAllUsers")
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers
     * 
     */
    @JsonProperty("VisibleToAllUsers")
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    public Cluster withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalInfo", additionalInfo).append("applications", applications).append("autoScalingRole", autoScalingRole).append("bootstrapActions", bootstrapActions).append("configurations", configurations).append("customAmiId", customAmiId).append("ebsRootVolumeSize", ebsRootVolumeSize).append("instances", instances).append("jobFlowRole", jobFlowRole).append("kerberosAttributes", kerberosAttributes).append("logUri", logUri).append("name", name).append("releaseLabel", releaseLabel).append("scaleDownBehavior", scaleDownBehavior).append("securityConfiguration", securityConfiguration).append("serviceRole", serviceRole).append("tags", tags).append("visibleToAllUsers", visibleToAllUsers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customAmiId).append(instances).append(serviceRole).append(configurations).append(ebsRootVolumeSize).append(releaseLabel).append(visibleToAllUsers).append(jobFlowRole).append(tags).append(scaleDownBehavior).append(additionalInfo).append(name).append(autoScalingRole).append(securityConfiguration).append(applications).append(bootstrapActions).append(kerberosAttributes).append(logUri).toHashCode();
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
        return new EqualsBuilder().append(customAmiId, rhs.customAmiId).append(instances, rhs.instances).append(serviceRole, rhs.serviceRole).append(configurations, rhs.configurations).append(ebsRootVolumeSize, rhs.ebsRootVolumeSize).append(releaseLabel, rhs.releaseLabel).append(visibleToAllUsers, rhs.visibleToAllUsers).append(jobFlowRole, rhs.jobFlowRole).append(tags, rhs.tags).append(scaleDownBehavior, rhs.scaleDownBehavior).append(additionalInfo, rhs.additionalInfo).append(name, rhs.name).append(autoScalingRole, rhs.autoScalingRole).append(securityConfiguration, rhs.securityConfiguration).append(applications, rhs.applications).append(bootstrapActions, rhs.bootstrapActions).append(kerberosAttributes, rhs.kerberosAttributes).append(logUri, rhs.logUri).isEquals();
    }

}