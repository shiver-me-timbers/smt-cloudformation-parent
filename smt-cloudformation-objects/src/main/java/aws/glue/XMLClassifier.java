
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * XMLClassifier
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RowTag",
    "Classification",
    "Name"
})
public class XMLClassifier {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag
     * 
     */
    @JsonProperty("RowTag")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag")
    private CharSequence rowTag;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification
     * 
     */
    @JsonProperty("Classification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification")
    private CharSequence classification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag
     * 
     */
    public CharSequence getRowTag() {
        return rowTag;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag
     * 
     */
    public void setRowTag(CharSequence rowTag) {
        this.rowTag = rowTag;
    }

    public XMLClassifier withRowTag(CharSequence rowTag) {
        this.rowTag = rowTag;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification
     * 
     */
    public CharSequence getClassification() {
        return classification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification
     * 
     */
    public void setClassification(CharSequence classification) {
        this.classification = classification;
    }

    public XMLClassifier withClassification(CharSequence classification) {
        this.classification = classification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public XMLClassifier withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rowTag", rowTag).append("classification", classification).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(rowTag).append(classification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XMLClassifier) == false) {
            return false;
        }
        XMLClassifier rhs = ((XMLClassifier) other);
        return new EqualsBuilder().append(name, rhs.name).append(rowTag, rhs.rowTag).append(classification, rhs.classification).isEquals();
    }

}
