
package aws.datapipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ParameterValue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "StringValue"
})
public class ParameterValue {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue
     * 
     */
    @JsonProperty("StringValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue")
    private CharSequence stringValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public ParameterValue withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue
     * 
     */
    public CharSequence getStringValue() {
        return stringValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue
     * 
     */
    public void setStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
    }

    public ParameterValue withStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("stringValue", stringValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stringValue).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParameterValue) == false) {
            return false;
        }
        ParameterValue rhs = ((ParameterValue) other);
        return new EqualsBuilder().append(stringValue, rhs.stringValue).append(id, rhs.id).isEquals();
    }

}
