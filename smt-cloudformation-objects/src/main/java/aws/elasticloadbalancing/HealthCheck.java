
package aws.elasticloadbalancing;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HealthyThreshold",
    "Interval",
    "Target",
    "Timeout",
    "UnhealthyThreshold"
})
public class HealthCheck {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold
     * 
     */
    @JsonProperty("HealthyThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold")
    private String healthyThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval
     * 
     */
    @JsonProperty("Interval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval")
    private String interval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target
     * 
     */
    @JsonProperty("Target")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target")
    private String target;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout")
    private String timeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold
     * 
     */
    @JsonProperty("UnhealthyThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold")
    private String unhealthyThreshold;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold
     * 
     */
    @JsonProperty("HealthyThreshold")
    public String getHealthyThreshold() {
        return healthyThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold
     * 
     */
    @JsonProperty("HealthyThreshold")
    public void setHealthyThreshold(String healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    public HealthCheck withHealthyThreshold(String healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval
     * 
     */
    @JsonProperty("Interval")
    public String getInterval() {
        return interval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval
     * 
     */
    @JsonProperty("Interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public HealthCheck withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target
     * 
     */
    @JsonProperty("Target")
    public String getTarget() {
        return target;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target
     * 
     */
    @JsonProperty("Target")
    public void setTarget(String target) {
        this.target = target;
    }

    public HealthCheck withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout
     * 
     */
    @JsonProperty("Timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout
     * 
     */
    @JsonProperty("Timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public HealthCheck withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold
     * 
     */
    @JsonProperty("UnhealthyThreshold")
    public String getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold
     * 
     */
    @JsonProperty("UnhealthyThreshold")
    public void setUnhealthyThreshold(String unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public HealthCheck withUnhealthyThreshold(String unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("healthyThreshold", healthyThreshold).append("interval", interval).append("target", target).append("timeout", timeout).append("unhealthyThreshold", unhealthyThreshold).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unhealthyThreshold).append(interval).append(healthyThreshold).append(timeout).append(target).toHashCode();
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
        return new EqualsBuilder().append(unhealthyThreshold, rhs.unhealthyThreshold).append(interval, rhs.interval).append(healthyThreshold, rhs.healthyThreshold).append(timeout, rhs.timeout).append(target, rhs.target).isEquals();
    }

}
