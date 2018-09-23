
package aws.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeliveryChannel
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ConfigSnapshotDeliveryProperties",
    "Name",
    "S3BucketName",
    "S3KeyPrefix",
    "SnsTopicARN"
})
public class DeliveryChannel {

    /**
     * ConfigSnapshotDeliveryProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html
     * 
     */
    @JsonProperty("ConfigSnapshotDeliveryProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html")
    private ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname")
    private String s3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix")
    private String s3KeyPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn")
    private String snsTopicARN;

    /**
     * ConfigSnapshotDeliveryProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html
     * 
     */
    @JsonProperty("ConfigSnapshotDeliveryProperties")
    public ConfigSnapshotDeliveryProperties getConfigSnapshotDeliveryProperties() {
        return configSnapshotDeliveryProperties;
    }

    /**
     * ConfigSnapshotDeliveryProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html
     * 
     */
    @JsonProperty("ConfigSnapshotDeliveryProperties")
    public void setConfigSnapshotDeliveryProperties(ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties) {
        this.configSnapshotDeliveryProperties = configSnapshotDeliveryProperties;
    }

    public DeliveryChannel withConfigSnapshotDeliveryProperties(ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties) {
        this.configSnapshotDeliveryProperties = configSnapshotDeliveryProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public DeliveryChannel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    public DeliveryChannel withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    public DeliveryChannel withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicARN")
    public String getSnsTopicARN() {
        return snsTopicARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicARN")
    public void setSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
    }

    public DeliveryChannel withSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configSnapshotDeliveryProperties", configSnapshotDeliveryProperties).append("name", name).append("s3BucketName", s3BucketName).append("s3KeyPrefix", s3KeyPrefix).append("snsTopicARN", snsTopicARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(configSnapshotDeliveryProperties).append(s3KeyPrefix).append(snsTopicARN).append(s3BucketName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryChannel) == false) {
            return false;
        }
        DeliveryChannel rhs = ((DeliveryChannel) other);
        return new EqualsBuilder().append(name, rhs.name).append(configSnapshotDeliveryProperties, rhs.configSnapshotDeliveryProperties).append(s3KeyPrefix, rhs.s3KeyPrefix).append(snsTopicARN, rhs.snsTopicARN).append(s3BucketName, rhs.s3BucketName).isEquals();
    }

}