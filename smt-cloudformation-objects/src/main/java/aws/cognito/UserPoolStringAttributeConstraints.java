
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
 * UserPoolStringAttributeConstraints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MinLength",
    "MaxLength"
})
public class UserPoolStringAttributeConstraints implements Property<UserPoolStringAttributeConstraints>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength
     * 
     */
    @JsonProperty("MinLength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength")
    private CharSequence minLength;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength
     * 
     */
    @JsonProperty("MaxLength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength")
    private CharSequence maxLength;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength
     * 
     */
    @JsonIgnore
    public CharSequence getMinLength() {
        return minLength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength
     * 
     */
    @JsonIgnore
    public void setMinLength(CharSequence minLength) {
        this.minLength = minLength;
    }

    public UserPoolStringAttributeConstraints withMinLength(CharSequence minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength
     * 
     */
    @JsonIgnore
    public CharSequence getMaxLength() {
        return maxLength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength
     * 
     */
    @JsonIgnore
    public void setMaxLength(CharSequence maxLength) {
        this.maxLength = maxLength;
    }

    public UserPoolStringAttributeConstraints withMaxLength(CharSequence maxLength) {
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
        if ((other instanceof UserPoolStringAttributeConstraints) == false) {
            return false;
        }
        UserPoolStringAttributeConstraints rhs = ((UserPoolStringAttributeConstraints) other);
        return new EqualsBuilder().append(maxLength, rhs.maxLength).append(minLength, rhs.minLength).isEquals();
    }

}
