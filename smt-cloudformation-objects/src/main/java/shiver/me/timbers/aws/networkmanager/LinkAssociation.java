
package shiver.me.timbers.aws.networkmanager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LinkAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GlobalNetworkId",
    "DeviceId",
    "LinkId"
})
public class LinkAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid
     * 
     */
    @JsonProperty("GlobalNetworkId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid")
    private CharSequence globalNetworkId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid
     * 
     */
    @JsonProperty("DeviceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid")
    private CharSequence deviceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid
     * 
     */
    @JsonProperty("LinkId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid")
    private CharSequence linkId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid
     * 
     */
    @JsonIgnore
    public CharSequence getGlobalNetworkId() {
        return globalNetworkId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid
     * 
     */
    @JsonIgnore
    public void setGlobalNetworkId(CharSequence globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    public LinkAssociation withGlobalNetworkId(CharSequence globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceId() {
        return deviceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid
     * 
     */
    @JsonIgnore
    public void setDeviceId(CharSequence deviceId) {
        this.deviceId = deviceId;
    }

    public LinkAssociation withDeviceId(CharSequence deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid
     * 
     */
    @JsonIgnore
    public CharSequence getLinkId() {
        return linkId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid
     * 
     */
    @JsonIgnore
    public void setLinkId(CharSequence linkId) {
        this.linkId = linkId;
    }

    public LinkAssociation withLinkId(CharSequence linkId) {
        this.linkId = linkId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("globalNetworkId", globalNetworkId).append("deviceId", deviceId).append("linkId", linkId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linkId).append(globalNetworkId).append(deviceId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LinkAssociation) == false) {
            return false;
        }
        LinkAssociation rhs = ((LinkAssociation) other);
        return new EqualsBuilder().append(linkId, rhs.linkId).append(globalNetworkId, rhs.globalNetworkId).append(deviceId, rhs.deviceId).isEquals();
    }

}
