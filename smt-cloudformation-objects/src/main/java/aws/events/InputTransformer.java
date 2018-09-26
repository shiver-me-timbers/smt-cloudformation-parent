
package aws.events;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InputTransformer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InputPathsMap",
    "InputTemplate"
})
public class InputTransformer {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap
     * 
     */
    @JsonProperty("InputPathsMap")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap")
    private Map<String, String> inputPathsMap;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate
     * 
     */
    @JsonProperty("InputTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate")
    private CharSequence inputTemplate;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap
     * 
     */
    public Map<String, String> getInputPathsMap() {
        return inputPathsMap;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap
     * 
     */
    public void setInputPathsMap(Map<String, String> inputPathsMap) {
        this.inputPathsMap = inputPathsMap;
    }

    public InputTransformer withInputPathsMap(Map<String, String> inputPathsMap) {
        this.inputPathsMap = inputPathsMap;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate
     * 
     */
    public CharSequence getInputTemplate() {
        return inputTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate
     * 
     */
    public void setInputTemplate(CharSequence inputTemplate) {
        this.inputTemplate = inputTemplate;
    }

    public InputTransformer withInputTemplate(CharSequence inputTemplate) {
        this.inputTemplate = inputTemplate;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("inputPathsMap", inputPathsMap).append("inputTemplate", inputTemplate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputTemplate).append(inputPathsMap).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputTransformer) == false) {
            return false;
        }
        InputTransformer rhs = ((InputTransformer) other);
        return new EqualsBuilder().append(inputTemplate, rhs.inputTemplate).append(inputPathsMap, rhs.inputPathsMap).isEquals();
    }

}
