
package shiver.me.timbers.aws.iot;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TopicRulePutAssetPropertyValueEntry
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AssetId",
    "EntryId",
    "PropertyAlias",
    "PropertyId",
    "PropertyValues"
})
public class TopicRulePutAssetPropertyValueEntry implements Property<TopicRulePutAssetPropertyValueEntry>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-assetid
     * 
     */
    @JsonProperty("AssetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-assetid")
    private CharSequence assetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-entryid
     * 
     */
    @JsonProperty("EntryId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-entryid")
    private CharSequence entryId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyalias
     * 
     */
    @JsonProperty("PropertyAlias")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyalias")
    private CharSequence propertyAlias;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyid
     * 
     */
    @JsonProperty("PropertyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyid")
    private CharSequence propertyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyvalues
     * 
     */
    @JsonProperty("PropertyValues")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyvalues")
    private Set<Property<TopicRuleAssetPropertyValue>> propertyValues = new LinkedHashSet<Property<TopicRuleAssetPropertyValue>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-assetid
     * 
     */
    @JsonIgnore
    public CharSequence getAssetId() {
        return assetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-assetid
     * 
     */
    @JsonIgnore
    public void setAssetId(CharSequence assetId) {
        this.assetId = assetId;
    }

    public TopicRulePutAssetPropertyValueEntry withAssetId(CharSequence assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-entryid
     * 
     */
    @JsonIgnore
    public CharSequence getEntryId() {
        return entryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-entryid
     * 
     */
    @JsonIgnore
    public void setEntryId(CharSequence entryId) {
        this.entryId = entryId;
    }

    public TopicRulePutAssetPropertyValueEntry withEntryId(CharSequence entryId) {
        this.entryId = entryId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyalias
     * 
     */
    @JsonIgnore
    public CharSequence getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyalias
     * 
     */
    @JsonIgnore
    public void setPropertyAlias(CharSequence propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public TopicRulePutAssetPropertyValueEntry withPropertyAlias(CharSequence propertyAlias) {
        this.propertyAlias = propertyAlias;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyid
     * 
     */
    @JsonIgnore
    public CharSequence getPropertyId() {
        return propertyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyid
     * 
     */
    @JsonIgnore
    public void setPropertyId(CharSequence propertyId) {
        this.propertyId = propertyId;
    }

    public TopicRulePutAssetPropertyValueEntry withPropertyId(CharSequence propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyvalues
     * 
     */
    @JsonIgnore
    public Set<Property<TopicRuleAssetPropertyValue>> getPropertyValues() {
        return propertyValues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyvalues
     * 
     */
    @JsonIgnore
    public void setPropertyValues(Set<Property<TopicRuleAssetPropertyValue>> propertyValues) {
        this.propertyValues = propertyValues;
    }

    public TopicRulePutAssetPropertyValueEntry withPropertyValues(Set<Property<TopicRuleAssetPropertyValue>> propertyValues) {
        this.propertyValues = propertyValues;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("assetId", assetId).append("entryId", entryId).append("propertyAlias", propertyAlias).append("propertyId", propertyId).append("propertyValues", propertyValues).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(propertyAlias).append(propertyValues).append(propertyId).append(assetId).append(entryId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRulePutAssetPropertyValueEntry) == false) {
            return false;
        }
        TopicRulePutAssetPropertyValueEntry rhs = ((TopicRulePutAssetPropertyValueEntry) other);
        return new EqualsBuilder().append(propertyAlias, rhs.propertyAlias).append(propertyValues, rhs.propertyValues).append(propertyId, rhs.propertyId).append(assetId, rhs.assetId).append(entryId, rhs.entryId).isEquals();
    }

}
