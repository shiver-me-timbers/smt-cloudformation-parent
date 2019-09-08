
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
 * DeliveryStreamDeserializer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HiveJsonSerDe",
    "OpenXJsonSerDe"
})
public class DeliveryStreamDeserializer implements Property<DeliveryStreamDeserializer>
{

    /**
     * DeliveryStreamHiveJsonSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html
     * 
     */
    @JsonProperty("HiveJsonSerDe")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html")
    private Property<DeliveryStreamHiveJsonSerDe> hiveJsonSerDe;
    /**
     * DeliveryStreamOpenXJsonSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html
     * 
     */
    @JsonProperty("OpenXJsonSerDe")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html")
    private Property<DeliveryStreamOpenXJsonSerDe> openXJsonSerDe;

    /**
     * DeliveryStreamHiveJsonSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamHiveJsonSerDe> getHiveJsonSerDe() {
        return hiveJsonSerDe;
    }

    /**
     * DeliveryStreamHiveJsonSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html
     * 
     */
    @JsonIgnore
    public void setHiveJsonSerDe(Property<DeliveryStreamHiveJsonSerDe> hiveJsonSerDe) {
        this.hiveJsonSerDe = hiveJsonSerDe;
    }

    public DeliveryStreamDeserializer withHiveJsonSerDe(Property<DeliveryStreamHiveJsonSerDe> hiveJsonSerDe) {
        this.hiveJsonSerDe = hiveJsonSerDe;
        return this;
    }

    /**
     * DeliveryStreamOpenXJsonSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamOpenXJsonSerDe> getOpenXJsonSerDe() {
        return openXJsonSerDe;
    }

    /**
     * DeliveryStreamOpenXJsonSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html
     * 
     */
    @JsonIgnore
    public void setOpenXJsonSerDe(Property<DeliveryStreamOpenXJsonSerDe> openXJsonSerDe) {
        this.openXJsonSerDe = openXJsonSerDe;
    }

    public DeliveryStreamDeserializer withOpenXJsonSerDe(Property<DeliveryStreamOpenXJsonSerDe> openXJsonSerDe) {
        this.openXJsonSerDe = openXJsonSerDe;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hiveJsonSerDe", hiveJsonSerDe).append("openXJsonSerDe", openXJsonSerDe).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hiveJsonSerDe).append(openXJsonSerDe).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamDeserializer) == false) {
            return false;
        }
        DeliveryStreamDeserializer rhs = ((DeliveryStreamDeserializer) other);
        return new EqualsBuilder().append(hiveJsonSerDe, rhs.hiveJsonSerDe).append(openXJsonSerDe, rhs.openXJsonSerDe).isEquals();
    }

}
