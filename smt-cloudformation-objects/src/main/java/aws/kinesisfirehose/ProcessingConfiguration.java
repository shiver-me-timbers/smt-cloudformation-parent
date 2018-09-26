
package aws.kinesisfirehose;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ProcessingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled",
    "Processors"
})
public class ProcessingConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors
     * 
     */
    @JsonProperty("Processors")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors")
    private Set<Processor> processors = new LinkedHashSet<Processor>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ProcessingConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors
     * 
     */
    public Set<Processor> getProcessors() {
        return processors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors
     * 
     */
    public void setProcessors(Set<Processor> processors) {
        this.processors = processors;
    }

    public ProcessingConfiguration withProcessors(Set<Processor> processors) {
        this.processors = processors;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("processors", processors).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enabled).append(processors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessingConfiguration) == false) {
            return false;
        }
        ProcessingConfiguration rhs = ((ProcessingConfiguration) other);
        return new EqualsBuilder().append(enabled, rhs.enabled).append(processors, rhs.processors).isEquals();
    }

}
