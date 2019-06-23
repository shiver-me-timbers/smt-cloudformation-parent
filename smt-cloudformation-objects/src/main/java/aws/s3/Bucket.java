
package aws.s3;

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
 * Bucket
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccelerateConfiguration",
    "AccessControl",
    "AnalyticsConfigurations",
    "BucketEncryption",
    "BucketName",
    "CorsConfiguration",
    "InventoryConfigurations",
    "LifecycleConfiguration",
    "LoggingConfiguration",
    "MetricsConfigurations",
    "NotificationConfiguration",
    "PublicAccessBlockConfiguration",
    "ReplicationConfiguration",
    "Tags",
    "VersioningConfiguration",
    "WebsiteConfiguration"
})
public class Bucket {

    /**
     * BucketAccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    @JsonProperty("AccelerateConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html")
    private Property<BucketAccelerateConfiguration> accelerateConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol
     * 
     */
    @JsonProperty("AccessControl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol")
    private CharSequence accessControl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations
     * 
     */
    @JsonProperty("AnalyticsConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations")
    private Set<Property<BucketAnalyticsConfiguration>> analyticsConfigurations = new LinkedHashSet<Property<BucketAnalyticsConfiguration>>();
    /**
     * BucketBucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    @JsonProperty("BucketEncryption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html")
    private Property<BucketBucketEncryption> bucketEncryption;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name")
    private CharSequence bucketName;
    /**
     * BucketCorsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
     * 
     */
    @JsonProperty("CorsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html")
    private Property<BucketCorsConfiguration> corsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    @JsonProperty("InventoryConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations")
    private Set<Property<BucketInventoryConfiguration>> inventoryConfigurations = new LinkedHashSet<Property<BucketInventoryConfiguration>>();
    /**
     * BucketLifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    @JsonProperty("LifecycleConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html")
    private Property<BucketLifecycleConfiguration> lifecycleConfiguration;
    /**
     * BucketLoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    @JsonProperty("LoggingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html")
    private Property<BucketLoggingConfiguration> loggingConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    @JsonProperty("MetricsConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations")
    private Set<Property<BucketMetricsConfiguration>> metricsConfigurations = new LinkedHashSet<Property<BucketMetricsConfiguration>>();
    /**
     * BucketNotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    @JsonProperty("NotificationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html")
    private Property<BucketNotificationConfiguration> notificationConfiguration;
    /**
     * BucketPublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html
     * 
     */
    @JsonProperty("PublicAccessBlockConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html")
    private Property<BucketPublicAccessBlockConfiguration> publicAccessBlockConfiguration;
    /**
     * BucketReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    @JsonProperty("ReplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html")
    private Property<BucketReplicationConfiguration> replicationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * BucketVersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    @JsonProperty("VersioningConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html")
    private Property<BucketVersioningConfiguration> versioningConfiguration;
    /**
     * BucketWebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    @JsonProperty("WebsiteConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html")
    private Property<BucketWebsiteConfiguration> websiteConfiguration;

    /**
     * BucketAccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<BucketAccelerateConfiguration> getAccelerateConfiguration() {
        return accelerateConfiguration;
    }

    /**
     * BucketAccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAccelerateConfiguration(Property<BucketAccelerateConfiguration> accelerateConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
    }

    public Bucket withAccelerateConfiguration(Property<BucketAccelerateConfiguration> accelerateConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol
     * 
     */
    @JsonIgnore
    public CharSequence getAccessControl() {
        return accessControl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol
     * 
     */
    @JsonIgnore
    public void setAccessControl(CharSequence accessControl) {
        this.accessControl = accessControl;
    }

    public Bucket withAccessControl(CharSequence accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations
     * 
     */
    @JsonIgnore
    public Set<Property<BucketAnalyticsConfiguration>> getAnalyticsConfigurations() {
        return analyticsConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations
     * 
     */
    @JsonIgnore
    public void setAnalyticsConfigurations(Set<Property<BucketAnalyticsConfiguration>> analyticsConfigurations) {
        this.analyticsConfigurations = analyticsConfigurations;
    }

    public Bucket withAnalyticsConfigurations(Set<Property<BucketAnalyticsConfiguration>> analyticsConfigurations) {
        this.analyticsConfigurations = analyticsConfigurations;
        return this;
    }

    /**
     * BucketBucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    @JsonIgnore
    public Property<BucketBucketEncryption> getBucketEncryption() {
        return bucketEncryption;
    }

    /**
     * BucketBucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    @JsonIgnore
    public void setBucketEncryption(Property<BucketBucketEncryption> bucketEncryption) {
        this.bucketEncryption = bucketEncryption;
    }

    public Bucket withBucketEncryption(Property<BucketBucketEncryption> bucketEncryption) {
        this.bucketEncryption = bucketEncryption;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name
     * 
     */
    @JsonIgnore
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name
     * 
     */
    @JsonIgnore
    public void setBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
    }

    public Bucket withBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * BucketCorsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
     * 
     */
    @JsonIgnore
    public Property<BucketCorsConfiguration> getCorsConfiguration() {
        return corsConfiguration;
    }

    /**
     * BucketCorsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
     * 
     */
    @JsonIgnore
    public void setCorsConfiguration(Property<BucketCorsConfiguration> corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
    }

    public Bucket withCorsConfiguration(Property<BucketCorsConfiguration> corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    @JsonIgnore
    public Set<Property<BucketInventoryConfiguration>> getInventoryConfigurations() {
        return inventoryConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    @JsonIgnore
    public void setInventoryConfigurations(Set<Property<BucketInventoryConfiguration>> inventoryConfigurations) {
        this.inventoryConfigurations = inventoryConfigurations;
    }

    public Bucket withInventoryConfigurations(Set<Property<BucketInventoryConfiguration>> inventoryConfigurations) {
        this.inventoryConfigurations = inventoryConfigurations;
        return this;
    }

    /**
     * BucketLifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    @JsonIgnore
    public Property<BucketLifecycleConfiguration> getLifecycleConfiguration() {
        return lifecycleConfiguration;
    }

    /**
     * BucketLifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    @JsonIgnore
    public void setLifecycleConfiguration(Property<BucketLifecycleConfiguration> lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    public Bucket withLifecycleConfiguration(Property<BucketLifecycleConfiguration> lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
        return this;
    }

    /**
     * BucketLoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    @JsonIgnore
    public Property<BucketLoggingConfiguration> getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * BucketLoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    @JsonIgnore
    public void setLoggingConfiguration(Property<BucketLoggingConfiguration> loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    public Bucket withLoggingConfiguration(Property<BucketLoggingConfiguration> loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    @JsonIgnore
    public Set<Property<BucketMetricsConfiguration>> getMetricsConfigurations() {
        return metricsConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    @JsonIgnore
    public void setMetricsConfigurations(Set<Property<BucketMetricsConfiguration>> metricsConfigurations) {
        this.metricsConfigurations = metricsConfigurations;
    }

    public Bucket withMetricsConfigurations(Set<Property<BucketMetricsConfiguration>> metricsConfigurations) {
        this.metricsConfigurations = metricsConfigurations;
        return this;
    }

    /**
     * BucketNotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    @JsonIgnore
    public Property<BucketNotificationConfiguration> getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * BucketNotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    @JsonIgnore
    public void setNotificationConfiguration(Property<BucketNotificationConfiguration> notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    public Bucket withNotificationConfiguration(Property<BucketNotificationConfiguration> notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
     * BucketPublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<BucketPublicAccessBlockConfiguration> getPublicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
    }

    /**
     * BucketPublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html
     * 
     */
    @JsonIgnore
    public void setPublicAccessBlockConfiguration(Property<BucketPublicAccessBlockConfiguration> publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    public Bucket withPublicAccessBlockConfiguration(Property<BucketPublicAccessBlockConfiguration> publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        return this;
    }

    /**
     * BucketReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<BucketReplicationConfiguration> getReplicationConfiguration() {
        return replicationConfiguration;
    }

    /**
     * BucketReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setReplicationConfiguration(Property<BucketReplicationConfiguration> replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    public Bucket withReplicationConfiguration(Property<BucketReplicationConfiguration> replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Bucket withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * BucketVersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    @JsonIgnore
    public Property<BucketVersioningConfiguration> getVersioningConfiguration() {
        return versioningConfiguration;
    }

    /**
     * BucketVersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    @JsonIgnore
    public void setVersioningConfiguration(Property<BucketVersioningConfiguration> versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    public Bucket withVersioningConfiguration(Property<BucketVersioningConfiguration> versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
        return this;
    }

    /**
     * BucketWebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<BucketWebsiteConfiguration> getWebsiteConfiguration() {
        return websiteConfiguration;
    }

    /**
     * BucketWebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    @JsonIgnore
    public void setWebsiteConfiguration(Property<BucketWebsiteConfiguration> websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
    }

    public Bucket withWebsiteConfiguration(Property<BucketWebsiteConfiguration> websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accelerateConfiguration", accelerateConfiguration).append("accessControl", accessControl).append("analyticsConfigurations", analyticsConfigurations).append("bucketEncryption", bucketEncryption).append("bucketName", bucketName).append("corsConfiguration", corsConfiguration).append("inventoryConfigurations", inventoryConfigurations).append("lifecycleConfiguration", lifecycleConfiguration).append("loggingConfiguration", loggingConfiguration).append("metricsConfigurations", metricsConfigurations).append("notificationConfiguration", notificationConfiguration).append("publicAccessBlockConfiguration", publicAccessBlockConfiguration).append("replicationConfiguration", replicationConfiguration).append("tags", tags).append("versioningConfiguration", versioningConfiguration).append("websiteConfiguration", websiteConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accessControl).append(bucketName).append(accelerateConfiguration).append(analyticsConfigurations).append(notificationConfiguration).append(bucketEncryption).append(publicAccessBlockConfiguration).append(loggingConfiguration).append(metricsConfigurations).append(replicationConfiguration).append(tags).append(corsConfiguration).append(lifecycleConfiguration).append(inventoryConfigurations).append(versioningConfiguration).append(websiteConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bucket) == false) {
            return false;
        }
        Bucket rhs = ((Bucket) other);
        return new EqualsBuilder().append(accessControl, rhs.accessControl).append(bucketName, rhs.bucketName).append(accelerateConfiguration, rhs.accelerateConfiguration).append(analyticsConfigurations, rhs.analyticsConfigurations).append(notificationConfiguration, rhs.notificationConfiguration).append(bucketEncryption, rhs.bucketEncryption).append(publicAccessBlockConfiguration, rhs.publicAccessBlockConfiguration).append(loggingConfiguration, rhs.loggingConfiguration).append(metricsConfigurations, rhs.metricsConfigurations).append(replicationConfiguration, rhs.replicationConfiguration).append(tags, rhs.tags).append(corsConfiguration, rhs.corsConfiguration).append(lifecycleConfiguration, rhs.lifecycleConfiguration).append(inventoryConfigurations, rhs.inventoryConfigurations).append(versioningConfiguration, rhs.versioningConfiguration).append(websiteConfiguration, rhs.websiteConfiguration).isEquals();
    }

}
