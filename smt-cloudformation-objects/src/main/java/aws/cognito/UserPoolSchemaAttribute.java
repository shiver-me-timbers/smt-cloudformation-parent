
package aws.cognito;

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
 * UserPoolSchemaAttribute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeveloperOnlyAttribute",
    "Mutable",
    "AttributeDataType",
    "StringAttributeConstraints",
    "Required",
    "NumberAttributeConstraints",
    "Name"
})
public class UserPoolSchemaAttribute implements Property<UserPoolSchemaAttribute>
{

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
    private CharSequence attributeDataType;
    /**
     * UserPoolStringAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
     * 
     */
    @JsonProperty("StringAttributeConstraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html")
    private Property<UserPoolStringAttributeConstraints> stringAttributeConstraints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required
     * 
     */
    @JsonProperty("Required")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required")
    private Boolean required;
    /**
     * UserPoolNumberAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
     * 
     */
    @JsonProperty("NumberAttributeConstraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html")
    private Property<UserPoolNumberAttributeConstraints> numberAttributeConstraints;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute
     * 
     */
    @JsonIgnore
    public Boolean getDeveloperOnlyAttribute() {
        return developerOnlyAttribute;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute
     * 
     */
    @JsonIgnore
    public void setDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
    }

    public UserPoolSchemaAttribute withDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable
     * 
     */
    @JsonIgnore
    public Boolean getMutable() {
        return mutable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable
     * 
     */
    @JsonIgnore
    public void setMutable(Boolean mutable) {
        this.mutable = mutable;
    }

    public UserPoolSchemaAttribute withMutable(Boolean mutable) {
        this.mutable = mutable;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype
     * 
     */
    @JsonIgnore
    public CharSequence getAttributeDataType() {
        return attributeDataType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype
     * 
     */
    @JsonIgnore
    public void setAttributeDataType(CharSequence attributeDataType) {
        this.attributeDataType = attributeDataType;
    }

    public UserPoolSchemaAttribute withAttributeDataType(CharSequence attributeDataType) {
        this.attributeDataType = attributeDataType;
        return this;
    }

    /**
     * UserPoolStringAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolStringAttributeConstraints> getStringAttributeConstraints() {
        return stringAttributeConstraints;
    }

    /**
     * UserPoolStringAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
     * 
     */
    @JsonIgnore
    public void setStringAttributeConstraints(Property<UserPoolStringAttributeConstraints> stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
    }

    public UserPoolSchemaAttribute withStringAttributeConstraints(Property<UserPoolStringAttributeConstraints> stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required
     * 
     */
    @JsonIgnore
    public Boolean getRequired() {
        return required;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required
     * 
     */
    @JsonIgnore
    public void setRequired(Boolean required) {
        this.required = required;
    }

    public UserPoolSchemaAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * UserPoolNumberAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolNumberAttributeConstraints> getNumberAttributeConstraints() {
        return numberAttributeConstraints;
    }

    /**
     * UserPoolNumberAttributeConstraints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
     * 
     */
    @JsonIgnore
    public void setNumberAttributeConstraints(Property<UserPoolNumberAttributeConstraints> numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
    }

    public UserPoolSchemaAttribute withNumberAttributeConstraints(Property<UserPoolNumberAttributeConstraints> numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public UserPoolSchemaAttribute withName(CharSequence name) {
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
        if ((other instanceof UserPoolSchemaAttribute) == false) {
            return false;
        }
        UserPoolSchemaAttribute rhs = ((UserPoolSchemaAttribute) other);
        return new EqualsBuilder().append(numberAttributeConstraints, rhs.numberAttributeConstraints).append(mutable, rhs.mutable).append(stringAttributeConstraints, rhs.stringAttributeConstraints).append(name, rhs.name).append(developerOnlyAttribute, rhs.developerOnlyAttribute).append(attributeDataType, rhs.attributeDataType).append(required, rhs.required).isEquals();
    }

}
