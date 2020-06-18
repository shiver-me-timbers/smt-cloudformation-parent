
package shiver.me.timbers.aws.chatbot;

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


/**
 * SlackChannelConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SlackWorkspaceId",
    "SlackChannelId",
    "ConfigurationName",
    "IamRoleArn",
    "SnsTopicArns",
    "LoggingLevel"
})
public class SlackChannelConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid
     * 
     */
    @JsonProperty("SlackWorkspaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid")
    private CharSequence slackWorkspaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid
     * 
     */
    @JsonProperty("SlackChannelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid")
    private CharSequence slackChannelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname
     * 
     */
    @JsonProperty("ConfigurationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname")
    private CharSequence configurationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn
     * 
     */
    @JsonProperty("IamRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn")
    private CharSequence iamRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns
     * 
     */
    @JsonProperty("SnsTopicArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns")
    private List<CharSequence> snsTopicArns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel
     * 
     */
    @JsonProperty("LoggingLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel")
    private CharSequence loggingLevel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid
     * 
     */
    @JsonIgnore
    public CharSequence getSlackWorkspaceId() {
        return slackWorkspaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid
     * 
     */
    @JsonIgnore
    public void setSlackWorkspaceId(CharSequence slackWorkspaceId) {
        this.slackWorkspaceId = slackWorkspaceId;
    }

    public SlackChannelConfiguration withSlackWorkspaceId(CharSequence slackWorkspaceId) {
        this.slackWorkspaceId = slackWorkspaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid
     * 
     */
    @JsonIgnore
    public CharSequence getSlackChannelId() {
        return slackChannelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid
     * 
     */
    @JsonIgnore
    public void setSlackChannelId(CharSequence slackChannelId) {
        this.slackChannelId = slackChannelId;
    }

    public SlackChannelConfiguration withSlackChannelId(CharSequence slackChannelId) {
        this.slackChannelId = slackChannelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationName() {
        return configurationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname
     * 
     */
    @JsonIgnore
    public void setConfigurationName(CharSequence configurationName) {
        this.configurationName = configurationName;
    }

    public SlackChannelConfiguration withConfigurationName(CharSequence configurationName) {
        this.configurationName = configurationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn
     * 
     */
    @JsonIgnore
    public void setIamRoleArn(CharSequence iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    public SlackChannelConfiguration withIamRoleArn(CharSequence iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSnsTopicArns() {
        return snsTopicArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns
     * 
     */
    @JsonIgnore
    public void setSnsTopicArns(List<CharSequence> snsTopicArns) {
        this.snsTopicArns = snsTopicArns;
    }

    public SlackChannelConfiguration withSnsTopicArns(List<CharSequence> snsTopicArns) {
        this.snsTopicArns = snsTopicArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel
     * 
     */
    @JsonIgnore
    public CharSequence getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel
     * 
     */
    @JsonIgnore
    public void setLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public SlackChannelConfiguration withLoggingLevel(CharSequence loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("slackWorkspaceId", slackWorkspaceId).append("slackChannelId", slackChannelId).append("configurationName", configurationName).append("iamRoleArn", iamRoleArn).append("snsTopicArns", snsTopicArns).append("loggingLevel", loggingLevel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(snsTopicArns).append(slackChannelId).append(slackWorkspaceId).append(iamRoleArn).append(configurationName).append(loggingLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SlackChannelConfiguration) == false) {
            return false;
        }
        SlackChannelConfiguration rhs = ((SlackChannelConfiguration) other);
        return new EqualsBuilder().append(snsTopicArns, rhs.snsTopicArns).append(slackChannelId, rhs.slackChannelId).append(slackWorkspaceId, rhs.slackWorkspaceId).append(iamRoleArn, rhs.iamRoleArn).append(configurationName, rhs.configurationName).append(loggingLevel, rhs.loggingLevel).isEquals();
    }

}
