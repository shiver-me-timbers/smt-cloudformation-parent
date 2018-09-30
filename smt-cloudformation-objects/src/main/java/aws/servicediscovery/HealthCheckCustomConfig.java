
package aws.servicediscovery;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HealthCheckCustomConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FailureThreshold"
})
public class HealthCheckCustomConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold
     * 
     */
    @JsonProperty("FailureThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold")
    private Double failureThreshold;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold
     * 
     */
    public Double getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold
     * 
     */
    public void setFailureThreshold(Double failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public HealthCheckCustomConfig withFailureThreshold(Double failureThreshold) {
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
        if ((other instanceof HealthCheckCustomConfig) == false) {
            return false;
        }
        HealthCheckCustomConfig rhs = ((HealthCheckCustomConfig) other);
        return new EqualsBuilder().append(failureThreshold, rhs.failureThreshold).isEquals();
    }

}
