
package aws.redshift;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ParameterName",
    "ParameterValue"
})
public class Parameter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametername
     * 
     */
    @JsonProperty("ParameterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametername")
    private CharSequence parameterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametervalue
     * 
     */
    @JsonProperty("ParameterValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametervalue")
    private CharSequence parameterValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametername
     * 
     */
    public CharSequence getParameterName() {
        return parameterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametername
     * 
     */
    public void setParameterName(CharSequence parameterName) {
        this.parameterName = parameterName;
    }

    public Parameter withParameterName(CharSequence parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametervalue
     * 
     */
    public CharSequence getParameterValue() {
        return parameterValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametervalue
     * 
     */
    public void setParameterValue(CharSequence parameterValue) {
        this.parameterValue = parameterValue;
    }

    public Parameter withParameterValue(CharSequence parameterValue) {
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
        if ((other instanceof Parameter) == false) {
            return false;
        }
        Parameter rhs = ((Parameter) other);
        return new EqualsBuilder().append(parameterValue, rhs.parameterValue).append(parameterName, rhs.parameterName).isEquals();
    }

}
