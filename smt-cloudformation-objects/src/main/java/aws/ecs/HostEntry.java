
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HostEntry
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Hostname",
    "IpAddress"
})
public class HostEntry {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname
     * 
     */
    @JsonProperty("Hostname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname")
    private CharSequence hostname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress
     * 
     */
    @JsonProperty("IpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress")
    private CharSequence ipAddress;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname
     * 
     */
    public CharSequence getHostname() {
        return hostname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname
     * 
     */
    public void setHostname(CharSequence hostname) {
        this.hostname = hostname;
    }

    public HostEntry withHostname(CharSequence hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress
     * 
     */
    public CharSequence getIpAddress() {
        return ipAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress
     * 
     */
    public void setIpAddress(CharSequence ipAddress) {
        this.ipAddress = ipAddress;
    }

    public HostEntry withIpAddress(CharSequence ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hostname", hostname).append("ipAddress", ipAddress).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ipAddress).append(hostname).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HostEntry) == false) {
            return false;
        }
        HostEntry rhs = ((HostEntry) other);
        return new EqualsBuilder().append(ipAddress, rhs.ipAddress).append(hostname, rhs.hostname).isEquals();
    }

}
