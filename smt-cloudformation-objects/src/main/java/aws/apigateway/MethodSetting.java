
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MethodSetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CacheDataEncrypted",
    "CacheTtlInSeconds",
    "CachingEnabled",
    "DataTraceEnabled",
    "HttpMethod",
    "LoggingLevel",
    "MetricsEnabled",
    "ResourcePath",
    "ThrottlingBurstLimit",
    "ThrottlingRateLimit"
})
public class MethodSetting {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted
     * 
     */
    @JsonProperty("CacheDataEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted")
    private Boolean cacheDataEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds
     * 
     */
    @JsonProperty("CacheTtlInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds")
    private Integer cacheTtlInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled
     * 
     */
    @JsonProperty("CachingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled")
    private Boolean cachingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled
     * 
     */
    @JsonProperty("DataTraceEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled")
    private Boolean dataTraceEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod
     * 
     */
    @JsonProperty("HttpMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod")
    private CharSequence httpMethod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel
     * 
     */
    @JsonProperty("LoggingLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel")
    private CharSequence loggingLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled
     * 
     */
    @JsonProperty("MetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled")
    private Boolean metricsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath
     * 
     */
    @JsonProperty("ResourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath")
    private CharSequence resourcePath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit
     * 
     */
    @JsonProperty("ThrottlingBurstLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit")
    private Integer throttlingBurstLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit
     * 
     */
    @JsonProperty("ThrottlingRateLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit")
    private Double throttlingRateLimit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted
     * 
     */
    public Boolean getCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted
     * 
     */
    public void setCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    public MethodSetting withCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds
     * 
     */
    public Integer getCacheTtlInSeconds() {
        return cacheTtlInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds
     * 
     */
    public void setCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    public MethodSetting withCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled
     * 
     */
    public Boolean getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled
     * 
     */
    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    public MethodSetting withCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled
     * 
     */
    public Boolean getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled
     * 
     */
    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    public MethodSetting withDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod
     * 
     */
    public CharSequence getHttpMethod() {
        return httpMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod
     * 
     */
    public void setHttpMethod(CharSequence httpMethod) {
        this.httpMethod = httpMethod;
    }

    public MethodSetting withHttpMethod(CharSequence httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel
     * 
     */
    public CharSequence getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel
     * 
     */
    public void setLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public MethodSetting withLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled
     * 
     */
    public Boolean getMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled
     * 
     */
    public void setMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    public MethodSetting withMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath
     * 
     */
    public CharSequence getResourcePath() {
        return resourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath
     * 
     */
    public void setResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
    }

    public MethodSetting withResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit
     * 
     */
    public Integer getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit
     * 
     */
    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    public MethodSetting withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit
     * 
     */
    public Double getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit
     * 
     */
    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    public MethodSetting withThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cacheDataEncrypted", cacheDataEncrypted).append("cacheTtlInSeconds", cacheTtlInSeconds).append("cachingEnabled", cachingEnabled).append("dataTraceEnabled", dataTraceEnabled).append("httpMethod", httpMethod).append("loggingLevel", loggingLevel).append("metricsEnabled", metricsEnabled).append("resourcePath", resourcePath).append("throttlingBurstLimit", throttlingBurstLimit).append("throttlingRateLimit", throttlingRateLimit).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cacheDataEncrypted).append(throttlingBurstLimit).append(metricsEnabled).append(throttlingRateLimit).append(resourcePath).append(dataTraceEnabled).append(cachingEnabled).append(httpMethod).append(cacheTtlInSeconds).append(loggingLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MethodSetting) == false) {
            return false;
        }
        MethodSetting rhs = ((MethodSetting) other);
        return new EqualsBuilder().append(cacheDataEncrypted, rhs.cacheDataEncrypted).append(throttlingBurstLimit, rhs.throttlingBurstLimit).append(metricsEnabled, rhs.metricsEnabled).append(throttlingRateLimit, rhs.throttlingRateLimit).append(resourcePath, rhs.resourcePath).append(dataTraceEnabled, rhs.dataTraceEnabled).append(cachingEnabled, rhs.cachingEnabled).append(httpMethod, rhs.httpMethod).append(cacheTtlInSeconds, rhs.cacheTtlInSeconds).append(loggingLevel, rhs.loggingLevel).isEquals();
    }

}
