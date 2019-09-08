
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
 * SegmentDemographic
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-demographic.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AppVersion",
    "DeviceType",
    "Platform",
    "Channel",
    "Model",
    "Make"
})
public class SegmentDemographic implements Property<SegmentDemographic>
{

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonProperty("AppVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html")
    private Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> appVersion;
    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonProperty("DeviceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html")
    private Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> deviceType;
    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonProperty("Platform")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html")
    private Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> platform;
    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonProperty("Channel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html")
    private Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> channel;
    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonProperty("Model")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html")
    private Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> model;
    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonProperty("Make")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html")
    private Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> make;

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> getAppVersion() {
        return appVersion;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public void setAppVersion(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> appVersion) {
        this.appVersion = appVersion;
    }

    public SegmentDemographic withAppVersion(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> getDeviceType() {
        return deviceType;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public void setDeviceType(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> deviceType) {
        this.deviceType = deviceType;
    }

    public SegmentDemographic withDeviceType(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> getPlatform() {
        return platform;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public void setPlatform(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> platform) {
        this.platform = platform;
    }

    public SegmentDemographic withPlatform(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> platform) {
        this.platform = platform;
        return this;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> getChannel() {
        return channel;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public void setChannel(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> channel) {
        this.channel = channel;
    }

    public SegmentDemographic withChannel(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> channel) {
        this.channel = channel;
        return this;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> getModel() {
        return model;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public void setModel(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> model) {
        this.model = model;
    }

    public SegmentDemographic withModel(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> model) {
        this.model = model;
        return this;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> getMake() {
        return make;
    }

    /**
     * SegmentSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html
     * 
     */
    @JsonIgnore
    public void setMake(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> make) {
        this.make = make;
    }

    public SegmentDemographic withMake(Property<shiver.me.timbers.aws.pinpoint.SegmentSetDimension> make) {
        this.make = make;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("appVersion", appVersion).append("deviceType", deviceType).append("platform", platform).append("channel", channel).append("model", model).append("make", make).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deviceType).append(appVersion).append(channel).append(model).append(make).append(platform).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegmentDemographic) == false) {
            return false;
        }
        SegmentDemographic rhs = ((SegmentDemographic) other);
        return new EqualsBuilder().append(deviceType, rhs.deviceType).append(appVersion, rhs.appVersion).append(channel, rhs.channel).append(model, rhs.model).append(make, rhs.make).append(platform, rhs.platform).isEquals();
    }

}
