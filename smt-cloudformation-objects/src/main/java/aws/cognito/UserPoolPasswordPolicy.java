
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
 * UserPoolPasswordPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RequireNumbers",
    "MinimumLength",
    "TemporaryPasswordValidityDays",
    "RequireUppercase",
    "RequireLowercase",
    "RequireSymbols"
})
public class UserPoolPasswordPolicy implements Property<UserPoolPasswordPolicy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers
     * 
     */
    @JsonProperty("RequireNumbers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers")
    private CharSequence requireNumbers;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength
     * 
     */
    @JsonProperty("MinimumLength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength")
    private Number minimumLength;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays
     * 
     */
    @JsonProperty("TemporaryPasswordValidityDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays")
    private Number temporaryPasswordValidityDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase
     * 
     */
    @JsonProperty("RequireUppercase")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase")
    private CharSequence requireUppercase;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase
     * 
     */
    @JsonProperty("RequireLowercase")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase")
    private CharSequence requireLowercase;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols
     * 
     */
    @JsonProperty("RequireSymbols")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols")
    private CharSequence requireSymbols;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers
     * 
     */
    @JsonIgnore
    public CharSequence getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers
     * 
     */
    @JsonIgnore
    public void setRequireNumbers(CharSequence requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    public UserPoolPasswordPolicy withRequireNumbers(CharSequence requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength
     * 
     */
    @JsonIgnore
    public Number getMinimumLength() {
        return minimumLength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength
     * 
     */
    @JsonIgnore
    public void setMinimumLength(Number minimumLength) {
        this.minimumLength = minimumLength;
    }

    public UserPoolPasswordPolicy withMinimumLength(Number minimumLength) {
        this.minimumLength = minimumLength;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays
     * 
     */
    @JsonIgnore
    public Number getTemporaryPasswordValidityDays() {
        return temporaryPasswordValidityDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays
     * 
     */
    @JsonIgnore
    public void setTemporaryPasswordValidityDays(Number temporaryPasswordValidityDays) {
        this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
    }

    public UserPoolPasswordPolicy withTemporaryPasswordValidityDays(Number temporaryPasswordValidityDays) {
        this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase
     * 
     */
    @JsonIgnore
    public CharSequence getRequireUppercase() {
        return requireUppercase;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase
     * 
     */
    @JsonIgnore
    public void setRequireUppercase(CharSequence requireUppercase) {
        this.requireUppercase = requireUppercase;
    }

    public UserPoolPasswordPolicy withRequireUppercase(CharSequence requireUppercase) {
        this.requireUppercase = requireUppercase;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase
     * 
     */
    @JsonIgnore
    public CharSequence getRequireLowercase() {
        return requireLowercase;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase
     * 
     */
    @JsonIgnore
    public void setRequireLowercase(CharSequence requireLowercase) {
        this.requireLowercase = requireLowercase;
    }

    public UserPoolPasswordPolicy withRequireLowercase(CharSequence requireLowercase) {
        this.requireLowercase = requireLowercase;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols
     * 
     */
    @JsonIgnore
    public CharSequence getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols
     * 
     */
    @JsonIgnore
    public void setRequireSymbols(CharSequence requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    public UserPoolPasswordPolicy withRequireSymbols(CharSequence requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requireNumbers", requireNumbers).append("minimumLength", minimumLength).append("temporaryPasswordValidityDays", temporaryPasswordValidityDays).append("requireUppercase", requireUppercase).append("requireLowercase", requireLowercase).append("requireSymbols", requireSymbols).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requireSymbols).append(minimumLength).append(requireNumbers).append(requireUppercase).append(temporaryPasswordValidityDays).append(requireLowercase).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolPasswordPolicy) == false) {
            return false;
        }
        UserPoolPasswordPolicy rhs = ((UserPoolPasswordPolicy) other);
        return new EqualsBuilder().append(requireSymbols, rhs.requireSymbols).append(minimumLength, rhs.minimumLength).append(requireNumbers, rhs.requireNumbers).append(requireUppercase, rhs.requireUppercase).append(temporaryPasswordValidityDays, rhs.temporaryPasswordValidityDays).append(requireLowercase, rhs.requireLowercase).isEquals();
    }

}
