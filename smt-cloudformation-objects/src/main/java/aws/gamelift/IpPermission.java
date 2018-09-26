
package aws.gamelift;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IpPermission
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FromPort",
    "IpRange",
    "Protocol",
    "ToPort"
})
public class IpPermission {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-fromport
     * 
     */
    @JsonProperty("FromPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-fromport")
    private Integer fromPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-iprange
     * 
     */
    @JsonProperty("IpRange")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-iprange")
    private CharSequence ipRange;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-protocol")
    private CharSequence protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-toport
     * 
     */
    @JsonProperty("ToPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-toport")
    private Integer toPort;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-fromport
     * 
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-fromport
     * 
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public IpPermission withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-iprange
     * 
     */
    public CharSequence getIpRange() {
        return ipRange;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-iprange
     * 
     */
    public void setIpRange(CharSequence ipRange) {
        this.ipRange = ipRange;
    }

    public IpPermission withIpRange(CharSequence ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-protocol
     * 
     */
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-protocol
     * 
     */
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public IpPermission withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-toport
     * 
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-toport
     * 
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    public IpPermission withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fromPort", fromPort).append("ipRange", ipRange).append("protocol", protocol).append("toPort", toPort).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ipRange).append(toPort).append(protocol).append(fromPort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpPermission) == false) {
            return false;
        }
        IpPermission rhs = ((IpPermission) other);
        return new EqualsBuilder().append(ipRange, rhs.ipRange).append(toPort, rhs.toPort).append(protocol, rhs.protocol).append(fromPort, rhs.fromPort).isEquals();
    }

}
