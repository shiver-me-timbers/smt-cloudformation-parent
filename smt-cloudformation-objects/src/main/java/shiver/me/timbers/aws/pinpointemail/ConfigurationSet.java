
package shiver.me.timbers.aws.pinpointemail;

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
 * ConfigurationSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SendingOptions",
    "TrackingOptions",
    "ReputationOptions",
    "DeliveryOptions",
    "Tags",
    "Name"
})
public class ConfigurationSet {

    /**
     * ConfigurationSetSendingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html
     * 
     */
    @JsonProperty("SendingOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html")
    private Property<ConfigurationSetSendingOptions> sendingOptions;
    /**
     * ConfigurationSetTrackingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html
     * 
     */
    @JsonProperty("TrackingOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html")
    private Property<ConfigurationSetTrackingOptions> trackingOptions;
    /**
     * ConfigurationSetReputationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html
     * 
     */
    @JsonProperty("ReputationOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html")
    private Property<ConfigurationSetReputationOptions> reputationOptions;
    /**
     * ConfigurationSetDeliveryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html
     * 
     */
    @JsonProperty("DeliveryOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html")
    private Property<ConfigurationSetDeliveryOptions> deliveryOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags")
    private List<Property<ConfigurationSetTags>> tags = new ArrayList<Property<ConfigurationSetTags>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name")
    private CharSequence name;

    /**
     * ConfigurationSetSendingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetSendingOptions> getSendingOptions() {
        return sendingOptions;
    }

    /**
     * ConfigurationSetSendingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html
     * 
     */
    @JsonIgnore
    public void setSendingOptions(Property<ConfigurationSetSendingOptions> sendingOptions) {
        this.sendingOptions = sendingOptions;
    }

    public ConfigurationSet withSendingOptions(Property<ConfigurationSetSendingOptions> sendingOptions) {
        this.sendingOptions = sendingOptions;
        return this;
    }

    /**
     * ConfigurationSetTrackingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetTrackingOptions> getTrackingOptions() {
        return trackingOptions;
    }

    /**
     * ConfigurationSetTrackingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html
     * 
     */
    @JsonIgnore
    public void setTrackingOptions(Property<ConfigurationSetTrackingOptions> trackingOptions) {
        this.trackingOptions = trackingOptions;
    }

    public ConfigurationSet withTrackingOptions(Property<ConfigurationSetTrackingOptions> trackingOptions) {
        this.trackingOptions = trackingOptions;
        return this;
    }

    /**
     * ConfigurationSetReputationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetReputationOptions> getReputationOptions() {
        return reputationOptions;
    }

    /**
     * ConfigurationSetReputationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html
     * 
     */
    @JsonIgnore
    public void setReputationOptions(Property<ConfigurationSetReputationOptions> reputationOptions) {
        this.reputationOptions = reputationOptions;
    }

    public ConfigurationSet withReputationOptions(Property<ConfigurationSetReputationOptions> reputationOptions) {
        this.reputationOptions = reputationOptions;
        return this;
    }

    /**
     * ConfigurationSetDeliveryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetDeliveryOptions> getDeliveryOptions() {
        return deliveryOptions;
    }

    /**
     * ConfigurationSetDeliveryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html
     * 
     */
    @JsonIgnore
    public void setDeliveryOptions(Property<ConfigurationSetDeliveryOptions> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    public ConfigurationSet withDeliveryOptions(Property<ConfigurationSetDeliveryOptions> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags
     * 
     */
    @JsonIgnore
    public List<Property<ConfigurationSetTags>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<ConfigurationSetTags>> tags) {
        this.tags = tags;
    }

    public ConfigurationSet withTags(List<Property<ConfigurationSetTags>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html#cfn-pinpointemail-configurationset-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ConfigurationSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sendingOptions", sendingOptions).append("trackingOptions", trackingOptions).append("reputationOptions", reputationOptions).append("deliveryOptions", deliveryOptions).append("tags", tags).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(sendingOptions).append(trackingOptions).append(reputationOptions).append(deliveryOptions).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSet) == false) {
            return false;
        }
        ConfigurationSet rhs = ((ConfigurationSet) other);
        return new EqualsBuilder().append(name, rhs.name).append(sendingOptions, rhs.sendingOptions).append(trackingOptions, rhs.trackingOptions).append(reputationOptions, rhs.reputationOptions).append(deliveryOptions, rhs.deliveryOptions).append(tags, rhs.tags).isEquals();
    }

}
