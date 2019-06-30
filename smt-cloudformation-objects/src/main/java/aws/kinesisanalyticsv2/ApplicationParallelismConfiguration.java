
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
 * ApplicationParallelismConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConfigurationType",
    "ParallelismPerKPU",
    "AutoScalingEnabled",
    "Parallelism"
})
public class ApplicationParallelismConfiguration implements Property<ApplicationParallelismConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype
     * 
     */
    @JsonProperty("ConfigurationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype")
    private CharSequence configurationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu
     * 
     */
    @JsonProperty("ParallelismPerKPU")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu")
    private Number parallelismPerKPU;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled
     * 
     */
    @JsonProperty("AutoScalingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled")
    private CharSequence autoScalingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism
     * 
     */
    @JsonProperty("Parallelism")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism")
    private Number parallelism;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationType() {
        return configurationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype
     * 
     */
    @JsonIgnore
    public void setConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
    }

    public ApplicationParallelismConfiguration withConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu
     * 
     */
    @JsonIgnore
    public Number getParallelismPerKPU() {
        return parallelismPerKPU;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu
     * 
     */
    @JsonIgnore
    public void setParallelismPerKPU(Number parallelismPerKPU) {
        this.parallelismPerKPU = parallelismPerKPU;
    }

    public ApplicationParallelismConfiguration withParallelismPerKPU(Number parallelismPerKPU) {
        this.parallelismPerKPU = parallelismPerKPU;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getAutoScalingEnabled() {
        return autoScalingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled
     * 
     */
    @JsonIgnore
    public void setAutoScalingEnabled(CharSequence autoScalingEnabled) {
        this.autoScalingEnabled = autoScalingEnabled;
    }

    public ApplicationParallelismConfiguration withAutoScalingEnabled(CharSequence autoScalingEnabled) {
        this.autoScalingEnabled = autoScalingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism
     * 
     */
    @JsonIgnore
    public Number getParallelism() {
        return parallelism;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism
     * 
     */
    @JsonIgnore
    public void setParallelism(Number parallelism) {
        this.parallelism = parallelism;
    }

    public ApplicationParallelismConfiguration withParallelism(Number parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configurationType", configurationType).append("parallelismPerKPU", parallelismPerKPU).append("autoScalingEnabled", autoScalingEnabled).append("parallelism", parallelism).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(autoScalingEnabled).append(configurationType).append(parallelismPerKPU).append(parallelism).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationParallelismConfiguration) == false) {
            return false;
        }
        ApplicationParallelismConfiguration rhs = ((ApplicationParallelismConfiguration) other);
        return new EqualsBuilder().append(autoScalingEnabled, rhs.autoScalingEnabled).append(configurationType, rhs.configurationType).append(parallelismPerKPU, rhs.parallelismPerKPU).append(parallelism, rhs.parallelism).isEquals();
    }

}
