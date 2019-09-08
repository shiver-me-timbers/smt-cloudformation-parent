
package shiver.me.timbers.aws.pinpointemail;

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
 * ConfigurationSetEventDestinationSnsDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TopicArn"
})
public class ConfigurationSetEventDestinationSnsDestination implements Property<ConfigurationSetEventDestinationSnsDestination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html#cfn-pinpointemail-configurationseteventdestination-snsdestination-topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html#cfn-pinpointemail-configurationseteventdestination-snsdestination-topicarn")
    private CharSequence topicArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html#cfn-pinpointemail-configurationseteventdestination-snsdestination-topicarn
     * 
     */
    @JsonIgnore
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html#cfn-pinpointemail-configurationseteventdestination-snsdestination-topicarn
     * 
     */
    @JsonIgnore
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public ConfigurationSetEventDestinationSnsDestination withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("topicArn", topicArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topicArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetEventDestinationSnsDestination) == false) {
            return false;
        }
        ConfigurationSetEventDestinationSnsDestination rhs = ((ConfigurationSetEventDestinationSnsDestination) other);
        return new EqualsBuilder().append(topicArn, rhs.topicArn).isEquals();
    }

}
