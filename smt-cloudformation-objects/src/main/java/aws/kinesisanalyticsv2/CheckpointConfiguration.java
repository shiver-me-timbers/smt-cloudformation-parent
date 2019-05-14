
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
 * CheckpointConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConfigurationType",
    "CheckpointInterval",
    "MinPauseBetweenCheckpoints",
    "CheckpointingEnabled"
})
public class CheckpointConfiguration implements Property<CheckpointConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype
     * 
     */
    @JsonProperty("ConfigurationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype")
    private CharSequence configurationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval
     * 
     */
    @JsonProperty("CheckpointInterval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval")
    private Integer checkpointInterval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints
     * 
     */
    @JsonProperty("MinPauseBetweenCheckpoints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints")
    private Integer minPauseBetweenCheckpoints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled
     * 
     */
    @JsonProperty("CheckpointingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled")
    private Boolean checkpointingEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationType() {
        return configurationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype
     * 
     */
    @JsonIgnore
    public void setConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
    }

    public CheckpointConfiguration withConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval
     * 
     */
    @JsonIgnore
    public Integer getCheckpointInterval() {
        return checkpointInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval
     * 
     */
    @JsonIgnore
    public void setCheckpointInterval(Integer checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
    }

    public CheckpointConfiguration withCheckpointInterval(Integer checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints
     * 
     */
    @JsonIgnore
    public Integer getMinPauseBetweenCheckpoints() {
        return minPauseBetweenCheckpoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints
     * 
     */
    @JsonIgnore
    public void setMinPauseBetweenCheckpoints(Integer minPauseBetweenCheckpoints) {
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
    }

    public CheckpointConfiguration withMinPauseBetweenCheckpoints(Integer minPauseBetweenCheckpoints) {
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled
     * 
     */
    @JsonIgnore
    public Boolean getCheckpointingEnabled() {
        return checkpointingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled
     * 
     */
    @JsonIgnore
    public void setCheckpointingEnabled(Boolean checkpointingEnabled) {
        this.checkpointingEnabled = checkpointingEnabled;
    }

    public CheckpointConfiguration withCheckpointingEnabled(Boolean checkpointingEnabled) {
        this.checkpointingEnabled = checkpointingEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configurationType", configurationType).append("checkpointInterval", checkpointInterval).append("minPauseBetweenCheckpoints", minPauseBetweenCheckpoints).append("checkpointingEnabled", checkpointingEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minPauseBetweenCheckpoints).append(configurationType).append(checkpointInterval).append(checkpointingEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckpointConfiguration) == false) {
            return false;
        }
        CheckpointConfiguration rhs = ((CheckpointConfiguration) other);
        return new EqualsBuilder().append(minPauseBetweenCheckpoints, rhs.minPauseBetweenCheckpoints).append(configurationType, rhs.configurationType).append(checkpointInterval, rhs.checkpointInterval).append(checkpointingEnabled, rhs.checkpointingEnabled).isEquals();
    }

}
