
package shiver.me.timbers.aws.config;

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
 * ConformancePackConformancePackInputParameter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ParameterName",
    "ParameterValue"
})
public class ConformancePackConformancePackInputParameter implements Property<ConformancePackConformancePackInputParameter>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametername
     * 
     */
    @JsonProperty("ParameterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametername")
    private CharSequence parameterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametervalue
     * 
     */
    @JsonProperty("ParameterValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametervalue")
    private CharSequence parameterValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametername
     * 
     */
    @JsonIgnore
    public CharSequence getParameterName() {
        return parameterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametername
     * 
     */
    @JsonIgnore
    public void setParameterName(CharSequence parameterName) {
        this.parameterName = parameterName;
    }

    public ConformancePackConformancePackInputParameter withParameterName(CharSequence parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametervalue
     * 
     */
    @JsonIgnore
    public CharSequence getParameterValue() {
        return parameterValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametervalue
     * 
     */
    @JsonIgnore
    public void setParameterValue(CharSequence parameterValue) {
        this.parameterValue = parameterValue;
    }

    public ConformancePackConformancePackInputParameter withParameterValue(CharSequence parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("parameterName", parameterName).append("parameterValue", parameterValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parameterValue).append(parameterName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConformancePackConformancePackInputParameter) == false) {
            return false;
        }
        ConformancePackConformancePackInputParameter rhs = ((ConformancePackConformancePackInputParameter) other);
        return new EqualsBuilder().append(parameterValue, rhs.parameterValue).append(parameterName, rhs.parameterName).isEquals();
    }

}
