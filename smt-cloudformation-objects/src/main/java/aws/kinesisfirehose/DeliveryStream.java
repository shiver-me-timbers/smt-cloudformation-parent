
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
 * DeliveryStream
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
     * DeliveryStreamElasticsearchDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
     * 
     */
    @JsonProperty("ElasticsearchDestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html")
    private Property<DeliveryStreamElasticsearchDestinationConfiguration> elasticsearchDestinationConfiguration;
    /**
     * DeliveryStreamExtendedS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
     * 
     */
    @JsonProperty("ExtendedS3DestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html")
    private Property<DeliveryStreamExtendedS3DestinationConfiguration> extendedS3DestinationConfiguration;
    /**
     * DeliveryStreamKinesisStreamSourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
     * 
     */
    @JsonProperty("KinesisStreamSourceConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html")
    private Property<DeliveryStreamKinesisStreamSourceConfiguration> kinesisStreamSourceConfiguration;
    /**
     * DeliveryStreamRedshiftDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
     * 
     */
    @JsonProperty("RedshiftDestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html")
    private Property<DeliveryStreamRedshiftDestinationConfiguration> redshiftDestinationConfiguration;
    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3DestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private Property<DeliveryStreamS3DestinationConfiguration> s3DestinationConfiguration;
    /**
     * DeliveryStreamSplunkDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html
     * 
     */
    @JsonProperty("SplunkDestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html")
    private Property<DeliveryStreamSplunkDestinationConfiguration> splunkDestinationConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryStreamName() {
        return deliveryStreamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDeliveryStreamType() {
        return deliveryStreamType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype
     * 
     */
    @JsonIgnore
    public void setDeliveryStreamType(CharSequence deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType;
    }

    public DeliveryStream withDeliveryStreamType(CharSequence deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType;
        return this;
    }

    /**
     * DeliveryStreamElasticsearchDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamElasticsearchDestinationConfiguration> getElasticsearchDestinationConfiguration() {
        return elasticsearchDestinationConfiguration;
    }

    /**
     * DeliveryStreamElasticsearchDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setElasticsearchDestinationConfiguration(Property<DeliveryStreamElasticsearchDestinationConfiguration> elasticsearchDestinationConfiguration) {
        this.elasticsearchDestinationConfiguration = elasticsearchDestinationConfiguration;
    }

    public DeliveryStream withElasticsearchDestinationConfiguration(Property<DeliveryStreamElasticsearchDestinationConfiguration> elasticsearchDestinationConfiguration) {
        this.elasticsearchDestinationConfiguration = elasticsearchDestinationConfiguration;
        return this;
    }

    /**
     * DeliveryStreamExtendedS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamExtendedS3DestinationConfiguration> getExtendedS3DestinationConfiguration() {
        return extendedS3DestinationConfiguration;
    }

    /**
     * DeliveryStreamExtendedS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setExtendedS3DestinationConfiguration(Property<DeliveryStreamExtendedS3DestinationConfiguration> extendedS3DestinationConfiguration) {
        this.extendedS3DestinationConfiguration = extendedS3DestinationConfiguration;
    }

    public DeliveryStream withExtendedS3DestinationConfiguration(Property<DeliveryStreamExtendedS3DestinationConfiguration> extendedS3DestinationConfiguration) {
        this.extendedS3DestinationConfiguration = extendedS3DestinationConfiguration;
        return this;
    }

    /**
     * DeliveryStreamKinesisStreamSourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamKinesisStreamSourceConfiguration> getKinesisStreamSourceConfiguration() {
        return kinesisStreamSourceConfiguration;
    }

    /**
     * DeliveryStreamKinesisStreamSourceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
     * 
     */
    @JsonIgnore
    public void setKinesisStreamSourceConfiguration(Property<DeliveryStreamKinesisStreamSourceConfiguration> kinesisStreamSourceConfiguration) {
        this.kinesisStreamSourceConfiguration = kinesisStreamSourceConfiguration;
    }

    public DeliveryStream withKinesisStreamSourceConfiguration(Property<DeliveryStreamKinesisStreamSourceConfiguration> kinesisStreamSourceConfiguration) {
        this.kinesisStreamSourceConfiguration = kinesisStreamSourceConfiguration;
        return this;
    }

    /**
     * DeliveryStreamRedshiftDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamRedshiftDestinationConfiguration> getRedshiftDestinationConfiguration() {
        return redshiftDestinationConfiguration;
    }

    /**
     * DeliveryStreamRedshiftDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setRedshiftDestinationConfiguration(Property<DeliveryStreamRedshiftDestinationConfiguration> redshiftDestinationConfiguration) {
        this.redshiftDestinationConfiguration = redshiftDestinationConfiguration;
    }

    public DeliveryStream withRedshiftDestinationConfiguration(Property<DeliveryStreamRedshiftDestinationConfiguration> redshiftDestinationConfiguration) {
        this.redshiftDestinationConfiguration = redshiftDestinationConfiguration;
        return this;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamS3DestinationConfiguration> getS3DestinationConfiguration() {
        return s3DestinationConfiguration;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setS3DestinationConfiguration(Property<DeliveryStreamS3DestinationConfiguration> s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    public DeliveryStream withS3DestinationConfiguration(Property<DeliveryStreamS3DestinationConfiguration> s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
        return this;
    }

    /**
     * DeliveryStreamSplunkDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamSplunkDestinationConfiguration> getSplunkDestinationConfiguration() {
        return splunkDestinationConfiguration;
    }

    /**
     * DeliveryStreamSplunkDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSplunkDestinationConfiguration(Property<DeliveryStreamSplunkDestinationConfiguration> splunkDestinationConfiguration) {
        this.splunkDestinationConfiguration = splunkDestinationConfiguration;
    }

    public DeliveryStream withSplunkDestinationConfiguration(Property<DeliveryStreamSplunkDestinationConfiguration> splunkDestinationConfiguration) {
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
