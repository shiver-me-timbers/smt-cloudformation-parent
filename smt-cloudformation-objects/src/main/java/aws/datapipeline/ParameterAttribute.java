
package aws.datapipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ParameterAttribute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Key",
    "StringValue"
})
public class ParameterAttribute {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key")
    private CharSequence key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue
     * 
     */
    @JsonProperty("StringValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue")
    private CharSequence stringValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key
     * 
     */
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key
     * 
     */
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public ParameterAttribute withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue
     * 
     */
    public CharSequence getStringValue() {
        return stringValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue
     * 
     */
    public void setStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
    }

    public ParameterAttribute withStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("stringValue", stringValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(key).append(stringValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParameterAttribute) == false) {
            return false;
        }
        ParameterAttribute rhs = ((ParameterAttribute) other);
        return new EqualsBuilder().append(key, rhs.key).append(stringValue, rhs.stringValue).isEquals();
    }

}
