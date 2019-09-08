
package shiver.me.timbers.aws.elasticloadbalancing;

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
 * LoadBalancerHealthCheck
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HealthyThreshold",
    "Interval",
    "Target",
    "Timeout",
    "UnhealthyThreshold"
})
public class LoadBalancerHealthCheck implements Property<LoadBalancerHealthCheck>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold
     * 
     */
    @JsonProperty("HealthyThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold")
    private CharSequence healthyThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval
     * 
     */
    @JsonProperty("Interval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval")
    private CharSequence interval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target
     * 
     */
    @JsonProperty("Target")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target")
    private CharSequence target;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout")
    private CharSequence timeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold
     * 
     */
    @JsonProperty("UnhealthyThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold")
    private CharSequence unhealthyThreshold;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold
     * 
     */
    @JsonIgnore
    public CharSequence getHealthyThreshold() {
        return healthyThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold
     * 
     */
    @JsonIgnore
    public void setHealthyThreshold(CharSequence healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    public LoadBalancerHealthCheck withHealthyThreshold(CharSequence healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval
     * 
     */
    @JsonIgnore
    public CharSequence getInterval() {
        return interval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval
     * 
     */
    @JsonIgnore
    public void setInterval(CharSequence interval) {
        this.interval = interval;
    }

    public LoadBalancerHealthCheck withInterval(CharSequence interval) {
        this.interval = interval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target
     * 
     */
    @JsonIgnore
    public CharSequence getTarget() {
        return target;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target
     * 
     */
    @JsonIgnore
    public void setTarget(CharSequence target) {
        this.target = target;
    }

    public LoadBalancerHealthCheck withTarget(CharSequence target) {
        this.target = target;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout
     * 
     */
    @JsonIgnore
    public CharSequence getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout
     * 
     */
    @JsonIgnore
    public void setTimeout(CharSequence timeout) {
        this.timeout = timeout;
    }

    public LoadBalancerHealthCheck withTimeout(CharSequence timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold
     * 
     */
    @JsonIgnore
    public CharSequence getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold
     * 
     */
    @JsonIgnore
    public void setUnhealthyThreshold(CharSequence unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public LoadBalancerHealthCheck withUnhealthyThreshold(CharSequence unhealthyThreshold) {
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
        if ((other instanceof LoadBalancerHealthCheck) == false) {
            return false;
        }
        LoadBalancerHealthCheck rhs = ((LoadBalancerHealthCheck) other);
        return new EqualsBuilder().append(unhealthyThreshold, rhs.unhealthyThreshold).append(interval, rhs.interval).append(healthyThreshold, rhs.healthyThreshold).append(timeout, rhs.timeout).append(target, rhs.target).isEquals();
    }

}
