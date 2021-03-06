
package shiver.me.timbers.aws.events;

import java.util.Map;
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
 * RuleInputTransformer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InputPathsMap",
    "InputTemplate"
})
public class RuleInputTransformer implements Property<RuleInputTransformer>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap
     * 
     */
    @JsonProperty("InputPathsMap")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap")
    private Map<String, CharSequence> inputPathsMap;
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
    @JsonIgnore
    public Map<String, CharSequence> getInputPathsMap() {
        return inputPathsMap;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap
     * 
     */
    @JsonIgnore
    public void setInputPathsMap(Map<String, CharSequence> inputPathsMap) {
        this.inputPathsMap = inputPathsMap;
    }

    public RuleInputTransformer withInputPathsMap(Map<String, CharSequence> inputPathsMap) {
        this.inputPathsMap = inputPathsMap;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate
     * 
     */
    @JsonIgnore
    public CharSequence getInputTemplate() {
        return inputTemplate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate
     * 
     */
    @JsonIgnore
    public void setInputTemplate(CharSequence inputTemplate) {
        this.inputTemplate = inputTemplate;
    }

    public RuleInputTransformer withInputTemplate(CharSequence inputTemplate) {
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
        if ((other instanceof RuleInputTransformer) == false) {
            return false;
        }
        RuleInputTransformer rhs = ((RuleInputTransformer) other);
        return new EqualsBuilder().append(inputTemplate, rhs.inputTemplate).append(inputPathsMap, rhs.inputPathsMap).isEquals();
    }

}
