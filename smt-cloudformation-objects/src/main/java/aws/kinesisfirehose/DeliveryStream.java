
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeliveryStream
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeliveryStreamName",
    "DeliveryStreamType",
    "ElasticsearchDestinationConfiguration",
    "ExtendedS3DestinationConfiguration",
    "KinesisStreamSourceConfiguration",
    "RedshiftDestinationConfiguration",
    "S3DestinationConfiguration",
    "SplunkDestinationConfiguration"
})
public class DeliveryStream {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname
     * 
     */
    @JsonProperty("DeliveryStreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname")
    private CharSequence deliveryStreamName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype
     * 
     */
    @JsonProperty("DeliveryStreamType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype")
    private CharSequence deliveryStreamType;
    /**
     * ElasticsearchDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
     * 
     */
    @JsonProperty("ElasticsearchDestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html")
    private ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration;
    /**
     * ExtendedS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
     * 
     */
    @JsonProperty("ExtendedS3DestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html")
    private ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration;
    /**
     * KinesisStreamSourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
     * 
     */
    @JsonProperty("KinesisStreamSourceConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html")
    private KinesisStreamSourceConfiguration kinesisStreamSourceConfiguration;
    /**
     * RedshiftDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
     * 
     */
    @JsonProperty("RedshiftDestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html")
    private RedshiftDestinationConfiguration redshiftDestinationConfiguration;
    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3DestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private S3DestinationConfiguration s3DestinationConfiguration;
    /**
     * SplunkDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html
     * 
     */
    @JsonProperty("SplunkDestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html")
    private SplunkDestinationConfiguration splunkDestinationConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname
     * 
     */
    public CharSequence getDeliveryStreamName() {
        return deliveryStreamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname
     * 
     */
    public void setDeliveryStreamName(CharSequence deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    public DeliveryStream withDeliveryStreamName(CharSequence deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype
     * 
     */
    public CharSequence getDeliveryStreamType() {
        return deliveryStreamType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype
     * 
     */
    public void setDeliveryStreamType(CharSequence deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType;
    }

    public DeliveryStream withDeliveryStreamType(CharSequence deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType;
        return this;
    }

    /**
     * ElasticsearchDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
     * 
     */
    public ElasticsearchDestinationConfiguration getElasticsearchDestinationConfiguration() {
        return elasticsearchDestinationConfiguration;
    }

    /**
     * ElasticsearchDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
     * 
     */
    public void setElasticsearchDestinationConfiguration(ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration) {
        this.elasticsearchDestinationConfiguration = elasticsearchDestinationConfiguration;
    }

    public DeliveryStream withElasticsearchDestinationConfiguration(ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration) {
        this.elasticsearchDestinationConfiguration = elasticsearchDestinationConfiguration;
        return this;
    }

    /**
     * ExtendedS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
     * 
     */
    public ExtendedS3DestinationConfiguration getExtendedS3DestinationConfiguration() {
        return extendedS3DestinationConfiguration;
    }

    /**
     * ExtendedS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
     * 
     */
    public void setExtendedS3DestinationConfiguration(ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration) {
        this.extendedS3DestinationConfiguration = extendedS3DestinationConfiguration;
    }

    public DeliveryStream withExtendedS3DestinationConfiguration(ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration) {
        this.extendedS3DestinationConfiguration = extendedS3DestinationConfiguration;
        return this;
    }

    /**
     * KinesisStreamSourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
     * 
     */
    public KinesisStreamSourceConfiguration getKinesisStreamSourceConfiguration() {
        return kinesisStreamSourceConfiguration;
    }

    /**
     * KinesisStreamSourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
     * 
     */
    public void setKinesisStreamSourceConfiguration(KinesisStreamSourceConfiguration kinesisStreamSourceConfiguration) {
        this.kinesisStreamSourceConfiguration = kinesisStreamSourceConfiguration;
    }

    public DeliveryStream withKinesisStreamSourceConfiguration(KinesisStreamSourceConfiguration kinesisStreamSourceConfiguration) {
        this.kinesisStreamSourceConfiguration = kinesisStreamSourceConfiguration;
        return this;
    }

    /**
     * RedshiftDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
     * 
     */
    public RedshiftDestinationConfiguration getRedshiftDestinationConfiguration() {
        return redshiftDestinationConfiguration;
    }

    /**
     * RedshiftDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
     * 
     */
    public void setRedshiftDestinationConfiguration(RedshiftDestinationConfiguration redshiftDestinationConfiguration) {
        this.redshiftDestinationConfiguration = redshiftDestinationConfiguration;
    }

    public DeliveryStream withRedshiftDestinationConfiguration(RedshiftDestinationConfiguration redshiftDestinationConfiguration) {
        this.redshiftDestinationConfiguration = redshiftDestinationConfiguration;
        return this;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    public S3DestinationConfiguration getS3DestinationConfiguration() {
        return s3DestinationConfiguration;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    public void setS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    public DeliveryStream withS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
        return this;
    }

    /**
     * SplunkDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html
     * 
     */
    public SplunkDestinationConfiguration getSplunkDestinationConfiguration() {
        return splunkDestinationConfiguration;
    }

    /**
     * SplunkDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html
     * 
     */
    public void setSplunkDestinationConfiguration(SplunkDestinationConfiguration splunkDestinationConfiguration) {
        this.splunkDestinationConfiguration = splunkDestinationConfiguration;
    }

    public DeliveryStream withSplunkDestinationConfiguration(SplunkDestinationConfiguration splunkDestinationConfiguration) {
        this.splunkDestinationConfiguration = splunkDestinationConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliveryStreamName", deliveryStreamName).append("deliveryStreamType", deliveryStreamType).append("elasticsearchDestinationConfiguration", elasticsearchDestinationConfiguration).append("extendedS3DestinationConfiguration", extendedS3DestinationConfiguration).append("kinesisStreamSourceConfiguration", kinesisStreamSourceConfiguration).append("redshiftDestinationConfiguration", redshiftDestinationConfiguration).append("s3DestinationConfiguration", s3DestinationConfiguration).append("splunkDestinationConfiguration", splunkDestinationConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(redshiftDestinationConfiguration).append(s3DestinationConfiguration).append(extendedS3DestinationConfiguration).append(elasticsearchDestinationConfiguration).append(splunkDestinationConfiguration).append(kinesisStreamSourceConfiguration).append(deliveryStreamType).append(deliveryStreamName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStream) == false) {
            return false;
        }
        DeliveryStream rhs = ((DeliveryStream) other);
        return new EqualsBuilder().append(redshiftDestinationConfiguration, rhs.redshiftDestinationConfiguration).append(s3DestinationConfiguration, rhs.s3DestinationConfiguration).append(extendedS3DestinationConfiguration, rhs.extendedS3DestinationConfiguration).append(elasticsearchDestinationConfiguration, rhs.elasticsearchDestinationConfiguration).append(splunkDestinationConfiguration, rhs.splunkDestinationConfiguration).append(kinesisStreamSourceConfiguration, rhs.kinesisStreamSourceConfiguration).append(deliveryStreamType, rhs.deliveryStreamType).append(deliveryStreamName, rhs.deliveryStreamName).isEquals();
    }

}
