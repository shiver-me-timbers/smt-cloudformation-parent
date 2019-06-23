
package aws.servicediscovery;

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
 * Service
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "HealthCheckCustomConfig",
    "DnsConfig",
    "NamespaceId",
    "HealthCheckConfig",
    "Name"
})
public class Service {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description")
    private CharSequence description;
    /**
     * ServiceHealthCheckCustomConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
     * 
     */
    @JsonProperty("HealthCheckCustomConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html")
    private Property<ServiceHealthCheckCustomConfig> healthCheckCustomConfig;
    /**
     * ServiceDnsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
     * 
     */
    @JsonProperty("DnsConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html")
    private Property<ServiceDnsConfig> dnsConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-namespaceid
     * 
     */
    @JsonProperty("NamespaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-namespaceid")
    private CharSequence namespaceId;
    /**
     * ServiceHealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
     * 
     */
    @JsonProperty("HealthCheckConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html")
    private Property<ServiceHealthCheckConfig> healthCheckConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Service withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * ServiceHealthCheckCustomConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
     * 
     */
    @JsonIgnore
    public Property<ServiceHealthCheckCustomConfig> getHealthCheckCustomConfig() {
        return healthCheckCustomConfig;
    }

    /**
     * ServiceHealthCheckCustomConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
     * 
     */
    @JsonIgnore
    public void setHealthCheckCustomConfig(Property<ServiceHealthCheckCustomConfig> healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
    }

    public Service withHealthCheckCustomConfig(Property<ServiceHealthCheckCustomConfig> healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        return this;
    }

    /**
     * ServiceDnsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
     * 
     */
    @JsonIgnore
    public Property<ServiceDnsConfig> getDnsConfig() {
        return dnsConfig;
    }

    /**
     * ServiceDnsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
     * 
     */
    @JsonIgnore
    public void setDnsConfig(Property<ServiceDnsConfig> dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public Service withDnsConfig(Property<ServiceDnsConfig> dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-namespaceid
     * 
     */
    @JsonIgnore
    public CharSequence getNamespaceId() {
        return namespaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-namespaceid
     * 
     */
    @JsonIgnore
    public void setNamespaceId(CharSequence namespaceId) {
        this.namespaceId = namespaceId;
    }

    public Service withNamespaceId(CharSequence namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * ServiceHealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
     * 
     */
    @JsonIgnore
    public Property<ServiceHealthCheckConfig> getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * ServiceHealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
     * 
     */
    @JsonIgnore
    public void setHealthCheckConfig(Property<ServiceHealthCheckConfig> healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public Service withHealthCheckConfig(Property<ServiceHealthCheckConfig> healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Service withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("healthCheckCustomConfig", healthCheckCustomConfig).append("dnsConfig", dnsConfig).append("namespaceId", namespaceId).append("healthCheckConfig", healthCheckConfig).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckCustomConfig).append(namespaceId).append(dnsConfig).append(name).append(description).append(healthCheckConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Service) == false) {
            return false;
        }
        Service rhs = ((Service) other);
        return new EqualsBuilder().append(healthCheckCustomConfig, rhs.healthCheckCustomConfig).append(namespaceId, rhs.namespaceId).append(dnsConfig, rhs.dnsConfig).append(name, rhs.name).append(description, rhs.description).append(healthCheckConfig, rhs.healthCheckConfig).isEquals();
    }

}
