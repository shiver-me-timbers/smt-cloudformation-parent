
package aws.apigateway;

import java.util.LinkedHashSet;
import java.util.Map;
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
 * StageDescription
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CacheClusterEnabled",
    "CacheClusterSize",
    "CacheDataEncrypted",
    "CacheTtlInSeconds",
    "CachingEnabled",
    "ClientCertificateId",
    "DataTraceEnabled",
    "Description",
    "DocumentationVersion",
    "LoggingLevel",
    "MethodSettings",
    "MetricsEnabled",
    "ThrottlingBurstLimit",
    "ThrottlingRateLimit",
    "Variables"
})
public class StageDescription {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled")
    private Boolean cacheClusterEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize")
    private java.lang.String cacheClusterSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
    @JsonProperty("CacheDataEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted")
    private Boolean cacheDataEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds
     * 
     */
    @JsonProperty("CacheTtlInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds")
    private Integer cacheTtlInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled
     * 
     */
    @JsonProperty("CachingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled")
    private Boolean cachingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid")
    private java.lang.String clientCertificateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
    @JsonProperty("DataTraceEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled")
    private Boolean dataTraceEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description")
    private java.lang.String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion")
    private java.lang.String documentationVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    @JsonProperty("LoggingLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel")
    private java.lang.String loggingLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
    @JsonProperty("MethodSettings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings")
    private Set<MethodSetting> methodSettings = new LinkedHashSet<MethodSetting>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled
     * 
     */
    @JsonProperty("MetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled")
    private Boolean metricsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit
     * 
     */
    @JsonProperty("ThrottlingBurstLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit")
    private Integer throttlingBurstLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit
     * 
     */
    @JsonProperty("ThrottlingRateLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit")
    private Double throttlingRateLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables
     * 
     */
    @JsonProperty("Variables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables")
    private Map<String, String> variables;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
    @JsonProperty("CacheClusterEnabled")
    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    public StageDescription withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    public java.lang.String getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize
     * 
     */
    @JsonProperty("CacheClusterSize")
    public void setCacheClusterSize(java.lang.String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    public StageDescription withCacheClusterSize(java.lang.String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
    @JsonProperty("CacheDataEncrypted")
    public Boolean getCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
    @JsonProperty("CacheDataEncrypted")
    public void setCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    public StageDescription withCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds
     * 
     */
    @JsonProperty("CacheTtlInSeconds")
    public Integer getCacheTtlInSeconds() {
        return cacheTtlInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds
     * 
     */
    @JsonProperty("CacheTtlInSeconds")
    public void setCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    public StageDescription withCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled
     * 
     */
    @JsonProperty("CachingEnabled")
    public Boolean getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled
     * 
     */
    @JsonProperty("CachingEnabled")
    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    public StageDescription withCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    public java.lang.String getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    @JsonProperty("ClientCertificateId")
    public void setClientCertificateId(java.lang.String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    public StageDescription withClientCertificateId(java.lang.String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
    @JsonProperty("DataTraceEnabled")
    public Boolean getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
    @JsonProperty("DataTraceEnabled")
    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    public StageDescription withDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description
     * 
     */
    @JsonProperty("Description")
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public StageDescription withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    public java.lang.String getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    public void setDocumentationVersion(java.lang.String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    public StageDescription withDocumentationVersion(java.lang.String documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    @JsonProperty("LoggingLevel")
    public java.lang.String getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    @JsonProperty("LoggingLevel")
    public void setLoggingLevel(java.lang.String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public StageDescription withLoggingLevel(java.lang.String loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
    @JsonProperty("MethodSettings")
    public Set<MethodSetting> getMethodSettings() {
        return methodSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
    @JsonProperty("MethodSettings")
    public void setMethodSettings(Set<MethodSetting> methodSettings) {
        this.methodSettings = methodSettings;
    }

    public StageDescription withMethodSettings(Set<MethodSetting> methodSettings) {
        this.methodSettings = methodSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled
     * 
     */
    @JsonProperty("MetricsEnabled")
    public Boolean getMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled
     * 
     */
    @JsonProperty("MetricsEnabled")
    public void setMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    public StageDescription withMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit
     * 
     */
    @JsonProperty("ThrottlingBurstLimit")
    public Integer getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit
     * 
     */
    @JsonProperty("ThrottlingBurstLimit")
    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    public StageDescription withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit
     * 
     */
    @JsonProperty("ThrottlingRateLimit")
    public Double getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit
     * 
     */
    @JsonProperty("ThrottlingRateLimit")
    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    public StageDescription withThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables
     * 
     */
    @JsonProperty("Variables")
    public Map<String, String> getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables
     * 
     */
    @JsonProperty("Variables")
    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public StageDescription withVariables(Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("cacheClusterEnabled", cacheClusterEnabled).append("cacheClusterSize", cacheClusterSize).append("cacheDataEncrypted", cacheDataEncrypted).append("cacheTtlInSeconds", cacheTtlInSeconds).append("cachingEnabled", cachingEnabled).append("clientCertificateId", clientCertificateId).append("dataTraceEnabled", dataTraceEnabled).append("description", description).append("documentationVersion", documentationVersion).append("loggingLevel", loggingLevel).append("methodSettings", methodSettings).append("metricsEnabled", metricsEnabled).append("throttlingBurstLimit", throttlingBurstLimit).append("throttlingRateLimit", throttlingRateLimit).append("variables", variables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metricsEnabled).append(variables).append(clientCertificateId).append(dataTraceEnabled).append(description).append(cacheClusterEnabled).append(cachingEnabled).append(cacheDataEncrypted).append(throttlingBurstLimit).append(throttlingRateLimit).append(documentationVersion).append(cacheClusterSize).append(methodSettings).append(cacheTtlInSeconds).append(loggingLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StageDescription) == false) {
            return false;
        }
        StageDescription rhs = ((StageDescription) other);
        return new EqualsBuilder().append(metricsEnabled, rhs.metricsEnabled).append(variables, rhs.variables).append(clientCertificateId, rhs.clientCertificateId).append(dataTraceEnabled, rhs.dataTraceEnabled).append(description, rhs.description).append(cacheClusterEnabled, rhs.cacheClusterEnabled).append(cachingEnabled, rhs.cachingEnabled).append(cacheDataEncrypted, rhs.cacheDataEncrypted).append(throttlingBurstLimit, rhs.throttlingBurstLimit).append(throttlingRateLimit, rhs.throttlingRateLimit).append(documentationVersion, rhs.documentationVersion).append(cacheClusterSize, rhs.cacheClusterSize).append(methodSettings, rhs.methodSettings).append(cacheTtlInSeconds, rhs.cacheTtlInSeconds).append(loggingLevel, rhs.loggingLevel).isEquals();
    }

}
