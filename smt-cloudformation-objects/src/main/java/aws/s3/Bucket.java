
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
     * AccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    @JsonProperty("AccelerateConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html")
    private Property<AccelerateConfiguration> accelerateConfiguration;
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
    private Set<Property<AnalyticsConfiguration>> analyticsConfigurations = new LinkedHashSet<Property<AnalyticsConfiguration>>();
    /**
     * BucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    @JsonProperty("BucketEncryption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html")
    private Property<BucketEncryption> bucketEncryption;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name")
    private CharSequence bucketName;
    /**
     * CorsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
     * 
     */
    @JsonProperty("CorsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html")
    private Property<CorsConfiguration> corsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    @JsonProperty("InventoryConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations")
    private Set<Property<InventoryConfiguration>> inventoryConfigurations = new LinkedHashSet<Property<InventoryConfiguration>>();
    /**
     * LifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    @JsonProperty("LifecycleConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html")
    private Property<LifecycleConfiguration> lifecycleConfiguration;
    /**
     * LoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    @JsonProperty("LoggingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html")
    private Property<LoggingConfiguration> loggingConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    @JsonProperty("MetricsConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations")
    private Set<Property<MetricsConfiguration>> metricsConfigurations = new LinkedHashSet<Property<MetricsConfiguration>>();
    /**
     * NotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    @JsonProperty("NotificationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html")
    private Property<NotificationConfiguration> notificationConfiguration;
    /**
     * PublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html
     * 
     */
    @JsonProperty("PublicAccessBlockConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html")
    private Property<PublicAccessBlockConfiguration> publicAccessBlockConfiguration;
    /**
     * ReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    @JsonProperty("ReplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html")
    private Property<ReplicationConfiguration> replicationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * VersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    @JsonProperty("VersioningConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html")
    private Property<VersioningConfiguration> versioningConfiguration;
    /**
     * WebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    @JsonProperty("WebsiteConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html")
    private Property<WebsiteConfiguration> websiteConfiguration;

    /**
     * AccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<AccelerateConfiguration> getAccelerateConfiguration() {
        return accelerateConfiguration;
    }

    /**
     * AccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAccelerateConfiguration(Property<AccelerateConfiguration> accelerateConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
    }

    public Bucket withAccelerateConfiguration(Property<AccelerateConfiguration> accelerateConfiguration) {
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
    public Set<Property<AnalyticsConfiguration>> getAnalyticsConfigurations() {
        return analyticsConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations
     * 
     */
    @JsonIgnore
    public void setAnalyticsConfigurations(Set<Property<AnalyticsConfiguration>> analyticsConfigurations) {
        this.analyticsConfigurations = analyticsConfigurations;
    }

    public Bucket withAnalyticsConfigurations(Set<Property<AnalyticsConfiguration>> analyticsConfigurations) {
        this.analyticsConfigurations = analyticsConfigurations;
        return this;
    }

    /**
     * BucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    @JsonIgnore
    public Property<BucketEncryption> getBucketEncryption() {
        return bucketEncryption;
    }

    /**
     * BucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    @JsonIgnore
    public void setBucketEncryption(Property<BucketEncryption> bucketEncryption) {
        this.bucketEncryption = bucketEncryption;
    }

    public Bucket withBucketEncryption(Property<BucketEncryption> bucketEncryption) {
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
     * CorsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
     * 
     */
    @JsonIgnore
    public Property<CorsConfiguration> getCorsConfiguration() {
        return corsConfiguration;
    }

    /**
     * CorsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
     * 
     */
    @JsonIgnore
    public void setCorsConfiguration(Property<CorsConfiguration> corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
    }

    public Bucket withCorsConfiguration(Property<CorsConfiguration> corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    @JsonIgnore
    public Set<Property<InventoryConfiguration>> getInventoryConfigurations() {
        return inventoryConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    @JsonIgnore
    public void setInventoryConfigurations(Set<Property<InventoryConfiguration>> inventoryConfigurations) {
        this.inventoryConfigurations = inventoryConfigurations;
    }

    public Bucket withInventoryConfigurations(Set<Property<InventoryConfiguration>> inventoryConfigurations) {
        this.inventoryConfigurations = inventoryConfigurations;
        return this;
    }

    /**
     * LifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    @JsonIgnore
    public Property<LifecycleConfiguration> getLifecycleConfiguration() {
        return lifecycleConfiguration;
    }

    /**
     * LifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    @JsonIgnore
    public void setLifecycleConfiguration(Property<LifecycleConfiguration> lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    public Bucket withLifecycleConfiguration(Property<LifecycleConfiguration> lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
        return this;
    }

    /**
     * LoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    @JsonIgnore
    public Property<LoggingConfiguration> getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * LoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    @JsonIgnore
    public void setLoggingConfiguration(Property<LoggingConfiguration> loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    public Bucket withLoggingConfiguration(Property<LoggingConfiguration> loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    @JsonIgnore
    public Set<Property<MetricsConfiguration>> getMetricsConfigurations() {
        return metricsConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    @JsonIgnore
    public void setMetricsConfigurations(Set<Property<MetricsConfiguration>> metricsConfigurations) {
        this.metricsConfigurations = metricsConfigurations;
    }

    public Bucket withMetricsConfigurations(Set<Property<MetricsConfiguration>> metricsConfigurations) {
        this.metricsConfigurations = metricsConfigurations;
        return this;
    }

    /**
     * NotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    @JsonIgnore
    public Property<NotificationConfiguration> getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * NotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    @JsonIgnore
    public void setNotificationConfiguration(Property<NotificationConfiguration> notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    public Bucket withNotificationConfiguration(Property<NotificationConfiguration> notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
     * PublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<PublicAccessBlockConfiguration> getPublicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
    }

    /**
     * PublicAccessBlockConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html
     * 
     */
    @JsonIgnore
    public void setPublicAccessBlockConfiguration(Property<PublicAccessBlockConfiguration> publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    public Bucket withPublicAccessBlockConfiguration(Property<PublicAccessBlockConfiguration> publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        return this;
    }

    /**
     * ReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ReplicationConfiguration> getReplicationConfiguration() {
        return replicationConfiguration;
    }

    /**
     * ReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setReplicationConfiguration(Property<ReplicationConfiguration> replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    public Bucket withReplicationConfiguration(Property<ReplicationConfiguration> replicationConfiguration) {
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
     * VersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    @JsonIgnore
    public Property<VersioningConfiguration> getVersioningConfiguration() {
        return versioningConfiguration;
    }

    /**
     * VersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    @JsonIgnore
    public void setVersioningConfiguration(Property<VersioningConfiguration> versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    public Bucket withVersioningConfiguration(Property<VersioningConfiguration> versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
        return this;
    }

    /**
     * WebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<WebsiteConfiguration> getWebsiteConfiguration() {
        return websiteConfiguration;
    }

    /**
     * WebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    @JsonIgnore
    public void setWebsiteConfiguration(Property<WebsiteConfiguration> websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
    }

    public Bucket withWebsiteConfiguration(Property<WebsiteConfiguration> websiteConfiguration) {
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
