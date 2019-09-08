
package shiver.me.timbers.aws.dynamodb;

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
 * TableAttributeDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AttributeName",
    "AttributeType"
})
public class TableAttributeDefinition implements Property<TableAttributeDefinition>
{

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
    @JsonIgnore
    public CharSequence getAttributeName() {
        return attributeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename
     * 
     */
    @JsonIgnore
    public void setAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
    }

    public TableAttributeDefinition withAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype
     * 
     */
    @JsonIgnore
    public CharSequence getAttributeType() {
        return attributeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype
     * 
     */
    @JsonIgnore
    public void setAttributeType(CharSequence attributeType) {
        this.attributeType = attributeType;
    }

    public TableAttributeDefinition withAttributeType(CharSequence attributeType) {
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
        if ((other instanceof TableAttributeDefinition) == false) {
            return false;
        }
        TableAttributeDefinition rhs = ((TableAttributeDefinition) other);
        return new EqualsBuilder().append(attributeName, rhs.attributeName).append(attributeType, rhs.attributeType).isEquals();
    }

}
