
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GrokClassifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustomPatterns",
    "GrokPattern",
    "Classification",
    "Name"
})
public class GrokClassifier {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns
     * 
     */
    @JsonProperty("CustomPatterns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns")
    private CharSequence customPatterns;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern
     * 
     */
    @JsonProperty("GrokPattern")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern")
    private CharSequence grokPattern;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification
     * 
     */
    @JsonProperty("Classification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification")
    private CharSequence classification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns
     * 
     */
    public CharSequence getCustomPatterns() {
        return customPatterns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns
     * 
     */
    public void setCustomPatterns(CharSequence customPatterns) {
        this.customPatterns = customPatterns;
    }

    public GrokClassifier withCustomPatterns(CharSequence customPatterns) {
        this.customPatterns = customPatterns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern
     * 
     */
    public CharSequence getGrokPattern() {
        return grokPattern;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern
     * 
     */
    public void setGrokPattern(CharSequence grokPattern) {
        this.grokPattern = grokPattern;
    }

    public GrokClassifier withGrokPattern(CharSequence grokPattern) {
        this.grokPattern = grokPattern;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification
     * 
     */
    public CharSequence getClassification() {
        return classification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification
     * 
     */
    public void setClassification(CharSequence classification) {
        this.classification = classification;
    }

    public GrokClassifier withClassification(CharSequence classification) {
        this.classification = classification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public GrokClassifier withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customPatterns", customPatterns).append("grokPattern", grokPattern).append("classification", classification).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(grokPattern).append(customPatterns).append(classification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrokClassifier) == false) {
            return false;
        }
        GrokClassifier rhs = ((GrokClassifier) other);
        return new EqualsBuilder().append(name, rhs.name).append(grokPattern, rhs.grokPattern).append(customPatterns, rhs.customPatterns).append(classification, rhs.classification).isEquals();
    }

}
