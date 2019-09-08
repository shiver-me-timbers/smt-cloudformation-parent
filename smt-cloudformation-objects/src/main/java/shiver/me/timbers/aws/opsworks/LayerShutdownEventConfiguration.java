
package shiver.me.timbers.aws.opsworks;

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
 * LayerShutdownEventConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DelayUntilElbConnectionsDrained",
    "ExecutionTimeout"
})
public class LayerShutdownEventConfiguration implements Property<LayerShutdownEventConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained
     * 
     */
    @JsonProperty("DelayUntilElbConnectionsDrained")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained")
    private CharSequence delayUntilElbConnectionsDrained;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout
     * 
     */
    @JsonProperty("ExecutionTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout")
    private Number executionTimeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained
     * 
     */
    @JsonIgnore
    public CharSequence getDelayUntilElbConnectionsDrained() {
        return delayUntilElbConnectionsDrained;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained
     * 
     */
    @JsonIgnore
    public void setDelayUntilElbConnectionsDrained(CharSequence delayUntilElbConnectionsDrained) {
        this.delayUntilElbConnectionsDrained = delayUntilElbConnectionsDrained;
    }

    public LayerShutdownEventConfiguration withDelayUntilElbConnectionsDrained(CharSequence delayUntilElbConnectionsDrained) {
        this.delayUntilElbConnectionsDrained = delayUntilElbConnectionsDrained;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout
     * 
     */
    @JsonIgnore
    public Number getExecutionTimeout() {
        return executionTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout
     * 
     */
    @JsonIgnore
    public void setExecutionTimeout(Number executionTimeout) {
        this.executionTimeout = executionTimeout;
    }

    public LayerShutdownEventConfiguration withExecutionTimeout(Number executionTimeout) {
        this.executionTimeout = executionTimeout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("delayUntilElbConnectionsDrained", delayUntilElbConnectionsDrained).append("executionTimeout", executionTimeout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(executionTimeout).append(delayUntilElbConnectionsDrained).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LayerShutdownEventConfiguration) == false) {
            return false;
        }
        LayerShutdownEventConfiguration rhs = ((LayerShutdownEventConfiguration) other);
        return new EqualsBuilder().append(executionTimeout, rhs.executionTimeout).append(delayUntilElbConnectionsDrained, rhs.delayUntilElbConnectionsDrained).isEquals();
    }

}
