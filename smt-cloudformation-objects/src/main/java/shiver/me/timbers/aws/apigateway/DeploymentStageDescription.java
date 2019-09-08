
package shiver.me.timbers.aws.apigateway;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
 * DeploymentStageDescription
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccessLogSetting",
    "CacheClusterEnabled",
    "CacheClusterSize",
    "CacheDataEncrypted",
    "CacheTtlInSeconds",
    "CachingEnabled",
    "CanarySetting",
    "ClientCertificateId",
    "DataTraceEnabled",
    "Description",
    "DocumentationVersion",
    "LoggingLevel",
    "MethodSettings",
    "MetricsEnabled",
    "Tags",
    "ThrottlingBurstLimit",
    "ThrottlingRateLimit",
    "TracingEnabled",
    "Variables"
})
public class DeploymentStageDescription implements Property<DeploymentStageDescription>
{

    /**
     * DeploymentAccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html
     * 
     */
    @JsonProperty("AccessLogSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html")
    private Property<DeploymentAccessLogSetting> accessLogSetting;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled")
    private CharSequence cacheClusterEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize")
    private CharSequence cacheClusterSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
    @JsonProperty("CacheDataEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted")
    private CharSequence cacheDataEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds
     * 
     */
    @JsonProperty("CacheTtlInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds")
    private Number cacheTtlInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled
     * 
     */
    @JsonProperty("CachingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled")
    private CharSequence cachingEnabled;
    /**
     * DeploymentCanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html
     * 
     */
    @JsonProperty("CanarySetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html")
    private Property<DeploymentCanarySetting> canarySetting;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid")
    private CharSequence clientCertificateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
    @JsonProperty("DataTraceEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled")
    private CharSequence dataTraceEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion")
    private CharSequence documentationVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    @JsonProperty("LoggingLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel")
    private CharSequence loggingLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
    @JsonProperty("MethodSettings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings")
    private Set<Property<DeploymentMethodSetting>> methodSettings = new LinkedHashSet<Property<DeploymentMethodSetting>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled
     * 
     */
    @JsonProperty("MetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled")
    private CharSequence metricsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit
     * 
     */
    @JsonProperty("ThrottlingBurstLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit")
    private Number throttlingBurstLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit
     * 
     */
    @JsonProperty("ThrottlingRateLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit")
    private Number throttlingRateLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tracingenabled
     * 
     */
    @JsonProperty("TracingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tracingenabled")
    private CharSequence tracingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables")
    private Map<String, CharSequence> variables;

    /**
     * DeploymentAccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentAccessLogSetting> getAccessLogSetting() {
        return accessLogSetting;
    }

    /**
     * DeploymentAccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html
     * 
     */
    @JsonIgnore
    public void setAccessLogSetting(Property<DeploymentAccessLogSetting> accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
    }

