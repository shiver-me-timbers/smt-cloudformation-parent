
package shiver.me.timbers.aws.apigateway;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DeploymentMethodSetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
public class DeploymentMethodSetting implements Property<DeploymentMethodSetting>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted
     * 
     */
    @JsonProperty("CacheDataEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted")
    private CharSequence cacheDataEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds
     * 
     */
    @JsonProperty("CacheTtlInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds")
    private Number cacheTtlInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled
     * 
     */
    @JsonProperty("CachingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled")
    private CharSequence cachingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled
     * 
     */
    @JsonProperty("DataTraceEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled")
    private CharSequence dataTraceEnabled;
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
    private CharSequence metricsEnabled;
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
    private Number throttlingBurstLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit
     * 
     */
    @JsonProperty("ThrottlingRateLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit")
    private Number throttlingRateLimit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted
     * 
     */
    @JsonIgnore
    public CharSequence getCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted
     * 
     */
    @JsonIgnore
    public void setCacheDataEncrypted(CharSequence cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    public DeploymentMethodSetting withCacheDataEncrypted(CharSequence cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds
     * 
     */
    @JsonIgnore
    public Number getCacheTtlInSeconds() {
        return cacheTtlInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds
     * 
     */
    @JsonIgnore
    public void setCacheTtlInSeconds(Number cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    public DeploymentMethodSetting withCacheTtlInSeconds(Number cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled
     * 
     */
    @JsonIgnore
    public void setCachingEnabled(CharSequence cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    public DeploymentMethodSetting withCachingEnabled(CharSequence cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled
     * 
     */
    @JsonIgnore
    public CharSequence getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled
     * 
     */
    @JsonIgnore
    public void setDataTraceEnabled(CharSequence dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    public DeploymentMethodSetting withDataTraceEnabled(CharSequence dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod
     * 
     */
    @JsonIgnore
    public CharSequence getHttpMethod() {
        return httpMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod
     * 
     */
    @JsonIgnore
    public void setHttpMethod(CharSequence httpMethod) {
        this.httpMethod = httpMethod;
    }

    public DeploymentMethodSetting withHttpMethod(CharSequence httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel
     * 
     */
    @JsonIgnore
    public CharSequence getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel
     * 
     */
    @JsonIgnore
    public void setLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public DeploymentMethodSetting withLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled
     * 
     */
    @JsonIgnore
    public void setMetricsEnabled(CharSequence metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    public DeploymentMethodSetting withMetricsEnabled(CharSequence metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath
     * 
     */
    @JsonIgnore
    public CharSequence getResourcePath() {
        return resourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath
     * 
     */
    @JsonIgnore
    public void setResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
    }

    public DeploymentMethodSetting withResourcePath(CharSequence resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit
     * 
     */
    @JsonIgnore
    public Number getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit
     * 
     */
    @JsonIgnore
    public void setThrottlingBurstLimit(Number throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    public DeploymentMethodSetting withThrottlingBurstLimit(Number throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit
     * 
     */
    @JsonIgnore
    public Number getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit
     * 
     */
    @JsonIgnore
    public void setThrottlingRateLimit(Number throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    public DeploymentMethodSetting withThrottlingRateLimit(Number throttlingRateLimit) {
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
        if ((other instanceof DeploymentMethodSetting) == false) {
            return false;
        }
        DeploymentMethodSetting rhs = ((DeploymentMethodSetting) other);
        return new EqualsBuilder().append(cacheDataEncrypted, rhs.cacheDataEncrypted).append(throttlingBurstLimit, rhs.throttlingBurstLimit).append(metricsEnabled, rhs.metricsEnabled).append(throttlingRateLimit, rhs.throttlingRateLimit).append(resourcePath, rhs.resourcePath).append(dataTraceEnabled, rhs.dataTraceEnabled).append(cachingEnabled, rhs.cachingEnabled).append(httpMethod, rhs.httpMethod).append(cacheTtlInSeconds, rhs.cacheTtlInSeconds).append(loggingLevel, rhs.loggingLevel).isEquals();
    }

}
