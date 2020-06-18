
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
 * DetectorModelAssetPropertyVariant
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DoubleValue",
    "IntegerValue",
    "BooleanValue",
    "StringValue"
})
public class DetectorModelAssetPropertyVariant implements Property<DetectorModelAssetPropertyVariant>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-doublevalue
     * 
     */
    @JsonProperty("DoubleValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-doublevalue")
    private CharSequence doubleValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-integervalue
     * 
     */
    @JsonProperty("IntegerValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-integervalue")
    private CharSequence integerValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-booleanvalue
     * 
     */
    @JsonProperty("BooleanValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-booleanvalue")
    private CharSequence booleanValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-stringvalue
     * 
     */
    @JsonProperty("StringValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-stringvalue")
    private CharSequence stringValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-doublevalue
     * 
     */
    @JsonIgnore
    public CharSequence getDoubleValue() {
        return doubleValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-doublevalue
     * 
     */
    @JsonIgnore
    public void setDoubleValue(CharSequence doubleValue) {
        this.doubleValue = doubleValue;
    }

    public DetectorModelAssetPropertyVariant withDoubleValue(CharSequence doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-integervalue
     * 
     */
    @JsonIgnore
    public CharSequence getIntegerValue() {
        return integerValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-integervalue
     * 
     */
    @JsonIgnore
    public void setIntegerValue(CharSequence integerValue) {
        this.integerValue = integerValue;
    }

    public DetectorModelAssetPropertyVariant withIntegerValue(CharSequence integerValue) {
        this.integerValue = integerValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-booleanvalue
     * 
     */
    @JsonIgnore
    public CharSequence getBooleanValue() {
        return booleanValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-booleanvalue
     * 
     */
    @JsonIgnore
    public void setBooleanValue(CharSequence booleanValue) {
        this.booleanValue = booleanValue;
    }

    public DetectorModelAssetPropertyVariant withBooleanValue(CharSequence booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-stringvalue
     * 
     */
    @JsonIgnore
    public CharSequence getStringValue() {
        return stringValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-stringvalue
     * 
     */
    @JsonIgnore
    public void setStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
    }

    public DetectorModelAssetPropertyVariant withStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("doubleValue", doubleValue).append("integerValue", integerValue).append("booleanValue", booleanValue).append("stringValue", stringValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(integerValue).append(booleanValue).append(stringValue).append(doubleValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelAssetPropertyVariant) == false) {
            return false;
        }
        DetectorModelAssetPropertyVariant rhs = ((DetectorModelAssetPropertyVariant) other);
        return new EqualsBuilder().append(integerValue, rhs.integerValue).append(booleanValue, rhs.booleanValue).append(stringValue, rhs.stringValue).append(doubleValue, rhs.doubleValue).isEquals();
    }

}
