
package shiver.me.timbers.aws.globalaccelerator;

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
 * Listener
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AcceleratorArn",
    "PortRanges",
    "Protocol",
    "ClientAffinity"
})
public class Listener {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn
     * 
     */
    @JsonProperty("AcceleratorArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn")
    private CharSequence acceleratorArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges
     * 
     */
    @JsonProperty("PortRanges")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges")
    private List<Property<ListenerPortRange>> portRanges = new ArrayList<Property<ListenerPortRange>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol")
    private CharSequence protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-clientaffinity
     * 
     */
    @JsonProperty("ClientAffinity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-clientaffinity")
    private CharSequence clientAffinity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn
     * 
     */
    @JsonIgnore
    public CharSequence getAcceleratorArn() {
        return acceleratorArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-acceleratorarn
     * 
     */
    @JsonIgnore
    public void setAcceleratorArn(CharSequence acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
    }

    public Listener withAcceleratorArn(CharSequence acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges
     * 
     */
    @JsonIgnore
    public List<Property<ListenerPortRange>> getPortRanges() {
        return portRanges;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-portranges
     * 
     */
    @JsonIgnore
    public void setPortRanges(List<Property<ListenerPortRange>> portRanges) {
        this.portRanges = portRanges;
    }

    public Listener withPortRanges(List<Property<ListenerPortRange>> portRanges) {
        this.portRanges = portRanges;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol
     * 
     */
    @JsonIgnore
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-protocol
     * 
     */
    @JsonIgnore
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public Listener withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-clientaffinity
     * 
     */
    @JsonIgnore
    public CharSequence getClientAffinity() {
        return clientAffinity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html#cfn-globalaccelerator-listener-clientaffinity
     * 
     */
    @JsonIgnore
    public void setClientAffinity(CharSequence clientAffinity) {
        this.clientAffinity = clientAffinity;
    }

    public Listener withClientAffinity(CharSequence clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("acceleratorArn", acceleratorArn).append("portRanges", portRanges).append("protocol", protocol).append("clientAffinity", clientAffinity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceleratorArn).append(portRanges).append(protocol).append(clientAffinity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Listener) == false) {
            return false;
        }
        Listener rhs = ((Listener) other);
        return new EqualsBuilder().append(acceleratorArn, rhs.acceleratorArn).append(portRanges, rhs.portRanges).append(protocol, rhs.protocol).append(clientAffinity, rhs.clientAffinity).isEquals();
    }

}
