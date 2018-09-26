
package aws.elasticloadbalancing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConnectionDrainingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled",
    "Timeout"
})
public class ConnectionDrainingPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout")
    private Integer timeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ConnectionDrainingPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout
     * 
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout
     * 
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ConnectionDrainingPolicy withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("timeout", timeout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enabled).append(timeout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionDrainingPolicy) == false) {
            return false;
        }
        ConnectionDrainingPolicy rhs = ((ConnectionDrainingPolicy) other);
        return new EqualsBuilder().append(enabled, rhs.enabled).append(timeout, rhs.timeout).isEquals();
    }

}
