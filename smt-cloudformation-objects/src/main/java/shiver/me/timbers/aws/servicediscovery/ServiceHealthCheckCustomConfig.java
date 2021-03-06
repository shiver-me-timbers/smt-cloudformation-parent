
package shiver.me.timbers.aws.servicediscovery;

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
 * ServiceHealthCheckCustomConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FailureThreshold"
})
public class ServiceHealthCheckCustomConfig implements Property<ServiceHealthCheckCustomConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold
     * 
     */
    @JsonProperty("FailureThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold")
    private Number failureThreshold;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold
     * 
     */
    @JsonIgnore
    public Number getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold
     * 
     */
    @JsonIgnore
    public void setFailureThreshold(Number failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public ServiceHealthCheckCustomConfig withFailureThreshold(Number failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("failureThreshold", failureThreshold).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(failureThreshold).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceHealthCheckCustomConfig) == false) {
            return false;
        }
        ServiceHealthCheckCustomConfig rhs = ((ServiceHealthCheckCustomConfig) other);
        return new EqualsBuilder().append(failureThreshold, rhs.failureThreshold).isEquals();
    }

}
