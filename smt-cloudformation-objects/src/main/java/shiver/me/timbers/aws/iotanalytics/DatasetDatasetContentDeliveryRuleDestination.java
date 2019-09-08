
package shiver.me.timbers.aws.iotanalytics;

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
 * DatasetDatasetContentDeliveryRuleDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IotEventsDestinationConfiguration",
    "S3DestinationConfiguration"
})
public class DatasetDatasetContentDeliveryRuleDestination implements Property<DatasetDatasetContentDeliveryRuleDestination>
{

    /**
     * DatasetIotEventsDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html
     * 
     */
    @JsonProperty("IotEventsDestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html")
    private Property<DatasetIotEventsDestinationConfiguration> iotEventsDestinationConfiguration;
    /**
     * DatasetS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3DestinationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html")
    private Property<DatasetS3DestinationConfiguration> s3DestinationConfiguration;

    /**
     * DatasetIotEventsDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DatasetIotEventsDestinationConfiguration> getIotEventsDestinationConfiguration() {
        return iotEventsDestinationConfiguration;
    }

    /**
     * DatasetIotEventsDestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setIotEventsDestinationConfiguration(Property<DatasetIotEventsDestinationConfiguration> iotEventsDestinationConfiguration) {
        this.iotEventsDestinationConfiguration = iotEventsDestinationConfiguration;
    }

    public DatasetDatasetContentDeliveryRuleDestination withIotEventsDestinationConfiguration(Property<DatasetIotEventsDestinationConfiguration> iotEventsDestinationConfiguration) {
        this.iotEventsDestinationConfiguration = iotEventsDestinationConfiguration;
        return this;
    }

    /**
     * DatasetS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DatasetS3DestinationConfiguration> getS3DestinationConfiguration() {
        return s3DestinationConfiguration;
    }

    /**
     * DatasetS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setS3DestinationConfiguration(Property<DatasetS3DestinationConfiguration> s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    public DatasetDatasetContentDeliveryRuleDestination withS3DestinationConfiguration(Property<DatasetS3DestinationConfiguration> s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iotEventsDestinationConfiguration", iotEventsDestinationConfiguration).append("s3DestinationConfiguration", s3DestinationConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iotEventsDestinationConfiguration).append(s3DestinationConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatasetDatasetContentDeliveryRuleDestination) == false) {
            return false;
        }
        DatasetDatasetContentDeliveryRuleDestination rhs = ((DatasetDatasetContentDeliveryRuleDestination) other);
        return new EqualsBuilder().append(iotEventsDestinationConfiguration, rhs.iotEventsDestinationConfiguration).append(s3DestinationConfiguration, rhs.s3DestinationConfiguration).isEquals();
    }

}
