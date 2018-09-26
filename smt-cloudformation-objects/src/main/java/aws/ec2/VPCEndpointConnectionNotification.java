
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPCEndpointConnectionNotification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ConnectionEvents",
    "VPCEndpointId",
    "ServiceId",
    "ConnectionNotificationArn"
})
public class VPCEndpointConnectionNotification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents
     * 
     */
    @JsonProperty("ConnectionEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents")
    private List<CharSequence> connectionEvents = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid
     * 
     */
    @JsonProperty("VPCEndpointId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid")
    private CharSequence vPCEndpointId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid
     * 
     */
    @JsonProperty("ServiceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid")
    private CharSequence serviceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn
     * 
     */
    @JsonProperty("ConnectionNotificationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn")
    private CharSequence connectionNotificationArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents
     * 
     */
    public List<CharSequence> getConnectionEvents() {
        return connectionEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents
     * 
     */
    public void setConnectionEvents(List<CharSequence> connectionEvents) {
        this.connectionEvents = connectionEvents;
    }

    public VPCEndpointConnectionNotification withConnectionEvents(List<CharSequence> connectionEvents) {
        this.connectionEvents = connectionEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid
     * 
     */
    public CharSequence getVPCEndpointId() {
        return vPCEndpointId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid
     * 
     */
    public void setVPCEndpointId(CharSequence vPCEndpointId) {
        this.vPCEndpointId = vPCEndpointId;
    }

    public VPCEndpointConnectionNotification withVPCEndpointId(CharSequence vPCEndpointId) {
        this.vPCEndpointId = vPCEndpointId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid
     * 
     */
    public CharSequence getServiceId() {
        return serviceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid
     * 
     */
    public void setServiceId(CharSequence serviceId) {
        this.serviceId = serviceId;
    }

    public VPCEndpointConnectionNotification withServiceId(CharSequence serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn
     * 
     */
    public CharSequence getConnectionNotificationArn() {
        return connectionNotificationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn
     * 
     */
    public void setConnectionNotificationArn(CharSequence connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    public VPCEndpointConnectionNotification withConnectionNotificationArn(CharSequence connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connectionEvents", connectionEvents).append("vPCEndpointId", vPCEndpointId).append("serviceId", serviceId).append("connectionNotificationArn", connectionNotificationArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionNotificationArn).append(vPCEndpointId).append(serviceId).append(connectionEvents).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCEndpointConnectionNotification) == false) {
            return false;
        }
        VPCEndpointConnectionNotification rhs = ((VPCEndpointConnectionNotification) other);
        return new EqualsBuilder().append(connectionNotificationArn, rhs.connectionNotificationArn).append(vPCEndpointId, rhs.vPCEndpointId).append(serviceId, rhs.serviceId).append(connectionEvents, rhs.connectionEvents).isEquals();
    }

}
