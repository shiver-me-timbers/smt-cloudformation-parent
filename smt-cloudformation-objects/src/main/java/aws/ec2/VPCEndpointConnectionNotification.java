
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
    private List<String> connectionEvents = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid
     * 
     */
    @JsonProperty("VPCEndpointId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid")
    private String vPCEndpointId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid
     * 
     */
    @JsonProperty("ServiceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid")
    private String serviceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn
     * 
     */
    @JsonProperty("ConnectionNotificationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn")
    private String connectionNotificationArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents
     * 
     */
    @JsonProperty("ConnectionEvents")
    public List<String> getConnectionEvents() {
        return connectionEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents
     * 
     */
    @JsonProperty("ConnectionEvents")
    public void setConnectionEvents(List<String> connectionEvents) {
        this.connectionEvents = connectionEvents;
    }

    public VPCEndpointConnectionNotification withConnectionEvents(List<String> connectionEvents) {
        this.connectionEvents = connectionEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid
     * 
     */
    @JsonProperty("VPCEndpointId")
    public String getVPCEndpointId() {
        return vPCEndpointId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid
     * 
     */
    @JsonProperty("VPCEndpointId")
    public void setVPCEndpointId(String vPCEndpointId) {
        this.vPCEndpointId = vPCEndpointId;
    }

    public VPCEndpointConnectionNotification withVPCEndpointId(String vPCEndpointId) {
        this.vPCEndpointId = vPCEndpointId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid
     * 
     */
    @JsonProperty("ServiceId")
    public String getServiceId() {
        return serviceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid
     * 
     */
    @JsonProperty("ServiceId")
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public VPCEndpointConnectionNotification withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn
     * 
     */
    @JsonProperty("ConnectionNotificationArn")
    public String getConnectionNotificationArn() {
        return connectionNotificationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn
     * 
     */
    @JsonProperty("ConnectionNotificationArn")
    public void setConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    public VPCEndpointConnectionNotification withConnectionNotificationArn(String connectionNotificationArn) {
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
