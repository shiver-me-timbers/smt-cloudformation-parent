
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
 * LoadBalancerConnectionSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IdleTimeout"
})
public class LoadBalancerConnectionSettings implements Property<LoadBalancerConnectionSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout
     * 
     */
    @JsonProperty("IdleTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout")
    private Number idleTimeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout
     * 
     */
    @JsonIgnore
    public Number getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout
     * 
     */
    @JsonIgnore
    public void setIdleTimeout(Number idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public LoadBalancerConnectionSettings withIdleTimeout(Number idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("idleTimeout", idleTimeout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(idleTimeout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadBalancerConnectionSettings) == false) {
            return false;
        }
        LoadBalancerConnectionSettings rhs = ((LoadBalancerConnectionSettings) other);
        return new EqualsBuilder().append(idleTimeout, rhs.idleTimeout).isEquals();
    }

}
