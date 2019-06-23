
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
 * VirtualNodeVirtualNodeSpec
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
public class VirtualNodeVirtualNodeSpec implements Property<VirtualNodeVirtualNodeSpec>
{

    /**
     * VirtualNodeLogging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
     * 
     */
    @JsonProperty("Logging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html")
    private Property<VirtualNodeLogging> logging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends
     * 
     */
    @JsonProperty("Backends")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends")
    private List<Property<VirtualNodeBackend>> backends = new ArrayList<Property<VirtualNodeBackend>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners
     * 
     */
    @JsonProperty("Listeners")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners")
    private List<Property<VirtualNodeListener>> listeners = new ArrayList<Property<VirtualNodeListener>>();
    /**
     * VirtualNodeServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
     * 
     */
    @JsonProperty("ServiceDiscovery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html")
    private Property<VirtualNodeServiceDiscovery> serviceDiscovery;

    /**
     * VirtualNodeLogging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeLogging> getLogging() {
        return logging;
    }

    /**
     * VirtualNodeLogging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html
     * 
     */
    @JsonIgnore
    public void setLogging(Property<VirtualNodeLogging> logging) {
        this.logging = logging;
    }

    public VirtualNodeVirtualNodeSpec withLogging(Property<VirtualNodeLogging> logging) {
        this.logging = logging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends
     * 
     */
    @JsonIgnore
    public List<Property<VirtualNodeBackend>> getBackends() {
        return backends;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends
     * 
     */
    @JsonIgnore
    public void setBackends(List<Property<VirtualNodeBackend>> backends) {
        this.backends = backends;
    }

    public VirtualNodeVirtualNodeSpec withBackends(List<Property<VirtualNodeBackend>> backends) {
        this.backends = backends;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners
     * 
     */
    @JsonIgnore
    public List<Property<VirtualNodeListener>> getListeners() {
        return listeners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners
     * 
     */
    @JsonIgnore
    public void setListeners(List<Property<VirtualNodeListener>> listeners) {
        this.listeners = listeners;
    }

    public VirtualNodeVirtualNodeSpec withListeners(List<Property<VirtualNodeListener>> listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     * VirtualNodeServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeServiceDiscovery> getServiceDiscovery() {
        return serviceDiscovery;
    }

    /**
     * VirtualNodeServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
     * 
     */
    @JsonIgnore
    public void setServiceDiscovery(Property<VirtualNodeServiceDiscovery> serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

    public VirtualNodeVirtualNodeSpec withServiceDiscovery(Property<VirtualNodeServiceDiscovery> serviceDiscovery) {
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
        if ((other instanceof VirtualNodeVirtualNodeSpec) == false) {
            return false;
        }
        VirtualNodeVirtualNodeSpec rhs = ((VirtualNodeVirtualNodeSpec) other);
        return new EqualsBuilder().append(logging, rhs.logging).append(serviceDiscovery, rhs.serviceDiscovery).append(listeners, rhs.listeners).append(backends, rhs.backends).isEquals();
    }

}
