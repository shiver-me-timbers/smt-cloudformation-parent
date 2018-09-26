
package aws.ecs;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HealthCheck
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Command",
    "Interval",
    "Retries",
    "StartPeriod",
    "Timeout"
})
public class HealthCheck {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command
     * 
     */
    @JsonProperty("Command")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command")
    private Set<CharSequence> command = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval
     * 
     */
    @JsonProperty("Interval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval")
    private Integer interval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries
     * 
     */
    @JsonProperty("Retries")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries")
    private Integer retries;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod
     * 
     */
    @JsonProperty("StartPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod")
    private Integer startPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout")
    private Integer timeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command
     * 
     */
    public Set<CharSequence> getCommand() {
        return command;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command
     * 
     */
    public void setCommand(Set<CharSequence> command) {
        this.command = command;
    }

    public HealthCheck withCommand(Set<CharSequence> command) {
        this.command = command;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval
     * 
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval
     * 
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public HealthCheck withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries
     * 
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries
     * 
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public HealthCheck withRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod
     * 
     */
    public Integer getStartPeriod() {
        return startPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod
     * 
     */
    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    public HealthCheck withStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout
     * 
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout
     * 
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public HealthCheck withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("command", command).append("interval", interval).append("retries", retries).append("startPeriod", startPeriod).append("timeout", timeout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(retries).append(startPeriod).append(interval).append(command).append(timeout).toHashCode();
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
        return new EqualsBuilder().append(retries, rhs.retries).append(startPeriod, rhs.startPeriod).append(interval, rhs.interval).append(command, rhs.command).append(timeout, rhs.timeout).isEquals();
    }

}
