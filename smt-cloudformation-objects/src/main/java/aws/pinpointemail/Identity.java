
package aws.pinpointemail;

import java.util.ArrayList;
import java.util.List;
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
 * Identity
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FeedbackForwardingEnabled",
    "DkimSigningEnabled",
    "Tags",
    "Name",
    "MailFromAttributes"
})
public class Identity {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled
     * 
     */
    @JsonProperty("FeedbackForwardingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled")
    private CharSequence feedbackForwardingEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled
     * 
     */
    @JsonProperty("DkimSigningEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled")
    private CharSequence dkimSigningEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags")
    private List<Property<IdentityTags>> tags = new ArrayList<Property<IdentityTags>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name")
    private CharSequence name;
    /**
     * IdentityMailFromAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html
     * 
     */
    @JsonProperty("MailFromAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html")
    private Property<IdentityMailFromAttributes> mailFromAttributes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getFeedbackForwardingEnabled() {
        return feedbackForwardingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled
     * 
     */
    @JsonIgnore
    public void setFeedbackForwardingEnabled(CharSequence feedbackForwardingEnabled) {
        this.feedbackForwardingEnabled = feedbackForwardingEnabled;
    }

    public Identity withFeedbackForwardingEnabled(CharSequence feedbackForwardingEnabled) {
        this.feedbackForwardingEnabled = feedbackForwardingEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled
     * 
     */
    @JsonIgnore
    public CharSequence getDkimSigningEnabled() {
        return dkimSigningEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled
     * 
     */
    @JsonIgnore
    public void setDkimSigningEnabled(CharSequence dkimSigningEnabled) {
        this.dkimSigningEnabled = dkimSigningEnabled;
    }

    public Identity withDkimSigningEnabled(CharSequence dkimSigningEnabled) {
        this.dkimSigningEnabled = dkimSigningEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags
     * 
     */
    @JsonIgnore
    public List<Property<IdentityTags>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<IdentityTags>> tags) {
        this.tags = tags;
    }

    public Identity withTags(List<Property<IdentityTags>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Identity withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * IdentityMailFromAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html
     * 
     */
    @JsonIgnore
    public Property<IdentityMailFromAttributes> getMailFromAttributes() {
        return mailFromAttributes;
    }

    /**
     * IdentityMailFromAttributes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html
     * 
     */
    @JsonIgnore
    public void setMailFromAttributes(Property<IdentityMailFromAttributes> mailFromAttributes) {
        this.mailFromAttributes = mailFromAttributes;
    }

    public Identity withMailFromAttributes(Property<IdentityMailFromAttributes> mailFromAttributes) {
        this.mailFromAttributes = mailFromAttributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("feedbackForwardingEnabled", feedbackForwardingEnabled).append("dkimSigningEnabled", dkimSigningEnabled).append("tags", tags).append("name", name).append("mailFromAttributes", mailFromAttributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(feedbackForwardingEnabled).append(name).append(mailFromAttributes).append(dkimSigningEnabled).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identity) == false) {
            return false;
        }
        Identity rhs = ((Identity) other);
        return new EqualsBuilder().append(feedbackForwardingEnabled, rhs.feedbackForwardingEnabled).append(name, rhs.name).append(mailFromAttributes, rhs.mailFromAttributes).append(dkimSigningEnabled, rhs.dkimSigningEnabled).append(tags, rhs.tags).isEquals();
    }

}
