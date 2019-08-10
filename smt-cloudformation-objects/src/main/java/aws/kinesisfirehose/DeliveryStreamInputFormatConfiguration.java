
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
 * DeliveryStreamInputFormatConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Deserializer"
})
public class DeliveryStreamInputFormatConfiguration implements Property<DeliveryStreamInputFormatConfiguration>
{

    /**
     * DeliveryStreamDeserializer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html
     * 
     */
    @JsonProperty("Deserializer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html")
    private Property<DeliveryStreamDeserializer> deserializer;

    /**
     * DeliveryStreamDeserializer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamDeserializer> getDeserializer() {
        return deserializer;
    }

    /**
     * DeliveryStreamDeserializer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html
     * 
     */
    @JsonIgnore
    public void setDeserializer(Property<DeliveryStreamDeserializer> deserializer) {
        this.deserializer = deserializer;
    }

    public DeliveryStreamInputFormatConfiguration withDeserializer(Property<DeliveryStreamDeserializer> deserializer) {
        this.deserializer = deserializer;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deserializer", deserializer).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deserializer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamInputFormatConfiguration) == false) {
            return false;
        }
        DeliveryStreamInputFormatConfiguration rhs = ((DeliveryStreamInputFormatConfiguration) other);
        return new EqualsBuilder().append(deserializer, rhs.deserializer).isEquals();
    }

}
