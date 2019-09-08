
package shiver.me.timbers.aws.lambda;

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
 * AliasVersionWeight
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FunctionVersion",
    "FunctionWeight"
})
public class AliasVersionWeight implements Property<AliasVersionWeight>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion
     * 
     */
    @JsonProperty("FunctionVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion")
    private CharSequence functionVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight
     * 
     */
    @JsonProperty("FunctionWeight")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight")
    private Number functionWeight;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionVersion() {
        return functionVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion
     * 
     */
    @JsonIgnore
    public void setFunctionVersion(CharSequence functionVersion) {
        this.functionVersion = functionVersion;
    }

    public AliasVersionWeight withFunctionVersion(CharSequence functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight
     * 
     */
    @JsonIgnore
    public Number getFunctionWeight() {
        return functionWeight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight
     * 
     */
    @JsonIgnore
    public void setFunctionWeight(Number functionWeight) {
        this.functionWeight = functionWeight;
    }

    public AliasVersionWeight withFunctionWeight(Number functionWeight) {
        this.functionWeight = functionWeight;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("functionVersion", functionVersion).append("functionWeight", functionWeight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(functionVersion).append(functionWeight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AliasVersionWeight) == false) {
            return false;
        }
        AliasVersionWeight rhs = ((AliasVersionWeight) other);
        return new EqualsBuilder().append(functionVersion, rhs.functionVersion).append(functionWeight, rhs.functionWeight).isEquals();
    }

}
