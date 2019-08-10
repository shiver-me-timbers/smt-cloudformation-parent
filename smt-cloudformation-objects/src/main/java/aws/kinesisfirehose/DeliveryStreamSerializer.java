
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
 * DeliveryStreamSerializer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OrcSerDe",
    "ParquetSerDe"
})
public class DeliveryStreamSerializer implements Property<DeliveryStreamSerializer>
{

    /**
     * DeliveryStreamOrcSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html
     * 
     */
    @JsonProperty("OrcSerDe")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html")
    private Property<DeliveryStreamOrcSerDe> orcSerDe;
    /**
     * DeliveryStreamParquetSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html
     * 
     */
    @JsonProperty("ParquetSerDe")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html")
    private Property<DeliveryStreamParquetSerDe> parquetSerDe;

    /**
     * DeliveryStreamOrcSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamOrcSerDe> getOrcSerDe() {
        return orcSerDe;
    }

    /**
     * DeliveryStreamOrcSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html
     * 
     */
    @JsonIgnore
    public void setOrcSerDe(Property<DeliveryStreamOrcSerDe> orcSerDe) {
        this.orcSerDe = orcSerDe;
    }

    public DeliveryStreamSerializer withOrcSerDe(Property<DeliveryStreamOrcSerDe> orcSerDe) {
        this.orcSerDe = orcSerDe;
        return this;
    }

    /**
     * DeliveryStreamParquetSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamParquetSerDe> getParquetSerDe() {
        return parquetSerDe;
    }

    /**
     * DeliveryStreamParquetSerDe
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html
     * 
     */
    @JsonIgnore
    public void setParquetSerDe(Property<DeliveryStreamParquetSerDe> parquetSerDe) {
        this.parquetSerDe = parquetSerDe;
    }

    public DeliveryStreamSerializer withParquetSerDe(Property<DeliveryStreamParquetSerDe> parquetSerDe) {
        this.parquetSerDe = parquetSerDe;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("orcSerDe", orcSerDe).append("parquetSerDe", parquetSerDe).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(orcSerDe).append(parquetSerDe).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamSerializer) == false) {
            return false;
        }
        DeliveryStreamSerializer rhs = ((DeliveryStreamSerializer) other);
        return new EqualsBuilder().append(orcSerDe, rhs.orcSerDe).append(parquetSerDe, rhs.parquetSerDe).isEquals();
    }

}
