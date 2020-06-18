
package shiver.me.timbers.aws.iot;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TopicRuleHttpAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Auth",
    "ConfirmationUrl",
    "Headers",
    "Url"
})
public class TopicRuleHttpAction implements Property<TopicRuleHttpAction>
{

    /**
     * TopicRuleHttpAuthorization
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html
     * 
     */
    @JsonProperty("Auth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html")
    private Property<TopicRuleHttpAuthorization> auth;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-confirmationurl
     * 
     */
    @JsonProperty("ConfirmationUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-confirmationurl")
    private CharSequence confirmationUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-headers
     * 
     */
    @JsonProperty("Headers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-headers")
    private Set<Property<TopicRuleHttpActionHeader>> headers = new LinkedHashSet<Property<TopicRuleHttpActionHeader>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-url
     * 
     */
    @JsonProperty("Url")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-url")
    private CharSequence url;

    /**
     * TopicRuleHttpAuthorization
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleHttpAuthorization> getAuth() {
        return auth;
    }

    /**
     * TopicRuleHttpAuthorization
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html
     * 
     */
    @JsonIgnore
    public void setAuth(Property<TopicRuleHttpAuthorization> auth) {
        this.auth = auth;
    }

    public TopicRuleHttpAction withAuth(Property<TopicRuleHttpAuthorization> auth) {
        this.auth = auth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-confirmationurl
     * 
     */
    @JsonIgnore
    public CharSequence getConfirmationUrl() {
        return confirmationUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-confirmationurl
     * 
     */
    @JsonIgnore
    public void setConfirmationUrl(CharSequence confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    public TopicRuleHttpAction withConfirmationUrl(CharSequence confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-headers
     * 
     */
    @JsonIgnore
    public Set<Property<TopicRuleHttpActionHeader>> getHeaders() {
        return headers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-headers
     * 
     */
    @JsonIgnore
    public void setHeaders(Set<Property<TopicRuleHttpActionHeader>> headers) {
        this.headers = headers;
    }

    public TopicRuleHttpAction withHeaders(Set<Property<TopicRuleHttpActionHeader>> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-url
     * 
     */
    @JsonIgnore
    public CharSequence getUrl() {
        return url;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-url
     * 
     */
    @JsonIgnore
    public void setUrl(CharSequence url) {
        this.url = url;
    }

    public TopicRuleHttpAction withUrl(CharSequence url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("auth", auth).append("confirmationUrl", confirmationUrl).append("headers", headers).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(headers).append(auth).append(confirmationUrl).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRuleHttpAction) == false) {
            return false;
        }
        TopicRuleHttpAction rhs = ((TopicRuleHttpAction) other);
        return new EqualsBuilder().append(headers, rhs.headers).append(auth, rhs.auth).append(confirmationUrl, rhs.confirmationUrl).append(url, rhs.url).isEquals();
    }

}
