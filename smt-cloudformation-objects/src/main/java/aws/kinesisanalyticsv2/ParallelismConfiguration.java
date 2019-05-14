
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
 * ParallelismConfiguration
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
public class ParallelismConfiguration implements Property<ParallelismConfiguration>
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
    private Integer parallelismPerKPU;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled
     * 
     */
    @JsonProperty("AutoScalingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled")
    private Boolean autoScalingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism
     * 
     */
    @JsonProperty("Parallelism")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism")
    private Integer parallelism;

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

    public ParallelismConfiguration withConfigurationType(CharSequence configurationType) {
        this.configurationType = configurationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu
     * 
     */
    @JsonIgnore
    public Integer getParallelismPerKPU() {
        return parallelismPerKPU;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu
     * 
     */
    @JsonIgnore
    public void setParallelismPerKPU(Integer parallelismPerKPU) {
        this.parallelismPerKPU = parallelismPerKPU;
    }

    public ParallelismConfiguration withParallelismPerKPU(Integer parallelismPerKPU) {
        this.parallelismPerKPU = parallelismPerKPU;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled
     * 
     */
    @JsonIgnore
    public Boolean getAutoScalingEnabled() {
        return autoScalingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled
     * 
     */
    @JsonIgnore
    public void setAutoScalingEnabled(Boolean autoScalingEnabled) {
        this.autoScalingEnabled = autoScalingEnabled;
    }

    public ParallelismConfiguration withAutoScalingEnabled(Boolean autoScalingEnabled) {
        this.autoScalingEnabled = autoScalingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism
     * 
     */
    @JsonIgnore
    public Integer getParallelism() {
        return parallelism;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism
     * 
     */
    @JsonIgnore
    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    public ParallelismConfiguration withParallelism(Integer parallelism) {
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
        if ((other instanceof ParallelismConfiguration) == false) {
            return false;
        }
        ParallelismConfiguration rhs = ((ParallelismConfiguration) other);
        return new EqualsBuilder().append(autoScalingEnabled, rhs.autoScalingEnabled).append(configurationType, rhs.configurationType).append(parallelismPerKPU, rhs.parallelismPerKPU).append(parallelism, rhs.parallelism).isEquals();
    }

}
