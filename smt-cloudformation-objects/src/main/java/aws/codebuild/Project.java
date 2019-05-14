
package aws.codebuild;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Project
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "VpcConfig",
    "SecondarySources",
    "EncryptionKey",
    "Triggers",
    "SecondaryArtifacts",
    "Source",
    "Name",
    "Artifacts",
    "BadgeEnabled",
    "LogsConfig",
    "ServiceRole",
    "QueuedTimeoutInMinutes",
    "Environment",
    "Tags",
    "TimeoutInMinutes",
    "Cache"
})
public class Project {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description")
    private CharSequence description;
    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html")
    private Property<VpcConfig> vpcConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources
     * 
     */
    @JsonProperty("SecondarySources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources")
    private List<Property<aws.codebuild.Source>> secondarySources = new ArrayList<Property<aws.codebuild.Source>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey
     * 
     */
    @JsonProperty("EncryptionKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey")
    private CharSequence encryptionKey;
    /**
     * ProjectTriggers
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html
     * 
     */
    @JsonProperty("Triggers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html")
    private Property<ProjectTriggers> triggers;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts
     * 
     */
    @JsonProperty("SecondaryArtifacts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts")
    private List<Property<aws.codebuild.Artifacts>> secondaryArtifacts = new ArrayList<Property<aws.codebuild.Artifacts>>();
    /**
     * Source
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
     * 
     */
    @JsonProperty("Source")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html")
    private Property<aws.codebuild.Source> source;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name")
    private CharSequence name;
    /**
     * Artifacts
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html
     * 
     */
    @JsonProperty("Artifacts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html")
    private Property<aws.codebuild.Artifacts> artifacts;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled
     * 
     */
    @JsonProperty("BadgeEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled")
    private Boolean badgeEnabled;
    /**
     * LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html
     * 
     */
    @JsonProperty("LogsConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html")
    private Property<LogsConfig> logsConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole")
    private CharSequence serviceRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes
     * 
     */
    @JsonProperty("QueuedTimeoutInMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes")
    private Integer queuedTimeoutInMinutes;
    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html")
    private Property<Environment> environment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes
     * 
     */
    @JsonProperty("TimeoutInMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes")
    private Integer timeoutInMinutes;
    /**
     * ProjectCache
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html
     * 
     */
    @JsonProperty("Cache")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html")
    private Property<ProjectCache> cache;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Project withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html
     * 
     */
    @JsonIgnore
    public Property<VpcConfig> getVpcConfig() {
        return vpcConfig;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html
     * 
     */
    @JsonIgnore
    public void setVpcConfig(Property<VpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Project withVpcConfig(Property<VpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources
     * 
     */
    @JsonIgnore
    public List<Property<aws.codebuild.Source>> getSecondarySources() {
        return secondarySources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources
     * 
     */
    @JsonIgnore
    public void setSecondarySources(List<Property<aws.codebuild.Source>> secondarySources) {
        this.secondarySources = secondarySources;
    }

    public Project withSecondarySources(List<Property<aws.codebuild.Source>> secondarySources) {
        this.secondarySources = secondarySources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey
     * 
     */
    @JsonIgnore
    public CharSequence getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey
     * 
     */
    @JsonIgnore
    public void setEncryptionKey(CharSequence encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public Project withEncryptionKey(CharSequence encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * ProjectTriggers
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html
     * 
     */
    @JsonIgnore
    public Property<ProjectTriggers> getTriggers() {
        return triggers;
    }

    /**
     * ProjectTriggers
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html
     * 
     */
    @JsonIgnore
    public void setTriggers(Property<ProjectTriggers> triggers) {
        this.triggers = triggers;
    }

    public Project withTriggers(Property<ProjectTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts
     * 
     */
    @JsonIgnore
    public List<Property<aws.codebuild.Artifacts>> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts
     * 
     */
    @JsonIgnore
    public void setSecondaryArtifacts(List<Property<aws.codebuild.Artifacts>> secondaryArtifacts) {
        this.secondaryArtifacts = secondaryArtifacts;
    }

    public Project withSecondaryArtifacts(List<Property<aws.codebuild.Artifacts>> secondaryArtifacts) {
        this.secondaryArtifacts = secondaryArtifacts;
        return this;
    }

    /**
     * Source
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
     * 
     */
    @JsonIgnore
    public Property<aws.codebuild.Source> getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
     * 
     */
    @JsonIgnore
    public void setSource(Property<aws.codebuild.Source> source) {
        this.source = source;
    }

    public Project withSource(Property<aws.codebuild.Source> source) {
        this.source = source;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Project withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * Artifacts
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html
     * 
     */
    @JsonIgnore
    public Property<aws.codebuild.Artifacts> getArtifacts() {
        return artifacts;
    }

    /**
     * Artifacts
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html
     * 
     */
    @JsonIgnore
    public void setArtifacts(Property<aws.codebuild.Artifacts> artifacts) {
        this.artifacts = artifacts;
    }

    public Project withArtifacts(Property<aws.codebuild.Artifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled
     * 
     */
    @JsonIgnore
    public Boolean getBadgeEnabled() {
        return badgeEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled
     * 
     */
    @JsonIgnore
    public void setBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    public Project withBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
        return this;
    }

    /**
     * LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html
     * 
     */
    @JsonIgnore
    public Property<LogsConfig> getLogsConfig() {
        return logsConfig;
    }

    /**
     * LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html
     * 
     */
    @JsonIgnore
    public void setLogsConfig(Property<LogsConfig> logsConfig) {
        this.logsConfig = logsConfig;
    }

    public Project withLogsConfig(Property<LogsConfig> logsConfig) {
        this.logsConfig = logsConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRole() {
        return serviceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole
     * 
     */
    @JsonIgnore
    public void setServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
    }

    public Project withServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes
     * 
     */
    @JsonIgnore
    public Integer getQueuedTimeoutInMinutes() {
        return queuedTimeoutInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes
     * 
     */
    @JsonIgnore
    public void setQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
    }

    public Project withQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
        return this;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
     * 
     */
    @JsonIgnore
    public Property<Environment> getEnvironment() {
        return environment;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
     * 
     */
    @JsonIgnore
    public void setEnvironment(Property<Environment> environment) {
        this.environment = environment;
    }

    public Project withEnvironment(Property<Environment> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Project withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes
     * 
     */
    @JsonIgnore
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes
     * 
     */
    @JsonIgnore
    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public Project withTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }

    /**
     * ProjectCache
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html
     * 
     */
    @JsonIgnore
    public Property<ProjectCache> getCache() {
        return cache;
    }

    /**
     * ProjectCache
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html
     * 
     */
    @JsonIgnore
    public void setCache(Property<ProjectCache> cache) {
        this.cache = cache;
    }

    public Project withCache(Property<ProjectCache> cache) {
        this.cache = cache;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("vpcConfig", vpcConfig).append("secondarySources", secondarySources).append("encryptionKey", encryptionKey).append("triggers", triggers).append("secondaryArtifacts", secondaryArtifacts).append("source", source).append("name", name).append("artifacts", artifacts).append("badgeEnabled", badgeEnabled).append("logsConfig", logsConfig).append("serviceRole", serviceRole).append("queuedTimeoutInMinutes", queuedTimeoutInMinutes).append("environment", environment).append("tags", tags).append("timeoutInMinutes", timeoutInMinutes).append("cache", cache).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logsConfig).append(cache).append(secondarySources).append(serviceRole).append(description).append(encryptionKey).append(source).append(triggers).append(secondaryArtifacts).append(tags).append(environment).append(vpcConfig).append(name).append(timeoutInMinutes).append(queuedTimeoutInMinutes).append(badgeEnabled).append(artifacts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Project) == false) {
            return false;
        }
        Project rhs = ((Project) other);
        return new EqualsBuilder().append(logsConfig, rhs.logsConfig).append(cache, rhs.cache).append(secondarySources, rhs.secondarySources).append(serviceRole, rhs.serviceRole).append(description, rhs.description).append(encryptionKey, rhs.encryptionKey).append(source, rhs.source).append(triggers, rhs.triggers).append(secondaryArtifacts, rhs.secondaryArtifacts).append(tags, rhs.tags).append(environment, rhs.environment).append(vpcConfig, rhs.vpcConfig).append(name, rhs.name).append(timeoutInMinutes, rhs.timeoutInMinutes).append(queuedTimeoutInMinutes, rhs.queuedTimeoutInMinutes).append(badgeEnabled, rhs.badgeEnabled).append(artifacts, rhs.artifacts).isEquals();
    }

}
