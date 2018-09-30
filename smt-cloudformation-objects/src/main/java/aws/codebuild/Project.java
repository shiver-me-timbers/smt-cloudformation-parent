
package aws.codebuild;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private VpcConfig vpcConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources
     * 
     */
    @JsonProperty("SecondarySources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources")
    private List<Source> secondarySources = new ArrayList<Source>();
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
    private ProjectTriggers triggers;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts
     * 
     */
    @JsonProperty("SecondaryArtifacts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts")
    private List<Artifacts> secondaryArtifacts = new ArrayList<Artifacts>();
    /**
     * Source
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
     * 
     */
    @JsonProperty("Source")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html")
    private Source source;
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
    private Artifacts artifacts;
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
    private LogsConfig logsConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole
     * 
     */
    @JsonProperty("ServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole")
    private CharSequence serviceRole;
    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html")
    private Environment environment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags")
    private List<Tag> tags = new ArrayList<Tag>();
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
    private ProjectCache cache;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description
     * 
     */
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
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html
     * 
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Project withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources
     * 
     */
    public List<Source> getSecondarySources() {
        return secondarySources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources
     * 
     */
    public void setSecondarySources(List<Source> secondarySources) {
        this.secondarySources = secondarySources;
    }

    public Project withSecondarySources(List<Source> secondarySources) {
        this.secondarySources = secondarySources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey
     * 
     */
    public CharSequence getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey
     * 
     */
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
    public ProjectTriggers getTriggers() {
        return triggers;
    }

    /**
     * ProjectTriggers
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html
     * 
     */
    public void setTriggers(ProjectTriggers triggers) {
        this.triggers = triggers;
    }

    public Project withTriggers(ProjectTriggers triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts
     * 
     */
    public List<Artifacts> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts
     * 
     */
    public void setSecondaryArtifacts(List<Artifacts> secondaryArtifacts) {
        this.secondaryArtifacts = secondaryArtifacts;
    }

    public Project withSecondaryArtifacts(List<Artifacts> secondaryArtifacts) {
        this.secondaryArtifacts = secondaryArtifacts;
        return this;
    }

    /**
     * Source
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
     * 
     */
    public Source getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
     * 
     */
    public void setSource(Source source) {
        this.source = source;
    }

    public Project withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name
     * 
     */
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
    public Artifacts getArtifacts() {
        return artifacts;
    }

    /**
     * Artifacts
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html
     * 
     */
    public void setArtifacts(Artifacts artifacts) {
        this.artifacts = artifacts;
    }

    public Project withArtifacts(Artifacts artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled
     * 
     */
    public Boolean getBadgeEnabled() {
        return badgeEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled
     * 
     */
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
    public LogsConfig getLogsConfig() {
        return logsConfig;
    }

    /**
     * LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html
     * 
     */
    public void setLogsConfig(LogsConfig logsConfig) {
        this.logsConfig = logsConfig;
    }

    public Project withLogsConfig(LogsConfig logsConfig) {
        this.logsConfig = logsConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole
     * 
     */
    public CharSequence getServiceRole() {
        return serviceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole
     * 
     */
    public void setServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
    }

    public Project withServiceRole(CharSequence serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
     * 
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * Environment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
     * 
     */
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Project withEnvironment(Environment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Project withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes
     * 
     */
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes
     * 
     */
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
    public ProjectCache getCache() {
        return cache;
    }

    /**
     * ProjectCache
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html
     * 
     */
    public void setCache(ProjectCache cache) {
        this.cache = cache;
    }

    public Project withCache(ProjectCache cache) {
        this.cache = cache;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("vpcConfig", vpcConfig).append("secondarySources", secondarySources).append("encryptionKey", encryptionKey).append("triggers", triggers).append("secondaryArtifacts", secondaryArtifacts).append("source", source).append("name", name).append("artifacts", artifacts).append("badgeEnabled", badgeEnabled).append("logsConfig", logsConfig).append("serviceRole", serviceRole).append("environment", environment).append("tags", tags).append("timeoutInMinutes", timeoutInMinutes).append("cache", cache).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logsConfig).append(cache).append(secondarySources).append(serviceRole).append(description).append(encryptionKey).append(source).append(triggers).append(secondaryArtifacts).append(tags).append(environment).append(vpcConfig).append(name).append(timeoutInMinutes).append(badgeEnabled).append(artifacts).toHashCode();
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
        return new EqualsBuilder().append(logsConfig, rhs.logsConfig).append(cache, rhs.cache).append(secondarySources, rhs.secondarySources).append(serviceRole, rhs.serviceRole).append(description, rhs.description).append(encryptionKey, rhs.encryptionKey).append(source, rhs.source).append(triggers, rhs.triggers).append(secondaryArtifacts, rhs.secondaryArtifacts).append(tags, rhs.tags).append(environment, rhs.environment).append(vpcConfig, rhs.vpcConfig).append(name, rhs.name).append(timeoutInMinutes, rhs.timeoutInMinutes).append(badgeEnabled, rhs.badgeEnabled).append(artifacts, rhs.artifacts).isEquals();
    }

}
