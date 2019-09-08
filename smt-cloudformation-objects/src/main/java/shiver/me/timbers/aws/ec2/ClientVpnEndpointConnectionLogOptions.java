
package shiver.me.timbers.aws.ec2;

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
 * ClientVpnEndpointConnectionLogOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudwatchLogStream",
    "Enabled",
    "CloudwatchLogGroup"
})
public class ClientVpnEndpointConnectionLogOptions implements Property<ClientVpnEndpointConnectionLogOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchlogstream
     * 
     */
    @JsonProperty("CloudwatchLogStream")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchlogstream")
    private CharSequence cloudwatchLogStream;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchloggroup
     * 
     */
    @JsonProperty("CloudwatchLogGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchloggroup")
    private CharSequence cloudwatchLogGroup;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchlogstream
     * 
     */
    @JsonIgnore
    public CharSequence getCloudwatchLogStream() {
        return cloudwatchLogStream;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchlogstream
     * 
     */
    @JsonIgnore
    public void setCloudwatchLogStream(CharSequence cloudwatchLogStream) {
        this.cloudwatchLogStream = cloudwatchLogStream;
    }

    public ClientVpnEndpointConnectionLogOptions withCloudwatchLogStream(CharSequence cloudwatchLogStream) {
        this.cloudwatchLogStream = cloudwatchLogStream;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public ClientVpnEndpointConnectionLogOptions withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchloggroup
     * 
     */
    @JsonIgnore
    public CharSequence getCloudwatchLogGroup() {
        return cloudwatchLogGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchloggroup
     * 
     */
    @JsonIgnore
    public void setCloudwatchLogGroup(CharSequence cloudwatchLogGroup) {
        this.cloudwatchLogGroup = cloudwatchLogGroup;
    }

    public ClientVpnEndpointConnectionLogOptions withCloudwatchLogGroup(CharSequence cloudwatchLogGroup) {
        this.cloudwatchLogGroup = cloudwatchLogGroup;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudwatchLogStream", cloudwatchLogStream).append("enabled", enabled).append("cloudwatchLogGroup", cloudwatchLogGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudwatchLogStream).append(cloudwatchLogGroup).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientVpnEndpointConnectionLogOptions) == false) {
            return false;
        }
        ClientVpnEndpointConnectionLogOptions rhs = ((ClientVpnEndpointConnectionLogOptions) other);
        return new EqualsBuilder().append(cloudwatchLogStream, rhs.cloudwatchLogStream).append(cloudwatchLogGroup, rhs.cloudwatchLogGroup).append(enabled, rhs.enabled).isEquals();
    }

}
