
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
 * DetectorModelIotSiteWise
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EntryId",
    "PropertyAlias",
    "PropertyValue",
    "AssetId",
    "PropertyId"
})
public class DetectorModelIotSiteWise implements Property<DetectorModelIotSiteWise>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-entryid
     * 
     */
    @JsonProperty("EntryId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-entryid")
    private CharSequence entryId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyalias
     * 
     */
    @JsonProperty("PropertyAlias")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyalias")
    private CharSequence propertyAlias;
    /**
     * DetectorModelAssetPropertyValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html
     * 
     */
    @JsonProperty("PropertyValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html")
    private Property<DetectorModelAssetPropertyValue> propertyValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-assetid
     * 
     */
    @JsonProperty("AssetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-assetid")
    private CharSequence assetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyid
     * 
     */
    @JsonProperty("PropertyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyid")
    private CharSequence propertyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-entryid
     * 
     */
    @JsonIgnore
    public CharSequence getEntryId() {
        return entryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-entryid
     * 
     */
    @JsonIgnore
    public void setEntryId(CharSequence entryId) {
        this.entryId = entryId;
    }

    public DetectorModelIotSiteWise withEntryId(CharSequence entryId) {
        this.entryId = entryId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyalias
     * 
     */
    @JsonIgnore
    public CharSequence getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyalias
     * 
     */
    @JsonIgnore
    public void setPropertyAlias(CharSequence propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public DetectorModelIotSiteWise withPropertyAlias(CharSequence propertyAlias) {
        this.propertyAlias = propertyAlias;
        return this;
    }

    /**
     * DetectorModelAssetPropertyValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelAssetPropertyValue> getPropertyValue() {
        return propertyValue;
    }

    /**
     * DetectorModelAssetPropertyValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html
     * 
     */
    @JsonIgnore
    public void setPropertyValue(Property<DetectorModelAssetPropertyValue> propertyValue) {
        this.propertyValue = propertyValue;
    }

    public DetectorModelIotSiteWise withPropertyValue(Property<DetectorModelAssetPropertyValue> propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-assetid
     * 
     */
    @JsonIgnore
    public CharSequence getAssetId() {
        return assetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-assetid
     * 
     */
    @JsonIgnore
    public void setAssetId(CharSequence assetId) {
        this.assetId = assetId;
    }

    public DetectorModelIotSiteWise withAssetId(CharSequence assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyid
     * 
     */
    @JsonIgnore
    public CharSequence getPropertyId() {
        return propertyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyid
     * 
     */
    @JsonIgnore
    public void setPropertyId(CharSequence propertyId) {
        this.propertyId = propertyId;
    }

    public DetectorModelIotSiteWise withPropertyId(CharSequence propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entryId", entryId).append("propertyAlias", propertyAlias).append("propertyValue", propertyValue).append("assetId", assetId).append("propertyId", propertyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(propertyAlias).append(propertyValue).append(propertyId).append(assetId).append(entryId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelIotSiteWise) == false) {
            return false;
        }
        DetectorModelIotSiteWise rhs = ((DetectorModelIotSiteWise) other);
        return new EqualsBuilder().append(propertyAlias, rhs.propertyAlias).append(propertyValue, rhs.propertyValue).append(propertyId, rhs.propertyId).append(assetId, rhs.assetId).append(entryId, rhs.entryId).isEquals();
    }

}
