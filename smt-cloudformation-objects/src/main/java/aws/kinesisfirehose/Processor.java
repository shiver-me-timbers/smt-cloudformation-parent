
package aws.kinesisfirehose;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Processor
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Parameters",
    "Type"
})
public class Processor {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters")
    private Set<ProcessorParameter> parameters = new LinkedHashSet<ProcessorParameter>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters
     * 
     */
    public Set<ProcessorParameter> getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters
     * 
     */
    public void setParameters(Set<ProcessorParameter> parameters) {
        this.parameters = parameters;
    }

    public Processor withParameters(Set<ProcessorParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Processor withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("parameters", parameters).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(parameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Processor) == false) {
            return false;
        }
        Processor rhs = ((Processor) other);
        return new EqualsBuilder().append(type, rhs.type).append(parameters, rhs.parameters).isEquals();
    }

}
