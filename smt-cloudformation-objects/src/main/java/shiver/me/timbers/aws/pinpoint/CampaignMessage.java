
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
 * CampaignMessage
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "JsonBody",
    "Action",
    "MediaUrl",
    "TimeToLive",
    "ImageSmallIconUrl",
    "ImageUrl",
    "Title",
    "ImageIconUrl",
    "SilentPush",
    "Body",
    "RawContent",
    "Url"
})
public class CampaignMessage implements Property<CampaignMessage>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-jsonbody
     * 
     */
    @JsonProperty("JsonBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-jsonbody")
    private CharSequence jsonBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-action
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-action")
    private CharSequence action;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-mediaurl
     * 
     */
    @JsonProperty("MediaUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-mediaurl")
    private CharSequence mediaUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-timetolive
     * 
     */
    @JsonProperty("TimeToLive")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-timetolive")
    private Number timeToLive;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imagesmalliconurl
     * 
     */
    @JsonProperty("ImageSmallIconUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imagesmalliconurl")
    private CharSequence imageSmallIconUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageurl
     * 
     */
    @JsonProperty("ImageUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageurl")
    private CharSequence imageUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-title
     * 
     */
    @JsonProperty("Title")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-title")
    private CharSequence title;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageiconurl
     * 
     */
    @JsonProperty("ImageIconUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageiconurl")
    private CharSequence imageIconUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-silentpush
     * 
     */
    @JsonProperty("SilentPush")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-silentpush")
    private CharSequence silentPush;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-body
     * 
     */
    @JsonProperty("Body")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-body")
    private CharSequence body;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-rawcontent
     * 
     */
    @JsonProperty("RawContent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-rawcontent")
    private CharSequence rawContent;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-url
     * 
     */
    @JsonProperty("Url")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-url")
    private CharSequence url;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-jsonbody
     * 
     */
    @JsonIgnore
    public CharSequence getJsonBody() {
        return jsonBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-jsonbody
     * 
     */
    @JsonIgnore
    public void setJsonBody(CharSequence jsonBody) {
        this.jsonBody = jsonBody;
    }

    public CampaignMessage withJsonBody(CharSequence jsonBody) {
        this.jsonBody = jsonBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-action
     * 
     */
    @JsonIgnore
    public CharSequence getAction() {
        return action;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-action
     * 
     */
    @JsonIgnore
    public void setAction(CharSequence action) {
        this.action = action;
    }

    public CampaignMessage withAction(CharSequence action) {
        this.action = action;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-mediaurl
     * 
     */
    @JsonIgnore
    public CharSequence getMediaUrl() {
        return mediaUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-mediaurl
     * 
     */
    @JsonIgnore
    public void setMediaUrl(CharSequence mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public CampaignMessage withMediaUrl(CharSequence mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-timetolive
     * 
     */
    @JsonIgnore
    public Number getTimeToLive() {
        return timeToLive;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-timetolive
     * 
     */
    @JsonIgnore
    public void setTimeToLive(Number timeToLive) {
        this.timeToLive = timeToLive;
    }

    public CampaignMessage withTimeToLive(Number timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imagesmalliconurl
     * 
     */
    @JsonIgnore
    public CharSequence getImageSmallIconUrl() {
        return imageSmallIconUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imagesmalliconurl
     * 
     */
    @JsonIgnore
    public void setImageSmallIconUrl(CharSequence imageSmallIconUrl) {
        this.imageSmallIconUrl = imageSmallIconUrl;
    }

    public CampaignMessage withImageSmallIconUrl(CharSequence imageSmallIconUrl) {
        this.imageSmallIconUrl = imageSmallIconUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageurl
     * 
     */
    @JsonIgnore
    public CharSequence getImageUrl() {
        return imageUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageurl
     * 
     */
    @JsonIgnore
    public void setImageUrl(CharSequence imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CampaignMessage withImageUrl(CharSequence imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-title
     * 
     */
    @JsonIgnore
    public CharSequence getTitle() {
        return title;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-title
     * 
     */
    @JsonIgnore
    public void setTitle(CharSequence title) {
        this.title = title;
    }

    public CampaignMessage withTitle(CharSequence title) {
        this.title = title;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageiconurl
     * 
     */
    @JsonIgnore
    public CharSequence getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-imageiconurl
     * 
     */
    @JsonIgnore
    public void setImageIconUrl(CharSequence imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    public CampaignMessage withImageIconUrl(CharSequence imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-silentpush
     * 
     */
    @JsonIgnore
    public CharSequence getSilentPush() {
        return silentPush;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-silentpush
     * 
     */
    @JsonIgnore
    public void setSilentPush(CharSequence silentPush) {
        this.silentPush = silentPush;
    }

    public CampaignMessage withSilentPush(CharSequence silentPush) {
        this.silentPush = silentPush;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-body
     * 
     */
    @JsonIgnore
    public CharSequence getBody() {
        return body;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-body
     * 
     */
    @JsonIgnore
    public void setBody(CharSequence body) {
        this.body = body;
    }

    public CampaignMessage withBody(CharSequence body) {
        this.body = body;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-rawcontent
     * 
     */
    @JsonIgnore
    public CharSequence getRawContent() {
        return rawContent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-rawcontent
     * 
     */
    @JsonIgnore
    public void setRawContent(CharSequence rawContent) {
        this.rawContent = rawContent;
    }

    public CampaignMessage withRawContent(CharSequence rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-url
     * 
     */
    @JsonIgnore
    public CharSequence getUrl() {
        return url;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html#cfn-pinpoint-campaign-message-url
     * 
     */
    @JsonIgnore
    public void setUrl(CharSequence url) {
        this.url = url;
    }

    public CampaignMessage withUrl(CharSequence url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jsonBody", jsonBody).append("action", action).append("mediaUrl", mediaUrl).append("timeToLive", timeToLive).append("imageSmallIconUrl", imageSmallIconUrl).append("imageUrl", imageUrl).append("title", title).append("imageIconUrl", imageIconUrl).append("silentPush", silentPush).append("body", body).append("rawContent", rawContent).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imageSmallIconUrl).append(mediaUrl).append(jsonBody).append(title).append(body).append(imageIconUrl).append(silentPush).append(url).append(rawContent).append(timeToLive).append(imageUrl).append(action).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignMessage) == false) {
            return false;
        }
        CampaignMessage rhs = ((CampaignMessage) other);
        return new EqualsBuilder().append(imageSmallIconUrl, rhs.imageSmallIconUrl).append(mediaUrl, rhs.mediaUrl).append(jsonBody, rhs.jsonBody).append(title, rhs.title).append(body, rhs.body).append(imageIconUrl, rhs.imageIconUrl).append(silentPush, rhs.silentPush).append(url, rhs.url).append(rawContent, rhs.rawContent).append(timeToLive, rhs.timeToLive).append(imageUrl, rhs.imageUrl).append(action, rhs.action).isEquals();
    }

}