    public DeploymentStageDescription withAccessLogSetting(Property<DeploymentAccessLogSetting> accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
    @JsonIgnore
    public CharSequence getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
    @JsonIgnore
    public void setCacheClusterEnabled(CharSequence cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    public DeploymentStageDescription withCacheClusterEnabled(CharSequence cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize
     * 
     */
    @JsonIgnore
    public CharSequence getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize
     * 
     */
    @JsonIgnore
    public void setCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    public DeploymentStageDescription withCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
    @JsonIgnore
    public CharSequence getCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
    @JsonIgnore
    public void setCacheDataEncrypted(CharSequence cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    public DeploymentStageDescription withCacheDataEncrypted(CharSequence cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds
     * 
     */
    @JsonIgnore
    public Number getCacheTtlInSeconds() {
        return cacheTtlInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds
     * 
     */
    @JsonIgnore
    public void setCacheTtlInSeconds(Number cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    public DeploymentStageDescription withCacheTtlInSeconds(Number cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled
     * 
     */
    @JsonIgnore
    public void setCachingEnabled(CharSequence cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    public DeploymentStageDescription withCachingEnabled(CharSequence cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
        return this;
    }

    /**
     * DeploymentCanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentCanarySetting> getCanarySetting() {
        return canarySetting;
    }

    /**
     * DeploymentCanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html
     * 
     */
    @JsonIgnore
    public void setCanarySetting(Property<DeploymentCanarySetting> canarySetting) {
        this.canarySetting = canarySetting;
    }

    public DeploymentStageDescription withCanarySetting(Property<DeploymentCanarySetting> canarySetting) {
        this.canarySetting = canarySetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    @JsonIgnore
    public CharSequence getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    @JsonIgnore
    public void setClientCertificateId(CharSequence clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    public DeploymentStageDescription withClientCertificateId(CharSequence clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
    @JsonIgnore
    public CharSequence getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
    @JsonIgnore
    public void setDataTraceEnabled(CharSequence dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    public DeploymentStageDescription withDataTraceEnabled(CharSequence dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public DeploymentStageDescription withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    @JsonIgnore
    public CharSequence getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    @JsonIgnore
    public void setDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    public DeploymentStageDescription withDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    @JsonIgnore
    public CharSequence getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    @JsonIgnore
    public void setLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public DeploymentStageDescription withLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentMethodSetting>> getMethodSettings() {
        return methodSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
    @JsonIgnore
    public void setMethodSettings(Set<Property<DeploymentMethodSetting>> methodSettings) {
        this.methodSettings = methodSettings;
    }

    public DeploymentStageDescription withMethodSettings(Set<Property<DeploymentMethodSetting>> methodSettings) {
        this.methodSettings = methodSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled
     * 
     */
    @JsonIgnore
    public void setMetricsEnabled(CharSequence metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    public DeploymentStageDescription withMetricsEnabled(CharSequence metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public DeploymentStageDescription withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit
     * 
     */
    @JsonIgnore
    public Number getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit
     * 
     */
    @JsonIgnore
    public void setThrottlingBurstLimit(Number throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    public DeploymentStageDescription withThrottlingBurstLimit(Number throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit
     * 
     */
    @JsonIgnore
    public Number getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit
     * 
     */
    @JsonIgnore
    public void setThrottlingRateLimit(Number throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    public DeploymentStageDescription withThrottlingRateLimit(Number throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tracingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getTracingEnabled() {
        return tracingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tracingenabled
     * 
     */
    @JsonIgnore
    public void setTracingEnabled(CharSequence tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
    }

    public DeploymentStageDescription withTracingEnabled(CharSequence tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables
     * 
     */
    @JsonIgnore
    public void setVariables(Map<String, CharSequence> variables) {
        this.variables = variables;
    }

    public DeploymentStageDescription withVariables(Map<String, CharSequence> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("accessLogSetting", accessLogSetting).append("cacheClusterEnabled", cacheClusterEnabled).append("cacheClusterSize", cacheClusterSize).append("cacheDataEncrypted", cacheDataEncrypted).append("cacheTtlInSeconds", cacheTtlInSeconds).append("cachingEnabled", cachingEnabled).append("canarySetting", canarySetting).append("clientCertificateId", clientCertificateId).append("dataTraceEnabled", dataTraceEnabled).append("description", description).append("documentationVersion", documentationVersion).append("loggingLevel", loggingLevel).append("methodSettings", methodSettings).append("metricsEnabled", metricsEnabled).append("tags", tags).append("throttlingBurstLimit", throttlingBurstLimit).append("throttlingRateLimit", throttlingRateLimit).append("tracingEnabled", tracingEnabled).append("variables", variables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metricsEnabled).append(variables).append(clientCertificateId).append(dataTraceEnabled).append(description).append(cacheClusterEnabled).append(canarySetting).append(cachingEnabled).append(tags).append(cacheDataEncrypted).append(throttlingBurstLimit).append(throttlingRateLimit).append(documentationVersion).append(accessLogSetting).append(cacheClusterSize).append(methodSettings).append(cacheTtlInSeconds).append(loggingLevel).append(tracingEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentStageDescription) == false) {
            return false;
        }
        DeploymentStageDescription rhs = ((DeploymentStageDescription) other);
        return new EqualsBuilder().append(metricsEnabled, rhs.metricsEnabled).append(variables, rhs.variables).append(clientCertificateId, rhs.clientCertificateId).append(dataTraceEnabled, rhs.dataTraceEnabled).append(description, rhs.description).append(cacheClusterEnabled, rhs.cacheClusterEnabled).append(canarySetting, rhs.canarySetting).append(cachingEnabled, rhs.cachingEnabled).append(tags, rhs.tags).append(cacheDataEncrypted, rhs.cacheDataEncrypted).append(throttlingBurstLimit, rhs.throttlingBurstLimit).append(throttlingRateLimit, rhs.throttlingRateLimit).append(documentationVersion, rhs.documentationVersion).append(accessLogSetting, rhs.accessLogSetting).append(cacheClusterSize, rhs.cacheClusterSize).append(methodSettings, rhs.methodSettings).append(cacheTtlInSeconds, rhs.cacheTtlInSeconds).append(loggingLevel, rhs.loggingLevel).append(tracingEnabled, rhs.tracingEnabled).isEquals();
    }

}
