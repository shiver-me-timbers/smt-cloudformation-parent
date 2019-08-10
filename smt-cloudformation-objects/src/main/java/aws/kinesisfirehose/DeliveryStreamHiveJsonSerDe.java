
package aws.kinesisfirehose;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeliveryStreamHiveJsonSerDe
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimestampFormats"
})
public class DeliveryStreamHiveJsonSerDe implements Property<DeliveryStreamHiveJsonSerDe>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html#cfn-kinesisfirehose-deliverystream-hivejsonserde-timestampformats
     * 
     */
    @JsonProperty("TimestampFormats")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html#cfn-kinesisfirehose-deliverystream-hivejsonserde-timestampformats")
    private Set<CharSequence> timestampFormats = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html#cfn-kinesisfirehose-deliverystream-hivejsonserde-timestampformats
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getTimestampFormats() {
        return timestampFormats;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html#cfn-kinesisfirehose-deliverystream-hivejsonserde-timestampformats
     * 
     */
    @JsonIgnore
    public void setTimestampFormats(Set<CharSequence> timestampFormats) {
        this.timestampFormats = timestampFormats;
    }

    public DeliveryStreamHiveJsonSerDe withTimestampFormats(Set<CharSequence> timestampFormats) {
        this.timestampFormats = timestampFormats;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timestampFormats", timestampFormats).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timestampFormats).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamHiveJsonSerDe) == false) {
            return false;
        }
        DeliveryStreamHiveJsonSerDe rhs = ((DeliveryStreamHiveJsonSerDe) other);
        return new EqualsBuilder().append(timestampFormats, rhs.timestampFormats).isEquals();
    }

}
