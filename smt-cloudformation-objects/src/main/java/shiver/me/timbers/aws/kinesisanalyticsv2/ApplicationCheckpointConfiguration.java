
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
 * ApplicationCheckpointConfiguration
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
public class ApplicationCheckpointConfiguration implements Property<ApplicationCheckpointConfiguration>
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
    private Number checkpointInterval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints
     * 
     */
    @JsonProperty("MinPauseBetweenCheckpoints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints")
    private Number minPauseBetweenCheckpoints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled
     * 
     */
    @JsonProperty("CheckpointingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled")
    private CharSequence checkpointingEnabled;

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

    public ApplicationCheckpointConfiguration withConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval
     * 
     */
    @JsonIgnore
    public Number getCheckpointInterval() {
        return checkpointInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval
     * 
     */
    @JsonIgnore
    public void setCheckpointInterval(Number checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
    }

    public ApplicationCheckpointConfiguration withCheckpointInterval(Number checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints
     * 
     */
    @JsonIgnore
    public Number getMinPauseBetweenCheckpoints() {
        return minPauseBetweenCheckpoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints
     * 
     */
    @JsonIgnore
    public void setMinPauseBetweenCheckpoints(Number minPauseBetweenCheckpoints) {
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
    }

    public ApplicationCheckpointConfiguration withMinPauseBetweenCheckpoints(Number minPauseBetweenCheckpoints) {
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getCheckpointingEnabled() {
        return checkpointingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled
     * 
     */
    @JsonIgnore
    public void setCheckpointingEnabled(CharSequence checkpointingEnabled) {
        this.checkpointingEnabled = checkpointingEnabled;
    }

    public ApplicationCheckpointConfiguration withCheckpointingEnabled(CharSequence checkpointingEnabled) {
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
        if ((other instanceof ApplicationCheckpointConfiguration) == false) {
            return false;
        }
        ApplicationCheckpointConfiguration rhs = ((ApplicationCheckpointConfiguration) other);
        return new EqualsBuilder().append(minPauseBetweenCheckpoints, rhs.minPauseBetweenCheckpoints).append(configurationType, rhs.configurationType).append(checkpointInterval, rhs.checkpointInterval).append(checkpointingEnabled, rhs.checkpointingEnabled).isEquals();
    }

}
