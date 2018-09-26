
package aws.s3;

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
 * Bucket
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private AccelerateConfiguration accelerateConfiguration;
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
    private Set<AnalyticsConfiguration> analyticsConfigurations = new LinkedHashSet<AnalyticsConfiguration>();
    /**
     * BucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    @JsonProperty("BucketEncryption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html")
    private BucketEncryption bucketEncryption;
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
    private CorsConfiguration corsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    @JsonProperty("InventoryConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations")
    private Set<InventoryConfiguration> inventoryConfigurations = new LinkedHashSet<InventoryConfiguration>();
    /**
     * LifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    @JsonProperty("LifecycleConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html")
    private LifecycleConfiguration lifecycleConfiguration;
    /**
     * LoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    @JsonProperty("LoggingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html")
    private LoggingConfiguration loggingConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    @JsonProperty("MetricsConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations")
    private Set<MetricsConfiguration> metricsConfigurations = new LinkedHashSet<MetricsConfiguration>();
    /**
     * NotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    @JsonProperty("NotificationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html")
    private NotificationConfiguration notificationConfiguration;
    /**
     * ReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    @JsonProperty("ReplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html")
    private ReplicationConfiguration replicationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * VersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    @JsonProperty("VersioningConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html")
    private VersioningConfiguration versioningConfiguration;
    /**
     * WebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    @JsonProperty("WebsiteConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html")
    private WebsiteConfiguration websiteConfiguration;

    /**
     * AccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    public AccelerateConfiguration getAccelerateConfiguration() {
        return accelerateConfiguration;
    }

    /**
     * AccelerateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html
     * 
     */
    public void setAccelerateConfiguration(AccelerateConfiguration accelerateConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
    }

    public Bucket withAccelerateConfiguration(AccelerateConfiguration accelerateConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol
     * 
     */
    public CharSequence getAccessControl() {
        return accessControl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol
     * 
     */
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
    public Set<AnalyticsConfiguration> getAnalyticsConfigurations() {
        return analyticsConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations
     * 
     */
    public void setAnalyticsConfigurations(Set<AnalyticsConfiguration> analyticsConfigurations) {
        this.analyticsConfigurations = analyticsConfigurations;
    }

    public Bucket withAnalyticsConfigurations(Set<AnalyticsConfiguration> analyticsConfigurations) {
        this.analyticsConfigurations = analyticsConfigurations;
        return this;
    }

    /**
     * BucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    public BucketEncryption getBucketEncryption() {
        return bucketEncryption;
    }

    /**
     * BucketEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
     * 
     */
    public void setBucketEncryption(BucketEncryption bucketEncryption) {
        this.bucketEncryption = bucketEncryption;
    }

    public Bucket withBucketEncryption(BucketEncryption bucketEncryption) {
        this.bucketEncryption = bucketEncryption;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name
     * 
     */
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name
     * 
     */
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
    public CorsConfiguration getCorsConfiguration() {
        return corsConfiguration;
    }

    /**
     * CorsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
     * 
     */
    public void setCorsConfiguration(CorsConfiguration corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
    }

    public Bucket withCorsConfiguration(CorsConfiguration corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    public Set<InventoryConfiguration> getInventoryConfigurations() {
        return inventoryConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations
     * 
     */
    public void setInventoryConfigurations(Set<InventoryConfiguration> inventoryConfigurations) {
        this.inventoryConfigurations = inventoryConfigurations;
    }

    public Bucket withInventoryConfigurations(Set<InventoryConfiguration> inventoryConfigurations) {
        this.inventoryConfigurations = inventoryConfigurations;
        return this;
    }

    /**
     * LifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    public LifecycleConfiguration getLifecycleConfiguration() {
        return lifecycleConfiguration;
    }

    /**
     * LifecycleConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
     * 
     */
    public void setLifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    public Bucket withLifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
        return this;
    }

    /**
     * LoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    public LoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * LoggingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
     * 
     */
    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    public Bucket withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    public Set<MetricsConfiguration> getMetricsConfigurations() {
        return metricsConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations
     * 
     */
    public void setMetricsConfigurations(Set<MetricsConfiguration> metricsConfigurations) {
        this.metricsConfigurations = metricsConfigurations;
    }

    public Bucket withMetricsConfigurations(Set<MetricsConfiguration> metricsConfigurations) {
        this.metricsConfigurations = metricsConfigurations;
        return this;
    }

    /**
     * NotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * NotificationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
     * 
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    public Bucket withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
     * ReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    public ReplicationConfiguration getReplicationConfiguration() {
        return replicationConfiguration;
    }

    /**
     * ReplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
     * 
     */
    public void setReplicationConfiguration(ReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    public Bucket withReplicationConfiguration(ReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Bucket withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * VersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    public VersioningConfiguration getVersioningConfiguration() {
        return versioningConfiguration;
    }

    /**
     * VersioningConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
     * 
     */
    public void setVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    public Bucket withVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
        return this;
    }

    /**
     * WebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    public WebsiteConfiguration getWebsiteConfiguration() {
        return websiteConfiguration;
    }

    /**
     * WebsiteConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html
     * 
     */
    public void setWebsiteConfiguration(WebsiteConfiguration websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
    }

    public Bucket withWebsiteConfiguration(WebsiteConfiguration websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accelerateConfiguration", accelerateConfiguration).append("accessControl", accessControl).append("analyticsConfigurations", analyticsConfigurations).append("bucketEncryption", bucketEncryption).append("bucketName", bucketName).append("corsConfiguration", corsConfiguration).append("inventoryConfigurations", inventoryConfigurations).append("lifecycleConfiguration", lifecycleConfiguration).append("loggingConfiguration", loggingConfiguration).append("metricsConfigurations", metricsConfigurations).append("notificationConfiguration", notificationConfiguration).append("replicationConfiguration", replicationConfiguration).append("tags", tags).append("versioningConfiguration", versioningConfiguration).append("websiteConfiguration", websiteConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accessControl).append(bucketName).append(accelerateConfiguration).append(analyticsConfigurations).append(notificationConfiguration).append(bucketEncryption).append(loggingConfiguration).append(metricsConfigurations).append(replicationConfiguration).append(tags).append(corsConfiguration).append(lifecycleConfiguration).append(inventoryConfigurations).append(versioningConfiguration).append(websiteConfiguration).toHashCode();
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
        return new EqualsBuilder().append(accessControl, rhs.accessControl).append(bucketName, rhs.bucketName).append(accelerateConfiguration, rhs.accelerateConfiguration).append(analyticsConfigurations, rhs.analyticsConfigurations).append(notificationConfiguration, rhs.notificationConfiguration).append(bucketEncryption, rhs.bucketEncryption).append(loggingConfiguration, rhs.loggingConfiguration).append(metricsConfigurations, rhs.metricsConfigurations).append(replicationConfiguration, rhs.replicationConfiguration).append(tags, rhs.tags).append(corsConfiguration, rhs.corsConfiguration).append(lifecycleConfiguration, rhs.lifecycleConfiguration).append(inventoryConfigurations, rhs.inventoryConfigurations).append(versioningConfiguration, rhs.versioningConfiguration).append(websiteConfiguration, rhs.websiteConfiguration).isEquals();
    }

}
