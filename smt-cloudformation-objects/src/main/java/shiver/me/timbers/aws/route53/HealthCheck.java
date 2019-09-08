
package shiver.me.timbers.aws.route53;

import java.util.ArrayList;
import java.util.List;
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
 * HealthCheck
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HealthCheckConfig",
    "HealthCheckTags"
})
public class HealthCheck {

    /**
     * HealthCheckHealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
     * 
     */
    @JsonProperty("HealthCheckConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html")
    private Property<HealthCheckHealthCheckConfig> healthCheckConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags
     * 
     */
    @JsonProperty("HealthCheckTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags")
    private List<Property<HealthCheckHealthCheckTag>> healthCheckTags = new ArrayList<Property<HealthCheckHealthCheckTag>>();

    /**
     * HealthCheckHealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
     * 
     */
    @JsonIgnore
    public Property<HealthCheckHealthCheckConfig> getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * HealthCheckHealthCheckConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
     * 
     */
    @JsonIgnore
    public void setHealthCheckConfig(Property<HealthCheckHealthCheckConfig> healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public HealthCheck withHealthCheckConfig(Property<HealthCheckHealthCheckConfig> healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags
     * 
     */
    @JsonIgnore
    public List<Property<HealthCheckHealthCheckTag>> getHealthCheckTags() {
        return healthCheckTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags
     * 
     */
    @JsonIgnore
    public void setHealthCheckTags(List<Property<HealthCheckHealthCheckTag>> healthCheckTags) {
        this.healthCheckTags = healthCheckTags;
    }

    public HealthCheck withHealthCheckTags(List<Property<HealthCheckHealthCheckTag>> healthCheckTags) {
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
