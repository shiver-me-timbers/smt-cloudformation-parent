
package aws.appmesh;

import java.util.ArrayList;
import java.util.List;
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
 * VirtualNodeSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Logging",
    "Backends",
    "Listeners",
    "ServiceDiscovery"
})
public class VirtualNodeSpec implements Property<VirtualNodeSpec>
{

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
     * 
     */
    @JsonProperty("Logging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html")
    private Property<Logging> logging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends
     * 
     */
    @JsonProperty("Backends")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends")
    private List<Property<Backend>> backends = new ArrayList<Property<Backend>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners
     * 
     */
    @JsonProperty("Listeners")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners")
    private List<Property<Listener>> listeners = new ArrayList<Property<Listener>>();
    /**
     * ServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
     * 
     */
    @JsonProperty("ServiceDiscovery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html")
    private Property<ServiceDiscovery> serviceDiscovery;

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
     * 
     */
    @JsonIgnore
    public Property<Logging> getLogging() {
        return logging;
    }

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
     * 
     */
    @JsonIgnore
    public void setLogging(Property<Logging> logging) {
        this.logging = logging;
    }

    public VirtualNodeSpec withLogging(Property<Logging> logging) {
        this.logging = logging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends
     * 
     */
    @JsonIgnore
    public List<Property<Backend>> getBackends() {
        return backends;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends
     * 
     */
    @JsonIgnore
    public void setBackends(List<Property<Backend>> backends) {
        this.backends = backends;
    }

    public VirtualNodeSpec withBackends(List<Property<Backend>> backends) {
        this.backends = backends;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners
     * 
     */
    @JsonIgnore
    public List<Property<Listener>> getListeners() {
        return listeners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners
     * 
     */
    @JsonIgnore
    public void setListeners(List<Property<Listener>> listeners) {
        this.listeners = listeners;
    }

    public VirtualNodeSpec withListeners(List<Property<Listener>> listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     * ServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
     * 
     */
    @JsonIgnore
    public Property<ServiceDiscovery> getServiceDiscovery() {
        return serviceDiscovery;
    }

    /**
     * ServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
     * 
     */
    @JsonIgnore
    public void setServiceDiscovery(Property<ServiceDiscovery> serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

    public VirtualNodeSpec withServiceDiscovery(Property<ServiceDiscovery> serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logging", logging).append("backends", backends).append("listeners", listeners).append("serviceDiscovery", serviceDiscovery).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logging).append(serviceDiscovery).append(listeners).append(backends).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeSpec) == false) {
            return false;
        }
        VirtualNodeSpec rhs = ((VirtualNodeSpec) other);
        return new EqualsBuilder().append(logging, rhs.logging).append(serviceDiscovery, rhs.serviceDiscovery).append(listeners, rhs.listeners).append(backends, rhs.backends).isEquals();
    }

}
