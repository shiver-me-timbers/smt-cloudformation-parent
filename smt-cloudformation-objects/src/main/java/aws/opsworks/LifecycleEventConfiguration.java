
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LifecycleEventConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ShutdownEventConfiguration"
})
public class LifecycleEventConfiguration {

    /**
     * ShutdownEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
     * 
     */
    @JsonProperty("ShutdownEventConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html")
    private ShutdownEventConfiguration shutdownEventConfiguration;

    /**
     * ShutdownEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
     * 
     */
    public ShutdownEventConfiguration getShutdownEventConfiguration() {
        return shutdownEventConfiguration;
    }

    /**
     * ShutdownEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
     * 
     */
    public void setShutdownEventConfiguration(ShutdownEventConfiguration shutdownEventConfiguration) {
        this.shutdownEventConfiguration = shutdownEventConfiguration;
    }

    public LifecycleEventConfiguration withShutdownEventConfiguration(ShutdownEventConfiguration shutdownEventConfiguration) {
        this.shutdownEventConfiguration = shutdownEventConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("shutdownEventConfiguration", shutdownEventConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shutdownEventConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecycleEventConfiguration) == false) {
            return false;
        }
        LifecycleEventConfiguration rhs = ((LifecycleEventConfiguration) other);
        return new EqualsBuilder().append(shutdownEventConfiguration, rhs.shutdownEventConfiguration).isEquals();
    }

}
