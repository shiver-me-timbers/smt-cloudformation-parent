
package aws.dynamodb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * KeySchema
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AttributeName",
    "KeyType"
})
public class KeySchema {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename
     * 
     */
    @JsonProperty("AttributeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename")
    private CharSequence attributeName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype
     * 
     */
    @JsonProperty("KeyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype")
    private CharSequence keyType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename
     * 
     */
    public CharSequence getAttributeName() {
        return attributeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename
     * 
     */
    public void setAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
    }

    public KeySchema withAttributeName(CharSequence attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype
     * 
     */
    public CharSequence getKeyType() {
        return keyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype
     * 
     */
    public void setKeyType(CharSequence keyType) {
        this.keyType = keyType;
    }

    public KeySchema withKeyType(CharSequence keyType) {
        this.keyType = keyType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributeName", attributeName).append("keyType", keyType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyType).append(attributeName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeySchema) == false) {
            return false;
        }
        KeySchema rhs = ((KeySchema) other);
        return new EqualsBuilder().append(keyType, rhs.keyType).append(attributeName, rhs.attributeName).isEquals();
    }

}
