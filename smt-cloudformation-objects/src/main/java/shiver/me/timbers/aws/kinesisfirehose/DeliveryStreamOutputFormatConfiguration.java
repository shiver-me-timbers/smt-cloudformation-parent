
package shiver.me.timbers.aws.kinesisfirehose;

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
 * DeliveryStreamOutputFormatConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Serializer"
})
public class DeliveryStreamOutputFormatConfiguration implements Property<DeliveryStreamOutputFormatConfiguration>
{

    /**
     * DeliveryStreamSerializer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html
     * 
     */
    @JsonProperty("Serializer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html")
    private Property<DeliveryStreamSerializer> serializer;

    /**
     * DeliveryStreamSerializer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamSerializer> getSerializer() {
        return serializer;
    }

    /**
     * DeliveryStreamSerializer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html
     * 
     */
    @JsonIgnore
    public void setSerializer(Property<DeliveryStreamSerializer> serializer) {
        this.serializer = serializer;
    }

    public DeliveryStreamOutputFormatConfiguration withSerializer(Property<DeliveryStreamSerializer> serializer) {
        this.serializer = serializer;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serializer", serializer).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serializer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamOutputFormatConfiguration) == false) {
            return false;
        }
        DeliveryStreamOutputFormatConfiguration rhs = ((DeliveryStreamOutputFormatConfiguration) other);
        return new EqualsBuilder().append(serializer, rhs.serializer).isEquals();
    }

}
