
package shiver.me.timbers.aws.pinpoint;

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
 * PushTemplateAndroidPushNotificationTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Action",
    "ImageUrl",
    "SmallImageIconUrl",
    "Title",
    "ImageIconUrl",
    "Sound",
    "Body",
    "Url"
})
public class PushTemplateAndroidPushNotificationTemplate implements Property<PushTemplateAndroidPushNotificationTemplate>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-action
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-action")
    private CharSequence action;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageurl
     * 
     */
    @JsonProperty("ImageUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageurl")
    private CharSequence imageUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-smallimageiconurl
     * 
     */
    @JsonProperty("SmallImageIconUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-smallimageiconurl")
    private CharSequence smallImageIconUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-title
     * 
     */
    @JsonProperty("Title")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-title")
    private CharSequence title;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageiconurl
     * 
     */
    @JsonProperty("ImageIconUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageiconurl")
    private CharSequence imageIconUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-sound
     * 
     */
    @JsonProperty("Sound")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-sound")
    private CharSequence sound;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-body
     * 
     */
    @JsonProperty("Body")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-body")
    private CharSequence body;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-url
     * 
     */
    @JsonProperty("Url")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-url")
    private CharSequence url;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-action
     * 
     */
    @JsonIgnore
    public CharSequence getAction() {
        return action;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-action
     * 
     */
    @JsonIgnore
    public void setAction(CharSequence action) {
        this.action = action;
    }

    public PushTemplateAndroidPushNotificationTemplate withAction(CharSequence action) {
        this.action = action;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageurl
     * 
     */
    @JsonIgnore
    public CharSequence getImageUrl() {
        return imageUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageurl
     * 
     */
    @JsonIgnore
    public void setImageUrl(CharSequence imageUrl) {
        this.imageUrl = imageUrl;
    }

    public PushTemplateAndroidPushNotificationTemplate withImageUrl(CharSequence imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-smallimageiconurl
     * 
     */
    @JsonIgnore
    public CharSequence getSmallImageIconUrl() {
        return smallImageIconUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-smallimageiconurl
     * 
     */
    @JsonIgnore
    public void setSmallImageIconUrl(CharSequence smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
    }

    public PushTemplateAndroidPushNotificationTemplate withSmallImageIconUrl(CharSequence smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-title
     * 
     */
    @JsonIgnore
    public CharSequence getTitle() {
        return title;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-title
     * 
     */
    @JsonIgnore
    public void setTitle(CharSequence title) {
        this.title = title;
    }

    public PushTemplateAndroidPushNotificationTemplate withTitle(CharSequence title) {
        this.title = title;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageiconurl
     * 
     */
    @JsonIgnore
    public CharSequence getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageiconurl
     * 
     */
    @JsonIgnore
    public void setImageIconUrl(CharSequence imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    public PushTemplateAndroidPushNotificationTemplate withImageIconUrl(CharSequence imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-sound
     * 
     */
    @JsonIgnore
    public CharSequence getSound() {
        return sound;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-sound
     * 
     */
    @JsonIgnore
    public void setSound(CharSequence sound) {
        this.sound = sound;
    }

    public PushTemplateAndroidPushNotificationTemplate withSound(CharSequence sound) {
        this.sound = sound;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-body
     * 
     */
    @JsonIgnore
    public CharSequence getBody() {
        return body;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-body
     * 
     */
    @JsonIgnore
    public void setBody(CharSequence body) {
        this.body = body;
    }

    public PushTemplateAndroidPushNotificationTemplate withBody(CharSequence body) {
        this.body = body;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-url
     * 
     */
    @JsonIgnore
    public CharSequence getUrl() {
        return url;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-url
     * 
     */
    @JsonIgnore
    public void setUrl(CharSequence url) {
        this.url = url;
    }

    public PushTemplateAndroidPushNotificationTemplate withUrl(CharSequence url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).append("imageUrl", imageUrl).append("smallImageIconUrl", smallImageIconUrl).append("title", title).append("imageIconUrl", imageIconUrl).append("sound", sound).append("body", body).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(smallImageIconUrl).append(imageUrl).append(sound).append(action).append(title).append(body).append(imageIconUrl).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PushTemplateAndroidPushNotificationTemplate) == false) {
            return false;
        }
        PushTemplateAndroidPushNotificationTemplate rhs = ((PushTemplateAndroidPushNotificationTemplate) other);
        return new EqualsBuilder().append(smallImageIconUrl, rhs.smallImageIconUrl).append(imageUrl, rhs.imageUrl).append(sound, rhs.sound).append(action, rhs.action).append(title, rhs.title).append(body, rhs.body).append(imageIconUrl, rhs.imageIconUrl).append(url, rhs.url).isEquals();
    }

}
