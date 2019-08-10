
package aws.kinesisfirehose;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeliveryStreamParquetSerDe
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockSizeBytes",
    "Compression",
    "EnableDictionaryCompression",
    "MaxPaddingBytes",
    "PageSizeBytes",
    "WriterVersion"
})
public class DeliveryStreamParquetSerDe implements Property<DeliveryStreamParquetSerDe>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-blocksizebytes
     * 
     */
    @JsonProperty("BlockSizeBytes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-blocksizebytes")
    private Number blockSizeBytes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-compression
     * 
     */
    @JsonProperty("Compression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-compression")
    private CharSequence compression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-enabledictionarycompression
     * 
     */
    @JsonProperty("EnableDictionaryCompression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-enabledictionarycompression")
    private CharSequence enableDictionaryCompression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-maxpaddingbytes
     * 
     */
    @JsonProperty("MaxPaddingBytes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-maxpaddingbytes")
    private Number maxPaddingBytes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-pagesizebytes
     * 
     */
    @JsonProperty("PageSizeBytes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-pagesizebytes")
    private Number pageSizeBytes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-writerversion
     * 
     */
    @JsonProperty("WriterVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-writerversion")
    private CharSequence writerVersion;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-blocksizebytes
     * 
     */
    @JsonIgnore
    public Number getBlockSizeBytes() {
        return blockSizeBytes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-blocksizebytes
     * 
     */
    @JsonIgnore
    public void setBlockSizeBytes(Number blockSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
    }

    public DeliveryStreamParquetSerDe withBlockSizeBytes(Number blockSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-compression
     * 
     */
    @JsonIgnore
    public CharSequence getCompression() {
        return compression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-compression
     * 
     */
    @JsonIgnore
    public void setCompression(CharSequence compression) {
        this.compression = compression;
    }

    public DeliveryStreamParquetSerDe withCompression(CharSequence compression) {
        this.compression = compression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-enabledictionarycompression
     * 
     */
    @JsonIgnore
    public CharSequence getEnableDictionaryCompression() {
        return enableDictionaryCompression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-enabledictionarycompression
     * 
     */
    @JsonIgnore
    public void setEnableDictionaryCompression(CharSequence enableDictionaryCompression) {
        this.enableDictionaryCompression = enableDictionaryCompression;
    }

    public DeliveryStreamParquetSerDe withEnableDictionaryCompression(CharSequence enableDictionaryCompression) {
        this.enableDictionaryCompression = enableDictionaryCompression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-maxpaddingbytes
     * 
     */
    @JsonIgnore
    public Number getMaxPaddingBytes() {
        return maxPaddingBytes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-maxpaddingbytes
     * 
     */
    @JsonIgnore
    public void setMaxPaddingBytes(Number maxPaddingBytes) {
        this.maxPaddingBytes = maxPaddingBytes;
    }

    public DeliveryStreamParquetSerDe withMaxPaddingBytes(Number maxPaddingBytes) {
        this.maxPaddingBytes = maxPaddingBytes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-pagesizebytes
     * 
     */
    @JsonIgnore
    public Number getPageSizeBytes() {
        return pageSizeBytes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-pagesizebytes
     * 
     */
    @JsonIgnore
    public void setPageSizeBytes(Number pageSizeBytes) {
        this.pageSizeBytes = pageSizeBytes;
    }

    public DeliveryStreamParquetSerDe withPageSizeBytes(Number pageSizeBytes) {
        this.pageSizeBytes = pageSizeBytes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-writerversion
     * 
     */
    @JsonIgnore
    public CharSequence getWriterVersion() {
        return writerVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html#cfn-kinesisfirehose-deliverystream-parquetserde-writerversion
     * 
     */
    @JsonIgnore
    public void setWriterVersion(CharSequence writerVersion) {
        this.writerVersion = writerVersion;
    }

    public DeliveryStreamParquetSerDe withWriterVersion(CharSequence writerVersion) {
        this.writerVersion = writerVersion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockSizeBytes", blockSizeBytes).append("compression", compression).append("enableDictionaryCompression", enableDictionaryCompression).append("maxPaddingBytes", maxPaddingBytes).append("pageSizeBytes", pageSizeBytes).append("writerVersion", writerVersion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxPaddingBytes).append(blockSizeBytes).append(compression).append(pageSizeBytes).append(enableDictionaryCompression).append(writerVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamParquetSerDe) == false) {
            return false;
        }
        DeliveryStreamParquetSerDe rhs = ((DeliveryStreamParquetSerDe) other);
        return new EqualsBuilder().append(maxPaddingBytes, rhs.maxPaddingBytes).append(blockSizeBytes, rhs.blockSizeBytes).append(compression, rhs.compression).append(pageSizeBytes, rhs.pageSizeBytes).append(enableDictionaryCompression, rhs.enableDictionaryCompression).append(writerVersion, rhs.writerVersion).isEquals();
    }

}
