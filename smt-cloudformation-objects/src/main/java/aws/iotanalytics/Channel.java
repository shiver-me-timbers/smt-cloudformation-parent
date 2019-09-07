
package aws.iotanalytics;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Channel
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ChannelName",
    "ChannelStorage",
    "RetentionPeriod",
    "Tags"
})
public class Channel {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname
     * 
     */
    @JsonProperty("ChannelName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname")
    private CharSequence channelName;
    /**
     * ChannelChannelStorage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html
     * 
     */
    @JsonProperty("ChannelStorage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html")
    private Property<ChannelChannelStorage> channelStorage;
    /**
     * ChannelRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html
     * 
     */
    @JsonProperty("RetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html")
    private Property<ChannelRetentionPeriod> retentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname
     * 
     */
    @JsonIgnore
    public CharSequence getChannelName() {
        return channelName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname
     * 
     */
    @JsonIgnore
    public void setChannelName(CharSequence channelName) {
        this.channelName = channelName;
    }

    public Channel withChannelName(CharSequence channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * ChannelChannelStorage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html
     * 
     */
    @JsonIgnore
    public Property<ChannelChannelStorage> getChannelStorage() {
        return channelStorage;
    }

    /**
     * ChannelChannelStorage
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html
     * 
     */
    @JsonIgnore
    public void setChannelStorage(Property<ChannelChannelStorage> channelStorage) {
        this.channelStorage = channelStorage;
    }

    public Channel withChannelStorage(Property<ChannelChannelStorage> channelStorage) {
        this.channelStorage = channelStorage;
        return this;
    }

    /**
     * ChannelRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html
     * 
     */
    @JsonIgnore
    public Property<ChannelRetentionPeriod> getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * ChannelRetentionPeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html
     * 
     */
    @JsonIgnore
    public void setRetentionPeriod(Property<ChannelRetentionPeriod> retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public Channel withRetentionPeriod(Property<ChannelRetentionPeriod> retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Channel withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("channelName", channelName).append("channelStorage", channelStorage).append("retentionPeriod", retentionPeriod).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(channelName).append(channelStorage).append(retentionPeriod).append(tags).toHashCode();
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
        return new EqualsBuilder().append(channelName, rhs.channelName).append(channelStorage, rhs.channelStorage).append(retentionPeriod, rhs.retentionPeriod).append(tags, rhs.tags).isEquals();
    }

}
