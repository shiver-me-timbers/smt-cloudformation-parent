
package shiver.me.timbers.aws.iot;

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
 * TopicRuleAssetPropertyValue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Quality",
    "Timestamp",
    "Value"
})
public class TopicRuleAssetPropertyValue implements Property<TopicRuleAssetPropertyValue>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-quality
     * 
     */
    @JsonProperty("Quality")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-quality")
    private CharSequence quality;
    /**
     * TopicRuleAssetPropertyTimestamp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html
     * 
     */
    @JsonProperty("Timestamp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html")
    private Property<TopicRuleAssetPropertyTimestamp> timestamp;
    /**
     * TopicRuleAssetPropertyVariant
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html")
    private Property<TopicRuleAssetPropertyVariant> value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-quality
     * 
     */
    @JsonIgnore
    public CharSequence getQuality() {
        return quality;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-quality
     * 
     */
    @JsonIgnore
    public void setQuality(CharSequence quality) {
        this.quality = quality;
    }

    public TopicRuleAssetPropertyValue withQuality(CharSequence quality) {
        this.quality = quality;
        return this;
    }

    /**
     * TopicRuleAssetPropertyTimestamp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleAssetPropertyTimestamp> getTimestamp() {
        return timestamp;
    }

    /**
     * TopicRuleAssetPropertyTimestamp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html
     * 
     */
    @JsonIgnore
    public void setTimestamp(Property<TopicRuleAssetPropertyTimestamp> timestamp) {
        this.timestamp = timestamp;
    }

    public TopicRuleAssetPropertyValue withTimestamp(Property<TopicRuleAssetPropertyTimestamp> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * TopicRuleAssetPropertyVariant
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleAssetPropertyVariant> getValue() {
        return value;
    }

    /**
     * TopicRuleAssetPropertyVariant
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html
     * 
     */
    @JsonIgnore
    public void setValue(Property<TopicRuleAssetPropertyVariant> value) {
        this.value = value;
    }

    public TopicRuleAssetPropertyValue withValue(Property<TopicRuleAssetPropertyVariant> value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quality", quality).append("timestamp", timestamp).append("value", value).toString();
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
        if ((other instanceof TopicRuleAssetPropertyValue) == false) {
            return false;
        }
        TopicRuleAssetPropertyValue rhs = ((TopicRuleAssetPropertyValue) other);
        return new EqualsBuilder().append(value, rhs.value).append(quality, rhs.quality).append(timestamp, rhs.timestamp).isEquals();
    }

}
