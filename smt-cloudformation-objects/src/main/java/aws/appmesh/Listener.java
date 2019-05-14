
package aws.appmesh;

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
 * Listener
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HealthCheck",
    "PortMapping"
})
public class Listener implements Property<Listener>
{

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html
     * 
     */
    @JsonProperty("HealthCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html")
    private Property<HealthCheck> healthCheck;
    /**
     * PortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonProperty("PortMapping")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html")
    private Property<PortMapping> portMapping;

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html
     * 
     */
    @JsonIgnore
    public Property<HealthCheck> getHealthCheck() {
        return healthCheck;
    }

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html
     * 
     */
    @JsonIgnore
    public void setHealthCheck(Property<HealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
    }

    public Listener withHealthCheck(Property<HealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * PortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonIgnore
    public Property<PortMapping> getPortMapping() {
        return portMapping;
    }

    /**
     * PortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonIgnore
    public void setPortMapping(Property<PortMapping> portMapping) {
        this.portMapping = portMapping;
    }

    public Listener withPortMapping(Property<PortMapping> portMapping) {
        this.portMapping = portMapping;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("healthCheck", healthCheck).append("portMapping", portMapping).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(portMapping).append(healthCheck).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Listener) == false) {
            return false;
        }
        Listener rhs = ((Listener) other);
        return new EqualsBuilder().append(portMapping, rhs.portMapping).append(healthCheck, rhs.healthCheck).isEquals();
    }

}
