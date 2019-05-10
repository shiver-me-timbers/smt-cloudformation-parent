
package aws.kinesisanalyticsv2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FlinkApplicationConfiguration
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
public class FlinkApplicationConfiguration {

    /**
     * CheckpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html
     * 
     */
    @JsonProperty("CheckpointConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html")
    private CheckpointConfiguration checkpointConfiguration;
    /**
     * ParallelismConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html
     * 
     */
    @JsonProperty("ParallelismConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html")
    private ParallelismConfiguration parallelismConfiguration;
    /**
     * MonitoringConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html
     * 
     */
    @JsonProperty("MonitoringConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html")
    private MonitoringConfiguration monitoringConfiguration;

    /**
     * CheckpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html
     * 
     */
    @JsonIgnore
    public CheckpointConfiguration getCheckpointConfiguration() {
        return checkpointConfiguration;
    }

    /**
     * CheckpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html
     * 
     */
    @JsonIgnore
    public void setCheckpointConfiguration(CheckpointConfiguration checkpointConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
    }

    public FlinkApplicationConfiguration withCheckpointConfiguration(CheckpointConfiguration checkpointConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
        return this;
    }

    /**
     * ParallelismConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html
     * 
     */
    @JsonIgnore
    public ParallelismConfiguration getParallelismConfiguration() {
        return parallelismConfiguration;
    }

    /**
     * ParallelismConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html
     * 
     */
    @JsonIgnore
    public void setParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        this.parallelismConfiguration = parallelismConfiguration;
    }

    public FlinkApplicationConfiguration withParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        this.parallelismConfiguration = parallelismConfiguration;
        return this;
    }

    /**
     * MonitoringConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html
     * 
     */
    @JsonIgnore
    public MonitoringConfiguration getMonitoringConfiguration() {
        return monitoringConfiguration;
    }

    /**
     * MonitoringConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html
     * 
     */
    @JsonIgnore
    public void setMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
    }

    public FlinkApplicationConfiguration withMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
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
        if ((other instanceof FlinkApplicationConfiguration) == false) {
            return false;
        }
        FlinkApplicationConfiguration rhs = ((FlinkApplicationConfiguration) other);
        return new EqualsBuilder().append(checkpointConfiguration, rhs.checkpointConfiguration).append(parallelismConfiguration, rhs.parallelismConfiguration).append(monitoringConfiguration, rhs.monitoringConfiguration).isEquals();
    }

}
