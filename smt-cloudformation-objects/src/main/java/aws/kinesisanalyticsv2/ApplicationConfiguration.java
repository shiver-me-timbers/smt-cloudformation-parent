
package aws.kinesisanalyticsv2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationConfiguration
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
public class ApplicationConfiguration implements Property<ApplicationConfiguration>
{

    /**
     * ApplicationCodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html
     * 
     */
    @JsonProperty("ApplicationCodeConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html")
    private Property<ApplicationCodeConfiguration> applicationCodeConfiguration;
    /**
     * EnvironmentProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html
     * 
     */
    @JsonProperty("EnvironmentProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html")
    private Property<EnvironmentProperties> environmentProperties;
    /**
     * FlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonProperty("FlinkApplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html")
    private Property<FlinkApplicationConfiguration> flinkApplicationConfiguration;
    /**
     * SqlApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html
     * 
     */
    @JsonProperty("SqlApplicationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html")
    private Property<SqlApplicationConfiguration> sqlApplicationConfiguration;
    /**
     * ApplicationSnapshotConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html
     * 
     */
    @JsonProperty("ApplicationSnapshotConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html")
    private Property<ApplicationSnapshotConfiguration> applicationSnapshotConfiguration;

    /**
     * ApplicationCodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationCodeConfiguration> getApplicationCodeConfiguration() {
        return applicationCodeConfiguration;
    }

    /**
     * ApplicationCodeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html
     * 
     */
    @JsonIgnore
    public void setApplicationCodeConfiguration(Property<ApplicationCodeConfiguration> applicationCodeConfiguration) {
        this.applicationCodeConfiguration = applicationCodeConfiguration;
    }

    public ApplicationConfiguration withApplicationCodeConfiguration(Property<ApplicationCodeConfiguration> applicationCodeConfiguration) {
        this.applicationCodeConfiguration = applicationCodeConfiguration;
        return this;
    }

    /**
     * EnvironmentProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html
     * 
     */
    @JsonIgnore
    public Property<EnvironmentProperties> getEnvironmentProperties() {
        return environmentProperties;
    }

    /**
     * EnvironmentProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html
     * 
     */
    @JsonIgnore
    public void setEnvironmentProperties(Property<EnvironmentProperties> environmentProperties) {
        this.environmentProperties = environmentProperties;
    }

    public ApplicationConfiguration withEnvironmentProperties(Property<EnvironmentProperties> environmentProperties) {
        this.environmentProperties = environmentProperties;
        return this;
    }

    /**
     * FlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<FlinkApplicationConfiguration> getFlinkApplicationConfiguration() {
        return flinkApplicationConfiguration;
    }

    /**
     * FlinkApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setFlinkApplicationConfiguration(Property<FlinkApplicationConfiguration> flinkApplicationConfiguration) {
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
    }

    public ApplicationConfiguration withFlinkApplicationConfiguration(Property<FlinkApplicationConfiguration> flinkApplicationConfiguration) {
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
        return this;
    }

    /**
     * SqlApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<SqlApplicationConfiguration> getSqlApplicationConfiguration() {
        return sqlApplicationConfiguration;
    }

    /**
     * SqlApplicationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSqlApplicationConfiguration(Property<SqlApplicationConfiguration> sqlApplicationConfiguration) {
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
    }

    public ApplicationConfiguration withSqlApplicationConfiguration(Property<SqlApplicationConfiguration> sqlApplicationConfiguration) {
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
        return this;
    }

    /**
     * ApplicationSnapshotConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationSnapshotConfiguration> getApplicationSnapshotConfiguration() {
        return applicationSnapshotConfiguration;
    }

    /**
     * ApplicationSnapshotConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html
     * 
     */
    @JsonIgnore
    public void setApplicationSnapshotConfiguration(Property<ApplicationSnapshotConfiguration> applicationSnapshotConfiguration) {
        this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
    }

    public ApplicationConfiguration withApplicationSnapshotConfiguration(Property<ApplicationSnapshotConfiguration> applicationSnapshotConfiguration) {
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
        if ((other instanceof ApplicationConfiguration) == false) {
            return false;
        }
        ApplicationConfiguration rhs = ((ApplicationConfiguration) other);
        return new EqualsBuilder().append(sqlApplicationConfiguration, rhs.sqlApplicationConfiguration).append(applicationCodeConfiguration, rhs.applicationCodeConfiguration).append(environmentProperties, rhs.environmentProperties).append(flinkApplicationConfiguration, rhs.flinkApplicationConfiguration).append(applicationSnapshotConfiguration, rhs.applicationSnapshotConfiguration).isEquals();
    }

}