
package shiver.me.timbers.aws.fms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NotificationChannel
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SnsRoleName",
    "SnsTopicArn"
})
public class NotificationChannel {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename
     * 
     */
    @JsonProperty("SnsRoleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename")
    private CharSequence snsRoleName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn")
    private CharSequence snsTopicArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename
     * 
     */
    @JsonIgnore
    public CharSequence getSnsRoleName() {
        return snsRoleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename
     * 
     */
    @JsonIgnore
    public void setSnsRoleName(CharSequence snsRoleName) {
        this.snsRoleName = snsRoleName;
    }

    public NotificationChannel withSnsRoleName(CharSequence snsRoleName) {
        this.snsRoleName = snsRoleName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn
     * 
     */
    @JsonIgnore
    public CharSequence getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn
     * 
     */
    @JsonIgnore
    public void setSnsTopicArn(CharSequence snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    public NotificationChannel withSnsTopicArn(CharSequence snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("snsRoleName", snsRoleName).append("snsTopicArn", snsTopicArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(snsRoleName).append(snsTopicArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotificationChannel) == false) {
            return false;
        }
        NotificationChannel rhs = ((NotificationChannel) other);
        return new EqualsBuilder().append(snsRoleName, rhs.snsRoleName).append(snsTopicArn, rhs.snsTopicArn).isEquals();
    }

}
