
package aws.kinesisfirehose;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeliveryStreamOrcSerDe
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockSizeBytes",
    "BloomFilterColumns",
    "BloomFilterFalsePositiveProbability",
    "Compression",
    "DictionaryKeyThreshold",
    "EnablePadding",
    "FormatVersion",
    "PaddingTolerance",
    "RowIndexStride",
    "StripeSizeBytes"
})
public class DeliveryStreamOrcSerDe implements Property<DeliveryStreamOrcSerDe>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-blocksizebytes
     * 
     */
    @JsonProperty("BlockSizeBytes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-blocksizebytes")
    private Number blockSizeBytes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfiltercolumns
     * 
     */
    @JsonProperty("BloomFilterColumns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfiltercolumns")
    private Set<CharSequence> bloomFilterColumns = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfilterfalsepositiveprobability
     * 
     */
    @JsonProperty("BloomFilterFalsePositiveProbability")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfilterfalsepositiveprobability")
    private Number bloomFilterFalsePositiveProbability;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-compression
     * 
     */
    @JsonProperty("Compression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-compression")
    private CharSequence compression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-dictionarykeythreshold
     * 
     */
    @JsonProperty("DictionaryKeyThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-dictionarykeythreshold")
    private Number dictionaryKeyThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-enablepadding
     * 
     */
    @JsonProperty("EnablePadding")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-enablepadding")
    private CharSequence enablePadding;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-formatversion
     * 
     */
    @JsonProperty("FormatVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-formatversion")
    private CharSequence formatVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-paddingtolerance
     * 
     */
    @JsonProperty("PaddingTolerance")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-paddingtolerance")
    private Number paddingTolerance;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-rowindexstride
     * 
     */
    @JsonProperty("RowIndexStride")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-rowindexstride")
    private Number rowIndexStride;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-stripesizebytes
     * 
     */
    @JsonProperty("StripeSizeBytes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-stripesizebytes")
    private Number stripeSizeBytes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-blocksizebytes
     * 
     */
    @JsonIgnore
    public Number getBlockSizeBytes() {
        return blockSizeBytes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-blocksizebytes
     * 
     */
    @JsonIgnore
    public void setBlockSizeBytes(Number blockSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
    }

    public DeliveryStreamOrcSerDe withBlockSizeBytes(Number blockSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfiltercolumns
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getBloomFilterColumns() {
        return bloomFilterColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfiltercolumns
     * 
     */
    @JsonIgnore
    public void setBloomFilterColumns(Set<CharSequence> bloomFilterColumns) {
        this.bloomFilterColumns = bloomFilterColumns;
    }

    public DeliveryStreamOrcSerDe withBloomFilterColumns(Set<CharSequence> bloomFilterColumns) {
        this.bloomFilterColumns = bloomFilterColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfilterfalsepositiveprobability
     * 
     */
    @JsonIgnore
    public Number getBloomFilterFalsePositiveProbability() {
        return bloomFilterFalsePositiveProbability;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-bloomfilterfalsepositiveprobability
     * 
     */
    @JsonIgnore
    public void setBloomFilterFalsePositiveProbability(Number bloomFilterFalsePositiveProbability) {
        this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
    }

    public DeliveryStreamOrcSerDe withBloomFilterFalsePositiveProbability(Number bloomFilterFalsePositiveProbability) {
        this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-compression
     * 
     */
    @JsonIgnore
    public CharSequence getCompression() {
        return compression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-compression
     * 
     */
    @JsonIgnore
    public void setCompression(CharSequence compression) {
        this.compression = compression;
    }

    public DeliveryStreamOrcSerDe withCompression(CharSequence compression) {
        this.compression = compression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-dictionarykeythreshold
     * 
     */
    @JsonIgnore
    public Number getDictionaryKeyThreshold() {
        return dictionaryKeyThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-dictionarykeythreshold
     * 
     */
    @JsonIgnore
    public void setDictionaryKeyThreshold(Number dictionaryKeyThreshold) {
        this.dictionaryKeyThreshold = dictionaryKeyThreshold;
    }

    public DeliveryStreamOrcSerDe withDictionaryKeyThreshold(Number dictionaryKeyThreshold) {
        this.dictionaryKeyThreshold = dictionaryKeyThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-enablepadding
     * 
     */
    @JsonIgnore
    public CharSequence getEnablePadding() {
        return enablePadding;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-enablepadding
     * 
     */
    @JsonIgnore
    public void setEnablePadding(CharSequence enablePadding) {
        this.enablePadding = enablePadding;
    }

    public DeliveryStreamOrcSerDe withEnablePadding(CharSequence enablePadding) {
        this.enablePadding = enablePadding;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-formatversion
     * 
     */
    @JsonIgnore
    public CharSequence getFormatVersion() {
        return formatVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-formatversion
     * 
     */
    @JsonIgnore
    public void setFormatVersion(CharSequence formatVersion) {
        this.formatVersion = formatVersion;
    }

    public DeliveryStreamOrcSerDe withFormatVersion(CharSequence formatVersion) {
        this.formatVersion = formatVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-paddingtolerance
     * 
     */
    @JsonIgnore
    public Number getPaddingTolerance() {
        return paddingTolerance;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-paddingtolerance
     * 
     */
    @JsonIgnore
    public void setPaddingTolerance(Number paddingTolerance) {
        this.paddingTolerance = paddingTolerance;
    }

    public DeliveryStreamOrcSerDe withPaddingTolerance(Number paddingTolerance) {
        this.paddingTolerance = paddingTolerance;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-rowindexstride
     * 
     */
    @JsonIgnore
    public Number getRowIndexStride() {
        return rowIndexStride;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-rowindexstride
     * 
     */
    @JsonIgnore
    public void setRowIndexStride(Number rowIndexStride) {
        this.rowIndexStride = rowIndexStride;
    }

    public DeliveryStreamOrcSerDe withRowIndexStride(Number rowIndexStride) {
        this.rowIndexStride = rowIndexStride;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-stripesizebytes
     * 
     */
    @JsonIgnore
    public Number getStripeSizeBytes() {
        return stripeSizeBytes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html#cfn-kinesisfirehose-deliverystream-orcserde-stripesizebytes
     * 
     */
    @JsonIgnore
    public void setStripeSizeBytes(Number stripeSizeBytes) {
        this.stripeSizeBytes = stripeSizeBytes;
    }

    public DeliveryStreamOrcSerDe withStripeSizeBytes(Number stripeSizeBytes) {
        this.stripeSizeBytes = stripeSizeBytes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockSizeBytes", blockSizeBytes).append("bloomFilterColumns", bloomFilterColumns).append("bloomFilterFalsePositiveProbability", bloomFilterFalsePositiveProbability).append("compression", compression).append("dictionaryKeyThreshold", dictionaryKeyThreshold).append("enablePadding", enablePadding).append("formatVersion", formatVersion).append("paddingTolerance", paddingTolerance).append("rowIndexStride", rowIndexStride).append("stripeSizeBytes", stripeSizeBytes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dictionaryKeyThreshold).append(blockSizeBytes).append(bloomFilterColumns).append(enablePadding).append(rowIndexStride).append(paddingTolerance).append(stripeSizeBytes).append(compression).append(formatVersion).append(bloomFilterFalsePositiveProbability).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamOrcSerDe) == false) {
            return false;
        }
        DeliveryStreamOrcSerDe rhs = ((DeliveryStreamOrcSerDe) other);
        return new EqualsBuilder().append(dictionaryKeyThreshold, rhs.dictionaryKeyThreshold).append(blockSizeBytes, rhs.blockSizeBytes).append(bloomFilterColumns, rhs.bloomFilterColumns).append(enablePadding, rhs.enablePadding).append(rowIndexStride, rhs.rowIndexStride).append(paddingTolerance, rhs.paddingTolerance).append(stripeSizeBytes, rhs.stripeSizeBytes).append(compression, rhs.compression).append(formatVersion, rhs.formatVersion).append(bloomFilterFalsePositiveProbability, rhs.bloomFilterFalsePositiveProbability).isEquals();
    }

}
