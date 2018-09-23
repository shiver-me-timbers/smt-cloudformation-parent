
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StringAttributeConstraints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MinLength",
    "MaxLength"
})
public class StringAttributeConstraints {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength
     * 
     */
    @JsonProperty("MinLength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength")
    private String minLength;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength
     * 
     */
    @JsonProperty("MaxLength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength")
    private String maxLength;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength
     * 
     */
    @JsonProperty("MinLength")
    public String getMinLength() {
        return minLength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength
     * 
     */
    @JsonProperty("MinLength")
    public void setMinLength(String minLength) {
        this.minLength = minLength;
    }

    public StringAttributeConstraints withMinLength(String minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength
     * 
     */
    @JsonProperty("MaxLength")
    public String getMaxLength() {
        return maxLength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength
     * 
     */
    @JsonProperty("MaxLength")
    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    public StringAttributeConstraints withMaxLength(String maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minLength", minLength).append("maxLength", maxLength).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxLength).append(minLength).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StringAttributeConstraints) == false) {
            return false;
        }
        StringAttributeConstraints rhs = ((StringAttributeConstraints) other);
        return new EqualsBuilder().append(maxLength, rhs.maxLength).append(minLength, rhs.minLength).isEquals();
    }

}