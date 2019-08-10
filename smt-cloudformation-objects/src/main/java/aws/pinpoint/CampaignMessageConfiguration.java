
package aws.pinpoint;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CampaignMessageConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "APNSMessage",
    "BaiduMessage",
    "DefaultMessage",
    "EmailMessage",
    "GCMMessage",
    "SMSMessage",
    "ADMMessage"
})
public class CampaignMessageConfiguration implements Property<CampaignMessageConfiguration>
{

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonProperty("APNSMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html")
    private Property<aws.pinpoint.CampaignMessage> aPNSMessage;
    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonProperty("BaiduMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html")
    private Property<aws.pinpoint.CampaignMessage> baiduMessage;
    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonProperty("DefaultMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html")
    private Property<aws.pinpoint.CampaignMessage> defaultMessage;
    /**
     * CampaignCampaignEmailMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html
     * 
     */
    @JsonProperty("EmailMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html")
    private Property<CampaignCampaignEmailMessage> emailMessage;
    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonProperty("GCMMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html")
    private Property<aws.pinpoint.CampaignMessage> gCMMessage;
    /**
     * CampaignCampaignSmsMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html
     * 
     */
    @JsonProperty("SMSMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html")
    private Property<CampaignCampaignSmsMessage> sMSMessage;
    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonProperty("ADMMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html")
    private Property<aws.pinpoint.CampaignMessage> aDMMessage;

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public Property<aws.pinpoint.CampaignMessage> getAPNSMessage() {
        return aPNSMessage;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public void setAPNSMessage(Property<aws.pinpoint.CampaignMessage> aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    public CampaignMessageConfiguration withAPNSMessage(Property<aws.pinpoint.CampaignMessage> aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
        return this;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public Property<aws.pinpoint.CampaignMessage> getBaiduMessage() {
        return baiduMessage;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public void setBaiduMessage(Property<aws.pinpoint.CampaignMessage> baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    public CampaignMessageConfiguration withBaiduMessage(Property<aws.pinpoint.CampaignMessage> baiduMessage) {
        this.baiduMessage = baiduMessage;
        return this;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public Property<aws.pinpoint.CampaignMessage> getDefaultMessage() {
        return defaultMessage;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public void setDefaultMessage(Property<aws.pinpoint.CampaignMessage> defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public CampaignMessageConfiguration withDefaultMessage(Property<aws.pinpoint.CampaignMessage> defaultMessage) {
        this.defaultMessage = defaultMessage;
        return this;
    }

    /**
     * CampaignCampaignEmailMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html
     * 
     */
    @JsonIgnore
    public Property<CampaignCampaignEmailMessage> getEmailMessage() {
        return emailMessage;
    }

    /**
     * CampaignCampaignEmailMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html
     * 
     */
    @JsonIgnore
    public void setEmailMessage(Property<CampaignCampaignEmailMessage> emailMessage) {
        this.emailMessage = emailMessage;
    }

    public CampaignMessageConfiguration withEmailMessage(Property<CampaignCampaignEmailMessage> emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public Property<aws.pinpoint.CampaignMessage> getGCMMessage() {
        return gCMMessage;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public void setGCMMessage(Property<aws.pinpoint.CampaignMessage> gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    public CampaignMessageConfiguration withGCMMessage(Property<aws.pinpoint.CampaignMessage> gCMMessage) {
        this.gCMMessage = gCMMessage;
        return this;
    }

    /**
     * CampaignCampaignSmsMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html
     * 
     */
    @JsonIgnore
    public Property<CampaignCampaignSmsMessage> getSMSMessage() {
        return sMSMessage;
    }

    /**
     * CampaignCampaignSmsMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html
     * 
     */
    @JsonIgnore
    public void setSMSMessage(Property<CampaignCampaignSmsMessage> sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    public CampaignMessageConfiguration withSMSMessage(Property<CampaignCampaignSmsMessage> sMSMessage) {
        this.sMSMessage = sMSMessage;
        return this;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public Property<aws.pinpoint.CampaignMessage> getADMMessage() {
        return aDMMessage;
    }

    /**
     * CampaignMessage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
     * 
     */
    @JsonIgnore
    public void setADMMessage(Property<aws.pinpoint.CampaignMessage> aDMMessage) {
        this.aDMMessage = aDMMessage;
    }

    public CampaignMessageConfiguration withADMMessage(Property<aws.pinpoint.CampaignMessage> aDMMessage) {
        this.aDMMessage = aDMMessage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aPNSMessage", aPNSMessage).append("baiduMessage", baiduMessage).append("defaultMessage", defaultMessage).append("emailMessage", emailMessage).append("gCMMessage", gCMMessage).append("sMSMessage", sMSMessage).append("aDMMessage", aDMMessage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aDMMessage).append(emailMessage).append(gCMMessage).append(sMSMessage).append(aPNSMessage).append(defaultMessage).append(baiduMessage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignMessageConfiguration) == false) {
            return false;
        }
        CampaignMessageConfiguration rhs = ((CampaignMessageConfiguration) other);
        return new EqualsBuilder().append(aDMMessage, rhs.aDMMessage).append(emailMessage, rhs.emailMessage).append(gCMMessage, rhs.gCMMessage).append(sMSMessage, rhs.sMSMessage).append(aPNSMessage, rhs.aPNSMessage).append(defaultMessage, rhs.defaultMessage).append(baiduMessage, rhs.baiduMessage).isEquals();
    }

}
