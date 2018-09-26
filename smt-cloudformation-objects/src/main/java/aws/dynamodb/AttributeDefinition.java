
package aws.dynamodb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AttributeDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AttributeName",
    "AttributeType"
})
public class AttributeDefinition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename
     * 
     */
    @JsonProperty("AttributeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename")
    private CharSequence attributeName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype
     * 
     */
    @JsonProperty("AttributeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype")
    private CharSequence attributeType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename
     * 
     */
    public CharSequence getAttributeName() {
        return attributeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename
     * 
     */
    public void setAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
    }

    public AttributeDefinition withAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype
     * 
     */
    public CharSequence getAttributeType() {
        return attributeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype
     * 
     */
    public void setAttributeType(CharSequence attributeType) {
        this.attributeType = attributeType;
    }

    public AttributeDefinition withAttributeType(CharSequence attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributeName", attributeName).append("attributeType", attributeType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributeName).append(attributeType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeDefinition) == false) {
            return false;
        }
        AttributeDefinition rhs = ((AttributeDefinition) other);
        return new EqualsBuilder().append(attributeName, rhs.attributeName).append(attributeType, rhs.attributeType).isEquals();
    }

}
