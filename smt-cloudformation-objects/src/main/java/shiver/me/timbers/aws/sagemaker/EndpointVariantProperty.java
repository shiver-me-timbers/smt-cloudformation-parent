
package shiver.me.timbers.aws.sagemaker;

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
 * EndpointVariantProperty
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VariantPropertyType"
})
public class EndpointVariantProperty implements Property<EndpointVariantProperty>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html#cfn-sagemaker-endpoint-variantproperty-variantpropertytype
     * 
     */
    @JsonProperty("VariantPropertyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html#cfn-sagemaker-endpoint-variantproperty-variantpropertytype")
    private CharSequence variantPropertyType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html#cfn-sagemaker-endpoint-variantproperty-variantpropertytype
     * 
     */
    @JsonIgnore
    public CharSequence getVariantPropertyType() {
        return variantPropertyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html#cfn-sagemaker-endpoint-variantproperty-variantpropertytype
     * 
     */
    @JsonIgnore
    public void setVariantPropertyType(CharSequence variantPropertyType) {
        this.variantPropertyType = variantPropertyType;
    }

    public EndpointVariantProperty withVariantPropertyType(CharSequence variantPropertyType) {
        this.variantPropertyType = variantPropertyType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("variantPropertyType", variantPropertyType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variantPropertyType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointVariantProperty) == false) {
            return false;
        }
        EndpointVariantProperty rhs = ((EndpointVariantProperty) other);
        return new EqualsBuilder().append(variantPropertyType, rhs.variantPropertyType).isEquals();
    }

}
