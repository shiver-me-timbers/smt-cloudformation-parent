
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
 * DeliveryStreamDataFormatConversionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Enabled",
    "InputFormatConfiguration",
    "OutputFormatConfiguration",
    "SchemaConfiguration"
})
public class DeliveryStreamDataFormatConversionConfiguration implements Property<DeliveryStreamDataFormatConversionConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-enabled")
    private CharSequence enabled;
    /**
     * DeliveryStreamInputFormatConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html
     * 
     */
    @JsonProperty("InputFormatConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html")
    private Property<DeliveryStreamInputFormatConfiguration> inputFormatConfiguration;
    /**
     * DeliveryStreamOutputFormatConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html
     * 
     */
    @JsonProperty("OutputFormatConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html")
    private Property<DeliveryStreamOutputFormatConfiguration> outputFormatConfiguration;
    /**
     * DeliveryStreamSchemaConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html
     * 
     */
    @JsonProperty("SchemaConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html")
    private Property<DeliveryStreamSchemaConfiguration> schemaConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html#cfn-kinesisfirehose-deliverystream-dataformatconversionconfiguration-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public DeliveryStreamDataFormatConversionConfiguration withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * DeliveryStreamInputFormatConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamInputFormatConfiguration> getInputFormatConfiguration() {
        return inputFormatConfiguration;
    }

    /**
     * DeliveryStreamInputFormatConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html
     * 
     */
    @JsonIgnore
    public void setInputFormatConfiguration(Property<DeliveryStreamInputFormatConfiguration> inputFormatConfiguration) {
        this.inputFormatConfiguration = inputFormatConfiguration;
    }

    public DeliveryStreamDataFormatConversionConfiguration withInputFormatConfiguration(Property<DeliveryStreamInputFormatConfiguration> inputFormatConfiguration) {
        this.inputFormatConfiguration = inputFormatConfiguration;
        return this;
    }

    /**
     * DeliveryStreamOutputFormatConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamOutputFormatConfiguration> getOutputFormatConfiguration() {
        return outputFormatConfiguration;
    }

    /**
     * DeliveryStreamOutputFormatConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html
     * 
     */
    @JsonIgnore
    public void setOutputFormatConfiguration(Property<DeliveryStreamOutputFormatConfiguration> outputFormatConfiguration) {
        this.outputFormatConfiguration = outputFormatConfiguration;
    }

    public DeliveryStreamDataFormatConversionConfiguration withOutputFormatConfiguration(Property<DeliveryStreamOutputFormatConfiguration> outputFormatConfiguration) {
        this.outputFormatConfiguration = outputFormatConfiguration;
        return this;
    }

    /**
     * DeliveryStreamSchemaConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamSchemaConfiguration> getSchemaConfiguration() {
        return schemaConfiguration;
    }

    /**
     * DeliveryStreamSchemaConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSchemaConfiguration(Property<DeliveryStreamSchemaConfiguration> schemaConfiguration) {
        this.schemaConfiguration = schemaConfiguration;
    }

    public DeliveryStreamDataFormatConversionConfiguration withSchemaConfiguration(Property<DeliveryStreamSchemaConfiguration> schemaConfiguration) {
        this.schemaConfiguration = schemaConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("inputFormatConfiguration", inputFormatConfiguration).append("outputFormatConfiguration", outputFormatConfiguration).append("schemaConfiguration", schemaConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputFormatConfiguration).append(outputFormatConfiguration).append(enabled).append(schemaConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamDataFormatConversionConfiguration) == false) {
            return false;
        }
        DeliveryStreamDataFormatConversionConfiguration rhs = ((DeliveryStreamDataFormatConversionConfiguration) other);
        return new EqualsBuilder().append(inputFormatConfiguration, rhs.inputFormatConfiguration).append(outputFormatConfiguration, rhs.outputFormatConfiguration).append(enabled, rhs.enabled).append(schemaConfiguration, rhs.schemaConfiguration).isEquals();
    }

}
