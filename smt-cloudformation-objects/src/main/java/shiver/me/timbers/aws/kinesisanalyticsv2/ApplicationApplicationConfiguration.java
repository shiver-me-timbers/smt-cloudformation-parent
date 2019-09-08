
package shiver.me.timbers.aws.kinesisanalyticsv2;

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
 * ApplicationApplicationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApplicationCodeConfiguration",
    "EnvironmentProperties",
    "FlinkApplicationConfiguration",
    "SqlApplicationConfiguration",
    "ApplicationSnapshotConfiguration"
})
public class ApplicationApplicationConfiguration implements Property<ApplicationApplicationConfiguration>
{

    /**
     * ApplicationApplicationCodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html
     * 
     */
    @JsonProperty("ApplicationCodeConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html")
    private Property<ApplicationApplicationCodeConfiguration> applicationCodeConfiguration;
    /**
     * ApplicationEnvironmentProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html
     * 
     */
    @JsonProperty("EnvironmentProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html")
    private Property<ApplicationEnvironmentProperties> environmentProperties;
    /**
     * ApplicationFlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonProperty("FlinkApplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html")
    private Property<ApplicationFlinkApplicationConfiguration> flinkApplicationConfiguration;
    /**
     * ApplicationSqlApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html
     * 
     */
    @JsonProperty("SqlApplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html")
    private Property<ApplicationSqlApplicationConfiguration> sqlApplicationConfiguration;
    /**
     * ApplicationApplicationSnapshotConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html
     * 
     */
    @JsonProperty("ApplicationSnapshotConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html")
    private Property<ApplicationApplicationSnapshotConfiguration> applicationSnapshotConfiguration;

    /**
     * ApplicationApplicationCodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationApplicationCodeConfiguration> getApplicationCodeConfiguration() {
        return applicationCodeConfiguration;
    }

    /**
     * ApplicationApplicationCodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html
     * 
     */
    @JsonIgnore
    public void setApplicationCodeConfiguration(Property<ApplicationApplicationCodeConfiguration> applicationCodeConfiguration) {
        this.applicationCodeConfiguration = applicationCodeConfiguration;
    }

    public ApplicationApplicationConfiguration withApplicationCodeConfiguration(Property<ApplicationApplicationCodeConfiguration> applicationCodeConfiguration) {
        this.applicationCodeConfiguration = applicationCodeConfiguration;
        return this;
    }

    /**
     * ApplicationEnvironmentProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationEnvironmentProperties> getEnvironmentProperties() {
        return environmentProperties;
    }

    /**
     * ApplicationEnvironmentProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html
     * 
     */
    @JsonIgnore
    public void setEnvironmentProperties(Property<ApplicationEnvironmentProperties> environmentProperties) {
        this.environmentProperties = environmentProperties;
    }

    public ApplicationApplicationConfiguration withEnvironmentProperties(Property<ApplicationEnvironmentProperties> environmentProperties) {
        this.environmentProperties = environmentProperties;
        return this;
    }

    /**
     * ApplicationFlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationFlinkApplicationConfiguration> getFlinkApplicationConfiguration() {
        return flinkApplicationConfiguration;
    }

    /**
     * ApplicationFlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setFlinkApplicationConfiguration(Property<ApplicationFlinkApplicationConfiguration> flinkApplicationConfiguration) {
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
    }

    public ApplicationApplicationConfiguration withFlinkApplicationConfiguration(Property<ApplicationFlinkApplicationConfiguration> flinkApplicationConfiguration) {
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
        return this;
    }

    /**
     * ApplicationSqlApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationSqlApplicationConfiguration> getSqlApplicationConfiguration() {
        return sqlApplicationConfiguration;
    }

    /**
     * ApplicationSqlApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSqlApplicationConfiguration(Property<ApplicationSqlApplicationConfiguration> sqlApplicationConfiguration) {
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
    }

    public ApplicationApplicationConfiguration withSqlApplicationConfiguration(Property<ApplicationSqlApplicationConfiguration> sqlApplicationConfiguration) {
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
        return this;
    }

    /**
     * ApplicationApplicationSnapshotConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationApplicationSnapshotConfiguration> getApplicationSnapshotConfiguration() {
        return applicationSnapshotConfiguration;
    }

    /**
     * ApplicationApplicationSnapshotConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html
     * 
     */
    @JsonIgnore
    public void setApplicationSnapshotConfiguration(Property<ApplicationApplicationSnapshotConfiguration> applicationSnapshotConfiguration) {
        this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
    }

    public ApplicationApplicationConfiguration withApplicationSnapshotConfiguration(Property<ApplicationApplicationSnapshotConfiguration> applicationSnapshotConfiguration) {
        this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationCodeConfiguration", applicationCodeConfiguration).append("environmentProperties", environmentProperties).append("flinkApplicationConfiguration", flinkApplicationConfiguration).append("sqlApplicationConfiguration", sqlApplicationConfiguration).append("applicationSnapshotConfiguration", applicationSnapshotConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sqlApplicationConfiguration).append(applicationCodeConfiguration).append(environmentProperties).append(flinkApplicationConfiguration).append(applicationSnapshotConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationApplicationConfiguration) == false) {
            return false;
        }
        ApplicationApplicationConfiguration rhs = ((ApplicationApplicationConfiguration) other);
        return new EqualsBuilder().append(sqlApplicationConfiguration, rhs.sqlApplicationConfiguration).append(applicationCodeConfiguration, rhs.applicationCodeConfiguration).append(environmentProperties, rhs.environmentProperties).append(flinkApplicationConfiguration, rhs.flinkApplicationConfiguration).append(applicationSnapshotConfiguration, rhs.applicationSnapshotConfiguration).isEquals();
    }

}
