
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
 * TopicRuleAssetPropertyVariant
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BooleanValue",
    "DoubleValue",
    "IntegerValue",
    "StringValue"
})
public class TopicRuleAssetPropertyVariant implements Property<TopicRuleAssetPropertyVariant>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-booleanvalue
     * 
     */
    @JsonProperty("BooleanValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-booleanvalue")
    private CharSequence booleanValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-doublevalue
     * 
     */
    @JsonProperty("DoubleValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-doublevalue")
    private CharSequence doubleValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-integervalue
     * 
     */
    @JsonProperty("IntegerValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-integervalue")
    private CharSequence integerValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-stringvalue
     * 
     */
    @JsonProperty("StringValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-stringvalue")
    private CharSequence stringValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-booleanvalue
     * 
     */
    @JsonIgnore
    public CharSequence getBooleanValue() {
        return booleanValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-booleanvalue
     * 
     */
    @JsonIgnore
    public void setBooleanValue(CharSequence booleanValue) {
        this.booleanValue = booleanValue;
    }

    public TopicRuleAssetPropertyVariant withBooleanValue(CharSequence booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-doublevalue
     * 
     */
    @JsonIgnore
    public CharSequence getDoubleValue() {
        return doubleValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-doublevalue
     * 
     */
    @JsonIgnore
    public void setDoubleValue(CharSequence doubleValue) {
        this.doubleValue = doubleValue;
    }

    public TopicRuleAssetPropertyVariant withDoubleValue(CharSequence doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-integervalue
     * 
     */
    @JsonIgnore
    public CharSequence getIntegerValue() {
        return integerValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-integervalue
     * 
     */
    @JsonIgnore
    public void setIntegerValue(CharSequence integerValue) {
        this.integerValue = integerValue;
    }

    public TopicRuleAssetPropertyVariant withIntegerValue(CharSequence integerValue) {
        this.integerValue = integerValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-stringvalue
     * 
     */
    @JsonIgnore
    public CharSequence getStringValue() {
        return stringValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-stringvalue
     * 
     */
    @JsonIgnore
    public void setStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
    }

    public TopicRuleAssetPropertyVariant withStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("booleanValue", booleanValue).append("doubleValue", doubleValue).append("integerValue", integerValue).append("stringValue", stringValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(booleanValue).append(integerValue).append(stringValue).append(doubleValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRuleAssetPropertyVariant) == false) {
            return false;
        }
        TopicRuleAssetPropertyVariant rhs = ((TopicRuleAssetPropertyVariant) other);
        return new EqualsBuilder().append(booleanValue, rhs.booleanValue).append(integerValue, rhs.integerValue).append(stringValue, rhs.stringValue).append(doubleValue, rhs.doubleValue).isEquals();
    }

}
