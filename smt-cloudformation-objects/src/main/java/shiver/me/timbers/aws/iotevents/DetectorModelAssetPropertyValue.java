
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelAssetPropertyValue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Quality",
    "Value",
    "Timestamp"
})
public class DetectorModelAssetPropertyValue implements Property<DetectorModelAssetPropertyValue>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-quality
     * 
     */
    @JsonProperty("Quality")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-quality")
    private CharSequence quality;
    /**
     * DetectorModelAssetPropertyVariant
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html")
    private Property<DetectorModelAssetPropertyVariant> value;
    /**
     * DetectorModelAssetPropertyTimestamp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html
     * 
     */
    @JsonProperty("Timestamp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html")
    private Property<DetectorModelAssetPropertyTimestamp> timestamp;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-quality
     * 
     */
    @JsonIgnore
    public CharSequence getQuality() {
        return quality;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-quality
     * 
     */
    @JsonIgnore
    public void setQuality(CharSequence quality) {
        this.quality = quality;
    }

    public DetectorModelAssetPropertyValue withQuality(CharSequence quality) {
        this.quality = quality;
        return this;
    }

    /**
     * DetectorModelAssetPropertyVariant
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelAssetPropertyVariant> getValue() {
        return value;
    }

    /**
     * DetectorModelAssetPropertyVariant
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html
     * 
     */
    @JsonIgnore
    public void setValue(Property<DetectorModelAssetPropertyVariant> value) {
        this.value = value;
    }

    public DetectorModelAssetPropertyValue withValue(Property<DetectorModelAssetPropertyVariant> value) {
        this.value = value;
        return this;
    }

    /**
     * DetectorModelAssetPropertyTimestamp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelAssetPropertyTimestamp> getTimestamp() {
        return timestamp;
    }

    /**
     * DetectorModelAssetPropertyTimestamp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html
     * 
     */
    @JsonIgnore
    public void setTimestamp(Property<DetectorModelAssetPropertyTimestamp> timestamp) {
        this.timestamp = timestamp;
    }

    public DetectorModelAssetPropertyValue withTimestamp(Property<DetectorModelAssetPropertyTimestamp> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quality", quality).append("value", value).append("timestamp", timestamp).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(quality).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelAssetPropertyValue) == false) {
            return false;
        }
        DetectorModelAssetPropertyValue rhs = ((DetectorModelAssetPropertyValue) other);
        return new EqualsBuilder().append(value, rhs.value).append(quality, rhs.quality).append(timestamp, rhs.timestamp).isEquals();
    }

}
