
package aws.servicediscovery;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "HealthCheckCustomConfig",
    "DnsConfig",
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
     * HealthCheckCustomConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
     * 
     */
    @JsonProperty("HealthCheckCustomConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html")
    private HealthCheckCustomConfig healthCheckCustomConfig;
    /**
     * DnsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
     * 
     */
    @JsonProperty("DnsConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html")
    private DnsConfig dnsConfig;
    /**
     * HealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
     * 
     */
    @JsonProperty("HealthCheckConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html")
    private HealthCheckConfig healthCheckConfig;
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
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Service withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * HealthCheckCustomConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
     * 
     */
    public HealthCheckCustomConfig getHealthCheckCustomConfig() {
        return healthCheckCustomConfig;
    }

    /**
     * HealthCheckCustomConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
     * 
     */
    public void setHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
    }

    public Service withHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        return this;
    }

    /**
     * DnsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
     * 
     */
    public DnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * DnsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
     * 
     */
    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public Service withDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * HealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
     * 
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * HealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
     * 
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public Service withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Service withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("healthCheckCustomConfig", healthCheckCustomConfig).append("dnsConfig", dnsConfig).append("healthCheckConfig", healthCheckConfig).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckCustomConfig).append(name).append(description).append(dnsConfig).append(healthCheckConfig).toHashCode();
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
        return new EqualsBuilder().append(healthCheckCustomConfig, rhs.healthCheckCustomConfig).append(name, rhs.name).append(description, rhs.description).append(dnsConfig, rhs.dnsConfig).append(healthCheckConfig, rhs.healthCheckConfig).isEquals();
    }

}
