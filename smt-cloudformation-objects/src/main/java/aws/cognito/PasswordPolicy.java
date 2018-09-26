
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PasswordPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RequireNumbers",
    "MinimumLength",
    "RequireUppercase",
    "RequireLowercase",
    "RequireSymbols"
})
public class PasswordPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers
     * 
     */
    @JsonProperty("RequireNumbers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers")
    private Boolean requireNumbers;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength
     * 
     */
    @JsonProperty("MinimumLength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength")
    private Integer minimumLength;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase
     * 
     */
    @JsonProperty("RequireUppercase")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase")
    private Boolean requireUppercase;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase
     * 
     */
    @JsonProperty("RequireLowercase")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase")
    private Boolean requireLowercase;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols
     * 
     */
    @JsonProperty("RequireSymbols")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols")
    private Boolean requireSymbols;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers
     * 
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers
     * 
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    public PasswordPolicy withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength
     * 
     */
    public Integer getMinimumLength() {
        return minimumLength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength
     * 
     */
    public void setMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
    }

    public PasswordPolicy withMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase
     * 
     */
    public Boolean getRequireUppercase() {
        return requireUppercase;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase
     * 
     */
    public void setRequireUppercase(Boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
    }

    public PasswordPolicy withRequireUppercase(Boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase
     * 
     */
    public Boolean getRequireLowercase() {
        return requireLowercase;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase
     * 
     */
    public void setRequireLowercase(Boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
    }

    public PasswordPolicy withRequireLowercase(Boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols
     * 
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols
     * 
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    public PasswordPolicy withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requireNumbers", requireNumbers).append("minimumLength", minimumLength).append("requireUppercase", requireUppercase).append("requireLowercase", requireLowercase).append("requireSymbols", requireSymbols).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requireNumbers).append(requireSymbols).append(minimumLength).append(requireUppercase).append(requireLowercase).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PasswordPolicy) == false) {
            return false;
        }
        PasswordPolicy rhs = ((PasswordPolicy) other);
        return new EqualsBuilder().append(requireNumbers, rhs.requireNumbers).append(requireSymbols, rhs.requireSymbols).append(minimumLength, rhs.minimumLength).append(requireUppercase, rhs.requireUppercase).append(requireLowercase, rhs.requireLowercase).isEquals();
    }

}
