
package aws.lambda;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Version
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodeSha256",
    "Description",
    "FunctionName"
})
public class Version {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256
     * 
     */
    @JsonProperty("CodeSha256")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256")
    private CharSequence codeSha256;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname
     * 
     */
    @JsonProperty("FunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname")
    private CharSequence functionName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256
     * 
     */
    public CharSequence getCodeSha256() {
        return codeSha256;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256
     * 
     */
    public void setCodeSha256(CharSequence codeSha256) {
        this.codeSha256 = codeSha256;
    }

    public Version withCodeSha256(CharSequence codeSha256) {
        this.codeSha256 = codeSha256;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Version withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname
     * 
     */
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname
     * 
     */
    public void setFunctionName(CharSequence functionName) {
        this.functionName = functionName;
    }

    public Version withFunctionName(CharSequence functionName) {
        this.functionName = functionName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codeSha256", codeSha256).append("description", description).append("functionName", functionName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(codeSha256).append(functionName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Version) == false) {
            return false;
        }
        Version rhs = ((Version) other);
        return new EqualsBuilder().append(description, rhs.description).append(codeSha256, rhs.codeSha256).append(functionName, rhs.functionName).isEquals();
    }

}
