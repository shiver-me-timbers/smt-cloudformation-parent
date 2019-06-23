
package aws.opsworks;

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
 * LayerLifecycleEventConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ShutdownEventConfiguration"
})
public class LayerLifecycleEventConfiguration implements Property<LayerLifecycleEventConfiguration>
{

    /**
     * LayerShutdownEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
     * 
     */
    @JsonProperty("ShutdownEventConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html")
    private Property<LayerShutdownEventConfiguration> shutdownEventConfiguration;

    /**
     * LayerShutdownEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<LayerShutdownEventConfiguration> getShutdownEventConfiguration() {
        return shutdownEventConfiguration;
    }

    /**
     * LayerShutdownEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
     * 
     */
    @JsonIgnore
    public void setShutdownEventConfiguration(Property<LayerShutdownEventConfiguration> shutdownEventConfiguration) {
        this.shutdownEventConfiguration = shutdownEventConfiguration;
    }

    public LayerLifecycleEventConfiguration withShutdownEventConfiguration(Property<LayerShutdownEventConfiguration> shutdownEventConfiguration) {
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
        if ((other instanceof LayerLifecycleEventConfiguration) == false) {
            return false;
        }
        LayerLifecycleEventConfiguration rhs = ((LayerLifecycleEventConfiguration) other);
        return new EqualsBuilder().append(shutdownEventConfiguration, rhs.shutdownEventConfiguration).isEquals();
    }

}
