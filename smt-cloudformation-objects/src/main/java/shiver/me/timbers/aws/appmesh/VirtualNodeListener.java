
package shiver.me.timbers.aws.appmesh;

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
 * VirtualNodeListener
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HealthCheck",
    "TLS",
    "PortMapping"
})
public class VirtualNodeListener implements Property<VirtualNodeListener>
{

    /**
     * VirtualNodeHealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html
     * 
     */
    @JsonProperty("HealthCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html")
    private Property<VirtualNodeHealthCheck> healthCheck;
    /**
     * VirtualNodeListenerTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html
     * 
     */
    @JsonProperty("TLS")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html")
    private Property<VirtualNodeListenerTls> tLS;
    /**
     * VirtualNodePortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html
     * 
     */
    @JsonProperty("PortMapping")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html")
    private Property<VirtualNodePortMapping> portMapping;

    /**
     * VirtualNodeHealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeHealthCheck> getHealthCheck() {
        return healthCheck;
    }

    /**
     * VirtualNodeHealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html
     * 
     */
    @JsonIgnore
    public void setHealthCheck(Property<VirtualNodeHealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
    }

    public VirtualNodeListener withHealthCheck(Property<VirtualNodeHealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * VirtualNodeListenerTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeListenerTls> getTLS() {
        return tLS;
    }

    /**
     * VirtualNodeListenerTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html
     * 
     */
    @JsonIgnore
    public void setTLS(Property<VirtualNodeListenerTls> tLS) {
        this.tLS = tLS;
    }

    public VirtualNodeListener withTLS(Property<VirtualNodeListenerTls> tLS) {
        this.tLS = tLS;
        return this;
    }

    /**
     * VirtualNodePortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodePortMapping> getPortMapping() {
        return portMapping;
    }

    /**
     * VirtualNodePortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html
     * 
     */
    @JsonIgnore
    public void setPortMapping(Property<VirtualNodePortMapping> portMapping) {
        this.portMapping = portMapping;
    }

    public VirtualNodeListener withPortMapping(Property<VirtualNodePortMapping> portMapping) {
        this.portMapping = portMapping;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("healthCheck", healthCheck).append("tLS", tLS).append("portMapping", portMapping).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(portMapping).append(tLS).append(healthCheck).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeListener) == false) {
            return false;
        }
        VirtualNodeListener rhs = ((VirtualNodeListener) other);
        return new EqualsBuilder().append(portMapping, rhs.portMapping).append(tLS, rhs.tLS).append(healthCheck, rhs.healthCheck).isEquals();
    }

}
