
package shiver.me.timbers.aws.medialive;

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
 * Channel
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InputAttachments",
    "InputSpecification",
    "ChannelClass",
    "EncoderSettings",
    "Destinations",
    "LogLevel",
    "RoleArn",
    "Tags",
    "Name"
})
public class Channel {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments
     * 
     */
    @JsonProperty("InputAttachments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments")
    private List<Property<ChannelInputAttachment>> inputAttachments = new ArrayList<Property<ChannelInputAttachment>>();
    /**
     * ChannelInputSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html
     * 
     */
    @JsonProperty("InputSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html")
    private Property<ChannelInputSpecification> inputSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelclass
     * 
     */
    @JsonProperty("ChannelClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelclass")
    private CharSequence channelClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings
     * 
     */
    @JsonProperty("EncoderSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings")
    private Object encoderSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations
     * 
     */
    @JsonProperty("Destinations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations")
    private List<Property<ChannelOutputDestination>> destinations = new ArrayList<Property<ChannelOutputDestination>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-loglevel
     * 
     */
    @JsonProperty("LogLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-loglevel")
    private CharSequence logLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments
     * 
     */
    @JsonIgnore
    public List<Property<ChannelInputAttachment>> getInputAttachments() {
        return inputAttachments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-inputattachments
     * 
     */
    @JsonIgnore
    public void setInputAttachments(List<Property<ChannelInputAttachment>> inputAttachments) {
        this.inputAttachments = inputAttachments;
    }

    public Channel withInputAttachments(List<Property<ChannelInputAttachment>> inputAttachments) {
        this.inputAttachments = inputAttachments;
        return this;
    }

    /**
     * ChannelInputSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html
     * 
     */
    @JsonIgnore
    public Property<ChannelInputSpecification> getInputSpecification() {
        return inputSpecification;
    }

    /**
     * ChannelInputSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html
     * 
     */
    @JsonIgnore
    public void setInputSpecification(Property<ChannelInputSpecification> inputSpecification) {
        this.inputSpecification = inputSpecification;
    }

    public Channel withInputSpecification(Property<ChannelInputSpecification> inputSpecification) {
        this.inputSpecification = inputSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelclass
     * 
     */
    @JsonIgnore
    public CharSequence getChannelClass() {
        return channelClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-channelclass
     * 
     */
    @JsonIgnore
    public void setChannelClass(CharSequence channelClass) {
        this.channelClass = channelClass;
    }

    public Channel withChannelClass(CharSequence channelClass) {
        this.channelClass = channelClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings
     * 
     */
    @JsonIgnore
    public Object getEncoderSettings() {
        return encoderSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-encodersettings
     * 
     */
    @JsonIgnore
    public void setEncoderSettings(Object encoderSettings) {
        this.encoderSettings = encoderSettings;
    }

    public Channel withEncoderSettings(Object encoderSettings) {
        this.encoderSettings = encoderSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations
     * 
     */
    @JsonIgnore
    public List<Property<ChannelOutputDestination>> getDestinations() {
        return destinations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-destinations
     * 
     */
    @JsonIgnore
    public void setDestinations(List<Property<ChannelOutputDestination>> destinations) {
        this.destinations = destinations;
    }

    public Channel withDestinations(List<Property<ChannelOutputDestination>> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-loglevel
     * 
     */
    @JsonIgnore
    public CharSequence getLogLevel() {
        return logLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-loglevel
     * 
     */
    @JsonIgnore
    public void setLogLevel(CharSequence logLevel) {
        this.logLevel = logLevel;
    }

    public Channel withLogLevel(CharSequence logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public Channel withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Channel withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html#cfn-medialive-channel-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Channel withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("inputAttachments", inputAttachments).append("inputSpecification", inputSpecification).append("channelClass", channelClass).append("encoderSettings", encoderSettings).append("destinations", destinations).append("logLevel", logLevel).append("roleArn", roleArn).append("tags", tags).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputAttachments).append(logLevel).append(roleArn).append(destinations).append(name).append(encoderSettings).append(inputSpecification).append(channelClass).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Channel) == false) {
            return false;
        }
        Channel rhs = ((Channel) other);
        return new EqualsBuilder().append(inputAttachments, rhs.inputAttachments).append(logLevel, rhs.logLevel).append(roleArn, rhs.roleArn).append(destinations, rhs.destinations).append(name, rhs.name).append(encoderSettings, rhs.encoderSettings).append(inputSpecification, rhs.inputSpecification).append(channelClass, rhs.channelClass).append(tags, rhs.tags).isEquals();
    }

}
