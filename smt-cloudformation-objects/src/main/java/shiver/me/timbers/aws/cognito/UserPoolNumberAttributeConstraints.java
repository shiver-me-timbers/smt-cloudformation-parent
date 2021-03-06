
package shiver.me.timbers.aws.cognito;

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
 * UserPoolNumberAttributeConstraints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MinValue",
    "MaxValue"
})
public class UserPoolNumberAttributeConstraints implements Property<UserPoolNumberAttributeConstraints>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue
     * 
     */
    @JsonProperty("MinValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue")
    private CharSequence minValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue
     * 
     */
    @JsonProperty("MaxValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue")
    private CharSequence maxValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue
     * 
     */
    @JsonIgnore
    public CharSequence getMinValue() {
        return minValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue
     * 
     */
    @JsonIgnore
    public void setMinValue(CharSequence minValue) {
        this.minValue = minValue;
    }

    public UserPoolNumberAttributeConstraints withMinValue(CharSequence minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue
     * 
     */
    @JsonIgnore
    public CharSequence getMaxValue() {
        return maxValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue
     * 
     */
    @JsonIgnore
    public void setMaxValue(CharSequence maxValue) {
        this.maxValue = maxValue;
    }

    public UserPoolNumberAttributeConstraints withMaxValue(CharSequence maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minValue", minValue).append("maxValue", maxValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minValue).append(maxValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolNumberAttributeConstraints) == false) {
            return false;
        }
        UserPoolNumberAttributeConstraints rhs = ((UserPoolNumberAttributeConstraints) other);
        return new EqualsBuilder().append(minValue, rhs.minValue).append(maxValue, rhs.maxValue).isEquals();
    }

}
