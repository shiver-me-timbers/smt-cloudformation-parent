
package shiver.me.timbers.aws.secretsmanager;

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
 * SecretGenerateSecretString
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExcludeUppercase",
    "RequireEachIncludedType",
    "IncludeSpace",
    "ExcludeCharacters",
    "GenerateStringKey",
    "PasswordLength",
    "ExcludePunctuation",
    "ExcludeLowercase",
    "SecretStringTemplate",
    "ExcludeNumbers"
})
public class SecretGenerateSecretString implements Property<SecretGenerateSecretString>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludeuppercase
     * 
     */
    @JsonProperty("ExcludeUppercase")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludeuppercase")
    private CharSequence excludeUppercase;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-requireeachincludedtype
     * 
     */
    @JsonProperty("RequireEachIncludedType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-requireeachincludedtype")
    private CharSequence requireEachIncludedType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-includespace
     * 
     */
    @JsonProperty("IncludeSpace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-includespace")
    private CharSequence includeSpace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludecharacters
     * 
     */
    @JsonProperty("ExcludeCharacters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludecharacters")
    private CharSequence excludeCharacters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-generatestringkey
     * 
     */
    @JsonProperty("GenerateStringKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-generatestringkey")
    private CharSequence generateStringKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-passwordlength
     * 
     */
    @JsonProperty("PasswordLength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-passwordlength")
    private Number passwordLength;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludepunctuation
     * 
     */
    @JsonProperty("ExcludePunctuation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludepunctuation")
    private CharSequence excludePunctuation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludelowercase
     * 
     */
    @JsonProperty("ExcludeLowercase")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludelowercase")
    private CharSequence excludeLowercase;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-secretstringtemplate
     * 
     */
    @JsonProperty("SecretStringTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-secretstringtemplate")
    private CharSequence secretStringTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludenumbers
     * 
     */
    @JsonProperty("ExcludeNumbers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludenumbers")
    private CharSequence excludeNumbers;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludeuppercase
     * 
     */
    @JsonIgnore
    public CharSequence getExcludeUppercase() {
        return excludeUppercase;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludeuppercase
     * 
     */
    @JsonIgnore
    public void setExcludeUppercase(CharSequence excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
    }

    public SecretGenerateSecretString withExcludeUppercase(CharSequence excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-requireeachincludedtype
     * 
     */
    @JsonIgnore
    public CharSequence getRequireEachIncludedType() {
        return requireEachIncludedType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-requireeachincludedtype
     * 
     */
    @JsonIgnore
    public void setRequireEachIncludedType(CharSequence requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
    }

    public SecretGenerateSecretString withRequireEachIncludedType(CharSequence requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-includespace
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeSpace() {
        return includeSpace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-includespace
     * 
     */
    @JsonIgnore
    public void setIncludeSpace(CharSequence includeSpace) {
        this.includeSpace = includeSpace;
    }

    public SecretGenerateSecretString withIncludeSpace(CharSequence includeSpace) {
        this.includeSpace = includeSpace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludecharacters
     * 
     */
    @JsonIgnore
    public CharSequence getExcludeCharacters() {
        return excludeCharacters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludecharacters
     * 
     */
    @JsonIgnore
    public void setExcludeCharacters(CharSequence excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
    }

    public SecretGenerateSecretString withExcludeCharacters(CharSequence excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-generatestringkey
     * 
     */
    @JsonIgnore
    public CharSequence getGenerateStringKey() {
        return generateStringKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-generatestringkey
     * 
     */
    @JsonIgnore
    public void setGenerateStringKey(CharSequence generateStringKey) {
        this.generateStringKey = generateStringKey;
    }

    public SecretGenerateSecretString withGenerateStringKey(CharSequence generateStringKey) {
        this.generateStringKey = generateStringKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-passwordlength
     * 
     */
    @JsonIgnore
    public Number getPasswordLength() {
        return passwordLength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-passwordlength
     * 
     */
    @JsonIgnore
    public void setPasswordLength(Number passwordLength) {
        this.passwordLength = passwordLength;
    }

    public SecretGenerateSecretString withPasswordLength(Number passwordLength) {
        this.passwordLength = passwordLength;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludepunctuation
     * 
     */
    @JsonIgnore
    public CharSequence getExcludePunctuation() {
        return excludePunctuation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludepunctuation
     * 
     */
    @JsonIgnore
    public void setExcludePunctuation(CharSequence excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
    }

    public SecretGenerateSecretString withExcludePunctuation(CharSequence excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludelowercase
     * 
     */
    @JsonIgnore
    public CharSequence getExcludeLowercase() {
        return excludeLowercase;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludelowercase
     * 
     */
    @JsonIgnore
    public void setExcludeLowercase(CharSequence excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
    }

    public SecretGenerateSecretString withExcludeLowercase(CharSequence excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-secretstringtemplate
     * 
     */
    @JsonIgnore
    public CharSequence getSecretStringTemplate() {
        return secretStringTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-secretstringtemplate
     * 
     */
    @JsonIgnore
    public void setSecretStringTemplate(CharSequence secretStringTemplate) {
        this.secretStringTemplate = secretStringTemplate;
    }

    public SecretGenerateSecretString withSecretStringTemplate(CharSequence secretStringTemplate) {
        this.secretStringTemplate = secretStringTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludenumbers
     * 
     */
    @JsonIgnore
    public CharSequence getExcludeNumbers() {
        return excludeNumbers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html#cfn-secretsmanager-secret-generatesecretstring-excludenumbers
     * 
     */
    @JsonIgnore
    public void setExcludeNumbers(CharSequence excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
    }

    public SecretGenerateSecretString withExcludeNumbers(CharSequence excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("excludeUppercase", excludeUppercase).append("requireEachIncludedType", requireEachIncludedType).append("includeSpace", includeSpace).append("excludeCharacters", excludeCharacters).append("generateStringKey", generateStringKey).append("passwordLength", passwordLength).append("excludePunctuation", excludePunctuation).append("excludeLowercase", excludeLowercase).append("secretStringTemplate", secretStringTemplate).append("excludeNumbers", excludeNumbers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(generateStringKey).append(includeSpace).append(excludePunctuation).append(excludeNumbers).append(excludeCharacters).append(secretStringTemplate).append(excludeUppercase).append(passwordLength).append(excludeLowercase).append(requireEachIncludedType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecretGenerateSecretString) == false) {
            return false;
        }
        SecretGenerateSecretString rhs = ((SecretGenerateSecretString) other);
        return new EqualsBuilder().append(generateStringKey, rhs.generateStringKey).append(includeSpace, rhs.includeSpace).append(excludePunctuation, rhs.excludePunctuation).append(excludeNumbers, rhs.excludeNumbers).append(excludeCharacters, rhs.excludeCharacters).append(secretStringTemplate, rhs.secretStringTemplate).append(excludeUppercase, rhs.excludeUppercase).append(passwordLength, rhs.passwordLength).append(excludeLowercase, rhs.excludeLowercase).append(requireEachIncludedType, rhs.requireEachIncludedType).isEquals();
    }

}
