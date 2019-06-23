
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
 * ApplicationMonitoringConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConfigurationType",
    "MetricsLevel",
    "LogLevel"
})
public class ApplicationMonitoringConfiguration implements Property<ApplicationMonitoringConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype
     * 
     */
    @JsonProperty("ConfigurationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype")
    private CharSequence configurationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel
     * 
     */
    @JsonProperty("MetricsLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel")
    private CharSequence metricsLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel
     * 
     */
    @JsonProperty("LogLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel")
    private CharSequence logLevel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationType() {
        return configurationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype
     * 
     */
    @JsonIgnore
    public void setConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
    }

    public ApplicationMonitoringConfiguration withConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel
     * 
     */
    @JsonIgnore
    public CharSequence getMetricsLevel() {
        return metricsLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel
     * 
     */
    @JsonIgnore
    public void setMetricsLevel(CharSequence metricsLevel) {
        this.metricsLevel = metricsLevel;
    }

    public ApplicationMonitoringConfiguration withMetricsLevel(CharSequence metricsLevel) {
        this.metricsLevel = metricsLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel
     * 
     */
    @JsonIgnore
    public CharSequence getLogLevel() {
        return logLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel
     * 
     */
    @JsonIgnore
    public void setLogLevel(CharSequence logLevel) {
        this.logLevel = logLevel;
    }

    public ApplicationMonitoringConfiguration withLogLevel(CharSequence logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configurationType", configurationType).append("metricsLevel", metricsLevel).append("logLevel", logLevel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(configurationType).append(logLevel).append(metricsLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationMonitoringConfiguration) == false) {
            return false;
        }
        ApplicationMonitoringConfiguration rhs = ((ApplicationMonitoringConfiguration) other);
        return new EqualsBuilder().append(configurationType, rhs.configurationType).append(logLevel, rhs.logLevel).append(metricsLevel, rhs.metricsLevel).isEquals();
    }

}
