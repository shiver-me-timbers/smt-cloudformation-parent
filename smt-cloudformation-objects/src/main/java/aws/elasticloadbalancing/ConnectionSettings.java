
package aws.elasticloadbalancing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConnectionSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IdleTimeout"
})
public class ConnectionSettings {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout
     * 
     */
    @JsonProperty("IdleTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout")
    private Integer idleTimeout;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout
     * 
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout
     * 
     */
    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public ConnectionSettings withIdleTimeout(Integer idleTimeout) {
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
        if ((other instanceof ConnectionSettings) == false) {
            return false;
        }
        ConnectionSettings rhs = ((ConnectionSettings) other);
        return new EqualsBuilder().append(idleTimeout, rhs.idleTimeout).isEquals();
    }

}
