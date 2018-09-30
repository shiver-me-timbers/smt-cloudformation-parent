
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
    "ThrottlingBurstLimit",
    "ThrottlingRateLimit",
    "Variables"
})
public class StageDescription {

    /**
     * AccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    @JsonProperty("AccessLogSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html")
    private AccessLogSetting accessLogSetting;
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
    private CharSequence cacheClusterSize;
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
     * CanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    @JsonProperty("CanarySetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html")
    private CanarySetting canarySetting;
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
    private Boolean dataTraceEnabled;
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
     * AccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    public AccessLogSetting getAccessLogSetting() {
        return accessLogSetting;
    }

    /**
     * AccessLogSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html
     * 
     */
    public void setAccessLogSetting(AccessLogSetting accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
    }

    public StageDescription withAccessLogSetting(AccessLogSetting accessLogSetting) {
        this.accessLogSetting = accessLogSetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled
     * 
     */
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
    public CharSequence getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize
     * 
     */
    public void setCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    public StageDescription withCacheClusterSize(CharSequence cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
    public Boolean getCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted
     * 
     */
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
    public Integer getCacheTtlInSeconds() {
        return cacheTtlInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds
     * 
     */
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
    public Boolean getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled
     * 
     */
    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    public StageDescription withCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
        return this;
    }

    /**
     * CanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    public CanarySetting getCanarySetting() {
        return canarySetting;
    }

    /**
     * CanarySetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html
     * 
     */
    public void setCanarySetting(CanarySetting canarySetting) {
        this.canarySetting = canarySetting;
    }

    public StageDescription withCanarySetting(CanarySetting canarySetting) {
        this.canarySetting = canarySetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    public CharSequence getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid
     * 
     */
    public void setClientCertificateId(CharSequence clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    public StageDescription withClientCertificateId(CharSequence clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
    public Boolean getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled
     * 
     */
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
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public StageDescription withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    public CharSequence getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion
     * 
     */
    public void setDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    public StageDescription withDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    public CharSequence getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel
     * 
     */
    public void setLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public StageDescription withLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
    public Set<MethodSetting> getMethodSettings() {
        return methodSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings
     * 
     */
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
    public Boolean getMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled
     * 
     */
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
    public Integer getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit
     * 
     */
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
    public Double getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit
     * 
     */
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
    public Map<String, String> getVariables() {
        return variables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables
     * 
     */
    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public StageDescription withVariables(Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("accessLogSetting", accessLogSetting).append("cacheClusterEnabled", cacheClusterEnabled).append("cacheClusterSize", cacheClusterSize).append("cacheDataEncrypted", cacheDataEncrypted).append("cacheTtlInSeconds", cacheTtlInSeconds).append("cachingEnabled", cachingEnabled).append("canarySetting", canarySetting).append("clientCertificateId", clientCertificateId).append("dataTraceEnabled", dataTraceEnabled).append("description", description).append("documentationVersion", documentationVersion).append("loggingLevel", loggingLevel).append("methodSettings", methodSettings).append("metricsEnabled", metricsEnabled).append("throttlingBurstLimit", throttlingBurstLimit).append("throttlingRateLimit", throttlingRateLimit).append("variables", variables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metricsEnabled).append(variables).append(clientCertificateId).append(dataTraceEnabled).append(description).append(cacheClusterEnabled).append(canarySetting).append(cachingEnabled).append(cacheDataEncrypted).append(throttlingBurstLimit).append(throttlingRateLimit).append(documentationVersion).append(accessLogSetting).append(cacheClusterSize).append(methodSettings).append(cacheTtlInSeconds).append(loggingLevel).toHashCode();
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
        return new EqualsBuilder().append(metricsEnabled, rhs.metricsEnabled).append(variables, rhs.variables).append(clientCertificateId, rhs.clientCertificateId).append(dataTraceEnabled, rhs.dataTraceEnabled).append(description, rhs.description).append(cacheClusterEnabled, rhs.cacheClusterEnabled).append(canarySetting, rhs.canarySetting).append(cachingEnabled, rhs.cachingEnabled).append(cacheDataEncrypted, rhs.cacheDataEncrypted).append(throttlingBurstLimit, rhs.throttlingBurstLimit).append(throttlingRateLimit, rhs.throttlingRateLimit).append(documentationVersion, rhs.documentationVersion).append(accessLogSetting, rhs.accessLogSetting).append(cacheClusterSize, rhs.cacheClusterSize).append(methodSettings, rhs.methodSettings).append(cacheTtlInSeconds, rhs.cacheTtlInSeconds).append(loggingLevel, rhs.loggingLevel).isEquals();
    }

}
