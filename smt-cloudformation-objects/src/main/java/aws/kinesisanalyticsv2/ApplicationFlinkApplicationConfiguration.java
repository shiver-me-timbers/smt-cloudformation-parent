
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
 * ApplicationFlinkApplicationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CheckpointConfiguration",
    "ParallelismConfiguration",
    "MonitoringConfiguration"
})
public class ApplicationFlinkApplicationConfiguration implements Property<ApplicationFlinkApplicationConfiguration>
{

    /**
     * ApplicationCheckpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html
     * 
     */
    @JsonProperty("CheckpointConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html")
    private Property<ApplicationCheckpointConfiguration> checkpointConfiguration;
    /**
     * ApplicationParallelismConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html
     * 
     */
    @JsonProperty("ParallelismConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html")
    private Property<ApplicationParallelismConfiguration> parallelismConfiguration;
    /**
     * ApplicationMonitoringConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html
     * 
     */
    @JsonProperty("MonitoringConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html")
    private Property<ApplicationMonitoringConfiguration> monitoringConfiguration;

    /**
     * ApplicationCheckpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationCheckpointConfiguration> getCheckpointConfiguration() {
        return checkpointConfiguration;
    }

    /**
     * ApplicationCheckpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html
     * 
     */
    @JsonIgnore
    public void setCheckpointConfiguration(Property<ApplicationCheckpointConfiguration> checkpointConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
    }

    public ApplicationFlinkApplicationConfiguration withCheckpointConfiguration(Property<ApplicationCheckpointConfiguration> checkpointConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
        return this;
    }

    /**
     * ApplicationParallelismConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationParallelismConfiguration> getParallelismConfiguration() {
        return parallelismConfiguration;
    }

    /**
     * ApplicationParallelismConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html
     * 
     */
    @JsonIgnore
    public void setParallelismConfiguration(Property<ApplicationParallelismConfiguration> parallelismConfiguration) {
        this.parallelismConfiguration = parallelismConfiguration;
    }

    public ApplicationFlinkApplicationConfiguration withParallelismConfiguration(Property<ApplicationParallelismConfiguration> parallelismConfiguration) {
        this.parallelismConfiguration = parallelismConfiguration;
        return this;
    }

    /**
     * ApplicationMonitoringConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationMonitoringConfiguration> getMonitoringConfiguration() {
        return monitoringConfiguration;
    }

    /**
     * ApplicationMonitoringConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html
     * 
     */
    @JsonIgnore
    public void setMonitoringConfiguration(Property<ApplicationMonitoringConfiguration> monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
    }

    public ApplicationFlinkApplicationConfiguration withMonitoringConfiguration(Property<ApplicationMonitoringConfiguration> monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("checkpointConfiguration", checkpointConfiguration).append("parallelismConfiguration", parallelismConfiguration).append("monitoringConfiguration", monitoringConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(checkpointConfiguration).append(parallelismConfiguration).append(monitoringConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationFlinkApplicationConfiguration) == false) {
            return false;
        }
        ApplicationFlinkApplicationConfiguration rhs = ((ApplicationFlinkApplicationConfiguration) other);
        return new EqualsBuilder().append(checkpointConfiguration, rhs.checkpointConfiguration).append(parallelismConfiguration, rhs.parallelismConfiguration).append(monitoringConfiguration, rhs.monitoringConfiguration).isEquals();
    }

}
