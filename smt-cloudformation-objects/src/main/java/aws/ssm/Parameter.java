
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Parameter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Description",
    "AllowedPattern",
    "Value",
    "Name"
})
public class Parameter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern
     * 
     */
    @JsonProperty("AllowedPattern")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern")
    private CharSequence allowedPattern;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value")
    private CharSequence value;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Parameter withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Parameter withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern
     * 
     */
    public CharSequence getAllowedPattern() {
        return allowedPattern;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern
     * 
     */
    public void setAllowedPattern(CharSequence allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    public Parameter withAllowedPattern(CharSequence allowedPattern) {
        this.allowedPattern = allowedPattern;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public Parameter withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Parameter withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("description", description).append("allowedPattern", allowedPattern).append("value", value).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(type).append(allowedPattern).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameter) == false) {
            return false;
        }
        Parameter rhs = ((Parameter) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(type, rhs.type).append(allowedPattern, rhs.allowedPattern).append(value, rhs.value).isEquals();
    }

}
