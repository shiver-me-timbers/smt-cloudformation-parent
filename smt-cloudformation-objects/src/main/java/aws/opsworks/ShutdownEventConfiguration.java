
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ShutdownEventConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DelayUntilElbConnectionsDrained",
    "ExecutionTimeout"
})
public class ShutdownEventConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained
     * 
     */
    @JsonProperty("DelayUntilElbConnectionsDrained")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained")
    private Boolean delayUntilElbConnectionsDrained;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout
     * 
     */
    @JsonProperty("ExecutionTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout")
    private Integer executionTimeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained
     * 
     */
    public Boolean getDelayUntilElbConnectionsDrained() {
        return delayUntilElbConnectionsDrained;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained
     * 
     */
    public void setDelayUntilElbConnectionsDrained(Boolean delayUntilElbConnectionsDrained) {
        this.delayUntilElbConnectionsDrained = delayUntilElbConnectionsDrained;
    }

    public ShutdownEventConfiguration withDelayUntilElbConnectionsDrained(Boolean delayUntilElbConnectionsDrained) {
        this.delayUntilElbConnectionsDrained = delayUntilElbConnectionsDrained;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout
     * 
     */
    public Integer getExecutionTimeout() {
        return executionTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout
     * 
     */
    public void setExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
    }

    public ShutdownEventConfiguration withExecutionTimeout(Integer executionTimeout) {
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
        if ((other instanceof ShutdownEventConfiguration) == false) {
            return false;
        }
        ShutdownEventConfiguration rhs = ((ShutdownEventConfiguration) other);
        return new EqualsBuilder().append(executionTimeout, rhs.executionTimeout).append(delayUntilElbConnectionsDrained, rhs.delayUntilElbConnectionsDrained).isEquals();
    }

}
