
package aws.route53;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HealthCheck
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HealthCheckConfig",
    "HealthCheckTags"
})
public class HealthCheck {

    /**
     * HealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
     * 
     */
    @JsonProperty("HealthCheckConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html")
    private HealthCheckConfig healthCheckConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags
     * 
     */
    @JsonProperty("HealthCheckTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags")
    private List<HealthCheckTag> healthCheckTags = new ArrayList<HealthCheckTag>();

    /**
     * HealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
     * 
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * HealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
     * 
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public HealthCheck withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags
     * 
     */
    public List<HealthCheckTag> getHealthCheckTags() {
        return healthCheckTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags
     * 
     */
    public void setHealthCheckTags(List<HealthCheckTag> healthCheckTags) {
        this.healthCheckTags = healthCheckTags;
    }

    public HealthCheck withHealthCheckTags(List<HealthCheckTag> healthCheckTags) {
        this.healthCheckTags = healthCheckTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("healthCheckConfig", healthCheckConfig).append("healthCheckTags", healthCheckTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckTags).append(healthCheckConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealthCheck) == false) {
            return false;
        }
        HealthCheck rhs = ((HealthCheck) other);
        return new EqualsBuilder().append(healthCheckTags, rhs.healthCheckTags).append(healthCheckConfig, rhs.healthCheckConfig).isEquals();
    }

}
