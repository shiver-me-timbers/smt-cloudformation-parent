
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SchemaAttribute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeveloperOnlyAttribute",
    "Mutable",
    "AttributeDataType",
    "StringAttributeConstraints",
    "Required",
    "NumberAttributeConstraints",
    "Name"
})
public class SchemaAttribute {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute
     * 
     */
    @JsonProperty("DeveloperOnlyAttribute")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute")
    private Boolean developerOnlyAttribute;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable
     * 
     */
    @JsonProperty("Mutable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable")
    private Boolean mutable;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype
     * 
     */
    @JsonProperty("AttributeDataType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype")
    private String attributeDataType;
    /**
     * StringAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
     * 
     */
    @JsonProperty("StringAttributeConstraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html")
    private StringAttributeConstraints stringAttributeConstraints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required
     * 
     */
    @JsonProperty("Required")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required")
    private Boolean required;
    /**
     * NumberAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
     * 
     */
    @JsonProperty("NumberAttributeConstraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html")
    private NumberAttributeConstraints numberAttributeConstraints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name")
    private String name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute
     * 
     */
    @JsonProperty("DeveloperOnlyAttribute")
    public Boolean getDeveloperOnlyAttribute() {
        return developerOnlyAttribute;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute
     * 
     */
    @JsonProperty("DeveloperOnlyAttribute")
    public void setDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
    }

    public SchemaAttribute withDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable
     * 
     */
    @JsonProperty("Mutable")
    public Boolean getMutable() {
        return mutable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable
     * 
     */
    @JsonProperty("Mutable")
    public void setMutable(Boolean mutable) {
        this.mutable = mutable;
    }

    public SchemaAttribute withMutable(Boolean mutable) {
        this.mutable = mutable;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype
     * 
     */
    @JsonProperty("AttributeDataType")
    public String getAttributeDataType() {
        return attributeDataType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype
     * 
     */
    @JsonProperty("AttributeDataType")
    public void setAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
    }

    public SchemaAttribute withAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
        return this;
    }

    /**
     * StringAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
     * 
     */
    @JsonProperty("StringAttributeConstraints")
    public StringAttributeConstraints getStringAttributeConstraints() {
        return stringAttributeConstraints;
    }

    /**
     * StringAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
     * 
     */
    @JsonProperty("StringAttributeConstraints")
    public void setStringAttributeConstraints(StringAttributeConstraints stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
    }

    public SchemaAttribute withStringAttributeConstraints(StringAttributeConstraints stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required
     * 
     */
    @JsonProperty("Required")
    public Boolean getRequired() {
        return required;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required
     * 
     */
    @JsonProperty("Required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    public SchemaAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * NumberAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
     * 
     */
    @JsonProperty("NumberAttributeConstraints")
    public NumberAttributeConstraints getNumberAttributeConstraints() {
        return numberAttributeConstraints;
    }

    /**
     * NumberAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
     * 
     */
    @JsonProperty("NumberAttributeConstraints")
    public void setNumberAttributeConstraints(NumberAttributeConstraints numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
    }

    public SchemaAttribute withNumberAttributeConstraints(NumberAttributeConstraints numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public SchemaAttribute withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("developerOnlyAttribute", developerOnlyAttribute).append("mutable", mutable).append("attributeDataType", attributeDataType).append("stringAttributeConstraints", stringAttributeConstraints).append("required", required).append("numberAttributeConstraints", numberAttributeConstraints).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numberAttributeConstraints).append(mutable).append(stringAttributeConstraints).append(name).append(developerOnlyAttribute).append(attributeDataType).append(required).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaAttribute) == false) {
            return false;
        }
        SchemaAttribute rhs = ((SchemaAttribute) other);
        return new EqualsBuilder().append(numberAttributeConstraints, rhs.numberAttributeConstraints).append(mutable, rhs.mutable).append(stringAttributeConstraints, rhs.stringAttributeConstraints).append(name, rhs.name).append(developerOnlyAttribute, rhs.developerOnlyAttribute).append(attributeDataType, rhs.attributeDataType).append(required, rhs.required).isEquals();
    }

}
